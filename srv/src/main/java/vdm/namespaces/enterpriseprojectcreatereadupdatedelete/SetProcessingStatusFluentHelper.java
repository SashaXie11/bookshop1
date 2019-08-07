/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete;

import java.net.URI;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperFunction;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * Fluent helper for the <b>SetProcessingStatus</b> OData function import.
 * 
 */
public class SetProcessingStatusFluentHelper
    extends FluentHelperFunction<SetProcessingStatusFluentHelper, EnterpriseProject, EnterpriseProject>
{

    private final Map<String, Object> values = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will execute the <b>SetProcessingStatus</b> OData function import with the provided parameters. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param processingStatus
     *     Constraints: Nullable, Maximum length: 2<p>Original parameter name from the Odata EDM: <b>ProcessingStatus</b></p>
     * @param servicePath
     *     Service path to be used to call the functions against.
     * @param projectUUID
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>ProjectUUID</b></p>
     */
    public SetProcessingStatusFluentHelper(
        @Nonnull
        final String servicePath, final UUID projectUUID, final String processingStatus) {
        super(servicePath);
        values.put("ProjectUUID", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(projectUUID));
        values.put("ProcessingStatus", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(processingStatus));
    }

    @Override
    @Nonnull
    protected Class<EnterpriseProject> getEntityClass() {
        return EnterpriseProject.class;
    }

    @Override
    @Nonnull
    protected String getFunctionName() {
        return "SetProcessingStatus";
    }

    @Override
    @Nonnull
    protected Map<String, Object> getParameters() {
        return values;
    }

    @Override
    @Nonnull
    protected HttpUriRequest createRequest(
        @Nonnull
        final URI uri) {
        return new HttpPost(uri);
    }

    @Override
    @Nullable
    public EnterpriseProject execute(
        @Nonnull
        final ErpConfigContext configContext)
        throws ODataException
    {
        return super.executeSingle(configContext);
    }

}
