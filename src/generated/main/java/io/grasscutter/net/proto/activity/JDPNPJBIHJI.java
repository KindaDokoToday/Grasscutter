// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code JDPNPJBIHJI}
 */
public final class JDPNPJBIHJI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:JDPNPJBIHJI)
    JDPNPJBIHJIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JDPNPJBIHJI.newBuilder() to construct.
  private JDPNPJBIHJI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JDPNPJBIHJI() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JDPNPJBIHJI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JDPNPJBIHJI(
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
          case 42: {
            io.grasscutter.net.proto.activity.MINMBINGDIH.Builder subBuilder = null;
            if (hGPMBMKFJJL_ != null) {
              subBuilder = hGPMBMKFJJL_.toBuilder();
            }
            hGPMBMKFJJL_ = input.readMessage(io.grasscutter.net.proto.activity.MINMBINGDIH.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hGPMBMKFJJL_);
              hGPMBMKFJJL_ = subBuilder.buildPartial();
            }

            break;
          }
          case 74: {
            io.grasscutter.net.proto.activity.GGACHIHJIDH.Builder subBuilder = null;
            if (oDPNMGFHEOM_ != null) {
              subBuilder = oDPNMGFHEOM_.toBuilder();
            }
            oDPNMGFHEOM_ = input.readMessage(io.grasscutter.net.proto.activity.GGACHIHJIDH.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(oDPNMGFHEOM_);
              oDPNMGFHEOM_ = subBuilder.buildPartial();
            }

            break;
          }
          case 90: {
            io.grasscutter.net.proto.activity.ICPGNILEJNN.Builder subBuilder = null;
            if (oCOANEEALCG_ != null) {
              subBuilder = oCOANEEALCG_.toBuilder();
            }
            oCOANEEALCG_ = input.readMessage(io.grasscutter.net.proto.activity.ICPGNILEJNN.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(oCOANEEALCG_);
              oCOANEEALCG_ = subBuilder.buildPartial();
            }

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
    return io.grasscutter.net.proto.activity.Activity.internal_static_JDPNPJBIHJI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_JDPNPJBIHJI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.JDPNPJBIHJI.class, io.grasscutter.net.proto.activity.JDPNPJBIHJI.Builder.class);
  }

  public static final int HGPMBMKFJJL_FIELD_NUMBER = 5;
  private io.grasscutter.net.proto.activity.MINMBINGDIH hGPMBMKFJJL_;
  /**
   * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
   * @return Whether the hGPMBMKFJJL field is set.
   */
  @java.lang.Override
  public boolean hasHGPMBMKFJJL() {
    return hGPMBMKFJJL_ != null;
  }
  /**
   * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
   * @return The hGPMBMKFJJL.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.MINMBINGDIH getHGPMBMKFJJL() {
    return hGPMBMKFJJL_ == null ? io.grasscutter.net.proto.activity.MINMBINGDIH.getDefaultInstance() : hGPMBMKFJJL_;
  }
  /**
   * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.MINMBINGDIHOrBuilder getHGPMBMKFJJLOrBuilder() {
    return getHGPMBMKFJJL();
  }

  public static final int OCOANEEALCG_FIELD_NUMBER = 11;
  private io.grasscutter.net.proto.activity.ICPGNILEJNN oCOANEEALCG_;
  /**
   * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
   * @return Whether the oCOANEEALCG field is set.
   */
  @java.lang.Override
  public boolean hasOCOANEEALCG() {
    return oCOANEEALCG_ != null;
  }
  /**
   * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
   * @return The oCOANEEALCG.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.ICPGNILEJNN getOCOANEEALCG() {
    return oCOANEEALCG_ == null ? io.grasscutter.net.proto.activity.ICPGNILEJNN.getDefaultInstance() : oCOANEEALCG_;
  }
  /**
   * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.ICPGNILEJNNOrBuilder getOCOANEEALCGOrBuilder() {
    return getOCOANEEALCG();
  }

  public static final int ODPNMGFHEOM_FIELD_NUMBER = 9;
  private io.grasscutter.net.proto.activity.GGACHIHJIDH oDPNMGFHEOM_;
  /**
   * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
   * @return Whether the oDPNMGFHEOM field is set.
   */
  @java.lang.Override
  public boolean hasODPNMGFHEOM() {
    return oDPNMGFHEOM_ != null;
  }
  /**
   * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
   * @return The oDPNMGFHEOM.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.GGACHIHJIDH getODPNMGFHEOM() {
    return oDPNMGFHEOM_ == null ? io.grasscutter.net.proto.activity.GGACHIHJIDH.getDefaultInstance() : oDPNMGFHEOM_;
  }
  /**
   * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.GGACHIHJIDHOrBuilder getODPNMGFHEOMOrBuilder() {
    return getODPNMGFHEOM();
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
    if (hGPMBMKFJJL_ != null) {
      output.writeMessage(5, getHGPMBMKFJJL());
    }
    if (oDPNMGFHEOM_ != null) {
      output.writeMessage(9, getODPNMGFHEOM());
    }
    if (oCOANEEALCG_ != null) {
      output.writeMessage(11, getOCOANEEALCG());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hGPMBMKFJJL_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getHGPMBMKFJJL());
    }
    if (oDPNMGFHEOM_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, getODPNMGFHEOM());
    }
    if (oCOANEEALCG_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, getOCOANEEALCG());
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.JDPNPJBIHJI)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.JDPNPJBIHJI other = (io.grasscutter.net.proto.activity.JDPNPJBIHJI) obj;

    if (hasHGPMBMKFJJL() != other.hasHGPMBMKFJJL()) return false;
    if (hasHGPMBMKFJJL()) {
      if (!getHGPMBMKFJJL()
          .equals(other.getHGPMBMKFJJL())) return false;
    }
    if (hasOCOANEEALCG() != other.hasOCOANEEALCG()) return false;
    if (hasOCOANEEALCG()) {
      if (!getOCOANEEALCG()
          .equals(other.getOCOANEEALCG())) return false;
    }
    if (hasODPNMGFHEOM() != other.hasODPNMGFHEOM()) return false;
    if (hasODPNMGFHEOM()) {
      if (!getODPNMGFHEOM()
          .equals(other.getODPNMGFHEOM())) return false;
    }
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
    if (hasHGPMBMKFJJL()) {
      hash = (37 * hash) + HGPMBMKFJJL_FIELD_NUMBER;
      hash = (53 * hash) + getHGPMBMKFJJL().hashCode();
    }
    if (hasOCOANEEALCG()) {
      hash = (37 * hash) + OCOANEEALCG_FIELD_NUMBER;
      hash = (53 * hash) + getOCOANEEALCG().hashCode();
    }
    if (hasODPNMGFHEOM()) {
      hash = (37 * hash) + ODPNMGFHEOM_FIELD_NUMBER;
      hash = (53 * hash) + getODPNMGFHEOM().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.JDPNPJBIHJI prototype) {
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
   * Protobuf type {@code JDPNPJBIHJI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:JDPNPJBIHJI)
      io.grasscutter.net.proto.activity.JDPNPJBIHJIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_JDPNPJBIHJI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_JDPNPJBIHJI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.JDPNPJBIHJI.class, io.grasscutter.net.proto.activity.JDPNPJBIHJI.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.JDPNPJBIHJI.newBuilder()
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
      if (hGPMBMKFJJLBuilder_ == null) {
        hGPMBMKFJJL_ = null;
      } else {
        hGPMBMKFJJL_ = null;
        hGPMBMKFJJLBuilder_ = null;
      }
      if (oCOANEEALCGBuilder_ == null) {
        oCOANEEALCG_ = null;
      } else {
        oCOANEEALCG_ = null;
        oCOANEEALCGBuilder_ = null;
      }
      if (oDPNMGFHEOMBuilder_ == null) {
        oDPNMGFHEOM_ = null;
      } else {
        oDPNMGFHEOM_ = null;
        oDPNMGFHEOMBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_JDPNPJBIHJI_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.JDPNPJBIHJI getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.JDPNPJBIHJI.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.JDPNPJBIHJI build() {
      io.grasscutter.net.proto.activity.JDPNPJBIHJI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.JDPNPJBIHJI buildPartial() {
      io.grasscutter.net.proto.activity.JDPNPJBIHJI result = new io.grasscutter.net.proto.activity.JDPNPJBIHJI(this);
      if (hGPMBMKFJJLBuilder_ == null) {
        result.hGPMBMKFJJL_ = hGPMBMKFJJL_;
      } else {
        result.hGPMBMKFJJL_ = hGPMBMKFJJLBuilder_.build();
      }
      if (oCOANEEALCGBuilder_ == null) {
        result.oCOANEEALCG_ = oCOANEEALCG_;
      } else {
        result.oCOANEEALCG_ = oCOANEEALCGBuilder_.build();
      }
      if (oDPNMGFHEOMBuilder_ == null) {
        result.oDPNMGFHEOM_ = oDPNMGFHEOM_;
      } else {
        result.oDPNMGFHEOM_ = oDPNMGFHEOMBuilder_.build();
      }
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
      if (other instanceof io.grasscutter.net.proto.activity.JDPNPJBIHJI) {
        return mergeFrom((io.grasscutter.net.proto.activity.JDPNPJBIHJI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.JDPNPJBIHJI other) {
      if (other == io.grasscutter.net.proto.activity.JDPNPJBIHJI.getDefaultInstance()) return this;
      if (other.hasHGPMBMKFJJL()) {
        mergeHGPMBMKFJJL(other.getHGPMBMKFJJL());
      }
      if (other.hasOCOANEEALCG()) {
        mergeOCOANEEALCG(other.getOCOANEEALCG());
      }
      if (other.hasODPNMGFHEOM()) {
        mergeODPNMGFHEOM(other.getODPNMGFHEOM());
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
      io.grasscutter.net.proto.activity.JDPNPJBIHJI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.JDPNPJBIHJI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grasscutter.net.proto.activity.MINMBINGDIH hGPMBMKFJJL_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.MINMBINGDIH, io.grasscutter.net.proto.activity.MINMBINGDIH.Builder, io.grasscutter.net.proto.activity.MINMBINGDIHOrBuilder> hGPMBMKFJJLBuilder_;
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     * @return Whether the hGPMBMKFJJL field is set.
     */
    public boolean hasHGPMBMKFJJL() {
      return hGPMBMKFJJLBuilder_ != null || hGPMBMKFJJL_ != null;
    }
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     * @return The hGPMBMKFJJL.
     */
    public io.grasscutter.net.proto.activity.MINMBINGDIH getHGPMBMKFJJL() {
      if (hGPMBMKFJJLBuilder_ == null) {
        return hGPMBMKFJJL_ == null ? io.grasscutter.net.proto.activity.MINMBINGDIH.getDefaultInstance() : hGPMBMKFJJL_;
      } else {
        return hGPMBMKFJJLBuilder_.getMessage();
      }
    }
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     */
    public Builder setHGPMBMKFJJL(io.grasscutter.net.proto.activity.MINMBINGDIH value) {
      if (hGPMBMKFJJLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hGPMBMKFJJL_ = value;
        onChanged();
      } else {
        hGPMBMKFJJLBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     */
    public Builder setHGPMBMKFJJL(
        io.grasscutter.net.proto.activity.MINMBINGDIH.Builder builderForValue) {
      if (hGPMBMKFJJLBuilder_ == null) {
        hGPMBMKFJJL_ = builderForValue.build();
        onChanged();
      } else {
        hGPMBMKFJJLBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     */
    public Builder mergeHGPMBMKFJJL(io.grasscutter.net.proto.activity.MINMBINGDIH value) {
      if (hGPMBMKFJJLBuilder_ == null) {
        if (hGPMBMKFJJL_ != null) {
          hGPMBMKFJJL_ =
            io.grasscutter.net.proto.activity.MINMBINGDIH.newBuilder(hGPMBMKFJJL_).mergeFrom(value).buildPartial();
        } else {
          hGPMBMKFJJL_ = value;
        }
        onChanged();
      } else {
        hGPMBMKFJJLBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     */
    public Builder clearHGPMBMKFJJL() {
      if (hGPMBMKFJJLBuilder_ == null) {
        hGPMBMKFJJL_ = null;
        onChanged();
      } else {
        hGPMBMKFJJL_ = null;
        hGPMBMKFJJLBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     */
    public io.grasscutter.net.proto.activity.MINMBINGDIH.Builder getHGPMBMKFJJLBuilder() {
      
      onChanged();
      return getHGPMBMKFJJLFieldBuilder().getBuilder();
    }
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     */
    public io.grasscutter.net.proto.activity.MINMBINGDIHOrBuilder getHGPMBMKFJJLOrBuilder() {
      if (hGPMBMKFJJLBuilder_ != null) {
        return hGPMBMKFJJLBuilder_.getMessageOrBuilder();
      } else {
        return hGPMBMKFJJL_ == null ?
            io.grasscutter.net.proto.activity.MINMBINGDIH.getDefaultInstance() : hGPMBMKFJJL_;
      }
    }
    /**
     * <code>.MINMBINGDIH HGPMBMKFJJL = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.MINMBINGDIH, io.grasscutter.net.proto.activity.MINMBINGDIH.Builder, io.grasscutter.net.proto.activity.MINMBINGDIHOrBuilder> 
        getHGPMBMKFJJLFieldBuilder() {
      if (hGPMBMKFJJLBuilder_ == null) {
        hGPMBMKFJJLBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.activity.MINMBINGDIH, io.grasscutter.net.proto.activity.MINMBINGDIH.Builder, io.grasscutter.net.proto.activity.MINMBINGDIHOrBuilder>(
                getHGPMBMKFJJL(),
                getParentForChildren(),
                isClean());
        hGPMBMKFJJL_ = null;
      }
      return hGPMBMKFJJLBuilder_;
    }

    private io.grasscutter.net.proto.activity.ICPGNILEJNN oCOANEEALCG_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.ICPGNILEJNN, io.grasscutter.net.proto.activity.ICPGNILEJNN.Builder, io.grasscutter.net.proto.activity.ICPGNILEJNNOrBuilder> oCOANEEALCGBuilder_;
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     * @return Whether the oCOANEEALCG field is set.
     */
    public boolean hasOCOANEEALCG() {
      return oCOANEEALCGBuilder_ != null || oCOANEEALCG_ != null;
    }
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     * @return The oCOANEEALCG.
     */
    public io.grasscutter.net.proto.activity.ICPGNILEJNN getOCOANEEALCG() {
      if (oCOANEEALCGBuilder_ == null) {
        return oCOANEEALCG_ == null ? io.grasscutter.net.proto.activity.ICPGNILEJNN.getDefaultInstance() : oCOANEEALCG_;
      } else {
        return oCOANEEALCGBuilder_.getMessage();
      }
    }
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     */
    public Builder setOCOANEEALCG(io.grasscutter.net.proto.activity.ICPGNILEJNN value) {
      if (oCOANEEALCGBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oCOANEEALCG_ = value;
        onChanged();
      } else {
        oCOANEEALCGBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     */
    public Builder setOCOANEEALCG(
        io.grasscutter.net.proto.activity.ICPGNILEJNN.Builder builderForValue) {
      if (oCOANEEALCGBuilder_ == null) {
        oCOANEEALCG_ = builderForValue.build();
        onChanged();
      } else {
        oCOANEEALCGBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     */
    public Builder mergeOCOANEEALCG(io.grasscutter.net.proto.activity.ICPGNILEJNN value) {
      if (oCOANEEALCGBuilder_ == null) {
        if (oCOANEEALCG_ != null) {
          oCOANEEALCG_ =
            io.grasscutter.net.proto.activity.ICPGNILEJNN.newBuilder(oCOANEEALCG_).mergeFrom(value).buildPartial();
        } else {
          oCOANEEALCG_ = value;
        }
        onChanged();
      } else {
        oCOANEEALCGBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     */
    public Builder clearOCOANEEALCG() {
      if (oCOANEEALCGBuilder_ == null) {
        oCOANEEALCG_ = null;
        onChanged();
      } else {
        oCOANEEALCG_ = null;
        oCOANEEALCGBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     */
    public io.grasscutter.net.proto.activity.ICPGNILEJNN.Builder getOCOANEEALCGBuilder() {
      
      onChanged();
      return getOCOANEEALCGFieldBuilder().getBuilder();
    }
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     */
    public io.grasscutter.net.proto.activity.ICPGNILEJNNOrBuilder getOCOANEEALCGOrBuilder() {
      if (oCOANEEALCGBuilder_ != null) {
        return oCOANEEALCGBuilder_.getMessageOrBuilder();
      } else {
        return oCOANEEALCG_ == null ?
            io.grasscutter.net.proto.activity.ICPGNILEJNN.getDefaultInstance() : oCOANEEALCG_;
      }
    }
    /**
     * <code>.ICPGNILEJNN OCOANEEALCG = 11;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.ICPGNILEJNN, io.grasscutter.net.proto.activity.ICPGNILEJNN.Builder, io.grasscutter.net.proto.activity.ICPGNILEJNNOrBuilder> 
        getOCOANEEALCGFieldBuilder() {
      if (oCOANEEALCGBuilder_ == null) {
        oCOANEEALCGBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.activity.ICPGNILEJNN, io.grasscutter.net.proto.activity.ICPGNILEJNN.Builder, io.grasscutter.net.proto.activity.ICPGNILEJNNOrBuilder>(
                getOCOANEEALCG(),
                getParentForChildren(),
                isClean());
        oCOANEEALCG_ = null;
      }
      return oCOANEEALCGBuilder_;
    }

    private io.grasscutter.net.proto.activity.GGACHIHJIDH oDPNMGFHEOM_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.GGACHIHJIDH, io.grasscutter.net.proto.activity.GGACHIHJIDH.Builder, io.grasscutter.net.proto.activity.GGACHIHJIDHOrBuilder> oDPNMGFHEOMBuilder_;
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     * @return Whether the oDPNMGFHEOM field is set.
     */
    public boolean hasODPNMGFHEOM() {
      return oDPNMGFHEOMBuilder_ != null || oDPNMGFHEOM_ != null;
    }
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     * @return The oDPNMGFHEOM.
     */
    public io.grasscutter.net.proto.activity.GGACHIHJIDH getODPNMGFHEOM() {
      if (oDPNMGFHEOMBuilder_ == null) {
        return oDPNMGFHEOM_ == null ? io.grasscutter.net.proto.activity.GGACHIHJIDH.getDefaultInstance() : oDPNMGFHEOM_;
      } else {
        return oDPNMGFHEOMBuilder_.getMessage();
      }
    }
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     */
    public Builder setODPNMGFHEOM(io.grasscutter.net.proto.activity.GGACHIHJIDH value) {
      if (oDPNMGFHEOMBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oDPNMGFHEOM_ = value;
        onChanged();
      } else {
        oDPNMGFHEOMBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     */
    public Builder setODPNMGFHEOM(
        io.grasscutter.net.proto.activity.GGACHIHJIDH.Builder builderForValue) {
      if (oDPNMGFHEOMBuilder_ == null) {
        oDPNMGFHEOM_ = builderForValue.build();
        onChanged();
      } else {
        oDPNMGFHEOMBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     */
    public Builder mergeODPNMGFHEOM(io.grasscutter.net.proto.activity.GGACHIHJIDH value) {
      if (oDPNMGFHEOMBuilder_ == null) {
        if (oDPNMGFHEOM_ != null) {
          oDPNMGFHEOM_ =
            io.grasscutter.net.proto.activity.GGACHIHJIDH.newBuilder(oDPNMGFHEOM_).mergeFrom(value).buildPartial();
        } else {
          oDPNMGFHEOM_ = value;
        }
        onChanged();
      } else {
        oDPNMGFHEOMBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     */
    public Builder clearODPNMGFHEOM() {
      if (oDPNMGFHEOMBuilder_ == null) {
        oDPNMGFHEOM_ = null;
        onChanged();
      } else {
        oDPNMGFHEOM_ = null;
        oDPNMGFHEOMBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     */
    public io.grasscutter.net.proto.activity.GGACHIHJIDH.Builder getODPNMGFHEOMBuilder() {
      
      onChanged();
      return getODPNMGFHEOMFieldBuilder().getBuilder();
    }
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     */
    public io.grasscutter.net.proto.activity.GGACHIHJIDHOrBuilder getODPNMGFHEOMOrBuilder() {
      if (oDPNMGFHEOMBuilder_ != null) {
        return oDPNMGFHEOMBuilder_.getMessageOrBuilder();
      } else {
        return oDPNMGFHEOM_ == null ?
            io.grasscutter.net.proto.activity.GGACHIHJIDH.getDefaultInstance() : oDPNMGFHEOM_;
      }
    }
    /**
     * <code>.GGACHIHJIDH ODPNMGFHEOM = 9;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.GGACHIHJIDH, io.grasscutter.net.proto.activity.GGACHIHJIDH.Builder, io.grasscutter.net.proto.activity.GGACHIHJIDHOrBuilder> 
        getODPNMGFHEOMFieldBuilder() {
      if (oDPNMGFHEOMBuilder_ == null) {
        oDPNMGFHEOMBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.activity.GGACHIHJIDH, io.grasscutter.net.proto.activity.GGACHIHJIDH.Builder, io.grasscutter.net.proto.activity.GGACHIHJIDHOrBuilder>(
                getODPNMGFHEOM(),
                getParentForChildren(),
                isClean());
        oDPNMGFHEOM_ = null;
      }
      return oDPNMGFHEOMBuilder_;
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


    // @@protoc_insertion_point(builder_scope:JDPNPJBIHJI)
  }

  // @@protoc_insertion_point(class_scope:JDPNPJBIHJI)
  private static final io.grasscutter.net.proto.activity.JDPNPJBIHJI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.JDPNPJBIHJI();
  }

  public static io.grasscutter.net.proto.activity.JDPNPJBIHJI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JDPNPJBIHJI>
      PARSER = new com.google.protobuf.AbstractParser<JDPNPJBIHJI>() {
    @java.lang.Override
    public JDPNPJBIHJI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JDPNPJBIHJI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JDPNPJBIHJI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JDPNPJBIHJI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.JDPNPJBIHJI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

