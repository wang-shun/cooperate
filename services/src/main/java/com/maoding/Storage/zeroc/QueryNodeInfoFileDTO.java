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

public class QueryNodeInfoFileDTO implements java.lang.Cloneable,
                                             java.io.Serializable
{
    public String mirrorServerTypeId;

    public String getMirrorServerTypeId()
    {
        return mirrorServerTypeId;
    }

    public void setMirrorServerTypeId(String mirrorServerTypeId)
    {
        this.mirrorServerTypeId = mirrorServerTypeId;
    }

    public String mirrorServerAddress;

    public String getMirrorServerAddress()
    {
        return mirrorServerAddress;
    }

    public void setMirrorServerAddress(String mirrorServerAddress)
    {
        this.mirrorServerAddress = mirrorServerAddress;
    }

    public String mirrorBaseDir;

    public String getMirrorBaseDir()
    {
        return mirrorBaseDir;
    }

    public void setMirrorBaseDir(String mirrorBaseDir)
    {
        this.mirrorBaseDir = mirrorBaseDir;
    }

    public QueryNodeInfoFileDTO()
    {
        this.mirrorServerTypeId = "";
        this.mirrorServerAddress = "";
        this.mirrorBaseDir = "";
    }

    public QueryNodeInfoFileDTO(String mirrorServerTypeId, String mirrorServerAddress, String mirrorBaseDir)
    {
        this.mirrorServerTypeId = mirrorServerTypeId;
        this.mirrorServerAddress = mirrorServerAddress;
        this.mirrorBaseDir = mirrorBaseDir;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QueryNodeInfoFileDTO r = null;
        if(rhs instanceof QueryNodeInfoFileDTO)
        {
            r = (QueryNodeInfoFileDTO)rhs;
        }

        if(r != null)
        {
            if(this.mirrorServerTypeId != r.mirrorServerTypeId)
            {
                if(this.mirrorServerTypeId == null || r.mirrorServerTypeId == null || !this.mirrorServerTypeId.equals(r.mirrorServerTypeId))
                {
                    return false;
                }
            }
            if(this.mirrorServerAddress != r.mirrorServerAddress)
            {
                if(this.mirrorServerAddress == null || r.mirrorServerAddress == null || !this.mirrorServerAddress.equals(r.mirrorServerAddress))
                {
                    return false;
                }
            }
            if(this.mirrorBaseDir != r.mirrorBaseDir)
            {
                if(this.mirrorBaseDir == null || r.mirrorBaseDir == null || !this.mirrorBaseDir.equals(r.mirrorBaseDir))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::QueryNodeInfoFileDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, mirrorServerTypeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, mirrorServerAddress);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, mirrorBaseDir);
        return h_;
    }

    public QueryNodeInfoFileDTO clone()
    {
        QueryNodeInfoFileDTO c = null;
        try
        {
            c = (QueryNodeInfoFileDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.mirrorServerTypeId);
        ostr.writeString(this.mirrorServerAddress);
        ostr.writeString(this.mirrorBaseDir);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.mirrorServerTypeId = istr.readString();
        this.mirrorServerAddress = istr.readString();
        this.mirrorBaseDir = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, QueryNodeInfoFileDTO v)
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

    static public QueryNodeInfoFileDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        QueryNodeInfoFileDTO v = new QueryNodeInfoFileDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<QueryNodeInfoFileDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, QueryNodeInfoFileDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<QueryNodeInfoFileDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(QueryNodeInfoFileDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final QueryNodeInfoFileDTO _nullMarshalValue = new QueryNodeInfoFileDTO();

    public static final long serialVersionUID = -1789876416L;
}
