/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.selectable.EnterpriseProjectSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class EnterpriseProjectByKeyFluentHelper
    extends FluentHelperByKey<EnterpriseProjectByKeyFluentHelper, EnterpriseProject, EnterpriseProjectSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to fetch a single {@code EnterpriseProject}
     * @param projectUUID
     *     Entity Guid<p>Constraints: Not nullable</p>
     */
    public EnterpriseProjectByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID projectUUID) {
        super(servicePath);
        this.key.put("ProjectUUID", projectUUID);
    }

    @Override
    @Nonnull
    protected Class<EnterpriseProject> getEntityClass() {
        return EnterpriseProject.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
