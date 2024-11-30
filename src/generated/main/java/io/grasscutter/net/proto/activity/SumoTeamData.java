// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code SumoTeamData}
 */
public final class SumoTeamData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SumoTeamData)
    SumoTeamDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SumoTeamData.newBuilder() to construct.
  private SumoTeamData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SumoTeamData() {
    avatarInfoList_ = java.util.Collections.emptyList();
    skillIdList_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SumoTeamData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SumoTeamData(
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
          case 72: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              skillIdList_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            skillIdList_.addInt(input.readUInt32());
            break;
          }
          case 74: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              skillIdList_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              skillIdList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 82: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              avatarInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.SumoAvatarInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            avatarInfoList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.SumoAvatarInfo.parser(), extensionRegistry));
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
        skillIdList_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_SumoTeamData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_SumoTeamData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.SumoTeamData.class, io.grasscutter.net.proto.activity.SumoTeamData.Builder.class);
  }

  public static final int AVATAR_INFO_LIST_FIELD_NUMBER = 10;
  private java.util.List<io.grasscutter.net.proto.activity.SumoAvatarInfo> avatarInfoList_;
  /**
   * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.SumoAvatarInfo> getAvatarInfoListList() {
    return avatarInfoList_;
  }
  /**
   * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.SumoAvatarInfoOrBuilder> 
      getAvatarInfoListOrBuilderList() {
    return avatarInfoList_;
  }
  /**
   * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
   */
  @java.lang.Override
  public int getAvatarInfoListCount() {
    return avatarInfoList_.size();
  }
  /**
   * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.SumoAvatarInfo getAvatarInfoList(int index) {
    return avatarInfoList_.get(index);
  }
  /**
   * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.SumoAvatarInfoOrBuilder getAvatarInfoListOrBuilder(
      int index) {
    return avatarInfoList_.get(index);
  }

  public static final int SKILL_ID_LIST_FIELD_NUMBER = 9;
  private com.google.protobuf.Internal.IntList skillIdList_;
  /**
   * <code>repeated uint32 skill_id_list = 9;</code>
   * @return A list containing the skillIdList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getSkillIdListList() {
    return skillIdList_;
  }
  /**
   * <code>repeated uint32 skill_id_list = 9;</code>
   * @return The count of skillIdList.
   */
  public int getSkillIdListCount() {
    return skillIdList_.size();
  }
  /**
   * <code>repeated uint32 skill_id_list = 9;</code>
   * @param index The index of the element to return.
   * @return The skillIdList at the given index.
   */
  public int getSkillIdList(int index) {
    return skillIdList_.getInt(index);
  }
  private int skillIdListMemoizedSerializedSize = -1;

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
    if (getSkillIdListList().size() > 0) {
      output.writeUInt32NoTag(74);
      output.writeUInt32NoTag(skillIdListMemoizedSerializedSize);
    }
    for (int i = 0; i < skillIdList_.size(); i++) {
      output.writeUInt32NoTag(skillIdList_.getInt(i));
    }
    for (int i = 0; i < avatarInfoList_.size(); i++) {
      output.writeMessage(10, avatarInfoList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < skillIdList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(skillIdList_.getInt(i));
      }
      size += dataSize;
      if (!getSkillIdListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      skillIdListMemoizedSerializedSize = dataSize;
    }
    for (int i = 0; i < avatarInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, avatarInfoList_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.SumoTeamData)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.SumoTeamData other = (io.grasscutter.net.proto.activity.SumoTeamData) obj;

    if (!getAvatarInfoListList()
        .equals(other.getAvatarInfoListList())) return false;
    if (!getSkillIdListList()
        .equals(other.getSkillIdListList())) return false;
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
    if (getAvatarInfoListCount() > 0) {
      hash = (37 * hash) + AVATAR_INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarInfoListList().hashCode();
    }
    if (getSkillIdListCount() > 0) {
      hash = (37 * hash) + SKILL_ID_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getSkillIdListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.SumoTeamData parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.SumoTeamData prototype) {
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
   * Protobuf type {@code SumoTeamData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SumoTeamData)
      io.grasscutter.net.proto.activity.SumoTeamDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_SumoTeamData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_SumoTeamData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.SumoTeamData.class, io.grasscutter.net.proto.activity.SumoTeamData.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.SumoTeamData.newBuilder()
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
        getAvatarInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (avatarInfoListBuilder_ == null) {
        avatarInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        avatarInfoListBuilder_.clear();
      }
      skillIdList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_SumoTeamData_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.SumoTeamData getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.SumoTeamData.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.SumoTeamData build() {
      io.grasscutter.net.proto.activity.SumoTeamData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.SumoTeamData buildPartial() {
      io.grasscutter.net.proto.activity.SumoTeamData result = new io.grasscutter.net.proto.activity.SumoTeamData(this);
      int from_bitField0_ = bitField0_;
      if (avatarInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.avatarInfoList_ = avatarInfoList_;
      } else {
        result.avatarInfoList_ = avatarInfoListBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        skillIdList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.skillIdList_ = skillIdList_;
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
      if (other instanceof io.grasscutter.net.proto.activity.SumoTeamData) {
        return mergeFrom((io.grasscutter.net.proto.activity.SumoTeamData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.SumoTeamData other) {
      if (other == io.grasscutter.net.proto.activity.SumoTeamData.getDefaultInstance()) return this;
      if (avatarInfoListBuilder_ == null) {
        if (!other.avatarInfoList_.isEmpty()) {
          if (avatarInfoList_.isEmpty()) {
            avatarInfoList_ = other.avatarInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvatarInfoListIsMutable();
            avatarInfoList_.addAll(other.avatarInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.avatarInfoList_.isEmpty()) {
          if (avatarInfoListBuilder_.isEmpty()) {
            avatarInfoListBuilder_.dispose();
            avatarInfoListBuilder_ = null;
            avatarInfoList_ = other.avatarInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            avatarInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAvatarInfoListFieldBuilder() : null;
          } else {
            avatarInfoListBuilder_.addAllMessages(other.avatarInfoList_);
          }
        }
      }
      if (!other.skillIdList_.isEmpty()) {
        if (skillIdList_.isEmpty()) {
          skillIdList_ = other.skillIdList_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureSkillIdListIsMutable();
          skillIdList_.addAll(other.skillIdList_);
        }
        onChanged();
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
      io.grasscutter.net.proto.activity.SumoTeamData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.SumoTeamData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.SumoAvatarInfo> avatarInfoList_ =
      java.util.Collections.emptyList();
    private void ensureAvatarInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        avatarInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.SumoAvatarInfo>(avatarInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.SumoAvatarInfo, io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder, io.grasscutter.net.proto.activity.SumoAvatarInfoOrBuilder> avatarInfoListBuilder_;

    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.SumoAvatarInfo> getAvatarInfoListList() {
      if (avatarInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(avatarInfoList_);
      } else {
        return avatarInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public int getAvatarInfoListCount() {
      if (avatarInfoListBuilder_ == null) {
        return avatarInfoList_.size();
      } else {
        return avatarInfoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public io.grasscutter.net.proto.activity.SumoAvatarInfo getAvatarInfoList(int index) {
      if (avatarInfoListBuilder_ == null) {
        return avatarInfoList_.get(index);
      } else {
        return avatarInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder setAvatarInfoList(
        int index, io.grasscutter.net.proto.activity.SumoAvatarInfo value) {
      if (avatarInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.set(index, value);
        onChanged();
      } else {
        avatarInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder setAvatarInfoList(
        int index, io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder builderForValue) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        avatarInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder addAvatarInfoList(io.grasscutter.net.proto.activity.SumoAvatarInfo value) {
      if (avatarInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.add(value);
        onChanged();
      } else {
        avatarInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder addAvatarInfoList(
        int index, io.grasscutter.net.proto.activity.SumoAvatarInfo value) {
      if (avatarInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.add(index, value);
        onChanged();
      } else {
        avatarInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder addAvatarInfoList(
        io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder builderForValue) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        avatarInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder addAvatarInfoList(
        int index, io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder builderForValue) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        avatarInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder addAllAvatarInfoList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.SumoAvatarInfo> values) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarInfoList_);
        onChanged();
      } else {
        avatarInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder clearAvatarInfoList() {
      if (avatarInfoListBuilder_ == null) {
        avatarInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        avatarInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public Builder removeAvatarInfoList(int index) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.remove(index);
        onChanged();
      } else {
        avatarInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder getAvatarInfoListBuilder(
        int index) {
      return getAvatarInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public io.grasscutter.net.proto.activity.SumoAvatarInfoOrBuilder getAvatarInfoListOrBuilder(
        int index) {
      if (avatarInfoListBuilder_ == null) {
        return avatarInfoList_.get(index);  } else {
        return avatarInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.SumoAvatarInfoOrBuilder> 
         getAvatarInfoListOrBuilderList() {
      if (avatarInfoListBuilder_ != null) {
        return avatarInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(avatarInfoList_);
      }
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder addAvatarInfoListBuilder() {
      return getAvatarInfoListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.SumoAvatarInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder addAvatarInfoListBuilder(
        int index) {
      return getAvatarInfoListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.SumoAvatarInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .SumoAvatarInfo avatar_info_list = 10;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder> 
         getAvatarInfoListBuilderList() {
      return getAvatarInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.SumoAvatarInfo, io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder, io.grasscutter.net.proto.activity.SumoAvatarInfoOrBuilder> 
        getAvatarInfoListFieldBuilder() {
      if (avatarInfoListBuilder_ == null) {
        avatarInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.SumoAvatarInfo, io.grasscutter.net.proto.activity.SumoAvatarInfo.Builder, io.grasscutter.net.proto.activity.SumoAvatarInfoOrBuilder>(
                avatarInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        avatarInfoList_ = null;
      }
      return avatarInfoListBuilder_;
    }

    private com.google.protobuf.Internal.IntList skillIdList_ = emptyIntList();
    private void ensureSkillIdListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        skillIdList_ = mutableCopy(skillIdList_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated uint32 skill_id_list = 9;</code>
     * @return A list containing the skillIdList.
     */
    public java.util.List<java.lang.Integer>
        getSkillIdListList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(skillIdList_) : skillIdList_;
    }
    /**
     * <code>repeated uint32 skill_id_list = 9;</code>
     * @return The count of skillIdList.
     */
    public int getSkillIdListCount() {
      return skillIdList_.size();
    }
    /**
     * <code>repeated uint32 skill_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The skillIdList at the given index.
     */
    public int getSkillIdList(int index) {
      return skillIdList_.getInt(index);
    }
    /**
     * <code>repeated uint32 skill_id_list = 9;</code>
     * @param index The index to set the value at.
     * @param value The skillIdList to set.
     * @return This builder for chaining.
     */
    public Builder setSkillIdList(
        int index, int value) {
      ensureSkillIdListIsMutable();
      skillIdList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 skill_id_list = 9;</code>
     * @param value The skillIdList to add.
     * @return This builder for chaining.
     */
    public Builder addSkillIdList(int value) {
      ensureSkillIdListIsMutable();
      skillIdList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 skill_id_list = 9;</code>
     * @param values The skillIdList to add.
     * @return This builder for chaining.
     */
    public Builder addAllSkillIdList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureSkillIdListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, skillIdList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 skill_id_list = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillIdList() {
      skillIdList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:SumoTeamData)
  }

  // @@protoc_insertion_point(class_scope:SumoTeamData)
  private static final io.grasscutter.net.proto.activity.SumoTeamData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.SumoTeamData();
  }

  public static io.grasscutter.net.proto.activity.SumoTeamData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SumoTeamData>
      PARSER = new com.google.protobuf.AbstractParser<SumoTeamData>() {
    @java.lang.Override
    public SumoTeamData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SumoTeamData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SumoTeamData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SumoTeamData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.SumoTeamData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

