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
// Generated from file `Storage.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.Storage.zeroc;

public interface StorageService extends com.zeroc.Ice.Object
{
    /**
     * @param current The Current object for the invocation.
     * @deprecated 尚未实现
     **/
    @Deprecated
    SimpleNodeDTO createMirror(FileNodeDTO src, com.zeroc.Ice.Current current)
        throws com.maoding.Common.zeroc.CustomException;

    SimpleNodeDTO createNodeWithParent(SimpleNodeDTO parent, UpdateNodeDTO request, com.zeroc.Ice.Current current)
        throws com.maoding.Common.zeroc.CustomException;

    SimpleNodeDTO updateNodeWithParent(SimpleNodeDTO src, SimpleNodeDTO parent, UpdateNodeDTO request, com.zeroc.Ice.Current current)
        throws com.maoding.Common.zeroc.CustomException;

    boolean deleteNodeById(String id, com.zeroc.Ice.Current current);

    java.util.List<SimpleNodeDTO> listAllNode(String userId, com.zeroc.Ice.Current current);

    java.util.List<SimpleNodeDTO> listNode(QueryNodeDTO query, com.zeroc.Ice.Current current);

    java.util.List<FileNodeDTO> listFileNodeInfo(QueryNodeDTO query, boolean withHistory, com.zeroc.Ice.Current current);

    FullNodeDTO getFullNodeInfo(SimpleNodeDTO node, com.zeroc.Ice.Current current);

    FileNodeDTO getFileNodeInfo(SimpleNodeDTO node, boolean withHistory, com.zeroc.Ice.Current current);

    /**
     * @param current The Current object for the invocation.
     **/
    @Deprecated
    boolean isDirectoryEmpty(String path, com.zeroc.Ice.Current current);

    /**
     * @param current The Current object for the invocation.
     **/
    @Deprecated
    boolean isDirectoryEmptyForAccount(com.maoding.User.zeroc.AccountDTO account, String path, com.zeroc.Ice.Current current);

    /**
     * @param current The Current object for the invocation.
     * @deprecated 由createNodeWithParent代替
     **/
    @Deprecated
    SimpleNodeDTO createNode(UpdateNodeDTO request, com.zeroc.Ice.Current current);

    /**
     * @param current The Current object for the invocation.
     * @deprecated 由updateNodeWithParent代替
     **/
    @Deprecated
    SimpleNodeDTO updateNode(SimpleNodeDTO src, UpdateNodeDTO request, com.zeroc.Ice.Current current);

    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::zeroc::StorageService"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::zeroc::StorageService";
    }

    @Deprecated
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_createMirror(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        FileNodeDTO iceP_src;
        iceP_src = FileNodeDTO.ice_read(istr);
        inS.endReadParams();
        SimpleNodeDTO ret = obj.createMirror(iceP_src, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        SimpleNodeDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_createNodeWithParent(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        SimpleNodeDTO iceP_parent;
        UpdateNodeDTO iceP_request;
        iceP_parent = SimpleNodeDTO.ice_read(istr);
        iceP_request = UpdateNodeDTO.ice_read(istr);
        inS.endReadParams();
        SimpleNodeDTO ret = obj.createNodeWithParent(iceP_parent, iceP_request, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        SimpleNodeDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_updateNodeWithParent(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        SimpleNodeDTO iceP_src;
        SimpleNodeDTO iceP_parent;
        UpdateNodeDTO iceP_request;
        iceP_src = SimpleNodeDTO.ice_read(istr);
        iceP_parent = SimpleNodeDTO.ice_read(istr);
        iceP_request = UpdateNodeDTO.ice_read(istr);
        inS.endReadParams();
        SimpleNodeDTO ret = obj.updateNodeWithParent(iceP_src, iceP_parent, iceP_request, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        SimpleNodeDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_deleteNodeById(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_id;
        iceP_id = istr.readString();
        inS.endReadParams();
        boolean ret = obj.deleteNodeById(iceP_id, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listAllNode(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_userId;
        iceP_userId = istr.readString();
        inS.endReadParams();
        java.util.List<SimpleNodeDTO> ret = obj.listAllNode(iceP_userId, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        SimpleNodeListHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listNode(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        QueryNodeDTO iceP_query;
        iceP_query = QueryNodeDTO.ice_read(istr);
        inS.endReadParams();
        java.util.List<SimpleNodeDTO> ret = obj.listNode(iceP_query, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        SimpleNodeListHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listFileNodeInfo(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        QueryNodeDTO iceP_query;
        boolean iceP_withHistory;
        iceP_query = QueryNodeDTO.ice_read(istr);
        iceP_withHistory = istr.readBool();
        inS.endReadParams();
        java.util.List<FileNodeDTO> ret = obj.listFileNodeInfo(iceP_query, iceP_withHistory, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        FileNodeListHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_getFullNodeInfo(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        SimpleNodeDTO iceP_node;
        iceP_node = SimpleNodeDTO.ice_read(istr);
        inS.endReadParams();
        FullNodeDTO ret = obj.getFullNodeInfo(iceP_node, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        FullNodeDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_getFileNodeInfo(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        SimpleNodeDTO iceP_node;
        boolean iceP_withHistory;
        iceP_node = SimpleNodeDTO.ice_read(istr);
        iceP_withHistory = istr.readBool();
        inS.endReadParams();
        FileNodeDTO ret = obj.getFileNodeInfo(iceP_node, iceP_withHistory, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        FileNodeDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    @Deprecated
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_isDirectoryEmpty(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_path;
        iceP_path = istr.readString();
        inS.endReadParams();
        boolean ret = obj.isDirectoryEmpty(iceP_path, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    @Deprecated
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_isDirectoryEmptyForAccount(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        com.maoding.User.zeroc.AccountDTO iceP_account;
        String iceP_path;
        iceP_account = com.maoding.User.zeroc.AccountDTO.ice_read(istr);
        iceP_path = istr.readString();
        inS.endReadParams();
        boolean ret = obj.isDirectoryEmptyForAccount(iceP_account, iceP_path, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    @Deprecated
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_createNode(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        UpdateNodeDTO iceP_request;
        iceP_request = UpdateNodeDTO.ice_read(istr);
        inS.endReadParams();
        SimpleNodeDTO ret = obj.createNode(iceP_request, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        SimpleNodeDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    @Deprecated
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_updateNode(StorageService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        SimpleNodeDTO iceP_src;
        UpdateNodeDTO iceP_request;
        iceP_src = SimpleNodeDTO.ice_read(istr);
        iceP_request = UpdateNodeDTO.ice_read(istr);
        inS.endReadParams();
        SimpleNodeDTO ret = obj.updateNode(iceP_src, iceP_request, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        SimpleNodeDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    final static String[] _iceOps =
    {
        "createMirror",
        "createNode",
        "createNodeWithParent",
        "deleteNodeById",
        "getFileNodeInfo",
        "getFullNodeInfo",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "isDirectoryEmpty",
        "isDirectoryEmptyForAccount",
        "listAllNode",
        "listFileNodeInfo",
        "listNode",
        "updateNode",
        "updateNodeWithParent"
    };

    @SuppressWarnings("deprecation")
    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_createMirror(this, in, current);
            }
            case 1:
            {
                return _iceD_createNode(this, in, current);
            }
            case 2:
            {
                return _iceD_createNodeWithParent(this, in, current);
            }
            case 3:
            {
                return _iceD_deleteNodeById(this, in, current);
            }
            case 4:
            {
                return _iceD_getFileNodeInfo(this, in, current);
            }
            case 5:
            {
                return _iceD_getFullNodeInfo(this, in, current);
            }
            case 6:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 7:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 8:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 9:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 10:
            {
                return _iceD_isDirectoryEmpty(this, in, current);
            }
            case 11:
            {
                return _iceD_isDirectoryEmptyForAccount(this, in, current);
            }
            case 12:
            {
                return _iceD_listAllNode(this, in, current);
            }
            case 13:
            {
                return _iceD_listFileNodeInfo(this, in, current);
            }
            case 14:
            {
                return _iceD_listNode(this, in, current);
            }
            case 15:
            {
                return _iceD_updateNode(this, in, current);
            }
            case 16:
            {
                return _iceD_updateNodeWithParent(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}
