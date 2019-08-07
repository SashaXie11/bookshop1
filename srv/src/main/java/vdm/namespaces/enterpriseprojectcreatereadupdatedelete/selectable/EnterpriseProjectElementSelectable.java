/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement EnterpriseProjectElement}. This interface is used by {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.field.EnterpriseProjectElementField EnterpriseProjectElementField} and {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.link.EnterpriseProjectElementLink EnterpriseProjectElementLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PROJECT_ELEMENT_UUID PROJECT_ELEMENT_UUID}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PROJECT_ELEMENT PROJECT_ELEMENT}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#WBS_ELEMENT_INTERNAL_ID WBS_ELEMENT_INTERNAL_ID}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PROJECT_UUID PROJECT_UUID}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PROJECT_ELEMENT_DESCRIPTION PROJECT_ELEMENT_DESCRIPTION}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PARENT_OBJECT_UUID PARENT_OBJECT_UUID}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PROCESSING_STATUS PROCESSING_STATUS}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#SORTING_NUMBER SORTING_NUMBER}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PLANNED_START_DATE PLANNED_START_DATE}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PLANNED_END_DATE PLANNED_END_DATE}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#RESPONSIBLE_COST_CENTER RESPONSIBLE_COST_CENTER}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#COMPANY_CODE COMPANY_CODE}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PROFIT_CENTER PROFIT_CENTER}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#FUNCTIONAL_AREA FUNCTIONAL_AREA}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#CONTROLLING_AREA CONTROLLING_AREA}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PLANT PLANT}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#LOCATION LOCATION}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#FACTORY_CALENDAR FACTORY_CALENDAR}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#COSTING_SHEET COSTING_SHEET}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#INVESTMENT_PROFILE INVESTMENT_PROFILE}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#WBS_IS_STATISTICAL_WBS_ELEMENT WBS_IS_STATISTICAL_WBS_ELEMENT}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#COST_CENTER COST_CENTER}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#CREATED_BY_USER CREATED_BY_USER}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#CREATION_DATE_TIME CREATION_DATE_TIME}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#LAST_CHANGE_DATE_TIME LAST_CHANGE_DATE_TIME}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#LAST_CHANGED_BY_USER LAST_CHANGED_BY_USER}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#PROJECT_LAST_CHANGED_DATE_TIME PROJECT_LAST_CHANGED_DATE_TIME}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#TO_ENTERPRISE_PROJECT TO_ENTERPRISE_PROJECT}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#TO_ENT_PROJECT_ELEMENT_JVA TO_ENT_PROJECT_ELEMENT_JVA}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#TO_PARENT_PROJ_ELEMENT TO_PARENT_PROJ_ELEMENT}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EnterpriseProjectElement#TO_SUB_PROJ_ELEMENT TO_SUB_PROJ_ELEMENT}</li>
 * </ul>
 * 
 */
public interface EnterpriseProjectElementSelectable
    extends EntitySelectable<EnterpriseProjectElement>
{


}
