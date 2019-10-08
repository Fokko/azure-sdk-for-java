/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.management.network.v2019_08_01.VpnLinkProviderProperties;
import com.microsoft.azure.management.network.v2019_08_01.VpnLinkBgpSettings;
import com.microsoft.azure.management.network.v2019_08_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * VpnSiteLink Resource.
 */
@JsonFlatten
public class VpnSiteLinkInner extends SubResource {
    /**
     * The link provider properties.
     */
    @JsonProperty(value = "properties.linkProperties")
    private VpnLinkProviderProperties linkProperties;

    /**
     * The ip-address for the vpn-site-link.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /**
     * The set of bgp properties.
     */
    @JsonProperty(value = "properties.bgpProperties")
    private VpnLinkBgpSettings bgpProperties;

    /**
     * The provisioning state of the VPN site link resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the link provider properties.
     *
     * @return the linkProperties value
     */
    public VpnLinkProviderProperties linkProperties() {
        return this.linkProperties;
    }

    /**
     * Set the link provider properties.
     *
     * @param linkProperties the linkProperties value to set
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withLinkProperties(VpnLinkProviderProperties linkProperties) {
        this.linkProperties = linkProperties;
        return this;
    }

    /**
     * Get the ip-address for the vpn-site-link.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ip-address for the vpn-site-link.
     *
     * @param ipAddress the ipAddress value to set
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the set of bgp properties.
     *
     * @return the bgpProperties value
     */
    public VpnLinkBgpSettings bgpProperties() {
        return this.bgpProperties;
    }

    /**
     * Set the set of bgp properties.
     *
     * @param bgpProperties the bgpProperties value to set
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withBgpProperties(VpnLinkBgpSettings bgpProperties) {
        this.bgpProperties = bgpProperties;
        return this;
    }

    /**
     * Get the provisioning state of the VPN site link resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the VPN site link resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
