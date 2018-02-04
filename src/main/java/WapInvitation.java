/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class WapInvitation implements org.apache.thrift.TBase<WapInvitation, WapInvitation._Fields>, java.io.Serializable, Cloneable, Comparable<WapInvitation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WapInvitation");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField INVITEE_EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("inviteeEmail", org.apache.thrift.protocol.TType.STRING, (short)10);
  private static final org.apache.thrift.protocol.TField INVITER_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("inviterMid", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField ROOM_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("roomMid", org.apache.thrift.protocol.TType.STRING, (short)12);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WapInvitationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WapInvitationTupleSchemeFactory());
  }

  /**
   * 
   * @see WapInvitationType
   */
  public WapInvitationType type; // required
  public String inviteeEmail; // required
  public String inviterMid; // required
  public String roomMid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see WapInvitationType
     */
    TYPE((short)1, "type"),
    INVITEE_EMAIL((short)10, "inviteeEmail"),
    INVITER_MID((short)11, "inviterMid"),
    ROOM_MID((short)12, "roomMid");

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
        case 1: // TYPE
          return TYPE;
        case 10: // INVITEE_EMAIL
          return INVITEE_EMAIL;
        case 11: // INVITER_MID
          return INVITER_MID;
        case 12: // ROOM_MID
          return ROOM_MID;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, WapInvitationType.class)));
    tmpMap.put(_Fields.INVITEE_EMAIL, new org.apache.thrift.meta_data.FieldMetaData("inviteeEmail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INVITER_MID, new org.apache.thrift.meta_data.FieldMetaData("inviterMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROOM_MID, new org.apache.thrift.meta_data.FieldMetaData("roomMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WapInvitation.class, metaDataMap);
  }

  public WapInvitation() {
  }

  public WapInvitation(
    WapInvitationType type,
    String inviteeEmail,
    String inviterMid,
    String roomMid)
  {
    this();
    this.type = type;
    this.inviteeEmail = inviteeEmail;
    this.inviterMid = inviterMid;
    this.roomMid = roomMid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WapInvitation(WapInvitation other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetInviteeEmail()) {
      this.inviteeEmail = other.inviteeEmail;
    }
    if (other.isSetInviterMid()) {
      this.inviterMid = other.inviterMid;
    }
    if (other.isSetRoomMid()) {
      this.roomMid = other.roomMid;
    }
  }

  public WapInvitation deepCopy() {
    return new WapInvitation(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.inviteeEmail = null;
    this.inviterMid = null;
    this.roomMid = null;
  }

  /**
   * 
   * @see WapInvitationType
   */
  public WapInvitationType getType() {
    return this.type;
  }

  /**
   * 
   * @see WapInvitationType
   */
  public WapInvitation setType(WapInvitationType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getInviteeEmail() {
    return this.inviteeEmail;
  }

  public WapInvitation setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
    return this;
  }

  public void unsetInviteeEmail() {
    this.inviteeEmail = null;
  }

  /** Returns true if field inviteeEmail is set (has been assigned a value) and false otherwise */
  public boolean isSetInviteeEmail() {
    return this.inviteeEmail != null;
  }

  public void setInviteeEmailIsSet(boolean value) {
    if (!value) {
      this.inviteeEmail = null;
    }
  }

  public String getInviterMid() {
    return this.inviterMid;
  }

  public WapInvitation setInviterMid(String inviterMid) {
    this.inviterMid = inviterMid;
    return this;
  }

  public void unsetInviterMid() {
    this.inviterMid = null;
  }

  /** Returns true if field inviterMid is set (has been assigned a value) and false otherwise */
  public boolean isSetInviterMid() {
    return this.inviterMid != null;
  }

  public void setInviterMidIsSet(boolean value) {
    if (!value) {
      this.inviterMid = null;
    }
  }

  public String getRoomMid() {
    return this.roomMid;
  }

  public WapInvitation setRoomMid(String roomMid) {
    this.roomMid = roomMid;
    return this;
  }

  public void unsetRoomMid() {
    this.roomMid = null;
  }

  /** Returns true if field roomMid is set (has been assigned a value) and false otherwise */
  public boolean isSetRoomMid() {
    return this.roomMid != null;
  }

  public void setRoomMidIsSet(boolean value) {
    if (!value) {
      this.roomMid = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((WapInvitationType)value);
      }
      break;

    case INVITEE_EMAIL:
      if (value == null) {
        unsetInviteeEmail();
      } else {
        setInviteeEmail((String)value);
      }
      break;

    case INVITER_MID:
      if (value == null) {
        unsetInviterMid();
      } else {
        setInviterMid((String)value);
      }
      break;

    case ROOM_MID:
      if (value == null) {
        unsetRoomMid();
      } else {
        setRoomMid((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case INVITEE_EMAIL:
      return getInviteeEmail();

    case INVITER_MID:
      return getInviterMid();

    case ROOM_MID:
      return getRoomMid();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case INVITEE_EMAIL:
      return isSetInviteeEmail();
    case INVITER_MID:
      return isSetInviterMid();
    case ROOM_MID:
      return isSetRoomMid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WapInvitation)
      return this.equals((WapInvitation)that);
    return false;
  }

  public boolean equals(WapInvitation that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_inviteeEmail = true && this.isSetInviteeEmail();
    boolean that_present_inviteeEmail = true && that.isSetInviteeEmail();
    if (this_present_inviteeEmail || that_present_inviteeEmail) {
      if (!(this_present_inviteeEmail && that_present_inviteeEmail))
        return false;
      if (!this.inviteeEmail.equals(that.inviteeEmail))
        return false;
    }

    boolean this_present_inviterMid = true && this.isSetInviterMid();
    boolean that_present_inviterMid = true && that.isSetInviterMid();
    if (this_present_inviterMid || that_present_inviterMid) {
      if (!(this_present_inviterMid && that_present_inviterMid))
        return false;
      if (!this.inviterMid.equals(that.inviterMid))
        return false;
    }

    boolean this_present_roomMid = true && this.isSetRoomMid();
    boolean that_present_roomMid = true && that.isSetRoomMid();
    if (this_present_roomMid || that_present_roomMid) {
      if (!(this_present_roomMid && that_present_roomMid))
        return false;
      if (!this.roomMid.equals(that.roomMid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(WapInvitation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInviteeEmail()).compareTo(other.isSetInviteeEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInviteeEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inviteeEmail, other.inviteeEmail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInviterMid()).compareTo(other.isSetInviterMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInviterMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inviterMid, other.inviterMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoomMid()).compareTo(other.isSetRoomMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoomMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roomMid, other.roomMid);
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
    StringBuilder sb = new StringBuilder("WapInvitation(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inviteeEmail:");
    if (this.inviteeEmail == null) {
      sb.append("null");
    } else {
      sb.append(this.inviteeEmail);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inviterMid:");
    if (this.inviterMid == null) {
      sb.append("null");
    } else {
      sb.append(this.inviterMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roomMid:");
    if (this.roomMid == null) {
      sb.append("null");
    } else {
      sb.append(this.roomMid);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WapInvitationStandardSchemeFactory implements SchemeFactory {
    public WapInvitationStandardScheme getScheme() {
      return new WapInvitationStandardScheme();
    }
  }

  private static class WapInvitationStandardScheme extends StandardScheme<WapInvitation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WapInvitation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = WapInvitationType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // INVITEE_EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.inviteeEmail = iprot.readString();
              struct.setInviteeEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // INVITER_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.inviterMid = iprot.readString();
              struct.setInviterMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // ROOM_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roomMid = iprot.readString();
              struct.setRoomMidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WapInvitation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.inviteeEmail != null) {
        oprot.writeFieldBegin(INVITEE_EMAIL_FIELD_DESC);
        oprot.writeString(struct.inviteeEmail);
        oprot.writeFieldEnd();
      }
      if (struct.inviterMid != null) {
        oprot.writeFieldBegin(INVITER_MID_FIELD_DESC);
        oprot.writeString(struct.inviterMid);
        oprot.writeFieldEnd();
      }
      if (struct.roomMid != null) {
        oprot.writeFieldBegin(ROOM_MID_FIELD_DESC);
        oprot.writeString(struct.roomMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WapInvitationTupleSchemeFactory implements SchemeFactory {
    public WapInvitationTupleScheme getScheme() {
      return new WapInvitationTupleScheme();
    }
  }

  private static class WapInvitationTupleScheme extends TupleScheme<WapInvitation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WapInvitation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetInviteeEmail()) {
        optionals.set(1);
      }
      if (struct.isSetInviterMid()) {
        optionals.set(2);
      }
      if (struct.isSetRoomMid()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetInviteeEmail()) {
        oprot.writeString(struct.inviteeEmail);
      }
      if (struct.isSetInviterMid()) {
        oprot.writeString(struct.inviterMid);
      }
      if (struct.isSetRoomMid()) {
        oprot.writeString(struct.roomMid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WapInvitation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.type = WapInvitationType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.inviteeEmail = iprot.readString();
        struct.setInviteeEmailIsSet(true);
      }
      if (incoming.get(2)) {
        struct.inviterMid = iprot.readString();
        struct.setInviterMidIsSet(true);
      }
      if (incoming.get(3)) {
        struct.roomMid = iprot.readString();
        struct.setRoomMidIsSet(true);
      }
    }
  }

}

