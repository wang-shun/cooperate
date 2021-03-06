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
// Generated from file `Company.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.company.zeroc;

public interface CompanyServicePrx extends com.zeroc.Ice.ObjectPrx
{
    default java.util.List<CompanyDTO> listCompany(QueryCompanyDTO query)
    {
        return listCompany(query, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<CompanyDTO> listCompany(QueryCompanyDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listCompanyAsync(query, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<CompanyDTO>> listCompanyAsync(QueryCompanyDTO query)
    {
        return _iceI_listCompanyAsync(query, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<CompanyDTO>> listCompanyAsync(QueryCompanyDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listCompanyAsync(query, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<CompanyDTO>> _iceI_listCompanyAsync(QueryCompanyDTO iceP_query, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<CompanyDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listCompany", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     QueryCompanyDTO.ice_write(ostr, iceP_query);
                 }, istr -> {
                     java.util.List<CompanyDTO> ret;
                     ret = CompanyListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default java.util.List<CompanyDTO> listCompanyByUserId(String userId)
    {
        return listCompanyByUserId(userId, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<CompanyDTO> listCompanyByUserId(String userId, java.util.Map<String, String> context)
    {
        return _iceI_listCompanyByUserIdAsync(userId, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<CompanyDTO>> listCompanyByUserIdAsync(String userId)
    {
        return _iceI_listCompanyByUserIdAsync(userId, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<CompanyDTO>> listCompanyByUserIdAsync(String userId, java.util.Map<String, String> context)
    {
        return _iceI_listCompanyByUserIdAsync(userId, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<CompanyDTO>> _iceI_listCompanyByUserIdAsync(String iceP_userId, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<CompanyDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listCompanyByUserId", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_userId);
                 }, istr -> {
                     java.util.List<CompanyDTO> ret;
                     ret = CompanyListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    /**
     **/
    @Deprecated
    default java.util.List<CompanyDTO> listCompanyForCurrent()
    {
        return listCompanyForCurrent(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    /**
     * @param context The Context map to send with the invocation.
     **/
    @Deprecated
    default java.util.List<CompanyDTO> listCompanyForCurrent(java.util.Map<String, String> context)
    {
        return _iceI_listCompanyForCurrentAsync(context, true).waitForResponse();
    }

    /**
     * @return A future that will be completed with the result.
     **/
    @Deprecated
    default java.util.concurrent.CompletableFuture<java.util.List<CompanyDTO>> listCompanyForCurrentAsync()
    {
        return _iceI_listCompanyForCurrentAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    /**
     * @param context The Context map to send with the invocation.
     * @return A future that will be completed with the result.
     **/
    @Deprecated
    default java.util.concurrent.CompletableFuture<java.util.List<CompanyDTO>> listCompanyForCurrentAsync(java.util.Map<String, String> context)
    {
        return _iceI_listCompanyForCurrentAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<CompanyDTO>> _iceI_listCompanyForCurrentAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<CompanyDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listCompanyForCurrent", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     java.util.List<CompanyDTO> ret;
                     ret = CompanyListHelper.read(istr);
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
    static CompanyServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), CompanyServicePrx.class, _CompanyServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CompanyServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), CompanyServicePrx.class, _CompanyServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CompanyServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), CompanyServicePrx.class, _CompanyServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CompanyServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), CompanyServicePrx.class, _CompanyServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static CompanyServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, CompanyServicePrx.class, _CompanyServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static CompanyServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, CompanyServicePrx.class, _CompanyServicePrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default CompanyServicePrx ice_context(java.util.Map<String, String> newContext)
    {
        return (CompanyServicePrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default CompanyServicePrx ice_adapterId(String newAdapterId)
    {
        return (CompanyServicePrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default CompanyServicePrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (CompanyServicePrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default CompanyServicePrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (CompanyServicePrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default CompanyServicePrx ice_invocationTimeout(int newTimeout)
    {
        return (CompanyServicePrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default CompanyServicePrx ice_connectionCached(boolean newCache)
    {
        return (CompanyServicePrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default CompanyServicePrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (CompanyServicePrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default CompanyServicePrx ice_secure(boolean b)
    {
        return (CompanyServicePrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default CompanyServicePrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (CompanyServicePrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default CompanyServicePrx ice_preferSecure(boolean b)
    {
        return (CompanyServicePrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default CompanyServicePrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (CompanyServicePrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default CompanyServicePrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (CompanyServicePrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default CompanyServicePrx ice_collocationOptimized(boolean b)
    {
        return (CompanyServicePrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default CompanyServicePrx ice_twoway()
    {
        return (CompanyServicePrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default CompanyServicePrx ice_oneway()
    {
        return (CompanyServicePrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default CompanyServicePrx ice_batchOneway()
    {
        return (CompanyServicePrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default CompanyServicePrx ice_datagram()
    {
        return (CompanyServicePrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default CompanyServicePrx ice_batchDatagram()
    {
        return (CompanyServicePrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default CompanyServicePrx ice_compress(boolean co)
    {
        return (CompanyServicePrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default CompanyServicePrx ice_timeout(int t)
    {
        return (CompanyServicePrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default CompanyServicePrx ice_connectionId(String connectionId)
    {
        return (CompanyServicePrx)_ice_connectionId(connectionId);
    }

    static String ice_staticId()
    {
        return "::zeroc::CompanyService";
    }
}
