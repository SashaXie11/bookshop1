/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.selectable.EnterpriseProjectElementSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class EnterpriseProjectElementByKeyFluentHelper
    extends FluentHelperByKey<EnterpriseProjectElementByKeyFluentHelper, EnterpriseProjectElement, EnterpriseProjectElementSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to fetch a single {@code EnterpriseProjectElement}
     * @param projectElementUUID
     *     Entity Guid<p>Constraints: Not nullable</p>
     */
    public EnterpriseProjectElementByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID projectElementUUID) {
        super(servicePath);
        this.key.put("ProjectElementUUID", projectElementUUID);
    }

    @Override
    @Nonnull
    protected Class<EnterpriseProjectElement> getEntityClass() {
        return EnterpriseProjectElement.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
