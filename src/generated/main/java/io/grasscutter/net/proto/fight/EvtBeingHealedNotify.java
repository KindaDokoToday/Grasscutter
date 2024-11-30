// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

/**
 * <pre>
 * CmdId: 20599
 * </pre>
 *
 * Protobuf type {@code EvtBeingHealedNotify}
 */
public final class EvtBeingHealedNotify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EvtBeingHealedNotify)
    EvtBeingHealedNotifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EvtBeingHealedNotify.newBuilder() to construct.
  private EvtBeingHealedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EvtBeingHealedNotify() {
    healTag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EvtBeingHealedNotify();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EvtBeingHealedNotify(
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

            sourceId_ = input.readUInt32();
            break;
          }
          case 24: {

            targetId_ = input.readUInt32();
            break;
          }
          case 37: {

            realHealAmount_ = input.readFloat();
            break;
          }
          case 45: {

            healAmount_ = input.readFloat();
            break;
          }
          case 82: {
            java.lang.String s = input.readStringRequireUtf8();

            healTag_ = s;
            break;
          }
          case 120: {

            cKMAJKEHGGF_ = input.readBool();
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
    return io.grasscutter.net.proto.fight.Fight.internal_static_EvtBeingHealedNotify_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.fight.Fight.internal_static_EvtBeingHealedNotify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.fight.EvtBeingHealedNotify.class, io.grasscutter.net.proto.fight.EvtBeingHealedNotify.Builder.class);
  }

  public static final int HEAL_TAG_FIELD_NUMBER = 10;
  private volatile java.lang.Object healTag_;
  /**
   * <code>string heal_tag = 10;</code>
   * @return The healTag.
   */
  @java.lang.Override
  public java.lang.String getHealTag() {
    java.lang.Object ref = healTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      healTag_ = s;
      return s;
    }
  }
  /**
   * <code>string heal_tag = 10;</code>
   * @return The bytes for healTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHealTagBytes() {
    java.lang.Object ref = healTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      healTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_ID_FIELD_NUMBER = 2;
  private int sourceId_;
  /**
   * <code>uint32 source_id = 2;</code>
   * @return The sourceId.
   */
  @java.lang.Override
  public int getSourceId() {
    return sourceId_;
  }

  public static final int TARGET_ID_FIELD_NUMBER = 3;
  private int targetId_;
  /**
   * <code>uint32 target_id = 3;</code>
   * @return The targetId.
   */
  @java.lang.Override
  public int getTargetId() {
    return targetId_;
  }

  public static final int CKMAJKEHGGF_FIELD_NUMBER = 15;
  private boolean cKMAJKEHGGF_;
  /**
   * <code>bool CKMAJKEHGGF = 15;</code>
   * @return The cKMAJKEHGGF.
   */
  @java.lang.Override
  public boolean getCKMAJKEHGGF() {
    return cKMAJKEHGGF_;
  }

  public static final int REAL_HEAL_AMOUNT_FIELD_NUMBER = 4;
  private float realHealAmount_;
  /**
   * <code>float real_heal_amount = 4;</code>
   * @return The realHealAmount.
   */
  @java.lang.Override
  public float getRealHealAmount() {
    return realHealAmount_;
  }

  public static final int HEAL_AMOUNT_FIELD_NUMBER = 5;
  private float healAmount_;
  /**
   * <code>float heal_amount = 5;</code>
   * @return The healAmount.
   */
  @java.lang.Override
  public float getHealAmount() {
    return healAmount_;
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
    if (sourceId_ != 0) {
      output.writeUInt32(2, sourceId_);
    }
    if (targetId_ != 0) {
      output.writeUInt32(3, targetId_);
    }
    if (realHealAmount_ != 0F) {
      output.writeFloat(4, realHealAmount_);
    }
    if (healAmount_ != 0F) {
      output.writeFloat(5, healAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(healTag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, healTag_);
    }
    if (cKMAJKEHGGF_ != false) {
      output.writeBool(15, cKMAJKEHGGF_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, sourceId_);
    }
    if (targetId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, targetId_);
    }
    if (realHealAmount_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, realHealAmount_);
    }
    if (healAmount_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, healAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(healTag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, healTag_);
    }
    if (cKMAJKEHGGF_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(15, cKMAJKEHGGF_);
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
    if (!(obj instanceof io.grasscutter.net.proto.fight.EvtBeingHealedNotify)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.fight.EvtBeingHealedNotify other = (io.grasscutter.net.proto.fight.EvtBeingHealedNotify) obj;

    if (!getHealTag()
        .equals(other.getHealTag())) return false;
    if (getSourceId()
        != other.getSourceId()) return false;
    if (getTargetId()
        != other.getTargetId()) return false;
    if (getCKMAJKEHGGF()
        != other.getCKMAJKEHGGF()) return false;
    if (java.lang.Float.floatToIntBits(getRealHealAmount())
        != java.lang.Float.floatToIntBits(
            other.getRealHealAmount())) return false;
    if (java.lang.Float.floatToIntBits(getHealAmount())
        != java.lang.Float.floatToIntBits(
            other.getHealAmount())) return false;
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
    hash = (37 * hash) + HEAL_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getHealTag().hashCode();
    hash = (37 * hash) + SOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSourceId();
    hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTargetId();
    hash = (37 * hash) + CKMAJKEHGGF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCKMAJKEHGGF());
    hash = (37 * hash) + REAL_HEAL_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRealHealAmount());
    hash = (37 * hash) + HEAL_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getHealAmount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.fight.EvtBeingHealedNotify prototype) {
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
   * CmdId: 20599
   * </pre>
   *
   * Protobuf type {@code EvtBeingHealedNotify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EvtBeingHealedNotify)
      io.grasscutter.net.proto.fight.EvtBeingHealedNotifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EvtBeingHealedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EvtBeingHealedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.fight.EvtBeingHealedNotify.class, io.grasscutter.net.proto.fight.EvtBeingHealedNotify.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.fight.EvtBeingHealedNotify.newBuilder()
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
      healTag_ = "";

      sourceId_ = 0;

      targetId_ = 0;

      cKMAJKEHGGF_ = false;

      realHealAmount_ = 0F;

      healAmount_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EvtBeingHealedNotify_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EvtBeingHealedNotify getDefaultInstanceForType() {
      return io.grasscutter.net.proto.fight.EvtBeingHealedNotify.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EvtBeingHealedNotify build() {
      io.grasscutter.net.proto.fight.EvtBeingHealedNotify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EvtBeingHealedNotify buildPartial() {
      io.grasscutter.net.proto.fight.EvtBeingHealedNotify result = new io.grasscutter.net.proto.fight.EvtBeingHealedNotify(this);
      result.healTag_ = healTag_;
      result.sourceId_ = sourceId_;
      result.targetId_ = targetId_;
      result.cKMAJKEHGGF_ = cKMAJKEHGGF_;
      result.realHealAmount_ = realHealAmount_;
      result.healAmount_ = healAmount_;
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
      if (other instanceof io.grasscutter.net.proto.fight.EvtBeingHealedNotify) {
        return mergeFrom((io.grasscutter.net.proto.fight.EvtBeingHealedNotify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.fight.EvtBeingHealedNotify other) {
      if (other == io.grasscutter.net.proto.fight.EvtBeingHealedNotify.getDefaultInstance()) return this;
      if (!other.getHealTag().isEmpty()) {
        healTag_ = other.healTag_;
        onChanged();
      }
      if (other.getSourceId() != 0) {
        setSourceId(other.getSourceId());
      }
      if (other.getTargetId() != 0) {
        setTargetId(other.getTargetId());
      }
      if (other.getCKMAJKEHGGF() != false) {
        setCKMAJKEHGGF(other.getCKMAJKEHGGF());
      }
      if (other.getRealHealAmount() != 0F) {
        setRealHealAmount(other.getRealHealAmount());
      }
      if (other.getHealAmount() != 0F) {
        setHealAmount(other.getHealAmount());
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
      io.grasscutter.net.proto.fight.EvtBeingHealedNotify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.fight.EvtBeingHealedNotify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object healTag_ = "";
    /**
     * <code>string heal_tag = 10;</code>
     * @return The healTag.
     */
    public java.lang.String getHealTag() {
      java.lang.Object ref = healTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        healTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string heal_tag = 10;</code>
     * @return The bytes for healTag.
     */
    public com.google.protobuf.ByteString
        getHealTagBytes() {
      java.lang.Object ref = healTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        healTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string heal_tag = 10;</code>
     * @param value The healTag to set.
     * @return This builder for chaining.
     */
    public Builder setHealTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      healTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string heal_tag = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearHealTag() {
      
      healTag_ = getDefaultInstance().getHealTag();
      onChanged();
      return this;
    }
    /**
     * <code>string heal_tag = 10;</code>
     * @param value The bytes for healTag to set.
     * @return This builder for chaining.
     */
    public Builder setHealTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      healTag_ = value;
      onChanged();
      return this;
    }

    private int sourceId_ ;
    /**
     * <code>uint32 source_id = 2;</code>
     * @return The sourceId.
     */
    @java.lang.Override
    public int getSourceId() {
      return sourceId_;
    }
    /**
     * <code>uint32 source_id = 2;</code>
     * @param value The sourceId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceId(int value) {
      
      sourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 source_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceId() {
      
      sourceId_ = 0;
      onChanged();
      return this;
    }

    private int targetId_ ;
    /**
     * <code>uint32 target_id = 3;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
    }
    /**
     * <code>uint32 target_id = 3;</code>
     * @param value The targetId to set.
     * @return This builder for chaining.
     */
    public Builder setTargetId(int value) {
      
      targetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 target_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetId() {
      
      targetId_ = 0;
      onChanged();
      return this;
    }

    private boolean cKMAJKEHGGF_ ;
    /**
     * <code>bool CKMAJKEHGGF = 15;</code>
     * @return The cKMAJKEHGGF.
     */
    @java.lang.Override
    public boolean getCKMAJKEHGGF() {
      return cKMAJKEHGGF_;
    }
    /**
     * <code>bool CKMAJKEHGGF = 15;</code>
     * @param value The cKMAJKEHGGF to set.
     * @return This builder for chaining.
     */
    public Builder setCKMAJKEHGGF(boolean value) {
      
      cKMAJKEHGGF_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool CKMAJKEHGGF = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearCKMAJKEHGGF() {
      
      cKMAJKEHGGF_ = false;
      onChanged();
      return this;
    }

    private float realHealAmount_ ;
    /**
     * <code>float real_heal_amount = 4;</code>
     * @return The realHealAmount.
     */
    @java.lang.Override
    public float getRealHealAmount() {
      return realHealAmount_;
    }
    /**
     * <code>float real_heal_amount = 4;</code>
     * @param value The realHealAmount to set.
     * @return This builder for chaining.
     */
    public Builder setRealHealAmount(float value) {
      
      realHealAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float real_heal_amount = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRealHealAmount() {
      
      realHealAmount_ = 0F;
      onChanged();
      return this;
    }

    private float healAmount_ ;
    /**
     * <code>float heal_amount = 5;</code>
     * @return The healAmount.
     */
    @java.lang.Override
    public float getHealAmount() {
      return healAmount_;
    }
    /**
     * <code>float heal_amount = 5;</code>
     * @param value The healAmount to set.
     * @return This builder for chaining.
     */
    public Builder setHealAmount(float value) {
      
      healAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float heal_amount = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHealAmount() {
      
      healAmount_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:EvtBeingHealedNotify)
  }

  // @@protoc_insertion_point(class_scope:EvtBeingHealedNotify)
  private static final io.grasscutter.net.proto.fight.EvtBeingHealedNotify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.fight.EvtBeingHealedNotify();
  }

  public static io.grasscutter.net.proto.fight.EvtBeingHealedNotify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvtBeingHealedNotify>
      PARSER = new com.google.protobuf.AbstractParser<EvtBeingHealedNotify>() {
    @java.lang.Override
    public EvtBeingHealedNotify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EvtBeingHealedNotify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EvtBeingHealedNotify> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvtBeingHealedNotify> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.fight.EvtBeingHealedNotify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

