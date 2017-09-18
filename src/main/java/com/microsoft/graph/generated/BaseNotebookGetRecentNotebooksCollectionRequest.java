// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Notebook Get Recent Notebooks Collection Request.
 */
public class BaseNotebookGetRecentNotebooksCollectionRequest extends BaseCollectionRequest<BaseNotebookGetRecentNotebooksCollectionResponse, INotebookGetRecentNotebooksCollectionPage> implements IBaseNotebookGetRecentNotebooksCollectionRequest {


    /**
     * The request for this NotebookGetRecentNotebooks
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseNotebookGetRecentNotebooksCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseNotebookGetRecentNotebooksCollectionResponse.class, INotebookGetRecentNotebooksCollectionPage.class);
    }


    public void get(final ICallback<INotebookGetRecentNotebooksCollectionPage> callback) {
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

    public INotebookGetRecentNotebooksCollectionPage get() throws ClientException {
        final BaseNotebookGetRecentNotebooksCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public INotebookGetRecentNotebooksCollectionPage buildFromResponse(final BaseNotebookGetRecentNotebooksCollectionResponse response) {
        final INotebookGetRecentNotebooksCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new NotebookGetRecentNotebooksCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* includePersonalNotebooks */ null);
        } else {
            builder = null;
        }
        final INotebookGetRecentNotebooksCollectionPage page = new NotebookGetRecentNotebooksCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public INotebookGetRecentNotebooksCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (INotebookGetRecentNotebooksCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public INotebookGetRecentNotebooksCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (INotebookGetRecentNotebooksCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public INotebookGetRecentNotebooksCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (INotebookGetRecentNotebooksCollectionRequest)this;
    }

}