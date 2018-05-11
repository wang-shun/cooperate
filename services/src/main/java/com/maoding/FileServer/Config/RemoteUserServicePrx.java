package com.maoding.FileServer.Config;

import com.maoding.Base.CoreRemoteService;
import com.maoding.User.zeroc.*;
import com.maoding.CoreUtils.SpringUtils;

import java.util.List;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2018/1/8 11:54
 * 描    述 :
 */
public class RemoteUserServicePrx extends CoreRemoteService<UserServicePrx> implements UserServicePrx {

    private static UserServicePrx lastPrx = null;
    private static UserService userService = null;

    private UserService getUserService(){
        if (userService == null) {
            userService = SpringUtils.getBean(UserService.class);
        }
        return userService;
    }

    /** 同步方式获取业务接口代理对象 */
    public static UserServicePrx getInstance(String adapterName) {
        if (lastPrx == null){
            RemoteUserServicePrx prx = new RemoteUserServicePrx();
            lastPrx = prx.getServicePrx("UserService",adapterName,UserServicePrx.class,_UserServicePrxI.class,prx);
        }
        return lastPrx;
    }
    public static UserServicePrx getInstance(){
        return getInstance(null);
    }

    @Override
    public void setWebRoleStatus(WebRoleDTO webRole, String statusId) {
        getUserService().setWebRoleStatus(webRole,statusId,null);
    }

    @Override
    public List<WebRoleDTO> listWebRole(QueryWebRoleDTO query) {
        return getUserService().listWebRole(query,null);
    }

    @Override
    public AccountDTO getCurrent() {
        AccountDTO account = new AccountDTO();
        account.setId("07649b3d23094f28bfce78930bf4d4ac");
        account.setName("卢沂");
        return account;
    }

    @Override
    public boolean login(LoginDTO loginInfo) {
        return true;
    }

    @Override
    public List<ProjectRoleDTO> listProjectRoleByProjectId(String projectId) {
        return getUserService().listProjectRoleByProjectId(projectId,null);
    }
}
