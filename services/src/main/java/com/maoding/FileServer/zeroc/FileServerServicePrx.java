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

public interface FileServerServicePrx extends com.zeroc.Ice.ObjectPrx
{
    default java.lang.Integer getFileServerType()
    {
        return getFileServerType(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.lang.Integer getFileServerType(java.util.Map<String, String> context)
    {
        return _iceI_getFileServerTypeAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Integer> getFileServerTypeAsync()
    {
        return _iceI_getFileServerTypeAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Integer> getFileServerTypeAsync(java.util.Map<String, String> context)
    {
        return _iceI_getFileServerTypeAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Integer> _iceI_getFileServerTypeAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Integer> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getFileServerType", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     java.lang.Integer ret;
                     ret = istr.readSerializable(java.lang.Integer.class);
                     return ret;
                 });
        return f;
    }

    default HttpRequestDTO getUploadRequestForHttp()
    {
        return getUploadRequestForHttp(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default HttpRequestDTO getUploadRequestForHttp(java.util.Map<String, String> context)
    {
        return _iceI_getUploadRequestForHttpAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<HttpRequestDTO> getUploadRequestForHttpAsync()
    {
        return _iceI_getUploadRequestForHttpAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<HttpRequestDTO> getUploadRequestForHttpAsync(java.util.Map<String, String> context)
    {
        return _iceI_getUploadRequestForHttpAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<HttpRequestDTO> _iceI_getUploadRequestForHttpAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<HttpRequestDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getUploadRequestForHttp", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     HttpRequestDTO ret;
                     ret = HttpRequestDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default HttpRequestDTO getDownloadRequestForHttp(String src)
    {
        return getDownloadRequestForHttp(src, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default HttpRequestDTO getDownloadRequestForHttp(String src, java.util.Map<String, String> context)
    {
        return _iceI_getDownloadRequestForHttpAsync(src, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<HttpRequestDTO> getDownloadRequestForHttpAsync(String src)
    {
        return _iceI_getDownloadRequestForHttpAsync(src, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<HttpRequestDTO> getDownloadRequestForHttpAsync(String src, java.util.Map<String, String> context)
    {
        return _iceI_getDownloadRequestForHttpAsync(src, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<HttpRequestDTO> _iceI_getDownloadRequestForHttpAsync(String iceP_src, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<HttpRequestDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getDownloadRequestForHttp", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_src);
                 }, istr -> {
                     HttpRequestDTO ret;
                     ret = HttpRequestDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default String DuplicateFile(String src)
    {
        return DuplicateFile(src, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default String DuplicateFile(String src, java.util.Map<String, String> context)
    {
        return _iceI_DuplicateFileAsync(src, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> DuplicateFileAsync(String src)
    {
        return _iceI_DuplicateFileAsync(src, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> DuplicateFileAsync(String src, java.util.Map<String, String> context)
    {
        return _iceI_DuplicateFileAsync(src, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.String> _iceI_DuplicateFileAsync(String iceP_src, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.String> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "DuplicateFile", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_src);
                 }, istr -> {
                     String ret;
                     ret = istr.readString();
                     return ret;
                 });
        return f;
    }

    default void DeleteFile(String src)
    {
        DeleteFile(src, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void DeleteFile(String src, java.util.Map<String, String> context)
    {
        _iceI_DeleteFileAsync(src, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> DeleteFileAsync(String src)
    {
        return _iceI_DeleteFileAsync(src, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> DeleteFileAsync(String src, java.util.Map<String, String> context)
    {
        return _iceI_DeleteFileAsync(src, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_DeleteFileAsync(String iceP_src, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "DeleteFile", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_src);
                 }, null);
        return f;
    }

    default java.lang.Boolean isExist(String src)
    {
        return isExist(src, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.lang.Boolean isExist(String src, java.util.Map<String, String> context)
    {
        return _iceI_isExistAsync(src, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> isExistAsync(String src)
    {
        return _iceI_isExistAsync(src, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> isExistAsync(String src, java.util.Map<String, String> context)
    {
        return _iceI_isExistAsync(src, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_isExistAsync(String iceP_src, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "isExist", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_src);
                 }, istr -> {
                     java.lang.Boolean ret;
                     ret = istr.readSerializable(java.lang.Boolean.class);
                     return ret;
                 });
        return f;
    }

    default java.util.List<java.lang.String> listFile()
    {
        return listFile(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<java.lang.String> listFile(java.util.Map<String, String> context)
    {
        return _iceI_listFileAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> listFileAsync()
    {
        return _iceI_listFileAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> listFileAsync(java.util.Map<String, String> context)
    {
        return _iceI_listFileAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<java.lang.String>> _iceI_listFileAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<java.lang.String>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listFile", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     java.util.List<java.lang.String> ret;
                     ret = FileListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FileServerServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), FileServerServicePrx.class, _FileServerServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FileServerServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), FileServerServicePrx.class, _FileServerServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FileServerServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), FileServerServicePrx.class, _FileServerServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FileServerServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), FileServerServicePrx.class, _FileServerServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static FileServerServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, FileServerServicePrx.class, _FileServerServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static FileServerServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, FileServerServicePrx.class, _FileServerServicePrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default FileServerServicePrx ice_context(java.util.Map<String, String> newContext)
    {
        return (FileServerServicePrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default FileServerServicePrx ice_adapterId(String newAdapterId)
    {
        return (FileServerServicePrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default FileServerServicePrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (FileServerServicePrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default FileServerServicePrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (FileServerServicePrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default FileServerServicePrx ice_invocationTimeout(int newTimeout)
    {
        return (FileServerServicePrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default FileServerServicePrx ice_connectionCached(boolean newCache)
    {
        return (FileServerServicePrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default FileServerServicePrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (FileServerServicePrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default FileServerServicePrx ice_secure(boolean b)
    {
        return (FileServerServicePrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default FileServerServicePrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (FileServerServicePrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default FileServerServicePrx ice_preferSecure(boolean b)
    {
        return (FileServerServicePrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default FileServerServicePrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (FileServerServicePrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default FileServerServicePrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (FileServerServicePrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default FileServerServicePrx ice_collocationOptimized(boolean b)
    {
        return (FileServerServicePrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default FileServerServicePrx ice_twoway()
    {
        return (FileServerServicePrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default FileServerServicePrx ice_oneway()
    {
        return (FileServerServicePrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default FileServerServicePrx ice_batchOneway()
    {
        return (FileServerServicePrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default FileServerServicePrx ice_datagram()
    {
        return (FileServerServicePrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default FileServerServicePrx ice_batchDatagram()
    {
        return (FileServerServicePrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default FileServerServicePrx ice_compress(boolean co)
    {
        return (FileServerServicePrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default FileServerServicePrx ice_timeout(int t)
    {
        return (FileServerServicePrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default FileServerServicePrx ice_connectionId(String connectionId)
    {
        return (FileServerServicePrx)_ice_connectionId(connectionId);
    }

    static String ice_staticId()
    {
        return "::zeroc::FileServerService";
    }
}
