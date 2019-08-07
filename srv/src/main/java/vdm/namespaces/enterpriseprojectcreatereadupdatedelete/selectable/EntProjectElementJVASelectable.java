/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA EntProjectElementJVA}. This interface is used by {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.field.EntProjectElementJVAField EntProjectElementJVAField} and {@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.link.EntProjectElementJVALink EntProjectElementJVALink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#PROJECT_ELEMENT_UUID PROJECT_ELEMENT_UUID}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#PROJECT_UUID PROJECT_UUID}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#JOINT_VENTURE JOINT_VENTURE}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#JOINT_VENTURE_COST_RECOVERY_CODE JOINT_VENTURE_COST_RECOVERY_CODE}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#JOINT_VENTURE_EQUITY_TYPE JOINT_VENTURE_EQUITY_TYPE}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#JNT_VNTR_PROJECT_TYPE JNT_VNTR_PROJECT_TYPE}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#JNT_INTRST_BILLG_CLASS JNT_INTRST_BILLG_CLASS}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#JNT_INTRST_BILLG_SUB_CLASS JNT_INTRST_BILLG_SUB_CLASS}</li>
 * <li>{@link vdm.namespaces.enterpriseprojectcreatereadupdatedelete.EntProjectElementJVA#PROJECT_LAST_CHANGED_DATE_TIME PROJECT_LAST_CHANGED_DATE_TIME}</li>
 * </ul>
 * 
 */
public interface EntProjectElementJVASelectable
    extends EntitySelectable<EntProjectElementJVA>
{


}
