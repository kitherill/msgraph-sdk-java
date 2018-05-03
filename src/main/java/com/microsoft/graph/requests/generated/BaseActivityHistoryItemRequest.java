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
 * The class for the Base Activity History Item Request.
 */
public class BaseActivityHistoryItemRequest extends BaseRequest implements IBaseActivityHistoryItemRequest {

    /**
     * The request for the ActivityHistoryItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseActivityHistoryItemRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ActivityHistoryItem> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ActivityHistoryItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @return the ActivityHistoryItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ActivityHistoryItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ActivityHistoryItem sourceActivityHistoryItem, final ICallback<ActivityHistoryItem> callback) {
        send(HttpMethod.PATCH, callback, sourceActivityHistoryItem);
    }

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @return the updated ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ActivityHistoryItem patch(final ActivityHistoryItem sourceActivityHistoryItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ActivityHistoryItem newActivityHistoryItem, final ICallback<ActivityHistoryItem> callback) {
        send(HttpMethod.POST, callback, newActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @return the created ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ActivityHistoryItem post(final ActivityHistoryItem newActivityHistoryItem) throws ClientException {
        return send(HttpMethod.POST, newActivityHistoryItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IActivityHistoryItemRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ActivityHistoryItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IActivityHistoryItemRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ActivityHistoryItemRequest)this;
     }

}

