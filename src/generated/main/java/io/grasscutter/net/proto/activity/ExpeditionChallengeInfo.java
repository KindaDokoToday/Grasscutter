// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code ExpeditionChallengeInfo}
 */
public final class ExpeditionChallengeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ExpeditionChallengeInfo)
    ExpeditionChallengeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpeditionChallengeInfo.newBuilder() to construct.
  private ExpeditionChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpeditionChallengeInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExpeditionChallengeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExpeditionChallengeInfo(
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
          case 16: {

            isFinished_ = input.readBool();
            break;
          }
          case 40: {

            id_ = input.readUInt32();
            break;
          }
          case 88: {

            openTime_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionChallengeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionChallengeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.ExpeditionChallengeInfo.class, io.grasscutter.net.proto.activity.ExpeditionChallengeInfo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 5;
  private int id_;
  /**
   * <code>uint32 id = 5;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int IS_FINISHED_FIELD_NUMBER = 2;
  private boolean isFinished_;
  /**
   * <code>bool is_finished = 2;</code>
   * @return The isFinished.
   */
  @java.lang.Override
  public boolean getIsFinished() {
    return isFinished_;
  }

  public static final int OPEN_TIME_FIELD_NUMBER = 11;
  private int openTime_;
  /**
   * <code>uint32 open_time = 11;</code>
   * @return The openTime.
   */
  @java.lang.Override
  public int getOpenTime() {
    return openTime_;
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
      output.writeBool(2, isFinished_);
    }
    if (id_ != 0) {
      output.writeUInt32(5, id_);
    }
    if (openTime_ != 0) {
      output.writeUInt32(11, openTime_);
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
        .computeBoolSize(2, isFinished_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, id_);
    }
    if (openTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, openTime_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.ExpeditionChallengeInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.ExpeditionChallengeInfo other = (io.grasscutter.net.proto.activity.ExpeditionChallengeInfo) obj;

    if (getId()
        != other.getId()) return false;
    if (getIsFinished()
        != other.getIsFinished()) return false;
    if (getOpenTime()
        != other.getOpenTime()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFinished());
    hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getOpenTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.ExpeditionChallengeInfo prototype) {
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
   * Protobuf type {@code ExpeditionChallengeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ExpeditionChallengeInfo)
      io.grasscutter.net.proto.activity.ExpeditionChallengeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.ExpeditionChallengeInfo.class, io.grasscutter.net.proto.activity.ExpeditionChallengeInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.ExpeditionChallengeInfo.newBuilder()
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
      id_ = 0;

      isFinished_ = false;

      openTime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionChallengeInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ExpeditionChallengeInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.ExpeditionChallengeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ExpeditionChallengeInfo build() {
      io.grasscutter.net.proto.activity.ExpeditionChallengeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ExpeditionChallengeInfo buildPartial() {
      io.grasscutter.net.proto.activity.ExpeditionChallengeInfo result = new io.grasscutter.net.proto.activity.ExpeditionChallengeInfo(this);
      result.id_ = id_;
      result.isFinished_ = isFinished_;
      result.openTime_ = openTime_;
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
      if (other instanceof io.grasscutter.net.proto.activity.ExpeditionChallengeInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.ExpeditionChallengeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.ExpeditionChallengeInfo other) {
      if (other == io.grasscutter.net.proto.activity.ExpeditionChallengeInfo.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getIsFinished() != false) {
        setIsFinished(other.getIsFinished());
      }
      if (other.getOpenTime() != 0) {
        setOpenTime(other.getOpenTime());
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
      io.grasscutter.net.proto.activity.ExpeditionChallengeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.ExpeditionChallengeInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>uint32 id = 5;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>uint32 id = 5;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private boolean isFinished_ ;
    /**
     * <code>bool is_finished = 2;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }
    /**
     * <code>bool is_finished = 2;</code>
     * @param value The isFinished to set.
     * @return This builder for chaining.
     */
    public Builder setIsFinished(boolean value) {
      
      isFinished_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_finished = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFinished() {
      
      isFinished_ = false;
      onChanged();
      return this;
    }

    private int openTime_ ;
    /**
     * <code>uint32 open_time = 11;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }
    /**
     * <code>uint32 open_time = 11;</code>
     * @param value The openTime to set.
     * @return This builder for chaining.
     */
    public Builder setOpenTime(int value) {
      
      openTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 open_time = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenTime() {
      
      openTime_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ExpeditionChallengeInfo)
  }

  // @@protoc_insertion_point(class_scope:ExpeditionChallengeInfo)
  private static final io.grasscutter.net.proto.activity.ExpeditionChallengeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.ExpeditionChallengeInfo();
  }

  public static io.grasscutter.net.proto.activity.ExpeditionChallengeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpeditionChallengeInfo>
      PARSER = new com.google.protobuf.AbstractParser<ExpeditionChallengeInfo>() {
    @java.lang.Override
    public ExpeditionChallengeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExpeditionChallengeInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExpeditionChallengeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpeditionChallengeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.ExpeditionChallengeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

