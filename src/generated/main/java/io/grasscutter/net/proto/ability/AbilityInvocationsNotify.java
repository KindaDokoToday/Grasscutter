// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ability.proto

package io.grasscutter.net.proto.ability;

/**
 * <pre>
 * CmdId: 7193
 * </pre>
 *
 * Protobuf type {@code AbilityInvocationsNotify}
 */
public final class AbilityInvocationsNotify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AbilityInvocationsNotify)
    AbilityInvocationsNotifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AbilityInvocationsNotify.newBuilder() to construct.
  private AbilityInvocationsNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbilityInvocationsNotify() {
    jJBLBLMDPHC_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AbilityInvocationsNotify();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AbilityInvocationsNotify(
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
          case 74: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jJBLBLMDPHC_ = new java.util.ArrayList<io.grasscutter.net.proto.ability.AbilityInvokeEntry>();
              mutable_bitField0_ |= 0x00000001;
            }
            jJBLBLMDPHC_.add(
                input.readMessage(io.grasscutter.net.proto.ability.AbilityInvokeEntry.parser(), extensionRegistry));
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
        jJBLBLMDPHC_ = java.util.Collections.unmodifiableList(jJBLBLMDPHC_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityInvocationsNotify_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityInvocationsNotify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.ability.AbilityInvocationsNotify.class, io.grasscutter.net.proto.ability.AbilityInvocationsNotify.Builder.class);
  }

  public static final int JJBLBLMDPHC_FIELD_NUMBER = 9;
  private java.util.List<io.grasscutter.net.proto.ability.AbilityInvokeEntry> jJBLBLMDPHC_;
  /**
   * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.ability.AbilityInvokeEntry> getJJBLBLMDPHCList() {
    return jJBLBLMDPHC_;
  }
  /**
   * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.ability.AbilityInvokeEntryOrBuilder> 
      getJJBLBLMDPHCOrBuilderList() {
    return jJBLBLMDPHC_;
  }
  /**
   * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
   */
  @java.lang.Override
  public int getJJBLBLMDPHCCount() {
    return jJBLBLMDPHC_.size();
  }
  /**
   * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.ability.AbilityInvokeEntry getJJBLBLMDPHC(int index) {
    return jJBLBLMDPHC_.get(index);
  }
  /**
   * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.ability.AbilityInvokeEntryOrBuilder getJJBLBLMDPHCOrBuilder(
      int index) {
    return jJBLBLMDPHC_.get(index);
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
    for (int i = 0; i < jJBLBLMDPHC_.size(); i++) {
      output.writeMessage(9, jJBLBLMDPHC_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jJBLBLMDPHC_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, jJBLBLMDPHC_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.ability.AbilityInvocationsNotify)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.ability.AbilityInvocationsNotify other = (io.grasscutter.net.proto.ability.AbilityInvocationsNotify) obj;

    if (!getJJBLBLMDPHCList()
        .equals(other.getJJBLBLMDPHCList())) return false;
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
    if (getJJBLBLMDPHCCount() > 0) {
      hash = (37 * hash) + JJBLBLMDPHC_FIELD_NUMBER;
      hash = (53 * hash) + getJJBLBLMDPHCList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.ability.AbilityInvocationsNotify prototype) {
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
   * CmdId: 7193
   * </pre>
   *
   * Protobuf type {@code AbilityInvocationsNotify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AbilityInvocationsNotify)
      io.grasscutter.net.proto.ability.AbilityInvocationsNotifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityInvocationsNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityInvocationsNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.ability.AbilityInvocationsNotify.class, io.grasscutter.net.proto.ability.AbilityInvocationsNotify.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.ability.AbilityInvocationsNotify.newBuilder()
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
        getJJBLBLMDPHCFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jJBLBLMDPHCBuilder_ == null) {
        jJBLBLMDPHC_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jJBLBLMDPHCBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityInvocationsNotify_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.ability.AbilityInvocationsNotify getDefaultInstanceForType() {
      return io.grasscutter.net.proto.ability.AbilityInvocationsNotify.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.ability.AbilityInvocationsNotify build() {
      io.grasscutter.net.proto.ability.AbilityInvocationsNotify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.ability.AbilityInvocationsNotify buildPartial() {
      io.grasscutter.net.proto.ability.AbilityInvocationsNotify result = new io.grasscutter.net.proto.ability.AbilityInvocationsNotify(this);
      int from_bitField0_ = bitField0_;
      if (jJBLBLMDPHCBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jJBLBLMDPHC_ = java.util.Collections.unmodifiableList(jJBLBLMDPHC_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jJBLBLMDPHC_ = jJBLBLMDPHC_;
      } else {
        result.jJBLBLMDPHC_ = jJBLBLMDPHCBuilder_.build();
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
      if (other instanceof io.grasscutter.net.proto.ability.AbilityInvocationsNotify) {
        return mergeFrom((io.grasscutter.net.proto.ability.AbilityInvocationsNotify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.ability.AbilityInvocationsNotify other) {
      if (other == io.grasscutter.net.proto.ability.AbilityInvocationsNotify.getDefaultInstance()) return this;
      if (jJBLBLMDPHCBuilder_ == null) {
        if (!other.jJBLBLMDPHC_.isEmpty()) {
          if (jJBLBLMDPHC_.isEmpty()) {
            jJBLBLMDPHC_ = other.jJBLBLMDPHC_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJJBLBLMDPHCIsMutable();
            jJBLBLMDPHC_.addAll(other.jJBLBLMDPHC_);
          }
          onChanged();
        }
      } else {
        if (!other.jJBLBLMDPHC_.isEmpty()) {
          if (jJBLBLMDPHCBuilder_.isEmpty()) {
            jJBLBLMDPHCBuilder_.dispose();
            jJBLBLMDPHCBuilder_ = null;
            jJBLBLMDPHC_ = other.jJBLBLMDPHC_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jJBLBLMDPHCBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJJBLBLMDPHCFieldBuilder() : null;
          } else {
            jJBLBLMDPHCBuilder_.addAllMessages(other.jJBLBLMDPHC_);
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
      io.grasscutter.net.proto.ability.AbilityInvocationsNotify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.ability.AbilityInvocationsNotify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.ability.AbilityInvokeEntry> jJBLBLMDPHC_ =
      java.util.Collections.emptyList();
    private void ensureJJBLBLMDPHCIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jJBLBLMDPHC_ = new java.util.ArrayList<io.grasscutter.net.proto.ability.AbilityInvokeEntry>(jJBLBLMDPHC_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.ability.AbilityInvokeEntry, io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder, io.grasscutter.net.proto.ability.AbilityInvokeEntryOrBuilder> jJBLBLMDPHCBuilder_;

    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public java.util.List<io.grasscutter.net.proto.ability.AbilityInvokeEntry> getJJBLBLMDPHCList() {
      if (jJBLBLMDPHCBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jJBLBLMDPHC_);
      } else {
        return jJBLBLMDPHCBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public int getJJBLBLMDPHCCount() {
      if (jJBLBLMDPHCBuilder_ == null) {
        return jJBLBLMDPHC_.size();
      } else {
        return jJBLBLMDPHCBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public io.grasscutter.net.proto.ability.AbilityInvokeEntry getJJBLBLMDPHC(int index) {
      if (jJBLBLMDPHCBuilder_ == null) {
        return jJBLBLMDPHC_.get(index);
      } else {
        return jJBLBLMDPHCBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder setJJBLBLMDPHC(
        int index, io.grasscutter.net.proto.ability.AbilityInvokeEntry value) {
      if (jJBLBLMDPHCBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJJBLBLMDPHCIsMutable();
        jJBLBLMDPHC_.set(index, value);
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder setJJBLBLMDPHC(
        int index, io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder builderForValue) {
      if (jJBLBLMDPHCBuilder_ == null) {
        ensureJJBLBLMDPHCIsMutable();
        jJBLBLMDPHC_.set(index, builderForValue.build());
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder addJJBLBLMDPHC(io.grasscutter.net.proto.ability.AbilityInvokeEntry value) {
      if (jJBLBLMDPHCBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJJBLBLMDPHCIsMutable();
        jJBLBLMDPHC_.add(value);
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder addJJBLBLMDPHC(
        int index, io.grasscutter.net.proto.ability.AbilityInvokeEntry value) {
      if (jJBLBLMDPHCBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJJBLBLMDPHCIsMutable();
        jJBLBLMDPHC_.add(index, value);
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder addJJBLBLMDPHC(
        io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder builderForValue) {
      if (jJBLBLMDPHCBuilder_ == null) {
        ensureJJBLBLMDPHCIsMutable();
        jJBLBLMDPHC_.add(builderForValue.build());
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder addJJBLBLMDPHC(
        int index, io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder builderForValue) {
      if (jJBLBLMDPHCBuilder_ == null) {
        ensureJJBLBLMDPHCIsMutable();
        jJBLBLMDPHC_.add(index, builderForValue.build());
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder addAllJJBLBLMDPHC(
        java.lang.Iterable<? extends io.grasscutter.net.proto.ability.AbilityInvokeEntry> values) {
      if (jJBLBLMDPHCBuilder_ == null) {
        ensureJJBLBLMDPHCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jJBLBLMDPHC_);
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder clearJJBLBLMDPHC() {
      if (jJBLBLMDPHCBuilder_ == null) {
        jJBLBLMDPHC_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public Builder removeJJBLBLMDPHC(int index) {
      if (jJBLBLMDPHCBuilder_ == null) {
        ensureJJBLBLMDPHCIsMutable();
        jJBLBLMDPHC_.remove(index);
        onChanged();
      } else {
        jJBLBLMDPHCBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder getJJBLBLMDPHCBuilder(
        int index) {
      return getJJBLBLMDPHCFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public io.grasscutter.net.proto.ability.AbilityInvokeEntryOrBuilder getJJBLBLMDPHCOrBuilder(
        int index) {
      if (jJBLBLMDPHCBuilder_ == null) {
        return jJBLBLMDPHC_.get(index);  } else {
        return jJBLBLMDPHCBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.ability.AbilityInvokeEntryOrBuilder> 
         getJJBLBLMDPHCOrBuilderList() {
      if (jJBLBLMDPHCBuilder_ != null) {
        return jJBLBLMDPHCBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jJBLBLMDPHC_);
      }
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder addJJBLBLMDPHCBuilder() {
      return getJJBLBLMDPHCFieldBuilder().addBuilder(
          io.grasscutter.net.proto.ability.AbilityInvokeEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder addJJBLBLMDPHCBuilder(
        int index) {
      return getJJBLBLMDPHCFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.ability.AbilityInvokeEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .AbilityInvokeEntry JJBLBLMDPHC = 9;</code>
     */
    public java.util.List<io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder> 
         getJJBLBLMDPHCBuilderList() {
      return getJJBLBLMDPHCFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.ability.AbilityInvokeEntry, io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder, io.grasscutter.net.proto.ability.AbilityInvokeEntryOrBuilder> 
        getJJBLBLMDPHCFieldBuilder() {
      if (jJBLBLMDPHCBuilder_ == null) {
        jJBLBLMDPHCBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.ability.AbilityInvokeEntry, io.grasscutter.net.proto.ability.AbilityInvokeEntry.Builder, io.grasscutter.net.proto.ability.AbilityInvokeEntryOrBuilder>(
                jJBLBLMDPHC_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        jJBLBLMDPHC_ = null;
      }
      return jJBLBLMDPHCBuilder_;
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


    // @@protoc_insertion_point(builder_scope:AbilityInvocationsNotify)
  }

  // @@protoc_insertion_point(class_scope:AbilityInvocationsNotify)
  private static final io.grasscutter.net.proto.ability.AbilityInvocationsNotify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.ability.AbilityInvocationsNotify();
  }

  public static io.grasscutter.net.proto.ability.AbilityInvocationsNotify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbilityInvocationsNotify>
      PARSER = new com.google.protobuf.AbstractParser<AbilityInvocationsNotify>() {
    @java.lang.Override
    public AbilityInvocationsNotify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AbilityInvocationsNotify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbilityInvocationsNotify> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbilityInvocationsNotify> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.ability.AbilityInvocationsNotify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

