// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

/**
 * <pre>
 * CmdId: 2589
 * </pre>
 *
 * Protobuf type {@code SceneForceUnlockNotify}
 */
public final class SceneForceUnlockNotify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SceneForceUnlockNotify)
    SceneForceUnlockNotifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SceneForceUnlockNotify.newBuilder() to construct.
  private SceneForceUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SceneForceUnlockNotify() {
    forceIdList_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SceneForceUnlockNotify();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SceneForceUnlockNotify(
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
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              forceIdList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            forceIdList_.addInt(input.readUInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              forceIdList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              forceIdList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 40: {

            isAdd_ = input.readBool();
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
        forceIdList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.scene.Scene.internal_static_SceneForceUnlockNotify_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.scene.Scene.internal_static_SceneForceUnlockNotify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.scene.SceneForceUnlockNotify.class, io.grasscutter.net.proto.scene.SceneForceUnlockNotify.Builder.class);
  }

  public static final int FORCE_ID_LIST_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList forceIdList_;
  /**
   * <code>repeated uint32 force_id_list = 2;</code>
   * @return A list containing the forceIdList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getForceIdListList() {
    return forceIdList_;
  }
  /**
   * <code>repeated uint32 force_id_list = 2;</code>
   * @return The count of forceIdList.
   */
  public int getForceIdListCount() {
    return forceIdList_.size();
  }
  /**
   * <code>repeated uint32 force_id_list = 2;</code>
   * @param index The index of the element to return.
   * @return The forceIdList at the given index.
   */
  public int getForceIdList(int index) {
    return forceIdList_.getInt(index);
  }
  private int forceIdListMemoizedSerializedSize = -1;

  public static final int IS_ADD_FIELD_NUMBER = 5;
  private boolean isAdd_;
  /**
   * <code>bool is_add = 5;</code>
   * @return The isAdd.
   */
  @java.lang.Override
  public boolean getIsAdd() {
    return isAdd_;
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
    if (getForceIdListList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(forceIdListMemoizedSerializedSize);
    }
    for (int i = 0; i < forceIdList_.size(); i++) {
      output.writeUInt32NoTag(forceIdList_.getInt(i));
    }
    if (isAdd_ != false) {
      output.writeBool(5, isAdd_);
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
      for (int i = 0; i < forceIdList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(forceIdList_.getInt(i));
      }
      size += dataSize;
      if (!getForceIdListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      forceIdListMemoizedSerializedSize = dataSize;
    }
    if (isAdd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isAdd_);
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
    if (!(obj instanceof io.grasscutter.net.proto.scene.SceneForceUnlockNotify)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.scene.SceneForceUnlockNotify other = (io.grasscutter.net.proto.scene.SceneForceUnlockNotify) obj;

    if (!getForceIdListList()
        .equals(other.getForceIdListList())) return false;
    if (getIsAdd()
        != other.getIsAdd()) return false;
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
    if (getForceIdListCount() > 0) {
      hash = (37 * hash) + FORCE_ID_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getForceIdListList().hashCode();
    }
    hash = (37 * hash) + IS_ADD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAdd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.scene.SceneForceUnlockNotify prototype) {
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
   * CmdId: 2589
   * </pre>
   *
   * Protobuf type {@code SceneForceUnlockNotify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SceneForceUnlockNotify)
      io.grasscutter.net.proto.scene.SceneForceUnlockNotifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.scene.Scene.internal_static_SceneForceUnlockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.scene.Scene.internal_static_SceneForceUnlockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.scene.SceneForceUnlockNotify.class, io.grasscutter.net.proto.scene.SceneForceUnlockNotify.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.scene.SceneForceUnlockNotify.newBuilder()
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
      forceIdList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      isAdd_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.scene.Scene.internal_static_SceneForceUnlockNotify_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.scene.SceneForceUnlockNotify getDefaultInstanceForType() {
      return io.grasscutter.net.proto.scene.SceneForceUnlockNotify.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.scene.SceneForceUnlockNotify build() {
      io.grasscutter.net.proto.scene.SceneForceUnlockNotify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.scene.SceneForceUnlockNotify buildPartial() {
      io.grasscutter.net.proto.scene.SceneForceUnlockNotify result = new io.grasscutter.net.proto.scene.SceneForceUnlockNotify(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        forceIdList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.forceIdList_ = forceIdList_;
      result.isAdd_ = isAdd_;
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
      if (other instanceof io.grasscutter.net.proto.scene.SceneForceUnlockNotify) {
        return mergeFrom((io.grasscutter.net.proto.scene.SceneForceUnlockNotify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.scene.SceneForceUnlockNotify other) {
      if (other == io.grasscutter.net.proto.scene.SceneForceUnlockNotify.getDefaultInstance()) return this;
      if (!other.forceIdList_.isEmpty()) {
        if (forceIdList_.isEmpty()) {
          forceIdList_ = other.forceIdList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureForceIdListIsMutable();
          forceIdList_.addAll(other.forceIdList_);
        }
        onChanged();
      }
      if (other.getIsAdd() != false) {
        setIsAdd(other.getIsAdd());
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
      io.grasscutter.net.proto.scene.SceneForceUnlockNotify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.scene.SceneForceUnlockNotify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList forceIdList_ = emptyIntList();
    private void ensureForceIdListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        forceIdList_ = mutableCopy(forceIdList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 force_id_list = 2;</code>
     * @return A list containing the forceIdList.
     */
    public java.util.List<java.lang.Integer>
        getForceIdListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(forceIdList_) : forceIdList_;
    }
    /**
     * <code>repeated uint32 force_id_list = 2;</code>
     * @return The count of forceIdList.
     */
    public int getForceIdListCount() {
      return forceIdList_.size();
    }
    /**
     * <code>repeated uint32 force_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The forceIdList at the given index.
     */
    public int getForceIdList(int index) {
      return forceIdList_.getInt(index);
    }
    /**
     * <code>repeated uint32 force_id_list = 2;</code>
     * @param index The index to set the value at.
     * @param value The forceIdList to set.
     * @return This builder for chaining.
     */
    public Builder setForceIdList(
        int index, int value) {
      ensureForceIdListIsMutable();
      forceIdList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 force_id_list = 2;</code>
     * @param value The forceIdList to add.
     * @return This builder for chaining.
     */
    public Builder addForceIdList(int value) {
      ensureForceIdListIsMutable();
      forceIdList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 force_id_list = 2;</code>
     * @param values The forceIdList to add.
     * @return This builder for chaining.
     */
    public Builder addAllForceIdList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureForceIdListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, forceIdList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 force_id_list = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearForceIdList() {
      forceIdList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private boolean isAdd_ ;
    /**
     * <code>bool is_add = 5;</code>
     * @return The isAdd.
     */
    @java.lang.Override
    public boolean getIsAdd() {
      return isAdd_;
    }
    /**
     * <code>bool is_add = 5;</code>
     * @param value The isAdd to set.
     * @return This builder for chaining.
     */
    public Builder setIsAdd(boolean value) {
      
      isAdd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_add = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAdd() {
      
      isAdd_ = false;
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


    // @@protoc_insertion_point(builder_scope:SceneForceUnlockNotify)
  }

  // @@protoc_insertion_point(class_scope:SceneForceUnlockNotify)
  private static final io.grasscutter.net.proto.scene.SceneForceUnlockNotify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.scene.SceneForceUnlockNotify();
  }

  public static io.grasscutter.net.proto.scene.SceneForceUnlockNotify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SceneForceUnlockNotify>
      PARSER = new com.google.protobuf.AbstractParser<SceneForceUnlockNotify>() {
    @java.lang.Override
    public SceneForceUnlockNotify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SceneForceUnlockNotify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SceneForceUnlockNotify> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SceneForceUnlockNotify> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.scene.SceneForceUnlockNotify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

