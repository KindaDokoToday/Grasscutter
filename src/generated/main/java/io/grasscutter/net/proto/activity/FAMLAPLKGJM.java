// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code FAMLAPLKGJM}
 */
public final class FAMLAPLKGJM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FAMLAPLKGJM)
    FAMLAPLKGJMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FAMLAPLKGJM.newBuilder() to construct.
  private FAMLAPLKGJM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FAMLAPLKGJM() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FAMLAPLKGJM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FAMLAPLKGJM(
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

            gCEHEPCEAKH_ = input.readBool();
            break;
          }
          case 16: {

            oPLMJPAALNF_ = input.readBool();
            break;
          }
          case 32: {

            bGMDLPABEFA_ = input.readUInt32();
            break;
          }
          case 96: {

            rewardId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_FAMLAPLKGJM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_FAMLAPLKGJM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.FAMLAPLKGJM.class, io.grasscutter.net.proto.activity.FAMLAPLKGJM.Builder.class);
  }

  public static final int BGMDLPABEFA_FIELD_NUMBER = 4;
  private int bGMDLPABEFA_;
  /**
   * <code>uint32 BGMDLPABEFA = 4;</code>
   * @return The bGMDLPABEFA.
   */
  @java.lang.Override
  public int getBGMDLPABEFA() {
    return bGMDLPABEFA_;
  }

  public static final int OPLMJPAALNF_FIELD_NUMBER = 2;
  private boolean oPLMJPAALNF_;
  /**
   * <code>bool OPLMJPAALNF = 2;</code>
   * @return The oPLMJPAALNF.
   */
  @java.lang.Override
  public boolean getOPLMJPAALNF() {
    return oPLMJPAALNF_;
  }

  public static final int GCEHEPCEAKH_FIELD_NUMBER = 1;
  private boolean gCEHEPCEAKH_;
  /**
   * <code>bool GCEHEPCEAKH = 1;</code>
   * @return The gCEHEPCEAKH.
   */
  @java.lang.Override
  public boolean getGCEHEPCEAKH() {
    return gCEHEPCEAKH_;
  }

  public static final int REWARD_ID_FIELD_NUMBER = 12;
  private int rewardId_;
  /**
   * <code>uint32 reward_id = 12;</code>
   * @return The rewardId.
   */
  @java.lang.Override
  public int getRewardId() {
    return rewardId_;
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
    if (gCEHEPCEAKH_ != false) {
      output.writeBool(1, gCEHEPCEAKH_);
    }
    if (oPLMJPAALNF_ != false) {
      output.writeBool(2, oPLMJPAALNF_);
    }
    if (bGMDLPABEFA_ != 0) {
      output.writeUInt32(4, bGMDLPABEFA_);
    }
    if (rewardId_ != 0) {
      output.writeUInt32(12, rewardId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gCEHEPCEAKH_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, gCEHEPCEAKH_);
    }
    if (oPLMJPAALNF_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, oPLMJPAALNF_);
    }
    if (bGMDLPABEFA_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, bGMDLPABEFA_);
    }
    if (rewardId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, rewardId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.FAMLAPLKGJM)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.FAMLAPLKGJM other = (io.grasscutter.net.proto.activity.FAMLAPLKGJM) obj;

    if (getBGMDLPABEFA()
        != other.getBGMDLPABEFA()) return false;
    if (getOPLMJPAALNF()
        != other.getOPLMJPAALNF()) return false;
    if (getGCEHEPCEAKH()
        != other.getGCEHEPCEAKH()) return false;
    if (getRewardId()
        != other.getRewardId()) return false;
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
    hash = (37 * hash) + BGMDLPABEFA_FIELD_NUMBER;
    hash = (53 * hash) + getBGMDLPABEFA();
    hash = (37 * hash) + OPLMJPAALNF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOPLMJPAALNF());
    hash = (37 * hash) + GCEHEPCEAKH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGCEHEPCEAKH());
    hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRewardId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.FAMLAPLKGJM prototype) {
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
   * Protobuf type {@code FAMLAPLKGJM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FAMLAPLKGJM)
      io.grasscutter.net.proto.activity.FAMLAPLKGJMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_FAMLAPLKGJM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_FAMLAPLKGJM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.FAMLAPLKGJM.class, io.grasscutter.net.proto.activity.FAMLAPLKGJM.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.FAMLAPLKGJM.newBuilder()
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
      bGMDLPABEFA_ = 0;

      oPLMJPAALNF_ = false;

      gCEHEPCEAKH_ = false;

      rewardId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_FAMLAPLKGJM_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.FAMLAPLKGJM getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.FAMLAPLKGJM.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.FAMLAPLKGJM build() {
      io.grasscutter.net.proto.activity.FAMLAPLKGJM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.FAMLAPLKGJM buildPartial() {
      io.grasscutter.net.proto.activity.FAMLAPLKGJM result = new io.grasscutter.net.proto.activity.FAMLAPLKGJM(this);
      result.bGMDLPABEFA_ = bGMDLPABEFA_;
      result.oPLMJPAALNF_ = oPLMJPAALNF_;
      result.gCEHEPCEAKH_ = gCEHEPCEAKH_;
      result.rewardId_ = rewardId_;
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
      if (other instanceof io.grasscutter.net.proto.activity.FAMLAPLKGJM) {
        return mergeFrom((io.grasscutter.net.proto.activity.FAMLAPLKGJM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.FAMLAPLKGJM other) {
      if (other == io.grasscutter.net.proto.activity.FAMLAPLKGJM.getDefaultInstance()) return this;
      if (other.getBGMDLPABEFA() != 0) {
        setBGMDLPABEFA(other.getBGMDLPABEFA());
      }
      if (other.getOPLMJPAALNF() != false) {
        setOPLMJPAALNF(other.getOPLMJPAALNF());
      }
      if (other.getGCEHEPCEAKH() != false) {
        setGCEHEPCEAKH(other.getGCEHEPCEAKH());
      }
      if (other.getRewardId() != 0) {
        setRewardId(other.getRewardId());
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
      io.grasscutter.net.proto.activity.FAMLAPLKGJM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.FAMLAPLKGJM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bGMDLPABEFA_ ;
    /**
     * <code>uint32 BGMDLPABEFA = 4;</code>
     * @return The bGMDLPABEFA.
     */
    @java.lang.Override
    public int getBGMDLPABEFA() {
      return bGMDLPABEFA_;
    }
    /**
     * <code>uint32 BGMDLPABEFA = 4;</code>
     * @param value The bGMDLPABEFA to set.
     * @return This builder for chaining.
     */
    public Builder setBGMDLPABEFA(int value) {
      
      bGMDLPABEFA_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 BGMDLPABEFA = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBGMDLPABEFA() {
      
      bGMDLPABEFA_ = 0;
      onChanged();
      return this;
    }

    private boolean oPLMJPAALNF_ ;
    /**
     * <code>bool OPLMJPAALNF = 2;</code>
     * @return The oPLMJPAALNF.
     */
    @java.lang.Override
    public boolean getOPLMJPAALNF() {
      return oPLMJPAALNF_;
    }
    /**
     * <code>bool OPLMJPAALNF = 2;</code>
     * @param value The oPLMJPAALNF to set.
     * @return This builder for chaining.
     */
    public Builder setOPLMJPAALNF(boolean value) {
      
      oPLMJPAALNF_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool OPLMJPAALNF = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOPLMJPAALNF() {
      
      oPLMJPAALNF_ = false;
      onChanged();
      return this;
    }

    private boolean gCEHEPCEAKH_ ;
    /**
     * <code>bool GCEHEPCEAKH = 1;</code>
     * @return The gCEHEPCEAKH.
     */
    @java.lang.Override
    public boolean getGCEHEPCEAKH() {
      return gCEHEPCEAKH_;
    }
    /**
     * <code>bool GCEHEPCEAKH = 1;</code>
     * @param value The gCEHEPCEAKH to set.
     * @return This builder for chaining.
     */
    public Builder setGCEHEPCEAKH(boolean value) {
      
      gCEHEPCEAKH_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool GCEHEPCEAKH = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGCEHEPCEAKH() {
      
      gCEHEPCEAKH_ = false;
      onChanged();
      return this;
    }

    private int rewardId_ ;
    /**
     * <code>uint32 reward_id = 12;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
    }
    /**
     * <code>uint32 reward_id = 12;</code>
     * @param value The rewardId to set.
     * @return This builder for chaining.
     */
    public Builder setRewardId(int value) {
      
      rewardId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 reward_id = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardId() {
      
      rewardId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:FAMLAPLKGJM)
  }

  // @@protoc_insertion_point(class_scope:FAMLAPLKGJM)
  private static final io.grasscutter.net.proto.activity.FAMLAPLKGJM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.FAMLAPLKGJM();
  }

  public static io.grasscutter.net.proto.activity.FAMLAPLKGJM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FAMLAPLKGJM>
      PARSER = new com.google.protobuf.AbstractParser<FAMLAPLKGJM>() {
    @java.lang.Override
    public FAMLAPLKGJM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FAMLAPLKGJM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FAMLAPLKGJM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FAMLAPLKGJM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.FAMLAPLKGJM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

