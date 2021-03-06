/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import java.util.List;
import com.microsoft.azure.management.automation.v2015_10_31.HybridRunbookWorker;
import com.microsoft.azure.management.automation.v2015_10_31.RunAsCredentialAssociationProperty;
import com.microsoft.azure.management.automation.v2015_10_31.GroupTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of hybrid runbook worker group.
 */
public class HybridRunbookWorkerGroupInner {
    /**
     * Gets or sets the id of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Gets or sets the name of the group.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets the list of hybrid runbook workers.
     */
    @JsonProperty(value = "hybridRunbookWorkers")
    private List<HybridRunbookWorker> hybridRunbookWorkers;

    /**
     * Sets the credential of a worker group.
     */
    @JsonProperty(value = "credential")
    private RunAsCredentialAssociationProperty credential;

    /**
     * Type of the HybridWorkerGroup. Possible values include: 'User',
     * 'System'.
     */
    @JsonProperty(value = "groupType")
    private GroupTypeEnum groupType;

    /**
     * Get gets or sets the id of the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set gets or sets the id of the resource.
     *
     * @param id the id value to set
     * @return the HybridRunbookWorkerGroupInner object itself.
     */
    public HybridRunbookWorkerGroupInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get gets or sets the name of the group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the group.
     *
     * @param name the name value to set
     * @return the HybridRunbookWorkerGroupInner object itself.
     */
    public HybridRunbookWorkerGroupInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets the list of hybrid runbook workers.
     *
     * @return the hybridRunbookWorkers value
     */
    public List<HybridRunbookWorker> hybridRunbookWorkers() {
        return this.hybridRunbookWorkers;
    }

    /**
     * Set gets or sets the list of hybrid runbook workers.
     *
     * @param hybridRunbookWorkers the hybridRunbookWorkers value to set
     * @return the HybridRunbookWorkerGroupInner object itself.
     */
    public HybridRunbookWorkerGroupInner withHybridRunbookWorkers(List<HybridRunbookWorker> hybridRunbookWorkers) {
        this.hybridRunbookWorkers = hybridRunbookWorkers;
        return this;
    }

    /**
     * Get sets the credential of a worker group.
     *
     * @return the credential value
     */
    public RunAsCredentialAssociationProperty credential() {
        return this.credential;
    }

    /**
     * Set sets the credential of a worker group.
     *
     * @param credential the credential value to set
     * @return the HybridRunbookWorkerGroupInner object itself.
     */
    public HybridRunbookWorkerGroupInner withCredential(RunAsCredentialAssociationProperty credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get type of the HybridWorkerGroup. Possible values include: 'User', 'System'.
     *
     * @return the groupType value
     */
    public GroupTypeEnum groupType() {
        return this.groupType;
    }

    /**
     * Set type of the HybridWorkerGroup. Possible values include: 'User', 'System'.
     *
     * @param groupType the groupType value to set
     * @return the HybridRunbookWorkerGroupInner object itself.
     */
    public HybridRunbookWorkerGroupInner withGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
        return this;
    }

}
