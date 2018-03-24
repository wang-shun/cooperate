package com.maoding.Storage.Entity;

import com.maoding.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/11/16 22:12
 * 描    述 :
 */
@Table(name = "maoding_storage_file")
public class StorageFileEntity extends BaseEntity {
    /** 文件服务器类型 */
    @Column
    private String serverTypeId;
    /** 文件服务器地址 */
    @Column
    private String serverAddress;
    /** 文件类型 */
    @Column
    private String fileTypeId;
    /** 文件版本 */
    @Column
    private String fileVersion;
    /** 文件校验和 */
    @Column
    private String fileChecksum;
    /** 文件所属专业id */
    @Column
    private String majorTypeId;

    /** 所对应的原始文件id */
    @Column
    private String mainFileId;

    /** 只读文件在文件服务器上的存储名称 */
    @Column
    private String readOnlyKey;

    @Column
    private String writableKey;

    /** 文件在文件服务器上的存储位置 */
    @Column
    private String baseDir;

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getMajorTypeId() {
        return majorTypeId;
    }

    public void setMajorTypeId(String majorTypeId) {
        this.majorTypeId = majorTypeId;
    }

    public String getReadOnlyKey() {
        return readOnlyKey;
    }

    public void setReadOnlyKey(String readOnlyKey) {
        this.readOnlyKey = readOnlyKey;
    }

    public String getWritableKey() {
        return writableKey;
    }

    public void setWritableKey(String writableKey) {
        this.writableKey = writableKey;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getFileChecksum() {
        return fileChecksum;
    }

    public void setFileChecksum(String fileChecksum) {
        this.fileChecksum = fileChecksum;
    }

    public String getMainFileId() {
        return mainFileId;
    }

    public void setMainFileId(String mainFileId) {
        this.mainFileId = mainFileId;
    }

    public String getServerTypeId() {
        return serverTypeId;
    }

    public void setServerTypeId(String serverTypeId) {
        this.serverTypeId = serverTypeId;
    }

    public String getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(String fileTypeId) {
        this.fileTypeId = fileTypeId;
    }
}
