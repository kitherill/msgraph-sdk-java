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
 * The interface for the Base Onenote Entity Schema Object Model Request.
 */
public interface IBaseOnenoteEntitySchemaObjectModelRequest extends IHttpRequest {

    /**
     * Gets the OnenoteEntitySchemaObjectModel from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<OnenoteEntitySchemaObjectModel> callback);

    /**
     * Gets the OnenoteEntitySchemaObjectModel from the service
     * @return The OnenoteEntitySchemaObjectModel from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenoteEntitySchemaObjectModel get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnenoteEntitySchemaObjectModel with a source
     * @param sourceOnenoteEntitySchemaObjectModel The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final OnenoteEntitySchemaObjectModel sourceOnenoteEntitySchemaObjectModel, final ICallback<OnenoteEntitySchemaObjectModel> callback);

    /**
     * Patches this OnenoteEntitySchemaObjectModel with a source
     * @param sourceOnenoteEntitySchemaObjectModel The source object with updates
     * @return The updated OnenoteEntitySchemaObjectModel
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenoteEntitySchemaObjectModel patch(final OnenoteEntitySchemaObjectModel sourceOnenoteEntitySchemaObjectModel) throws ClientException;

    /**
     * Posts a OnenoteEntitySchemaObjectModel with a new object
     * @param newOnenoteEntitySchemaObjectModel The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel, final ICallback<OnenoteEntitySchemaObjectModel> callback);

    /**
     * Posts a OnenoteEntitySchemaObjectModel with a new object
     * @param newOnenoteEntitySchemaObjectModel The new object to create
     * @return The created OnenoteEntitySchemaObjectModel
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenoteEntitySchemaObjectModel post(final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseOnenoteEntitySchemaObjectModelRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseOnenoteEntitySchemaObjectModelRequest expand(final String value);

}

