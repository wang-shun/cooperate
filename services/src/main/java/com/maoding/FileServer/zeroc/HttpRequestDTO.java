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
// Generated from file `FileServer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.FileServer.zeroc;

public class HttpRequestDTO implements java.lang.Cloneable,
                                       java.io.Serializable
{
    public String url;

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String header;

    public String getHeader()
    {
        return header;
    }

    public void setHeader(String header)
    {
        this.header = header;
    }

    public java.lang.Integer type;

    public java.lang.Integer getType()
    {
        return type;
    }

    public void setType(java.lang.Integer type)
    {
        this.type = type;
    }

    public HttpRequestDTO()
    {
        this.url = "";
        this.header = "";
    }

    public HttpRequestDTO(String url, String header, java.lang.Integer type)
    {
        this.url = url;
        this.header = header;
        this.type = type;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        HttpRequestDTO r = null;
        if(rhs instanceof HttpRequestDTO)
        {
            r = (HttpRequestDTO)rhs;
        }

        if(r != null)
        {
            if(this.url != r.url)
            {
                if(this.url == null || r.url == null || !this.url.equals(r.url))
                {
                    return false;
                }
            }
            if(this.header != r.header)
            {
                if(this.header == null || r.header == null || !this.header.equals(r.header))
                {
                    return false;
                }
            }
            if(this.type != r.type)
            {
                if(this.type == null || r.type == null || !this.type.equals(r.type))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::HttpRequestDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, url);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, header);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, type);
        return h_;
    }

    public HttpRequestDTO clone()
    {
        HttpRequestDTO c = null;
        try
        {
            c = (HttpRequestDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.url);
        ostr.writeString(this.header);
        ostr.writeSerializable(this.type);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.url = istr.readString();
        this.header = istr.readString();
        this.type = istr.readSerializable(java.lang.Integer.class);
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, HttpRequestDTO v)
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

    static public HttpRequestDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        HttpRequestDTO v = new HttpRequestDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<HttpRequestDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, HttpRequestDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<HttpRequestDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(HttpRequestDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final HttpRequestDTO _nullMarshalValue = new HttpRequestDTO();

    public static final long serialVersionUID = -1698148585L;
}
