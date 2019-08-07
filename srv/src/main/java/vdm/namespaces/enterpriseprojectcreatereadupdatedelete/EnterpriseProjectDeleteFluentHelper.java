/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class EnterpriseProjectDeleteFluentHelper
    extends FluentHelperDelete<EnterpriseProjectDeleteFluentHelper, EnterpriseProject>
{

    /**
     * {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final EnterpriseProject entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The EnterpriseProject to delete from the endpoint.
     */
    public EnterpriseProjectDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final EnterpriseProject entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected EnterpriseProject getEntity() {
        return entity;
    }

}
