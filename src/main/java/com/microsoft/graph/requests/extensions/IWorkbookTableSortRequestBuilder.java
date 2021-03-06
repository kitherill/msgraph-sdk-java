// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortRequest;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortApplyRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortClearRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortReapplyRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Sort Request Builder.
 */
public interface IWorkbookTableSortRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookTableSortRequest instance
     */
    IWorkbookTableSortRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableSortRequest instance
     */
    IWorkbookTableSortRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IWorkbookTableSortApplyRequestBuilder apply(final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final String method);
    IWorkbookTableSortClearRequestBuilder clear();
    IWorkbookTableSortReapplyRequestBuilder reapply();

}
