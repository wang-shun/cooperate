// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `StorageData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.Storage.zeroc;

public class QueryNodeDTO implements java.lang.Cloneable,
                                     java.io.Serializable
{
    public String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String pid;

    public String getPid()
    {
        return pid;
    }

    public void setPid(String pid)
    {
        this.pid = pid;
    }

    public String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String path;

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String typeId;

    public String getTypeId()
    {
        return typeId;
    }

    public void setTypeId(String typeId)
    {
        this.typeId = typeId;
    }

    public String projectId;

    public String getProjectId()
    {
        return projectId;
    }

    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }

    public String classicId;

    public String getClassicId()
    {
        return classicId;
    }

    public void setClassicId(String classicId)
    {
        this.classicId = classicId;
    }

    public String issueId;

    public String getIssueId()
    {
        return issueId;
    }

    public void setIssueId(String issueId)
    {
        this.issueId = issueId;
    }

    public String taskId;

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public String companyId;

    public String getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(String companyId)
    {
        this.companyId = companyId;
    }

    public String ownerUserId;

    public String getOwnerUserId()
    {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId)
    {
        this.ownerUserId = ownerUserId;
    }

    public String ownerRoleId;

    public String getOwnerRoleId()
    {
        return ownerRoleId;
    }

    public void setOwnerRoleId(String ownerRoleId)
    {
        this.ownerRoleId = ownerRoleId;
    }

    public String fuzzyPath;

    public String getFuzzyPath()
    {
        return fuzzyPath;
    }

    public void setFuzzyPath(String fuzzyPath)
    {
        this.fuzzyPath = fuzzyPath;
    }

    public String storagePath;

    public String getStoragePath()
    {
        return storagePath;
    }

    public void setStoragePath(String storagePath)
    {
        this.storagePath = storagePath;
    }

    public String parentPath;

    public String getParentPath()
    {
        return parentPath;
    }

    public void setParentPath(String parentPath)
    {
        this.parentPath = parentPath;
    }

    public String parentStoragePath;

    public String getParentStoragePath()
    {
        return parentStoragePath;
    }

    public void setParentStoragePath(String parentStoragePath)
    {
        this.parentStoragePath = parentStoragePath;
    }

    public String fuzzyStoragePath;

    public String getFuzzyStoragePath()
    {
        return fuzzyStoragePath;
    }

    public void setFuzzyStoragePath(String fuzzyStoragePath)
    {
        this.fuzzyStoragePath = fuzzyStoragePath;
    }

    public String userId;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public QueryNodeDTO()
    {
        this.id = "";
        this.pid = "";
        this.name = "";
        this.path = "";
        this.typeId = "";
        this.projectId = "";
        this.classicId = "";
        this.issueId = "";
        this.taskId = "";
        this.companyId = "";
        this.ownerUserId = "";
        this.ownerRoleId = "";
        this.fuzzyPath = "";
        this.storagePath = "";
        this.parentPath = "";
        this.parentStoragePath = "";
        this.fuzzyStoragePath = "";
        this.userId = "";
    }

    public QueryNodeDTO(String id, String pid, String name, String path, String typeId, String projectId, String classicId, String issueId, String taskId, String companyId, String ownerUserId, String ownerRoleId, String fuzzyPath, String storagePath, String parentPath, String parentStoragePath, String fuzzyStoragePath, String userId)
    {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.path = path;
        this.typeId = typeId;
        this.projectId = projectId;
        this.classicId = classicId;
        this.issueId = issueId;
        this.taskId = taskId;
        this.companyId = companyId;
        this.ownerUserId = ownerUserId;
        this.ownerRoleId = ownerRoleId;
        this.fuzzyPath = fuzzyPath;
        this.storagePath = storagePath;
        this.parentPath = parentPath;
        this.parentStoragePath = parentStoragePath;
        this.fuzzyStoragePath = fuzzyStoragePath;
        this.userId = userId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QueryNodeDTO r = null;
        if(rhs instanceof QueryNodeDTO)
        {
            r = (QueryNodeDTO)rhs;
        }

        if(r != null)
        {
            if(this.id != r.id)
            {
                if(this.id == null || r.id == null || !this.id.equals(r.id))
                {
                    return false;
                }
            }
            if(this.pid != r.pid)
            {
                if(this.pid == null || r.pid == null || !this.pid.equals(r.pid))
                {
                    return false;
                }
            }
            if(this.name != r.name)
            {
                if(this.name == null || r.name == null || !this.name.equals(r.name))
                {
                    return false;
                }
            }
            if(this.path != r.path)
            {
                if(this.path == null || r.path == null || !this.path.equals(r.path))
                {
                    return false;
                }
            }
            if(this.typeId != r.typeId)
            {
                if(this.typeId == null || r.typeId == null || !this.typeId.equals(r.typeId))
                {
                    return false;
                }
            }
            if(this.projectId != r.projectId)
            {
                if(this.projectId == null || r.projectId == null || !this.projectId.equals(r.projectId))
                {
                    return false;
                }
            }
            if(this.classicId != r.classicId)
            {
                if(this.classicId == null || r.classicId == null || !this.classicId.equals(r.classicId))
                {
                    return false;
                }
            }
            if(this.issueId != r.issueId)
            {
                if(this.issueId == null || r.issueId == null || !this.issueId.equals(r.issueId))
                {
                    return false;
                }
            }
            if(this.taskId != r.taskId)
            {
                if(this.taskId == null || r.taskId == null || !this.taskId.equals(r.taskId))
                {
                    return false;
                }
            }
            if(this.companyId != r.companyId)
            {
                if(this.companyId == null || r.companyId == null || !this.companyId.equals(r.companyId))
                {
                    return false;
                }
            }
            if(this.ownerUserId != r.ownerUserId)
            {
                if(this.ownerUserId == null || r.ownerUserId == null || !this.ownerUserId.equals(r.ownerUserId))
                {
                    return false;
                }
            }
            if(this.ownerRoleId != r.ownerRoleId)
            {
                if(this.ownerRoleId == null || r.ownerRoleId == null || !this.ownerRoleId.equals(r.ownerRoleId))
                {
                    return false;
                }
            }
            if(this.fuzzyPath != r.fuzzyPath)
            {
                if(this.fuzzyPath == null || r.fuzzyPath == null || !this.fuzzyPath.equals(r.fuzzyPath))
                {
                    return false;
                }
            }
            if(this.storagePath != r.storagePath)
            {
                if(this.storagePath == null || r.storagePath == null || !this.storagePath.equals(r.storagePath))
                {
                    return false;
                }
            }
            if(this.parentPath != r.parentPath)
            {
                if(this.parentPath == null || r.parentPath == null || !this.parentPath.equals(r.parentPath))
                {
                    return false;
                }
            }
            if(this.parentStoragePath != r.parentStoragePath)
            {
                if(this.parentStoragePath == null || r.parentStoragePath == null || !this.parentStoragePath.equals(r.parentStoragePath))
                {
                    return false;
                }
            }
            if(this.fuzzyStoragePath != r.fuzzyStoragePath)
            {
                if(this.fuzzyStoragePath == null || r.fuzzyStoragePath == null || !this.fuzzyStoragePath.equals(r.fuzzyStoragePath))
                {
                    return false;
                }
            }
            if(this.userId != r.userId)
            {
                if(this.userId == null || r.userId == null || !this.userId.equals(r.userId))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::QueryNodeDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, id);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pid);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, name);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, path);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, typeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, projectId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, classicId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, issueId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, taskId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, companyId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, ownerUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, ownerRoleId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fuzzyPath);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, storagePath);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, parentPath);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, parentStoragePath);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fuzzyStoragePath);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, userId);
        return h_;
    }

    public QueryNodeDTO clone()
    {
        QueryNodeDTO c = null;
        try
        {
            c = (QueryNodeDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.id);
        ostr.writeString(this.pid);
        ostr.writeString(this.name);
        ostr.writeString(this.path);
        ostr.writeString(this.typeId);
        ostr.writeString(this.projectId);
        ostr.writeString(this.classicId);
        ostr.writeString(this.issueId);
        ostr.writeString(this.taskId);
        ostr.writeString(this.companyId);
        ostr.writeString(this.ownerUserId);
        ostr.writeString(this.ownerRoleId);
        ostr.writeString(this.fuzzyPath);
        ostr.writeString(this.storagePath);
        ostr.writeString(this.parentPath);
        ostr.writeString(this.parentStoragePath);
        ostr.writeString(this.fuzzyStoragePath);
        ostr.writeString(this.userId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.id = istr.readString();
        this.pid = istr.readString();
        this.name = istr.readString();
        this.path = istr.readString();
        this.typeId = istr.readString();
        this.projectId = istr.readString();
        this.classicId = istr.readString();
        this.issueId = istr.readString();
        this.taskId = istr.readString();
        this.companyId = istr.readString();
        this.ownerUserId = istr.readString();
        this.ownerRoleId = istr.readString();
        this.fuzzyPath = istr.readString();
        this.storagePath = istr.readString();
        this.parentPath = istr.readString();
        this.parentStoragePath = istr.readString();
        this.fuzzyStoragePath = istr.readString();
        this.userId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, QueryNodeDTO v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public QueryNodeDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        QueryNodeDTO v = new QueryNodeDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<QueryNodeDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, QueryNodeDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<QueryNodeDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(QueryNodeDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final QueryNodeDTO _nullMarshalValue = new QueryNodeDTO();

    public static final long serialVersionUID = -140624942L;
}
