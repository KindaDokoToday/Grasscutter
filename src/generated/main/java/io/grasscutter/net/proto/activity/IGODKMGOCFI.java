// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code IGODKMGOCFI}
 */
public final class IGODKMGOCFI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IGODKMGOCFI)
    IGODKMGOCFIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IGODKMGOCFI.newBuilder() to construct.
  private IGODKMGOCFI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IGODKMGOCFI() {
    bCNGFADBEFE_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IGODKMGOCFI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IGODKMGOCFI(
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

            kNGJHMLLCNP_ = input.readUInt32();
            break;
          }
          case 32: {

            isOpen_ = input.readBool();
            break;
          }
          case 40: {

            isFinish_ = input.readBool();
            break;
          }
          case 48: {

            hELEEGCNJGE_ = input.readUInt32();
            break;
          }
          case 88: {

            hOPFHNNPBDD_ = input.readUInt32();
            break;
          }
          case 96: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              bCNGFADBEFE_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            bCNGFADBEFE_.addInt(input.readUInt32());
            break;
          }
          case 98: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              bCNGFADBEFE_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              bCNGFADBEFE_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 104: {

            levelId_ = input.readUInt32();
            break;
          }
          case 112: {

            eNLBBGHHHJP_ = input.readUInt32();
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
        bCNGFADBEFE_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IGODKMGOCFI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IGODKMGOCFI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.IGODKMGOCFI.class, io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder.class);
  }

  public static final int BCNGFADBEFE_FIELD_NUMBER = 12;
  private com.google.protobuf.Internal.IntList bCNGFADBEFE_;
  /**
   * <code>repeated uint32 BCNGFADBEFE = 12;</code>
   * @return A list containing the bCNGFADBEFE.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getBCNGFADBEFEList() {
    return bCNGFADBEFE_;
  }
  /**
   * <code>repeated uint32 BCNGFADBEFE = 12;</code>
   * @return The count of bCNGFADBEFE.
   */
  public int getBCNGFADBEFECount() {
    return bCNGFADBEFE_.size();
  }
  /**
   * <code>repeated uint32 BCNGFADBEFE = 12;</code>
   * @param index The index of the element to return.
   * @return The bCNGFADBEFE at the given index.
   */
  public int getBCNGFADBEFE(int index) {
    return bCNGFADBEFE_.getInt(index);
  }
  private int bCNGFADBEFEMemoizedSerializedSize = -1;

  public static final int KNGJHMLLCNP_FIELD_NUMBER = 2;
  private int kNGJHMLLCNP_;
  /**
   * <code>uint32 KNGJHMLLCNP = 2;</code>
   * @return The kNGJHMLLCNP.
   */
  @java.lang.Override
  public int getKNGJHMLLCNP() {
    return kNGJHMLLCNP_;
  }

  public static final int LEVEL_ID_FIELD_NUMBER = 13;
  private int levelId_;
  /**
   * <code>uint32 level_id = 13;</code>
   * @return The levelId.
   */
  @java.lang.Override
  public int getLevelId() {
    return levelId_;
  }

  public static final int IS_OPEN_FIELD_NUMBER = 4;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 4;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int IS_FINISH_FIELD_NUMBER = 5;
  private boolean isFinish_;
  /**
   * <code>bool is_finish = 5;</code>
   * @return The isFinish.
   */
  @java.lang.Override
  public boolean getIsFinish() {
    return isFinish_;
  }

  public static final int ENLBBGHHHJP_FIELD_NUMBER = 14;
  private int eNLBBGHHHJP_;
  /**
   * <code>uint32 ENLBBGHHHJP = 14;</code>
   * @return The eNLBBGHHHJP.
   */
  @java.lang.Override
  public int getENLBBGHHHJP() {
    return eNLBBGHHHJP_;
  }

  public static final int HELEEGCNJGE_FIELD_NUMBER = 6;
  private int hELEEGCNJGE_;
  /**
   * <code>uint32 HELEEGCNJGE = 6;</code>
   * @return The hELEEGCNJGE.
   */
  @java.lang.Override
  public int getHELEEGCNJGE() {
    return hELEEGCNJGE_;
  }

  public static final int HOPFHNNPBDD_FIELD_NUMBER = 11;
  private int hOPFHNNPBDD_;
  /**
   * <code>uint32 HOPFHNNPBDD = 11;</code>
   * @return The hOPFHNNPBDD.
   */
  @java.lang.Override
  public int getHOPFHNNPBDD() {
    return hOPFHNNPBDD_;
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
    if (kNGJHMLLCNP_ != 0) {
      output.writeUInt32(2, kNGJHMLLCNP_);
    }
    if (isOpen_ != false) {
      output.writeBool(4, isOpen_);
    }
    if (isFinish_ != false) {
      output.writeBool(5, isFinish_);
    }
    if (hELEEGCNJGE_ != 0) {
      output.writeUInt32(6, hELEEGCNJGE_);
    }
    if (hOPFHNNPBDD_ != 0) {
      output.writeUInt32(11, hOPFHNNPBDD_);
    }
    if (getBCNGFADBEFEList().size() > 0) {
      output.writeUInt32NoTag(98);
      output.writeUInt32NoTag(bCNGFADBEFEMemoizedSerializedSize);
    }
    for (int i = 0; i < bCNGFADBEFE_.size(); i++) {
      output.writeUInt32NoTag(bCNGFADBEFE_.getInt(i));
    }
    if (levelId_ != 0) {
      output.writeUInt32(13, levelId_);
    }
    if (eNLBBGHHHJP_ != 0) {
      output.writeUInt32(14, eNLBBGHHHJP_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kNGJHMLLCNP_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, kNGJHMLLCNP_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isOpen_);
    }
    if (isFinish_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isFinish_);
    }
    if (hELEEGCNJGE_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, hELEEGCNJGE_);
    }
    if (hOPFHNNPBDD_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, hOPFHNNPBDD_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < bCNGFADBEFE_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(bCNGFADBEFE_.getInt(i));
      }
      size += dataSize;
      if (!getBCNGFADBEFEList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bCNGFADBEFEMemoizedSerializedSize = dataSize;
    }
    if (levelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, levelId_);
    }
    if (eNLBBGHHHJP_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, eNLBBGHHHJP_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.IGODKMGOCFI)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.IGODKMGOCFI other = (io.grasscutter.net.proto.activity.IGODKMGOCFI) obj;

    if (!getBCNGFADBEFEList()
        .equals(other.getBCNGFADBEFEList())) return false;
    if (getKNGJHMLLCNP()
        != other.getKNGJHMLLCNP()) return false;
    if (getLevelId()
        != other.getLevelId()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getIsFinish()
        != other.getIsFinish()) return false;
    if (getENLBBGHHHJP()
        != other.getENLBBGHHHJP()) return false;
    if (getHELEEGCNJGE()
        != other.getHELEEGCNJGE()) return false;
    if (getHOPFHNNPBDD()
        != other.getHOPFHNNPBDD()) return false;
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
    if (getBCNGFADBEFECount() > 0) {
      hash = (37 * hash) + BCNGFADBEFE_FIELD_NUMBER;
      hash = (53 * hash) + getBCNGFADBEFEList().hashCode();
    }
    hash = (37 * hash) + KNGJHMLLCNP_FIELD_NUMBER;
    hash = (53 * hash) + getKNGJHMLLCNP();
    hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLevelId();
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFinish());
    hash = (37 * hash) + ENLBBGHHHJP_FIELD_NUMBER;
    hash = (53 * hash) + getENLBBGHHHJP();
    hash = (37 * hash) + HELEEGCNJGE_FIELD_NUMBER;
    hash = (53 * hash) + getHELEEGCNJGE();
    hash = (37 * hash) + HOPFHNNPBDD_FIELD_NUMBER;
    hash = (53 * hash) + getHOPFHNNPBDD();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IGODKMGOCFI parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.IGODKMGOCFI prototype) {
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
   * Protobuf type {@code IGODKMGOCFI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IGODKMGOCFI)
      io.grasscutter.net.proto.activity.IGODKMGOCFIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IGODKMGOCFI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IGODKMGOCFI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.IGODKMGOCFI.class, io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.IGODKMGOCFI.newBuilder()
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
      bCNGFADBEFE_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      kNGJHMLLCNP_ = 0;

      levelId_ = 0;

      isOpen_ = false;

      isFinish_ = false;

      eNLBBGHHHJP_ = 0;

      hELEEGCNJGE_ = 0;

      hOPFHNNPBDD_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IGODKMGOCFI_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IGODKMGOCFI getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.IGODKMGOCFI.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IGODKMGOCFI build() {
      io.grasscutter.net.proto.activity.IGODKMGOCFI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IGODKMGOCFI buildPartial() {
      io.grasscutter.net.proto.activity.IGODKMGOCFI result = new io.grasscutter.net.proto.activity.IGODKMGOCFI(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        bCNGFADBEFE_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.bCNGFADBEFE_ = bCNGFADBEFE_;
      result.kNGJHMLLCNP_ = kNGJHMLLCNP_;
      result.levelId_ = levelId_;
      result.isOpen_ = isOpen_;
      result.isFinish_ = isFinish_;
      result.eNLBBGHHHJP_ = eNLBBGHHHJP_;
      result.hELEEGCNJGE_ = hELEEGCNJGE_;
      result.hOPFHNNPBDD_ = hOPFHNNPBDD_;
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
      if (other instanceof io.grasscutter.net.proto.activity.IGODKMGOCFI) {
        return mergeFrom((io.grasscutter.net.proto.activity.IGODKMGOCFI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.IGODKMGOCFI other) {
      if (other == io.grasscutter.net.proto.activity.IGODKMGOCFI.getDefaultInstance()) return this;
      if (!other.bCNGFADBEFE_.isEmpty()) {
        if (bCNGFADBEFE_.isEmpty()) {
          bCNGFADBEFE_ = other.bCNGFADBEFE_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBCNGFADBEFEIsMutable();
          bCNGFADBEFE_.addAll(other.bCNGFADBEFE_);
        }
        onChanged();
      }
      if (other.getKNGJHMLLCNP() != 0) {
        setKNGJHMLLCNP(other.getKNGJHMLLCNP());
      }
      if (other.getLevelId() != 0) {
        setLevelId(other.getLevelId());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getIsFinish() != false) {
        setIsFinish(other.getIsFinish());
      }
      if (other.getENLBBGHHHJP() != 0) {
        setENLBBGHHHJP(other.getENLBBGHHHJP());
      }
      if (other.getHELEEGCNJGE() != 0) {
        setHELEEGCNJGE(other.getHELEEGCNJGE());
      }
      if (other.getHOPFHNNPBDD() != 0) {
        setHOPFHNNPBDD(other.getHOPFHNNPBDD());
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
      io.grasscutter.net.proto.activity.IGODKMGOCFI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.IGODKMGOCFI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList bCNGFADBEFE_ = emptyIntList();
    private void ensureBCNGFADBEFEIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bCNGFADBEFE_ = mutableCopy(bCNGFADBEFE_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 BCNGFADBEFE = 12;</code>
     * @return A list containing the bCNGFADBEFE.
     */
    public java.util.List<java.lang.Integer>
        getBCNGFADBEFEList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(bCNGFADBEFE_) : bCNGFADBEFE_;
    }
    /**
     * <code>repeated uint32 BCNGFADBEFE = 12;</code>
     * @return The count of bCNGFADBEFE.
     */
    public int getBCNGFADBEFECount() {
      return bCNGFADBEFE_.size();
    }
    /**
     * <code>repeated uint32 BCNGFADBEFE = 12;</code>
     * @param index The index of the element to return.
     * @return The bCNGFADBEFE at the given index.
     */
    public int getBCNGFADBEFE(int index) {
      return bCNGFADBEFE_.getInt(index);
    }
    /**
     * <code>repeated uint32 BCNGFADBEFE = 12;</code>
     * @param index The index to set the value at.
     * @param value The bCNGFADBEFE to set.
     * @return This builder for chaining.
     */
    public Builder setBCNGFADBEFE(
        int index, int value) {
      ensureBCNGFADBEFEIsMutable();
      bCNGFADBEFE_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 BCNGFADBEFE = 12;</code>
     * @param value The bCNGFADBEFE to add.
     * @return This builder for chaining.
     */
    public Builder addBCNGFADBEFE(int value) {
      ensureBCNGFADBEFEIsMutable();
      bCNGFADBEFE_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 BCNGFADBEFE = 12;</code>
     * @param values The bCNGFADBEFE to add.
     * @return This builder for chaining.
     */
    public Builder addAllBCNGFADBEFE(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureBCNGFADBEFEIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bCNGFADBEFE_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 BCNGFADBEFE = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearBCNGFADBEFE() {
      bCNGFADBEFE_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int kNGJHMLLCNP_ ;
    /**
     * <code>uint32 KNGJHMLLCNP = 2;</code>
     * @return The kNGJHMLLCNP.
     */
    @java.lang.Override
    public int getKNGJHMLLCNP() {
      return kNGJHMLLCNP_;
    }
    /**
     * <code>uint32 KNGJHMLLCNP = 2;</code>
     * @param value The kNGJHMLLCNP to set.
     * @return This builder for chaining.
     */
    public Builder setKNGJHMLLCNP(int value) {
      
      kNGJHMLLCNP_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 KNGJHMLLCNP = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKNGJHMLLCNP() {
      
      kNGJHMLLCNP_ = 0;
      onChanged();
      return this;
    }

    private int levelId_ ;
    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }
    /**
     * <code>uint32 level_id = 13;</code>
     * @param value The levelId to set.
     * @return This builder for chaining.
     */
    public Builder setLevelId(int value) {
      
      levelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 level_id = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevelId() {
      
      levelId_ = 0;
      onChanged();
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 4;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private boolean isFinish_ ;
    /**
     * <code>bool is_finish = 5;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }
    /**
     * <code>bool is_finish = 5;</code>
     * @param value The isFinish to set.
     * @return This builder for chaining.
     */
    public Builder setIsFinish(boolean value) {
      
      isFinish_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_finish = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFinish() {
      
      isFinish_ = false;
      onChanged();
      return this;
    }

    private int eNLBBGHHHJP_ ;
    /**
     * <code>uint32 ENLBBGHHHJP = 14;</code>
     * @return The eNLBBGHHHJP.
     */
    @java.lang.Override
    public int getENLBBGHHHJP() {
      return eNLBBGHHHJP_;
    }
    /**
     * <code>uint32 ENLBBGHHHJP = 14;</code>
     * @param value The eNLBBGHHHJP to set.
     * @return This builder for chaining.
     */
    public Builder setENLBBGHHHJP(int value) {
      
      eNLBBGHHHJP_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 ENLBBGHHHJP = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearENLBBGHHHJP() {
      
      eNLBBGHHHJP_ = 0;
      onChanged();
      return this;
    }

    private int hELEEGCNJGE_ ;
    /**
     * <code>uint32 HELEEGCNJGE = 6;</code>
     * @return The hELEEGCNJGE.
     */
    @java.lang.Override
    public int getHELEEGCNJGE() {
      return hELEEGCNJGE_;
    }
    /**
     * <code>uint32 HELEEGCNJGE = 6;</code>
     * @param value The hELEEGCNJGE to set.
     * @return This builder for chaining.
     */
    public Builder setHELEEGCNJGE(int value) {
      
      hELEEGCNJGE_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 HELEEGCNJGE = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHELEEGCNJGE() {
      
      hELEEGCNJGE_ = 0;
      onChanged();
      return this;
    }

    private int hOPFHNNPBDD_ ;
    /**
     * <code>uint32 HOPFHNNPBDD = 11;</code>
     * @return The hOPFHNNPBDD.
     */
    @java.lang.Override
    public int getHOPFHNNPBDD() {
      return hOPFHNNPBDD_;
    }
    /**
     * <code>uint32 HOPFHNNPBDD = 11;</code>
     * @param value The hOPFHNNPBDD to set.
     * @return This builder for chaining.
     */
    public Builder setHOPFHNNPBDD(int value) {
      
      hOPFHNNPBDD_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 HOPFHNNPBDD = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearHOPFHNNPBDD() {
      
      hOPFHNNPBDD_ = 0;
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


    // @@protoc_insertion_point(builder_scope:IGODKMGOCFI)
  }

  // @@protoc_insertion_point(class_scope:IGODKMGOCFI)
  private static final io.grasscutter.net.proto.activity.IGODKMGOCFI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.IGODKMGOCFI();
  }

  public static io.grasscutter.net.proto.activity.IGODKMGOCFI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IGODKMGOCFI>
      PARSER = new com.google.protobuf.AbstractParser<IGODKMGOCFI>() {
    @java.lang.Override
    public IGODKMGOCFI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IGODKMGOCFI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IGODKMGOCFI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IGODKMGOCFI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.IGODKMGOCFI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

