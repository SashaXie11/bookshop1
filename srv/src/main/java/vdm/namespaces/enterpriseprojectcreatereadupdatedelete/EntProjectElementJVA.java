/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.enterpriseprojectcreatereadupdatedelete;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.field.EntProjectElementJVAField;
import vdm.namespaces.enterpriseprojectcreatereadupdatedelete.selectable.EntProjectElementJVASelectable;


/**
 * API for EntProjElement JVA<p></p><p>Original entity name from the Odata EDM: <b>A_EntProjectElementJVAType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class EntProjectElementJVA
    extends VdmEntity<EntProjectElementJVA>
{

    /**
     * Selector for all available fields of EntProjectElementJVA.
     * 
     */
    public final static EntProjectElementJVASelectable ALL_FIELDS = new EntProjectElementJVASelectable() {


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
    public final static EntProjectElementJVAField<UUID> PROJECT_ELEMENT_UUID = new EntProjectElementJVAField<UUID>("ProjectElementUUID");
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
    public final static EntProjectElementJVAField<UUID> PROJECT_UUID = new EntProjectElementJVAField<UUID>("ProjectUUID");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>JointVenture</b></p>
     * 
     * @param jointVenture
     *     
     * @return
     *     Joint venture
     */
    @SerializedName("JointVenture")
    @JsonProperty("JointVenture")
    @Nullable
    @ODataField(odataName = "JointVenture")
    private String jointVenture;
    /**
     * Use with available fluent helpers to apply the <b>JointVenture</b> field to query operations.
     * 
     */
    public final static EntProjectElementJVAField<String> JOINT_VENTURE = new EntProjectElementJVAField<String>("JointVenture");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>JointVentureCostRecoveryCode</b></p>
     * 
     * @param jointVentureCostRecoveryCode
     *     
     * @return
     *     Recovery Indicator
     */
    @SerializedName("JointVentureCostRecoveryCode")
    @JsonProperty("JointVentureCostRecoveryCode")
    @Nullable
    @ODataField(odataName = "JointVentureCostRecoveryCode")
    private String jointVentureCostRecoveryCode;
    /**
     * Use with available fluent helpers to apply the <b>JointVentureCostRecoveryCode</b> field to query operations.
     * 
     */
    public final static EntProjectElementJVAField<String> JOINT_VENTURE_COST_RECOVERY_CODE = new EntProjectElementJVAField<String>("JointVentureCostRecoveryCode");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>JointVentureEquityType</b></p>
     * 
     * @param jointVentureEquityType
     *     
     * @return
     *     Equity type
     */
    @SerializedName("JointVentureEquityType")
    @JsonProperty("JointVentureEquityType")
    @Nullable
    @ODataField(odataName = "JointVentureEquityType")
    private String jointVentureEquityType;
    /**
     * Use with available fluent helpers to apply the <b>JointVentureEquityType</b> field to query operations.
     * 
     */
    public final static EntProjectElementJVAField<String> JOINT_VENTURE_EQUITY_TYPE = new EntProjectElementJVAField<String>("JointVentureEquityType");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>JntVntrProjectType</b></p>
     * 
     * @param jntVntrProjectType
     *     
     * @return
     *     Joint Venture Object Type
     */
    @SerializedName("JntVntrProjectType")
    @JsonProperty("JntVntrProjectType")
    @Nullable
    @ODataField(odataName = "JntVntrProjectType")
    private String jntVntrProjectType;
    /**
     * Use with available fluent helpers to apply the <b>JntVntrProjectType</b> field to query operations.
     * 
     */
    public final static EntProjectElementJVAField<String> JNT_VNTR_PROJECT_TYPE = new EntProjectElementJVAField<String>("JntVntrProjectType");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>JntIntrstBillgClass</b></p>
     * 
     * @param jntIntrstBillgClass
     *     
     * @return
     *     JIB/JIBE Class
     */
    @SerializedName("JntIntrstBillgClass")
    @JsonProperty("JntIntrstBillgClass")
    @Nullable
    @ODataField(odataName = "JntIntrstBillgClass")
    private String jntIntrstBillgClass;
    /**
     * Use with available fluent helpers to apply the <b>JntIntrstBillgClass</b> field to query operations.
     * 
     */
    public final static EntProjectElementJVAField<String> JNT_INTRST_BILLG_CLASS = new EntProjectElementJVAField<String>("JntIntrstBillgClass");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>JntIntrstBillgSubClass</b></p>
     * 
     * @param jntIntrstBillgSubClass
     *     
     * @return
     *     JIB/JIBE Subclass A
     */
    @SerializedName("JntIntrstBillgSubClass")
    @JsonProperty("JntIntrstBillgSubClass")
    @Nullable
    @ODataField(odataName = "JntIntrstBillgSubClass")
    private String jntIntrstBillgSubClass;
    /**
     * Use with available fluent helpers to apply the <b>JntIntrstBillgSubClass</b> field to query operations.
     * 
     */
    public final static EntProjectElementJVAField<String> JNT_INTRST_BILLG_SUB_CLASS = new EntProjectElementJVAField<String>("JntIntrstBillgSubClass");
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
    public final static EntProjectElementJVAField<ZonedDateTime> PROJECT_LAST_CHANGED_DATE_TIME = new EntProjectElementJVAField<ZonedDateTime>("ProjectLastChangedDateTime");
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
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<EntProjectElementJVA> getType() {
        return EntProjectElementJVA.class;
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
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>JointVenture</b></p>
     * 
     * @param jointVenture
     *     Joint venture
     */
    public void setJointVenture(
        @Nullable
        final String jointVenture) {
        rememberChangedField("JointVenture", this.jointVenture);
        this.jointVenture = jointVenture;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>JointVentureCostRecoveryCode</b></p>
     * 
     * @param jointVentureCostRecoveryCode
     *     Recovery Indicator
     */
    public void setJointVentureCostRecoveryCode(
        @Nullable
        final String jointVentureCostRecoveryCode) {
        rememberChangedField("JointVentureCostRecoveryCode", this.jointVentureCostRecoveryCode);
        this.jointVentureCostRecoveryCode = jointVentureCostRecoveryCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>JointVentureEquityType</b></p>
     * 
     * @param jointVentureEquityType
     *     Equity type
     */
    public void setJointVentureEquityType(
        @Nullable
        final String jointVentureEquityType) {
        rememberChangedField("JointVentureEquityType", this.jointVentureEquityType);
        this.jointVentureEquityType = jointVentureEquityType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>JntVntrProjectType</b></p>
     * 
     * @param jntVntrProjectType
     *     Joint Venture Object Type
     */
    public void setJntVntrProjectType(
        @Nullable
        final String jntVntrProjectType) {
        rememberChangedField("JntVntrProjectType", this.jntVntrProjectType);
        this.jntVntrProjectType = jntVntrProjectType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>JntIntrstBillgClass</b></p>
     * 
     * @param jntIntrstBillgClass
     *     JIB/JIBE Class
     */
    public void setJntIntrstBillgClass(
        @Nullable
        final String jntIntrstBillgClass) {
        rememberChangedField("JntIntrstBillgClass", this.jntIntrstBillgClass);
        this.jntIntrstBillgClass = jntIntrstBillgClass;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>JntIntrstBillgSubClass</b></p>
     * 
     * @param jntIntrstBillgSubClass
     *     JIB/JIBE Subclass A
     */
    public void setJntIntrstBillgSubClass(
        @Nullable
        final String jntIntrstBillgSubClass) {
        rememberChangedField("JntIntrstBillgSubClass", this.jntIntrstBillgSubClass);
        this.jntIntrstBillgSubClass = jntIntrstBillgSubClass;
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
        return "A_EntProjectElementJVA";
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
        values.put("ProjectUUID", getProjectUUID());
        values.put("JointVenture", getJointVenture());
        values.put("JointVentureCostRecoveryCode", getJointVentureCostRecoveryCode());
        values.put("JointVentureEquityType", getJointVentureEquityType());
        values.put("JntVntrProjectType", getJntVntrProjectType());
        values.put("JntIntrstBillgClass", getJntIntrstBillgClass());
        values.put("JntIntrstBillgSubClass", getJntIntrstBillgSubClass());
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
            if (values.containsKey("ProjectUUID")) {
                final Object value = values.remove("ProjectUUID");
                if ((value == null)||(!value.equals(getProjectUUID()))) {
                    setProjectUUID(((UUID) value));
                }
            }
            if (values.containsKey("JointVenture")) {
                final Object value = values.remove("JointVenture");
                if ((value == null)||(!value.equals(getJointVenture()))) {
                    setJointVenture(((String) value));
                }
            }
            if (values.containsKey("JointVentureCostRecoveryCode")) {
                final Object value = values.remove("JointVentureCostRecoveryCode");
                if ((value == null)||(!value.equals(getJointVentureCostRecoveryCode()))) {
                    setJointVentureCostRecoveryCode(((String) value));
                }
            }
            if (values.containsKey("JointVentureEquityType")) {
                final Object value = values.remove("JointVentureEquityType");
                if ((value == null)||(!value.equals(getJointVentureEquityType()))) {
                    setJointVentureEquityType(((String) value));
                }
            }
            if (values.containsKey("JntVntrProjectType")) {
                final Object value = values.remove("JntVntrProjectType");
                if ((value == null)||(!value.equals(getJntVntrProjectType()))) {
                    setJntVntrProjectType(((String) value));
                }
            }
            if (values.containsKey("JntIntrstBillgClass")) {
                final Object value = values.remove("JntIntrstBillgClass");
                if ((value == null)||(!value.equals(getJntIntrstBillgClass()))) {
                    setJntIntrstBillgClass(((String) value));
                }
            }
            if (values.containsKey("JntIntrstBillgSubClass")) {
                final Object value = values.remove("JntIntrstBillgSubClass");
                if ((value == null)||(!value.equals(getJntIntrstBillgSubClass()))) {
                    setJntIntrstBillgSubClass(((String) value));
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
    public static<T >EntProjectElementJVAField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new EntProjectElementJVAField<T>(fieldName);
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
    public static<T,DomainT >EntProjectElementJVAField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new EntProjectElementJVAField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
