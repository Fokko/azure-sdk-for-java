/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_06_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.Event;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.EventRequestMessage;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.EventResponseMessage;

class EventImpl extends WrapperImpl<EventInner> implements Event {
    private final ContainerRegistryManager manager;
    EventImpl(EventInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public EventRequestMessage eventRequestMessage() {
        return this.inner().eventRequestMessage();
    }

    @Override
    public EventResponseMessage eventResponseMessage() {
        return this.inner().eventResponseMessage();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

}