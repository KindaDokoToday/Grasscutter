// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code DragonSpineChapterInfo}
 */
public final class DragonSpineChapterInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DragonSpineChapterInfo)
    DragonSpineChapterInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DragonSpineChapterInfo.newBuilder() to construct.
  private DragonSpineChapterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DragonSpineChapterInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DragonSpineChapterInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DragonSpineChapterInfo(
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
          case 32: {

            openTime_ = input.readUInt32();
            break;
          }
          case 48: {

            progress_ = input.readUInt32();
            break;
          }
          case 56: {

            chapterId_ = input.readUInt32();
            break;
          }
          case 64: {

            isOpen_ = input.readBool();
            break;
          }
          case 112: {

            finishedMissionNum_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_DragonSpineChapterInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_DragonSpineChapterInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.DragonSpineChapterInfo.class, io.grasscutter.net.proto.activity.DragonSpineChapterInfo.Builder.class);
  }

  public static final int FINISHED_MISSION_NUM_FIELD_NUMBER = 14;
  private int finishedMissionNum_;
  /**
   * <code>uint32 finished_mission_num = 14;</code>
   * @return The finishedMissionNum.
   */
  @java.lang.Override
  public int getFinishedMissionNum() {
    return finishedMissionNum_;
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

  public static final int CHAPTER_ID_FIELD_NUMBER = 7;
  private int chapterId_;
  /**
   * <code>uint32 chapter_id = 7;</code>
   * @return The chapterId.
   */
  @java.lang.Override
  public int getChapterId() {
    return chapterId_;
  }

  public static final int OPEN_TIME_FIELD_NUMBER = 4;
  private int openTime_;
  /**
   * <code>uint32 open_time = 4;</code>
   * @return The openTime.
   */
  @java.lang.Override
  public int getOpenTime() {
    return openTime_;
  }

  public static final int PROGRESS_FIELD_NUMBER = 6;
  private int progress_;
  /**
   * <code>uint32 progress = 6;</code>
   * @return The progress.
   */
  @java.lang.Override
  public int getProgress() {
    return progress_;
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
    if (openTime_ != 0) {
      output.writeUInt32(4, openTime_);
    }
    if (progress_ != 0) {
      output.writeUInt32(6, progress_);
    }
    if (chapterId_ != 0) {
      output.writeUInt32(7, chapterId_);
    }
    if (isOpen_ != false) {
      output.writeBool(8, isOpen_);
    }
    if (finishedMissionNum_ != 0) {
      output.writeUInt32(14, finishedMissionNum_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (openTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, openTime_);
    }
    if (progress_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, progress_);
    }
    if (chapterId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, chapterId_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, isOpen_);
    }
    if (finishedMissionNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, finishedMissionNum_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.DragonSpineChapterInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.DragonSpineChapterInfo other = (io.grasscutter.net.proto.activity.DragonSpineChapterInfo) obj;

    if (getFinishedMissionNum()
        != other.getFinishedMissionNum()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getChapterId()
        != other.getChapterId()) return false;
    if (getOpenTime()
        != other.getOpenTime()) return false;
    if (getProgress()
        != other.getProgress()) return false;
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
    hash = (37 * hash) + FINISHED_MISSION_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getFinishedMissionNum();
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChapterId();
    hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getOpenTime();
    hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + getProgress();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.DragonSpineChapterInfo prototype) {
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
   * Protobuf type {@code DragonSpineChapterInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DragonSpineChapterInfo)
      io.grasscutter.net.proto.activity.DragonSpineChapterInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DragonSpineChapterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DragonSpineChapterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.DragonSpineChapterInfo.class, io.grasscutter.net.proto.activity.DragonSpineChapterInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.DragonSpineChapterInfo.newBuilder()
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
      finishedMissionNum_ = 0;

      isOpen_ = false;

      chapterId_ = 0;

      openTime_ = 0;

      progress_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DragonSpineChapterInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DragonSpineChapterInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.DragonSpineChapterInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DragonSpineChapterInfo build() {
      io.grasscutter.net.proto.activity.DragonSpineChapterInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DragonSpineChapterInfo buildPartial() {
      io.grasscutter.net.proto.activity.DragonSpineChapterInfo result = new io.grasscutter.net.proto.activity.DragonSpineChapterInfo(this);
      result.finishedMissionNum_ = finishedMissionNum_;
      result.isOpen_ = isOpen_;
      result.chapterId_ = chapterId_;
      result.openTime_ = openTime_;
      result.progress_ = progress_;
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
      if (other instanceof io.grasscutter.net.proto.activity.DragonSpineChapterInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.DragonSpineChapterInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.DragonSpineChapterInfo other) {
      if (other == io.grasscutter.net.proto.activity.DragonSpineChapterInfo.getDefaultInstance()) return this;
      if (other.getFinishedMissionNum() != 0) {
        setFinishedMissionNum(other.getFinishedMissionNum());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getChapterId() != 0) {
        setChapterId(other.getChapterId());
      }
      if (other.getOpenTime() != 0) {
        setOpenTime(other.getOpenTime());
      }
      if (other.getProgress() != 0) {
        setProgress(other.getProgress());
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
      io.grasscutter.net.proto.activity.DragonSpineChapterInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.DragonSpineChapterInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int finishedMissionNum_ ;
    /**
     * <code>uint32 finished_mission_num = 14;</code>
     * @return The finishedMissionNum.
     */
    @java.lang.Override
    public int getFinishedMissionNum() {
      return finishedMissionNum_;
    }
    /**
     * <code>uint32 finished_mission_num = 14;</code>
     * @param value The finishedMissionNum to set.
     * @return This builder for chaining.
     */
    public Builder setFinishedMissionNum(int value) {
      
      finishedMissionNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 finished_mission_num = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearFinishedMissionNum() {
      
      finishedMissionNum_ = 0;
      onChanged();
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

    private int chapterId_ ;
    /**
     * <code>uint32 chapter_id = 7;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      return chapterId_;
    }
    /**
     * <code>uint32 chapter_id = 7;</code>
     * @param value The chapterId to set.
     * @return This builder for chaining.
     */
    public Builder setChapterId(int value) {
      
      chapterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 chapter_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearChapterId() {
      
      chapterId_ = 0;
      onChanged();
      return this;
    }

    private int openTime_ ;
    /**
     * <code>uint32 open_time = 4;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }
    /**
     * <code>uint32 open_time = 4;</code>
     * @param value The openTime to set.
     * @return This builder for chaining.
     */
    public Builder setOpenTime(int value) {
      
      openTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 open_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenTime() {
      
      openTime_ = 0;
      onChanged();
      return this;
    }

    private int progress_ ;
    /**
     * <code>uint32 progress = 6;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }
    /**
     * <code>uint32 progress = 6;</code>
     * @param value The progress to set.
     * @return This builder for chaining.
     */
    public Builder setProgress(int value) {
      
      progress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 progress = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgress() {
      
      progress_ = 0;
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


    // @@protoc_insertion_point(builder_scope:DragonSpineChapterInfo)
  }

  // @@protoc_insertion_point(class_scope:DragonSpineChapterInfo)
  private static final io.grasscutter.net.proto.activity.DragonSpineChapterInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.DragonSpineChapterInfo();
  }

  public static io.grasscutter.net.proto.activity.DragonSpineChapterInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DragonSpineChapterInfo>
      PARSER = new com.google.protobuf.AbstractParser<DragonSpineChapterInfo>() {
    @java.lang.Override
    public DragonSpineChapterInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DragonSpineChapterInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DragonSpineChapterInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DragonSpineChapterInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.DragonSpineChapterInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

