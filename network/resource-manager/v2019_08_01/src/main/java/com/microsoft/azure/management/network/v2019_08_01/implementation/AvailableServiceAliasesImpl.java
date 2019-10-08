/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_08_01.AvailableServiceAliases;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_08_01.AvailableServiceAlias;

class AvailableServiceAliasesImpl extends WrapperImpl<AvailableServiceAliasesInner> implements AvailableServiceAliases {
    private final NetworkManager manager;

    AvailableServiceAliasesImpl(NetworkManager manager) {
        super(manager.inner().availableServiceAliases());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private AvailableServiceAliasImpl wrapModel(AvailableServiceAliasInner inner) {
        return  new AvailableServiceAliasImpl(inner, manager());
    }

    @Override
    public Observable<AvailableServiceAlias> listByResourceGroupAsync(final String resourceGroupName, final String location) {
        AvailableServiceAliasesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName, location)
        .flatMapIterable(new Func1<Page<AvailableServiceAliasInner>, Iterable<AvailableServiceAliasInner>>() {
            @Override
            public Iterable<AvailableServiceAliasInner> call(Page<AvailableServiceAliasInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailableServiceAliasInner, AvailableServiceAlias>() {
            @Override
            public AvailableServiceAlias call(AvailableServiceAliasInner inner) {
                return new AvailableServiceAliasImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AvailableServiceAlias> listAsync(final String location) {
        AvailableServiceAliasesInner client = this.inner();
        return client.listAsync(location)
        .flatMapIterable(new Func1<Page<AvailableServiceAliasInner>, Iterable<AvailableServiceAliasInner>>() {
            @Override
            public Iterable<AvailableServiceAliasInner> call(Page<AvailableServiceAliasInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailableServiceAliasInner, AvailableServiceAlias>() {
            @Override
            public AvailableServiceAlias call(AvailableServiceAliasInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
