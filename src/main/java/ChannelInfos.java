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

public class ChannelInfos implements org.apache.thrift.TBase<ChannelInfos, ChannelInfos._Fields>, java.io.Serializable, Cloneable, Comparable<ChannelInfos> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChannelInfos");

  private static final org.apache.thrift.protocol.TField CHANNEL_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("channelInfos", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChannelInfosStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChannelInfosTupleSchemeFactory());
  }

  public List<ChannelInfo> channelInfos; // required
  public long revision; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHANNEL_INFOS((short)1, "channelInfos"),
    REVISION((short)2, "revision");

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
        case 1: // CHANNEL_INFOS
          return CHANNEL_INFOS;
        case 2: // REVISION
          return REVISION;
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
  private static final int __REVISION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHANNEL_INFOS, new org.apache.thrift.meta_data.FieldMetaData("channelInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ChannelInfo.class))));
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChannelInfos.class, metaDataMap);
  }

  public ChannelInfos() {
  }

  public ChannelInfos(
    List<ChannelInfo> channelInfos,
    long revision)
  {
    this();
    this.channelInfos = channelInfos;
    this.revision = revision;
    setRevisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChannelInfos(ChannelInfos other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetChannelInfos()) {
      List<ChannelInfo> __this__channelInfos = new ArrayList<ChannelInfo>(other.channelInfos.size());
      for (ChannelInfo other_element : other.channelInfos) {
        __this__channelInfos.add(new ChannelInfo(other_element));
      }
      this.channelInfos = __this__channelInfos;
    }
    this.revision = other.revision;
  }

  public ChannelInfos deepCopy() {
    return new ChannelInfos(this);
  }

  @Override
  public void clear() {
    this.channelInfos = null;
    setRevisionIsSet(false);
    this.revision = 0;
  }

  public int getChannelInfosSize() {
    return (this.channelInfos == null) ? 0 : this.channelInfos.size();
  }

  public java.util.Iterator<ChannelInfo> getChannelInfosIterator() {
    return (this.channelInfos == null) ? null : this.channelInfos.iterator();
  }

  public void addToChannelInfos(ChannelInfo elem) {
    if (this.channelInfos == null) {
      this.channelInfos = new ArrayList<ChannelInfo>();
    }
    this.channelInfos.add(elem);
  }

  public List<ChannelInfo> getChannelInfos() {
    return this.channelInfos;
  }

  public ChannelInfos setChannelInfos(List<ChannelInfo> channelInfos) {
    this.channelInfos = channelInfos;
    return this;
  }

  public void unsetChannelInfos() {
    this.channelInfos = null;
  }

  /** Returns true if field channelInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelInfos() {
    return this.channelInfos != null;
  }

  public void setChannelInfosIsSet(boolean value) {
    if (!value) {
      this.channelInfos = null;
    }
  }

  public long getRevision() {
    return this.revision;
  }

  public ChannelInfos setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
    return this;
  }

  public void unsetRevision() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHANNEL_INFOS:
      if (value == null) {
        unsetChannelInfos();
      } else {
        setChannelInfos((List<ChannelInfo>)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHANNEL_INFOS:
      return getChannelInfos();

    case REVISION:
      return Long.valueOf(getRevision());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHANNEL_INFOS:
      return isSetChannelInfos();
    case REVISION:
      return isSetRevision();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChannelInfos)
      return this.equals((ChannelInfos)that);
    return false;
  }

  public boolean equals(ChannelInfos that) {
    if (that == null)
      return false;

    boolean this_present_channelInfos = true && this.isSetChannelInfos();
    boolean that_present_channelInfos = true && that.isSetChannelInfos();
    if (this_present_channelInfos || that_present_channelInfos) {
      if (!(this_present_channelInfos && that_present_channelInfos))
        return false;
      if (!this.channelInfos.equals(that.channelInfos))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ChannelInfos other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChannelInfos()).compareTo(other.isSetChannelInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelInfos, other.channelInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
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
    StringBuilder sb = new StringBuilder("ChannelInfos(");
    boolean first = true;

    sb.append("channelInfos:");
    if (this.channelInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.channelInfos);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ChannelInfosStandardSchemeFactory implements SchemeFactory {
    public ChannelInfosStandardScheme getScheme() {
      return new ChannelInfosStandardScheme();
    }
  }

  private static class ChannelInfosStandardScheme extends StandardScheme<ChannelInfos> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChannelInfos struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHANNEL_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list88 = iprot.readListBegin();
                struct.channelInfos = new ArrayList<ChannelInfo>(_list88.size);
                for (int _i89 = 0; _i89 < _list88.size; ++_i89)
                {
                  ChannelInfo _elem90;
                  _elem90 = new ChannelInfo();
                  _elem90.read(iprot);
                  struct.channelInfos.add(_elem90);
                }
                iprot.readListEnd();
              }
              struct.setChannelInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.revision = iprot.readI64();
              struct.setRevisionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChannelInfos struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.channelInfos != null) {
        oprot.writeFieldBegin(CHANNEL_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.channelInfos.size()));
          for (ChannelInfo _iter91 : struct.channelInfos)
          {
            _iter91.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(struct.revision);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChannelInfosTupleSchemeFactory implements SchemeFactory {
    public ChannelInfosTupleScheme getScheme() {
      return new ChannelInfosTupleScheme();
    }
  }

  private static class ChannelInfosTupleScheme extends TupleScheme<ChannelInfos> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ChannelInfos struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetChannelInfos()) {
        optionals.set(0);
      }
      if (struct.isSetRevision()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetChannelInfos()) {
        {
          oprot.writeI32(struct.channelInfos.size());
          for (ChannelInfo _iter92 : struct.channelInfos)
          {
            _iter92.write(oprot);
          }
        }
      }
      if (struct.isSetRevision()) {
        oprot.writeI64(struct.revision);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ChannelInfos struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list93 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.channelInfos = new ArrayList<ChannelInfo>(_list93.size);
          for (int _i94 = 0; _i94 < _list93.size; ++_i94)
          {
            ChannelInfo _elem95;
            _elem95 = new ChannelInfo();
            _elem95.read(iprot);
            struct.channelInfos.add(_elem95);
          }
        }
        struct.setChannelInfosIsSet(true);
      }
      if (incoming.get(1)) {
        struct.revision = iprot.readI64();
        struct.setRevisionIsSet(true);
      }
    }
  }

}

