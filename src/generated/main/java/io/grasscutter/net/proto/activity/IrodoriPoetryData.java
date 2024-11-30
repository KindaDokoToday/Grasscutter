// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code IrodoriPoetryData}
 */
public final class IrodoriPoetryData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IrodoriPoetryData)
    IrodoriPoetryDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IrodoriPoetryData.newBuilder() to construct.
  private IrodoriPoetryData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IrodoriPoetryData() {
    themeDataList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IrodoriPoetryData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IrodoriPoetryData(
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
          case 80: {

            curThemeId_ = input.readUInt32();
            break;
          }
          case 90: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              themeDataList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.IrodoriPoetryThemeData>();
              mutable_bitField0_ |= 0x00000001;
            }
            themeDataList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.parser(), extensionRegistry));
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
        themeDataList_ = java.util.Collections.unmodifiableList(themeDataList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriPoetryData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriPoetryData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.IrodoriPoetryData.class, io.grasscutter.net.proto.activity.IrodoriPoetryData.Builder.class);
  }

  public static final int THEME_DATA_LIST_FIELD_NUMBER = 11;
  private java.util.List<io.grasscutter.net.proto.activity.IrodoriPoetryThemeData> themeDataList_;
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.IrodoriPoetryThemeData> getThemeDataListList() {
    return themeDataList_;
  }
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder> 
      getThemeDataListOrBuilderList() {
    return themeDataList_;
  }
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  @java.lang.Override
  public int getThemeDataListCount() {
    return themeDataList_.size();
  }
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.IrodoriPoetryThemeData getThemeDataList(int index) {
    return themeDataList_.get(index);
  }
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder getThemeDataListOrBuilder(
      int index) {
    return themeDataList_.get(index);
  }

  public static final int CUR_THEME_ID_FIELD_NUMBER = 10;
  private int curThemeId_;
  /**
   * <code>uint32 cur_theme_id = 10;</code>
   * @return The curThemeId.
   */
  @java.lang.Override
  public int getCurThemeId() {
    return curThemeId_;
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
    if (curThemeId_ != 0) {
      output.writeUInt32(10, curThemeId_);
    }
    for (int i = 0; i < themeDataList_.size(); i++) {
      output.writeMessage(11, themeDataList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (curThemeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(10, curThemeId_);
    }
    for (int i = 0; i < themeDataList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, themeDataList_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.IrodoriPoetryData)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.IrodoriPoetryData other = (io.grasscutter.net.proto.activity.IrodoriPoetryData) obj;

    if (!getThemeDataListList()
        .equals(other.getThemeDataListList())) return false;
    if (getCurThemeId()
        != other.getCurThemeId()) return false;
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
    if (getThemeDataListCount() > 0) {
      hash = (37 * hash) + THEME_DATA_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getThemeDataListList().hashCode();
    }
    hash = (37 * hash) + CUR_THEME_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCurThemeId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IrodoriPoetryData parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.IrodoriPoetryData prototype) {
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
   * Protobuf type {@code IrodoriPoetryData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IrodoriPoetryData)
      io.grasscutter.net.proto.activity.IrodoriPoetryDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriPoetryData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriPoetryData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.IrodoriPoetryData.class, io.grasscutter.net.proto.activity.IrodoriPoetryData.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.IrodoriPoetryData.newBuilder()
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
        getThemeDataListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (themeDataListBuilder_ == null) {
        themeDataList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        themeDataListBuilder_.clear();
      }
      curThemeId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IrodoriPoetryData_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IrodoriPoetryData getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.IrodoriPoetryData.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IrodoriPoetryData build() {
      io.grasscutter.net.proto.activity.IrodoriPoetryData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IrodoriPoetryData buildPartial() {
      io.grasscutter.net.proto.activity.IrodoriPoetryData result = new io.grasscutter.net.proto.activity.IrodoriPoetryData(this);
      int from_bitField0_ = bitField0_;
      if (themeDataListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          themeDataList_ = java.util.Collections.unmodifiableList(themeDataList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.themeDataList_ = themeDataList_;
      } else {
        result.themeDataList_ = themeDataListBuilder_.build();
      }
      result.curThemeId_ = curThemeId_;
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
      if (other instanceof io.grasscutter.net.proto.activity.IrodoriPoetryData) {
        return mergeFrom((io.grasscutter.net.proto.activity.IrodoriPoetryData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.IrodoriPoetryData other) {
      if (other == io.grasscutter.net.proto.activity.IrodoriPoetryData.getDefaultInstance()) return this;
      if (themeDataListBuilder_ == null) {
        if (!other.themeDataList_.isEmpty()) {
          if (themeDataList_.isEmpty()) {
            themeDataList_ = other.themeDataList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureThemeDataListIsMutable();
            themeDataList_.addAll(other.themeDataList_);
          }
          onChanged();
        }
      } else {
        if (!other.themeDataList_.isEmpty()) {
          if (themeDataListBuilder_.isEmpty()) {
            themeDataListBuilder_.dispose();
            themeDataListBuilder_ = null;
            themeDataList_ = other.themeDataList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            themeDataListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getThemeDataListFieldBuilder() : null;
          } else {
            themeDataListBuilder_.addAllMessages(other.themeDataList_);
          }
        }
      }
      if (other.getCurThemeId() != 0) {
        setCurThemeId(other.getCurThemeId());
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
      io.grasscutter.net.proto.activity.IrodoriPoetryData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.IrodoriPoetryData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.IrodoriPoetryThemeData> themeDataList_ =
      java.util.Collections.emptyList();
    private void ensureThemeDataListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        themeDataList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.IrodoriPoetryThemeData>(themeDataList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.IrodoriPoetryThemeData, io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder, io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder> themeDataListBuilder_;

    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.IrodoriPoetryThemeData> getThemeDataListList() {
      if (themeDataListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(themeDataList_);
      } else {
        return themeDataListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public int getThemeDataListCount() {
      if (themeDataListBuilder_ == null) {
        return themeDataList_.size();
      } else {
        return themeDataListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriPoetryThemeData getThemeDataList(int index) {
      if (themeDataListBuilder_ == null) {
        return themeDataList_.get(index);
      } else {
        return themeDataListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder setThemeDataList(
        int index, io.grasscutter.net.proto.activity.IrodoriPoetryThemeData value) {
      if (themeDataListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThemeDataListIsMutable();
        themeDataList_.set(index, value);
        onChanged();
      } else {
        themeDataListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder setThemeDataList(
        int index, io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder builderForValue) {
      if (themeDataListBuilder_ == null) {
        ensureThemeDataListIsMutable();
        themeDataList_.set(index, builderForValue.build());
        onChanged();
      } else {
        themeDataListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder addThemeDataList(io.grasscutter.net.proto.activity.IrodoriPoetryThemeData value) {
      if (themeDataListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThemeDataListIsMutable();
        themeDataList_.add(value);
        onChanged();
      } else {
        themeDataListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder addThemeDataList(
        int index, io.grasscutter.net.proto.activity.IrodoriPoetryThemeData value) {
      if (themeDataListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThemeDataListIsMutable();
        themeDataList_.add(index, value);
        onChanged();
      } else {
        themeDataListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder addThemeDataList(
        io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder builderForValue) {
      if (themeDataListBuilder_ == null) {
        ensureThemeDataListIsMutable();
        themeDataList_.add(builderForValue.build());
        onChanged();
      } else {
        themeDataListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder addThemeDataList(
        int index, io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder builderForValue) {
      if (themeDataListBuilder_ == null) {
        ensureThemeDataListIsMutable();
        themeDataList_.add(index, builderForValue.build());
        onChanged();
      } else {
        themeDataListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder addAllThemeDataList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.IrodoriPoetryThemeData> values) {
      if (themeDataListBuilder_ == null) {
        ensureThemeDataListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, themeDataList_);
        onChanged();
      } else {
        themeDataListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder clearThemeDataList() {
      if (themeDataListBuilder_ == null) {
        themeDataList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        themeDataListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public Builder removeThemeDataList(int index) {
      if (themeDataListBuilder_ == null) {
        ensureThemeDataListIsMutable();
        themeDataList_.remove(index);
        onChanged();
      } else {
        themeDataListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder getThemeDataListBuilder(
        int index) {
      return getThemeDataListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder getThemeDataListOrBuilder(
        int index) {
      if (themeDataListBuilder_ == null) {
        return themeDataList_.get(index);  } else {
        return themeDataListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder> 
         getThemeDataListOrBuilderList() {
      if (themeDataListBuilder_ != null) {
        return themeDataListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(themeDataList_);
      }
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder addThemeDataListBuilder() {
      return getThemeDataListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.getDefaultInstance());
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder addThemeDataListBuilder(
        int index) {
      return getThemeDataListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.getDefaultInstance());
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder> 
         getThemeDataListBuilderList() {
      return getThemeDataListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.IrodoriPoetryThemeData, io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder, io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder> 
        getThemeDataListFieldBuilder() {
      if (themeDataListBuilder_ == null) {
        themeDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.IrodoriPoetryThemeData, io.grasscutter.net.proto.activity.IrodoriPoetryThemeData.Builder, io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder>(
                themeDataList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        themeDataList_ = null;
      }
      return themeDataListBuilder_;
    }

    private int curThemeId_ ;
    /**
     * <code>uint32 cur_theme_id = 10;</code>
     * @return The curThemeId.
     */
    @java.lang.Override
    public int getCurThemeId() {
      return curThemeId_;
    }
    /**
     * <code>uint32 cur_theme_id = 10;</code>
     * @param value The curThemeId to set.
     * @return This builder for chaining.
     */
    public Builder setCurThemeId(int value) {
      
      curThemeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 cur_theme_id = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurThemeId() {
      
      curThemeId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:IrodoriPoetryData)
  }

  // @@protoc_insertion_point(class_scope:IrodoriPoetryData)
  private static final io.grasscutter.net.proto.activity.IrodoriPoetryData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.IrodoriPoetryData();
  }

  public static io.grasscutter.net.proto.activity.IrodoriPoetryData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IrodoriPoetryData>
      PARSER = new com.google.protobuf.AbstractParser<IrodoriPoetryData>() {
    @java.lang.Override
    public IrodoriPoetryData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IrodoriPoetryData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IrodoriPoetryData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IrodoriPoetryData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.IrodoriPoetryData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

