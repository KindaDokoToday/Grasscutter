// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code EENOFOFCOHF}
 */
public final class EENOFOFCOHF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EENOFOFCOHF)
    EENOFOFCOHFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EENOFOFCOHF.newBuilder() to construct.
  private EENOFOFCOHF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EENOFOFCOHF() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EENOFOFCOHF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EENOFOFCOHF(
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

            maxScore_ = input.readUInt32();
            break;
          }
          case 80: {

            isUnlock_ = input.readBool();
            break;
          }
          case 88: {

            gGCFIEHANKK_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_EENOFOFCOHF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_EENOFOFCOHF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.EENOFOFCOHF.class, io.grasscutter.net.proto.activity.EENOFOFCOHF.Builder.class);
  }

  public static final int IS_UNLOCK_FIELD_NUMBER = 10;
  private boolean isUnlock_;
  /**
   * <code>bool is_unlock = 10;</code>
   * @return The isUnlock.
   */
  @java.lang.Override
  public boolean getIsUnlock() {
    return isUnlock_;
  }

  public static final int MAX_SCORE_FIELD_NUMBER = 3;
  private int maxScore_;
  /**
   * <code>uint32 max_score = 3;</code>
   * @return The maxScore.
   */
  @java.lang.Override
  public int getMaxScore() {
    return maxScore_;
  }

  public static final int GGCFIEHANKK_FIELD_NUMBER = 11;
  private int gGCFIEHANKK_;
  /**
   * <code>uint32 GGCFIEHANKK = 11;</code>
   * @return The gGCFIEHANKK.
   */
  @java.lang.Override
  public int getGGCFIEHANKK() {
    return gGCFIEHANKK_;
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
    if (maxScore_ != 0) {
      output.writeUInt32(3, maxScore_);
    }
    if (isUnlock_ != false) {
      output.writeBool(10, isUnlock_);
    }
    if (gGCFIEHANKK_ != 0) {
      output.writeUInt32(11, gGCFIEHANKK_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxScore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, maxScore_);
    }
    if (isUnlock_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(10, isUnlock_);
    }
    if (gGCFIEHANKK_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, gGCFIEHANKK_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.EENOFOFCOHF)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.EENOFOFCOHF other = (io.grasscutter.net.proto.activity.EENOFOFCOHF) obj;

    if (getIsUnlock()
        != other.getIsUnlock()) return false;
    if (getMaxScore()
        != other.getMaxScore()) return false;
    if (getGGCFIEHANKK()
        != other.getGGCFIEHANKK()) return false;
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
    hash = (37 * hash) + IS_UNLOCK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsUnlock());
    hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxScore();
    hash = (37 * hash) + GGCFIEHANKK_FIELD_NUMBER;
    hash = (53 * hash) + getGGCFIEHANKK();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EENOFOFCOHF parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.EENOFOFCOHF prototype) {
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
   * Protobuf type {@code EENOFOFCOHF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EENOFOFCOHF)
      io.grasscutter.net.proto.activity.EENOFOFCOHFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EENOFOFCOHF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EENOFOFCOHF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.EENOFOFCOHF.class, io.grasscutter.net.proto.activity.EENOFOFCOHF.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.EENOFOFCOHF.newBuilder()
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
      isUnlock_ = false;

      maxScore_ = 0;

      gGCFIEHANKK_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EENOFOFCOHF_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EENOFOFCOHF getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.EENOFOFCOHF.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EENOFOFCOHF build() {
      io.grasscutter.net.proto.activity.EENOFOFCOHF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EENOFOFCOHF buildPartial() {
      io.grasscutter.net.proto.activity.EENOFOFCOHF result = new io.grasscutter.net.proto.activity.EENOFOFCOHF(this);
      result.isUnlock_ = isUnlock_;
      result.maxScore_ = maxScore_;
      result.gGCFIEHANKK_ = gGCFIEHANKK_;
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
      if (other instanceof io.grasscutter.net.proto.activity.EENOFOFCOHF) {
        return mergeFrom((io.grasscutter.net.proto.activity.EENOFOFCOHF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.EENOFOFCOHF other) {
      if (other == io.grasscutter.net.proto.activity.EENOFOFCOHF.getDefaultInstance()) return this;
      if (other.getIsUnlock() != false) {
        setIsUnlock(other.getIsUnlock());
      }
      if (other.getMaxScore() != 0) {
        setMaxScore(other.getMaxScore());
      }
      if (other.getGGCFIEHANKK() != 0) {
        setGGCFIEHANKK(other.getGGCFIEHANKK());
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
      io.grasscutter.net.proto.activity.EENOFOFCOHF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.EENOFOFCOHF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isUnlock_ ;
    /**
     * <code>bool is_unlock = 10;</code>
     * @return The isUnlock.
     */
    @java.lang.Override
    public boolean getIsUnlock() {
      return isUnlock_;
    }
    /**
     * <code>bool is_unlock = 10;</code>
     * @param value The isUnlock to set.
     * @return This builder for chaining.
     */
    public Builder setIsUnlock(boolean value) {
      
      isUnlock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_unlock = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsUnlock() {
      
      isUnlock_ = false;
      onChanged();
      return this;
    }

    private int maxScore_ ;
    /**
     * <code>uint32 max_score = 3;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }
    /**
     * <code>uint32 max_score = 3;</code>
     * @param value The maxScore to set.
     * @return This builder for chaining.
     */
    public Builder setMaxScore(int value) {
      
      maxScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 max_score = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxScore() {
      
      maxScore_ = 0;
      onChanged();
      return this;
    }

    private int gGCFIEHANKK_ ;
    /**
     * <code>uint32 GGCFIEHANKK = 11;</code>
     * @return The gGCFIEHANKK.
     */
    @java.lang.Override
    public int getGGCFIEHANKK() {
      return gGCFIEHANKK_;
    }
    /**
     * <code>uint32 GGCFIEHANKK = 11;</code>
     * @param value The gGCFIEHANKK to set.
     * @return This builder for chaining.
     */
    public Builder setGGCFIEHANKK(int value) {
      
      gGCFIEHANKK_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 GGCFIEHANKK = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearGGCFIEHANKK() {
      
      gGCFIEHANKK_ = 0;
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


    // @@protoc_insertion_point(builder_scope:EENOFOFCOHF)
  }

  // @@protoc_insertion_point(class_scope:EENOFOFCOHF)
  private static final io.grasscutter.net.proto.activity.EENOFOFCOHF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.EENOFOFCOHF();
  }

  public static io.grasscutter.net.proto.activity.EENOFOFCOHF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EENOFOFCOHF>
      PARSER = new com.google.protobuf.AbstractParser<EENOFOFCOHF>() {
    @java.lang.Override
    public EENOFOFCOHF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EENOFOFCOHF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EENOFOFCOHF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EENOFOFCOHF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.EENOFOFCOHF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

