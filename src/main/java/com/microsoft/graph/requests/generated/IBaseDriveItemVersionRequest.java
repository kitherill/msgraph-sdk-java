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
 * The interface for the Base Drive Item Version Request.
 */
public interface IBaseDriveItemVersionRequest extends IHttpRequest {

    /**
     * Gets the DriveItemVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DriveItemVersion> callback);

    /**
     * Gets the DriveItemVersion from the service
     *
     * @return the DriveItemVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DriveItemVersion get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DriveItemVersion with a source
     *
     * @param sourceDriveItemVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DriveItemVersion sourceDriveItemVersion, final ICallback<DriveItemVersion> callback);

    /**
     * Patches this DriveItemVersion with a source
     *
     * @param sourceDriveItemVersion the source object with updates
     * @return the updated DriveItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DriveItemVersion patch(final DriveItemVersion sourceDriveItemVersion) throws ClientException;

    /**
     * Posts a DriveItemVersion with a new object
     *
     * @param newDriveItemVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DriveItemVersion newDriveItemVersion, final ICallback<DriveItemVersion> callback);

    /**
     * Posts a DriveItemVersion with a new object
     *
     * @param newDriveItemVersion the new object to create
     * @return the created DriveItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DriveItemVersion post(final DriveItemVersion newDriveItemVersion) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDriveItemVersionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDriveItemVersionRequest expand(final String value);

}

