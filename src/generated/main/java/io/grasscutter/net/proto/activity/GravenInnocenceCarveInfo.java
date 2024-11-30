// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code GravenInnocenceCarveInfo}
 */
public final class GravenInnocenceCarveInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GravenInnocenceCarveInfo)
    GravenInnocenceCarveInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GravenInnocenceCarveInfo.newBuilder() to construct.
  private GravenInnocenceCarveInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GravenInnocenceCarveInfo() {
    hasEditConfigIdList_ = emptyIntList();
    stageInfoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GravenInnocenceCarveInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GravenInnocenceCarveInfo(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              stageInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            stageInfoList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.parser(), extensionRegistry));
            break;
          }
          case 16: {

            canEditCount_ = input.readUInt32();
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              hasEditConfigIdList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            hasEditConfigIdList_.addInt(input.readUInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              hasEditConfigIdList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              hasEditConfigIdList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
      }
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        hasEditConfigIdList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_GravenInnocenceCarveInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_GravenInnocenceCarveInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo.class, io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo.Builder.class);
  }

  public static final int HAS_EDIT_CONFIG_ID_LIST_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList hasEditConfigIdList_;
  /**
   * <code>repeated uint32 has_edit_config_id_list = 4;</code>
   * @return A list containing the hasEditConfigIdList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getHasEditConfigIdListList() {
    return hasEditConfigIdList_;
  }
  /**
   * <code>repeated uint32 has_edit_config_id_list = 4;</code>
   * @return The count of hasEditConfigIdList.
   */
  public int getHasEditConfigIdListCount() {
    return hasEditConfigIdList_.size();
  }
  /**
   * <code>repeated uint32 has_edit_config_id_list = 4;</code>
   * @param index The index of the element to return.
   * @return The hasEditConfigIdList at the given index.
   */
  public int getHasEditConfigIdList(int index) {
    return hasEditConfigIdList_.getInt(index);
  }
  private int hasEditConfigIdListMemoizedSerializedSize = -1;

  public static final int STAGE_INFO_LIST_FIELD_NUMBER = 1;
  private java.util.List<io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo> stageInfoList_;
  /**
   * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo> getStageInfoListList() {
    return stageInfoList_;
  }
  /**
   * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfoOrBuilder> 
      getStageInfoListOrBuilderList() {
    return stageInfoList_;
  }
  /**
   * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
   */
  @java.lang.Override
  public int getStageInfoListCount() {
    return stageInfoList_.size();
  }
  /**
   * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo getStageInfoList(int index) {
    return stageInfoList_.get(index);
  }
  /**
   * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfoOrBuilder getStageInfoListOrBuilder(
      int index) {
    return stageInfoList_.get(index);
  }

  public static final int CAN_EDIT_COUNT_FIELD_NUMBER = 2;
  private int canEditCount_;
  /**
   * <code>uint32 can_edit_count = 2;</code>
   * @return The canEditCount.
   */
  @java.lang.Override
  public int getCanEditCount() {
    return canEditCount_;
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
    for (int i = 0; i < stageInfoList_.size(); i++) {
      output.writeMessage(1, stageInfoList_.get(i));
    }
    if (canEditCount_ != 0) {
      output.writeUInt32(2, canEditCount_);
    }
    if (getHasEditConfigIdListList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(hasEditConfigIdListMemoizedSerializedSize);
    }
    for (int i = 0; i < hasEditConfigIdList_.size(); i++) {
      output.writeUInt32NoTag(hasEditConfigIdList_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < stageInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, stageInfoList_.get(i));
    }
    if (canEditCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, canEditCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hasEditConfigIdList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(hasEditConfigIdList_.getInt(i));
      }
      size += dataSize;
      if (!getHasEditConfigIdListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      hasEditConfigIdListMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo other = (io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo) obj;

    if (!getHasEditConfigIdListList()
        .equals(other.getHasEditConfigIdListList())) return false;
    if (!getStageInfoListList()
        .equals(other.getStageInfoListList())) return false;
    if (getCanEditCount()
        != other.getCanEditCount()) return false;
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
    if (getHasEditConfigIdListCount() > 0) {
      hash = (37 * hash) + HAS_EDIT_CONFIG_ID_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getHasEditConfigIdListList().hashCode();
    }
    if (getStageInfoListCount() > 0) {
      hash = (37 * hash) + STAGE_INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getStageInfoListList().hashCode();
    }
    hash = (37 * hash) + CAN_EDIT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCanEditCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo prototype) {
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
   * Protobuf type {@code GravenInnocenceCarveInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GravenInnocenceCarveInfo)
      io.grasscutter.net.proto.activity.GravenInnocenceCarveInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GravenInnocenceCarveInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GravenInnocenceCarveInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo.class, io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo.newBuilder()
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
        getStageInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      hasEditConfigIdList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      if (stageInfoListBuilder_ == null) {
        stageInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        stageInfoListBuilder_.clear();
      }
      canEditCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GravenInnocenceCarveInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo build() {
      io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo buildPartial() {
      io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo result = new io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        hasEditConfigIdList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.hasEditConfigIdList_ = hasEditConfigIdList_;
      if (stageInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.stageInfoList_ = stageInfoList_;
      } else {
        result.stageInfoList_ = stageInfoListBuilder_.build();
      }
      result.canEditCount_ = canEditCount_;
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
      if (other instanceof io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo other) {
      if (other == io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo.getDefaultInstance()) return this;
      if (!other.hasEditConfigIdList_.isEmpty()) {
        if (hasEditConfigIdList_.isEmpty()) {
          hasEditConfigIdList_ = other.hasEditConfigIdList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureHasEditConfigIdListIsMutable();
          hasEditConfigIdList_.addAll(other.hasEditConfigIdList_);
        }
        onChanged();
      }
      if (stageInfoListBuilder_ == null) {
        if (!other.stageInfoList_.isEmpty()) {
          if (stageInfoList_.isEmpty()) {
            stageInfoList_ = other.stageInfoList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStageInfoListIsMutable();
            stageInfoList_.addAll(other.stageInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.stageInfoList_.isEmpty()) {
          if (stageInfoListBuilder_.isEmpty()) {
            stageInfoListBuilder_.dispose();
            stageInfoListBuilder_ = null;
            stageInfoList_ = other.stageInfoList_;
            bitField0_ = (bitField0_ & ~0x00000002);
            stageInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStageInfoListFieldBuilder() : null;
          } else {
            stageInfoListBuilder_.addAllMessages(other.stageInfoList_);
          }
        }
      }
      if (other.getCanEditCount() != 0) {
        setCanEditCount(other.getCanEditCount());
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
      io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList hasEditConfigIdList_ = emptyIntList();
    private void ensureHasEditConfigIdListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hasEditConfigIdList_ = mutableCopy(hasEditConfigIdList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 has_edit_config_id_list = 4;</code>
     * @return A list containing the hasEditConfigIdList.
     */
    public java.util.List<java.lang.Integer>
        getHasEditConfigIdListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(hasEditConfigIdList_) : hasEditConfigIdList_;
    }
    /**
     * <code>repeated uint32 has_edit_config_id_list = 4;</code>
     * @return The count of hasEditConfigIdList.
     */
    public int getHasEditConfigIdListCount() {
      return hasEditConfigIdList_.size();
    }
    /**
     * <code>repeated uint32 has_edit_config_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The hasEditConfigIdList at the given index.
     */
    public int getHasEditConfigIdList(int index) {
      return hasEditConfigIdList_.getInt(index);
    }
    /**
     * <code>repeated uint32 has_edit_config_id_list = 4;</code>
     * @param index The index to set the value at.
     * @param value The hasEditConfigIdList to set.
     * @return This builder for chaining.
     */
    public Builder setHasEditConfigIdList(
        int index, int value) {
      ensureHasEditConfigIdListIsMutable();
      hasEditConfigIdList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 has_edit_config_id_list = 4;</code>
     * @param value The hasEditConfigIdList to add.
     * @return This builder for chaining.
     */
    public Builder addHasEditConfigIdList(int value) {
      ensureHasEditConfigIdListIsMutable();
      hasEditConfigIdList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 has_edit_config_id_list = 4;</code>
     * @param values The hasEditConfigIdList to add.
     * @return This builder for chaining.
     */
    public Builder addAllHasEditConfigIdList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureHasEditConfigIdListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hasEditConfigIdList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 has_edit_config_id_list = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasEditConfigIdList() {
      hasEditConfigIdList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.util.List<io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo> stageInfoList_ =
      java.util.Collections.emptyList();
    private void ensureStageInfoListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        stageInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo>(stageInfoList_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfoOrBuilder> stageInfoListBuilder_;

    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo> getStageInfoListList() {
      if (stageInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stageInfoList_);
      } else {
        return stageInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public int getStageInfoListCount() {
      if (stageInfoListBuilder_ == null) {
        return stageInfoList_.size();
      } else {
        return stageInfoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo getStageInfoList(int index) {
      if (stageInfoListBuilder_ == null) {
        return stageInfoList_.get(index);
      } else {
        return stageInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder setStageInfoList(
        int index, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo value) {
      if (stageInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStageInfoListIsMutable();
        stageInfoList_.set(index, value);
        onChanged();
      } else {
        stageInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder setStageInfoList(
        int index, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder builderForValue) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        stageInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        stageInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder addStageInfoList(io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo value) {
      if (stageInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStageInfoListIsMutable();
        stageInfoList_.add(value);
        onChanged();
      } else {
        stageInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder addStageInfoList(
        int index, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo value) {
      if (stageInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStageInfoListIsMutable();
        stageInfoList_.add(index, value);
        onChanged();
      } else {
        stageInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder addStageInfoList(
        io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder builderForValue) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        stageInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        stageInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder addStageInfoList(
        int index, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder builderForValue) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        stageInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        stageInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder addAllStageInfoList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo> values) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stageInfoList_);
        onChanged();
      } else {
        stageInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder clearStageInfoList() {
      if (stageInfoListBuilder_ == null) {
        stageInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        stageInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public Builder removeStageInfoList(int index) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        stageInfoList_.remove(index);
        onChanged();
      } else {
        stageInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder getStageInfoListBuilder(
        int index) {
      return getStageInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfoOrBuilder getStageInfoListOrBuilder(
        int index) {
      if (stageInfoListBuilder_ == null) {
        return stageInfoList_.get(index);  } else {
        return stageInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfoOrBuilder> 
         getStageInfoListOrBuilderList() {
      if (stageInfoListBuilder_ != null) {
        return stageInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stageInfoList_);
      }
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder addStageInfoListBuilder() {
      return getStageInfoListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder addStageInfoListBuilder(
        int index) {
      return getStageInfoListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .GravenInnocenceCarveStageInfo stage_info_list = 1;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder> 
         getStageInfoListBuilderList() {
      return getStageInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfoOrBuilder> 
        getStageInfoListFieldBuilder() {
      if (stageInfoListBuilder_ == null) {
        stageInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfo.Builder, io.grasscutter.net.proto.activity.GravenInnocenceCarveStageInfoOrBuilder>(
                stageInfoList_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        stageInfoList_ = null;
      }
      return stageInfoListBuilder_;
    }

    private int canEditCount_ ;
    /**
     * <code>uint32 can_edit_count = 2;</code>
     * @return The canEditCount.
     */
    @java.lang.Override
    public int getCanEditCount() {
      return canEditCount_;
    }
    /**
     * <code>uint32 can_edit_count = 2;</code>
     * @param value The canEditCount to set.
     * @return This builder for chaining.
     */
    public Builder setCanEditCount(int value) {
      
      canEditCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 can_edit_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCanEditCount() {
      
      canEditCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:GravenInnocenceCarveInfo)
  }

  // @@protoc_insertion_point(class_scope:GravenInnocenceCarveInfo)
  private static final io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo();
  }

  public static io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GravenInnocenceCarveInfo>
      PARSER = new com.google.protobuf.AbstractParser<GravenInnocenceCarveInfo>() {
    @java.lang.Override
    public GravenInnocenceCarveInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GravenInnocenceCarveInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GravenInnocenceCarveInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GravenInnocenceCarveInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.GravenInnocenceCarveInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

