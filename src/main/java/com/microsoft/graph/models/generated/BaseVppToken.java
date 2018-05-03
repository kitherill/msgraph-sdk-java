// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Vpp Token.
 */
public class BaseVppToken extends Entity implements IJsonBackedObject {


    /**
     * The Organization Name.
     * The organization associated with the Apple Volume Purchase Program Token
     */
    @SerializedName("organizationName")
    @Expose
    public String organizationName;

    /**
     * The Vpp Token Account Type.
     * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     */
    @SerializedName("vppTokenAccountType")
    @Expose
    public VppTokenAccountType vppTokenAccountType;

    /**
     * The Apple Id.
     * The apple Id associated with the given Apple Volume Purchase Program Token.
     */
    @SerializedName("appleId")
    @Expose
    public String appleId;

    /**
     * The Expiration Date Time.
     * The expiration date time of the Apple Volume Purchase Program Token.
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Last Sync Date Time.
     * The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Token.
     * The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     */
    @SerializedName("token")
    @Expose
    public String token;

    /**
     * The Last Modified Date Time.
     * Last modification date time associated with the Apple Volume Purchase Program Token.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The State.
     * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid. Possible values are: unknown, valid, expired, invalid.
     */
    @SerializedName("state")
    @Expose
    public VppTokenState state;

    /**
     * The Last Sync Status.
     * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token. Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
     */
    @SerializedName("lastSyncStatus")
    @Expose
    public VppTokenSyncStatus lastSyncStatus;

    /**
     * The Automatically Update Apps.
     * Whether or not apps for the VPP token will be automatically updated.
     */
    @SerializedName("automaticallyUpdateApps")
    @Expose
    public Boolean automaticallyUpdateApps;

    /**
     * The Country Or Region.
     * Whether or not apps for the VPP token will be automatically updated.
     */
    @SerializedName("countryOrRegion")
    @Expose
    public String countryOrRegion;


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
