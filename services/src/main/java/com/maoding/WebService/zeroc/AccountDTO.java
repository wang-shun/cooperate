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

public class AccountDTO implements java.lang.Cloneable,
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

    public String userName;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String nickName;

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public String password;

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String cellphone;

    public String getCellphone()
    {
        return cellphone;
    }

    public void setCellphone(String cellphone)
    {
        this.cellphone = cellphone;
    }

    public String code;

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String email;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String defaultCompanyId;

    public String getDefaultCompanyId()
    {
        return defaultCompanyId;
    }

    public void setDefaultCompanyId(String defaultCompanyId)
    {
        this.defaultCompanyId = defaultCompanyId;
    }

    public String birthday;

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public String sex;

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String status;

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String major;

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public AccountDTO()
    {
        this.id = "";
        this.userName = "";
        this.nickName = "";
        this.password = "";
        this.cellphone = "";
        this.code = "";
        this.email = "";
        this.defaultCompanyId = "";
        this.birthday = "";
        this.sex = "";
        this.status = "";
        this.major = "";
    }

    public AccountDTO(String id, String userName, String nickName, String password, String cellphone, String code, String email, String defaultCompanyId, String birthday, String sex, String status, String major)
    {
        this.id = id;
        this.userName = userName;
        this.nickName = nickName;
        this.password = password;
        this.cellphone = cellphone;
        this.code = code;
        this.email = email;
        this.defaultCompanyId = defaultCompanyId;
        this.birthday = birthday;
        this.sex = sex;
        this.status = status;
        this.major = major;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        AccountDTO r = null;
        if(rhs instanceof AccountDTO)
        {
            r = (AccountDTO)rhs;
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
            if(this.userName != r.userName)
            {
                if(this.userName == null || r.userName == null || !this.userName.equals(r.userName))
                {
                    return false;
                }
            }
            if(this.nickName != r.nickName)
            {
                if(this.nickName == null || r.nickName == null || !this.nickName.equals(r.nickName))
                {
                    return false;
                }
            }
            if(this.password != r.password)
            {
                if(this.password == null || r.password == null || !this.password.equals(r.password))
                {
                    return false;
                }
            }
            if(this.cellphone != r.cellphone)
            {
                if(this.cellphone == null || r.cellphone == null || !this.cellphone.equals(r.cellphone))
                {
                    return false;
                }
            }
            if(this.code != r.code)
            {
                if(this.code == null || r.code == null || !this.code.equals(r.code))
                {
                    return false;
                }
            }
            if(this.email != r.email)
            {
                if(this.email == null || r.email == null || !this.email.equals(r.email))
                {
                    return false;
                }
            }
            if(this.defaultCompanyId != r.defaultCompanyId)
            {
                if(this.defaultCompanyId == null || r.defaultCompanyId == null || !this.defaultCompanyId.equals(r.defaultCompanyId))
                {
                    return false;
                }
            }
            if(this.birthday != r.birthday)
            {
                if(this.birthday == null || r.birthday == null || !this.birthday.equals(r.birthday))
                {
                    return false;
                }
            }
            if(this.sex != r.sex)
            {
                if(this.sex == null || r.sex == null || !this.sex.equals(r.sex))
                {
                    return false;
                }
            }
            if(this.status != r.status)
            {
                if(this.status == null || r.status == null || !this.status.equals(r.status))
                {
                    return false;
                }
            }
            if(this.major != r.major)
            {
                if(this.major == null || r.major == null || !this.major.equals(r.major))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::AccountDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, id);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, userName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, nickName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, password);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, cellphone);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, code);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, email);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, defaultCompanyId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, birthday);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, sex);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, status);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, major);
        return h_;
    }

    public AccountDTO clone()
    {
        AccountDTO c = null;
        try
        {
            c = (AccountDTO)super.clone();
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
        ostr.writeString(this.userName);
        ostr.writeString(this.nickName);
        ostr.writeString(this.password);
        ostr.writeString(this.cellphone);
        ostr.writeString(this.code);
        ostr.writeString(this.email);
        ostr.writeString(this.defaultCompanyId);
        ostr.writeString(this.birthday);
        ostr.writeString(this.sex);
        ostr.writeString(this.status);
        ostr.writeString(this.major);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.id = istr.readString();
        this.userName = istr.readString();
        this.nickName = istr.readString();
        this.password = istr.readString();
        this.cellphone = istr.readString();
        this.code = istr.readString();
        this.email = istr.readString();
        this.defaultCompanyId = istr.readString();
        this.birthday = istr.readString();
        this.sex = istr.readString();
        this.status = istr.readString();
        this.major = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, AccountDTO v)
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

    static public AccountDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        AccountDTO v = new AccountDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<AccountDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, AccountDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<AccountDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(AccountDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final AccountDTO _nullMarshalValue = new AccountDTO();

    public static final long serialVersionUID = -987873574L;
}
