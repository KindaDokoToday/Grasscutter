// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code WeeklyBossResinDiscountInfo}
 */
public final class WeeklyBossResinDiscountInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:WeeklyBossResinDiscountInfo)
    WeeklyBossResinDiscountInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeeklyBossResinDiscountInfo.newBuilder() to construct.
  private WeeklyBossResinDiscountInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeeklyBossResinDiscountInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeeklyBossResinDiscountInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeeklyBossResinDiscountInfo(
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
          case 8: {

            discountNum_ = input.readUInt32();
            break;
          }
          case 16: {

            discountNumLimit_ = input.readUInt32();
            break;
          }
          case 24: {

            resinCost_ = input.readUInt32();
            break;
          }
          case 32: {

            originalResinCost_ = input.readUInt32();
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
    return io.grasscutter.net.proto.define.Define.internal_static_WeeklyBossResinDiscountInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_WeeklyBossResinDiscountInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo.class, io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo.Builder.class);
  }

  public static final int RESIN_COST_FIELD_NUMBER = 3;
  private int resinCost_;
  /**
   * <code>uint32 resin_cost = 3;</code>
   * @return The resinCost.
   */
  @java.lang.Override
  public int getResinCost() {
    return resinCost_;
  }

  public static final int ORIGINAL_RESIN_COST_FIELD_NUMBER = 4;
  private int originalResinCost_;
  /**
   * <code>uint32 original_resin_cost = 4;</code>
   * @return The originalResinCost.
   */
  @java.lang.Override
  public int getOriginalResinCost() {
    return originalResinCost_;
  }

  public static final int DISCOUNT_NUM_FIELD_NUMBER = 1;
  private int discountNum_;
  /**
   * <code>uint32 discount_num = 1;</code>
   * @return The discountNum.
   */
  @java.lang.Override
  public int getDiscountNum() {
    return discountNum_;
  }

  public static final int DISCOUNT_NUM_LIMIT_FIELD_NUMBER = 2;
  private int discountNumLimit_;
  /**
   * <code>uint32 discount_num_limit = 2;</code>
   * @return The discountNumLimit.
   */
  @java.lang.Override
  public int getDiscountNumLimit() {
    return discountNumLimit_;
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
    if (discountNum_ != 0) {
      output.writeUInt32(1, discountNum_);
    }
    if (discountNumLimit_ != 0) {
      output.writeUInt32(2, discountNumLimit_);
    }
    if (resinCost_ != 0) {
      output.writeUInt32(3, resinCost_);
    }
    if (originalResinCost_ != 0) {
      output.writeUInt32(4, originalResinCost_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (discountNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, discountNum_);
    }
    if (discountNumLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, discountNumLimit_);
    }
    if (resinCost_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, resinCost_);
    }
    if (originalResinCost_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, originalResinCost_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo other = (io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo) obj;

    if (getResinCost()
        != other.getResinCost()) return false;
    if (getOriginalResinCost()
        != other.getOriginalResinCost()) return false;
    if (getDiscountNum()
        != other.getDiscountNum()) return false;
    if (getDiscountNumLimit()
        != other.getDiscountNumLimit()) return false;
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
    hash = (37 * hash) + RESIN_COST_FIELD_NUMBER;
    hash = (53 * hash) + getResinCost();
    hash = (37 * hash) + ORIGINAL_RESIN_COST_FIELD_NUMBER;
    hash = (53 * hash) + getOriginalResinCost();
    hash = (37 * hash) + DISCOUNT_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getDiscountNum();
    hash = (37 * hash) + DISCOUNT_NUM_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getDiscountNumLimit();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo prototype) {
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
   * Protobuf type {@code WeeklyBossResinDiscountInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:WeeklyBossResinDiscountInfo)
      io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_WeeklyBossResinDiscountInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_WeeklyBossResinDiscountInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo.class, io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo.newBuilder()
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
      resinCost_ = 0;

      originalResinCost_ = 0;

      discountNum_ = 0;

      discountNumLimit_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_WeeklyBossResinDiscountInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo build() {
      io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo buildPartial() {
      io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo result = new io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo(this);
      result.resinCost_ = resinCost_;
      result.originalResinCost_ = originalResinCost_;
      result.discountNum_ = discountNum_;
      result.discountNumLimit_ = discountNumLimit_;
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
      if (other instanceof io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo other) {
      if (other == io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo.getDefaultInstance()) return this;
      if (other.getResinCost() != 0) {
        setResinCost(other.getResinCost());
      }
      if (other.getOriginalResinCost() != 0) {
        setOriginalResinCost(other.getOriginalResinCost());
      }
      if (other.getDiscountNum() != 0) {
        setDiscountNum(other.getDiscountNum());
      }
      if (other.getDiscountNumLimit() != 0) {
        setDiscountNumLimit(other.getDiscountNumLimit());
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
      io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int resinCost_ ;
    /**
     * <code>uint32 resin_cost = 3;</code>
     * @return The resinCost.
     */
    @java.lang.Override
    public int getResinCost() {
      return resinCost_;
    }
    /**
     * <code>uint32 resin_cost = 3;</code>
     * @param value The resinCost to set.
     * @return This builder for chaining.
     */
    public Builder setResinCost(int value) {
      
      resinCost_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 resin_cost = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResinCost() {
      
      resinCost_ = 0;
      onChanged();
      return this;
    }

    private int originalResinCost_ ;
    /**
     * <code>uint32 original_resin_cost = 4;</code>
     * @return The originalResinCost.
     */
    @java.lang.Override
    public int getOriginalResinCost() {
      return originalResinCost_;
    }
    /**
     * <code>uint32 original_resin_cost = 4;</code>
     * @param value The originalResinCost to set.
     * @return This builder for chaining.
     */
    public Builder setOriginalResinCost(int value) {
      
      originalResinCost_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 original_resin_cost = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginalResinCost() {
      
      originalResinCost_ = 0;
      onChanged();
      return this;
    }

    private int discountNum_ ;
    /**
     * <code>uint32 discount_num = 1;</code>
     * @return The discountNum.
     */
    @java.lang.Override
    public int getDiscountNum() {
      return discountNum_;
    }
    /**
     * <code>uint32 discount_num = 1;</code>
     * @param value The discountNum to set.
     * @return This builder for chaining.
     */
    public Builder setDiscountNum(int value) {
      
      discountNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 discount_num = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiscountNum() {
      
      discountNum_ = 0;
      onChanged();
      return this;
    }

    private int discountNumLimit_ ;
    /**
     * <code>uint32 discount_num_limit = 2;</code>
     * @return The discountNumLimit.
     */
    @java.lang.Override
    public int getDiscountNumLimit() {
      return discountNumLimit_;
    }
    /**
     * <code>uint32 discount_num_limit = 2;</code>
     * @param value The discountNumLimit to set.
     * @return This builder for chaining.
     */
    public Builder setDiscountNumLimit(int value) {
      
      discountNumLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 discount_num_limit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiscountNumLimit() {
      
      discountNumLimit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:WeeklyBossResinDiscountInfo)
  }

  // @@protoc_insertion_point(class_scope:WeeklyBossResinDiscountInfo)
  private static final io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo();
  }

  public static io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeeklyBossResinDiscountInfo>
      PARSER = new com.google.protobuf.AbstractParser<WeeklyBossResinDiscountInfo>() {
    @java.lang.Override
    public WeeklyBossResinDiscountInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeeklyBossResinDiscountInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeeklyBossResinDiscountInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeeklyBossResinDiscountInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.WeeklyBossResinDiscountInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

