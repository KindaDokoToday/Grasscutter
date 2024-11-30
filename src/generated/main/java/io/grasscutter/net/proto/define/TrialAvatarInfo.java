// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code TrialAvatarInfo}
 */
public final class TrialAvatarInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TrialAvatarInfo)
    TrialAvatarInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrialAvatarInfo.newBuilder() to construct.
  private TrialAvatarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrialAvatarInfo() {
    trialEquipList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrialAvatarInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrialAvatarInfo(
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
          case 8: {

            trialAvatarId_ = input.readUInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              trialEquipList_ = new java.util.ArrayList<io.grasscutter.net.proto.define.Item>();
              mutable_bitField0_ |= 0x00000001;
            }
            trialEquipList_.add(
                input.readMessage(io.grasscutter.net.proto.define.Item.parser(), extensionRegistry));
            break;
          }
          case 26: {
            io.grasscutter.net.proto.define.TrialAvatarGrantRecord.Builder subBuilder = null;
            if (grantRecord_ != null) {
              subBuilder = grantRecord_.toBuilder();
            }
            grantRecord_ = input.readMessage(io.grasscutter.net.proto.define.TrialAvatarGrantRecord.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(grantRecord_);
              grantRecord_ = subBuilder.buildPartial();
            }

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
        trialEquipList_ = java.util.Collections.unmodifiableList(trialEquipList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.define.Define.internal_static_TrialAvatarInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_TrialAvatarInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.TrialAvatarInfo.class, io.grasscutter.net.proto.define.TrialAvatarInfo.Builder.class);
  }

  public static final int GRANT_RECORD_FIELD_NUMBER = 3;
  private io.grasscutter.net.proto.define.TrialAvatarGrantRecord grantRecord_;
  /**
   * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
   * @return Whether the grantRecord field is set.
   */
  @java.lang.Override
  public boolean hasGrantRecord() {
    return grantRecord_ != null;
  }
  /**
   * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
   * @return The grantRecord.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.TrialAvatarGrantRecord getGrantRecord() {
    return grantRecord_ == null ? io.grasscutter.net.proto.define.TrialAvatarGrantRecord.getDefaultInstance() : grantRecord_;
  }
  /**
   * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.TrialAvatarGrantRecordOrBuilder getGrantRecordOrBuilder() {
    return getGrantRecord();
  }

  public static final int TRIAL_EQUIP_LIST_FIELD_NUMBER = 2;
  private java.util.List<io.grasscutter.net.proto.define.Item> trialEquipList_;
  /**
   * <code>repeated .Item trial_equip_list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.define.Item> getTrialEquipListList() {
    return trialEquipList_;
  }
  /**
   * <code>repeated .Item trial_equip_list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.define.ItemOrBuilder> 
      getTrialEquipListOrBuilderList() {
    return trialEquipList_;
  }
  /**
   * <code>repeated .Item trial_equip_list = 2;</code>
   */
  @java.lang.Override
  public int getTrialEquipListCount() {
    return trialEquipList_.size();
  }
  /**
   * <code>repeated .Item trial_equip_list = 2;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.Item getTrialEquipList(int index) {
    return trialEquipList_.get(index);
  }
  /**
   * <code>repeated .Item trial_equip_list = 2;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.ItemOrBuilder getTrialEquipListOrBuilder(
      int index) {
    return trialEquipList_.get(index);
  }

  public static final int TRIAL_AVATAR_ID_FIELD_NUMBER = 1;
  private int trialAvatarId_;
  /**
   * <code>uint32 trial_avatar_id = 1;</code>
   * @return The trialAvatarId.
   */
  @java.lang.Override
  public int getTrialAvatarId() {
    return trialAvatarId_;
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
    if (trialAvatarId_ != 0) {
      output.writeUInt32(1, trialAvatarId_);
    }
    for (int i = 0; i < trialEquipList_.size(); i++) {
      output.writeMessage(2, trialEquipList_.get(i));
    }
    if (grantRecord_ != null) {
      output.writeMessage(3, getGrantRecord());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trialAvatarId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, trialAvatarId_);
    }
    for (int i = 0; i < trialEquipList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, trialEquipList_.get(i));
    }
    if (grantRecord_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGrantRecord());
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
    if (!(obj instanceof io.grasscutter.net.proto.define.TrialAvatarInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.TrialAvatarInfo other = (io.grasscutter.net.proto.define.TrialAvatarInfo) obj;

    if (hasGrantRecord() != other.hasGrantRecord()) return false;
    if (hasGrantRecord()) {
      if (!getGrantRecord()
          .equals(other.getGrantRecord())) return false;
    }
    if (!getTrialEquipListList()
        .equals(other.getTrialEquipListList())) return false;
    if (getTrialAvatarId()
        != other.getTrialAvatarId()) return false;
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
    if (hasGrantRecord()) {
      hash = (37 * hash) + GRANT_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getGrantRecord().hashCode();
    }
    if (getTrialEquipListCount() > 0) {
      hash = (37 * hash) + TRIAL_EQUIP_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getTrialEquipListList().hashCode();
    }
    hash = (37 * hash) + TRIAL_AVATAR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTrialAvatarId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.TrialAvatarInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.TrialAvatarInfo prototype) {
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
   * Protobuf type {@code TrialAvatarInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TrialAvatarInfo)
      io.grasscutter.net.proto.define.TrialAvatarInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_TrialAvatarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_TrialAvatarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.TrialAvatarInfo.class, io.grasscutter.net.proto.define.TrialAvatarInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.TrialAvatarInfo.newBuilder()
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
        getTrialEquipListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (grantRecordBuilder_ == null) {
        grantRecord_ = null;
      } else {
        grantRecord_ = null;
        grantRecordBuilder_ = null;
      }
      if (trialEquipListBuilder_ == null) {
        trialEquipList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        trialEquipListBuilder_.clear();
      }
      trialAvatarId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_TrialAvatarInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.TrialAvatarInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.TrialAvatarInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.TrialAvatarInfo build() {
      io.grasscutter.net.proto.define.TrialAvatarInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.TrialAvatarInfo buildPartial() {
      io.grasscutter.net.proto.define.TrialAvatarInfo result = new io.grasscutter.net.proto.define.TrialAvatarInfo(this);
      int from_bitField0_ = bitField0_;
      if (grantRecordBuilder_ == null) {
        result.grantRecord_ = grantRecord_;
      } else {
        result.grantRecord_ = grantRecordBuilder_.build();
      }
      if (trialEquipListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          trialEquipList_ = java.util.Collections.unmodifiableList(trialEquipList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.trialEquipList_ = trialEquipList_;
      } else {
        result.trialEquipList_ = trialEquipListBuilder_.build();
      }
      result.trialAvatarId_ = trialAvatarId_;
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
      if (other instanceof io.grasscutter.net.proto.define.TrialAvatarInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.TrialAvatarInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.TrialAvatarInfo other) {
      if (other == io.grasscutter.net.proto.define.TrialAvatarInfo.getDefaultInstance()) return this;
      if (other.hasGrantRecord()) {
        mergeGrantRecord(other.getGrantRecord());
      }
      if (trialEquipListBuilder_ == null) {
        if (!other.trialEquipList_.isEmpty()) {
          if (trialEquipList_.isEmpty()) {
            trialEquipList_ = other.trialEquipList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTrialEquipListIsMutable();
            trialEquipList_.addAll(other.trialEquipList_);
          }
          onChanged();
        }
      } else {
        if (!other.trialEquipList_.isEmpty()) {
          if (trialEquipListBuilder_.isEmpty()) {
            trialEquipListBuilder_.dispose();
            trialEquipListBuilder_ = null;
            trialEquipList_ = other.trialEquipList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            trialEquipListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTrialEquipListFieldBuilder() : null;
          } else {
            trialEquipListBuilder_.addAllMessages(other.trialEquipList_);
          }
        }
      }
      if (other.getTrialAvatarId() != 0) {
        setTrialAvatarId(other.getTrialAvatarId());
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
      io.grasscutter.net.proto.define.TrialAvatarInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.TrialAvatarInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.grasscutter.net.proto.define.TrialAvatarGrantRecord grantRecord_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.TrialAvatarGrantRecord, io.grasscutter.net.proto.define.TrialAvatarGrantRecord.Builder, io.grasscutter.net.proto.define.TrialAvatarGrantRecordOrBuilder> grantRecordBuilder_;
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     * @return Whether the grantRecord field is set.
     */
    public boolean hasGrantRecord() {
      return grantRecordBuilder_ != null || grantRecord_ != null;
    }
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     * @return The grantRecord.
     */
    public io.grasscutter.net.proto.define.TrialAvatarGrantRecord getGrantRecord() {
      if (grantRecordBuilder_ == null) {
        return grantRecord_ == null ? io.grasscutter.net.proto.define.TrialAvatarGrantRecord.getDefaultInstance() : grantRecord_;
      } else {
        return grantRecordBuilder_.getMessage();
      }
    }
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     */
    public Builder setGrantRecord(io.grasscutter.net.proto.define.TrialAvatarGrantRecord value) {
      if (grantRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        grantRecord_ = value;
        onChanged();
      } else {
        grantRecordBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     */
    public Builder setGrantRecord(
        io.grasscutter.net.proto.define.TrialAvatarGrantRecord.Builder builderForValue) {
      if (grantRecordBuilder_ == null) {
        grantRecord_ = builderForValue.build();
        onChanged();
      } else {
        grantRecordBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     */
    public Builder mergeGrantRecord(io.grasscutter.net.proto.define.TrialAvatarGrantRecord value) {
      if (grantRecordBuilder_ == null) {
        if (grantRecord_ != null) {
          grantRecord_ =
            io.grasscutter.net.proto.define.TrialAvatarGrantRecord.newBuilder(grantRecord_).mergeFrom(value).buildPartial();
        } else {
          grantRecord_ = value;
        }
        onChanged();
      } else {
        grantRecordBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     */
    public Builder clearGrantRecord() {
      if (grantRecordBuilder_ == null) {
        grantRecord_ = null;
        onChanged();
      } else {
        grantRecord_ = null;
        grantRecordBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     */
    public io.grasscutter.net.proto.define.TrialAvatarGrantRecord.Builder getGrantRecordBuilder() {
      
      onChanged();
      return getGrantRecordFieldBuilder().getBuilder();
    }
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     */
    public io.grasscutter.net.proto.define.TrialAvatarGrantRecordOrBuilder getGrantRecordOrBuilder() {
      if (grantRecordBuilder_ != null) {
        return grantRecordBuilder_.getMessageOrBuilder();
      } else {
        return grantRecord_ == null ?
            io.grasscutter.net.proto.define.TrialAvatarGrantRecord.getDefaultInstance() : grantRecord_;
      }
    }
    /**
     * <code>.TrialAvatarGrantRecord grant_record = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.TrialAvatarGrantRecord, io.grasscutter.net.proto.define.TrialAvatarGrantRecord.Builder, io.grasscutter.net.proto.define.TrialAvatarGrantRecordOrBuilder> 
        getGrantRecordFieldBuilder() {
      if (grantRecordBuilder_ == null) {
        grantRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.define.TrialAvatarGrantRecord, io.grasscutter.net.proto.define.TrialAvatarGrantRecord.Builder, io.grasscutter.net.proto.define.TrialAvatarGrantRecordOrBuilder>(
                getGrantRecord(),
                getParentForChildren(),
                isClean());
        grantRecord_ = null;
      }
      return grantRecordBuilder_;
    }

    private java.util.List<io.grasscutter.net.proto.define.Item> trialEquipList_ =
      java.util.Collections.emptyList();
    private void ensureTrialEquipListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        trialEquipList_ = new java.util.ArrayList<io.grasscutter.net.proto.define.Item>(trialEquipList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder> trialEquipListBuilder_;

    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public java.util.List<io.grasscutter.net.proto.define.Item> getTrialEquipListList() {
      if (trialEquipListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(trialEquipList_);
      } else {
        return trialEquipListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public int getTrialEquipListCount() {
      if (trialEquipListBuilder_ == null) {
        return trialEquipList_.size();
      } else {
        return trialEquipListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public io.grasscutter.net.proto.define.Item getTrialEquipList(int index) {
      if (trialEquipListBuilder_ == null) {
        return trialEquipList_.get(index);
      } else {
        return trialEquipListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder setTrialEquipList(
        int index, io.grasscutter.net.proto.define.Item value) {
      if (trialEquipListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrialEquipListIsMutable();
        trialEquipList_.set(index, value);
        onChanged();
      } else {
        trialEquipListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder setTrialEquipList(
        int index, io.grasscutter.net.proto.define.Item.Builder builderForValue) {
      if (trialEquipListBuilder_ == null) {
        ensureTrialEquipListIsMutable();
        trialEquipList_.set(index, builderForValue.build());
        onChanged();
      } else {
        trialEquipListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder addTrialEquipList(io.grasscutter.net.proto.define.Item value) {
      if (trialEquipListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrialEquipListIsMutable();
        trialEquipList_.add(value);
        onChanged();
      } else {
        trialEquipListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder addTrialEquipList(
        int index, io.grasscutter.net.proto.define.Item value) {
      if (trialEquipListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrialEquipListIsMutable();
        trialEquipList_.add(index, value);
        onChanged();
      } else {
        trialEquipListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder addTrialEquipList(
        io.grasscutter.net.proto.define.Item.Builder builderForValue) {
      if (trialEquipListBuilder_ == null) {
        ensureTrialEquipListIsMutable();
        trialEquipList_.add(builderForValue.build());
        onChanged();
      } else {
        trialEquipListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder addTrialEquipList(
        int index, io.grasscutter.net.proto.define.Item.Builder builderForValue) {
      if (trialEquipListBuilder_ == null) {
        ensureTrialEquipListIsMutable();
        trialEquipList_.add(index, builderForValue.build());
        onChanged();
      } else {
        trialEquipListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder addAllTrialEquipList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.define.Item> values) {
      if (trialEquipListBuilder_ == null) {
        ensureTrialEquipListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, trialEquipList_);
        onChanged();
      } else {
        trialEquipListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder clearTrialEquipList() {
      if (trialEquipListBuilder_ == null) {
        trialEquipList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        trialEquipListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public Builder removeTrialEquipList(int index) {
      if (trialEquipListBuilder_ == null) {
        ensureTrialEquipListIsMutable();
        trialEquipList_.remove(index);
        onChanged();
      } else {
        trialEquipListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public io.grasscutter.net.proto.define.Item.Builder getTrialEquipListBuilder(
        int index) {
      return getTrialEquipListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public io.grasscutter.net.proto.define.ItemOrBuilder getTrialEquipListOrBuilder(
        int index) {
      if (trialEquipListBuilder_ == null) {
        return trialEquipList_.get(index);  } else {
        return trialEquipListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.define.ItemOrBuilder> 
         getTrialEquipListOrBuilderList() {
      if (trialEquipListBuilder_ != null) {
        return trialEquipListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(trialEquipList_);
      }
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public io.grasscutter.net.proto.define.Item.Builder addTrialEquipListBuilder() {
      return getTrialEquipListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.define.Item.getDefaultInstance());
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public io.grasscutter.net.proto.define.Item.Builder addTrialEquipListBuilder(
        int index) {
      return getTrialEquipListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.define.Item.getDefaultInstance());
    }
    /**
     * <code>repeated .Item trial_equip_list = 2;</code>
     */
    public java.util.List<io.grasscutter.net.proto.define.Item.Builder> 
         getTrialEquipListBuilderList() {
      return getTrialEquipListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder> 
        getTrialEquipListFieldBuilder() {
      if (trialEquipListBuilder_ == null) {
        trialEquipListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder>(
                trialEquipList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        trialEquipList_ = null;
      }
      return trialEquipListBuilder_;
    }

    private int trialAvatarId_ ;
    /**
     * <code>uint32 trial_avatar_id = 1;</code>
     * @return The trialAvatarId.
     */
    @java.lang.Override
    public int getTrialAvatarId() {
      return trialAvatarId_;
    }
    /**
     * <code>uint32 trial_avatar_id = 1;</code>
     * @param value The trialAvatarId to set.
     * @return This builder for chaining.
     */
    public Builder setTrialAvatarId(int value) {
      
      trialAvatarId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 trial_avatar_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrialAvatarId() {
      
      trialAvatarId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:TrialAvatarInfo)
  }

  // @@protoc_insertion_point(class_scope:TrialAvatarInfo)
  private static final io.grasscutter.net.proto.define.TrialAvatarInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.TrialAvatarInfo();
  }

  public static io.grasscutter.net.proto.define.TrialAvatarInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrialAvatarInfo>
      PARSER = new com.google.protobuf.AbstractParser<TrialAvatarInfo>() {
    @java.lang.Override
    public TrialAvatarInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrialAvatarInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrialAvatarInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrialAvatarInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.TrialAvatarInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

