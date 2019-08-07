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
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.field.EnterpriseProjectElementField;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.link.EnterpriseProjectElementLink;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.link.EnterpriseProjectElementOneToOneLink;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.selectable.EnterpriseProjectElementSelectable;


/**
 * API for Enterpr. Project Elements<p></p><p>Original entity name from the Odata EDM: <b>A_EnterpriseProjectElementType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class EnterpriseProjectElement
    extends VdmEntity<EnterpriseProjectElement>
{

    /**
     * Selector for all available fields of EnterpriseProjectElement.
     * 
     */
    public final static EnterpriseProjectElementSelectable ALL_FIELDS = new EnterpriseProjectElementSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>ProjectElementUUID</b></p>
     * 
     * @param projectElementUUID
     *     
     * @return
     *     Entity Guid
     */
    @Key
    @SerializedName("ProjectElementUUID")
    @JsonProperty("ProjectElementUUID")
    @Nullable
    @ODataField(odataName = "ProjectElementUUID")
    private UUID projectElementUUID;
    /**
     * Use with available fluent helpers to apply the <b>ProjectElementUUID</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<UUID> PROJECT_ELEMENT_UUID = new EnterpriseProjectElementField<UUID>("ProjectElementUUID");
    /**
     * Constraints: Not nullable, Maximum length: 24 <p>Original property name from the Odata EDM: <b>ProjectElement</b></p>
     * 
     * @param projectElement
     *     
     * @return
     *     Identification of Entities
     */
    @SerializedName("ProjectElement")
    @JsonProperty("ProjectElement")
    @Nullable
    @ODataField(odataName = "ProjectElement")
    private String projectElement;
    /**
     * Use with available fluent helpers to apply the <b>ProjectElement</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> PROJECT_ELEMENT = new EnterpriseProjectElementField<String>("ProjectElement");
    /**
     * Constraints: Not nullable, Maximum length: 8 <p>Original property name from the Odata EDM: <b>WBSElementInternalID</b></p>
     * 
     * @param wBSElementInternalID
     *     
     * @return
     *     WBS Element
     */
    @SerializedName("WBSElementInternalID")
    @JsonProperty("WBSElementInternalID")
    @Nullable
    @ODataField(odataName = "WBSElementInternalID")
    private String wBSElementInternalID;
    /**
     * Use with available fluent helpers to apply the <b>WBSElementInternalID</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> WBS_ELEMENT_INTERNAL_ID = new EnterpriseProjectElementField<String>("WBSElementInternalID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ProjectUUID</b></p>
     * 
     * @param projectUUID
     *     
     * @return
     *     Entity Guid
     */
    @SerializedName("ProjectUUID")
    @JsonProperty("ProjectUUID")
    @Nullable
    @ODataField(odataName = "ProjectUUID")
    private UUID projectUUID;
    /**
     * Use with available fluent helpers to apply the <b>ProjectUUID</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<UUID> PROJECT_UUID = new EnterpriseProjectElementField<UUID>("ProjectUUID");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>ProjectElementDescription</b></p>
     * 
     * @param projectElementDescription
     *     
     * @return
     *     Project Name
     */
    @SerializedName("ProjectElementDescription")
    @JsonProperty("ProjectElementDescription")
    @Nullable
    @ODataField(odataName = "ProjectElementDescription")
    private String projectElementDescription;
    /**
     * Use with available fluent helpers to apply the <b>ProjectElementDescription</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> PROJECT_ELEMENT_DESCRIPTION = new EnterpriseProjectElementField<String>("ProjectElementDescription");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ParentObjectUUID</b></p>
     * 
     * @param parentObjectUUID
     *     
     * @return
     *     Entity Guid
     */
    @SerializedName("ParentObjectUUID")
    @JsonProperty("ParentObjectUUID")
    @Nullable
    @ODataField(odataName = "ParentObjectUUID")
    private UUID parentObjectUUID;
    /**
     * Use with available fluent helpers to apply the <b>ParentObjectUUID</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<UUID> PARENT_OBJECT_UUID = new EnterpriseProjectElementField<UUID>("ParentObjectUUID");
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
    public final static EnterpriseProjectElementField<String> PROCESSING_STATUS = new EnterpriseProjectElementField<String>("ProcessingStatus");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>SortingNumber</b></p>
     * 
     * @param sortingNumber
     *     
     * @return
     *     Sort Number
     */
    @SerializedName("SortingNumber")
    @JsonProperty("SortingNumber")
    @Nullable
    @ODataField(odataName = "SortingNumber")
    private String sortingNumber;
    /**
     * Use with available fluent helpers to apply the <b>SortingNumber</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> SORTING_NUMBER = new EnterpriseProjectElementField<String>("SortingNumber");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>PlannedStartDate</b></p>
     * 
     * @param plannedStartDate
     *     
     */
    @SerializedName("PlannedStartDate")
    @JsonProperty("PlannedStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "PlannedStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime plannedStartDate;
    /**
     * Use with available fluent helpers to apply the <b>PlannedStartDate</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<LocalDateTime> PLANNED_START_DATE = new EnterpriseProjectElementField<LocalDateTime>("PlannedStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>PlannedEndDate</b></p>
     * 
     * @param plannedEndDate
     *     
     */
    @SerializedName("PlannedEndDate")
    @JsonProperty("PlannedEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "PlannedEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime plannedEndDate;
    /**
     * Use with available fluent helpers to apply the <b>PlannedEndDate</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<LocalDateTime> PLANNED_END_DATE = new EnterpriseProjectElementField<LocalDateTime>("PlannedEndDate");
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
    public final static EnterpriseProjectElementField<String> RESPONSIBLE_COST_CENTER = new EnterpriseProjectElementField<String>("ResponsibleCostCenter");
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
    public final static EnterpriseProjectElementField<String> COMPANY_CODE = new EnterpriseProjectElementField<String>("CompanyCode");
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
    public final static EnterpriseProjectElementField<String> PROFIT_CENTER = new EnterpriseProjectElementField<String>("ProfitCenter");
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
    public final static EnterpriseProjectElementField<String> FUNCTIONAL_AREA = new EnterpriseProjectElementField<String>("FunctionalArea");
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
    public final static EnterpriseProjectElementField<String> CONTROLLING_AREA = new EnterpriseProjectElementField<String>("ControllingArea");
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
    public final static EnterpriseProjectElementField<String> PLANT = new EnterpriseProjectElementField<String>("Plant");
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
    public final static EnterpriseProjectElementField<String> LOCATION = new EnterpriseProjectElementField<String>("Location");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>FactoryCalendar</b></p>
     * 
     * @param factoryCalendar
     *     
     * @return
     *     Calendar
     */
    @SerializedName("FactoryCalendar")
    @JsonProperty("FactoryCalendar")
    @Nullable
    @ODataField(odataName = "FactoryCalendar")
    private String factoryCalendar;
    /**
     * Use with available fluent helpers to apply the <b>FactoryCalendar</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> FACTORY_CALENDAR = new EnterpriseProjectElementField<String>("FactoryCalendar");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>CostingSheet</b></p>
     * 
     * @param costingSheet
     *     
     * @return
     *     Costing Sheet
     */
    @SerializedName("CostingSheet")
    @JsonProperty("CostingSheet")
    @Nullable
    @ODataField(odataName = "CostingSheet")
    private String costingSheet;
    /**
     * Use with available fluent helpers to apply the <b>CostingSheet</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> COSTING_SHEET = new EnterpriseProjectElementField<String>("CostingSheet");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>InvestmentProfile</b></p>
     * 
     * @param investmentProfile
     *     
     * @return
     *     Investment Measure Profile
     */
    @SerializedName("InvestmentProfile")
    @JsonProperty("InvestmentProfile")
    @Nullable
    @ODataField(odataName = "InvestmentProfile")
    private String investmentProfile;
    /**
     * Use with available fluent helpers to apply the <b>InvestmentProfile</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> INVESTMENT_PROFILE = new EnterpriseProjectElementField<String>("InvestmentProfile");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>WBSIsStatisticalWBSElement</b></p>
     * 
     * @param wBSIsStatisticalWBSElement
     *     
     * @return
     *     Statistical WBS element
     */
    @SerializedName("WBSIsStatisticalWBSElement")
    @JsonProperty("WBSIsStatisticalWBSElement")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "WBSIsStatisticalWBSElement")
    private Boolean wBSIsStatisticalWBSElement;
    /**
     * Use with available fluent helpers to apply the <b>WBSIsStatisticalWBSElement</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<Boolean> WBS_IS_STATISTICAL_WBS_ELEMENT = new EnterpriseProjectElementField<Boolean>("WBSIsStatisticalWBSElement");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CostCenter</b></p>
     * 
     * @param costCenter
     *     
     * @return
     *     Cost center to which costs are actually posted
     */
    @SerializedName("CostCenter")
    @JsonProperty("CostCenter")
    @Nullable
    @ODataField(odataName = "CostCenter")
    private String costCenter;
    /**
     * Use with available fluent helpers to apply the <b>CostCenter</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> COST_CENTER = new EnterpriseProjectElementField<String>("CostCenter");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     
     * @return
     *     Created By
     */
    @SerializedName("CreatedByUser")
    @JsonProperty("CreatedByUser")
    @Nullable
    @ODataField(odataName = "CreatedByUser")
    private String createdByUser;
    /**
     * Use with available fluent helpers to apply the <b>CreatedByUser</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> CREATED_BY_USER = new EnterpriseProjectElementField<String>("CreatedByUser");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationDateTime</b></p>
     * 
     * @param creationDateTime
     *     
     * @return
     *     Timestamp of created object
     */
    @SerializedName("CreationDateTime")
    @JsonProperty("CreationDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "CreationDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime creationDateTime;
    /**
     * Use with available fluent helpers to apply the <b>CreationDateTime</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<ZonedDateTime> CREATION_DATE_TIME = new EnterpriseProjectElementField<ZonedDateTime>("CreationDateTime");
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
    public final static EnterpriseProjectElementField<ZonedDateTime> LAST_CHANGE_DATE_TIME = new EnterpriseProjectElementField<ZonedDateTime>("LastChangeDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangedByUser</b></p>
     * 
     * @param lastChangedByUser
     *     
     * @return
     *     Last Changed By
     */
    @SerializedName("LastChangedByUser")
    @JsonProperty("LastChangedByUser")
    @Nullable
    @ODataField(odataName = "LastChangedByUser")
    private String lastChangedByUser;
    /**
     * Use with available fluent helpers to apply the <b>LastChangedByUser</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<String> LAST_CHANGED_BY_USER = new EnterpriseProjectElementField<String>("LastChangedByUser");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ProjectLastChangedDateTime</b></p>
     * 
     * @param projectLastChangedDateTime
     *     
     * @return
     *     Date on which object was last changed
     */
    @SerializedName("ProjectLastChangedDateTime")
    @JsonProperty("ProjectLastChangedDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "ProjectLastChangedDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime projectLastChangedDateTime;
    /**
     * Use with available fluent helpers to apply the <b>ProjectLastChangedDateTime</b> field to query operations.
     * 
     */
    public final static EnterpriseProjectElementField<ZonedDateTime> PROJECT_LAST_CHANGED_DATE_TIME = new EnterpriseProjectElementField<ZonedDateTime>("ProjectLastChangedDateTime");
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
     * Navigation property <b>to_EnterpriseProject</b> for <b>EnterpriseProjectElement</b> to single <b>EnterpriseProject</b>.
     * 
     */
    @SerializedName("to_EnterpriseProject")
    @JsonProperty("to_EnterpriseProject")
    @ODataField(odataName = "to_EnterpriseProject")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private EnterpriseProject toEnterpriseProject;
    /**
     * Navigation property <b>to_EntProjectElementJVA</b> for <b>EnterpriseProjectElement</b> to single <b>EntProjectElementJVA</b>.
     * 
     */
    @SerializedName("to_EntProjectElementJVA")
    @JsonProperty("to_EntProjectElementJVA")
    @ODataField(odataName = "to_EntProjectElementJVA")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private EntProjectElementJVA toEntProjectElementJVA;
    /**
     * Navigation property <b>to_ParentProjElement</b> for <b>EnterpriseProjectElement</b> to single <b>EnterpriseProjectElement</b>.
     * 
     */
    @SerializedName("to_ParentProjElement")
    @JsonProperty("to_ParentProjElement")
    @ODataField(odataName = "to_ParentProjElement")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private EnterpriseProjectElement toParentProjElement;
    /**
     * Navigation property <b>to_SubProjElement</b> for <b>EnterpriseProjectElement</b> to multiple <b>EnterpriseProjectElement</b>.
     * 
     */
    @SerializedName("to_SubProjElement")
    @JsonProperty("to_SubProjElement")
    @ODataField(odataName = "to_SubProjElement")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<EnterpriseProjectElement> toSubProjElement;
    /**
     * Use with available fluent helpers to apply the <b>to_EnterpriseProject</b> navigation property to query operations.
     * 
     */
    public final static EnterpriseProjectElementOneToOneLink<EnterpriseProject> TO_ENTERPRISE_PROJECT = new EnterpriseProjectElementOneToOneLink<EnterpriseProject>("to_EnterpriseProject");
    /**
     * Use with available fluent helpers to apply the <b>to_EntProjectElementJVA</b> navigation property to query operations.
     * 
     */
    public final static EnterpriseProjectElementOneToOneLink<EntProjectElementJVA> TO_ENT_PROJECT_ELEMENT_JVA = new EnterpriseProjectElementOneToOneLink<EntProjectElementJVA>("to_EntProjectElementJVA");
    /**
     * Use with available fluent helpers to apply the <b>to_ParentProjElement</b> navigation property to query operations.
     * 
     */
    public final static EnterpriseProjectElementOneToOneLink<EnterpriseProjectElement> TO_PARENT_PROJ_ELEMENT = new EnterpriseProjectElementOneToOneLink<EnterpriseProjectElement>("to_ParentProjElement");
    /**
     * Use with available fluent helpers to apply the <b>to_SubProjElement</b> navigation property to query operations.
     * 
     */
    public final static EnterpriseProjectElementLink<EnterpriseProjectElement> TO_SUB_PROJ_ELEMENT = new EnterpriseProjectElementLink<EnterpriseProjectElement>("to_SubProjElement");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<EnterpriseProjectElement> getType() {
        return EnterpriseProjectElement.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>ProjectElementUUID</b></p>
     * 
     * @param projectElementUUID
     *     Entity Guid
     */
    public void setProjectElementUUID(
        @Nullable
        final UUID projectElementUUID) {
        rememberChangedField("ProjectElementUUID", this.projectElementUUID);
        this.projectElementUUID = projectElementUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 24 <p>Original property name from the Odata EDM: <b>ProjectElement</b></p>
     * 
     * @param projectElement
     *     Identification of Entities
     */
    public void setProjectElement(
        @Nullable
        final String projectElement) {
        rememberChangedField("ProjectElement", this.projectElement);
        this.projectElement = projectElement;
    }

    /**
     * Constraints: Not nullable, Maximum length: 8 <p>Original property name from the Odata EDM: <b>WBSElementInternalID</b></p>
     * 
     * @param wBSElementInternalID
     *     WBS Element
     */
    public void setWBSElementInternalID(
        @Nullable
        final String wBSElementInternalID) {
        rememberChangedField("WBSElementInternalID", this.wBSElementInternalID);
        this.wBSElementInternalID = wBSElementInternalID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ProjectUUID</b></p>
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
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>ProjectElementDescription</b></p>
     * 
     * @param projectElementDescription
     *     Project Name
     */
    public void setProjectElementDescription(
        @Nullable
        final String projectElementDescription) {
        rememberChangedField("ProjectElementDescription", this.projectElementDescription);
        this.projectElementDescription = projectElementDescription;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ParentObjectUUID</b></p>
     * 
     * @param parentObjectUUID
     *     Entity Guid
     */
    public void setParentObjectUUID(
        @Nullable
        final UUID parentObjectUUID) {
        rememberChangedField("ParentObjectUUID", this.parentObjectUUID);
        this.parentObjectUUID = parentObjectUUID;
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
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>SortingNumber</b></p>
     * 
     * @param sortingNumber
     *     Sort Number
     */
    public void setSortingNumber(
        @Nullable
        final String sortingNumber) {
        rememberChangedField("SortingNumber", this.sortingNumber);
        this.sortingNumber = sortingNumber;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>PlannedStartDate</b></p>
     * 
     * @param plannedStartDate
     *     
     */
    public void setPlannedStartDate(
        @Nullable
        final LocalDateTime plannedStartDate) {
        rememberChangedField("PlannedStartDate", this.plannedStartDate);
        this.plannedStartDate = plannedStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>PlannedEndDate</b></p>
     * 
     * @param plannedEndDate
     *     
     */
    public void setPlannedEndDate(
        @Nullable
        final LocalDateTime plannedEndDate) {
        rememberChangedField("PlannedEndDate", this.plannedEndDate);
        this.plannedEndDate = plannedEndDate;
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
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>FactoryCalendar</b></p>
     * 
     * @param factoryCalendar
     *     Calendar
     */
    public void setFactoryCalendar(
        @Nullable
        final String factoryCalendar) {
        rememberChangedField("FactoryCalendar", this.factoryCalendar);
        this.factoryCalendar = factoryCalendar;
    }

    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>CostingSheet</b></p>
     * 
     * @param costingSheet
     *     Costing Sheet
     */
    public void setCostingSheet(
        @Nullable
        final String costingSheet) {
        rememberChangedField("CostingSheet", this.costingSheet);
        this.costingSheet = costingSheet;
    }

    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>InvestmentProfile</b></p>
     * 
     * @param investmentProfile
     *     Investment Measure Profile
     */
    public void setInvestmentProfile(
        @Nullable
        final String investmentProfile) {
        rememberChangedField("InvestmentProfile", this.investmentProfile);
        this.investmentProfile = investmentProfile;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>WBSIsStatisticalWBSElement</b></p>
     * 
     * @param wBSIsStatisticalWBSElement
     *     Statistical WBS element
     */
    public void setWBSIsStatisticalWBSElement(
        @Nullable
        final Boolean wBSIsStatisticalWBSElement) {
        rememberChangedField("WBSIsStatisticalWBSElement", this.wBSIsStatisticalWBSElement);
        this.wBSIsStatisticalWBSElement = wBSIsStatisticalWBSElement;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CostCenter</b></p>
     * 
     * @param costCenter
     *     Cost center to which costs are actually posted
     */
    public void setCostCenter(
        @Nullable
        final String costCenter) {
        rememberChangedField("CostCenter", this.costCenter);
        this.costCenter = costCenter;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     Created By
     */
    public void setCreatedByUser(
        @Nullable
        final String createdByUser) {
        rememberChangedField("CreatedByUser", this.createdByUser);
        this.createdByUser = createdByUser;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationDateTime</b></p>
     * 
     * @param creationDateTime
     *     Timestamp of created object
     */
    public void setCreationDateTime(
        @Nullable
        final ZonedDateTime creationDateTime) {
        rememberChangedField("CreationDateTime", this.creationDateTime);
        this.creationDateTime = creationDateTime;
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

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangedByUser</b></p>
     * 
     * @param lastChangedByUser
     *     Last Changed By
     */
    public void setLastChangedByUser(
        @Nullable
        final String lastChangedByUser) {
        rememberChangedField("LastChangedByUser", this.lastChangedByUser);
        this.lastChangedByUser = lastChangedByUser;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ProjectLastChangedDateTime</b></p>
     * 
     * @param projectLastChangedDateTime
     *     Date on which object was last changed
     */
    public void setProjectLastChangedDateTime(
        @Nullable
        final ZonedDateTime projectLastChangedDateTime) {
        rememberChangedField("ProjectLastChangedDateTime", this.projectLastChangedDateTime);
        this.projectLastChangedDateTime = projectLastChangedDateTime;
    }

    @Override
    protected String getEntityCollection() {
        return "A_EnterpriseProjectElement";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("ProjectElementUUID", getProjectElementUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("ProjectElementUUID", getProjectElementUUID());
        values.put("ProjectElement", getProjectElement());
        values.put("WBSElementInternalID", getWBSElementInternalID());
        values.put("ProjectUUID", getProjectUUID());
        values.put("ProjectElementDescription", getProjectElementDescription());
        values.put("ParentObjectUUID", getParentObjectUUID());
        values.put("ProcessingStatus", getProcessingStatus());
        values.put("SortingNumber", getSortingNumber());
        values.put("PlannedStartDate", getPlannedStartDate());
        values.put("PlannedEndDate", getPlannedEndDate());
        values.put("ResponsibleCostCenter", getResponsibleCostCenter());
        values.put("CompanyCode", getCompanyCode());
        values.put("ProfitCenter", getProfitCenter());
        values.put("FunctionalArea", getFunctionalArea());
        values.put("ControllingArea", getControllingArea());
        values.put("Plant", getPlant());
        values.put("Location", getLocation());
        values.put("FactoryCalendar", getFactoryCalendar());
        values.put("CostingSheet", getCostingSheet());
        values.put("InvestmentProfile", getInvestmentProfile());
        values.put("WBSIsStatisticalWBSElement", getWBSIsStatisticalWBSElement());
        values.put("CostCenter", getCostCenter());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("CreationDateTime", getCreationDateTime());
        values.put("LastChangeDateTime", getLastChangeDateTime());
        values.put("LastChangedByUser", getLastChangedByUser());
        values.put("ProjectLastChangedDateTime", getProjectLastChangedDateTime());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("ProjectElementUUID")) {
                final Object value = values.remove("ProjectElementUUID");
                if ((value == null)||(!value.equals(getProjectElementUUID()))) {
                    setProjectElementUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProjectElement")) {
                final Object value = values.remove("ProjectElement");
                if ((value == null)||(!value.equals(getProjectElement()))) {
                    setProjectElement(((String) value));
                }
            }
            if (values.containsKey("WBSElementInternalID")) {
                final Object value = values.remove("WBSElementInternalID");
                if ((value == null)||(!value.equals(getWBSElementInternalID()))) {
                    setWBSElementInternalID(((String) value));
                }
            }
            if (values.containsKey("ProjectUUID")) {
                final Object value = values.remove("ProjectUUID");
                if ((value == null)||(!value.equals(getProjectUUID()))) {
                    setProjectUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProjectElementDescription")) {
                final Object value = values.remove("ProjectElementDescription");
                if ((value == null)||(!value.equals(getProjectElementDescription()))) {
                    setProjectElementDescription(((String) value));
                }
            }
            if (values.containsKey("ParentObjectUUID")) {
                final Object value = values.remove("ParentObjectUUID");
                if ((value == null)||(!value.equals(getParentObjectUUID()))) {
                    setParentObjectUUID(((UUID) value));
                }
            }
            if (values.containsKey("ProcessingStatus")) {
                final Object value = values.remove("ProcessingStatus");
                if ((value == null)||(!value.equals(getProcessingStatus()))) {
                    setProcessingStatus(((String) value));
                }
            }
            if (values.containsKey("SortingNumber")) {
                final Object value = values.remove("SortingNumber");
                if ((value == null)||(!value.equals(getSortingNumber()))) {
                    setSortingNumber(((String) value));
                }
            }
            if (values.containsKey("PlannedStartDate")) {
                final Object value = values.remove("PlannedStartDate");
                if ((value == null)||(!value.equals(getPlannedStartDate()))) {
                    setPlannedStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("PlannedEndDate")) {
                final Object value = values.remove("PlannedEndDate");
                if ((value == null)||(!value.equals(getPlannedEndDate()))) {
                    setPlannedEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ResponsibleCostCenter")) {
                final Object value = values.remove("ResponsibleCostCenter");
                if ((value == null)||(!value.equals(getResponsibleCostCenter()))) {
                    setResponsibleCostCenter(((String) value));
                }
            }
            if (values.containsKey("CompanyCode")) {
                final Object value = values.remove("CompanyCode");
                if ((value == null)||(!value.equals(getCompanyCode()))) {
                    setCompanyCode(((String) value));
                }
            }
            if (values.containsKey("ProfitCenter")) {
                final Object value = values.remove("ProfitCenter");
                if ((value == null)||(!value.equals(getProfitCenter()))) {
                    setProfitCenter(((String) value));
                }
            }
            if (values.containsKey("FunctionalArea")) {
                final Object value = values.remove("FunctionalArea");
                if ((value == null)||(!value.equals(getFunctionalArea()))) {
                    setFunctionalArea(((String) value));
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
            if (values.containsKey("FactoryCalendar")) {
                final Object value = values.remove("FactoryCalendar");
                if ((value == null)||(!value.equals(getFactoryCalendar()))) {
                    setFactoryCalendar(((String) value));
                }
            }
            if (values.containsKey("CostingSheet")) {
                final Object value = values.remove("CostingSheet");
                if ((value == null)||(!value.equals(getCostingSheet()))) {
                    setCostingSheet(((String) value));
                }
            }
            if (values.containsKey("InvestmentProfile")) {
                final Object value = values.remove("InvestmentProfile");
                if ((value == null)||(!value.equals(getInvestmentProfile()))) {
                    setInvestmentProfile(((String) value));
                }
            }
            if (values.containsKey("WBSIsStatisticalWBSElement")) {
                final Object value = values.remove("WBSIsStatisticalWBSElement");
                if ((value == null)||(!value.equals(getWBSIsStatisticalWBSElement()))) {
                    setWBSIsStatisticalWBSElement(((Boolean) value));
                }
            }
            if (values.containsKey("CostCenter")) {
                final Object value = values.remove("CostCenter");
                if ((value == null)||(!value.equals(getCostCenter()))) {
                    setCostCenter(((String) value));
                }
            }
            if (values.containsKey("CreatedByUser")) {
                final Object value = values.remove("CreatedByUser");
                if ((value == null)||(!value.equals(getCreatedByUser()))) {
                    setCreatedByUser(((String) value));
                }
            }
            if (values.containsKey("CreationDateTime")) {
                final Object value = values.remove("CreationDateTime");
                if ((value == null)||(!value.equals(getCreationDateTime()))) {
                    setCreationDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("LastChangeDateTime")) {
                final Object value = values.remove("LastChangeDateTime");
                if ((value == null)||(!value.equals(getLastChangeDateTime()))) {
                    setLastChangeDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("LastChangedByUser")) {
                final Object value = values.remove("LastChangedByUser");
                if ((value == null)||(!value.equals(getLastChangedByUser()))) {
                    setLastChangedByUser(((String) value));
                }
            }
            if (values.containsKey("ProjectLastChangedDateTime")) {
                final Object value = values.remove("ProjectLastChangedDateTime");
                if ((value == null)||(!value.equals(getProjectLastChangedDateTime()))) {
                    setProjectLastChangedDateTime(((ZonedDateTime) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_EnterpriseProject")) {
                final Object value = (values).remove("to_EnterpriseProject");
                if (value instanceof Map) {
                    if (toEnterpriseProject == null) {
                        toEnterpriseProject = new EnterpriseProject();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toEnterpriseProject.fromMap(inputMap);
                }
            }
            if ((values).containsKey("to_EntProjectElementJVA")) {
                final Object value = (values).remove("to_EntProjectElementJVA");
                if (value instanceof Map) {
                    if (toEntProjectElementJVA == null) {
                        toEntProjectElementJVA = new EntProjectElementJVA();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toEntProjectElementJVA.fromMap(inputMap);
                }
            }
            if ((values).containsKey("to_ParentProjElement")) {
                final Object value = (values).remove("to_ParentProjElement");
                if (value instanceof Map) {
                    if (toParentProjElement == null) {
                        toParentProjElement = new EnterpriseProjectElement();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toParentProjElement.fromMap(inputMap);
                }
            }
            if ((values).containsKey("to_SubProjElement")) {
                final Object value = (values).remove("to_SubProjElement");
                if (value instanceof Iterable) {
                    if (toSubProjElement == null) {
                        toSubProjElement = Lists.newArrayList();
                    } else {
                        toSubProjElement = Lists.newArrayList(toSubProjElement);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        EnterpriseProjectElement entity;
                        if (toSubProjElement.size()>i) {
                            entity = toSubProjElement.get(i);
                        } else {
                            entity = new EnterpriseProjectElement();
                            toSubProjElement.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
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
    public static<T >EnterpriseProjectElementField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new EnterpriseProjectElementField<T>(fieldName);
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
    public static<T,DomainT >EnterpriseProjectElementField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new EnterpriseProjectElementField<T>(fieldName, typeConverter);
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
        if (toEnterpriseProject!= null) {
            (values).put("to_EnterpriseProject", toEnterpriseProject);
        }
        if (toEntProjectElementJVA!= null) {
            (values).put("to_EntProjectElementJVA", toEntProjectElementJVA);
        }
        if (toParentProjElement!= null) {
            (values).put("to_ParentProjElement", toParentProjElement);
        }
        if (toSubProjElement!= null) {
            (values).put("to_SubProjElement", toSubProjElement);
        }
        return values;
    }

    /**
     * Fetches the <b>EnterpriseProject</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_EnterpriseProject</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>EnterpriseProject</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public EnterpriseProject fetchEnterpriseProject()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type EnterpriseProject.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("ProjectElementUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(projectElementUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_EnterpriseProject");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final EnterpriseProject entity = result.as(EnterpriseProject.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>EnterpriseProject</b> entity (one to one). This corresponds to the OData navigation property <b>to_EnterpriseProject</b>.
     * <p>
     * If the navigation property <b>to_EnterpriseProject</b> of a queried <b>EnterpriseProjectElement</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>EnterpriseProject</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public EnterpriseProject getEnterpriseProjectOrFetch()
        throws ODataException
    {
        if (toEnterpriseProject == null) {
            toEnterpriseProject = fetchEnterpriseProject();
        }
        return toEnterpriseProject;
    }

    /**
     * Retrieval of associated <b>EnterpriseProject</b> entity (one to one). This corresponds to the OData navigation property <b>to_EnterpriseProject</b>.
     * <p>
     * If the navigation property for an entity <b>EnterpriseProjectElement</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_EnterpriseProject</b> is already loaded, the result will contain the <b>EnterpriseProject</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<EnterpriseProject> getEnterpriseProjectIfPresent() {
        return Optional.ofNullable(toEnterpriseProject);
    }

    /**
     * Overwrites the associated <b>EnterpriseProject</b> entity for the loaded navigation property <b>to_EnterpriseProject</b>.
     * 
     * @param value
     *     New <b>EnterpriseProject</b> entity.
     */
    public void setEnterpriseProject(final EnterpriseProject value) {
        toEnterpriseProject = value;
    }

    /**
     * Fetches the <b>EntProjectElementJVA</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_EntProjectElementJVA</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>EntProjectElementJVA</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public EntProjectElementJVA fetchEntProjectElementJVA()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type EntProjectElementJVA.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("ProjectElementUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(projectElementUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_EntProjectElementJVA");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final EntProjectElementJVA entity = result.as(EntProjectElementJVA.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>EntProjectElementJVA</b> entity (one to one). This corresponds to the OData navigation property <b>to_EntProjectElementJVA</b>.
     * <p>
     * If the navigation property <b>to_EntProjectElementJVA</b> of a queried <b>EnterpriseProjectElement</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>EntProjectElementJVA</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public EntProjectElementJVA getEntProjectElementJVAOrFetch()
        throws ODataException
    {
        if (toEntProjectElementJVA == null) {
            toEntProjectElementJVA = fetchEntProjectElementJVA();
        }
        return toEntProjectElementJVA;
    }

    /**
     * Retrieval of associated <b>EntProjectElementJVA</b> entity (one to one). This corresponds to the OData navigation property <b>to_EntProjectElementJVA</b>.
     * <p>
     * If the navigation property for an entity <b>EnterpriseProjectElement</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_EntProjectElementJVA</b> is already loaded, the result will contain the <b>EntProjectElementJVA</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<EntProjectElementJVA> getEntProjectElementJVAIfPresent() {
        return Optional.ofNullable(toEntProjectElementJVA);
    }

    /**
     * Overwrites the associated <b>EntProjectElementJVA</b> entity for the loaded navigation property <b>to_EntProjectElementJVA</b>.
     * 
     * @param value
     *     New <b>EntProjectElementJVA</b> entity.
     */
    public void setEntProjectElementJVA(final EntProjectElementJVA value) {
        toEntProjectElementJVA = value;
    }

    /**
     * Fetches the <b>EnterpriseProjectElement</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_ParentProjElement</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>EnterpriseProjectElement</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public EnterpriseProjectElement fetchParentProjElement()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type EnterpriseProjectElement.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("ProjectElementUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(projectElementUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_ParentProjElement");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final EnterpriseProjectElement entity = result.as(EnterpriseProjectElement.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>EnterpriseProjectElement</b> entity (one to one). This corresponds to the OData navigation property <b>to_ParentProjElement</b>.
     * <p>
     * If the navigation property <b>to_ParentProjElement</b> of a queried <b>EnterpriseProjectElement</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>EnterpriseProjectElement</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public EnterpriseProjectElement getParentProjElementOrFetch()
        throws ODataException
    {
        if (toParentProjElement == null) {
            toParentProjElement = fetchParentProjElement();
        }
        return toParentProjElement;
    }

    /**
     * Retrieval of associated <b>EnterpriseProjectElement</b> entity (one to one). This corresponds to the OData navigation property <b>to_ParentProjElement</b>.
     * <p>
     * If the navigation property for an entity <b>EnterpriseProjectElement</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_ParentProjElement</b> is already loaded, the result will contain the <b>EnterpriseProjectElement</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<EnterpriseProjectElement> getParentProjElementIfPresent() {
        return Optional.ofNullable(toParentProjElement);
    }

    /**
     * Overwrites the associated <b>EnterpriseProjectElement</b> entity for the loaded navigation property <b>to_ParentProjElement</b>.
     * 
     * @param value
     *     New <b>EnterpriseProjectElement</b> entity.
     */
    public void setParentProjElement(final EnterpriseProjectElement value) {
        toParentProjElement = value;
    }

    /**
     * Fetches the <b>EnterpriseProjectElement</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_SubProjElement</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>EnterpriseProjectElement</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<EnterpriseProjectElement> fetchSubProjElement()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type EnterpriseProjectElement.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("ProjectElementUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(projectElementUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_SubProjElement");
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
     * Retrieval of associated <b>EnterpriseProjectElement</b> entities (one to many). This corresponds to the OData navigation property <b>to_SubProjElement</b>.
     * <p>
     * If the navigation property <b>to_SubProjElement</b> of a queried <b>EnterpriseProjectElement</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>EnterpriseProjectElement</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<EnterpriseProjectElement> getSubProjElementOrFetch()
        throws ODataException
    {
        if (toSubProjElement == null) {
            toSubProjElement = fetchSubProjElement();
        }
        return toSubProjElement;
    }

    /**
     * Retrieval of associated <b>EnterpriseProjectElement</b> entities (one to many). This corresponds to the OData navigation property <b>to_SubProjElement</b>.
     * <p>
     * If the navigation property for an entity <b>EnterpriseProjectElement</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_SubProjElement</b> is already loaded, the result will contain the <b>EnterpriseProjectElement</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<EnterpriseProjectElement>> getSubProjElementIfPresent() {
        return Optional.ofNullable(toSubProjElement);
    }

    /**
     * Overwrites the list of associated <b>EnterpriseProjectElement</b> entities for the loaded navigation property <b>to_SubProjElement</b>.
     * <p>
     * If the navigation property <b>to_SubProjElement</b> of a queried <b>EnterpriseProjectElement</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>EnterpriseProjectElement</b> entities.
     */
    public void setSubProjElement(
        @Nonnull
        final List<EnterpriseProjectElement> value) {
        if (toSubProjElement == null) {
            toSubProjElement = Lists.newArrayList();
        }
        toSubProjElement.clear();
        toSubProjElement.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>EnterpriseProjectElement</b> entities. This corresponds to the OData navigation property <b>to_SubProjElement</b>.
     * <p>
     * If the navigation property <b>to_SubProjElement</b> of a queried <b>EnterpriseProjectElement</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>EnterpriseProjectElement</b> entities.
     */
    public void addSubProjElement(EnterpriseProjectElement... entity) {
        if (toSubProjElement == null) {
            toSubProjElement = Lists.newArrayList();
        }
        toSubProjElement.addAll(Lists.newArrayList(entity));
    }

    public final static class EnterpriseProjectElementBuilder {

        private EnterpriseProject toEnterpriseProject;
        private EntProjectElementJVA toEntProjectElementJVA;
        private EnterpriseProjectElement toParentProjElement;
        private List<EnterpriseProjectElement> toSubProjElement = Lists.newArrayList();

        private EnterpriseProjectElement.EnterpriseProjectElementBuilder toEnterpriseProject(EnterpriseProject value) {
            toEnterpriseProject = value;
            return this;
        }

        /**
         * Navigation property <b>to_EnterpriseProject</b> for <b>EnterpriseProjectElement</b> to single <b>EnterpriseProject</b>.
         * 
         */
        @Nonnull
        public EnterpriseProjectElement.EnterpriseProjectElementBuilder enterpriseProject(final EnterpriseProject value) {
            return toEnterpriseProject(value);
        }

        private EnterpriseProjectElement.EnterpriseProjectElementBuilder toEntProjectElementJVA(EntProjectElementJVA value) {
            toEntProjectElementJVA = value;
            return this;
        }

        /**
         * Navigation property <b>to_EntProjectElementJVA</b> for <b>EnterpriseProjectElement</b> to single <b>EntProjectElementJVA</b>.
         * 
         */
        @Nonnull
        public EnterpriseProjectElement.EnterpriseProjectElementBuilder entProjectElementJVA(final EntProjectElementJVA value) {
            return toEntProjectElementJVA(value);
        }

        private EnterpriseProjectElement.EnterpriseProjectElementBuilder toParentProjElement(EnterpriseProjectElement value) {
            toParentProjElement = value;
            return this;
        }

        /**
         * Navigation property <b>to_ParentProjElement</b> for <b>EnterpriseProjectElement</b> to single <b>EnterpriseProjectElement</b>.
         * 
         */
        @Nonnull
        public EnterpriseProjectElement.EnterpriseProjectElementBuilder parentProjElement(final EnterpriseProjectElement value) {
            return toParentProjElement(value);
        }

        private EnterpriseProjectElement.EnterpriseProjectElementBuilder toSubProjElement(List<EnterpriseProjectElement> value) {
            toSubProjElement.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_SubProjElement</b> for <b>EnterpriseProjectElement</b> to multiple <b>EnterpriseProjectElement</b>.
         * 
         */
        @Nonnull
        public EnterpriseProjectElement.EnterpriseProjectElementBuilder subProjElement(EnterpriseProjectElement... value) {
            return toSubProjElement(Lists.newArrayList(value));
        }

    }

}
