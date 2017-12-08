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
// Generated from file `WebService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.WebService.zeroc;

public class QueryProjectTaskDTO implements java.lang.Cloneable,
                                            java.io.Serializable
{
    public int pageIndex;

    public int getPageIndex()
    {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex)
    {
        this.pageIndex = pageIndex;
    }

    public int pageSize;

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
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

    public String projectId;

    public String getProjectId()
    {
        return projectId;
    }

    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }

    public String currentCompanyUserId;

    public String getCurrentCompanyUserId()
    {
        return currentCompanyUserId;
    }

    public void setCurrentCompanyUserId(String currentCompanyUserId)
    {
        this.currentCompanyUserId = currentCompanyUserId;
    }

    public int isCreator;

    public int getIsCreator()
    {
        return isCreator;
    }

    public void setIsCreator(int isCreator)
    {
        this.isCreator = isCreator;
    }

    public QueryProjectTaskDTO()
    {
        this.companyId = "";
        this.projectId = "";
        this.currentCompanyUserId = "";
    }

    public QueryProjectTaskDTO(int pageIndex, int pageSize, String companyId, String projectId, String currentCompanyUserId, int isCreator)
    {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.companyId = companyId;
        this.projectId = projectId;
        this.currentCompanyUserId = currentCompanyUserId;
        this.isCreator = isCreator;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QueryProjectTaskDTO r = null;
        if(rhs instanceof QueryProjectTaskDTO)
        {
            r = (QueryProjectTaskDTO)rhs;
        }

        if(r != null)
        {
            if(this.pageIndex != r.pageIndex)
            {
                return false;
            }
            if(this.pageSize != r.pageSize)
            {
                return false;
            }
            if(this.companyId != r.companyId)
            {
                if(this.companyId == null || r.companyId == null || !this.companyId.equals(r.companyId))
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
            if(this.currentCompanyUserId != r.currentCompanyUserId)
            {
                if(this.currentCompanyUserId == null || r.currentCompanyUserId == null || !this.currentCompanyUserId.equals(r.currentCompanyUserId))
                {
                    return false;
                }
            }
            if(this.isCreator != r.isCreator)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::QueryProjectTaskDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pageIndex);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pageSize);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, companyId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, projectId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, currentCompanyUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isCreator);
        return h_;
    }

    public QueryProjectTaskDTO clone()
    {
        QueryProjectTaskDTO c = null;
        try
        {
            c = (QueryProjectTaskDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeInt(this.pageIndex);
        ostr.writeInt(this.pageSize);
        ostr.writeString(this.companyId);
        ostr.writeString(this.projectId);
        ostr.writeString(this.currentCompanyUserId);
        ostr.writeInt(this.isCreator);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.pageIndex = istr.readInt();
        this.pageSize = istr.readInt();
        this.companyId = istr.readString();
        this.projectId = istr.readString();
        this.currentCompanyUserId = istr.readString();
        this.isCreator = istr.readInt();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, QueryProjectTaskDTO v)
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

    static public QueryProjectTaskDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        QueryProjectTaskDTO v = new QueryProjectTaskDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<QueryProjectTaskDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, QueryProjectTaskDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<QueryProjectTaskDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(QueryProjectTaskDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final QueryProjectTaskDTO _nullMarshalValue = new QueryProjectTaskDTO();

    public static final long serialVersionUID = 2120677050L;
}
