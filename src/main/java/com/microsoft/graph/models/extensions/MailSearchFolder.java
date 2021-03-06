// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MailFolder;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Search Folder.
 */
public class MailSearchFolder extends MailFolder implements IJsonBackedObject {


    /**
     * The Is Supported.
     * Indicates whether a search folder is editable using REST APIs.
     */
    @SerializedName("isSupported")
    @Expose
    public Boolean isSupported;

    /**
     * The Include Nested Folders.
     * Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a shallow search of only each of the folders explicitly specified in sourceFolderIds.
     */
    @SerializedName("includeNestedFolders")
    @Expose
    public Boolean includeNestedFolders;

    /**
     * The Source Folder Ids.
     * The mailbox folders that should be mined.
     */
    @SerializedName("sourceFolderIds")
    @Expose
    public java.util.List<String> sourceFolderIds;

    /**
     * The Filter Query.
     * The OData query to filter the messages.
     */
    @SerializedName("filterQuery")
    @Expose
    public String filterQuery;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
