// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code LANFEMMHKNB}
 */
public final class LANFEMMHKNB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LANFEMMHKNB)
    LANFEMMHKNBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LANFEMMHKNB.newBuilder() to construct.
  private LANFEMMHKNB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LANFEMMHKNB() {
    jJIKCEBEDPO_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LANFEMMHKNB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LANFEMMHKNB(
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
              jJIKCEBEDPO_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.JILMFEILIGG>();
              mutable_bitField0_ |= 0x00000001;
            }
            jJIKCEBEDPO_.add(
                input.readMessage(io.grasscutter.net.proto.activity.JILMFEILIGG.parser(), extensionRegistry));
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
        jJIKCEBEDPO_ = java.util.Collections.unmodifiableList(jJIKCEBEDPO_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_LANFEMMHKNB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_LANFEMMHKNB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.LANFEMMHKNB.class, io.grasscutter.net.proto.activity.LANFEMMHKNB.Builder.class);
  }

  public static final int JJIKCEBEDPO_FIELD_NUMBER = 3;
  private java.util.List<io.grasscutter.net.proto.activity.JILMFEILIGG> jJIKCEBEDPO_;
  /**
   * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.JILMFEILIGG> getJJIKCEBEDPOList() {
    return jJIKCEBEDPO_;
  }
  /**
   * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.JILMFEILIGGOrBuilder> 
      getJJIKCEBEDPOOrBuilderList() {
    return jJIKCEBEDPO_;
  }
  /**
   * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
   */
  @java.lang.Override
  public int getJJIKCEBEDPOCount() {
    return jJIKCEBEDPO_.size();
  }
  /**
   * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.JILMFEILIGG getJJIKCEBEDPO(int index) {
    return jJIKCEBEDPO_.get(index);
  }
  /**
   * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.JILMFEILIGGOrBuilder getJJIKCEBEDPOOrBuilder(
      int index) {
    return jJIKCEBEDPO_.get(index);
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
    for (int i = 0; i < jJIKCEBEDPO_.size(); i++) {
      output.writeMessage(3, jJIKCEBEDPO_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jJIKCEBEDPO_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, jJIKCEBEDPO_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.LANFEMMHKNB)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.LANFEMMHKNB other = (io.grasscutter.net.proto.activity.LANFEMMHKNB) obj;

    if (!getJJIKCEBEDPOList()
        .equals(other.getJJIKCEBEDPOList())) return false;
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
    if (getJJIKCEBEDPOCount() > 0) {
      hash = (37 * hash) + JJIKCEBEDPO_FIELD_NUMBER;
      hash = (53 * hash) + getJJIKCEBEDPOList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LANFEMMHKNB parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.LANFEMMHKNB prototype) {
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
   * Protobuf type {@code LANFEMMHKNB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LANFEMMHKNB)
      io.grasscutter.net.proto.activity.LANFEMMHKNBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LANFEMMHKNB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LANFEMMHKNB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.LANFEMMHKNB.class, io.grasscutter.net.proto.activity.LANFEMMHKNB.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.LANFEMMHKNB.newBuilder()
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
        getJJIKCEBEDPOFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jJIKCEBEDPOBuilder_ == null) {
        jJIKCEBEDPO_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jJIKCEBEDPOBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LANFEMMHKNB_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LANFEMMHKNB getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.LANFEMMHKNB.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LANFEMMHKNB build() {
      io.grasscutter.net.proto.activity.LANFEMMHKNB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LANFEMMHKNB buildPartial() {
      io.grasscutter.net.proto.activity.LANFEMMHKNB result = new io.grasscutter.net.proto.activity.LANFEMMHKNB(this);
      int from_bitField0_ = bitField0_;
      if (jJIKCEBEDPOBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jJIKCEBEDPO_ = java.util.Collections.unmodifiableList(jJIKCEBEDPO_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jJIKCEBEDPO_ = jJIKCEBEDPO_;
      } else {
        result.jJIKCEBEDPO_ = jJIKCEBEDPOBuilder_.build();
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
      if (other instanceof io.grasscutter.net.proto.activity.LANFEMMHKNB) {
        return mergeFrom((io.grasscutter.net.proto.activity.LANFEMMHKNB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.LANFEMMHKNB other) {
      if (other == io.grasscutter.net.proto.activity.LANFEMMHKNB.getDefaultInstance()) return this;
      if (jJIKCEBEDPOBuilder_ == null) {
        if (!other.jJIKCEBEDPO_.isEmpty()) {
          if (jJIKCEBEDPO_.isEmpty()) {
            jJIKCEBEDPO_ = other.jJIKCEBEDPO_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJJIKCEBEDPOIsMutable();
            jJIKCEBEDPO_.addAll(other.jJIKCEBEDPO_);
          }
          onChanged();
        }
      } else {
        if (!other.jJIKCEBEDPO_.isEmpty()) {
          if (jJIKCEBEDPOBuilder_.isEmpty()) {
            jJIKCEBEDPOBuilder_.dispose();
            jJIKCEBEDPOBuilder_ = null;
            jJIKCEBEDPO_ = other.jJIKCEBEDPO_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jJIKCEBEDPOBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJJIKCEBEDPOFieldBuilder() : null;
          } else {
            jJIKCEBEDPOBuilder_.addAllMessages(other.jJIKCEBEDPO_);
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
      io.grasscutter.net.proto.activity.LANFEMMHKNB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.LANFEMMHKNB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.JILMFEILIGG> jJIKCEBEDPO_ =
      java.util.Collections.emptyList();
    private void ensureJJIKCEBEDPOIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jJIKCEBEDPO_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.JILMFEILIGG>(jJIKCEBEDPO_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.JILMFEILIGG, io.grasscutter.net.proto.activity.JILMFEILIGG.Builder, io.grasscutter.net.proto.activity.JILMFEILIGGOrBuilder> jJIKCEBEDPOBuilder_;

    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.JILMFEILIGG> getJJIKCEBEDPOList() {
      if (jJIKCEBEDPOBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jJIKCEBEDPO_);
      } else {
        return jJIKCEBEDPOBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public int getJJIKCEBEDPOCount() {
      if (jJIKCEBEDPOBuilder_ == null) {
        return jJIKCEBEDPO_.size();
      } else {
        return jJIKCEBEDPOBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public io.grasscutter.net.proto.activity.JILMFEILIGG getJJIKCEBEDPO(int index) {
      if (jJIKCEBEDPOBuilder_ == null) {
        return jJIKCEBEDPO_.get(index);
      } else {
        return jJIKCEBEDPOBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder setJJIKCEBEDPO(
        int index, io.grasscutter.net.proto.activity.JILMFEILIGG value) {
      if (jJIKCEBEDPOBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJJIKCEBEDPOIsMutable();
        jJIKCEBEDPO_.set(index, value);
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder setJJIKCEBEDPO(
        int index, io.grasscutter.net.proto.activity.JILMFEILIGG.Builder builderForValue) {
      if (jJIKCEBEDPOBuilder_ == null) {
        ensureJJIKCEBEDPOIsMutable();
        jJIKCEBEDPO_.set(index, builderForValue.build());
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder addJJIKCEBEDPO(io.grasscutter.net.proto.activity.JILMFEILIGG value) {
      if (jJIKCEBEDPOBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJJIKCEBEDPOIsMutable();
        jJIKCEBEDPO_.add(value);
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder addJJIKCEBEDPO(
        int index, io.grasscutter.net.proto.activity.JILMFEILIGG value) {
      if (jJIKCEBEDPOBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJJIKCEBEDPOIsMutable();
        jJIKCEBEDPO_.add(index, value);
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder addJJIKCEBEDPO(
        io.grasscutter.net.proto.activity.JILMFEILIGG.Builder builderForValue) {
      if (jJIKCEBEDPOBuilder_ == null) {
        ensureJJIKCEBEDPOIsMutable();
        jJIKCEBEDPO_.add(builderForValue.build());
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder addJJIKCEBEDPO(
        int index, io.grasscutter.net.proto.activity.JILMFEILIGG.Builder builderForValue) {
      if (jJIKCEBEDPOBuilder_ == null) {
        ensureJJIKCEBEDPOIsMutable();
        jJIKCEBEDPO_.add(index, builderForValue.build());
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder addAllJJIKCEBEDPO(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.JILMFEILIGG> values) {
      if (jJIKCEBEDPOBuilder_ == null) {
        ensureJJIKCEBEDPOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jJIKCEBEDPO_);
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder clearJJIKCEBEDPO() {
      if (jJIKCEBEDPOBuilder_ == null) {
        jJIKCEBEDPO_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public Builder removeJJIKCEBEDPO(int index) {
      if (jJIKCEBEDPOBuilder_ == null) {
        ensureJJIKCEBEDPOIsMutable();
        jJIKCEBEDPO_.remove(index);
        onChanged();
      } else {
        jJIKCEBEDPOBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public io.grasscutter.net.proto.activity.JILMFEILIGG.Builder getJJIKCEBEDPOBuilder(
        int index) {
      return getJJIKCEBEDPOFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public io.grasscutter.net.proto.activity.JILMFEILIGGOrBuilder getJJIKCEBEDPOOrBuilder(
        int index) {
      if (jJIKCEBEDPOBuilder_ == null) {
        return jJIKCEBEDPO_.get(index);  } else {
        return jJIKCEBEDPOBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.JILMFEILIGGOrBuilder> 
         getJJIKCEBEDPOOrBuilderList() {
      if (jJIKCEBEDPOBuilder_ != null) {
        return jJIKCEBEDPOBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jJIKCEBEDPO_);
      }
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public io.grasscutter.net.proto.activity.JILMFEILIGG.Builder addJJIKCEBEDPOBuilder() {
      return getJJIKCEBEDPOFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.JILMFEILIGG.getDefaultInstance());
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public io.grasscutter.net.proto.activity.JILMFEILIGG.Builder addJJIKCEBEDPOBuilder(
        int index) {
      return getJJIKCEBEDPOFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.JILMFEILIGG.getDefaultInstance());
    }
    /**
     * <code>repeated .JILMFEILIGG JJIKCEBEDPO = 3;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.JILMFEILIGG.Builder> 
         getJJIKCEBEDPOBuilderList() {
      return getJJIKCEBEDPOFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.JILMFEILIGG, io.grasscutter.net.proto.activity.JILMFEILIGG.Builder, io.grasscutter.net.proto.activity.JILMFEILIGGOrBuilder> 
        getJJIKCEBEDPOFieldBuilder() {
      if (jJIKCEBEDPOBuilder_ == null) {
        jJIKCEBEDPOBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.JILMFEILIGG, io.grasscutter.net.proto.activity.JILMFEILIGG.Builder, io.grasscutter.net.proto.activity.JILMFEILIGGOrBuilder>(
                jJIKCEBEDPO_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        jJIKCEBEDPO_ = null;
      }
      return jJIKCEBEDPOBuilder_;
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


    // @@protoc_insertion_point(builder_scope:LANFEMMHKNB)
  }

  // @@protoc_insertion_point(class_scope:LANFEMMHKNB)
  private static final io.grasscutter.net.proto.activity.LANFEMMHKNB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.LANFEMMHKNB();
  }

  public static io.grasscutter.net.proto.activity.LANFEMMHKNB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LANFEMMHKNB>
      PARSER = new com.google.protobuf.AbstractParser<LANFEMMHKNB>() {
    @java.lang.Override
    public LANFEMMHKNB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LANFEMMHKNB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LANFEMMHKNB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LANFEMMHKNB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.LANFEMMHKNB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

