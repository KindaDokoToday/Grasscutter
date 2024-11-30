// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code LanternProjectionLevelInfo}
 */
public final class LanternProjectionLevelInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LanternProjectionLevelInfo)
    LanternProjectionLevelInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanternProjectionLevelInfo.newBuilder() to construct.
  private LanternProjectionLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanternProjectionLevelInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LanternProjectionLevelInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LanternProjectionLevelInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 40: {

            isFinished_ = input.readBool();
            break;
          }
          case 56: {

            isShowTips_ = input.readBool();
            break;
          }
          case 88: {

            isCanStart_ = input.readBool();
            break;
          }
          case 96: {

            minFinishTime_ = input.readUInt32();
            break;
          }
          case 112: {

            id_ = input.readUInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_LanternProjectionLevelInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_LanternProjectionLevelInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.LanternProjectionLevelInfo.class, io.grasscutter.net.proto.activity.LanternProjectionLevelInfo.Builder.class);
  }

  public static final int MIN_FINISH_TIME_FIELD_NUMBER = 12;
  private int minFinishTime_;
  /**
   * <code>uint32 min_finish_time = 12;</code>
   * @return The minFinishTime.
   */
  @java.lang.Override
  public int getMinFinishTime() {
    return minFinishTime_;
  }

  public static final int ID_FIELD_NUMBER = 14;
  private int id_;
  /**
   * <code>uint32 id = 14;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int IS_SHOW_TIPS_FIELD_NUMBER = 7;
  private boolean isShowTips_;
  /**
   * <code>bool is_show_tips = 7;</code>
   * @return The isShowTips.
   */
  @java.lang.Override
  public boolean getIsShowTips() {
    return isShowTips_;
  }

  public static final int IS_FINISHED_FIELD_NUMBER = 5;
  private boolean isFinished_;
  /**
   * <code>bool is_finished = 5;</code>
   * @return The isFinished.
   */
  @java.lang.Override
  public boolean getIsFinished() {
    return isFinished_;
  }

  public static final int IS_CAN_START_FIELD_NUMBER = 11;
  private boolean isCanStart_;
  /**
   * <code>bool is_can_start = 11;</code>
   * @return The isCanStart.
   */
  @java.lang.Override
  public boolean getIsCanStart() {
    return isCanStart_;
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
    if (isFinished_ != false) {
      output.writeBool(5, isFinished_);
    }
    if (isShowTips_ != false) {
      output.writeBool(7, isShowTips_);
    }
    if (isCanStart_ != false) {
      output.writeBool(11, isCanStart_);
    }
    if (minFinishTime_ != 0) {
      output.writeUInt32(12, minFinishTime_);
    }
    if (id_ != 0) {
      output.writeUInt32(14, id_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isFinished_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isFinished_);
    }
    if (isShowTips_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isShowTips_);
    }
    if (isCanStart_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(11, isCanStart_);
    }
    if (minFinishTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, minFinishTime_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, id_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.LanternProjectionLevelInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.LanternProjectionLevelInfo other = (io.grasscutter.net.proto.activity.LanternProjectionLevelInfo) obj;

    if (getMinFinishTime()
        != other.getMinFinishTime()) return false;
    if (getId()
        != other.getId()) return false;
    if (getIsShowTips()
        != other.getIsShowTips()) return false;
    if (getIsFinished()
        != other.getIsFinished()) return false;
    if (getIsCanStart()
        != other.getIsCanStart()) return false;
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
    hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getMinFinishTime();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + IS_SHOW_TIPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsShowTips());
    hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFinished());
    hash = (37 * hash) + IS_CAN_START_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCanStart());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.LanternProjectionLevelInfo prototype) {
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
   * Protobuf type {@code LanternProjectionLevelInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LanternProjectionLevelInfo)
      io.grasscutter.net.proto.activity.LanternProjectionLevelInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LanternProjectionLevelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LanternProjectionLevelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.LanternProjectionLevelInfo.class, io.grasscutter.net.proto.activity.LanternProjectionLevelInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.LanternProjectionLevelInfo.newBuilder()
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
      minFinishTime_ = 0;

      id_ = 0;

      isShowTips_ = false;

      isFinished_ = false;

      isCanStart_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LanternProjectionLevelInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LanternProjectionLevelInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.LanternProjectionLevelInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LanternProjectionLevelInfo build() {
      io.grasscutter.net.proto.activity.LanternProjectionLevelInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LanternProjectionLevelInfo buildPartial() {
      io.grasscutter.net.proto.activity.LanternProjectionLevelInfo result = new io.grasscutter.net.proto.activity.LanternProjectionLevelInfo(this);
      result.minFinishTime_ = minFinishTime_;
      result.id_ = id_;
      result.isShowTips_ = isShowTips_;
      result.isFinished_ = isFinished_;
      result.isCanStart_ = isCanStart_;
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
      if (other instanceof io.grasscutter.net.proto.activity.LanternProjectionLevelInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.LanternProjectionLevelInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.LanternProjectionLevelInfo other) {
      if (other == io.grasscutter.net.proto.activity.LanternProjectionLevelInfo.getDefaultInstance()) return this;
      if (other.getMinFinishTime() != 0) {
        setMinFinishTime(other.getMinFinishTime());
      }
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getIsShowTips() != false) {
        setIsShowTips(other.getIsShowTips());
      }
      if (other.getIsFinished() != false) {
        setIsFinished(other.getIsFinished());
      }
      if (other.getIsCanStart() != false) {
        setIsCanStart(other.getIsCanStart());
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
      io.grasscutter.net.proto.activity.LanternProjectionLevelInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.LanternProjectionLevelInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int minFinishTime_ ;
    /**
     * <code>uint32 min_finish_time = 12;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }
    /**
     * <code>uint32 min_finish_time = 12;</code>
     * @param value The minFinishTime to set.
     * @return This builder for chaining.
     */
    public Builder setMinFinishTime(int value) {
      
      minFinishTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 min_finish_time = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinFinishTime() {
      
      minFinishTime_ = 0;
      onChanged();
      return this;
    }

    private int id_ ;
    /**
     * <code>uint32 id = 14;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>uint32 id = 14;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 id = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private boolean isShowTips_ ;
    /**
     * <code>bool is_show_tips = 7;</code>
     * @return The isShowTips.
     */
    @java.lang.Override
    public boolean getIsShowTips() {
      return isShowTips_;
    }
    /**
     * <code>bool is_show_tips = 7;</code>
     * @param value The isShowTips to set.
     * @return This builder for chaining.
     */
    public Builder setIsShowTips(boolean value) {
      
      isShowTips_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_show_tips = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsShowTips() {
      
      isShowTips_ = false;
      onChanged();
      return this;
    }

    private boolean isFinished_ ;
    /**
     * <code>bool is_finished = 5;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }
    /**
     * <code>bool is_finished = 5;</code>
     * @param value The isFinished to set.
     * @return This builder for chaining.
     */
    public Builder setIsFinished(boolean value) {
      
      isFinished_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_finished = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFinished() {
      
      isFinished_ = false;
      onChanged();
      return this;
    }

    private boolean isCanStart_ ;
    /**
     * <code>bool is_can_start = 11;</code>
     * @return The isCanStart.
     */
    @java.lang.Override
    public boolean getIsCanStart() {
      return isCanStart_;
    }
    /**
     * <code>bool is_can_start = 11;</code>
     * @param value The isCanStart to set.
     * @return This builder for chaining.
     */
    public Builder setIsCanStart(boolean value) {
      
      isCanStart_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_can_start = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsCanStart() {
      
      isCanStart_ = false;
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


    // @@protoc_insertion_point(builder_scope:LanternProjectionLevelInfo)
  }

  // @@protoc_insertion_point(class_scope:LanternProjectionLevelInfo)
  private static final io.grasscutter.net.proto.activity.LanternProjectionLevelInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.LanternProjectionLevelInfo();
  }

  public static io.grasscutter.net.proto.activity.LanternProjectionLevelInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LanternProjectionLevelInfo>
      PARSER = new com.google.protobuf.AbstractParser<LanternProjectionLevelInfo>() {
    @java.lang.Override
    public LanternProjectionLevelInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LanternProjectionLevelInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LanternProjectionLevelInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanternProjectionLevelInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.LanternProjectionLevelInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

