/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.selectable.EnterpriseProjectJVASelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class EnterpriseProjectJVAByKeyFluentHelper
    extends FluentHelperByKey<EnterpriseProjectJVAByKeyFluentHelper, EnterpriseProjectJVA, EnterpriseProjectJVASelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to fetch a single {@code EnterpriseProjectJVA}
     * @param projectUUID
     *     Entity Guid<p>Constraints: Not nullable</p>
     */
    public EnterpriseProjectJVAByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID projectUUID) {
        super(servicePath);
        this.key.put("ProjectUUID", projectUUID);
    }

    @Override
    @Nonnull
    protected Class<EnterpriseProjectJVA> getEntityClass() {
        return EnterpriseProjectJVA.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
