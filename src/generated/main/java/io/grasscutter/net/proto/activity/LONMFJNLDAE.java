// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code LONMFJNLDAE}
 */
public final class LONMFJNLDAE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LONMFJNLDAE)
    LONMFJNLDAEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LONMFJNLDAE.newBuilder() to construct.
  private LONMFJNLDAE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LONMFJNLDAE() {
    fADIFFDNPGF_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LONMFJNLDAE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LONMFJNLDAE(
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
          case 88: {
            int rawValue = input.readEnum();

            fADIFFDNPGF_ = rawValue;
            break;
          }
          case 112: {

            levelId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_LONMFJNLDAE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_LONMFJNLDAE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.LONMFJNLDAE.class, io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder.class);
  }

  public static final int LEVEL_ID_FIELD_NUMBER = 14;
  private int levelId_;
  /**
   * <code>uint32 level_id = 14;</code>
   * @return The levelId.
   */
  @java.lang.Override
  public int getLevelId() {
    return levelId_;
  }

  public static final int FADIFFDNPGF_FIELD_NUMBER = 11;
  private int fADIFFDNPGF_;
  /**
   * <code>.FAOPPMCIKHJ FADIFFDNPGF = 11;</code>
   * @return The enum numeric value on the wire for fADIFFDNPGF.
   */
  @java.lang.Override public int getFADIFFDNPGFValue() {
    return fADIFFDNPGF_;
  }
  /**
   * <code>.FAOPPMCIKHJ FADIFFDNPGF = 11;</code>
   * @return The fADIFFDNPGF.
   */
  @java.lang.Override public io.grasscutter.net.proto.activity.FAOPPMCIKHJ getFADIFFDNPGF() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.activity.FAOPPMCIKHJ result = io.grasscutter.net.proto.activity.FAOPPMCIKHJ.valueOf(fADIFFDNPGF_);
    return result == null ? io.grasscutter.net.proto.activity.FAOPPMCIKHJ.UNRECOGNIZED : result;
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
    if (fADIFFDNPGF_ != io.grasscutter.net.proto.activity.FAOPPMCIKHJ.FAOPPMCIKHJ_SANDWORM_LEVEL_NOT_OPEN.getNumber()) {
      output.writeEnum(11, fADIFFDNPGF_);
    }
    if (levelId_ != 0) {
      output.writeUInt32(14, levelId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fADIFFDNPGF_ != io.grasscutter.net.proto.activity.FAOPPMCIKHJ.FAOPPMCIKHJ_SANDWORM_LEVEL_NOT_OPEN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(11, fADIFFDNPGF_);
    }
    if (levelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, levelId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.LONMFJNLDAE)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.LONMFJNLDAE other = (io.grasscutter.net.proto.activity.LONMFJNLDAE) obj;

    if (getLevelId()
        != other.getLevelId()) return false;
    if (fADIFFDNPGF_ != other.fADIFFDNPGF_) return false;
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
    hash = (37 * hash) + FADIFFDNPGF_FIELD_NUMBER;
    hash = (53 * hash) + fADIFFDNPGF_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LONMFJNLDAE parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.LONMFJNLDAE prototype) {
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
   * Protobuf type {@code LONMFJNLDAE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LONMFJNLDAE)
      io.grasscutter.net.proto.activity.LONMFJNLDAEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LONMFJNLDAE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LONMFJNLDAE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.LONMFJNLDAE.class, io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.LONMFJNLDAE.newBuilder()
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

      fADIFFDNPGF_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LONMFJNLDAE_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LONMFJNLDAE getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.LONMFJNLDAE.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LONMFJNLDAE build() {
      io.grasscutter.net.proto.activity.LONMFJNLDAE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LONMFJNLDAE buildPartial() {
      io.grasscutter.net.proto.activity.LONMFJNLDAE result = new io.grasscutter.net.proto.activity.LONMFJNLDAE(this);
      result.levelId_ = levelId_;
      result.fADIFFDNPGF_ = fADIFFDNPGF_;
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
      if (other instanceof io.grasscutter.net.proto.activity.LONMFJNLDAE) {
        return mergeFrom((io.grasscutter.net.proto.activity.LONMFJNLDAE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.LONMFJNLDAE other) {
      if (other == io.grasscutter.net.proto.activity.LONMFJNLDAE.getDefaultInstance()) return this;
      if (other.getLevelId() != 0) {
        setLevelId(other.getLevelId());
      }
      if (other.fADIFFDNPGF_ != 0) {
        setFADIFFDNPGFValue(other.getFADIFFDNPGFValue());
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
      io.grasscutter.net.proto.activity.LONMFJNLDAE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.LONMFJNLDAE) e.getUnfinishedMessage();
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
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }
    /**
     * <code>uint32 level_id = 14;</code>
     * @param value The levelId to set.
     * @return This builder for chaining.
     */
    public Builder setLevelId(int value) {
      
      levelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 level_id = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevelId() {
      
      levelId_ = 0;
      onChanged();
      return this;
    }

    private int fADIFFDNPGF_ = 0;
    /**
     * <code>.FAOPPMCIKHJ FADIFFDNPGF = 11;</code>
     * @return The enum numeric value on the wire for fADIFFDNPGF.
     */
    @java.lang.Override public int getFADIFFDNPGFValue() {
      return fADIFFDNPGF_;
    }
    /**
     * <code>.FAOPPMCIKHJ FADIFFDNPGF = 11;</code>
     * @param value The enum numeric value on the wire for fADIFFDNPGF to set.
     * @return This builder for chaining.
     */
    public Builder setFADIFFDNPGFValue(int value) {
      
      fADIFFDNPGF_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.FAOPPMCIKHJ FADIFFDNPGF = 11;</code>
     * @return The fADIFFDNPGF.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.activity.FAOPPMCIKHJ getFADIFFDNPGF() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.activity.FAOPPMCIKHJ result = io.grasscutter.net.proto.activity.FAOPPMCIKHJ.valueOf(fADIFFDNPGF_);
      return result == null ? io.grasscutter.net.proto.activity.FAOPPMCIKHJ.UNRECOGNIZED : result;
    }
    /**
     * <code>.FAOPPMCIKHJ FADIFFDNPGF = 11;</code>
     * @param value The fADIFFDNPGF to set.
     * @return This builder for chaining.
     */
    public Builder setFADIFFDNPGF(io.grasscutter.net.proto.activity.FAOPPMCIKHJ value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fADIFFDNPGF_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.FAOPPMCIKHJ FADIFFDNPGF = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearFADIFFDNPGF() {
      
      fADIFFDNPGF_ = 0;
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


    // @@protoc_insertion_point(builder_scope:LONMFJNLDAE)
  }

  // @@protoc_insertion_point(class_scope:LONMFJNLDAE)
  private static final io.grasscutter.net.proto.activity.LONMFJNLDAE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.LONMFJNLDAE();
  }

  public static io.grasscutter.net.proto.activity.LONMFJNLDAE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LONMFJNLDAE>
      PARSER = new com.google.protobuf.AbstractParser<LONMFJNLDAE>() {
    @java.lang.Override
    public LONMFJNLDAE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LONMFJNLDAE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LONMFJNLDAE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LONMFJNLDAE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.LONMFJNLDAE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

