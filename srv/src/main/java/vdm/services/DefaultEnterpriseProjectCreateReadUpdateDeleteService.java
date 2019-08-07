/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import java.util.UUID;
import javax.annotation.Nonnull;
import javax.inject.Named;
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
@Named("vdm.services.DefaultEnterpriseProjectCreateReadUpdateDeleteService")
public class DefaultEnterpriseProjectCreateReadUpdateDeleteService
    implements EnterpriseProjectCreateReadUpdateDeleteService
{

    @Nonnull
    private final String servicePath;

    /**
     * Creates a service using {@link EnterpriseProjectCreateReadUpdateDeleteService#DEFAULT_SERVICE_PATH} to send the requests.
     * 
     */
    public DefaultEnterpriseProjectCreateReadUpdateDeleteService() {
        servicePath = EnterpriseProjectCreateReadUpdateDeleteService.DEFAULT_SERVICE_PATH;
    }

    /**
     * Creates a service using the provided service path to send the requests.
     * <p>
     * Used by the fluent {@link #withServicePath(String)} method.
     * 
     */
    private DefaultEnterpriseProjectCreateReadUpdateDeleteService(
        @Nonnull
        final String servicePath) {
        this.servicePath = servicePath;
    }

    @Override
    @Nonnull
    public DefaultEnterpriseProjectCreateReadUpdateDeleteService withServicePath(
        @Nonnull
        final String servicePath) {
        return new DefaultEnterpriseProjectCreateReadUpdateDeleteService(servicePath);
    }

    @Override
    @Nonnull
    public EnterpriseProjectFluentHelper getAllEnterpriseProject() {
        return new EnterpriseProjectFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public EnterpriseProjectByKeyFluentHelper getEnterpriseProjectByKey(final UUID projectUUID) {
        return new EnterpriseProjectByKeyFluentHelper(servicePath, projectUUID);
    }

    @Override
    @Nonnull
    public EnterpriseProjectCreateFluentHelper createEnterpriseProject(
        @Nonnull
        final EnterpriseProject enterpriseProject) {
        return new EnterpriseProjectCreateFluentHelper(servicePath, enterpriseProject);
    }

    @Override
    @Nonnull
    public EnterpriseProjectUpdateFluentHelper updateEnterpriseProject(
        @Nonnull
        final EnterpriseProject enterpriseProject) {
        return new EnterpriseProjectUpdateFluentHelper(servicePath, enterpriseProject);
    }

    @Override
    @Nonnull
    public EnterpriseProjectDeleteFluentHelper deleteEnterpriseProject(
        @Nonnull
        final EnterpriseProject enterpriseProject) {
        return new EnterpriseProjectDeleteFluentHelper(servicePath, enterpriseProject);
    }

    @Override
    @Nonnull
    public EnterpriseProjectElementFluentHelper getAllEnterpriseProjectElement() {
        return new EnterpriseProjectElementFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public EnterpriseProjectElementByKeyFluentHelper getEnterpriseProjectElementByKey(final UUID projectElementUUID) {
        return new EnterpriseProjectElementByKeyFluentHelper(servicePath, projectElementUUID);
    }

    @Override
    @Nonnull
    public EnterpriseProjectElementCreateFluentHelper createEnterpriseProjectElement(
        @Nonnull
        final EnterpriseProjectElement enterpriseProjectElement) {
        return new EnterpriseProjectElementCreateFluentHelper(servicePath, enterpriseProjectElement);
    }

    @Override
    @Nonnull
    public EnterpriseProjectElementUpdateFluentHelper updateEnterpriseProjectElement(
        @Nonnull
        final EnterpriseProjectElement enterpriseProjectElement) {
        return new EnterpriseProjectElementUpdateFluentHelper(servicePath, enterpriseProjectElement);
    }

    @Override
    @Nonnull
    public EnterpriseProjectElementDeleteFluentHelper deleteEnterpriseProjectElement(
        @Nonnull
        final EnterpriseProjectElement enterpriseProjectElement) {
        return new EnterpriseProjectElementDeleteFluentHelper(servicePath, enterpriseProjectElement);
    }

    @Override
    @Nonnull
    public EnterpriseProjectJVAFluentHelper getAllEnterpriseProjectJVA() {
        return new EnterpriseProjectJVAFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public EnterpriseProjectJVAByKeyFluentHelper getEnterpriseProjectJVAByKey(final UUID projectUUID) {
        return new EnterpriseProjectJVAByKeyFluentHelper(servicePath, projectUUID);
    }

    @Override
    @Nonnull
    public EnterpriseProjectJVAUpdateFluentHelper updateEnterpriseProjectJVA(
        @Nonnull
        final EnterpriseProjectJVA enterpriseProjectJVA) {
        return new EnterpriseProjectJVAUpdateFluentHelper(servicePath, enterpriseProjectJVA);
    }

    @Override
    @Nonnull
    public EntProjectElementJVAFluentHelper getAllEntProjectElementJVA() {
        return new EntProjectElementJVAFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public EntProjectElementJVAByKeyFluentHelper getEntProjectElementJVAByKey(final UUID projectElementUUID) {
        return new EntProjectElementJVAByKeyFluentHelper(servicePath, projectElementUUID);
    }

    @Override
    @Nonnull
    public EntProjectElementJVAUpdateFluentHelper updateEntProjectElementJVA(
        @Nonnull
        final EntProjectElementJVA entProjectElementJVA) {
        return new EntProjectElementJVAUpdateFluentHelper(servicePath, entProjectElementJVA);
    }

    @Override
    @Nonnull
    public SetProcessingStatusFluentHelper setProcessingStatus(final UUID projectUUID, final String processingStatus) {
        return new SetProcessingStatusFluentHelper(servicePath, projectUUID, processingStatus);
    }

    @Override
    @Nonnull
    public SetProjElemProcessingStatusFluentHelper setProjElemProcessingStatus(final UUID projectElementUUID, final String processingStatus) {
        return new SetProjElemProcessingStatusFluentHelper(servicePath, projectElementUUID, processingStatus);
    }

}
