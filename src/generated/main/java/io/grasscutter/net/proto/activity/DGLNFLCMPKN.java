// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code DGLNFLCMPKN}
 */
public final class DGLNFLCMPKN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DGLNFLCMPKN)
    DGLNFLCMPKNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DGLNFLCMPKN.newBuilder() to construct.
  private DGLNFLCMPKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DGLNFLCMPKN() {
    fAPMPNADDDF_ = emptyIntList();
    aMLNLDNJJID_ = emptyIntList();
    cEJABHLHHAC_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DGLNFLCMPKN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DGLNFLCMPKN(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 16: {

            lCDDIDLJEDN_ = input.readUInt32();
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fAPMPNADDDF_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            fAPMPNADDDF_.addInt(input.readUInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              fAPMPNADDDF_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              fAPMPNADDDF_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 56: {

            areaId_ = input.readUInt32();
            break;
          }
          case 88: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              aMLNLDNJJID_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            aMLNLDNJJID_.addInt(input.readUInt32());
            break;
          }
          case 90: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              aMLNLDNJJID_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              aMLNLDNJJID_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 96: {
            int rawValue = input.readEnum();

            cEJABHLHHAC_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fAPMPNADDDF_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        aMLNLDNJJID_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_DGLNFLCMPKN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_DGLNFLCMPKN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.DGLNFLCMPKN.class, io.grasscutter.net.proto.activity.DGLNFLCMPKN.Builder.class);
  }

  public static final int FAPMPNADDDF_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList fAPMPNADDDF_;
  /**
   * <code>repeated uint32 FAPMPNADDDF = 4;</code>
   * @return A list containing the fAPMPNADDDF.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getFAPMPNADDDFList() {
    return fAPMPNADDDF_;
  }
  /**
   * <code>repeated uint32 FAPMPNADDDF = 4;</code>
   * @return The count of fAPMPNADDDF.
   */
  public int getFAPMPNADDDFCount() {
    return fAPMPNADDDF_.size();
  }
  /**
   * <code>repeated uint32 FAPMPNADDDF = 4;</code>
   * @param index The index of the element to return.
   * @return The fAPMPNADDDF at the given index.
   */
  public int getFAPMPNADDDF(int index) {
    return fAPMPNADDDF_.getInt(index);
  }
  private int fAPMPNADDDFMemoizedSerializedSize = -1;

  public static final int AMLNLDNJJID_FIELD_NUMBER = 11;
  private com.google.protobuf.Internal.IntList aMLNLDNJJID_;
  /**
   * <code>repeated uint32 AMLNLDNJJID = 11;</code>
   * @return A list containing the aMLNLDNJJID.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getAMLNLDNJJIDList() {
    return aMLNLDNJJID_;
  }
  /**
   * <code>repeated uint32 AMLNLDNJJID = 11;</code>
   * @return The count of aMLNLDNJJID.
   */
  public int getAMLNLDNJJIDCount() {
    return aMLNLDNJJID_.size();
  }
  /**
   * <code>repeated uint32 AMLNLDNJJID = 11;</code>
   * @param index The index of the element to return.
   * @return The aMLNLDNJJID at the given index.
   */
  public int getAMLNLDNJJID(int index) {
    return aMLNLDNJJID_.getInt(index);
  }
  private int aMLNLDNJJIDMemoizedSerializedSize = -1;

  public static final int LCDDIDLJEDN_FIELD_NUMBER = 2;
  private int lCDDIDLJEDN_;
  /**
   * <code>uint32 LCDDIDLJEDN = 2;</code>
   * @return The lCDDIDLJEDN.
   */
  @java.lang.Override
  public int getLCDDIDLJEDN() {
    return lCDDIDLJEDN_;
  }

  public static final int AREA_ID_FIELD_NUMBER = 7;
  private int areaId_;
  /**
   * <code>uint32 area_id = 7;</code>
   * @return The areaId.
   */
  @java.lang.Override
  public int getAreaId() {
    return areaId_;
  }

  public static final int CEJABHLHHAC_FIELD_NUMBER = 12;
  private int cEJABHLHHAC_;
  /**
   * <code>.BINOOCJMLCB CEJABHLHHAC = 12;</code>
   * @return The enum numeric value on the wire for cEJABHLHHAC.
   */
  @java.lang.Override public int getCEJABHLHHACValue() {
    return cEJABHLHHAC_;
  }
  /**
   * <code>.BINOOCJMLCB CEJABHLHHAC = 12;</code>
   * @return The cEJABHLHHAC.
   */
  @java.lang.Override public io.grasscutter.net.proto.activity.BINOOCJMLCB getCEJABHLHHAC() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.activity.BINOOCJMLCB result = io.grasscutter.net.proto.activity.BINOOCJMLCB.valueOf(cEJABHLHHAC_);
    return result == null ? io.grasscutter.net.proto.activity.BINOOCJMLCB.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (lCDDIDLJEDN_ != 0) {
      output.writeUInt32(2, lCDDIDLJEDN_);
    }
    if (getFAPMPNADDDFList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(fAPMPNADDDFMemoizedSerializedSize);
    }
    for (int i = 0; i < fAPMPNADDDF_.size(); i++) {
      output.writeUInt32NoTag(fAPMPNADDDF_.getInt(i));
    }
    if (areaId_ != 0) {
      output.writeUInt32(7, areaId_);
    }
    if (getAMLNLDNJJIDList().size() > 0) {
      output.writeUInt32NoTag(90);
      output.writeUInt32NoTag(aMLNLDNJJIDMemoizedSerializedSize);
    }
    for (int i = 0; i < aMLNLDNJJID_.size(); i++) {
      output.writeUInt32NoTag(aMLNLDNJJID_.getInt(i));
    }
    if (cEJABHLHHAC_ != io.grasscutter.net.proto.activity.BINOOCJMLCB.BINOOCJMLCB_LUNA_RITE_HINT_STATUS_DEFAULT.getNumber()) {
      output.writeEnum(12, cEJABHLHHAC_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lCDDIDLJEDN_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, lCDDIDLJEDN_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fAPMPNADDDF_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(fAPMPNADDDF_.getInt(i));
      }
      size += dataSize;
      if (!getFAPMPNADDDFList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fAPMPNADDDFMemoizedSerializedSize = dataSize;
    }
    if (areaId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, areaId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < aMLNLDNJJID_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(aMLNLDNJJID_.getInt(i));
      }
      size += dataSize;
      if (!getAMLNLDNJJIDList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      aMLNLDNJJIDMemoizedSerializedSize = dataSize;
    }
    if (cEJABHLHHAC_ != io.grasscutter.net.proto.activity.BINOOCJMLCB.BINOOCJMLCB_LUNA_RITE_HINT_STATUS_DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(12, cEJABHLHHAC_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grasscutter.net.proto.activity.DGLNFLCMPKN)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.DGLNFLCMPKN other = (io.grasscutter.net.proto.activity.DGLNFLCMPKN) obj;

    if (!getFAPMPNADDDFList()
        .equals(other.getFAPMPNADDDFList())) return false;
    if (!getAMLNLDNJJIDList()
        .equals(other.getAMLNLDNJJIDList())) return false;
    if (getLCDDIDLJEDN()
        != other.getLCDDIDLJEDN()) return false;
    if (getAreaId()
        != other.getAreaId()) return false;
    if (cEJABHLHHAC_ != other.cEJABHLHHAC_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFAPMPNADDDFCount() > 0) {
      hash = (37 * hash) + FAPMPNADDDF_FIELD_NUMBER;
      hash = (53 * hash) + getFAPMPNADDDFList().hashCode();
    }
    if (getAMLNLDNJJIDCount() > 0) {
      hash = (37 * hash) + AMLNLDNJJID_FIELD_NUMBER;
      hash = (53 * hash) + getAMLNLDNJJIDList().hashCode();
    }
    hash = (37 * hash) + LCDDIDLJEDN_FIELD_NUMBER;
    hash = (53 * hash) + getLCDDIDLJEDN();
    hash = (37 * hash) + AREA_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAreaId();
    hash = (37 * hash) + CEJABHLHHAC_FIELD_NUMBER;
    hash = (53 * hash) + cEJABHLHHAC_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grasscutter.net.proto.activity.DGLNFLCMPKN prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code DGLNFLCMPKN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DGLNFLCMPKN)
      io.grasscutter.net.proto.activity.DGLNFLCMPKNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DGLNFLCMPKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DGLNFLCMPKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.DGLNFLCMPKN.class, io.grasscutter.net.proto.activity.DGLNFLCMPKN.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.DGLNFLCMPKN.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fAPMPNADDDF_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      aMLNLDNJJID_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      lCDDIDLJEDN_ = 0;

      areaId_ = 0;

      cEJABHLHHAC_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DGLNFLCMPKN_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DGLNFLCMPKN getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.DGLNFLCMPKN.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DGLNFLCMPKN build() {
      io.grasscutter.net.proto.activity.DGLNFLCMPKN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DGLNFLCMPKN buildPartial() {
      io.grasscutter.net.proto.activity.DGLNFLCMPKN result = new io.grasscutter.net.proto.activity.DGLNFLCMPKN(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fAPMPNADDDF_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fAPMPNADDDF_ = fAPMPNADDDF_;
      if (((bitField0_ & 0x00000002) != 0)) {
        aMLNLDNJJID_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.aMLNLDNJJID_ = aMLNLDNJJID_;
      result.lCDDIDLJEDN_ = lCDDIDLJEDN_;
      result.areaId_ = areaId_;
      result.cEJABHLHHAC_ = cEJABHLHHAC_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grasscutter.net.proto.activity.DGLNFLCMPKN) {
        return mergeFrom((io.grasscutter.net.proto.activity.DGLNFLCMPKN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.DGLNFLCMPKN other) {
      if (other == io.grasscutter.net.proto.activity.DGLNFLCMPKN.getDefaultInstance()) return this;
      if (!other.fAPMPNADDDF_.isEmpty()) {
        if (fAPMPNADDDF_.isEmpty()) {
          fAPMPNADDDF_ = other.fAPMPNADDDF_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFAPMPNADDDFIsMutable();
          fAPMPNADDDF_.addAll(other.fAPMPNADDDF_);
        }
        onChanged();
      }
      if (!other.aMLNLDNJJID_.isEmpty()) {
        if (aMLNLDNJJID_.isEmpty()) {
          aMLNLDNJJID_ = other.aMLNLDNJJID_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAMLNLDNJJIDIsMutable();
          aMLNLDNJJID_.addAll(other.aMLNLDNJJID_);
        }
        onChanged();
      }
      if (other.getLCDDIDLJEDN() != 0) {
        setLCDDIDLJEDN(other.getLCDDIDLJEDN());
      }
      if (other.getAreaId() != 0) {
        setAreaId(other.getAreaId());
      }
      if (other.cEJABHLHHAC_ != 0) {
        setCEJABHLHHACValue(other.getCEJABHLHHACValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grasscutter.net.proto.activity.DGLNFLCMPKN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.DGLNFLCMPKN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList fAPMPNADDDF_ = emptyIntList();
    private void ensureFAPMPNADDDFIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fAPMPNADDDF_ = mutableCopy(fAPMPNADDDF_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 FAPMPNADDDF = 4;</code>
     * @return A list containing the fAPMPNADDDF.
     */
    public java.util.List<java.lang.Integer>
        getFAPMPNADDDFList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(fAPMPNADDDF_) : fAPMPNADDDF_;
    }
    /**
     * <code>repeated uint32 FAPMPNADDDF = 4;</code>
     * @return The count of fAPMPNADDDF.
     */
    public int getFAPMPNADDDFCount() {
      return fAPMPNADDDF_.size();
    }
    /**
     * <code>repeated uint32 FAPMPNADDDF = 4;</code>
     * @param index The index of the element to return.
     * @return The fAPMPNADDDF at the given index.
     */
    public int getFAPMPNADDDF(int index) {
      return fAPMPNADDDF_.getInt(index);
    }
    /**
     * <code>repeated uint32 FAPMPNADDDF = 4;</code>
     * @param index The index to set the value at.
     * @param value The fAPMPNADDDF to set.
     * @return This builder for chaining.
     */
    public Builder setFAPMPNADDDF(
        int index, int value) {
      ensureFAPMPNADDDFIsMutable();
      fAPMPNADDDF_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 FAPMPNADDDF = 4;</code>
     * @param value The fAPMPNADDDF to add.
     * @return This builder for chaining.
     */
    public Builder addFAPMPNADDDF(int value) {
      ensureFAPMPNADDDFIsMutable();
      fAPMPNADDDF_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 FAPMPNADDDF = 4;</code>
     * @param values The fAPMPNADDDF to add.
     * @return This builder for chaining.
     */
    public Builder addAllFAPMPNADDDF(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureFAPMPNADDDFIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fAPMPNADDDF_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 FAPMPNADDDF = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFAPMPNADDDF() {
      fAPMPNADDDF_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList aMLNLDNJJID_ = emptyIntList();
    private void ensureAMLNLDNJJIDIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        aMLNLDNJJID_ = mutableCopy(aMLNLDNJJID_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated uint32 AMLNLDNJJID = 11;</code>
     * @return A list containing the aMLNLDNJJID.
     */
    public java.util.List<java.lang.Integer>
        getAMLNLDNJJIDList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(aMLNLDNJJID_) : aMLNLDNJJID_;
    }
    /**
     * <code>repeated uint32 AMLNLDNJJID = 11;</code>
     * @return The count of aMLNLDNJJID.
     */
    public int getAMLNLDNJJIDCount() {
      return aMLNLDNJJID_.size();
    }
    /**
     * <code>repeated uint32 AMLNLDNJJID = 11;</code>
     * @param index The index of the element to return.
     * @return The aMLNLDNJJID at the given index.
     */
    public int getAMLNLDNJJID(int index) {
      return aMLNLDNJJID_.getInt(index);
    }
    /**
     * <code>repeated uint32 AMLNLDNJJID = 11;</code>
     * @param index The index to set the value at.
     * @param value The aMLNLDNJJID to set.
     * @return This builder for chaining.
     */
    public Builder setAMLNLDNJJID(
        int index, int value) {
      ensureAMLNLDNJJIDIsMutable();
      aMLNLDNJJID_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 AMLNLDNJJID = 11;</code>
     * @param value The aMLNLDNJJID to add.
     * @return This builder for chaining.
     */
    public Builder addAMLNLDNJJID(int value) {
      ensureAMLNLDNJJIDIsMutable();
      aMLNLDNJJID_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 AMLNLDNJJID = 11;</code>
     * @param values The aMLNLDNJJID to add.
     * @return This builder for chaining.
     */
    public Builder addAllAMLNLDNJJID(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureAMLNLDNJJIDIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, aMLNLDNJJID_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 AMLNLDNJJID = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearAMLNLDNJJID() {
      aMLNLDNJJID_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int lCDDIDLJEDN_ ;
    /**
     * <code>uint32 LCDDIDLJEDN = 2;</code>
     * @return The lCDDIDLJEDN.
     */
    @java.lang.Override
    public int getLCDDIDLJEDN() {
      return lCDDIDLJEDN_;
    }
    /**
     * <code>uint32 LCDDIDLJEDN = 2;</code>
     * @param value The lCDDIDLJEDN to set.
     * @return This builder for chaining.
     */
    public Builder setLCDDIDLJEDN(int value) {
      
      lCDDIDLJEDN_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 LCDDIDLJEDN = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLCDDIDLJEDN() {
      
      lCDDIDLJEDN_ = 0;
      onChanged();
      return this;
    }

    private int areaId_ ;
    /**
     * <code>uint32 area_id = 7;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
    }
    /**
     * <code>uint32 area_id = 7;</code>
     * @param value The areaId to set.
     * @return This builder for chaining.
     */
    public Builder setAreaId(int value) {
      
      areaId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 area_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearAreaId() {
      
      areaId_ = 0;
      onChanged();
      return this;
    }

    private int cEJABHLHHAC_ = 0;
    /**
     * <code>.BINOOCJMLCB CEJABHLHHAC = 12;</code>
     * @return The enum numeric value on the wire for cEJABHLHHAC.
     */
    @java.lang.Override public int getCEJABHLHHACValue() {
      return cEJABHLHHAC_;
    }
    /**
     * <code>.BINOOCJMLCB CEJABHLHHAC = 12;</code>
     * @param value The enum numeric value on the wire for cEJABHLHHAC to set.
     * @return This builder for chaining.
     */
    public Builder setCEJABHLHHACValue(int value) {
      
      cEJABHLHHAC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.BINOOCJMLCB CEJABHLHHAC = 12;</code>
     * @return The cEJABHLHHAC.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.activity.BINOOCJMLCB getCEJABHLHHAC() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.activity.BINOOCJMLCB result = io.grasscutter.net.proto.activity.BINOOCJMLCB.valueOf(cEJABHLHHAC_);
      return result == null ? io.grasscutter.net.proto.activity.BINOOCJMLCB.UNRECOGNIZED : result;
    }
    /**
     * <code>.BINOOCJMLCB CEJABHLHHAC = 12;</code>
     * @param value The cEJABHLHHAC to set.
     * @return This builder for chaining.
     */
    public Builder setCEJABHLHHAC(io.grasscutter.net.proto.activity.BINOOCJMLCB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cEJABHLHHAC_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.BINOOCJMLCB CEJABHLHHAC = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearCEJABHLHHAC() {
      
      cEJABHLHHAC_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:DGLNFLCMPKN)
  }

  // @@protoc_insertion_point(class_scope:DGLNFLCMPKN)
  private static final io.grasscutter.net.proto.activity.DGLNFLCMPKN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.DGLNFLCMPKN();
  }

  public static io.grasscutter.net.proto.activity.DGLNFLCMPKN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DGLNFLCMPKN>
      PARSER = new com.google.protobuf.AbstractParser<DGLNFLCMPKN>() {
    @java.lang.Override
    public DGLNFLCMPKN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DGLNFLCMPKN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DGLNFLCMPKN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DGLNFLCMPKN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.DGLNFLCMPKN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

