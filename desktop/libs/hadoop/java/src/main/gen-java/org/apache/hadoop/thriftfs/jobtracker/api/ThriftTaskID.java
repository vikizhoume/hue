/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.thriftfs.jobtracker.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unique task id
 */
public class ThriftTaskID implements org.apache.thrift.TBase<ThriftTaskID, ThriftTaskID._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftTaskID");

  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobID", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("taskType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskID", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField AS_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("asString", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftTaskIDStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftTaskIDTupleSchemeFactory());
  }

  /**
   * ID of the job to which the task belongs
   */
  public ThriftJobID jobID; // required
  /**
   * What kind of task is this?
   * 
   * @see ThriftTaskType
   */
  public ThriftTaskType taskType; // required
  /**
   * Unique (to job) task id
   */
  public int taskID; // required
  /**
   * Flattened to a unique string
   */
  public String asString; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * ID of the job to which the task belongs
     */
    JOB_ID((short)1, "jobID"),
    /**
     * What kind of task is this?
     * 
     * @see ThriftTaskType
     */
    TASK_TYPE((short)2, "taskType"),
    /**
     * Unique (to job) task id
     */
    TASK_ID((short)3, "taskID"),
    /**
     * Flattened to a unique string
     */
    AS_STRING((short)4, "asString");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOB_ID
          return JOB_ID;
        case 2: // TASK_TYPE
          return TASK_TYPE;
        case 3: // TASK_ID
          return TASK_ID;
        case 4: // AS_STRING
          return AS_STRING;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TASKID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("jobID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftJobID.class)));
    tmpMap.put(_Fields.TASK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("taskType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftTaskType.class)));
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AS_STRING, new org.apache.thrift.meta_data.FieldMetaData("asString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftTaskID.class, metaDataMap);
  }

  public ThriftTaskID() {
  }

  public ThriftTaskID(
    ThriftJobID jobID,
    ThriftTaskType taskType,
    int taskID,
    String asString)
  {
    this();
    this.jobID = jobID;
    this.taskType = taskType;
    this.taskID = taskID;
    setTaskIDIsSet(true);
    this.asString = asString;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftTaskID(ThriftTaskID other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobID()) {
      this.jobID = new ThriftJobID(other.jobID);
    }
    if (other.isSetTaskType()) {
      this.taskType = other.taskType;
    }
    this.taskID = other.taskID;
    if (other.isSetAsString()) {
      this.asString = other.asString;
    }
  }

  public ThriftTaskID deepCopy() {
    return new ThriftTaskID(this);
  }

  @Override
  public void clear() {
    this.jobID = null;
    this.taskType = null;
    setTaskIDIsSet(false);
    this.taskID = 0;
    this.asString = null;
  }

  /**
   * ID of the job to which the task belongs
   */
  public ThriftJobID getJobID() {
    return this.jobID;
  }

  /**
   * ID of the job to which the task belongs
   */
  public ThriftTaskID setJobID(ThriftJobID jobID) {
    this.jobID = jobID;
    return this;
  }

  public void unsetJobID() {
    this.jobID = null;
  }

  /** Returns true if field jobID is set (has been assigned a value) and false otherwise */
  public boolean isSetJobID() {
    return this.jobID != null;
  }

  public void setJobIDIsSet(boolean value) {
    if (!value) {
      this.jobID = null;
    }
  }

  /**
   * What kind of task is this?
   * 
   * @see ThriftTaskType
   */
  public ThriftTaskType getTaskType() {
    return this.taskType;
  }

  /**
   * What kind of task is this?
   * 
   * @see ThriftTaskType
   */
  public ThriftTaskID setTaskType(ThriftTaskType taskType) {
    this.taskType = taskType;
    return this;
  }

  public void unsetTaskType() {
    this.taskType = null;
  }

  /** Returns true if field taskType is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskType() {
    return this.taskType != null;
  }

  public void setTaskTypeIsSet(boolean value) {
    if (!value) {
      this.taskType = null;
    }
  }

  /**
   * Unique (to job) task id
   */
  public int getTaskID() {
    return this.taskID;
  }

  /**
   * Unique (to job) task id
   */
  public ThriftTaskID setTaskID(int taskID) {
    this.taskID = taskID;
    setTaskIDIsSet(true);
    return this;
  }

  public void unsetTaskID() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  /** Returns true if field taskID is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskID() {
    return EncodingUtils.testBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  public void setTaskIDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TASKID_ISSET_ID, value);
  }

  /**
   * Flattened to a unique string
   */
  public String getAsString() {
    return this.asString;
  }

  /**
   * Flattened to a unique string
   */
  public ThriftTaskID setAsString(String asString) {
    this.asString = asString;
    return this;
  }

  public void unsetAsString() {
    this.asString = null;
  }

  /** Returns true if field asString is set (has been assigned a value) and false otherwise */
  public boolean isSetAsString() {
    return this.asString != null;
  }

  public void setAsStringIsSet(boolean value) {
    if (!value) {
      this.asString = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_ID:
      if (value == null) {
        unsetJobID();
      } else {
        setJobID((ThriftJobID)value);
      }
      break;

    case TASK_TYPE:
      if (value == null) {
        unsetTaskType();
      } else {
        setTaskType((ThriftTaskType)value);
      }
      break;

    case TASK_ID:
      if (value == null) {
        unsetTaskID();
      } else {
        setTaskID((Integer)value);
      }
      break;

    case AS_STRING:
      if (value == null) {
        unsetAsString();
      } else {
        setAsString((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_ID:
      return getJobID();

    case TASK_TYPE:
      return getTaskType();

    case TASK_ID:
      return Integer.valueOf(getTaskID());

    case AS_STRING:
      return getAsString();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_ID:
      return isSetJobID();
    case TASK_TYPE:
      return isSetTaskType();
    case TASK_ID:
      return isSetTaskID();
    case AS_STRING:
      return isSetAsString();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftTaskID)
      return this.equals((ThriftTaskID)that);
    return false;
  }

  public boolean equals(ThriftTaskID that) {
    if (that == null)
      return false;

    boolean this_present_jobID = true && this.isSetJobID();
    boolean that_present_jobID = true && that.isSetJobID();
    if (this_present_jobID || that_present_jobID) {
      if (!(this_present_jobID && that_present_jobID))
        return false;
      if (!this.jobID.equals(that.jobID))
        return false;
    }

    boolean this_present_taskType = true && this.isSetTaskType();
    boolean that_present_taskType = true && that.isSetTaskType();
    if (this_present_taskType || that_present_taskType) {
      if (!(this_present_taskType && that_present_taskType))
        return false;
      if (!this.taskType.equals(that.taskType))
        return false;
    }

    boolean this_present_taskID = true;
    boolean that_present_taskID = true;
    if (this_present_taskID || that_present_taskID) {
      if (!(this_present_taskID && that_present_taskID))
        return false;
      if (this.taskID != that.taskID)
        return false;
    }

    boolean this_present_asString = true && this.isSetAsString();
    boolean that_present_asString = true && that.isSetAsString();
    if (this_present_asString || that_present_asString) {
      if (!(this_present_asString && that_present_asString))
        return false;
      if (!this.asString.equals(that.asString))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ThriftTaskID other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftTaskID typedOther = (ThriftTaskID)other;

    lastComparison = Boolean.valueOf(isSetJobID()).compareTo(typedOther.isSetJobID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobID, typedOther.jobID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskType()).compareTo(typedOther.isSetTaskType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskType, typedOther.taskType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskID()).compareTo(typedOther.isSetTaskID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskID, typedOther.taskID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAsString()).compareTo(typedOther.isSetAsString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAsString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.asString, typedOther.asString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftTaskID(");
    boolean first = true;

    sb.append("jobID:");
    if (this.jobID == null) {
      sb.append("null");
    } else {
      sb.append(this.jobID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskType:");
    if (this.taskType == null) {
      sb.append("null");
    } else {
      sb.append(this.taskType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskID:");
    sb.append(this.taskID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("asString:");
    if (this.asString == null) {
      sb.append("null");
    } else {
      sb.append(this.asString);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (jobID != null) {
      jobID.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftTaskIDStandardSchemeFactory implements SchemeFactory {
    public ThriftTaskIDStandardScheme getScheme() {
      return new ThriftTaskIDStandardScheme();
    }
  }

  private static class ThriftTaskIDStandardScheme extends StandardScheme<ThriftTaskID> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftTaskID struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jobID = new ThriftJobID();
              struct.jobID.read(iprot);
              struct.setJobIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.taskType = ThriftTaskType.findByValue(iprot.readI32());
              struct.setTaskTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.taskID = iprot.readI32();
              struct.setTaskIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AS_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.asString = iprot.readString();
              struct.setAsStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftTaskID struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobID != null) {
        oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
        struct.jobID.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.taskType != null) {
        oprot.writeFieldBegin(TASK_TYPE_FIELD_DESC);
        oprot.writeI32(struct.taskType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
      oprot.writeI32(struct.taskID);
      oprot.writeFieldEnd();
      if (struct.asString != null) {
        oprot.writeFieldBegin(AS_STRING_FIELD_DESC);
        oprot.writeString(struct.asString);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftTaskIDTupleSchemeFactory implements SchemeFactory {
    public ThriftTaskIDTupleScheme getScheme() {
      return new ThriftTaskIDTupleScheme();
    }
  }

  private static class ThriftTaskIDTupleScheme extends TupleScheme<ThriftTaskID> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftTaskID struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetJobID()) {
        optionals.set(0);
      }
      if (struct.isSetTaskType()) {
        optionals.set(1);
      }
      if (struct.isSetTaskID()) {
        optionals.set(2);
      }
      if (struct.isSetAsString()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetJobID()) {
        struct.jobID.write(oprot);
      }
      if (struct.isSetTaskType()) {
        oprot.writeI32(struct.taskType.getValue());
      }
      if (struct.isSetTaskID()) {
        oprot.writeI32(struct.taskID);
      }
      if (struct.isSetAsString()) {
        oprot.writeString(struct.asString);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftTaskID struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.jobID = new ThriftJobID();
        struct.jobID.read(iprot);
        struct.setJobIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.taskType = ThriftTaskType.findByValue(iprot.readI32());
        struct.setTaskTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.taskID = iprot.readI32();
        struct.setTaskIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.asString = iprot.readString();
        struct.setAsStringIsSet(true);
      }
    }
  }

}

