// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Collection Request.
 */
public class MobileAppCollectionRequest extends BaseCollectionRequest<MobileAppCollectionResponse, IMobileAppCollectionPage> implements IMobileAppCollectionRequest {

    /**
     * The request builder for this collection of MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppCollectionResponse.class, IMobileAppCollectionPage.class);
    }

    public void get(final ICallback<IMobileAppCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IMobileAppCollectionPage get() throws ClientException {
        final MobileAppCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MobileApp newMobileApp, final ICallback<MobileApp> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MobileAppRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileApp, callback);
    }

    public MobileApp post(final MobileApp newMobileApp) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileAppRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileApp);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileAppCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (MobileAppCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileAppCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (MobileAppCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMobileAppCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (MobileAppCollectionRequest)this;
    }

    public IMobileAppCollectionPage buildFromResponse(final MobileAppCollectionResponse response) {
        final IMobileAppCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileAppCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileAppCollectionPage page = new MobileAppCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
