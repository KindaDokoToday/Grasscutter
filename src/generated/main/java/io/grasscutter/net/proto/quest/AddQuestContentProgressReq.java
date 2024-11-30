// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quest.proto

package io.grasscutter.net.proto.quest;

/**
 * <pre>
 * CmdId: 4657
 * </pre>
 *
 * Protobuf type {@code AddQuestContentProgressReq}
 */
public final class AddQuestContentProgressReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddQuestContentProgressReq)
    AddQuestContentProgressReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddQuestContentProgressReq.newBuilder() to construct.
  private AddQuestContentProgressReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddQuestContentProgressReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddQuestContentProgressReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddQuestContentProgressReq(
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

            param_ = input.readUInt32();
            break;
          }
          case 40: {

            contentType_ = input.readUInt32();
            break;
          }
          case 64: {

            addProgress_ = input.readUInt32();
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
    return io.grasscutter.net.proto.quest.Quest.internal_static_AddQuestContentProgressReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.quest.Quest.internal_static_AddQuestContentProgressReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.quest.AddQuestContentProgressReq.class, io.grasscutter.net.proto.quest.AddQuestContentProgressReq.Builder.class);
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 5;
  private int contentType_;
  /**
   * <code>uint32 content_type = 5;</code>
   * @return The contentType.
   */
  @java.lang.Override
  public int getContentType() {
    return contentType_;
  }

  public static final int PARAM_FIELD_NUMBER = 3;
  private int param_;
  /**
   * <code>uint32 param = 3;</code>
   * @return The param.
   */
  @java.lang.Override
  public int getParam() {
    return param_;
  }

  public static final int ADD_PROGRESS_FIELD_NUMBER = 8;
  private int addProgress_;
  /**
   * <code>uint32 add_progress = 8;</code>
   * @return The addProgress.
   */
  @java.lang.Override
  public int getAddProgress() {
    return addProgress_;
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
    if (param_ != 0) {
      output.writeUInt32(3, param_);
    }
    if (contentType_ != 0) {
      output.writeUInt32(5, contentType_);
    }
    if (addProgress_ != 0) {
      output.writeUInt32(8, addProgress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (param_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, param_);
    }
    if (contentType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, contentType_);
    }
    if (addProgress_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, addProgress_);
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
    if (!(obj instanceof io.grasscutter.net.proto.quest.AddQuestContentProgressReq)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.quest.AddQuestContentProgressReq other = (io.grasscutter.net.proto.quest.AddQuestContentProgressReq) obj;

    if (getContentType()
        != other.getContentType()) return false;
    if (getParam()
        != other.getParam()) return false;
    if (getAddProgress()
        != other.getAddProgress()) return false;
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
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType();
    hash = (37 * hash) + PARAM_FIELD_NUMBER;
    hash = (53 * hash) + getParam();
    hash = (37 * hash) + ADD_PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddProgress();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.quest.AddQuestContentProgressReq prototype) {
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
   * <pre>
   * CmdId: 4657
   * </pre>
   *
   * Protobuf type {@code AddQuestContentProgressReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddQuestContentProgressReq)
      io.grasscutter.net.proto.quest.AddQuestContentProgressReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_AddQuestContentProgressReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_AddQuestContentProgressReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.quest.AddQuestContentProgressReq.class, io.grasscutter.net.proto.quest.AddQuestContentProgressReq.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.quest.AddQuestContentProgressReq.newBuilder()
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
      contentType_ = 0;

      param_ = 0;

      addProgress_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_AddQuestContentProgressReq_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.AddQuestContentProgressReq getDefaultInstanceForType() {
      return io.grasscutter.net.proto.quest.AddQuestContentProgressReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.AddQuestContentProgressReq build() {
      io.grasscutter.net.proto.quest.AddQuestContentProgressReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.AddQuestContentProgressReq buildPartial() {
      io.grasscutter.net.proto.quest.AddQuestContentProgressReq result = new io.grasscutter.net.proto.quest.AddQuestContentProgressReq(this);
      result.contentType_ = contentType_;
      result.param_ = param_;
      result.addProgress_ = addProgress_;
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
      if (other instanceof io.grasscutter.net.proto.quest.AddQuestContentProgressReq) {
        return mergeFrom((io.grasscutter.net.proto.quest.AddQuestContentProgressReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.quest.AddQuestContentProgressReq other) {
      if (other == io.grasscutter.net.proto.quest.AddQuestContentProgressReq.getDefaultInstance()) return this;
      if (other.getContentType() != 0) {
        setContentType(other.getContentType());
      }
      if (other.getParam() != 0) {
        setParam(other.getParam());
      }
      if (other.getAddProgress() != 0) {
        setAddProgress(other.getAddProgress());
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
      io.grasscutter.net.proto.quest.AddQuestContentProgressReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.quest.AddQuestContentProgressReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int contentType_ ;
    /**
     * <code>uint32 content_type = 5;</code>
     * @return The contentType.
     */
    @java.lang.Override
    public int getContentType() {
      return contentType_;
    }
    /**
     * <code>uint32 content_type = 5;</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(int value) {
      
      contentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 content_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      
      contentType_ = 0;
      onChanged();
      return this;
    }

    private int param_ ;
    /**
     * <code>uint32 param = 3;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }
    /**
     * <code>uint32 param = 3;</code>
     * @param value The param to set.
     * @return This builder for chaining.
     */
    public Builder setParam(int value) {
      
      param_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 param = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam() {
      
      param_ = 0;
      onChanged();
      return this;
    }

    private int addProgress_ ;
    /**
     * <code>uint32 add_progress = 8;</code>
     * @return The addProgress.
     */
    @java.lang.Override
    public int getAddProgress() {
      return addProgress_;
    }
    /**
     * <code>uint32 add_progress = 8;</code>
     * @param value The addProgress to set.
     * @return This builder for chaining.
     */
    public Builder setAddProgress(int value) {
      
      addProgress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 add_progress = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddProgress() {
      
      addProgress_ = 0;
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


    // @@protoc_insertion_point(builder_scope:AddQuestContentProgressReq)
  }

  // @@protoc_insertion_point(class_scope:AddQuestContentProgressReq)
  private static final io.grasscutter.net.proto.quest.AddQuestContentProgressReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.quest.AddQuestContentProgressReq();
  }

  public static io.grasscutter.net.proto.quest.AddQuestContentProgressReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddQuestContentProgressReq>
      PARSER = new com.google.protobuf.AbstractParser<AddQuestContentProgressReq>() {
    @java.lang.Override
    public AddQuestContentProgressReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddQuestContentProgressReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddQuestContentProgressReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddQuestContentProgressReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.quest.AddQuestContentProgressReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

