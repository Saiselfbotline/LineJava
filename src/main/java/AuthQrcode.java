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

public class AuthQrcode implements org.apache.thrift.TBase<AuthQrcode, AuthQrcode._Fields>, java.io.Serializable, Cloneable, Comparable<AuthQrcode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthQrcode");

  private static final org.apache.thrift.protocol.TField QRCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("qrcode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("verifier", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CALLBACK_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("callbackUrl", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthQrcodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuthQrcodeTupleSchemeFactory());
  }

  public String qrcode; // required
  public String verifier; // required
  public String callbackUrl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QRCODE((short)1, "qrcode"),
    VERIFIER((short)2, "verifier"),
    CALLBACK_URL((short)3, "callbackUrl");

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
        case 1: // QRCODE
          return QRCODE;
        case 2: // VERIFIER
          return VERIFIER;
        case 3: // CALLBACK_URL
          return CALLBACK_URL;
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
    tmpMap.put(_Fields.QRCODE, new org.apache.thrift.meta_data.FieldMetaData("qrcode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERIFIER, new org.apache.thrift.meta_data.FieldMetaData("verifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CALLBACK_URL, new org.apache.thrift.meta_data.FieldMetaData("callbackUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthQrcode.class, metaDataMap);
  }

  public AuthQrcode() {
  }

  public AuthQrcode(
    String qrcode,
    String verifier,
    String callbackUrl)
  {
    this();
    this.qrcode = qrcode;
    this.verifier = verifier;
    this.callbackUrl = callbackUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthQrcode(AuthQrcode other) {
    if (other.isSetQrcode()) {
      this.qrcode = other.qrcode;
    }
    if (other.isSetVerifier()) {
      this.verifier = other.verifier;
    }
    if (other.isSetCallbackUrl()) {
      this.callbackUrl = other.callbackUrl;
    }
  }

  public AuthQrcode deepCopy() {
    return new AuthQrcode(this);
  }

  @Override
  public void clear() {
    this.qrcode = null;
    this.verifier = null;
    this.callbackUrl = null;
  }

  public String getQrcode() {
    return this.qrcode;
  }

  public AuthQrcode setQrcode(String qrcode) {
    this.qrcode = qrcode;
    return this;
  }

  public void unsetQrcode() {
    this.qrcode = null;
  }

  /** Returns true if field qrcode is set (has been assigned a value) and false otherwise */
  public boolean isSetQrcode() {
    return this.qrcode != null;
  }

  public void setQrcodeIsSet(boolean value) {
    if (!value) {
      this.qrcode = null;
    }
  }

  public String getVerifier() {
    return this.verifier;
  }

  public AuthQrcode setVerifier(String verifier) {
    this.verifier = verifier;
    return this;
  }

  public void unsetVerifier() {
    this.verifier = null;
  }

  /** Returns true if field verifier is set (has been assigned a value) and false otherwise */
  public boolean isSetVerifier() {
    return this.verifier != null;
  }

  public void setVerifierIsSet(boolean value) {
    if (!value) {
      this.verifier = null;
    }
  }

  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  public AuthQrcode setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  public void unsetCallbackUrl() {
    this.callbackUrl = null;
  }

  /** Returns true if field callbackUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetCallbackUrl() {
    return this.callbackUrl != null;
  }

  public void setCallbackUrlIsSet(boolean value) {
    if (!value) {
      this.callbackUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QRCODE:
      if (value == null) {
        unsetQrcode();
      } else {
        setQrcode((String)value);
      }
      break;

    case VERIFIER:
      if (value == null) {
        unsetVerifier();
      } else {
        setVerifier((String)value);
      }
      break;

    case CALLBACK_URL:
      if (value == null) {
        unsetCallbackUrl();
      } else {
        setCallbackUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QRCODE:
      return getQrcode();

    case VERIFIER:
      return getVerifier();

    case CALLBACK_URL:
      return getCallbackUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QRCODE:
      return isSetQrcode();
    case VERIFIER:
      return isSetVerifier();
    case CALLBACK_URL:
      return isSetCallbackUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthQrcode)
      return this.equals((AuthQrcode)that);
    return false;
  }

  public boolean equals(AuthQrcode that) {
    if (that == null)
      return false;

    boolean this_present_qrcode = true && this.isSetQrcode();
    boolean that_present_qrcode = true && that.isSetQrcode();
    if (this_present_qrcode || that_present_qrcode) {
      if (!(this_present_qrcode && that_present_qrcode))
        return false;
      if (!this.qrcode.equals(that.qrcode))
        return false;
    }

    boolean this_present_verifier = true && this.isSetVerifier();
    boolean that_present_verifier = true && that.isSetVerifier();
    if (this_present_verifier || that_present_verifier) {
      if (!(this_present_verifier && that_present_verifier))
        return false;
      if (!this.verifier.equals(that.verifier))
        return false;
    }

    boolean this_present_callbackUrl = true && this.isSetCallbackUrl();
    boolean that_present_callbackUrl = true && that.isSetCallbackUrl();
    if (this_present_callbackUrl || that_present_callbackUrl) {
      if (!(this_present_callbackUrl && that_present_callbackUrl))
        return false;
      if (!this.callbackUrl.equals(that.callbackUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(AuthQrcode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQrcode()).compareTo(other.isSetQrcode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQrcode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qrcode, other.qrcode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVerifier()).compareTo(other.isSetVerifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVerifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.verifier, other.verifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCallbackUrl()).compareTo(other.isSetCallbackUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCallbackUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.callbackUrl, other.callbackUrl);
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
    StringBuilder sb = new StringBuilder("AuthQrcode(");
    boolean first = true;

    sb.append("qrcode:");
    if (this.qrcode == null) {
      sb.append("null");
    } else {
      sb.append(this.qrcode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("verifier:");
    if (this.verifier == null) {
      sb.append("null");
    } else {
      sb.append(this.verifier);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("callbackUrl:");
    if (this.callbackUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.callbackUrl);
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

  private static class AuthQrcodeStandardSchemeFactory implements SchemeFactory {
    public AuthQrcodeStandardScheme getScheme() {
      return new AuthQrcodeStandardScheme();
    }
  }

  private static class AuthQrcodeStandardScheme extends StandardScheme<AuthQrcode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthQrcode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QRCODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.qrcode = iprot.readString();
              struct.setQrcodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.verifier = iprot.readString();
              struct.setVerifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CALLBACK_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.callbackUrl = iprot.readString();
              struct.setCallbackUrlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthQrcode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.qrcode != null) {
        oprot.writeFieldBegin(QRCODE_FIELD_DESC);
        oprot.writeString(struct.qrcode);
        oprot.writeFieldEnd();
      }
      if (struct.verifier != null) {
        oprot.writeFieldBegin(VERIFIER_FIELD_DESC);
        oprot.writeString(struct.verifier);
        oprot.writeFieldEnd();
      }
      if (struct.callbackUrl != null) {
        oprot.writeFieldBegin(CALLBACK_URL_FIELD_DESC);
        oprot.writeString(struct.callbackUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthQrcodeTupleSchemeFactory implements SchemeFactory {
    public AuthQrcodeTupleScheme getScheme() {
      return new AuthQrcodeTupleScheme();
    }
  }

  private static class AuthQrcodeTupleScheme extends TupleScheme<AuthQrcode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthQrcode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetQrcode()) {
        optionals.set(0);
      }
      if (struct.isSetVerifier()) {
        optionals.set(1);
      }
      if (struct.isSetCallbackUrl()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetQrcode()) {
        oprot.writeString(struct.qrcode);
      }
      if (struct.isSetVerifier()) {
        oprot.writeString(struct.verifier);
      }
      if (struct.isSetCallbackUrl()) {
        oprot.writeString(struct.callbackUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthQrcode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.qrcode = iprot.readString();
        struct.setQrcodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.verifier = iprot.readString();
        struct.setVerifierIsSet(true);
      }
      if (incoming.get(2)) {
        struct.callbackUrl = iprot.readString();
        struct.setCallbackUrlIsSet(true);
      }
    }
  }

}

