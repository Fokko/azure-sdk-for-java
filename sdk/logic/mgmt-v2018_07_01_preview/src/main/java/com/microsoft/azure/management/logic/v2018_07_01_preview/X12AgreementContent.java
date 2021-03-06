/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The X12 agreement content.
 */
public class X12AgreementContent {
    /**
     * The X12 one-way receive agreement.
     */
    @JsonProperty(value = "receiveAgreement", required = true)
    private X12OneWayAgreement receiveAgreement;

    /**
     * The X12 one-way send agreement.
     */
    @JsonProperty(value = "sendAgreement", required = true)
    private X12OneWayAgreement sendAgreement;

    /**
     * Get the X12 one-way receive agreement.
     *
     * @return the receiveAgreement value
     */
    public X12OneWayAgreement receiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * Set the X12 one-way receive agreement.
     *
     * @param receiveAgreement the receiveAgreement value to set
     * @return the X12AgreementContent object itself.
     */
    public X12AgreementContent withReceiveAgreement(X12OneWayAgreement receiveAgreement) {
        this.receiveAgreement = receiveAgreement;
        return this;
    }

    /**
     * Get the X12 one-way send agreement.
     *
     * @return the sendAgreement value
     */
    public X12OneWayAgreement sendAgreement() {
        return this.sendAgreement;
    }

    /**
     * Set the X12 one-way send agreement.
     *
     * @param sendAgreement the sendAgreement value to set
     * @return the X12AgreementContent object itself.
     */
    public X12AgreementContent withSendAgreement(X12OneWayAgreement sendAgreement) {
        this.sendAgreement = sendAgreement;
        return this;
    }

}
