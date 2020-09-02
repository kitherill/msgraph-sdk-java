// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICalendarSharingMessageAcceptRequest;
import com.microsoft.graph.requests.extensions.CalendarSharingMessageAcceptRequest;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Sharing Message Accept Request Builder.
 */
public class CalendarSharingMessageAcceptRequestBuilder extends BaseActionRequestBuilder implements ICalendarSharingMessageAcceptRequestBuilder {

    /**
     * The request builder for this CalendarSharingMessageAccept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarSharingMessageAcceptRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ICalendarSharingMessageAcceptRequest
     *
     * @return the ICalendarSharingMessageAcceptRequest instance
     */
    public ICalendarSharingMessageAcceptRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ICalendarSharingMessageAcceptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICalendarSharingMessageAcceptRequest instance
     */
    public ICalendarSharingMessageAcceptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CalendarSharingMessageAcceptRequest request = new CalendarSharingMessageAcceptRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}