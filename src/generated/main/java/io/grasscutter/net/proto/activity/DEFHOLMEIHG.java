// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code DEFHOLMEIHG}
 */
public final class DEFHOLMEIHG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DEFHOLMEIHG)
    DEFHOLMEIHGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DEFHOLMEIHG.newBuilder() to construct.
  private DEFHOLMEIHG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DEFHOLMEIHG() {
    mEOEGODMPFF_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DEFHOLMEIHG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DEFHOLMEIHG(
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
              mEOEGODMPFF_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.OOIMBBPDCMM>();
              mutable_bitField0_ |= 0x00000001;
            }
            mEOEGODMPFF_.add(
                input.readMessage(io.grasscutter.net.proto.activity.OOIMBBPDCMM.parser(), extensionRegistry));
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
        mEOEGODMPFF_ = java.util.Collections.unmodifiableList(mEOEGODMPFF_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_DEFHOLMEIHG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_DEFHOLMEIHG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.DEFHOLMEIHG.class, io.grasscutter.net.proto.activity.DEFHOLMEIHG.Builder.class);
  }

  public static final int MEOEGODMPFF_FIELD_NUMBER = 3;
  private java.util.List<io.grasscutter.net.proto.activity.OOIMBBPDCMM> mEOEGODMPFF_;
  /**
   * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.OOIMBBPDCMM> getMEOEGODMPFFList() {
    return mEOEGODMPFF_;
  }
  /**
   * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.OOIMBBPDCMMOrBuilder> 
      getMEOEGODMPFFOrBuilderList() {
    return mEOEGODMPFF_;
  }
  /**
   * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
   */
  @java.lang.Override
  public int getMEOEGODMPFFCount() {
    return mEOEGODMPFF_.size();
  }
  /**
   * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.OOIMBBPDCMM getMEOEGODMPFF(int index) {
    return mEOEGODMPFF_.get(index);
  }
  /**
   * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.OOIMBBPDCMMOrBuilder getMEOEGODMPFFOrBuilder(
      int index) {
    return mEOEGODMPFF_.get(index);
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
    for (int i = 0; i < mEOEGODMPFF_.size(); i++) {
      output.writeMessage(3, mEOEGODMPFF_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mEOEGODMPFF_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, mEOEGODMPFF_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.DEFHOLMEIHG)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.DEFHOLMEIHG other = (io.grasscutter.net.proto.activity.DEFHOLMEIHG) obj;

    if (!getMEOEGODMPFFList()
        .equals(other.getMEOEGODMPFFList())) return false;
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
    if (getMEOEGODMPFFCount() > 0) {
      hash = (37 * hash) + MEOEGODMPFF_FIELD_NUMBER;
      hash = (53 * hash) + getMEOEGODMPFFList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.DEFHOLMEIHG prototype) {
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
   * Protobuf type {@code DEFHOLMEIHG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DEFHOLMEIHG)
      io.grasscutter.net.proto.activity.DEFHOLMEIHGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DEFHOLMEIHG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DEFHOLMEIHG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.DEFHOLMEIHG.class, io.grasscutter.net.proto.activity.DEFHOLMEIHG.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.DEFHOLMEIHG.newBuilder()
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
        getMEOEGODMPFFFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mEOEGODMPFFBuilder_ == null) {
        mEOEGODMPFF_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mEOEGODMPFFBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DEFHOLMEIHG_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DEFHOLMEIHG getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.DEFHOLMEIHG.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DEFHOLMEIHG build() {
      io.grasscutter.net.proto.activity.DEFHOLMEIHG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DEFHOLMEIHG buildPartial() {
      io.grasscutter.net.proto.activity.DEFHOLMEIHG result = new io.grasscutter.net.proto.activity.DEFHOLMEIHG(this);
      int from_bitField0_ = bitField0_;
      if (mEOEGODMPFFBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mEOEGODMPFF_ = java.util.Collections.unmodifiableList(mEOEGODMPFF_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mEOEGODMPFF_ = mEOEGODMPFF_;
      } else {
        result.mEOEGODMPFF_ = mEOEGODMPFFBuilder_.build();
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
      if (other instanceof io.grasscutter.net.proto.activity.DEFHOLMEIHG) {
        return mergeFrom((io.grasscutter.net.proto.activity.DEFHOLMEIHG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.DEFHOLMEIHG other) {
      if (other == io.grasscutter.net.proto.activity.DEFHOLMEIHG.getDefaultInstance()) return this;
      if (mEOEGODMPFFBuilder_ == null) {
        if (!other.mEOEGODMPFF_.isEmpty()) {
          if (mEOEGODMPFF_.isEmpty()) {
            mEOEGODMPFF_ = other.mEOEGODMPFF_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMEOEGODMPFFIsMutable();
            mEOEGODMPFF_.addAll(other.mEOEGODMPFF_);
          }
          onChanged();
        }
      } else {
        if (!other.mEOEGODMPFF_.isEmpty()) {
          if (mEOEGODMPFFBuilder_.isEmpty()) {
            mEOEGODMPFFBuilder_.dispose();
            mEOEGODMPFFBuilder_ = null;
            mEOEGODMPFF_ = other.mEOEGODMPFF_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mEOEGODMPFFBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMEOEGODMPFFFieldBuilder() : null;
          } else {
            mEOEGODMPFFBuilder_.addAllMessages(other.mEOEGODMPFF_);
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
      io.grasscutter.net.proto.activity.DEFHOLMEIHG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.DEFHOLMEIHG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.OOIMBBPDCMM> mEOEGODMPFF_ =
      java.util.Collections.emptyList();
    private void ensureMEOEGODMPFFIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mEOEGODMPFF_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.OOIMBBPDCMM>(mEOEGODMPFF_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.OOIMBBPDCMM, io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder, io.grasscutter.net.proto.activity.OOIMBBPDCMMOrBuilder> mEOEGODMPFFBuilder_;

    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.OOIMBBPDCMM> getMEOEGODMPFFList() {
      if (mEOEGODMPFFBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mEOEGODMPFF_);
      } else {
        return mEOEGODMPFFBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public int getMEOEGODMPFFCount() {
      if (mEOEGODMPFFBuilder_ == null) {
        return mEOEGODMPFF_.size();
      } else {
        return mEOEGODMPFFBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public io.grasscutter.net.proto.activity.OOIMBBPDCMM getMEOEGODMPFF(int index) {
      if (mEOEGODMPFFBuilder_ == null) {
        return mEOEGODMPFF_.get(index);
      } else {
        return mEOEGODMPFFBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder setMEOEGODMPFF(
        int index, io.grasscutter.net.proto.activity.OOIMBBPDCMM value) {
      if (mEOEGODMPFFBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMEOEGODMPFFIsMutable();
        mEOEGODMPFF_.set(index, value);
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder setMEOEGODMPFF(
        int index, io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder builderForValue) {
      if (mEOEGODMPFFBuilder_ == null) {
        ensureMEOEGODMPFFIsMutable();
        mEOEGODMPFF_.set(index, builderForValue.build());
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder addMEOEGODMPFF(io.grasscutter.net.proto.activity.OOIMBBPDCMM value) {
      if (mEOEGODMPFFBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMEOEGODMPFFIsMutable();
        mEOEGODMPFF_.add(value);
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder addMEOEGODMPFF(
        int index, io.grasscutter.net.proto.activity.OOIMBBPDCMM value) {
      if (mEOEGODMPFFBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMEOEGODMPFFIsMutable();
        mEOEGODMPFF_.add(index, value);
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder addMEOEGODMPFF(
        io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder builderForValue) {
      if (mEOEGODMPFFBuilder_ == null) {
        ensureMEOEGODMPFFIsMutable();
        mEOEGODMPFF_.add(builderForValue.build());
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder addMEOEGODMPFF(
        int index, io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder builderForValue) {
      if (mEOEGODMPFFBuilder_ == null) {
        ensureMEOEGODMPFFIsMutable();
        mEOEGODMPFF_.add(index, builderForValue.build());
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder addAllMEOEGODMPFF(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.OOIMBBPDCMM> values) {
      if (mEOEGODMPFFBuilder_ == null) {
        ensureMEOEGODMPFFIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mEOEGODMPFF_);
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder clearMEOEGODMPFF() {
      if (mEOEGODMPFFBuilder_ == null) {
        mEOEGODMPFF_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public Builder removeMEOEGODMPFF(int index) {
      if (mEOEGODMPFFBuilder_ == null) {
        ensureMEOEGODMPFFIsMutable();
        mEOEGODMPFF_.remove(index);
        onChanged();
      } else {
        mEOEGODMPFFBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder getMEOEGODMPFFBuilder(
        int index) {
      return getMEOEGODMPFFFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public io.grasscutter.net.proto.activity.OOIMBBPDCMMOrBuilder getMEOEGODMPFFOrBuilder(
        int index) {
      if (mEOEGODMPFFBuilder_ == null) {
        return mEOEGODMPFF_.get(index);  } else {
        return mEOEGODMPFFBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.OOIMBBPDCMMOrBuilder> 
         getMEOEGODMPFFOrBuilderList() {
      if (mEOEGODMPFFBuilder_ != null) {
        return mEOEGODMPFFBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mEOEGODMPFF_);
      }
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder addMEOEGODMPFFBuilder() {
      return getMEOEGODMPFFFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.OOIMBBPDCMM.getDefaultInstance());
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder addMEOEGODMPFFBuilder(
        int index) {
      return getMEOEGODMPFFFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.OOIMBBPDCMM.getDefaultInstance());
    }
    /**
     * <code>repeated .OOIMBBPDCMM MEOEGODMPFF = 3;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder> 
         getMEOEGODMPFFBuilderList() {
      return getMEOEGODMPFFFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.OOIMBBPDCMM, io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder, io.grasscutter.net.proto.activity.OOIMBBPDCMMOrBuilder> 
        getMEOEGODMPFFFieldBuilder() {
      if (mEOEGODMPFFBuilder_ == null) {
        mEOEGODMPFFBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.OOIMBBPDCMM, io.grasscutter.net.proto.activity.OOIMBBPDCMM.Builder, io.grasscutter.net.proto.activity.OOIMBBPDCMMOrBuilder>(
                mEOEGODMPFF_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mEOEGODMPFF_ = null;
      }
      return mEOEGODMPFFBuilder_;
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


    // @@protoc_insertion_point(builder_scope:DEFHOLMEIHG)
  }

  // @@protoc_insertion_point(class_scope:DEFHOLMEIHG)
  private static final io.grasscutter.net.proto.activity.DEFHOLMEIHG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.DEFHOLMEIHG();
  }

  public static io.grasscutter.net.proto.activity.DEFHOLMEIHG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DEFHOLMEIHG>
      PARSER = new com.google.protobuf.AbstractParser<DEFHOLMEIHG>() {
    @java.lang.Override
    public DEFHOLMEIHG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DEFHOLMEIHG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DEFHOLMEIHG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DEFHOLMEIHG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.DEFHOLMEIHG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

