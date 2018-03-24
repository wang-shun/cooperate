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

public class SuggestionDTO implements java.lang.Cloneable,
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

    public String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long createTimeStamp;

    public long getCreateTimeStamp()
    {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(long createTimeStamp)
    {
        this.createTimeStamp = createTimeStamp;
    }

    public String createTimeText;

    public String getCreateTimeText()
    {
        return createTimeText;
    }

    public void setCreateTimeText(String createTimeText)
    {
        this.createTimeText = createTimeText;
    }

    public long lastModifyTimeStamp;

    public long getLastModifyTimeStamp()
    {
        return lastModifyTimeStamp;
    }

    public void setLastModifyTimeStamp(long lastModifyTimeStamp)
    {
        this.lastModifyTimeStamp = lastModifyTimeStamp;
    }

    public String lastModifyTimeText;

    public String getLastModifyTimeText()
    {
        return lastModifyTimeText;
    }

    public void setLastModifyTimeText(String lastModifyTimeText)
    {
        this.lastModifyTimeText = lastModifyTimeText;
    }

    public String lastModifyUserId;

    public String getLastModifyUserId()
    {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId)
    {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String lastModifyRoleId;

    public String getLastModifyRoleId()
    {
        return lastModifyRoleId;
    }

    public void setLastModifyRoleId(String lastModifyRoleId)
    {
        this.lastModifyRoleId = lastModifyRoleId;
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

    public String content;

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String mainFileId;

    public String getMainFileId()
    {
        return mainFileId;
    }

    public void setMainFileId(String mainFileId)
    {
        this.mainFileId = mainFileId;
    }

    public String statusTypeId;

    public String getStatusTypeId()
    {
        return statusTypeId;
    }

    public void setStatusTypeId(String statusTypeId)
    {
        this.statusTypeId = statusTypeId;
    }

    public String creatorUserId;

    public String getCreatorUserId()
    {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId)
    {
        this.creatorUserId = creatorUserId;
    }

    public java.util.List<AnnotateDTO> annotateList;

    public java.util.List<AnnotateDTO> getAnnotateList()
    {
        return annotateList;
    }

    public void setAnnotateList(java.util.List<AnnotateDTO> annotateList)
    {
        this.annotateList = annotateList;
    }

    public java.util.List<NodeFileDTO> accessoryList;

    public java.util.List<NodeFileDTO> getAccessoryList()
    {
        return accessoryList;
    }

    public void setAccessoryList(java.util.List<NodeFileDTO> accessoryList)
    {
        this.accessoryList = accessoryList;
    }

    public byte[] firstData;

    public byte[] getFirstData()
    {
        return firstData;
    }

    public void setFirstData(byte[] firstData)
    {
        this.firstData = firstData;
    }

    public byte getFirstData(int index)
    {
        return this.firstData[index];
    }

    public void setFirstData(int index, byte val)
    {
        this.firstData[index] = val;
    }

    public SuggestionDTO()
    {
        this.id = "";
        this.name = "";
        this.createTimeText = "";
        this.lastModifyTimeText = "";
        this.lastModifyUserId = "";
        this.lastModifyRoleId = "";
        this.typeId = "";
        this.content = "";
        this.mainFileId = "";
        this.statusTypeId = "";
        this.creatorUserId = "";
    }

    public SuggestionDTO(String id, String name, long createTimeStamp, String createTimeText, long lastModifyTimeStamp, String lastModifyTimeText, String lastModifyUserId, String lastModifyRoleId, String typeId, String content, String mainFileId, String statusTypeId, String creatorUserId, java.util.List<AnnotateDTO> annotateList, java.util.List<NodeFileDTO> accessoryList, byte[] firstData)
    {
        this.id = id;
        this.name = name;
        this.createTimeStamp = createTimeStamp;
        this.createTimeText = createTimeText;
        this.lastModifyTimeStamp = lastModifyTimeStamp;
        this.lastModifyTimeText = lastModifyTimeText;
        this.lastModifyUserId = lastModifyUserId;
        this.lastModifyRoleId = lastModifyRoleId;
        this.typeId = typeId;
        this.content = content;
        this.mainFileId = mainFileId;
        this.statusTypeId = statusTypeId;
        this.creatorUserId = creatorUserId;
        this.annotateList = annotateList;
        this.accessoryList = accessoryList;
        this.firstData = firstData;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        SuggestionDTO r = null;
        if(rhs instanceof SuggestionDTO)
        {
            r = (SuggestionDTO)rhs;
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
            if(this.name != r.name)
            {
                if(this.name == null || r.name == null || !this.name.equals(r.name))
                {
                    return false;
                }
            }
            if(this.createTimeStamp != r.createTimeStamp)
            {
                return false;
            }
            if(this.createTimeText != r.createTimeText)
            {
                if(this.createTimeText == null || r.createTimeText == null || !this.createTimeText.equals(r.createTimeText))
                {
                    return false;
                }
            }
            if(this.lastModifyTimeStamp != r.lastModifyTimeStamp)
            {
                return false;
            }
            if(this.lastModifyTimeText != r.lastModifyTimeText)
            {
                if(this.lastModifyTimeText == null || r.lastModifyTimeText == null || !this.lastModifyTimeText.equals(r.lastModifyTimeText))
                {
                    return false;
                }
            }
            if(this.lastModifyUserId != r.lastModifyUserId)
            {
                if(this.lastModifyUserId == null || r.lastModifyUserId == null || !this.lastModifyUserId.equals(r.lastModifyUserId))
                {
                    return false;
                }
            }
            if(this.lastModifyRoleId != r.lastModifyRoleId)
            {
                if(this.lastModifyRoleId == null || r.lastModifyRoleId == null || !this.lastModifyRoleId.equals(r.lastModifyRoleId))
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
            if(this.content != r.content)
            {
                if(this.content == null || r.content == null || !this.content.equals(r.content))
                {
                    return false;
                }
            }
            if(this.mainFileId != r.mainFileId)
            {
                if(this.mainFileId == null || r.mainFileId == null || !this.mainFileId.equals(r.mainFileId))
                {
                    return false;
                }
            }
            if(this.statusTypeId != r.statusTypeId)
            {
                if(this.statusTypeId == null || r.statusTypeId == null || !this.statusTypeId.equals(r.statusTypeId))
                {
                    return false;
                }
            }
            if(this.creatorUserId != r.creatorUserId)
            {
                if(this.creatorUserId == null || r.creatorUserId == null || !this.creatorUserId.equals(r.creatorUserId))
                {
                    return false;
                }
            }
            if(this.annotateList != r.annotateList)
            {
                if(this.annotateList == null || r.annotateList == null || !this.annotateList.equals(r.annotateList))
                {
                    return false;
                }
            }
            if(this.accessoryList != r.accessoryList)
            {
                if(this.accessoryList == null || r.accessoryList == null || !this.accessoryList.equals(r.accessoryList))
                {
                    return false;
                }
            }
            if(!java.util.Arrays.equals(this.firstData, r.firstData))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::SuggestionDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, id);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, name);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyRoleId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, typeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, content);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, mainFileId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, statusTypeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, creatorUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, annotateList);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, accessoryList);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, firstData);
        return h_;
    }

    public SuggestionDTO clone()
    {
        SuggestionDTO c = null;
        try
        {
            c = (SuggestionDTO)super.clone();
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
        ostr.writeString(this.name);
        ostr.writeLong(this.createTimeStamp);
        ostr.writeString(this.createTimeText);
        ostr.writeLong(this.lastModifyTimeStamp);
        ostr.writeString(this.lastModifyTimeText);
        ostr.writeString(this.lastModifyUserId);
        ostr.writeString(this.lastModifyRoleId);
        ostr.writeString(this.typeId);
        ostr.writeString(this.content);
        ostr.writeString(this.mainFileId);
        ostr.writeString(this.statusTypeId);
        ostr.writeString(this.creatorUserId);
        AnnotateListHelper.write(ostr, this.annotateList);
        NodeFileListHelper.write(ostr, this.accessoryList);
        ostr.writeByteSeq(this.firstData);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.id = istr.readString();
        this.name = istr.readString();
        this.createTimeStamp = istr.readLong();
        this.createTimeText = istr.readString();
        this.lastModifyTimeStamp = istr.readLong();
        this.lastModifyTimeText = istr.readString();
        this.lastModifyUserId = istr.readString();
        this.lastModifyRoleId = istr.readString();
        this.typeId = istr.readString();
        this.content = istr.readString();
        this.mainFileId = istr.readString();
        this.statusTypeId = istr.readString();
        this.creatorUserId = istr.readString();
        this.annotateList = AnnotateListHelper.read(istr);
        this.accessoryList = NodeFileListHelper.read(istr);
        this.firstData = istr.readByteSeq();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, SuggestionDTO v)
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

    static public SuggestionDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        SuggestionDTO v = new SuggestionDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<SuggestionDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, SuggestionDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<SuggestionDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(SuggestionDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final SuggestionDTO _nullMarshalValue = new SuggestionDTO();

    public static final long serialVersionUID = 41213515L;
}
