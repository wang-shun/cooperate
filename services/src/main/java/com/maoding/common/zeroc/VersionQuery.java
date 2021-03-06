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
// Generated from file `CommonData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.common.zeroc;

public class VersionQuery implements java.lang.Cloneable,
                                     java.io.Serializable
{
    public String svnRepo;

    public String getSvnRepo()
    {
        return svnRepo;
    }

    public void setSvnRepo(String svnRepo)
    {
        this.svnRepo = svnRepo;
    }

    public String versionName;

    public String getVersionName()
    {
        return versionName;
    }

    public void setVersionName(String versionName)
    {
        this.versionName = versionName;
    }

    public String serviceSvnVersion;

    public String getServiceSvnVersion()
    {
        return serviceSvnVersion;
    }

    public void setServiceSvnVersion(String serviceSvnVersion)
    {
        this.serviceSvnVersion = serviceSvnVersion;
    }

    public String limitOffset;

    public String getLimitOffset()
    {
        return limitOffset;
    }

    public void setLimitOffset(String limitOffset)
    {
        this.limitOffset = limitOffset;
    }

    public String limitRows;

    public String getLimitRows()
    {
        return limitRows;
    }

    public void setLimitRows(String limitRows)
    {
        this.limitRows = limitRows;
    }

    public VersionQuery()
    {
        this.svnRepo = "";
        this.versionName = "";
        this.serviceSvnVersion = "";
        this.limitOffset = "";
        this.limitRows = "";
    }

    public VersionQuery(String svnRepo, String versionName, String serviceSvnVersion, String limitOffset, String limitRows)
    {
        this.svnRepo = svnRepo;
        this.versionName = versionName;
        this.serviceSvnVersion = serviceSvnVersion;
        this.limitOffset = limitOffset;
        this.limitRows = limitRows;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        VersionQuery r = null;
        if(rhs instanceof VersionQuery)
        {
            r = (VersionQuery)rhs;
        }

        if(r != null)
        {
            if(this.svnRepo != r.svnRepo)
            {
                if(this.svnRepo == null || r.svnRepo == null || !this.svnRepo.equals(r.svnRepo))
                {
                    return false;
                }
            }
            if(this.versionName != r.versionName)
            {
                if(this.versionName == null || r.versionName == null || !this.versionName.equals(r.versionName))
                {
                    return false;
                }
            }
            if(this.serviceSvnVersion != r.serviceSvnVersion)
            {
                if(this.serviceSvnVersion == null || r.serviceSvnVersion == null || !this.serviceSvnVersion.equals(r.serviceSvnVersion))
                {
                    return false;
                }
            }
            if(this.limitOffset != r.limitOffset)
            {
                if(this.limitOffset == null || r.limitOffset == null || !this.limitOffset.equals(r.limitOffset))
                {
                    return false;
                }
            }
            if(this.limitRows != r.limitRows)
            {
                if(this.limitRows == null || r.limitRows == null || !this.limitRows.equals(r.limitRows))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::VersionQuery");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, svnRepo);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, versionName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, serviceSvnVersion);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, limitOffset);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, limitRows);
        return h_;
    }

    public VersionQuery clone()
    {
        VersionQuery c = null;
        try
        {
            c = (VersionQuery)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.svnRepo);
        ostr.writeString(this.versionName);
        ostr.writeString(this.serviceSvnVersion);
        ostr.writeString(this.limitOffset);
        ostr.writeString(this.limitRows);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.svnRepo = istr.readString();
        this.versionName = istr.readString();
        this.serviceSvnVersion = istr.readString();
        this.limitOffset = istr.readString();
        this.limitRows = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, VersionQuery v)
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

    static public VersionQuery ice_read(com.zeroc.Ice.InputStream istr)
    {
        VersionQuery v = new VersionQuery();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<VersionQuery> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, VersionQuery v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<VersionQuery> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(VersionQuery.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final VersionQuery _nullMarshalValue = new VersionQuery();

    public static final long serialVersionUID = 1604875323L;
}
