/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import java.util.UUID;
import javax.annotation.Nonnull;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVAByKeyFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVAFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVAUpdateFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectByKeyFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectCreateFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectDeleteFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementByKeyFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementCreateFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementDeleteFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementUpdateFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVAByKeyFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVAFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVAUpdateFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectUpdateFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.SetProcessingStatusFluentHelper;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.SetProjElemProcessingStatusFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>EnterpriseProjectCreateReadUpdateDelete</td></tr></table>
 * 
 */
public interface EnterpriseProjectCreateReadUpdateDeleteService {

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "/apihub_sandbox/s4hanacloud/sap/opu/odata/sap/API_ENTERPRISE_PROJECT_SRV/EnterpriseProjectCreateReadUpdateDelete";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    EnterpriseProjectCreateReadUpdateDeleteService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch multiple {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectFluentHelper getAllEnterpriseProject();

    /**
     * Fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity using key fields.
     * 
     * @param projectUUID
     *     Entity Guid<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectByKeyFluentHelper getEnterpriseProjectByKey(final UUID projectUUID);

    /**
     * Create a new {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity and save it to the S/4HANA system.
     * 
     * @param enterpriseProject
     *     {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectCreateFluentHelper createEnterpriseProject(
        @Nonnull
        final EnterpriseProject enterpriseProject);

    /**
     * Update an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity and save it to the S/4HANA system.
     * 
     * @param enterpriseProject
     *     {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectUpdateFluentHelper updateEnterpriseProject(
        @Nonnull
        final EnterpriseProject enterpriseProject);

    /**
     * Deletes an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity in the S/4HANA system.
     * 
     * @param enterpriseProject
     *     {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProject EnterpriseProject} entity. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectDeleteFluentHelper deleteEnterpriseProject(
        @Nonnull
        final EnterpriseProject enterpriseProject);

    /**
     * Fetch multiple {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectElementFluentHelper getAllEnterpriseProjectElement();

    /**
     * Fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity using key fields.
     * 
     * @param projectElementUUID
     *     Entity Guid<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectElementByKeyFluentHelper getEnterpriseProjectElementByKey(final UUID projectElementUUID);

    /**
     * Create a new {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity and save it to the S/4HANA system.
     * 
     * @param enterpriseProjectElement
     *     {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectElementCreateFluentHelper createEnterpriseProjectElement(
        @Nonnull
        final EnterpriseProjectElement enterpriseProjectElement);

    /**
     * Update an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity and save it to the S/4HANA system.
     * 
     * @param enterpriseProjectElement
     *     {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectElementUpdateFluentHelper updateEnterpriseProjectElement(
        @Nonnull
        final EnterpriseProjectElement enterpriseProjectElement);

    /**
     * Deletes an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity in the S/4HANA system.
     * 
     * @param enterpriseProjectElement
     *     {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement} entity. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElementDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectElementDeleteFluentHelper deleteEnterpriseProjectElement(
        @Nonnull
        final EnterpriseProjectElement enterpriseProjectElement);

    /**
     * Fetch multiple {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVAFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectJVAFluentHelper getAllEnterpriseProjectJVA();

    /**
     * Fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entity using key fields.
     * 
     * @param projectUUID
     *     Entity Guid<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVAByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectJVAByKeyFluentHelper getEnterpriseProjectJVAByKey(final UUID projectUUID);

    /**
     * Update an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entity and save it to the S/4HANA system.
     * 
     * @param enterpriseProjectJVA
     *     {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVA EnterpriseProjectJVA} entity. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectJVAUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EnterpriseProjectJVAUpdateFluentHelper updateEnterpriseProjectJVA(
        @Nonnull
        final EnterpriseProjectJVA enterpriseProjectJVA);

    /**
     * Fetch multiple {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA EntProjectElementJVA} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA EntProjectElementJVA} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVAFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EntProjectElementJVAFluentHelper getAllEntProjectElementJVA();

    /**
     * Fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA EntProjectElementJVA} entity using key fields.
     * 
     * @param projectElementUUID
     *     Entity Guid<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA EntProjectElementJVA} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVAByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EntProjectElementJVAByKeyFluentHelper getEntProjectElementJVAByKey(final UUID projectElementUUID);

    /**
     * Update an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA EntProjectElementJVA} entity and save it to the S/4HANA system.
     * 
     * @param entProjectElementJVA
     *     {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA EntProjectElementJVA} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA EntProjectElementJVA} entity. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVAUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    EntProjectElementJVAUpdateFluentHelper updateEntProjectElementJVA(
        @Nonnull
        final EntProjectElementJVA entProjectElementJVA);

    /**
     * <p>Creates a fluent helper for the <b>SetProcessingStatus</b> OData function import.</p>
     * 
     * @param processingStatus
     *     Constraints: Nullable, Maximum length: 2<p>Original parameter name from the Odata EDM: <b>ProcessingStatus</b></p>
     * @param projectUUID
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>ProjectUUID</b></p>
     * @return
     *     A fluent helper object that will execute the <b>SetProcessingStatus</b> OData function import with the provided parameters. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.SetProcessingStatusFluentHelper#execute execute} method on the fluent helper object.
     */
    @Nonnull
    SetProcessingStatusFluentHelper setProcessingStatus(final UUID projectUUID, final String processingStatus);

    /**
     * <p>Creates a fluent helper for the <b>SetProjElemProcessingStatus</b> OData function import.</p>
     * 
     * @param processingStatus
     *     Constraints: Nullable, Maximum length: 2<p>Original parameter name from the Odata EDM: <b>ProcessingStatus</b></p>
     * @param projectElementUUID
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>ProjectElementUUID</b></p>
     * @return
     *     A fluent helper object that will execute the <b>SetProjElemProcessingStatus</b> OData function import with the provided parameters. To perform execution, call the {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.SetProjElemProcessingStatusFluentHelper#execute execute} method on the fluent helper object.
     */
    @Nonnull
    SetProjElemProcessingStatusFluentHelper setProjElemProcessingStatus(final UUID projectElementUUID, final String processingStatus);

}
