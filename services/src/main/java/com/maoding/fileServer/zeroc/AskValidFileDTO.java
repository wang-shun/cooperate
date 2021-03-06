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
// Generated from file `FileServerData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.fileServer.zeroc;

public class AskValidFileDTO implements java.lang.Cloneable,
                                        java.io.Serializable
{
    public String serverTypeId;

    public String getServerTypeId()
    {
        return serverTypeId;
    }

    public void setServerTypeId(String serverTypeId)
    {
        this.serverTypeId = serverTypeId;
    }

    public String serverAddress;

    public String getServerAddress()
    {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress)
    {
        this.serverAddress = serverAddress;
    }

    public String baseDir;

    public String getBaseDir()
    {
        return baseDir;
    }

    public void setBaseDir(String baseDir)
    {
        this.baseDir = baseDir;
    }

    public String key;

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public AskValidFileDTO()
    {
        this.serverTypeId = "";
        this.serverAddress = "";
        this.baseDir = "";
        this.key = "";
    }

    public AskValidFileDTO(String serverTypeId, String serverAddress, String baseDir, String key)
    {
        this.serverTypeId = serverTypeId;
        this.serverAddress = serverAddress;
        this.baseDir = baseDir;
        this.key = key;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        AskValidFileDTO r = null;
        if(rhs instanceof AskValidFileDTO)
        {
            r = (AskValidFileDTO)rhs;
        }

        if(r != null)
        {
            if(this.serverTypeId != r.serverTypeId)
            {
                if(this.serverTypeId == null || r.serverTypeId == null || !this.serverTypeId.equals(r.serverTypeId))
                {
                    return false;
                }
            }
            if(this.serverAddress != r.serverAddress)
            {
                if(this.serverAddress == null || r.serverAddress == null || !this.serverAddress.equals(r.serverAddress))
                {
                    return false;
                }
            }
            if(this.baseDir != r.baseDir)
            {
                if(this.baseDir == null || r.baseDir == null || !this.baseDir.equals(r.baseDir))
                {
                    return false;
                }
            }
            if(this.key != r.key)
            {
                if(this.key == null || r.key == null || !this.key.equals(r.key))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::AskValidFileDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, serverTypeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, serverAddress);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, baseDir);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, key);
        return h_;
    }

    public AskValidFileDTO clone()
    {
        AskValidFileDTO c = null;
        try
        {
            c = (AskValidFileDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.serverTypeId);
        ostr.writeString(this.serverAddress);
        ostr.writeString(this.baseDir);
        ostr.writeString(this.key);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.serverTypeId = istr.readString();
        this.serverAddress = istr.readString();
        this.baseDir = istr.readString();
        this.key = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, AskValidFileDTO v)
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

    static public AskValidFileDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        AskValidFileDTO v = new AskValidFileDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<AskValidFileDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, AskValidFileDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<AskValidFileDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(AskValidFileDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final AskValidFileDTO _nullMarshalValue = new AskValidFileDTO();

    public static final long serialVersionUID = -1362646398L;
}
