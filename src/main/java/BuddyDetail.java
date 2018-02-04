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

public class BuddyDetail implements org.apache.thrift.TBase<BuddyDetail, BuddyDetail._Fields>, java.io.Serializable, Cloneable, Comparable<BuddyDetail> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuddyDetail");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MEMBER_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("memberCount", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ON_AIR_FIELD_DESC = new org.apache.thrift.protocol.TField("onAir", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField BUSINESS_ACCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("businessAccount", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField ADDABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("addable", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField ACCEPTABLE_CONTENT_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("acceptableContentTypes", org.apache.thrift.protocol.TType.SET, (short)6);
  private static final org.apache.thrift.protocol.TField CAPABLE_MYHOME_FIELD_DESC = new org.apache.thrift.protocol.TField("capableMyhome", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuddyDetailStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuddyDetailTupleSchemeFactory());
  }

  public String mid; // required
  public long memberCount; // required
  public boolean onAir; // required
  public boolean businessAccount; // required
  public boolean addable; // required
  public Set<ContentType> acceptableContentTypes; // required
  public boolean capableMyhome; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    MEMBER_COUNT((short)2, "memberCount"),
    ON_AIR((short)3, "onAir"),
    BUSINESS_ACCOUNT((short)4, "businessAccount"),
    ADDABLE((short)5, "addable"),
    ACCEPTABLE_CONTENT_TYPES((short)6, "acceptableContentTypes"),
    CAPABLE_MYHOME((short)7, "capableMyhome");

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
        case 1: // MID
          return MID;
        case 2: // MEMBER_COUNT
          return MEMBER_COUNT;
        case 3: // ON_AIR
          return ON_AIR;
        case 4: // BUSINESS_ACCOUNT
          return BUSINESS_ACCOUNT;
        case 5: // ADDABLE
          return ADDABLE;
        case 6: // ACCEPTABLE_CONTENT_TYPES
          return ACCEPTABLE_CONTENT_TYPES;
        case 7: // CAPABLE_MYHOME
          return CAPABLE_MYHOME;
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
  private static final int __MEMBERCOUNT_ISSET_ID = 0;
  private static final int __ONAIR_ISSET_ID = 1;
  private static final int __BUSINESSACCOUNT_ISSET_ID = 2;
  private static final int __ADDABLE_ISSET_ID = 3;
  private static final int __CAPABLEMYHOME_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MEMBER_COUNT, new org.apache.thrift.meta_data.FieldMetaData("memberCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ON_AIR, new org.apache.thrift.meta_data.FieldMetaData("onAir", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BUSINESS_ACCOUNT, new org.apache.thrift.meta_data.FieldMetaData("businessAccount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ADDABLE, new org.apache.thrift.meta_data.FieldMetaData("addable", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ACCEPTABLE_CONTENT_TYPES, new org.apache.thrift.meta_data.FieldMetaData("acceptableContentTypes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ContentType.class))));
    tmpMap.put(_Fields.CAPABLE_MYHOME, new org.apache.thrift.meta_data.FieldMetaData("capableMyhome", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuddyDetail.class, metaDataMap);
  }

  public BuddyDetail() {
  }

  public BuddyDetail(
    String mid,
    long memberCount,
    boolean onAir,
    boolean businessAccount,
    boolean addable,
    Set<ContentType> acceptableContentTypes,
    boolean capableMyhome)
  {
    this();
    this.mid = mid;
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
    this.onAir = onAir;
    setOnAirIsSet(true);
    this.businessAccount = businessAccount;
    setBusinessAccountIsSet(true);
    this.addable = addable;
    setAddableIsSet(true);
    this.acceptableContentTypes = acceptableContentTypes;
    this.capableMyhome = capableMyhome;
    setCapableMyhomeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddyDetail(BuddyDetail other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.memberCount = other.memberCount;
    this.onAir = other.onAir;
    this.businessAccount = other.businessAccount;
    this.addable = other.addable;
    if (other.isSetAcceptableContentTypes()) {
      Set<ContentType> __this__acceptableContentTypes = new HashSet<ContentType>(other.acceptableContentTypes.size());
      for (ContentType other_element : other.acceptableContentTypes) {
        __this__acceptableContentTypes.add(other_element);
      }
      this.acceptableContentTypes = __this__acceptableContentTypes;
    }
    this.capableMyhome = other.capableMyhome;
  }

  public BuddyDetail deepCopy() {
    return new BuddyDetail(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    setMemberCountIsSet(false);
    this.memberCount = 0;
    setOnAirIsSet(false);
    this.onAir = false;
    setBusinessAccountIsSet(false);
    this.businessAccount = false;
    setAddableIsSet(false);
    this.addable = false;
    this.acceptableContentTypes = null;
    setCapableMyhomeIsSet(false);
    this.capableMyhome = false;
  }

  public String getMid() {
    return this.mid;
  }

  public BuddyDetail setMid(String mid) {
    this.mid = mid;
    return this;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public long getMemberCount() {
    return this.memberCount;
  }

  public BuddyDetail setMemberCount(long memberCount) {
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
    return this;
  }

  public void unsetMemberCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID);
  }

  /** Returns true if field memberCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberCount() {
    return EncodingUtils.testBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID);
  }

  public void setMemberCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID, value);
  }

  public boolean isOnAir() {
    return this.onAir;
  }

  public BuddyDetail setOnAir(boolean onAir) {
    this.onAir = onAir;
    setOnAirIsSet(true);
    return this;
  }

  public void unsetOnAir() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ONAIR_ISSET_ID);
  }

  /** Returns true if field onAir is set (has been assigned a value) and false otherwise */
  public boolean isSetOnAir() {
    return EncodingUtils.testBit(__isset_bitfield, __ONAIR_ISSET_ID);
  }

  public void setOnAirIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ONAIR_ISSET_ID, value);
  }

  public boolean isBusinessAccount() {
    return this.businessAccount;
  }

  public BuddyDetail setBusinessAccount(boolean businessAccount) {
    this.businessAccount = businessAccount;
    setBusinessAccountIsSet(true);
    return this;
  }

  public void unsetBusinessAccount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BUSINESSACCOUNT_ISSET_ID);
  }

  /** Returns true if field businessAccount is set (has been assigned a value) and false otherwise */
  public boolean isSetBusinessAccount() {
    return EncodingUtils.testBit(__isset_bitfield, __BUSINESSACCOUNT_ISSET_ID);
  }

  public void setBusinessAccountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BUSINESSACCOUNT_ISSET_ID, value);
  }

  public boolean isAddable() {
    return this.addable;
  }

  public BuddyDetail setAddable(boolean addable) {
    this.addable = addable;
    setAddableIsSet(true);
    return this;
  }

  public void unsetAddable() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ADDABLE_ISSET_ID);
  }

  /** Returns true if field addable is set (has been assigned a value) and false otherwise */
  public boolean isSetAddable() {
    return EncodingUtils.testBit(__isset_bitfield, __ADDABLE_ISSET_ID);
  }

  public void setAddableIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ADDABLE_ISSET_ID, value);
  }

  public int getAcceptableContentTypesSize() {
    return (this.acceptableContentTypes == null) ? 0 : this.acceptableContentTypes.size();
  }

  public java.util.Iterator<ContentType> getAcceptableContentTypesIterator() {
    return (this.acceptableContentTypes == null) ? null : this.acceptableContentTypes.iterator();
  }

  public void addToAcceptableContentTypes(ContentType elem) {
    if (this.acceptableContentTypes == null) {
      this.acceptableContentTypes = new HashSet<ContentType>();
    }
    this.acceptableContentTypes.add(elem);
  }

  public Set<ContentType> getAcceptableContentTypes() {
    return this.acceptableContentTypes;
  }

  public BuddyDetail setAcceptableContentTypes(Set<ContentType> acceptableContentTypes) {
    this.acceptableContentTypes = acceptableContentTypes;
    return this;
  }

  public void unsetAcceptableContentTypes() {
    this.acceptableContentTypes = null;
  }

  /** Returns true if field acceptableContentTypes is set (has been assigned a value) and false otherwise */
  public boolean isSetAcceptableContentTypes() {
    return this.acceptableContentTypes != null;
  }

  public void setAcceptableContentTypesIsSet(boolean value) {
    if (!value) {
      this.acceptableContentTypes = null;
    }
  }

  public boolean isCapableMyhome() {
    return this.capableMyhome;
  }

  public BuddyDetail setCapableMyhome(boolean capableMyhome) {
    this.capableMyhome = capableMyhome;
    setCapableMyhomeIsSet(true);
    return this;
  }

  public void unsetCapableMyhome() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CAPABLEMYHOME_ISSET_ID);
  }

  /** Returns true if field capableMyhome is set (has been assigned a value) and false otherwise */
  public boolean isSetCapableMyhome() {
    return EncodingUtils.testBit(__isset_bitfield, __CAPABLEMYHOME_ISSET_ID);
  }

  public void setCapableMyhomeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CAPABLEMYHOME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((String)value);
      }
      break;

    case MEMBER_COUNT:
      if (value == null) {
        unsetMemberCount();
      } else {
        setMemberCount((Long)value);
      }
      break;

    case ON_AIR:
      if (value == null) {
        unsetOnAir();
      } else {
        setOnAir((Boolean)value);
      }
      break;

    case BUSINESS_ACCOUNT:
      if (value == null) {
        unsetBusinessAccount();
      } else {
        setBusinessAccount((Boolean)value);
      }
      break;

    case ADDABLE:
      if (value == null) {
        unsetAddable();
      } else {
        setAddable((Boolean)value);
      }
      break;

    case ACCEPTABLE_CONTENT_TYPES:
      if (value == null) {
        unsetAcceptableContentTypes();
      } else {
        setAcceptableContentTypes((Set<ContentType>)value);
      }
      break;

    case CAPABLE_MYHOME:
      if (value == null) {
        unsetCapableMyhome();
      } else {
        setCapableMyhome((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case MEMBER_COUNT:
      return Long.valueOf(getMemberCount());

    case ON_AIR:
      return Boolean.valueOf(isOnAir());

    case BUSINESS_ACCOUNT:
      return Boolean.valueOf(isBusinessAccount());

    case ADDABLE:
      return Boolean.valueOf(isAddable());

    case ACCEPTABLE_CONTENT_TYPES:
      return getAcceptableContentTypes();

    case CAPABLE_MYHOME:
      return Boolean.valueOf(isCapableMyhome());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MID:
      return isSetMid();
    case MEMBER_COUNT:
      return isSetMemberCount();
    case ON_AIR:
      return isSetOnAir();
    case BUSINESS_ACCOUNT:
      return isSetBusinessAccount();
    case ADDABLE:
      return isSetAddable();
    case ACCEPTABLE_CONTENT_TYPES:
      return isSetAcceptableContentTypes();
    case CAPABLE_MYHOME:
      return isSetCapableMyhome();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddyDetail)
      return this.equals((BuddyDetail)that);
    return false;
  }

  public boolean equals(BuddyDetail that) {
    if (that == null)
      return false;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_memberCount = true;
    boolean that_present_memberCount = true;
    if (this_present_memberCount || that_present_memberCount) {
      if (!(this_present_memberCount && that_present_memberCount))
        return false;
      if (this.memberCount != that.memberCount)
        return false;
    }

    boolean this_present_onAir = true;
    boolean that_present_onAir = true;
    if (this_present_onAir || that_present_onAir) {
      if (!(this_present_onAir && that_present_onAir))
        return false;
      if (this.onAir != that.onAir)
        return false;
    }

    boolean this_present_businessAccount = true;
    boolean that_present_businessAccount = true;
    if (this_present_businessAccount || that_present_businessAccount) {
      if (!(this_present_businessAccount && that_present_businessAccount))
        return false;
      if (this.businessAccount != that.businessAccount)
        return false;
    }

    boolean this_present_addable = true;
    boolean that_present_addable = true;
    if (this_present_addable || that_present_addable) {
      if (!(this_present_addable && that_present_addable))
        return false;
      if (this.addable != that.addable)
        return false;
    }

    boolean this_present_acceptableContentTypes = true && this.isSetAcceptableContentTypes();
    boolean that_present_acceptableContentTypes = true && that.isSetAcceptableContentTypes();
    if (this_present_acceptableContentTypes || that_present_acceptableContentTypes) {
      if (!(this_present_acceptableContentTypes && that_present_acceptableContentTypes))
        return false;
      if (!this.acceptableContentTypes.equals(that.acceptableContentTypes))
        return false;
    }

    boolean this_present_capableMyhome = true;
    boolean that_present_capableMyhome = true;
    if (this_present_capableMyhome || that_present_capableMyhome) {
      if (!(this_present_capableMyhome && that_present_capableMyhome))
        return false;
      if (this.capableMyhome != that.capableMyhome)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(BuddyDetail other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMemberCount()).compareTo(other.isSetMemberCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memberCount, other.memberCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOnAir()).compareTo(other.isSetOnAir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnAir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.onAir, other.onAir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBusinessAccount()).compareTo(other.isSetBusinessAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessAccount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.businessAccount, other.businessAccount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddable()).compareTo(other.isSetAddable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.addable, other.addable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAcceptableContentTypes()).compareTo(other.isSetAcceptableContentTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAcceptableContentTypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.acceptableContentTypes, other.acceptableContentTypes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCapableMyhome()).compareTo(other.isSetCapableMyhome());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCapableMyhome()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.capableMyhome, other.capableMyhome);
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
    StringBuilder sb = new StringBuilder("BuddyDetail(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("memberCount:");
    sb.append(this.memberCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("onAir:");
    sb.append(this.onAir);
    first = false;
    if (!first) sb.append(", ");
    sb.append("businessAccount:");
    sb.append(this.businessAccount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("addable:");
    sb.append(this.addable);
    first = false;
    if (!first) sb.append(", ");
    sb.append("acceptableContentTypes:");
    if (this.acceptableContentTypes == null) {
      sb.append("null");
    } else {
      sb.append(this.acceptableContentTypes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("capableMyhome:");
    sb.append(this.capableMyhome);
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

  private static class BuddyDetailStandardSchemeFactory implements SchemeFactory {
    public BuddyDetailStandardScheme getScheme() {
      return new BuddyDetailStandardScheme();
    }
  }

  private static class BuddyDetailStandardScheme extends StandardScheme<BuddyDetail> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuddyDetail struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MEMBER_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.memberCount = iprot.readI64();
              struct.setMemberCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ON_AIR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.onAir = iprot.readBool();
              struct.setOnAirIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BUSINESS_ACCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.businessAccount = iprot.readBool();
              struct.setBusinessAccountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ADDABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.addable = iprot.readBool();
              struct.setAddableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ACCEPTABLE_CONTENT_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set24 = iprot.readSetBegin();
                struct.acceptableContentTypes = new HashSet<ContentType>(2*_set24.size);
                for (int _i25 = 0; _i25 < _set24.size; ++_i25)
                {
                  ContentType _elem26;
                  _elem26 = ContentType.findByValue(iprot.readI32());
                  struct.acceptableContentTypes.add(_elem26);
                }
                iprot.readSetEnd();
              }
              struct.setAcceptableContentTypesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CAPABLE_MYHOME
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.capableMyhome = iprot.readBool();
              struct.setCapableMyhomeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuddyDetail struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MEMBER_COUNT_FIELD_DESC);
      oprot.writeI64(struct.memberCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ON_AIR_FIELD_DESC);
      oprot.writeBool(struct.onAir);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BUSINESS_ACCOUNT_FIELD_DESC);
      oprot.writeBool(struct.businessAccount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ADDABLE_FIELD_DESC);
      oprot.writeBool(struct.addable);
      oprot.writeFieldEnd();
      if (struct.acceptableContentTypes != null) {
        oprot.writeFieldBegin(ACCEPTABLE_CONTENT_TYPES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.acceptableContentTypes.size()));
          for (ContentType _iter27 : struct.acceptableContentTypes)
          {
            oprot.writeI32(_iter27.getValue());
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CAPABLE_MYHOME_FIELD_DESC);
      oprot.writeBool(struct.capableMyhome);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuddyDetailTupleSchemeFactory implements SchemeFactory {
    public BuddyDetailTupleScheme getScheme() {
      return new BuddyDetailTupleScheme();
    }
  }

  private static class BuddyDetailTupleScheme extends TupleScheme<BuddyDetail> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuddyDetail struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetMemberCount()) {
        optionals.set(1);
      }
      if (struct.isSetOnAir()) {
        optionals.set(2);
      }
      if (struct.isSetBusinessAccount()) {
        optionals.set(3);
      }
      if (struct.isSetAddable()) {
        optionals.set(4);
      }
      if (struct.isSetAcceptableContentTypes()) {
        optionals.set(5);
      }
      if (struct.isSetCapableMyhome()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetMemberCount()) {
        oprot.writeI64(struct.memberCount);
      }
      if (struct.isSetOnAir()) {
        oprot.writeBool(struct.onAir);
      }
      if (struct.isSetBusinessAccount()) {
        oprot.writeBool(struct.businessAccount);
      }
      if (struct.isSetAddable()) {
        oprot.writeBool(struct.addable);
      }
      if (struct.isSetAcceptableContentTypes()) {
        {
          oprot.writeI32(struct.acceptableContentTypes.size());
          for (ContentType _iter28 : struct.acceptableContentTypes)
          {
            oprot.writeI32(_iter28.getValue());
          }
        }
      }
      if (struct.isSetCapableMyhome()) {
        oprot.writeBool(struct.capableMyhome);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuddyDetail struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.memberCount = iprot.readI64();
        struct.setMemberCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.onAir = iprot.readBool();
        struct.setOnAirIsSet(true);
      }
      if (incoming.get(3)) {
        struct.businessAccount = iprot.readBool();
        struct.setBusinessAccountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.addable = iprot.readBool();
        struct.setAddableIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TSet _set29 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.acceptableContentTypes = new HashSet<ContentType>(2*_set29.size);
          for (int _i30 = 0; _i30 < _set29.size; ++_i30)
          {
            ContentType _elem31;
            _elem31 = ContentType.findByValue(iprot.readI32());
            struct.acceptableContentTypes.add(_elem31);
          }
        }
        struct.setAcceptableContentTypesIsSet(true);
      }
      if (incoming.get(6)) {
        struct.capableMyhome = iprot.readBool();
        struct.setCapableMyhomeIsSet(true);
      }
    }
  }

}

