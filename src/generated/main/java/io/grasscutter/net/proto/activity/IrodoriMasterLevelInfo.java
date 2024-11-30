// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code IrodoriMasterLevelInfo}
 */
public final class IrodoriMasterLevelInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IrodoriMasterLevelInfo)
    IrodoriMasterLevelInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IrodoriMasterLevelInfo.newBuilder() to construct.
  private IrodoriMasterLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IrodoriMasterLevelInfo() {
    detailInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IrodoriMasterLevelInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IrodoriMasterLevelInfo(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              detailInfo_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            detailInfo_.add(
                input.readMessage(io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.parser(), extensionRegistry));
            break;
          }
          case 64: {

            levelId_ = input.readUInt32();
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
        detailInfo_ = java.util.Collections.unmodifiableList(detailInfo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriMasterLevelInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriMasterLevelInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo.class, io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo.Builder.class);
  }

  public static final int DETAIL_INFO_FIELD_NUMBER = 2;
  private java.util.List<io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo> detailInfo_;
  /**
   * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo> getDetailInfoList() {
    return detailInfo_;
  }
  /**
   * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfoOrBuilder> 
      getDetailInfoOrBuilderList() {
    return detailInfo_;
  }
  /**
   * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
   */
  @java.lang.Override
  public int getDetailInfoCount() {
    return detailInfo_.size();
  }
  /**
   * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo getDetailInfo(int index) {
    return detailInfo_.get(index);
  }
  /**
   * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfoOrBuilder getDetailInfoOrBuilder(
      int index) {
    return detailInfo_.get(index);
  }

  public static final int LEVEL_ID_FIELD_NUMBER = 8;
  private int levelId_;
  /**
   * <code>uint32 level_id = 8;</code>
   * @return The levelId.
   */
  @java.lang.Override
  public int getLevelId() {
    return levelId_;
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
    for (int i = 0; i < detailInfo_.size(); i++) {
      output.writeMessage(2, detailInfo_.get(i));
    }
    if (levelId_ != 0) {
      output.writeUInt32(8, levelId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < detailInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, detailInfo_.get(i));
    }
    if (levelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, levelId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo other = (io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo) obj;

    if (!getDetailInfoList()
        .equals(other.getDetailInfoList())) return false;
    if (getLevelId()
        != other.getLevelId()) return false;
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
    if (getDetailInfoCount() > 0) {
      hash = (37 * hash) + DETAIL_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getDetailInfoList().hashCode();
    }
    hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLevelId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo prototype) {
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
   * Protobuf type {@code IrodoriMasterLevelInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IrodoriMasterLevelInfo)
      io.grasscutter.net.proto.activity.IrodoriMasterLevelInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriMasterLevelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriMasterLevelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo.class, io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo.newBuilder()
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
        getDetailInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (detailInfoBuilder_ == null) {
        detailInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        detailInfoBuilder_.clear();
      }
      levelId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriMasterLevelInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo build() {
      io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo buildPartial() {
      io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo result = new io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo(this);
      int from_bitField0_ = bitField0_;
      if (detailInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          detailInfo_ = java.util.Collections.unmodifiableList(detailInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.detailInfo_ = detailInfo_;
      } else {
        result.detailInfo_ = detailInfoBuilder_.build();
      }
      result.levelId_ = levelId_;
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
      if (other instanceof io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo other) {
      if (other == io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo.getDefaultInstance()) return this;
      if (detailInfoBuilder_ == null) {
        if (!other.detailInfo_.isEmpty()) {
          if (detailInfo_.isEmpty()) {
            detailInfo_ = other.detailInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDetailInfoIsMutable();
            detailInfo_.addAll(other.detailInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.detailInfo_.isEmpty()) {
          if (detailInfoBuilder_.isEmpty()) {
            detailInfoBuilder_.dispose();
            detailInfoBuilder_ = null;
            detailInfo_ = other.detailInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            detailInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDetailInfoFieldBuilder() : null;
          } else {
            detailInfoBuilder_.addAllMessages(other.detailInfo_);
          }
        }
      }
      if (other.getLevelId() != 0) {
        setLevelId(other.getLevelId());
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
      io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo> detailInfo_ =
      java.util.Collections.emptyList();
    private void ensureDetailInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        detailInfo_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo>(detailInfo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfoOrBuilder> detailInfoBuilder_;

    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo> getDetailInfoList() {
      if (detailInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(detailInfo_);
      } else {
        return detailInfoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public int getDetailInfoCount() {
      if (detailInfoBuilder_ == null) {
        return detailInfo_.size();
      } else {
        return detailInfoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo getDetailInfo(int index) {
      if (detailInfoBuilder_ == null) {
        return detailInfo_.get(index);
      } else {
        return detailInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder setDetailInfo(
        int index, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo value) {
      if (detailInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailInfoIsMutable();
        detailInfo_.set(index, value);
        onChanged();
      } else {
        detailInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder setDetailInfo(
        int index, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder builderForValue) {
      if (detailInfoBuilder_ == null) {
        ensureDetailInfoIsMutable();
        detailInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        detailInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder addDetailInfo(io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo value) {
      if (detailInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailInfoIsMutable();
        detailInfo_.add(value);
        onChanged();
      } else {
        detailInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder addDetailInfo(
        int index, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo value) {
      if (detailInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailInfoIsMutable();
        detailInfo_.add(index, value);
        onChanged();
      } else {
        detailInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder addDetailInfo(
        io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder builderForValue) {
      if (detailInfoBuilder_ == null) {
        ensureDetailInfoIsMutable();
        detailInfo_.add(builderForValue.build());
        onChanged();
      } else {
        detailInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder addDetailInfo(
        int index, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder builderForValue) {
      if (detailInfoBuilder_ == null) {
        ensureDetailInfoIsMutable();
        detailInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        detailInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder addAllDetailInfo(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo> values) {
      if (detailInfoBuilder_ == null) {
        ensureDetailInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, detailInfo_);
        onChanged();
      } else {
        detailInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder clearDetailInfo() {
      if (detailInfoBuilder_ == null) {
        detailInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        detailInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public Builder removeDetailInfo(int index) {
      if (detailInfoBuilder_ == null) {
        ensureDetailInfoIsMutable();
        detailInfo_.remove(index);
        onChanged();
      } else {
        detailInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder getDetailInfoBuilder(
        int index) {
      return getDetailInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfoOrBuilder getDetailInfoOrBuilder(
        int index) {
      if (detailInfoBuilder_ == null) {
        return detailInfo_.get(index);  } else {
        return detailInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfoOrBuilder> 
         getDetailInfoOrBuilderList() {
      if (detailInfoBuilder_ != null) {
        return detailInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(detailInfo_);
      }
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder addDetailInfoBuilder() {
      return getDetailInfoFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder addDetailInfoBuilder(
        int index) {
      return getDetailInfoFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .IrodoriMasterLevelDetailInfo detail_info = 2;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder> 
         getDetailInfoBuilderList() {
      return getDetailInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfoOrBuilder> 
        getDetailInfoFieldBuilder() {
      if (detailInfoBuilder_ == null) {
        detailInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfo.Builder, io.grasscutter.net.proto.activity.IrodoriMasterLevelDetailInfoOrBuilder>(
                detailInfo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        detailInfo_ = null;
      }
      return detailInfoBuilder_;
    }

    private int levelId_ ;
    /**
     * <code>uint32 level_id = 8;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }
    /**
     * <code>uint32 level_id = 8;</code>
     * @param value The levelId to set.
     * @return This builder for chaining.
     */
    public Builder setLevelId(int value) {
      
      levelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 level_id = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevelId() {
      
      levelId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:IrodoriMasterLevelInfo)
  }

  // @@protoc_insertion_point(class_scope:IrodoriMasterLevelInfo)
  private static final io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo();
  }

  public static io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IrodoriMasterLevelInfo>
      PARSER = new com.google.protobuf.AbstractParser<IrodoriMasterLevelInfo>() {
    @java.lang.Override
    public IrodoriMasterLevelInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IrodoriMasterLevelInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IrodoriMasterLevelInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IrodoriMasterLevelInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.IrodoriMasterLevelInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

