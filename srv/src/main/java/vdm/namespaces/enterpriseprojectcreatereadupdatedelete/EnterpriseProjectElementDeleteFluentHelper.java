/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class EnterpriseProjectElementDeleteFluentHelper
    extends FluentHelperDelete<EnterpriseProjectElementDeleteFluentHelper, EnterpriseProjectElement>
{

    /**
     * {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final EnterpriseProjectElement entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The EnterpriseProjectElement to delete from the endpoint.
     */
    public EnterpriseProjectElementDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final EnterpriseProjectElement entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected EnterpriseProjectElement getEntity() {
        return entity;
    }

}
