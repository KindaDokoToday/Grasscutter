// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code AGDIEPOHJCH}
 */
public final class AGDIEPOHJCH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AGDIEPOHJCH)
    AGDIEPOHJCHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AGDIEPOHJCH.newBuilder() to construct.
  private AGDIEPOHJCH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AGDIEPOHJCH() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AGDIEPOHJCH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AGDIEPOHJCH(
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

            aADKGLAKICJ_ = input.readUInt32();
            break;
          }
          case 96: {

            iPJDIPNCFDN_ = input.readUInt32();
            break;
          }
          case 112: {

            cMDBCGAECDP_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_AGDIEPOHJCH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_AGDIEPOHJCH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.AGDIEPOHJCH.class, io.grasscutter.net.proto.activity.AGDIEPOHJCH.Builder.class);
  }

  public static final int IPJDIPNCFDN_FIELD_NUMBER = 12;
  private int iPJDIPNCFDN_;
  /**
   * <code>uint32 IPJDIPNCFDN = 12;</code>
   * @return The iPJDIPNCFDN.
   */
  @java.lang.Override
  public int getIPJDIPNCFDN() {
    return iPJDIPNCFDN_;
  }

  public static final int CMDBCGAECDP_FIELD_NUMBER = 14;
  private int cMDBCGAECDP_;
  /**
   * <code>uint32 CMDBCGAECDP = 14;</code>
   * @return The cMDBCGAECDP.
   */
  @java.lang.Override
  public int getCMDBCGAECDP() {
    return cMDBCGAECDP_;
  }

  public static final int AADKGLAKICJ_FIELD_NUMBER = 11;
  private int aADKGLAKICJ_;
  /**
   * <code>uint32 AADKGLAKICJ = 11;</code>
   * @return The aADKGLAKICJ.
   */
  @java.lang.Override
  public int getAADKGLAKICJ() {
    return aADKGLAKICJ_;
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
    if (aADKGLAKICJ_ != 0) {
      output.writeUInt32(11, aADKGLAKICJ_);
    }
    if (iPJDIPNCFDN_ != 0) {
      output.writeUInt32(12, iPJDIPNCFDN_);
    }
    if (cMDBCGAECDP_ != 0) {
      output.writeUInt32(14, cMDBCGAECDP_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aADKGLAKICJ_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, aADKGLAKICJ_);
    }
    if (iPJDIPNCFDN_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, iPJDIPNCFDN_);
    }
    if (cMDBCGAECDP_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, cMDBCGAECDP_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.AGDIEPOHJCH)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.AGDIEPOHJCH other = (io.grasscutter.net.proto.activity.AGDIEPOHJCH) obj;

    if (getIPJDIPNCFDN()
        != other.getIPJDIPNCFDN()) return false;
    if (getCMDBCGAECDP()
        != other.getCMDBCGAECDP()) return false;
    if (getAADKGLAKICJ()
        != other.getAADKGLAKICJ()) return false;
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
    hash = (37 * hash) + IPJDIPNCFDN_FIELD_NUMBER;
    hash = (53 * hash) + getIPJDIPNCFDN();
    hash = (37 * hash) + CMDBCGAECDP_FIELD_NUMBER;
    hash = (53 * hash) + getCMDBCGAECDP();
    hash = (37 * hash) + AADKGLAKICJ_FIELD_NUMBER;
    hash = (53 * hash) + getAADKGLAKICJ();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.AGDIEPOHJCH prototype) {
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
   * Protobuf type {@code AGDIEPOHJCH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AGDIEPOHJCH)
      io.grasscutter.net.proto.activity.AGDIEPOHJCHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_AGDIEPOHJCH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_AGDIEPOHJCH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.AGDIEPOHJCH.class, io.grasscutter.net.proto.activity.AGDIEPOHJCH.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.AGDIEPOHJCH.newBuilder()
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
      iPJDIPNCFDN_ = 0;

      cMDBCGAECDP_ = 0;

      aADKGLAKICJ_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_AGDIEPOHJCH_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.AGDIEPOHJCH getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.AGDIEPOHJCH.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.AGDIEPOHJCH build() {
      io.grasscutter.net.proto.activity.AGDIEPOHJCH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.AGDIEPOHJCH buildPartial() {
      io.grasscutter.net.proto.activity.AGDIEPOHJCH result = new io.grasscutter.net.proto.activity.AGDIEPOHJCH(this);
      result.iPJDIPNCFDN_ = iPJDIPNCFDN_;
      result.cMDBCGAECDP_ = cMDBCGAECDP_;
      result.aADKGLAKICJ_ = aADKGLAKICJ_;
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
      if (other instanceof io.grasscutter.net.proto.activity.AGDIEPOHJCH) {
        return mergeFrom((io.grasscutter.net.proto.activity.AGDIEPOHJCH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.AGDIEPOHJCH other) {
      if (other == io.grasscutter.net.proto.activity.AGDIEPOHJCH.getDefaultInstance()) return this;
      if (other.getIPJDIPNCFDN() != 0) {
        setIPJDIPNCFDN(other.getIPJDIPNCFDN());
      }
      if (other.getCMDBCGAECDP() != 0) {
        setCMDBCGAECDP(other.getCMDBCGAECDP());
      }
      if (other.getAADKGLAKICJ() != 0) {
        setAADKGLAKICJ(other.getAADKGLAKICJ());
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
      io.grasscutter.net.proto.activity.AGDIEPOHJCH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.AGDIEPOHJCH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int iPJDIPNCFDN_ ;
    /**
     * <code>uint32 IPJDIPNCFDN = 12;</code>
     * @return The iPJDIPNCFDN.
     */
    @java.lang.Override
    public int getIPJDIPNCFDN() {
      return iPJDIPNCFDN_;
    }
    /**
     * <code>uint32 IPJDIPNCFDN = 12;</code>
     * @param value The iPJDIPNCFDN to set.
     * @return This builder for chaining.
     */
    public Builder setIPJDIPNCFDN(int value) {
      
      iPJDIPNCFDN_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 IPJDIPNCFDN = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearIPJDIPNCFDN() {
      
      iPJDIPNCFDN_ = 0;
      onChanged();
      return this;
    }

    private int cMDBCGAECDP_ ;
    /**
     * <code>uint32 CMDBCGAECDP = 14;</code>
     * @return The cMDBCGAECDP.
     */
    @java.lang.Override
    public int getCMDBCGAECDP() {
      return cMDBCGAECDP_;
    }
    /**
     * <code>uint32 CMDBCGAECDP = 14;</code>
     * @param value The cMDBCGAECDP to set.
     * @return This builder for chaining.
     */
    public Builder setCMDBCGAECDP(int value) {
      
      cMDBCGAECDP_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 CMDBCGAECDP = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearCMDBCGAECDP() {
      
      cMDBCGAECDP_ = 0;
      onChanged();
      return this;
    }

    private int aADKGLAKICJ_ ;
    /**
     * <code>uint32 AADKGLAKICJ = 11;</code>
     * @return The aADKGLAKICJ.
     */
    @java.lang.Override
    public int getAADKGLAKICJ() {
      return aADKGLAKICJ_;
    }
    /**
     * <code>uint32 AADKGLAKICJ = 11;</code>
     * @param value The aADKGLAKICJ to set.
     * @return This builder for chaining.
     */
    public Builder setAADKGLAKICJ(int value) {
      
      aADKGLAKICJ_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 AADKGLAKICJ = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearAADKGLAKICJ() {
      
      aADKGLAKICJ_ = 0;
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


    // @@protoc_insertion_point(builder_scope:AGDIEPOHJCH)
  }

  // @@protoc_insertion_point(class_scope:AGDIEPOHJCH)
  private static final io.grasscutter.net.proto.activity.AGDIEPOHJCH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.AGDIEPOHJCH();
  }

  public static io.grasscutter.net.proto.activity.AGDIEPOHJCH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AGDIEPOHJCH>
      PARSER = new com.google.protobuf.AbstractParser<AGDIEPOHJCH>() {
    @java.lang.Override
    public AGDIEPOHJCH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AGDIEPOHJCH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AGDIEPOHJCH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AGDIEPOHJCH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.AGDIEPOHJCH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

