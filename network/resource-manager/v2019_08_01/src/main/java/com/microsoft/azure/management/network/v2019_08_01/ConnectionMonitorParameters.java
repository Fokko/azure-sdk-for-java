/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the operation to create a connection monitor.
 */
public class ConnectionMonitorParameters {
    /**
     * Describes the source of connection monitor.
     */
    @JsonProperty(value = "source", required = true)
    private ConnectionMonitorSource source;

    /**
     * Describes the destination of connection monitor.
     */
    @JsonProperty(value = "destination", required = true)
    private ConnectionMonitorDestination destination;

    /**
     * Determines if the connection monitor will start automatically once
     * created.
     */
    @JsonProperty(value = "autoStart")
    private Boolean autoStart;

    /**
     * Monitoring interval in seconds.
     */
    @JsonProperty(value = "monitoringIntervalInSeconds")
    private Integer monitoringIntervalInSeconds;

    /**
     * Get describes the source of connection monitor.
     *
     * @return the source value
     */
    public ConnectionMonitorSource source() {
        return this.source;
    }

    /**
     * Set describes the source of connection monitor.
     *
     * @param source the source value to set
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withSource(ConnectionMonitorSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get describes the destination of connection monitor.
     *
     * @return the destination value
     */
    public ConnectionMonitorDestination destination() {
        return this.destination;
    }

    /**
     * Set describes the destination of connection monitor.
     *
     * @param destination the destination value to set
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withDestination(ConnectionMonitorDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value
     */
    public Boolean autoStart() {
        return this.autoStart;
    }

    /**
     * Set determines if the connection monitor will start automatically once created.
     *
     * @param autoStart the autoStart value to set
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * Get monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value
     */
    public Integer monitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds;
    }

    /**
     * Set monitoring interval in seconds.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        return this;
    }

}
