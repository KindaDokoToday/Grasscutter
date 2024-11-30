// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code ActivityScheduleInfo}
 */
public final class ActivityScheduleInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ActivityScheduleInfo)
    ActivityScheduleInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActivityScheduleInfo.newBuilder() to construct.
  private ActivityScheduleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActivityScheduleInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ActivityScheduleInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ActivityScheduleInfo(
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
          case 24: {

            endTime_ = input.readUInt32();
            break;
          }
          case 56: {

            beginTime_ = input.readUInt32();
            break;
          }
          case 64: {

            isOpen_ = input.readBool();
            break;
          }
          case 104: {

            scheduleId_ = input.readUInt32();
            break;
          }
          case 120: {

            activityId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_ActivityScheduleInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_ActivityScheduleInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.ActivityScheduleInfo.class, io.grasscutter.net.proto.activity.ActivityScheduleInfo.Builder.class);
  }

  public static final int IS_OPEN_FIELD_NUMBER = 8;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 8;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int ACTIVITY_ID_FIELD_NUMBER = 15;
  private int activityId_;
  /**
   * <code>uint32 activity_id = 15;</code>
   * @return The activityId.
   */
  @java.lang.Override
  public int getActivityId() {
    return activityId_;
  }

  public static final int BEGIN_TIME_FIELD_NUMBER = 7;
  private int beginTime_;
  /**
   * <code>uint32 begin_time = 7;</code>
   * @return The beginTime.
   */
  @java.lang.Override
  public int getBeginTime() {
    return beginTime_;
  }

  public static final int SCHEDULE_ID_FIELD_NUMBER = 13;
  private int scheduleId_;
  /**
   * <code>uint32 schedule_id = 13;</code>
   * @return The scheduleId.
   */
  @java.lang.Override
  public int getScheduleId() {
    return scheduleId_;
  }

  public static final int END_TIME_FIELD_NUMBER = 3;
  private int endTime_;
  /**
   * <code>uint32 end_time = 3;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public int getEndTime() {
    return endTime_;
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
    if (endTime_ != 0) {
      output.writeUInt32(3, endTime_);
    }
    if (beginTime_ != 0) {
      output.writeUInt32(7, beginTime_);
    }
    if (isOpen_ != false) {
      output.writeBool(8, isOpen_);
    }
    if (scheduleId_ != 0) {
      output.writeUInt32(13, scheduleId_);
    }
    if (activityId_ != 0) {
      output.writeUInt32(15, activityId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (endTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, endTime_);
    }
    if (beginTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, beginTime_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, isOpen_);
    }
    if (scheduleId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, scheduleId_);
    }
    if (activityId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, activityId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.ActivityScheduleInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.ActivityScheduleInfo other = (io.grasscutter.net.proto.activity.ActivityScheduleInfo) obj;

    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getActivityId()
        != other.getActivityId()) return false;
    if (getBeginTime()
        != other.getBeginTime()) return false;
    if (getScheduleId()
        != other.getScheduleId()) return false;
    if (getEndTime()
        != other.getEndTime()) return false;
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
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getActivityId();
    hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getBeginTime();
    hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getScheduleId();
    hash = (37 * hash) + END_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getEndTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.ActivityScheduleInfo prototype) {
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
   * Protobuf type {@code ActivityScheduleInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ActivityScheduleInfo)
      io.grasscutter.net.proto.activity.ActivityScheduleInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ActivityScheduleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ActivityScheduleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.ActivityScheduleInfo.class, io.grasscutter.net.proto.activity.ActivityScheduleInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.ActivityScheduleInfo.newBuilder()
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
      isOpen_ = false;

      activityId_ = 0;

      beginTime_ = 0;

      scheduleId_ = 0;

      endTime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ActivityScheduleInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ActivityScheduleInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.ActivityScheduleInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ActivityScheduleInfo build() {
      io.grasscutter.net.proto.activity.ActivityScheduleInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ActivityScheduleInfo buildPartial() {
      io.grasscutter.net.proto.activity.ActivityScheduleInfo result = new io.grasscutter.net.proto.activity.ActivityScheduleInfo(this);
      result.isOpen_ = isOpen_;
      result.activityId_ = activityId_;
      result.beginTime_ = beginTime_;
      result.scheduleId_ = scheduleId_;
      result.endTime_ = endTime_;
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
      if (other instanceof io.grasscutter.net.proto.activity.ActivityScheduleInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.ActivityScheduleInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.ActivityScheduleInfo other) {
      if (other == io.grasscutter.net.proto.activity.ActivityScheduleInfo.getDefaultInstance()) return this;
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getActivityId() != 0) {
        setActivityId(other.getActivityId());
      }
      if (other.getBeginTime() != 0) {
        setBeginTime(other.getBeginTime());
      }
      if (other.getScheduleId() != 0) {
        setScheduleId(other.getScheduleId());
      }
      if (other.getEndTime() != 0) {
        setEndTime(other.getEndTime());
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
      io.grasscutter.net.proto.activity.ActivityScheduleInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.ActivityScheduleInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 8;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private int activityId_ ;
    /**
     * <code>uint32 activity_id = 15;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }
    /**
     * <code>uint32 activity_id = 15;</code>
     * @param value The activityId to set.
     * @return This builder for chaining.
     */
    public Builder setActivityId(int value) {
      
      activityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 activity_id = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearActivityId() {
      
      activityId_ = 0;
      onChanged();
      return this;
    }

    private int beginTime_ ;
    /**
     * <code>uint32 begin_time = 7;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }
    /**
     * <code>uint32 begin_time = 7;</code>
     * @param value The beginTime to set.
     * @return This builder for chaining.
     */
    public Builder setBeginTime(int value) {
      
      beginTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 begin_time = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeginTime() {
      
      beginTime_ = 0;
      onChanged();
      return this;
    }

    private int scheduleId_ ;
    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }
    /**
     * <code>uint32 schedule_id = 13;</code>
     * @param value The scheduleId to set.
     * @return This builder for chaining.
     */
    public Builder setScheduleId(int value) {
      
      scheduleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearScheduleId() {
      
      scheduleId_ = 0;
      onChanged();
      return this;
    }

    private int endTime_ ;
    /**
     * <code>uint32 end_time = 3;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }
    /**
     * <code>uint32 end_time = 3;</code>
     * @param value The endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTime(int value) {
      
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 end_time = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTime() {
      
      endTime_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ActivityScheduleInfo)
  }

  // @@protoc_insertion_point(class_scope:ActivityScheduleInfo)
  private static final io.grasscutter.net.proto.activity.ActivityScheduleInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.ActivityScheduleInfo();
  }

  public static io.grasscutter.net.proto.activity.ActivityScheduleInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActivityScheduleInfo>
      PARSER = new com.google.protobuf.AbstractParser<ActivityScheduleInfo>() {
    @java.lang.Override
    public ActivityScheduleInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ActivityScheduleInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ActivityScheduleInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActivityScheduleInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.ActivityScheduleInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

