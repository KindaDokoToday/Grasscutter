// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code IENBGPNMDFP}
 */
public final class IENBGPNMDFP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IENBGPNMDFP)
    IENBGPNMDFPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IENBGPNMDFP.newBuilder() to construct.
  private IENBGPNMDFP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IENBGPNMDFP() {
    fALCMEDIKOJ_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IENBGPNMDFP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IENBGPNMDFP(
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
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fALCMEDIKOJ_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.LONMFJNLDAE>();
              mutable_bitField0_ |= 0x00000001;
            }
            fALCMEDIKOJ_.add(
                input.readMessage(io.grasscutter.net.proto.activity.LONMFJNLDAE.parser(), extensionRegistry));
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
        fALCMEDIKOJ_ = java.util.Collections.unmodifiableList(fALCMEDIKOJ_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IENBGPNMDFP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IENBGPNMDFP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.IENBGPNMDFP.class, io.grasscutter.net.proto.activity.IENBGPNMDFP.Builder.class);
  }

  public static final int FALCMEDIKOJ_FIELD_NUMBER = 3;
  private java.util.List<io.grasscutter.net.proto.activity.LONMFJNLDAE> fALCMEDIKOJ_;
  /**
   * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.LONMFJNLDAE> getFALCMEDIKOJList() {
    return fALCMEDIKOJ_;
  }
  /**
   * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.LONMFJNLDAEOrBuilder> 
      getFALCMEDIKOJOrBuilderList() {
    return fALCMEDIKOJ_;
  }
  /**
   * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
   */
  @java.lang.Override
  public int getFALCMEDIKOJCount() {
    return fALCMEDIKOJ_.size();
  }
  /**
   * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.LONMFJNLDAE getFALCMEDIKOJ(int index) {
    return fALCMEDIKOJ_.get(index);
  }
  /**
   * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.LONMFJNLDAEOrBuilder getFALCMEDIKOJOrBuilder(
      int index) {
    return fALCMEDIKOJ_.get(index);
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
    for (int i = 0; i < fALCMEDIKOJ_.size(); i++) {
      output.writeMessage(3, fALCMEDIKOJ_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fALCMEDIKOJ_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, fALCMEDIKOJ_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.IENBGPNMDFP)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.IENBGPNMDFP other = (io.grasscutter.net.proto.activity.IENBGPNMDFP) obj;

    if (!getFALCMEDIKOJList()
        .equals(other.getFALCMEDIKOJList())) return false;
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
    if (getFALCMEDIKOJCount() > 0) {
      hash = (37 * hash) + FALCMEDIKOJ_FIELD_NUMBER;
      hash = (53 * hash) + getFALCMEDIKOJList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IENBGPNMDFP parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.IENBGPNMDFP prototype) {
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
   * Protobuf type {@code IENBGPNMDFP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IENBGPNMDFP)
      io.grasscutter.net.proto.activity.IENBGPNMDFPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IENBGPNMDFP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IENBGPNMDFP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.IENBGPNMDFP.class, io.grasscutter.net.proto.activity.IENBGPNMDFP.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.IENBGPNMDFP.newBuilder()
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
        getFALCMEDIKOJFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fALCMEDIKOJBuilder_ == null) {
        fALCMEDIKOJ_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fALCMEDIKOJBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IENBGPNMDFP_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IENBGPNMDFP getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.IENBGPNMDFP.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IENBGPNMDFP build() {
      io.grasscutter.net.proto.activity.IENBGPNMDFP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IENBGPNMDFP buildPartial() {
      io.grasscutter.net.proto.activity.IENBGPNMDFP result = new io.grasscutter.net.proto.activity.IENBGPNMDFP(this);
      int from_bitField0_ = bitField0_;
      if (fALCMEDIKOJBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fALCMEDIKOJ_ = java.util.Collections.unmodifiableList(fALCMEDIKOJ_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fALCMEDIKOJ_ = fALCMEDIKOJ_;
      } else {
        result.fALCMEDIKOJ_ = fALCMEDIKOJBuilder_.build();
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
      if (other instanceof io.grasscutter.net.proto.activity.IENBGPNMDFP) {
        return mergeFrom((io.grasscutter.net.proto.activity.IENBGPNMDFP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.IENBGPNMDFP other) {
      if (other == io.grasscutter.net.proto.activity.IENBGPNMDFP.getDefaultInstance()) return this;
      if (fALCMEDIKOJBuilder_ == null) {
        if (!other.fALCMEDIKOJ_.isEmpty()) {
          if (fALCMEDIKOJ_.isEmpty()) {
            fALCMEDIKOJ_ = other.fALCMEDIKOJ_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFALCMEDIKOJIsMutable();
            fALCMEDIKOJ_.addAll(other.fALCMEDIKOJ_);
          }
          onChanged();
        }
      } else {
        if (!other.fALCMEDIKOJ_.isEmpty()) {
          if (fALCMEDIKOJBuilder_.isEmpty()) {
            fALCMEDIKOJBuilder_.dispose();
            fALCMEDIKOJBuilder_ = null;
            fALCMEDIKOJ_ = other.fALCMEDIKOJ_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fALCMEDIKOJBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFALCMEDIKOJFieldBuilder() : null;
          } else {
            fALCMEDIKOJBuilder_.addAllMessages(other.fALCMEDIKOJ_);
          }
        }
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
      io.grasscutter.net.proto.activity.IENBGPNMDFP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.IENBGPNMDFP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.LONMFJNLDAE> fALCMEDIKOJ_ =
      java.util.Collections.emptyList();
    private void ensureFALCMEDIKOJIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fALCMEDIKOJ_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.LONMFJNLDAE>(fALCMEDIKOJ_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.LONMFJNLDAE, io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder, io.grasscutter.net.proto.activity.LONMFJNLDAEOrBuilder> fALCMEDIKOJBuilder_;

    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.LONMFJNLDAE> getFALCMEDIKOJList() {
      if (fALCMEDIKOJBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fALCMEDIKOJ_);
      } else {
        return fALCMEDIKOJBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public int getFALCMEDIKOJCount() {
      if (fALCMEDIKOJBuilder_ == null) {
        return fALCMEDIKOJ_.size();
      } else {
        return fALCMEDIKOJBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public io.grasscutter.net.proto.activity.LONMFJNLDAE getFALCMEDIKOJ(int index) {
      if (fALCMEDIKOJBuilder_ == null) {
        return fALCMEDIKOJ_.get(index);
      } else {
        return fALCMEDIKOJBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder setFALCMEDIKOJ(
        int index, io.grasscutter.net.proto.activity.LONMFJNLDAE value) {
      if (fALCMEDIKOJBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFALCMEDIKOJIsMutable();
        fALCMEDIKOJ_.set(index, value);
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder setFALCMEDIKOJ(
        int index, io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder builderForValue) {
      if (fALCMEDIKOJBuilder_ == null) {
        ensureFALCMEDIKOJIsMutable();
        fALCMEDIKOJ_.set(index, builderForValue.build());
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder addFALCMEDIKOJ(io.grasscutter.net.proto.activity.LONMFJNLDAE value) {
      if (fALCMEDIKOJBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFALCMEDIKOJIsMutable();
        fALCMEDIKOJ_.add(value);
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder addFALCMEDIKOJ(
        int index, io.grasscutter.net.proto.activity.LONMFJNLDAE value) {
      if (fALCMEDIKOJBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFALCMEDIKOJIsMutable();
        fALCMEDIKOJ_.add(index, value);
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder addFALCMEDIKOJ(
        io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder builderForValue) {
      if (fALCMEDIKOJBuilder_ == null) {
        ensureFALCMEDIKOJIsMutable();
        fALCMEDIKOJ_.add(builderForValue.build());
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder addFALCMEDIKOJ(
        int index, io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder builderForValue) {
      if (fALCMEDIKOJBuilder_ == null) {
        ensureFALCMEDIKOJIsMutable();
        fALCMEDIKOJ_.add(index, builderForValue.build());
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder addAllFALCMEDIKOJ(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.LONMFJNLDAE> values) {
      if (fALCMEDIKOJBuilder_ == null) {
        ensureFALCMEDIKOJIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fALCMEDIKOJ_);
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder clearFALCMEDIKOJ() {
      if (fALCMEDIKOJBuilder_ == null) {
        fALCMEDIKOJ_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public Builder removeFALCMEDIKOJ(int index) {
      if (fALCMEDIKOJBuilder_ == null) {
        ensureFALCMEDIKOJIsMutable();
        fALCMEDIKOJ_.remove(index);
        onChanged();
      } else {
        fALCMEDIKOJBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder getFALCMEDIKOJBuilder(
        int index) {
      return getFALCMEDIKOJFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public io.grasscutter.net.proto.activity.LONMFJNLDAEOrBuilder getFALCMEDIKOJOrBuilder(
        int index) {
      if (fALCMEDIKOJBuilder_ == null) {
        return fALCMEDIKOJ_.get(index);  } else {
        return fALCMEDIKOJBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.LONMFJNLDAEOrBuilder> 
         getFALCMEDIKOJOrBuilderList() {
      if (fALCMEDIKOJBuilder_ != null) {
        return fALCMEDIKOJBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fALCMEDIKOJ_);
      }
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder addFALCMEDIKOJBuilder() {
      return getFALCMEDIKOJFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.LONMFJNLDAE.getDefaultInstance());
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder addFALCMEDIKOJBuilder(
        int index) {
      return getFALCMEDIKOJFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.LONMFJNLDAE.getDefaultInstance());
    }
    /**
     * <code>repeated .LONMFJNLDAE FALCMEDIKOJ = 3;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder> 
         getFALCMEDIKOJBuilderList() {
      return getFALCMEDIKOJFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.LONMFJNLDAE, io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder, io.grasscutter.net.proto.activity.LONMFJNLDAEOrBuilder> 
        getFALCMEDIKOJFieldBuilder() {
      if (fALCMEDIKOJBuilder_ == null) {
        fALCMEDIKOJBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.LONMFJNLDAE, io.grasscutter.net.proto.activity.LONMFJNLDAE.Builder, io.grasscutter.net.proto.activity.LONMFJNLDAEOrBuilder>(
                fALCMEDIKOJ_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fALCMEDIKOJ_ = null;
      }
      return fALCMEDIKOJBuilder_;
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


    // @@protoc_insertion_point(builder_scope:IENBGPNMDFP)
  }

  // @@protoc_insertion_point(class_scope:IENBGPNMDFP)
  private static final io.grasscutter.net.proto.activity.IENBGPNMDFP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.IENBGPNMDFP();
  }

  public static io.grasscutter.net.proto.activity.IENBGPNMDFP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IENBGPNMDFP>
      PARSER = new com.google.protobuf.AbstractParser<IENBGPNMDFP>() {
    @java.lang.Override
    public IENBGPNMDFP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IENBGPNMDFP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IENBGPNMDFP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IENBGPNMDFP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.IENBGPNMDFP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

