/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.field.EnterpriseProjectField;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.link.EnterpriseProjectLink;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.link.EnterpriseProjectOneToOneLink;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.selectable.EnterpriseProjectSelectable;


/**
 * Appl. Interface for Enterprise Project<p></p><p>Original entity name from the Odata EDM: <b>A_EnterpriseProjectType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class EnterpriseProject
    extends VdmEntity<EnterpriseProject>
{

    /**
     * Selector for all available fields of EnterpriseProject.
     * 
     */
    public final static EnterpriseProjectSelectable ALL_FIELDS = new EnterpriseProjectSelectable() {


        @Nonnull
        @Override
        public String getFieldName() {
            return "*";
        }

        @Nonnull
        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>ProjectUUID</b></p>
     * 
     * @param projectUUID
     *     
     * @return
     *     Entity Guid
     */
    @Key
    @SerializedName("ProjectUUID")
    @JsonProperty("ProjectUUID")
    @Nullable
    @ODataField(odataName = "ProjectUUID")
    private UUID projectUUID;
    /**
     * Use with available fluent helpers to apply the <b>ProjectUUID</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<UUID> PROJECT_UUID = new EnterpriseProjectField<UUID>("ProjectUUID");
    /**
     * Constraints: Not nullable, Maximum length: 24 <p>Original property name from the Odata EDM: <b>ProjectInternalID</b></p>
     * 
     * @param projectInternalID
     *     
     * @return
     *     Project (internal)
     */
    @SerializedName("ProjectInternalID")
    @JsonProperty("ProjectInternalID")
    @Nullable
    @ODataField(odataName = "ProjectInternalID")
    private String projectInternalID;
    /**
     * Use with available fluent helpers to apply the <b>ProjectInternalID</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> PROJECT_INTERNAL_ID = new EnterpriseProjectField<String>("ProjectInternalID");
    /**
     * Constraints: Not nullable, Maximum length: 24 <p>Original property name from the Odata EDM: <b>Project</b></p>
     * 
     * @param project
     *     
     * @return
     *     Identification of Entities
     */
    @SerializedName("Project")
    @JsonProperty("Project")
    @Nullable
    @ODataField(odataName = "Project")
    private String project;
    /**
     * Use with available fluent helpers to apply the <b>Project</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> PROJECT = new EnterpriseProjectField<String>("Project");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>ProjectDescription</b></p>
     * 
     * @param projectDescription
     *     
     * @return
     *     Language-Dependent Description
     */
    @SerializedName("ProjectDescription")
    @JsonProperty("ProjectDescription")
    @Nullable
    @ODataField(odataName = "ProjectDescription")
    private String projectDescription;
    /**
     * Use with available fluent helpers to apply the <b>ProjectDescription</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> PROJECT_DESCRIPTION = new EnterpriseProjectField<String>("ProjectDescription");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>EnterpriseProjectType</b></p>
     * 
     * @param enterpriseProjectType
     *     
     * @return
     *     Project type
     */
    @SerializedName("EnterpriseProjectType")
    @JsonProperty("EnterpriseProjectType")
    @Nullable
    @ODataField(odataName = "EnterpriseProjectType")
    private String enterpriseProjectType;
    /**
     * Use with available fluent helpers to apply the <b>EnterpriseProjectType</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> ENTERPRISE_PROJECT_TYPE = new EnterpriseProjectField<String>("EnterpriseProjectType");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PriorityCode</b></p>
     * 
     * @param priorityCode
     *     
     * @return
     *     Priority
     */
    @SerializedName("PriorityCode")
    @JsonProperty("PriorityCode")
    @Nullable
    @ODataField(odataName = "PriorityCode")
    private String priorityCode;
    /**
     * Use with available fluent helpers to apply the <b>PriorityCode</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> PRIORITY_CODE = new EnterpriseProjectField<String>("PriorityCode");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ProjectStartDate</b></p>
     * 
     * @param projectStartDate
     *     
     */
    @SerializedName("ProjectStartDate")
    @JsonProperty("ProjectStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ProjectStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime projectStartDate;
    /**
     * Use with available fluent helpers to apply the <b>ProjectStartDate</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<LocalDateTime> PROJECT_START_DATE = new EnterpriseProjectField<LocalDateTime>("ProjectStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ProjectEndDate</b></p>
     * 
     * @param projectEndDate
     *     
     */
    @SerializedName("ProjectEndDate")
    @JsonProperty("ProjectEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ProjectEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime projectEndDate;
    /**
     * Use with available fluent helpers to apply the <b>ProjectEndDate</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<LocalDateTime> PROJECT_END_DATE = new EnterpriseProjectField<LocalDateTime>("ProjectEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ProcessingStatus</b></p>
     * 
     * @param processingStatus
     *     
     * @return
     *     Object Processing Status
     */
    @SerializedName("ProcessingStatus")
    @JsonProperty("ProcessingStatus")
    @Nullable
    @ODataField(odataName = "ProcessingStatus")
    private String processingStatus;
    /**
     * Use with available fluent helpers to apply the <b>ProcessingStatus</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> PROCESSING_STATUS = new EnterpriseProjectField<String>("ProcessingStatus");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>ResponsibleCostCenter</b></p>
     * 
     * @param responsibleCostCenter
     *     
     * @return
     *     Responsible Cost Center
     */
    @SerializedName("ResponsibleCostCenter")
    @JsonProperty("ResponsibleCostCenter")
    @Nullable
    @ODataField(odataName = "ResponsibleCostCenter")
    private String responsibleCostCenter;
    /**
     * Use with available fluent helpers to apply the <b>ResponsibleCostCenter</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> RESPONSIBLE_COST_CENTER = new EnterpriseProjectField<String>("ResponsibleCostCenter");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>ProfitCenter</b></p>
     * 
     * @param profitCenter
     *     
     * @return
     *     Profit Center
     */
    @SerializedName("ProfitCenter")
    @JsonProperty("ProfitCenter")
    @Nullable
    @ODataField(odataName = "ProfitCenter")
    private String profitCenter;
    /**
     * Use with available fluent helpers to apply the <b>ProfitCenter</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> PROFIT_CENTER = new EnterpriseProjectField<String>("ProfitCenter");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ProjectManagerUUID</b></p>
     * 
     * @param projectManagerUUID
     *     
     */
    @SerializedName("ProjectManagerUUID")
    @JsonProperty("ProjectManagerUUID")
    @Nullable
    @ODataField(odataName = "ProjectManagerUUID")
    private UUID projectManagerUUID;
    /**
     * Use with available fluent helpers to apply the <b>ProjectManagerUUID</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<UUID> PROJECT_MANAGER_UUID = new EnterpriseProjectField<UUID>("ProjectManagerUUID");
    /**
     * Constraints: Not nullable, Maximum length: 7 <p>Original property name from the Odata EDM: <b>ProjectProfileCode</b></p>
     * 
     * @param projectProfileCode
     *     
     * @return
     *     Project Profile
     */
    @SerializedName("ProjectProfileCode")
    @JsonProperty("ProjectProfileCode")
    @Nullable
    @ODataField(odataName = "ProjectProfileCode")
    private String projectProfileCode;
    /**
     * Use with available fluent helpers to apply the <b>ProjectProfileCode</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> PROJECT_PROFILE_CODE = new EnterpriseProjectField<String>("ProjectProfileCode");
    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>FunctionalArea</b></p>
     * 
     * @param functionalArea
     *     
     * @return
     *     Functional Area
     */
    @SerializedName("FunctionalArea")
    @JsonProperty("FunctionalArea")
    @Nullable
    @ODataField(odataName = "FunctionalArea")
    private String functionalArea;
    /**
     * Use with available fluent helpers to apply the <b>FunctionalArea</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> FUNCTIONAL_AREA = new EnterpriseProjectField<String>("FunctionalArea");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CompanyCode</b></p>
     * 
     * @param companyCode
     *     
     * @return
     *     Company Code
     */
    @SerializedName("CompanyCode")
    @JsonProperty("CompanyCode")
    @Nullable
    @ODataField(odataName = "CompanyCode")
    private String companyCode;
    /**
     * Use with available fluent helpers to apply the <b>CompanyCode</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> COMPANY_CODE = new EnterpriseProjectField<String>("CompanyCode");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>ControllingArea</b></p>
     * 
     * @param controllingArea
     *     
     * @return
     *     Controlling Area
     */
    @SerializedName("ControllingArea")
    @JsonProperty("ControllingArea")
    @Nullable
    @ODataField(odataName = "ControllingArea")
    private String controllingArea;
    /**
     * Use with available fluent helpers to apply the <b>ControllingArea</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> CONTROLLING_AREA = new EnterpriseProjectField<String>("ControllingArea");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>Plant</b></p>
     * 
     * @param plant
     *     
     * @return
     *     Plant
     */
    @SerializedName("Plant")
    @JsonProperty("Plant")
    @Nullable
    @ODataField(odataName = "Plant")
    private String plant;
    /**
     * Use with available fluent helpers to apply the <b>Plant</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> PLANT = new EnterpriseProjectField<String>("Plant");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Location</b></p>
     * 
     * @param location
     *     
     * @return
     *     Location
     */
    @SerializedName("Location")
    @JsonProperty("Location")
    @Nullable
    @ODataField(odataName = "Location")
    private String location;
    /**
     * Use with available fluent helpers to apply the <b>Location</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<String> LOCATION = new EnterpriseProjectField<String>("Location");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastChangeDateTime</b></p>
     * 
     * @param lastChangeDateTime
     *     
     * @return
     *     Date on which object was last changed
     */
    @SerializedName("LastChangeDateTime")
    @JsonProperty("LastChangeDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "LastChangeDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime lastChangeDateTime;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeDateTime</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectField<ZonedDateTime> LAST_CHANGE_DATE_TIME = new EnterpriseProjectField<ZonedDateTime>("LastChangeDateTime");
    /**
     * Convienence field for reusing the same ERP system context with multiple queries (e.g. fetching associated entities).
     * 
     * @param erpConfigContext
     *     
     * @return
     *     The stored ERP system context for executing queries, or null if no such context has been set.
     */
    @JsonIgnore
    @Nullable
    private transient ErpConfigContext erpConfigContext;
    /**
     * Navigation property <b>to_EnterpriseProjectElement</b> for <b>EnterpriseProject</b> to multiple <b>EnterpriseProjectElement</b>.
     * 
     */
    @SerializedName("to_EnterpriseProjectElement")
    @JsonProperty("to_EnterpriseProjectElement")
    @ODataField(odataName = "to_EnterpriseProjectElement")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<EnterpriseProjectElement> toEnterpriseProjectElement;
    /**
     * Navigation property <b>to_EnterpriseProjectJVA</b> for <b>EnterpriseProject</b> to single <b>EnterpriseProjectJVA</b>.
     * 
     */
    @SerializedName("to_EnterpriseProjectJVA")
    @JsonProperty("to_EnterpriseProjectJVA")
    @ODataField(odataName = "to_EnterpriseProjectJVA")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private EnterpriseProjectJVA toEnterpriseProjectJVA;
    /**
     * Use with available fluent helpers to apply the <b>to_EnterpriseProjectElement</b> navigation property to query operations.
     * 
     */
    public final static EnterpriseProjectLink<EnterpriseProjectElement> TO_ENTERPRISE_PROJECT_ELEMENT = new EnterpriseProjectLink<EnterpriseProjectElement>("to_EnterpriseProjectElement");
    /**
     * Use with available fluent helpers to apply the <b>to_EnterpriseProjectJVA</b> navigation property to query operations.
     * 
     */
    public final static EnterpriseProjectOneToOneLink<EnterpriseProjectJVA> TO_ENTERPRISE_PROJECT_JVA = new EnterpriseProjectOneToOneLink<EnterpriseProjectJVA>("to_EnterpriseProjectJVA");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<EnterpriseProject> getType() {
        return EnterpriseProject.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>ProjectUUID</b></p>
     * 
     * @param projectUUID
     *     Entity Guid
     */
    public void setProjectUUID(
        @Nullable
        final UUID projectUUID) {
        rememberChangedField("ProjectUUID", this.projectUUID);
        this.projectUUID = projectUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 24 <p>Original property name from the Odata EDM: <b>ProjectInternalID</b></p>
     * 
     * @param projectInternalID
     *     Project (internal)
     */
    public void setProjectInternalID(
        @Nullable
        final String projectInternalID) {
        rememberChangedField("ProjectInternalID", this.projectInternalID);
        this.projectInternalID = projectInternalID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 24 <p>Original property name from the Odata EDM: <b>Project</b></p>
     * 
     * @param project
     *     Identification of Entities
     */
    public void setProject(
        @Nullable
        final String project) {
        rememberChangedField("Project", this.project);
        this.project = project;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>ProjectDescription</b></p>
     * 
     * @param projectDescription
     *     Language-Dependent Description
     */
    public void setProjectDescription(
        @Nullable
        final String projectDescription) {
        rememberChangedField("ProjectDescription", this.projectDescription);
        this.projectDescription = projectDescription;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>EnterpriseProjectType</b></p>
     * 
     * @param enterpriseProjectType
     *     Project type
     */
    public void setEnterpriseProjectType(
        @Nullable
        final String enterpriseProjectType) {
        rememberChangedField("EnterpriseProjectType", this.enterpriseProjectType);
        this.enterpriseProjectType = enterpriseProjectType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PriorityCode</b></p>
     * 
     * @param priorityCode
     *     Priority
     */
    public void setPriorityCode(
        @Nullable
        final String priorityCode) {
        rememberChangedField("PriorityCode", this.priorityCode);
        this.priorityCode = priorityCode;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ProjectStartDate</b></p>
     * 
     * @param projectStartDate
     *     
     */
    public void setProjectStartDate(
        @Nullable
        final LocalDateTime projectStartDate) {
        rememberChangedField("ProjectStartDate", this.projectStartDate);
        this.projectStartDate = projectStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ProjectEndDate</b></p>
     * 
     * @param projectEndDate
     *     
     */
    public void setProjectEndDate(
        @Nullable
        final LocalDateTime projectEndDate) {
        rememberChangedField("ProjectEndDate", this.projectEndDate);
        this.projectEndDate = projectEndDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ProcessingStatus</b></p>
     * 
     * @param processingStatus
     *     Object Processing Status
     */
    public void setProcessingStatus(
        @Nullable
        final String processingStatus) {
        rememberChangedField("ProcessingStatus", this.processingStatus);
        this.processingStatus = processingStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>ResponsibleCostCenter</b></p>
     * 
     * @param responsibleCostCenter
     *     Responsible Cost Center
     */
    public void setResponsibleCostCenter(
        @Nullable
        final String responsibleCostCenter) {
        rememberChangedField("ResponsibleCostCenter", this.responsibleCostCenter);
        this.responsibleCostCenter = responsibleCostCenter;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>ProfitCenter</b></p>
     * 
     * @param profitCenter
     *     Profit Center
     */
    public void setProfitCenter(
        @Nullable
        final String profitCenter) {
        rememberChangedField("ProfitCenter", this.profitCenter);
        this.profitCenter = profitCenter;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ProjectManagerUUID</b></p>
     * 
     * @param projectManagerUUID
     *     
     */
    public void setProjectManagerUUID(
        @Nullable
        final UUID projectManagerUUID) {
        rememberChangedField("ProjectManagerUUID", this.projectManagerUUID);
        this.projectManagerUUID = projectManagerUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 7 <p>Original property name from the Odata EDM: <b>ProjectProfileCode</b></p>
     * 
     * @param projectProfileCode
     *     Project Profile
     */
    public void setProjectProfileCode(
        @Nullable
        final String projectProfileCode) {
        rememberChangedField("ProjectProfileCode", this.projectProfileCode);
        this.projectProfileCode = projectProfileCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>FunctionalArea</b></p>
     * 
     * @param functionalArea
     *     Functional Area
     */
    public void setFunctionalArea(
        @Nullable
        final String functionalArea) {
        rememberChangedField("FunctionalArea", this.functionalArea);
        this.functionalArea = functionalArea;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CompanyCode</b></p>
     * 
     * @param companyCode
     *     Company Code
     */
    public void setCompanyCode(
        @Nullable
        final String companyCode) {
        rememberChangedField("CompanyCode", this.companyCode);
        this.companyCode = companyCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>ControllingArea</b></p>
     * 
     * @param controllingArea
     *     Controlling Area
     */
    public void setControllingArea(
        @Nullable
        final String controllingArea) {
        rememberChangedField("ControllingArea", this.controllingArea);
        this.controllingArea = controllingArea;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>Plant</b></p>
     * 
     * @param plant
     *     Plant
     */
    public void setPlant(
        @Nullable
        final String plant) {
        rememberChangedField("Plant", this.plant);
        this.plant = plant;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Location</b></p>
     * 
     * @param location
     *     Location
     */
    public void setLocation(
        @Nullable
        final String location) {
        rememberChangedField("Location", this.location);
        this.location = location;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastChangeDateTime</b></p>
     * 
     * @param lastChangeDateTime
     *     Date on which object was last changed
     */
    public void setLastChangeDateTime(
        @Nullable
        final ZonedDateTime lastChangeDateTime) {
        rememberChangedField("LastChangeDateTime", this.lastChangeDateTime);
        this.lastChangeDateTime = lastChangeDateTime;
    }

    @Override
    protected String getEntityCollection() {
        return "A_EnterpriseProject";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("ProjectUUID", getProjectUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("ProjectUUID", getProjectUUID());
        values.put("ProjectInternalID", getProjectInternalID());
        values.put("Project", getProject());
        values.put("ProjectDescription", getProjectDescription());
        values.put("EnterpriseProjectType", getEnterpriseProjectType());
        values.put("PriorityCode", getPriorityCode());
        values.put("ProjectStartDate", getProjectStartDate());
        values.put("ProjectEndDate", getProjectEndDate());
        values.put("ProcessingStatus", getProcessingStatus());
        values.put("ResponsibleCostCenter", getResponsibleCostCenter());
        values.put("ProfitCenter", getProfitCenter());
        values.put("ProjectManagerUUID", getProjectManagerUUID());
        values.put("ProjectProfileCode", getProjectProfileCode());
        values.put("FunctionalArea", getFunctionalArea());
        values.put("CompanyCode", getCompanyCode());
        values.put("ControllingArea", getControllingArea());
        values.put("Plant", getPlant());
        values.put("Location", getLocation());
        values.put("LastChangeDateTime", getLastChangeDateTime());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("ProjectUUID")) {
                final Object value = values.remove("ProjectUUID");
                if ((value == null)||(!value.equals(getProjectUUID()))) {
                    setProjectUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProjectInternalID")) {
                final Object value = values.remove("ProjectInternalID");
                if ((value == null)||(!value.equals(getProjectInternalID()))) {
                    setProjectInternalID(((String) value));
                }
            }
            if (values.containsKey("Project")) {
                final Object value = values.remove("Project");
                if ((value == null)||(!value.equals(getProject()))) {
                    setProject(((String) value));
                }
            }
            if (values.containsKey("ProjectDescription")) {
                final Object value = values.remove("ProjectDescription");
                if ((value == null)||(!value.equals(getProjectDescription()))) {
                    setProjectDescription(((String) value));
                }
            }
            if (values.containsKey("EnterpriseProjectType")) {
                final Object value = values.remove("EnterpriseProjectType");
                if ((value == null)||(!value.equals(getEnterpriseProjectType()))) {
                    setEnterpriseProjectType(((String) value));
                }
            }
            if (values.containsKey("PriorityCode")) {
                final Object value = values.remove("PriorityCode");
                if ((value == null)||(!value.equals(getPriorityCode()))) {
                    setPriorityCode(((String) value));
                }
            }
            if (values.containsKey("ProjectStartDate")) {
                final Object value = values.remove("ProjectStartDate");
                if ((value == null)||(!value.equals(getProjectStartDate()))) {
                    setProjectStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ProjectEndDate")) {
                final Object value = values.remove("ProjectEndDate");
                if ((value == null)||(!value.equals(getProjectEndDate()))) {
                    setProjectEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ProcessingStatus")) {
                final Object value = values.remove("ProcessingStatus");
                if ((value == null)||(!value.equals(getProcessingStatus()))) {
                    setProcessingStatus(((String) value));
                }
            }
            if (values.containsKey("ResponsibleCostCenter")) {
                final Object value = values.remove("ResponsibleCostCenter");
                if ((value == null)||(!value.equals(getResponsibleCostCenter()))) {
                    setResponsibleCostCenter(((String) value));
                }
            }
            if (values.containsKey("ProfitCenter")) {
                final Object value = values.remove("ProfitCenter");
                if ((value == null)||(!value.equals(getProfitCenter()))) {
                    setProfitCenter(((String) value));
                }
            }
            if (values.containsKey("ProjectManagerUUID")) {
                final Object value = values.remove("ProjectManagerUUID");
                if ((value == null)||(!value.equals(getProjectManagerUUID()))) {
                    setProjectManagerUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProjectProfileCode")) {
                final Object value = values.remove("ProjectProfileCode");
                if ((value == null)||(!value.equals(getProjectProfileCode()))) {
                    setProjectProfileCode(((String) value));
                }
            }
            if (values.containsKey("FunctionalArea")) {
                final Object value = values.remove("FunctionalArea");
                if ((value == null)||(!value.equals(getFunctionalArea()))) {
                    setFunctionalArea(((String) value));
                }
            }
            if (values.containsKey("CompanyCode")) {
                final Object value = values.remove("CompanyCode");
                if ((value == null)||(!value.equals(getCompanyCode()))) {
                    setCompanyCode(((String) value));
                }
            }
            if (values.containsKey("ControllingArea")) {
                final Object value = values.remove("ControllingArea");
                if ((value == null)||(!value.equals(getControllingArea()))) {
                    setControllingArea(((String) value));
                }
            }
            if (values.containsKey("Plant")) {
                final Object value = values.remove("Plant");
                if ((value == null)||(!value.equals(getPlant()))) {
                    setPlant(((String) value));
                }
            }
            if (values.containsKey("Location")) {
                final Object value = values.remove("Location");
                if ((value == null)||(!value.equals(getLocation()))) {
                    setLocation(((String) value));
                }
            }
            if (values.containsKey("LastChangeDateTime")) {
                final Object value = values.remove("LastChangeDateTime");
                if ((value == null)||(!value.equals(getLastChangeDateTime()))) {
                    setLastChangeDateTime(((ZonedDateTime) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_EnterpriseProjectElement")) {
                final Object value = (values).remove("to_EnterpriseProjectElement");
                if (value instanceof Iterable) {
                    if (toEnterpriseProjectElement == null) {
                        toEnterpriseProjectElement = Lists.newArrayList();
                    } else {
                        toEnterpriseProjectElement = Lists.newArrayList(toEnterpriseProjectElement);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        EnterpriseProjectElement entity;
                        if (toEnterpriseProjectElement.size()>i) {
                            entity = toEnterpriseProjectElement.get(i);
                        } else {
                            entity = new EnterpriseProjectElement();
                            toEnterpriseProjectElement.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_EnterpriseProjectJVA")) {
                final Object value = (values).remove("to_EnterpriseProjectJVA");
                if (value instanceof Map) {
                    if (toEnterpriseProjectJVA == null) {
                        toEnterpriseProjectJVA = new EnterpriseProjectJVA();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toEnterpriseProjectJVA.fromMap(inputMap);
                }
            }
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >EnterpriseProjectField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new EnterpriseProjectField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >EnterpriseProjectField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new EnterpriseProjectField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toEnterpriseProjectElement!= null) {
            (values).put("to_EnterpriseProjectElement", toEnterpriseProjectElement);
        }
        if (toEnterpriseProjectJVA!= null) {
            (values).put("to_EnterpriseProjectJVA", toEnterpriseProjectJVA);
        }
        return values;
    }

    /**
     * Fetches the <b>EnterpriseProjectElement</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_EnterpriseProjectElement</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>EnterpriseProjectElement</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<EnterpriseProjectElement> fetchEnterpriseProjectElement()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type EnterpriseProjectElement.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("ProjectUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(projectUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_EnterpriseProjectElement");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<EnterpriseProjectElement> entityList = result.asList(EnterpriseProjectElement.class);
        for (EnterpriseProjectElement entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>EnterpriseProjectElement</b> entities (one to many). This corresponds to the OData navigation property <b>to_EnterpriseProjectElement</b>.
     * <p>
     * If the navigation property <b>to_EnterpriseProjectElement</b> of a queried <b>EnterpriseProject</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>EnterpriseProjectElement</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<EnterpriseProjectElement> getEnterpriseProjectElementOrFetch()
        throws ODataException
    {
        if (toEnterpriseProjectElement == null) {
            toEnterpriseProjectElement = fetchEnterpriseProjectElement();
        }
        return toEnterpriseProjectElement;
    }

    /**
     * Retrieval of associated <b>EnterpriseProjectElement</b> entities (one to many). This corresponds to the OData navigation property <b>to_EnterpriseProjectElement</b>.
     * <p>
     * If the navigation property for an entity <b>EnterpriseProject</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_EnterpriseProjectElement</b> is already loaded, the result will contain the <b>EnterpriseProjectElement</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<EnterpriseProjectElement>> getEnterpriseProjectElementIfPresent() {
        return Optional.ofNullable(toEnterpriseProjectElement);
    }

    /**
     * Overwrites the list of associated <b>EnterpriseProjectElement</b> entities for the loaded navigation property <b>to_EnterpriseProjectElement</b>.
     * <p>
     * If the navigation property <b>to_EnterpriseProjectElement</b> of a queried <b>EnterpriseProject</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>EnterpriseProjectElement</b> entities.
     */
    public void setEnterpriseProjectElement(
        @Nonnull
        final List<EnterpriseProjectElement> value) {
        if (toEnterpriseProjectElement == null) {
            toEnterpriseProjectElement = Lists.newArrayList();
        }
        toEnterpriseProjectElement.clear();
        toEnterpriseProjectElement.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>EnterpriseProjectElement</b> entities. This corresponds to the OData navigation property <b>to_EnterpriseProjectElement</b>.
     * <p>
     * If the navigation property <b>to_EnterpriseProjectElement</b> of a queried <b>EnterpriseProject</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>EnterpriseProjectElement</b> entities.
     */
    public void addEnterpriseProjectElement(EnterpriseProjectElement... entity) {
        if (toEnterpriseProjectElement == null) {
            toEnterpriseProjectElement = Lists.newArrayList();
        }
        toEnterpriseProjectElement.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>EnterpriseProjectJVA</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_EnterpriseProjectJVA</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>EnterpriseProjectJVA</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public EnterpriseProjectJVA fetchEnterpriseProjectJVA()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type EnterpriseProjectJVA.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("ProjectUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(projectUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_EnterpriseProjectJVA");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final EnterpriseProjectJVA entity = result.as(EnterpriseProjectJVA.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>EnterpriseProjectJVA</b> entity (one to one). This corresponds to the OData navigation property <b>to_EnterpriseProjectJVA</b>.
     * <p>
     * If the navigation property <b>to_EnterpriseProjectJVA</b> of a queried <b>EnterpriseProject</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>EnterpriseProjectJVA</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public EnterpriseProjectJVA getEnterpriseProjectJVAOrFetch()
        throws ODataException
    {
        if (toEnterpriseProjectJVA == null) {
            toEnterpriseProjectJVA = fetchEnterpriseProjectJVA();
        }
        return toEnterpriseProjectJVA;
    }

    /**
     * Retrieval of associated <b>EnterpriseProjectJVA</b> entity (one to one). This corresponds to the OData navigation property <b>to_EnterpriseProjectJVA</b>.
     * <p>
     * If the navigation property for an entity <b>EnterpriseProject</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_EnterpriseProjectJVA</b> is already loaded, the result will contain the <b>EnterpriseProjectJVA</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<EnterpriseProjectJVA> getEnterpriseProjectJVAIfPresent() {
        return Optional.ofNullable(toEnterpriseProjectJVA);
    }

    /**
     * Overwrites the associated <b>EnterpriseProjectJVA</b> entity for the loaded navigation property <b>to_EnterpriseProjectJVA</b>.
     * 
     * @param value
     *     New <b>EnterpriseProjectJVA</b> entity.
     */
    public void setEnterpriseProjectJVA(final EnterpriseProjectJVA value) {
        toEnterpriseProjectJVA = value;
    }

    public final static class EnterpriseProjectBuilder {

        private List<EnterpriseProjectElement> toEnterpriseProjectElement = Lists.newArrayList();
        private EnterpriseProjectJVA toEnterpriseProjectJVA;

        private EnterpriseProject.EnterpriseProjectBuilder toEnterpriseProjectElement(List<EnterpriseProjectElement> value) {
            toEnterpriseProjectElement.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_EnterpriseProjectElement</b> for <b>EnterpriseProject</b> to multiple <b>EnterpriseProjectElement</b>.
         * 
         */
        @Nonnull
        public EnterpriseProject.EnterpriseProjectBuilder enterpriseProjectElement(EnterpriseProjectElement... value) {
            return toEnterpriseProjectElement(Lists.newArrayList(value));
        }

        private EnterpriseProject.EnterpriseProjectBuilder toEnterpriseProjectJVA(EnterpriseProjectJVA value) {
            toEnterpriseProjectJVA = value;
            return this;
        }

        /**
         * Navigation property <b>to_EnterpriseProjectJVA</b> for <b>EnterpriseProject</b> to single <b>EnterpriseProjectJVA</b>.
         * 
         */
        @Nonnull
        public EnterpriseProject.EnterpriseProjectBuilder enterpriseProjectJVA(final EnterpriseProjectJVA value) {
            return toEnterpriseProjectJVA(value);
        }

    }

}
