// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code HIJDFNGDBNG}
 */
public final class HIJDFNGDBNG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HIJDFNGDBNG)
    HIJDFNGDBNGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HIJDFNGDBNG.newBuilder() to construct.
  private HIJDFNGDBNG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HIJDFNGDBNG() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HIJDFNGDBNG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HIJDFNGDBNG(
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

            kMNNEMILFNF_ = input.readUInt32();
            break;
          }
          case 48: {

            levelId_ = input.readUInt32();
            break;
          }
          case 64: {

            isOpen_ = input.readBool();
            break;
          }
          case 80: {

            isFinish_ = input.readBool();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_HIJDFNGDBNG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_HIJDFNGDBNG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.HIJDFNGDBNG.class, io.grasscutter.net.proto.activity.HIJDFNGDBNG.Builder.class);
  }

  public static final int LEVEL_ID_FIELD_NUMBER = 6;
  private int levelId_;
  /**
   * <code>uint32 level_id = 6;</code>
   * @return The levelId.
   */
  @java.lang.Override
  public int getLevelId() {
    return levelId_;
  }

  public static final int KMNNEMILFNF_FIELD_NUMBER = 3;
  private int kMNNEMILFNF_;
  /**
   * <code>uint32 KMNNEMILFNF = 3;</code>
   * @return The kMNNEMILFNF.
   */
  @java.lang.Override
  public int getKMNNEMILFNF() {
    return kMNNEMILFNF_;
  }

  public static final int IS_FINISH_FIELD_NUMBER = 10;
  private boolean isFinish_;
  /**
   * <code>bool is_finish = 10;</code>
   * @return The isFinish.
   */
  @java.lang.Override
  public boolean getIsFinish() {
    return isFinish_;
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
    if (kMNNEMILFNF_ != 0) {
      output.writeUInt32(3, kMNNEMILFNF_);
    }
    if (levelId_ != 0) {
      output.writeUInt32(6, levelId_);
    }
    if (isOpen_ != false) {
      output.writeBool(8, isOpen_);
    }
    if (isFinish_ != false) {
      output.writeBool(10, isFinish_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kMNNEMILFNF_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, kMNNEMILFNF_);
    }
    if (levelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, levelId_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, isOpen_);
    }
    if (isFinish_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(10, isFinish_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.HIJDFNGDBNG)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.HIJDFNGDBNG other = (io.grasscutter.net.proto.activity.HIJDFNGDBNG) obj;

    if (getLevelId()
        != other.getLevelId()) return false;
    if (getKMNNEMILFNF()
        != other.getKMNNEMILFNF()) return false;
    if (getIsFinish()
        != other.getIsFinish()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
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
    hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLevelId();
    hash = (37 * hash) + KMNNEMILFNF_FIELD_NUMBER;
    hash = (53 * hash) + getKMNNEMILFNF();
    hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFinish());
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.HIJDFNGDBNG prototype) {
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
   * Protobuf type {@code HIJDFNGDBNG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HIJDFNGDBNG)
      io.grasscutter.net.proto.activity.HIJDFNGDBNGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_HIJDFNGDBNG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_HIJDFNGDBNG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.HIJDFNGDBNG.class, io.grasscutter.net.proto.activity.HIJDFNGDBNG.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.HIJDFNGDBNG.newBuilder()
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
      levelId_ = 0;

      kMNNEMILFNF_ = 0;

      isFinish_ = false;

      isOpen_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_HIJDFNGDBNG_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.HIJDFNGDBNG getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.HIJDFNGDBNG.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.HIJDFNGDBNG build() {
      io.grasscutter.net.proto.activity.HIJDFNGDBNG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.HIJDFNGDBNG buildPartial() {
      io.grasscutter.net.proto.activity.HIJDFNGDBNG result = new io.grasscutter.net.proto.activity.HIJDFNGDBNG(this);
      result.levelId_ = levelId_;
      result.kMNNEMILFNF_ = kMNNEMILFNF_;
      result.isFinish_ = isFinish_;
      result.isOpen_ = isOpen_;
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
      if (other instanceof io.grasscutter.net.proto.activity.HIJDFNGDBNG) {
        return mergeFrom((io.grasscutter.net.proto.activity.HIJDFNGDBNG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.HIJDFNGDBNG other) {
      if (other == io.grasscutter.net.proto.activity.HIJDFNGDBNG.getDefaultInstance()) return this;
      if (other.getLevelId() != 0) {
        setLevelId(other.getLevelId());
      }
      if (other.getKMNNEMILFNF() != 0) {
        setKMNNEMILFNF(other.getKMNNEMILFNF());
      }
      if (other.getIsFinish() != false) {
        setIsFinish(other.getIsFinish());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
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
      io.grasscutter.net.proto.activity.HIJDFNGDBNG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.HIJDFNGDBNG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int levelId_ ;
    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }
    /**
     * <code>uint32 level_id = 6;</code>
     * @param value The levelId to set.
     * @return This builder for chaining.
     */
    public Builder setLevelId(int value) {
      
      levelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 level_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevelId() {
      
      levelId_ = 0;
      onChanged();
      return this;
    }

    private int kMNNEMILFNF_ ;
    /**
     * <code>uint32 KMNNEMILFNF = 3;</code>
     * @return The kMNNEMILFNF.
     */
    @java.lang.Override
    public int getKMNNEMILFNF() {
      return kMNNEMILFNF_;
    }
    /**
     * <code>uint32 KMNNEMILFNF = 3;</code>
     * @param value The kMNNEMILFNF to set.
     * @return This builder for chaining.
     */
    public Builder setKMNNEMILFNF(int value) {
      
      kMNNEMILFNF_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 KMNNEMILFNF = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKMNNEMILFNF() {
      
      kMNNEMILFNF_ = 0;
      onChanged();
      return this;
    }

    private boolean isFinish_ ;
    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }
    /**
     * <code>bool is_finish = 10;</code>
     * @param value The isFinish to set.
     * @return This builder for chaining.
     */
    public Builder setIsFinish(boolean value) {
      
      isFinish_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_finish = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFinish() {
      
      isFinish_ = false;
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


    // @@protoc_insertion_point(builder_scope:HIJDFNGDBNG)
  }

  // @@protoc_insertion_point(class_scope:HIJDFNGDBNG)
  private static final io.grasscutter.net.proto.activity.HIJDFNGDBNG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.HIJDFNGDBNG();
  }

  public static io.grasscutter.net.proto.activity.HIJDFNGDBNG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HIJDFNGDBNG>
      PARSER = new com.google.protobuf.AbstractParser<HIJDFNGDBNG>() {
    @java.lang.Override
    public HIJDFNGDBNG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HIJDFNGDBNG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HIJDFNGDBNG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HIJDFNGDBNG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.HIJDFNGDBNG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

