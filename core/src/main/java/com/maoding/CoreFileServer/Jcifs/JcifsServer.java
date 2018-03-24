package com.maoding.CoreFileServer.Jcifs;

import com.maoding.CoreFileServer.BasicCallbackDTO;
import com.maoding.CoreFileServer.BasicFileRequestDTO;
import com.maoding.CoreFileServer.CoreFileDTO;
import com.maoding.CoreFileServer.CoreFileServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/10/30 19:09
 * 描    述 :
 */
@Service("jcifsServer")
@SuppressWarnings("deprecation")
public class JcifsServer implements CoreFileServer {
    /** 日志对象 */
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取通过http方式上传文件数据库时的需要设置的部分参数
     *
     * @param src
     * @param callbackSetting
     */
    @Override
    public BasicFileRequestDTO getUploadRequest(CoreFileDTO src, Integer mode, BasicCallbackDTO callbackSetting) {
        BasicFileRequestDTO result = new BasicFileRequestDTO();
        result.setUrl("http://localhost:8087/FileServer/upload");
        Map<String,String> params = new HashMap<>();
        if ((params != null) && (params.size() > 0)){
            result.getParams().putAll(params);
        }
        return result;

    }

    /**
     * 获取通过http方式下载文件数据库时的需要设置的部分参数
     *
     * @param src
     * @param callbackSetting
     */
    @Override
    public BasicFileRequestDTO getDownloadRequest(CoreFileDTO src, Integer mode, BasicCallbackDTO callbackSetting) {
        return null;
    }

    /**
     * 判断在文件服务器上是否存在指定文件
     *
     * @param src
     */
    @Override
    public Boolean coreIsExist(CoreFileDTO src) {
        return null;
    }

    /**
     * 获取文件服务器上某一空间上的所有文件
     *
     * @param scope
     */
    @Override
    public List listFile(String scope) {
        return null;
    }

    /**
     * 获取文件服务器上的所有空间
     */
    @Override
    public List<String> listScope() {
        return null;
    }

    /**
     * 在文件服务器上删除指定文件
     *
     * @param src
     */
    @Override
    public void coreDeleteFile(CoreFileDTO src) {

    }
}
