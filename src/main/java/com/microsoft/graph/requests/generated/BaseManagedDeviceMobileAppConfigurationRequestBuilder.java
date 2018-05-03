// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Mobile App Configuration Request Builder.
 */
public class BaseManagedDeviceMobileAppConfigurationRequestBuilder extends BaseRequestBuilder implements IBaseManagedDeviceMobileAppConfigurationRequestBuilder {

    /**
     * The request builder for the ManagedDeviceMobileAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceMobileAppConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedDeviceMobileAppConfigurationRequest instance
     */
    public IManagedDeviceMobileAppConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceMobileAppConfigurationRequest instance
     */
    public IManagedDeviceMobileAppConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedDeviceMobileAppConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new ManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new ManagedDeviceMobileAppConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id) {
        return new ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder userStatuses(final String id) {
        return new ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationDeviceSummary
     *
     * @return the IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder instance
     */
    public IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder deviceStatusSummary() {
        return new ManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusSummary"), getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationUserSummary
     *
     * @return the IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder instance
     */
    public IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder userStatusSummary() {
        return new ManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusSummary"), getClient(), null);
    }
}
