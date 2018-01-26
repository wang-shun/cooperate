package com.maoding.CoreFileServer;

import com.maoding.Utils.StringUtils;

import java.io.Serializable;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/10/25 9:53
 * 描    述 :
 */
public class CoreFileDTO implements Serializable {
    /** 服务器类型 */
    private Short serverType;
    /** 服务器地址 */
    private String serverAddress;
    /** 文件空间，即阿里云的buchet或FastFDS的group */
    private String scope;
    /** 文件标志，即阿里云的key或FastFDS的key */
    private String key;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Short getServerType() {
        return serverType;
    }

    public void setServerType(Short serverType) {
        this.serverType = serverType;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public CoreFileDTO(Short serverType, String serverAddress, String scope, String key){
        this.serverType = serverType;
        this.serverAddress = serverAddress;
        this.scope = scope;
        this.key = key;
    }
    public CoreFileDTO(String scope, String key){
        this(null,null,scope,key);
    }
    public CoreFileDTO(String path){
        this(StringUtils.getDirName(path),StringUtils.getFileName(path));
    }
    public CoreFileDTO(){
        this(null,null);
    }
}
