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
// Generated from file `UserData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.User.zeroc;

public class QueryMemberDTO implements java.lang.Cloneable,
                                       java.io.Serializable
{
    public String userTypeIdString;

    public String getUserTypeIdString()
    {
        return userTypeIdString;
    }

    public void setUserTypeIdString(String userTypeIdString)
    {
        this.userTypeIdString = userTypeIdString;
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

    public QueryMemberDTO()
    {
        this.userTypeIdString = "";
        this.projectId = "";
        this.taskId = "";
        this.companyId = "";
    }

    public QueryMemberDTO(String userTypeIdString, String projectId, String taskId, String companyId)
    {
        this.userTypeIdString = userTypeIdString;
        this.projectId = projectId;
        this.taskId = taskId;
        this.companyId = companyId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QueryMemberDTO r = null;
        if(rhs instanceof QueryMemberDTO)
        {
            r = (QueryMemberDTO)rhs;
        }

        if(r != null)
        {
            if(this.userTypeIdString != r.userTypeIdString)
            {
                if(this.userTypeIdString == null || r.userTypeIdString == null || !this.userTypeIdString.equals(r.userTypeIdString))
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

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::QueryMemberDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, userTypeIdString);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, projectId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, taskId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, companyId);
        return h_;
    }

    public QueryMemberDTO clone()
    {
        QueryMemberDTO c = null;
        try
        {
            c = (QueryMemberDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.userTypeIdString);
        ostr.writeString(this.projectId);
        ostr.writeString(this.taskId);
        ostr.writeString(this.companyId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.userTypeIdString = istr.readString();
        this.projectId = istr.readString();
        this.taskId = istr.readString();
        this.companyId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, QueryMemberDTO v)
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

    static public QueryMemberDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        QueryMemberDTO v = new QueryMemberDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<QueryMemberDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, QueryMemberDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<QueryMemberDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(QueryMemberDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final QueryMemberDTO _nullMarshalValue = new QueryMemberDTO();

    public static final long serialVersionUID = -1848728692L;
}
