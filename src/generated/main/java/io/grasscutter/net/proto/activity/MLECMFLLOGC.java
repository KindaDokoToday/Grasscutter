// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code MLECMFLLOGC}
 */
public final class MLECMFLLOGC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MLECMFLLOGC)
    MLECMFLLOGCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MLECMFLLOGC.newBuilder() to construct.
  private MLECMFLLOGC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MLECMFLLOGC() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MLECMFLLOGC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MLECMFLLOGC(
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
          case 40: {

            hHKOGNNMKHL_ = input.readUInt32();
            break;
          }
          case 56: {

            aGGFENMFAIB_ = input.readUInt32();
            break;
          }
          case 64: {

            guid_ = input.readUInt32();
            break;
          }
          case 112: {

            ePFCIDIKLKG_ = input.readUInt32();
            break;
          }
          case 120: {

            gCPOHINJPEJ_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_MLECMFLLOGC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_MLECMFLLOGC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.MLECMFLLOGC.class, io.grasscutter.net.proto.activity.MLECMFLLOGC.Builder.class);
  }

  public static final int AGGFENMFAIB_FIELD_NUMBER = 7;
  private int aGGFENMFAIB_;
  /**
   * <code>uint32 AGGFENMFAIB = 7;</code>
   * @return The aGGFENMFAIB.
   */
  @java.lang.Override
  public int getAGGFENMFAIB() {
    return aGGFENMFAIB_;
  }

  public static final int HHKOGNNMKHL_FIELD_NUMBER = 5;
  private int hHKOGNNMKHL_;
  /**
   * <code>uint32 HHKOGNNMKHL = 5;</code>
   * @return The hHKOGNNMKHL.
   */
  @java.lang.Override
  public int getHHKOGNNMKHL() {
    return hHKOGNNMKHL_;
  }

  public static final int GUID_FIELD_NUMBER = 8;
  private int guid_;
  /**
   * <code>uint32 guid = 8;</code>
   * @return The guid.
   */
  @java.lang.Override
  public int getGuid() {
    return guid_;
  }

  public static final int GCPOHINJPEJ_FIELD_NUMBER = 15;
  private int gCPOHINJPEJ_;
  /**
   * <code>uint32 GCPOHINJPEJ = 15;</code>
   * @return The gCPOHINJPEJ.
   */
  @java.lang.Override
  public int getGCPOHINJPEJ() {
    return gCPOHINJPEJ_;
  }

  public static final int EPFCIDIKLKG_FIELD_NUMBER = 14;
  private int ePFCIDIKLKG_;
  /**
   * <code>uint32 EPFCIDIKLKG = 14;</code>
   * @return The ePFCIDIKLKG.
   */
  @java.lang.Override
  public int getEPFCIDIKLKG() {
    return ePFCIDIKLKG_;
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
    if (hHKOGNNMKHL_ != 0) {
      output.writeUInt32(5, hHKOGNNMKHL_);
    }
    if (aGGFENMFAIB_ != 0) {
      output.writeUInt32(7, aGGFENMFAIB_);
    }
    if (guid_ != 0) {
      output.writeUInt32(8, guid_);
    }
    if (ePFCIDIKLKG_ != 0) {
      output.writeUInt32(14, ePFCIDIKLKG_);
    }
    if (gCPOHINJPEJ_ != 0) {
      output.writeUInt32(15, gCPOHINJPEJ_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hHKOGNNMKHL_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, hHKOGNNMKHL_);
    }
    if (aGGFENMFAIB_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, aGGFENMFAIB_);
    }
    if (guid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, guid_);
    }
    if (ePFCIDIKLKG_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, ePFCIDIKLKG_);
    }
    if (gCPOHINJPEJ_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, gCPOHINJPEJ_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.MLECMFLLOGC)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.MLECMFLLOGC other = (io.grasscutter.net.proto.activity.MLECMFLLOGC) obj;

    if (getAGGFENMFAIB()
        != other.getAGGFENMFAIB()) return false;
    if (getHHKOGNNMKHL()
        != other.getHHKOGNNMKHL()) return false;
    if (getGuid()
        != other.getGuid()) return false;
    if (getGCPOHINJPEJ()
        != other.getGCPOHINJPEJ()) return false;
    if (getEPFCIDIKLKG()
        != other.getEPFCIDIKLKG()) return false;
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
    hash = (37 * hash) + AGGFENMFAIB_FIELD_NUMBER;
    hash = (53 * hash) + getAGGFENMFAIB();
    hash = (37 * hash) + HHKOGNNMKHL_FIELD_NUMBER;
    hash = (53 * hash) + getHHKOGNNMKHL();
    hash = (37 * hash) + GUID_FIELD_NUMBER;
    hash = (53 * hash) + getGuid();
    hash = (37 * hash) + GCPOHINJPEJ_FIELD_NUMBER;
    hash = (53 * hash) + getGCPOHINJPEJ();
    hash = (37 * hash) + EPFCIDIKLKG_FIELD_NUMBER;
    hash = (53 * hash) + getEPFCIDIKLKG();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MLECMFLLOGC parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.MLECMFLLOGC prototype) {
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
   * Protobuf type {@code MLECMFLLOGC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MLECMFLLOGC)
      io.grasscutter.net.proto.activity.MLECMFLLOGCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MLECMFLLOGC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MLECMFLLOGC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.MLECMFLLOGC.class, io.grasscutter.net.proto.activity.MLECMFLLOGC.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.MLECMFLLOGC.newBuilder()
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
      aGGFENMFAIB_ = 0;

      hHKOGNNMKHL_ = 0;

      guid_ = 0;

      gCPOHINJPEJ_ = 0;

      ePFCIDIKLKG_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MLECMFLLOGC_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MLECMFLLOGC getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.MLECMFLLOGC.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MLECMFLLOGC build() {
      io.grasscutter.net.proto.activity.MLECMFLLOGC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MLECMFLLOGC buildPartial() {
      io.grasscutter.net.proto.activity.MLECMFLLOGC result = new io.grasscutter.net.proto.activity.MLECMFLLOGC(this);
      result.aGGFENMFAIB_ = aGGFENMFAIB_;
      result.hHKOGNNMKHL_ = hHKOGNNMKHL_;
      result.guid_ = guid_;
      result.gCPOHINJPEJ_ = gCPOHINJPEJ_;
      result.ePFCIDIKLKG_ = ePFCIDIKLKG_;
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
      if (other instanceof io.grasscutter.net.proto.activity.MLECMFLLOGC) {
        return mergeFrom((io.grasscutter.net.proto.activity.MLECMFLLOGC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.MLECMFLLOGC other) {
      if (other == io.grasscutter.net.proto.activity.MLECMFLLOGC.getDefaultInstance()) return this;
      if (other.getAGGFENMFAIB() != 0) {
        setAGGFENMFAIB(other.getAGGFENMFAIB());
      }
      if (other.getHHKOGNNMKHL() != 0) {
        setHHKOGNNMKHL(other.getHHKOGNNMKHL());
      }
      if (other.getGuid() != 0) {
        setGuid(other.getGuid());
      }
      if (other.getGCPOHINJPEJ() != 0) {
        setGCPOHINJPEJ(other.getGCPOHINJPEJ());
      }
      if (other.getEPFCIDIKLKG() != 0) {
        setEPFCIDIKLKG(other.getEPFCIDIKLKG());
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
      io.grasscutter.net.proto.activity.MLECMFLLOGC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.MLECMFLLOGC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int aGGFENMFAIB_ ;
    /**
     * <code>uint32 AGGFENMFAIB = 7;</code>
     * @return The aGGFENMFAIB.
     */
    @java.lang.Override
    public int getAGGFENMFAIB() {
      return aGGFENMFAIB_;
    }
    /**
     * <code>uint32 AGGFENMFAIB = 7;</code>
     * @param value The aGGFENMFAIB to set.
     * @return This builder for chaining.
     */
    public Builder setAGGFENMFAIB(int value) {
      
      aGGFENMFAIB_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 AGGFENMFAIB = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearAGGFENMFAIB() {
      
      aGGFENMFAIB_ = 0;
      onChanged();
      return this;
    }

    private int hHKOGNNMKHL_ ;
    /**
     * <code>uint32 HHKOGNNMKHL = 5;</code>
     * @return The hHKOGNNMKHL.
     */
    @java.lang.Override
    public int getHHKOGNNMKHL() {
      return hHKOGNNMKHL_;
    }
    /**
     * <code>uint32 HHKOGNNMKHL = 5;</code>
     * @param value The hHKOGNNMKHL to set.
     * @return This builder for chaining.
     */
    public Builder setHHKOGNNMKHL(int value) {
      
      hHKOGNNMKHL_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 HHKOGNNMKHL = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHHKOGNNMKHL() {
      
      hHKOGNNMKHL_ = 0;
      onChanged();
      return this;
    }

    private int guid_ ;
    /**
     * <code>uint32 guid = 8;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }
    /**
     * <code>uint32 guid = 8;</code>
     * @param value The guid to set.
     * @return This builder for chaining.
     */
    public Builder setGuid(int value) {
      
      guid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 guid = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuid() {
      
      guid_ = 0;
      onChanged();
      return this;
    }

    private int gCPOHINJPEJ_ ;
    /**
     * <code>uint32 GCPOHINJPEJ = 15;</code>
     * @return The gCPOHINJPEJ.
     */
    @java.lang.Override
    public int getGCPOHINJPEJ() {
      return gCPOHINJPEJ_;
    }
    /**
     * <code>uint32 GCPOHINJPEJ = 15;</code>
     * @param value The gCPOHINJPEJ to set.
     * @return This builder for chaining.
     */
    public Builder setGCPOHINJPEJ(int value) {
      
      gCPOHINJPEJ_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 GCPOHINJPEJ = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearGCPOHINJPEJ() {
      
      gCPOHINJPEJ_ = 0;
      onChanged();
      return this;
    }

    private int ePFCIDIKLKG_ ;
    /**
     * <code>uint32 EPFCIDIKLKG = 14;</code>
     * @return The ePFCIDIKLKG.
     */
    @java.lang.Override
    public int getEPFCIDIKLKG() {
      return ePFCIDIKLKG_;
    }
    /**
     * <code>uint32 EPFCIDIKLKG = 14;</code>
     * @param value The ePFCIDIKLKG to set.
     * @return This builder for chaining.
     */
    public Builder setEPFCIDIKLKG(int value) {
      
      ePFCIDIKLKG_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 EPFCIDIKLKG = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearEPFCIDIKLKG() {
      
      ePFCIDIKLKG_ = 0;
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


    // @@protoc_insertion_point(builder_scope:MLECMFLLOGC)
  }

  // @@protoc_insertion_point(class_scope:MLECMFLLOGC)
  private static final io.grasscutter.net.proto.activity.MLECMFLLOGC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.MLECMFLLOGC();
  }

  public static io.grasscutter.net.proto.activity.MLECMFLLOGC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MLECMFLLOGC>
      PARSER = new com.google.protobuf.AbstractParser<MLECMFLLOGC>() {
    @java.lang.Override
    public MLECMFLLOGC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MLECMFLLOGC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MLECMFLLOGC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MLECMFLLOGC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.MLECMFLLOGC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

