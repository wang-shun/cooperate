package com.maoding.Storage;

import com.maoding.Base.BaseLocalService;
import com.maoding.Common.ConstService;
import com.maoding.Project.zeroc.ProjectService;
import com.maoding.Storage.Dao.StorageDao;
import com.maoding.Storage.Dao.StorageFileDao;
import com.maoding.Storage.Dao.StorageFileHisDao;
import com.maoding.Storage.Dto.StorageEntityUnionDTO;
import com.maoding.Storage.Entity.StorageEntity;
import com.maoding.Storage.Entity.StorageFileEntity;
import com.maoding.Storage.Entity.StorageFileHisEntity;
import com.maoding.Storage.zeroc.*;
import com.maoding.User.zeroc.AccountDTO;
import com.maoding.User.zeroc.UserService;
import com.maoding.Utils.BeanUtils;
import com.maoding.Utils.StringUtils;
import com.zeroc.Ice.Current;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/11/2 14:21
 * 描    述 :
 */
@Service("storageService")
@Transactional(rollbackFor = Exception.class)
public class StorageServiceImpl extends BaseLocalService<StorageServicePrx> implements StorageService,StorageServicePrx{

    @Autowired
    private StorageDao storageDao;

    @Autowired
    private StorageFileDao storageFileDao;

    @Autowired
    private StorageFileHisDao storageFileHisDao;

    @Autowired
    UserService userService;

    @Autowired
    ProjectService projectService;

    @Override
    public List<SimpleNodeDTO> listOldNode(@NotNull QueryNodeDTO query, Current current) {
        return storageDao.listOldNode(BeanUtils.cleanProperties(query));
    }

    @Override
    public SimpleNodeDTO createNodeWithParent(SimpleNodeDTO parent, @NotNull UpdateNodeDTO request, Current current) {
        long t = System.currentTimeMillis();
        //只在申请中包含的参数
        String fullName = StringUtils.formatPath(request.getFullName());
        String nodeName = StringUtils.getFileName(fullName);
        String lastModifyUserId = request.getOwnerUserId();

        //可使用父节点信息的参数
        String pid = StringUtils.left(request.getPid(), StringUtils.DEFAULT_ID_LENGTH);
        String taskId = request.getTaskId();
        Short pTypeId = ConstService.STORAGE_NODE_TYPE_DIR_DESIGN;
        String storagePath = fullName;
        StorageEntityUnionDTO parentUnion = null;
        if (parent != null){
            pTypeId = parent.getTypeId();
            pid = StringUtils.left(parent.getId(), StringUtils.DEFAULT_ID_LENGTH);
            taskId = parent.getTaskId();
            QueryNodeDTO unionQuery = new QueryNodeDTO();
            unionQuery.setId(pid);
            parentUnion = storageDao.quickSelectStorageEntityUnion(BeanUtils.cleanProperties(unionQuery));
            if (parentUnion != null) {
                pTypeId = parentUnion.getTypeId();
                taskId = parentUnion.getTaskId();
            }
        }

        String dirName = StringUtils.getDirName(fullName);
        if (!StringUtils.isEmpty(dirName)){
            parentUnion = insertPathNodeList(parentUnion,request,dirName,pid,taskId,lastModifyUserId,pTypeId);
            if (parentUnion != null) {
                pid = parentUnion.getId();
                taskId = parentUnion.getTaskId();
                pTypeId = parentUnion.getTypeId();
                storagePath = parentUnion.getPath() + StringUtils.SPLIT_PATH + nodeName;
            }
        }

        //格式化节点类型
        Short typeId = request.getTypeId();
        if ((ConstService.STORAGE_NODE_TYPE_UNKNOWN.equals(typeId)) || (ConstService.STORAGE_NODE_TYPE_DIR_UNKNOWN.equals(typeId))) {
            if (ConstService.STORAGE_NODE_TYPE_UNKNOWN.equals(typeId)) {
                typeId = ConstService.getFileType(pTypeId);
            } else {
                typeId = ConstService.getPathType(pTypeId);
            }
        }

        StorageEntityUnionDTO nodeUnion = BeanUtils.createCleanFrom(request,StorageEntityUnionDTO.class);
        nodeUnion.setNodeName(StringUtils.getFileName(fullName));
        nodeUnion.setPath(storagePath);
        if (typeId != null) nodeUnion.setTypeId(typeId);
        if (!StringUtils.isEmpty(taskId)) nodeUnion.setTaskId(taskId);
        if (StringUtils.isEmpty(pid)) pid = StringUtils.SPLIT_PATH;
        nodeUnion.setPid(pid);
        if(!StringUtils.isEmpty(lastModifyUserId)) nodeUnion.setLastModifyUserId(lastModifyUserId);
        if (!ConstService.isDirectoryType(typeId)){
            StorageFileEntity fileEntity = BeanUtils.createCleanFrom(nodeUnion,StorageFileEntity.class);
            BeanUtils.copyCleanProperties(request,fileEntity);
            nodeUnion.setFileEntity(fileEntity);
            if (ConstService.isHistoryType(typeId)){
                StorageFileHisEntity hisEntity = BeanUtils.createCleanFrom(nodeUnion,StorageFileHisEntity.class);
                BeanUtils.copyCleanProperties(request,hisEntity);
                hisEntity.setFileId(request.getMainFileId());
                nodeUnion.setHisEntity(hisEntity);
            }
        }
        insertStorageUnion(nodeUnion);

        String path = fullName;
        if (parent != null) path = StringUtils.formatPath(parent.getPath() + StringUtils.SPLIT_PATH + nodeUnion.getPath());
        log.info("===>createNodeWithParent:" + (System.currentTimeMillis()-t) + "ms");
        return convertToSimpleNodeDTO(nodeUnion,path);
    }

    private StorageEntityUnionDTO insertPathNodeList(StorageEntityUnionDTO parentUnion,
                                      @NotNull UpdateNodeDTO request,
                                      @NotNull String dirName,
                                      String pid,
                                      String taskId,
                                      String lastModifyUserId,
                                      Short pTypeId){
        List<StorageEntity> nodeList = new ArrayList<>();
        StringBuilder pathBuilder = new StringBuilder();
        String parentPath = "";
        if (parentUnion != null) {
            parentPath = parentUnion.getPath();
            pathBuilder.append(parentPath);
        }

        StorageEntityUnionDTO lastPathNode = null;
        String[] nodeNameArray = dirName.split(StringUtils.SPLIT_PATH);
        for (String nodeName : nodeNameArray) {
            if (StringUtils.isEmpty(nodeName)) continue;
            QueryNodeDTO query = new QueryNodeDTO();
            query.setPid(pid);
            query.setName(nodeName);
            lastPathNode = storageDao.quickSelectStorageEntityUnion(BeanUtils.cleanProperties(query));
            if (lastPathNode == null){
                lastPathNode = BeanUtils.createCleanFrom(request, StorageEntityUnionDTO.class);
                lastPathNode.setPid(pid);
                lastPathNode.setNodeName(nodeName);
                if (pathBuilder.length() > 0) pathBuilder.append(StringUtils.SPLIT_PATH);
                pathBuilder.append(nodeName);
                lastPathNode.setPath(pathBuilder.toString());
                lastPathNode.setTypeId(ConstService.getPathType(pTypeId));
                if (!StringUtils.isEmpty(lastModifyUserId)) lastPathNode.setLastModifyUserId(lastModifyUserId);
                lastPathNode.setFileLength(0L);
                if (!StringUtils.isEmpty(taskId)) lastPathNode.setTaskId(taskId);
                nodeList.add(lastPathNode);
            }
            pid = lastPathNode.getId();
        }
        if (!nodeList.isEmpty()) {
            int n = storageDao.insertList(nodeList);
            assert (n > 0);
        }

        return lastPathNode;
    }


    @Override
    public SimpleNodeDTO updateNodeWithParent(@NotNull SimpleNodeDTO src, SimpleNodeDTO parent, UpdateNodeDTO request, Current current) {
        long t = System.currentTimeMillis();
        //找目标节点
        QueryNodeDTO query = new QueryNodeDTO();
        query.setId(StringUtils.left(src.getId(),StringUtils.DEFAULT_ID_LENGTH));
        StorageEntityUnionDTO srcUnion = storageDao.quickSelectStorageEntityUnion(BeanUtils.cleanProperties(query));
        assert (srcUnion != null);


        String fullName = null;
        String lastModifyUserId = null;
        Long fileLength = 0L;
        String pid = null;
        String taskId = null;
        Short typeId = src.getTypeId();
        //申请变动属性
        if (request != null){
            lastModifyUserId = request.getOwnerUserId();
            fullName = StringUtils.formatPath(request.getFullName());
            fileLength = request.getFileLength();
            pid = StringUtils.left(request.getPid(), StringUtils.DEFAULT_ID_LENGTH);
            taskId = request.getTaskId();
            typeId = request.getTypeId();
        }
        if (!StringUtils.isEmpty(fullName)) {
            srcUnion.setNodeName(StringUtils.getFileName(fullName));
        }

        //父节点变动属性
        StorageEntityUnionDTO parentUnion = null;
        StringBuilder storagePathBuilder = new StringBuilder();
        if (!isSameParent(src,parent,request)){
            pid = StringUtils.left(parent.getId(), StringUtils.DEFAULT_ID_LENGTH);
            taskId = parent.getTaskId();
            QueryNodeDTO unionQuery = new QueryNodeDTO();
            unionQuery.setId(pid);
            parentUnion = storageDao.quickSelectStorageEntityUnion(BeanUtils.cleanProperties(unionQuery));
            Short pTypeId = parent.getTypeId();
            String dirName = StringUtils.getDirName(fullName);
            if (!StringUtils.isEmpty(dirName)){
                parentUnion = insertPathNodeList(parentUnion,request,dirName,pid,taskId,lastModifyUserId,pTypeId);
            }
            if (parentUnion != null) {
                pid = parentUnion.getId();
                storagePathBuilder.append(parentUnion.getPath());
                pTypeId = parentUnion.getTypeId();
            } else {
                pTypeId = parent.getTypeId();
                storagePathBuilder.append(parent.getStoragePath());
            }
            if (ConstService.isDirectoryType(src.getTypeId())) {
                typeId = ConstService.getPathType(pTypeId);
            } else {
                typeId = ConstService.getFileType(pTypeId);
            }
        } else {
            storagePathBuilder.append(StringUtils.getDirName(srcUnion.getPath()));
        }
        if (storagePathBuilder.length() > 0) storagePathBuilder.append(StringUtils.SPLIT_PATH);
        storagePathBuilder.append(srcUnion.getNodeName());
        srcUnion.setPath(StringUtils.formatPath(storagePathBuilder.toString()));

        if (!StringUtils.isEmpty(pid)) srcUnion.setPid(pid);
        if (!StringUtils.isEmpty(taskId)) srcUnion.setTaskId(taskId);
        if ((typeId != null) && !typeId.equals(src.getTypeId())) {
            srcUnion.setTypeId(typeId);
        }

        if (!StringUtils.isEmpty(lastModifyUserId)) srcUnion.setLastModifyUserId(lastModifyUserId);
        if (fileLength > 0) srcUnion.setFileLength(fileLength);

        //文件节点属性
        if (!ConstService.isDirectoryType(srcUnion.getTypeId()) && (srcUnion.getFileEntity() == null)) srcUnion.setFileEntity(new StorageFileEntity());
        if (srcUnion.getFileEntity() != null) {
            StorageFileEntity fileEntity = srcUnion.getFileEntity();
            if (request != null) {
                BeanUtils.copyCleanProperties(request, fileEntity);
            }
            fileEntity.update();
        }

        //文件历史节点属性
        if (ConstService.isHistoryType(srcUnion.getTypeId()) && (srcUnion.getHisEntity() == null)) srcUnion.setHisEntity(new StorageFileHisEntity());
        if (srcUnion.getHisEntity() != null) {
            StorageFileHisEntity hisEntity = srcUnion.getHisEntity();
            if (request != null) {
                BeanUtils.copyCleanProperties(request, hisEntity);
                if (!StringUtils.isEmpty(request.getMainFileId())) hisEntity.setFileId(request.getMainFileId());
            }
            if (StringUtils.isEmpty(hisEntity.getFileId())) hisEntity.setFileId(srcUnion.getId());
            hisEntity.update();
        }

        srcUnion.update();
        updateStorageUnion(srcUnion);

        String path = StringUtils.replace(src.getPath(),src.getStoragePath(), srcUnion.getPath());
        log.info("===>updateNodeWithParent:" + (System.currentTimeMillis()-t) + "ms");
        return convertToSimpleNodeDTO(srcUnion,path);
    }

    private boolean isSameParent(@NotNull SimpleNodeDTO src, SimpleNodeDTO parent, UpdateNodeDTO request){
        StringBuilder pathBuilder = new StringBuilder();
        if (parent != null){
            pathBuilder.append(parent.getPath());
        } else {
            pathBuilder.append(StringUtils.getDirName(src.getPath()));
        }
        if ((request != null) && (!StringUtils.isEmpty(request.getFullName()))){
            String dirName = StringUtils.getDirName(request.getFullName());
            if (StringUtils.isNotEmpty(dirName)) {
                if (pathBuilder.length() > 0) pathBuilder.append(StringUtils.SPLIT_PATH);
                pathBuilder.append(dirName);
            }
        }
        return StringUtils.isSame(StringUtils.getDirName(src.getPath()),StringUtils.formatPath(pathBuilder.toString()));
    }

    @Override
    @SuppressWarnings("deprecation")
    public SimpleNodeDTO createMirror(FileNodeDTO src, Current current) {
        return null;
    }

    @Override
    public boolean deleteNodeById(String id, Current current) {
        assert (!StringUtils.isEmpty(id));

        long t = System.currentTimeMillis();

        int n = 0;

        QueryNodeDTO query = new QueryNodeDTO();
        query.setId(StringUtils.left(id, StringUtils.DEFAULT_ID_LENGTH));
        StorageEntityUnionDTO nodeUnion = storageDao.selectStorageEntityUnion(BeanUtils.cleanProperties(query));
        if (nodeUnion != null) {
            List<String> idList = (!ConstService.isDirectoryType(nodeUnion.getTypeId()))
                    ? new ArrayList<>() : storageDao.listAllSubNodeIdByPath(nodeUnion.getPath());
            idList.add(nodeUnion.getId());
            n += storageDao.fakeDeleteById(idList);
            n += storageFileDao.fakeDeleteById(idList);
            n += storageFileHisDao.fakeDeleteById(idList);
        }

        log.info("===>deleteNodeById:" + (System.currentTimeMillis()-t) + "ms");
        return (n > 0);
    }

    @Override
    @SuppressWarnings("deprecation")
    public SimpleNodeDTO updateNode(SimpleNodeDTO src, UpdateNodeDTO request, Current current) {

        long t = System.currentTimeMillis();

        request = BeanUtils.cleanProperties(request);
        StorageEntityUnionDTO parentUnion = getParentUnion(src,request);
        Short typeId = request.getTypeId();
        if ((ConstService.STORAGE_NODE_TYPE_UNKNOWN.equals(typeId)) || (ConstService.STORAGE_NODE_TYPE_DIR_UNKNOWN.equals(typeId))) {
            Short parentTypeId = (parentUnion != null) ? parentUnion.getTypeId() : src.getTypeId();
            if (ConstService.STORAGE_NODE_TYPE_UNKNOWN.equals(typeId)) {
                typeId = ConstService.getFileType(parentTypeId);
            } else {
                typeId = ConstService.getPathType(parentTypeId);
            }
        }
        Long fileLength = (request.getFileLength() == 0) ?
                src.getFileLength() : request.getFileLength();
        String lastModifyUserId = (StringUtils.isEmpty(request.getOwnerUserId())) ?
                src.getOwnerUserId() : request.getOwnerUserId();
        String pid = StringUtils.left(src.getPid(),StringUtils.DEFAULT_ID_LENGTH);
        String taskId = src.getTaskId();
        if (parentUnion != null) {
            pid = parentUnion.getId();
            taskId = parentUnion.getTaskId();
        }
        String fullName = StringUtils.formatPath(request.getFullName());
        if (!StringUtils.isEmpty(fullName) && fullName.contains(StringUtils.SPLIT_PATH)) {
            //如果fullName包含路径则创建中间路径节点
            pid = insertPathNodeList(parentUnion,request,fullName,pid,taskId,lastModifyUserId);
        }
        String storagePath = fullName;
        if ((storagePath != null) && (parentUnion != null)){
            storagePath = parentUnion.getPath() + StringUtils.SPLIT_PATH + fullName;
        }

        QueryNodeDTO query = new QueryNodeDTO();
        query.setId(StringUtils.left(src.getId(),StringUtils.DEFAULT_ID_LENGTH));
        StorageEntityUnionDTO srcUnion = storageDao.quickSelectStorageEntityUnion(BeanUtils.cleanProperties(query));
        assert (srcUnion != null);

        srcUnion = updateStorageUnion(srcUnion,request,pid,taskId,storagePath,lastModifyUserId,fileLength,typeId);
        updateStorageUnion(srcUnion);

        String path = StringUtils.replace(src.getPath(),src.getStoragePath(), srcUnion.getPath());
        return convertToSimpleNodeDTO(srcUnion,path);
    }

    private void updateStorageUnion(@NotNull StorageEntityUnionDTO srcUnion){
        int n = 0;
        if (srcUnion.getHisEntity() != null) {
            StorageFileHisEntity hisEntity = srcUnion.getHisEntity();
            hisEntity.setFileId(StringUtils.left(hisEntity.getFileId(),StringUtils.DEFAULT_ID_LENGTH));
            n += storageFileHisDao.updateById(hisEntity);
            assert (n > 0);
        }
        if (srcUnion.getFileEntity() != null) {
            StorageFileEntity fileEntity = srcUnion.getFileEntity();
            fileEntity.setMainFileId(StringUtils.left(fileEntity.getMainFileId(),StringUtils.DEFAULT_ID_LENGTH));
            n += storageFileDao.updateById(fileEntity);
            assert (n > 0);
        }
        n += storageDao.updateById(srcUnion);
        assert (n > 0);
    }

    private void insertStorageUnion(@NotNull StorageEntityUnionDTO srcUnion){
        int n = 0;
        if (srcUnion.getHisEntity() != null) {
            StorageFileHisEntity hisEntity = srcUnion.getHisEntity();
            hisEntity.setFileId(StringUtils.left(hisEntity.getFileId(),StringUtils.DEFAULT_ID_LENGTH));
            n += storageFileHisDao.insert(hisEntity);
            assert (n > 0);
        }
        if (srcUnion.getFileEntity() != null) {
            StorageFileEntity fileEntity = srcUnion.getFileEntity();
            fileEntity.setMainFileId(StringUtils.left(fileEntity.getMainFileId(),StringUtils.DEFAULT_ID_LENGTH));
            n += storageFileDao.insert(fileEntity);
            assert (n > 0);
        }
        n += storageDao.insert(srcUnion);
        assert (n > 0);
    }

    @Deprecated
    private String insertPathNodeList(StorageEntityUnionDTO parentUnion,
                                    @NotNull UpdateNodeDTO request,
                                    @NotNull String fullName,
                                    String pid,
                                    String taskId,
                                    String lastModifyUserId){
        List<StorageEntity> nodeList = new ArrayList<>();
        StringBuilder pathBuilder = new StringBuilder();
        String parentPath = "";
        if (parentUnion != null) {
            parentPath = parentUnion.getPath();
            pathBuilder.append(parentPath);
        }
        String fullPath = StringUtils.getDirName(fullName);
        String[] nodeNameArray = fullPath.split(StringUtils.SPLIT_PATH);
        for (String nodeName : nodeNameArray) {
            if (StringUtils.isEmpty(nodeName)) continue;
            StorageEntity pathNode = BeanUtils.createCleanFrom(request, StorageEntity.class);
            pathNode.setPid(pid);
            pathNode.setNodeName(nodeName);
            if (pathBuilder.length() > 0) pathBuilder.append(StringUtils.SPLIT_PATH);
            pathBuilder.append(nodeName);
            pathNode.setPath(pathBuilder.toString());
            pathNode.setTypeId(ConstService.getPathType(request.getParentTypeId()));
            pathNode.setLastModifyUserId(lastModifyUserId);
            pathNode.setFileLength(0L);
            pathNode.setTaskId(taskId);
            nodeList.add(pathNode);
            pid = pathNode.getId();
        }
        if (!nodeList.isEmpty()) {
            int n = storageDao.insertList(nodeList);
            assert (n > 0);
        }
        return pid;
    }

    private StorageEntityUnionDTO updateStorageUnion(@NotNull StorageEntityUnionDTO srcUnion,
                                                     @NotNull UpdateNodeDTO request,
                                                     String pid,
                                                     String taskId,
                                                     String storagePath,
                                                     String lastModifyUserId,
                                                     Long fileLength,
                                                     Short typeId) {
        //修改节点属性
        BeanUtils.copyProperties(request, srcUnion);
        if (!StringUtils.isEmpty(storagePath)) {
            srcUnion.setNodeName(StringUtils.getFileName(storagePath));
            srcUnion.setPath(StringUtils.formatPath(storagePath));
        }
        srcUnion.setTaskId(taskId);
        srcUnion.setPid(pid);
        srcUnion.setLastModifyUserId(lastModifyUserId);
        srcUnion.setFileLength(fileLength);
        srcUnion.setTypeId(typeId);

        if (srcUnion.getHisEntity() != null) {
            StorageFileHisEntity hisEntity = srcUnion.getHisEntity();
            BeanUtils.copyProperties(request, hisEntity);
            hisEntity.setFileId(request.getMainFileId());
            if (StringUtils.isEmpty(hisEntity.getFileId())) hisEntity.setFileId(srcUnion.getId());
            hisEntity.update();
        }

        if (srcUnion.getFileEntity() != null) {
            StorageFileEntity fileEntity = srcUnion.getFileEntity();
            BeanUtils.copyProperties(request, fileEntity);
            fileEntity.update();
        }
        srcUnion.update();
        return srcUnion;
    }

    private StorageEntityUnionDTO getParentUnion(SimpleNodeDTO src, UpdateNodeDTO request){
        StorageEntityUnionDTO nodeUnion = null;
        String parentPath = StringUtils.formatPath(request.getParentPath());
        String fullName = StringUtils.formatPath(request.getFullName());
        if (!StringUtils.isEmpty(fullName) || !StringUtils.isEmpty(parentPath)) {
            String pid = request.getPid();
            String taskId = request.getTaskId();
            Short parentTypeId = request.getParentTypeId();
            //重新组合父目录和相对目录
            if (StringUtils.isEmpty(fullName)) {
                if (src != null) fullName = src.getName();
            }
            String path = fullName;
            if (!StringUtils.isSame(StringUtils.left(fullName, 1), StringUtils.SPLIT_PATH)) {
                if (StringUtils.isEmpty(parentPath)) {
                    if (src != null) parentPath = StringUtils.getDirName(src.getPath());
                }
                path = parentPath;
                if (!StringUtils.isEmpty(path)) path += StringUtils.SPLIT_PATH;
                path += fullName;
            } else {
                parentPath = "";
            }
            String srcPath = null;
            if (src != null) srcPath = src.getPath();
            if (!StringUtils.isSame(path,srcPath) && StringUtils.contains(fullName, StringUtils.SPLIT_PATH)) {
                String fullPath = parentPath;
                if (!StringUtils.isEmpty(fullPath)) fullPath += StringUtils.SPLIT_PATH;
                fullPath += fullName;
                String parentFullPath = StringUtils.getDirName(fullPath);

                SimpleNodeDTO rootNode = getNodeByFuzzyPath(parentFullPath);

                if (rootNode != null) {
                    QueryNodeDTO unionQuery = new QueryNodeDTO();
                    unionQuery.setId(StringUtils.left(rootNode.getId(), StringUtils.DEFAULT_ID_LENGTH));
                    nodeUnion = storageDao.quickSelectStorageEntityUnion(BeanUtils.cleanProperties(unionQuery));
                    parentPath = rootNode.getPath();
                    fullName = StringUtils.substring(fullPath, StringUtils.length(rootNode.getPath() + StringUtils.SPLIT_PATH));
                    pid = rootNode.getId();
                    taskId = rootNode.getTaskId();
                    parentTypeId = rootNode.getTypeId();
                }
            } else {
                if (src != null) pid = src.getPid();
                if (!StringUtils.isEmpty(pid)){
                    SimpleNodeDTO parentNode = getNodeById(pid);
                    if (parentNode != null){
                        QueryNodeDTO unionQuery = new QueryNodeDTO();
                        unionQuery.setId(StringUtils.left(parentNode.getId(), StringUtils.DEFAULT_ID_LENGTH));
                        nodeUnion = storageDao.quickSelectStorageEntityUnion(BeanUtils.cleanProperties(unionQuery));
                        if (!StringUtils.isEmpty(parentPath)){
                            parentPath = parentNode.getPath();
                        }
                        if ((src != null) && !StringUtils.isEmpty(fullName)){
                            fullName = StringUtils.getFileName(fullName);
                        }
                        pid = parentNode.getId();
                        taskId = parentNode.getTaskId();
                        parentTypeId = parentNode.getTypeId();
                    }
                }
            }
            request.setParentPath(parentPath);
            request.setFullName(fullName);
            request.setPid(StringUtils.left(pid,StringUtils.DEFAULT_ID_LENGTH));
            request.setTaskId(taskId);
            request.setParentTypeId(parentTypeId);
        }
        return nodeUnion;
    }

    private SimpleNodeDTO getNodeByFuzzyPath(String fuzzyPath){
        SimpleNodeDTO node = null;
        QueryNodeDTO query = new QueryNodeDTO();
        query.setFuzzyPath(fuzzyPath);
        List<SimpleNodeDTO> parentNodeList = storageDao.listNode(BeanUtils.cleanProperties(query));
        if ((parentNodeList != null) && (!parentNodeList.isEmpty())) {
            node = parentNodeList.get(0);
        }
        return node;
    }

    private SimpleNodeDTO getNodeById(String id){
        SimpleNodeDTO node = null;
        QueryNodeDTO query = new QueryNodeDTO();
        query.setId(id);
        List<SimpleNodeDTO> parentNodeList = storageDao.listNode(BeanUtils.cleanProperties(query));
        if ((parentNodeList != null) && (!parentNodeList.isEmpty())) {
            node = parentNodeList.get(0);
        }
        return node;
    }


    /** 同步方式获取业务接口代理对象 */
    public static StorageServicePrx getInstance(String adapterName) {
        StorageServiceImpl prx = new StorageServiceImpl();
        return prx.getServicePrx("StorageService",adapterName, StorageServicePrx.class,_StorageServicePrxI.class);
    }
    public static StorageServicePrx getInstance(){
        return getInstance(null);
    }



    @Override
    public List<SimpleNodeDTO> listAllNode(String userId, Current current) {
        return storageDao.listAllNode(userId);
    }

    private SimpleNodeDTO getNodeInfo(QueryNodeDTO query){
        assert (query != null);
        SimpleNodeDTO node = null;
        if ((query.getId() == null) && (StringUtils.isRootPath(query.getPath()))){
            node = new SimpleNodeDTO();
            node.setName(StringUtils.SPLIT_PATH);
            node.setPath(StringUtils.SPLIT_PATH);
            node.setIsDirectory(true);
            node.setIsReadOnly(true);
        } else {
            node = storageDao.getNodeInfo(BeanUtils.cleanProperties(query));
        }
        return node;
    }

    @Override
    public List<SimpleNodeDTO> listNode(@NotNull QueryNodeDTO query, Current current) {
        query = BeanUtils.cleanProperties(query);
        if (StringUtils.isEmpty(query.getPid()) && StringUtils.isRootPath(query.getParentPath())){
            return storageDao.listRootNode(query.getOwnerUserId());
        } else {
            return storageDao.listNode(query);
        }
    }

    @Override
    public List<FileNodeDTO> listFileNodeInfo(@NotNull QueryNodeDTO query, boolean withHistory, Current current) {
        if (withHistory){
            return storageDao.listFileNodeWithHistory(query);
        } else {
            return storageDao.listFileNode(query);
        }
    }

    @Override
    public FileNodeDTO getFileNodeInfo(@NotNull SimpleNodeDTO node, boolean withHistory, Current current) {
        FileNodeDTO fileNode;
        if (withHistory) {
            fileNode = storageDao.getFileNodeExtraWithHistory(StringUtils.left(node.getId(), StringUtils.DEFAULT_ID_LENGTH));
        } else {
            fileNode = storageDao.getFileNodeExtra(StringUtils.left(node.getId(), StringUtils.DEFAULT_ID_LENGTH));
        }
        if (fileNode != null){
            fileNode.setBasic(node);
        }
        return fileNode;
    }

    @Override
    public FullNodeDTO getFullNodeInfo(@NotNull SimpleNodeDTO node, Current current) {
        FullNodeDTO fullNode = storageDao.getNodeExtra(node.getTaskId());
        if (fullNode != null){
            fullNode.setBasic(node);
        }
        return fullNode;
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean isDirectoryEmptyForAccount(AccountDTO account, String path, Current current) {
        long t = System.currentTimeMillis();

        Boolean isEmpty = false;

        path = StringUtils.formatPath(path);
        QueryNodeDTO query = new QueryNodeDTO();
        if (StringUtils.isRootPath(path)){
            if (account != null) query.setUserId(account.getId());
            isEmpty = (storageDao.hasRootChild(BeanUtils.cleanProperties(query)) == null);
        } else {
            query.setPath(path);
            isEmpty = (storageDao.hasChild(BeanUtils.cleanProperties(query)) == null);
        }

        log.info("===>isDirectoryEmptyForAccount:" + (System.currentTimeMillis()-t) + "ms");
        return isEmpty;
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean isDirectoryEmpty(String path, Current current) {
        return isDirectoryEmptyForAccount(userService.getCurrent(current),path,current);
    }


    private boolean isOwner(AccountDTO account, StorageEntity nodeEntity){
        assert (nodeEntity != null);
        return isOwner(account,nodeEntity.getLastModifyUserId());
    }

    private boolean isOwner(AccountDTO account, String ownerId){
        return (StringUtils.isEmpty(ownerId) ||
                ((account != null) && StringUtils.isSame(account.getId(),ownerId)));
    }


    private SimpleNodeDTO convertToSimpleNodeDTO(StorageEntity entity,String fullPath){
        if (entity == null) return null;
        SimpleNodeDTO node = BeanUtils.createCleanFrom(entity,SimpleNodeDTO.class);
        if (entity.getTypeId() != null) {
            node.setIsDirectory(ConstService.isDirectoryType(entity.getTypeId()));
            node.setIsProject(ConstService.isProjectType(entity.getTypeId()));
            node.setIsTask(ConstService.isTaskType(entity.getTypeId()));
            node.setIsDesign(ConstService.isDesignType(entity.getTypeId()));
            node.setIsCommit(ConstService.isCommitType(entity.getTypeId()));
            node.setIsHistory(ConstService.isHistoryType(entity.getTypeId()));
            Short rangeId = ConstService.getRangeId(entity.getTypeId());
            node.setClassicId(rangeId.toString());
            node.setClassicName(ConstService.getRangeName(rangeId));
        }
        node.setName(entity.getNodeName());
        node.setStoragePath(entity.getPath());
        node.setPath(fullPath);
        node.setId(node.getId() + node.getClassicId());
        node.setPid(node.getPid() + node.getClassicId());
        if (entity.getCreateTime() != null) {
            node.setCreateTimeStamp(entity.getCreateTime().getTime());
            node.setCreateTimeText(StringUtils.getTimeStamp(entity.getCreateTime(), StringUtils.NORMAL_STAMP_FORMAT));
        }
        if (entity.getLastModifyTime() != null) {
            node.setLastModifyTimeStamp(entity.getLastModifyTime().getTime());
            node.setLastModifyTimeText(StringUtils.getTimeStamp(entity.getLastModifyTime(), StringUtils.NORMAL_STAMP_FORMAT));
        }
        if (!StringUtils.isEmpty(entity.getLastModifyUserId())){
            node.setOwnerUserId(entity.getLastModifyUserId());
        }
        node.setFileLength(entity.getFileLength());
        return node;
    }


    private SimpleNodeDTO createNode(@NotNull UpdateNodeDTO request, boolean force, Current current){

        long t = System.currentTimeMillis();

        request = BeanUtils.cleanProperties(request);

        StorageEntityUnionDTO parentUnion = getParentUnion(null,request);
        Short typeId = request.getTypeId();
        if ((ConstService.STORAGE_NODE_TYPE_UNKNOWN.equals(typeId)) || (ConstService.STORAGE_NODE_TYPE_DIR_UNKNOWN.equals(typeId))) {
            Short parentTypeId = (parentUnion != null) ? parentUnion.getTypeId() : ConstService.STORAGE_NODE_TYPE_DIR_DESIGN;
            if (ConstService.STORAGE_NODE_TYPE_UNKNOWN.equals(typeId)) {
                typeId = ConstService.getFileType(parentTypeId);
            } else {
                typeId = ConstService.getPathType(parentTypeId);
            }
        }
        Long fileLength = request.getFileLength();
        String lastModifyUserId = request.getOwnerUserId();
        String pid = StringUtils.left(request.getPid(),StringUtils.DEFAULT_ID_LENGTH);
        String taskId = request.getTaskId();
        if (parentUnion != null) {
            pid = parentUnion.getId();
            taskId = parentUnion.getTaskId();
        }

        String fullName = StringUtils.formatPath(request.getFullName());
        if (!StringUtils.isEmpty(fullName) && fullName.contains(StringUtils.SPLIT_PATH)) {
            //如果fullName包含路径则创建中间路径节点
            pid = insertPathNodeList(parentUnion,request,fullName,pid,taskId,lastModifyUserId);
        }
        String storagePath = fullName;
        if ((storagePath != null) && (parentUnion != null)){
            storagePath = parentUnion.getPath() + StringUtils.SPLIT_PATH + fullName;
        }
        StorageEntityUnionDTO nodeUnion = BeanUtils.createCleanFrom(request,StorageEntityUnionDTO.class);
        if (!ConstService.isDirectoryType(typeId)){
            StorageFileEntity fileEntity = BeanUtils.createCleanFrom(nodeUnion,StorageFileEntity.class);
            nodeUnion.setFileEntity(fileEntity);
            if (ConstService.isHistoryType(typeId)){
                StorageFileHisEntity hisEntity = BeanUtils.createCleanFrom(nodeUnion,StorageFileHisEntity.class);
                nodeUnion.setHisEntity(hisEntity);
            }
        }
        nodeUnion = updateStorageUnion(nodeUnion,request,pid,taskId,storagePath,lastModifyUserId,fileLength,typeId);
        insertStorageUnion(nodeUnion);

        String path = StringUtils.formatPath(request.getParentPath() + StringUtils.SPLIT_PATH + nodeUnion.getPath());
        return convertToSimpleNodeDTO(nodeUnion,path);
    }

    @Override
    @SuppressWarnings("deprecation")
    public SimpleNodeDTO createNode(@NotNull UpdateNodeDTO request, Current current) {

        long t = System.currentTimeMillis();

        SimpleNodeDTO dto = createNode(request,false,current);

        log.info("===>createNode:" + (System.currentTimeMillis()-t) + "ms");
        return dto;
    }
}
