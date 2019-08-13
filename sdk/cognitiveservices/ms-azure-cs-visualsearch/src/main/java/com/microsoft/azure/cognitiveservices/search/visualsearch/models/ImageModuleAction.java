/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ImageModuleAction model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ImageModuleAction.class)
@JsonTypeName("ImageModuleAction")
public class ImageModuleAction extends ImageAction {
    /**
     * A list of images.
     */
    @JsonProperty(value = "data", access = JsonProperty.Access.WRITE_ONLY)
    private ImagesModule data;

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public ImagesModule data() {
        return this.data;
    }

}