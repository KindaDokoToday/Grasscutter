// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code PDMEMBBFLGB}
 */
public final class PDMEMBBFLGB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PDMEMBBFLGB)
    PDMEMBBFLGBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PDMEMBBFLGB.newBuilder() to construct.
  private PDMEMBBFLGB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PDMEMBBFLGB() {
    hKECPNIKBIF_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PDMEMBBFLGB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PDMEMBBFLGB(
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
          case 8: {

            levelId_ = input.readUInt32();
            break;
          }
          case 56: {

            isOpen_ = input.readBool();
            break;
          }
          case 88: {

            bestScore_ = input.readUInt32();
            break;
          }
          case 114: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              hKECPNIKBIF_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.DJFNBCGCGCP>();
              mutable_bitField0_ |= 0x00000001;
            }
            hKECPNIKBIF_.add(
                input.readMessage(io.grasscutter.net.proto.activity.DJFNBCGCGCP.parser(), extensionRegistry));
            break;
          }
          case 120: {

            isFinish_ = input.readBool();
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
        hKECPNIKBIF_ = java.util.Collections.unmodifiableList(hKECPNIKBIF_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_PDMEMBBFLGB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_PDMEMBBFLGB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.PDMEMBBFLGB.class, io.grasscutter.net.proto.activity.PDMEMBBFLGB.Builder.class);
  }

  public static final int HKECPNIKBIF_FIELD_NUMBER = 14;
  private java.util.List<io.grasscutter.net.proto.activity.DJFNBCGCGCP> hKECPNIKBIF_;
  /**
   * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.DJFNBCGCGCP> getHKECPNIKBIFList() {
    return hKECPNIKBIF_;
  }
  /**
   * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.DJFNBCGCGCPOrBuilder> 
      getHKECPNIKBIFOrBuilderList() {
    return hKECPNIKBIF_;
  }
  /**
   * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
   */
  @java.lang.Override
  public int getHKECPNIKBIFCount() {
    return hKECPNIKBIF_.size();
  }
  /**
   * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.DJFNBCGCGCP getHKECPNIKBIF(int index) {
    return hKECPNIKBIF_.get(index);
  }
  /**
   * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.DJFNBCGCGCPOrBuilder getHKECPNIKBIFOrBuilder(
      int index) {
    return hKECPNIKBIF_.get(index);
  }

  public static final int IS_FINISH_FIELD_NUMBER = 15;
  private boolean isFinish_;
  /**
   * <code>bool is_finish = 15;</code>
   * @return The isFinish.
   */
  @java.lang.Override
  public boolean getIsFinish() {
    return isFinish_;
  }

  public static final int IS_OPEN_FIELD_NUMBER = 7;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 7;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int LEVEL_ID_FIELD_NUMBER = 1;
  private int levelId_;
  /**
   * <code>uint32 level_id = 1;</code>
   * @return The levelId.
   */
  @java.lang.Override
  public int getLevelId() {
    return levelId_;
  }

  public static final int BEST_SCORE_FIELD_NUMBER = 11;
  private int bestScore_;
  /**
   * <code>uint32 best_score = 11;</code>
   * @return The bestScore.
   */
  @java.lang.Override
  public int getBestScore() {
    return bestScore_;
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
    if (levelId_ != 0) {
      output.writeUInt32(1, levelId_);
    }
    if (isOpen_ != false) {
      output.writeBool(7, isOpen_);
    }
    if (bestScore_ != 0) {
      output.writeUInt32(11, bestScore_);
    }
    for (int i = 0; i < hKECPNIKBIF_.size(); i++) {
      output.writeMessage(14, hKECPNIKBIF_.get(i));
    }
    if (isFinish_ != false) {
      output.writeBool(15, isFinish_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (levelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, levelId_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isOpen_);
    }
    if (bestScore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, bestScore_);
    }
    for (int i = 0; i < hKECPNIKBIF_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(14, hKECPNIKBIF_.get(i));
    }
    if (isFinish_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(15, isFinish_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.PDMEMBBFLGB)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.PDMEMBBFLGB other = (io.grasscutter.net.proto.activity.PDMEMBBFLGB) obj;

    if (!getHKECPNIKBIFList()
        .equals(other.getHKECPNIKBIFList())) return false;
    if (getIsFinish()
        != other.getIsFinish()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getLevelId()
        != other.getLevelId()) return false;
    if (getBestScore()
        != other.getBestScore()) return false;
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
    if (getHKECPNIKBIFCount() > 0) {
      hash = (37 * hash) + HKECPNIKBIF_FIELD_NUMBER;
      hash = (53 * hash) + getHKECPNIKBIFList().hashCode();
    }
    hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFinish());
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLevelId();
    hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + getBestScore();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.PDMEMBBFLGB prototype) {
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
   * Protobuf type {@code PDMEMBBFLGB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PDMEMBBFLGB)
      io.grasscutter.net.proto.activity.PDMEMBBFLGBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_PDMEMBBFLGB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_PDMEMBBFLGB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.PDMEMBBFLGB.class, io.grasscutter.net.proto.activity.PDMEMBBFLGB.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.PDMEMBBFLGB.newBuilder()
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
        getHKECPNIKBIFFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (hKECPNIKBIFBuilder_ == null) {
        hKECPNIKBIF_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hKECPNIKBIFBuilder_.clear();
      }
      isFinish_ = false;

      isOpen_ = false;

      levelId_ = 0;

      bestScore_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_PDMEMBBFLGB_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.PDMEMBBFLGB getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.PDMEMBBFLGB.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.PDMEMBBFLGB build() {
      io.grasscutter.net.proto.activity.PDMEMBBFLGB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.PDMEMBBFLGB buildPartial() {
      io.grasscutter.net.proto.activity.PDMEMBBFLGB result = new io.grasscutter.net.proto.activity.PDMEMBBFLGB(this);
      int from_bitField0_ = bitField0_;
      if (hKECPNIKBIFBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hKECPNIKBIF_ = java.util.Collections.unmodifiableList(hKECPNIKBIF_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hKECPNIKBIF_ = hKECPNIKBIF_;
      } else {
        result.hKECPNIKBIF_ = hKECPNIKBIFBuilder_.build();
      }
      result.isFinish_ = isFinish_;
      result.isOpen_ = isOpen_;
      result.levelId_ = levelId_;
      result.bestScore_ = bestScore_;
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
      if (other instanceof io.grasscutter.net.proto.activity.PDMEMBBFLGB) {
        return mergeFrom((io.grasscutter.net.proto.activity.PDMEMBBFLGB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.PDMEMBBFLGB other) {
      if (other == io.grasscutter.net.proto.activity.PDMEMBBFLGB.getDefaultInstance()) return this;
      if (hKECPNIKBIFBuilder_ == null) {
        if (!other.hKECPNIKBIF_.isEmpty()) {
          if (hKECPNIKBIF_.isEmpty()) {
            hKECPNIKBIF_ = other.hKECPNIKBIF_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHKECPNIKBIFIsMutable();
            hKECPNIKBIF_.addAll(other.hKECPNIKBIF_);
          }
          onChanged();
        }
      } else {
        if (!other.hKECPNIKBIF_.isEmpty()) {
          if (hKECPNIKBIFBuilder_.isEmpty()) {
            hKECPNIKBIFBuilder_.dispose();
            hKECPNIKBIFBuilder_ = null;
            hKECPNIKBIF_ = other.hKECPNIKBIF_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hKECPNIKBIFBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHKECPNIKBIFFieldBuilder() : null;
          } else {
            hKECPNIKBIFBuilder_.addAllMessages(other.hKECPNIKBIF_);
          }
        }
      }
      if (other.getIsFinish() != false) {
        setIsFinish(other.getIsFinish());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getLevelId() != 0) {
        setLevelId(other.getLevelId());
      }
      if (other.getBestScore() != 0) {
        setBestScore(other.getBestScore());
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
      io.grasscutter.net.proto.activity.PDMEMBBFLGB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.PDMEMBBFLGB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.DJFNBCGCGCP> hKECPNIKBIF_ =
      java.util.Collections.emptyList();
    private void ensureHKECPNIKBIFIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hKECPNIKBIF_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.DJFNBCGCGCP>(hKECPNIKBIF_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.DJFNBCGCGCP, io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder, io.grasscutter.net.proto.activity.DJFNBCGCGCPOrBuilder> hKECPNIKBIFBuilder_;

    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.DJFNBCGCGCP> getHKECPNIKBIFList() {
      if (hKECPNIKBIFBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hKECPNIKBIF_);
      } else {
        return hKECPNIKBIFBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public int getHKECPNIKBIFCount() {
      if (hKECPNIKBIFBuilder_ == null) {
        return hKECPNIKBIF_.size();
      } else {
        return hKECPNIKBIFBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public io.grasscutter.net.proto.activity.DJFNBCGCGCP getHKECPNIKBIF(int index) {
      if (hKECPNIKBIFBuilder_ == null) {
        return hKECPNIKBIF_.get(index);
      } else {
        return hKECPNIKBIFBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder setHKECPNIKBIF(
        int index, io.grasscutter.net.proto.activity.DJFNBCGCGCP value) {
      if (hKECPNIKBIFBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHKECPNIKBIFIsMutable();
        hKECPNIKBIF_.set(index, value);
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder setHKECPNIKBIF(
        int index, io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder builderForValue) {
      if (hKECPNIKBIFBuilder_ == null) {
        ensureHKECPNIKBIFIsMutable();
        hKECPNIKBIF_.set(index, builderForValue.build());
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder addHKECPNIKBIF(io.grasscutter.net.proto.activity.DJFNBCGCGCP value) {
      if (hKECPNIKBIFBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHKECPNIKBIFIsMutable();
        hKECPNIKBIF_.add(value);
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder addHKECPNIKBIF(
        int index, io.grasscutter.net.proto.activity.DJFNBCGCGCP value) {
      if (hKECPNIKBIFBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHKECPNIKBIFIsMutable();
        hKECPNIKBIF_.add(index, value);
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder addHKECPNIKBIF(
        io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder builderForValue) {
      if (hKECPNIKBIFBuilder_ == null) {
        ensureHKECPNIKBIFIsMutable();
        hKECPNIKBIF_.add(builderForValue.build());
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder addHKECPNIKBIF(
        int index, io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder builderForValue) {
      if (hKECPNIKBIFBuilder_ == null) {
        ensureHKECPNIKBIFIsMutable();
        hKECPNIKBIF_.add(index, builderForValue.build());
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder addAllHKECPNIKBIF(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.DJFNBCGCGCP> values) {
      if (hKECPNIKBIFBuilder_ == null) {
        ensureHKECPNIKBIFIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hKECPNIKBIF_);
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder clearHKECPNIKBIF() {
      if (hKECPNIKBIFBuilder_ == null) {
        hKECPNIKBIF_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public Builder removeHKECPNIKBIF(int index) {
      if (hKECPNIKBIFBuilder_ == null) {
        ensureHKECPNIKBIFIsMutable();
        hKECPNIKBIF_.remove(index);
        onChanged();
      } else {
        hKECPNIKBIFBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder getHKECPNIKBIFBuilder(
        int index) {
      return getHKECPNIKBIFFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public io.grasscutter.net.proto.activity.DJFNBCGCGCPOrBuilder getHKECPNIKBIFOrBuilder(
        int index) {
      if (hKECPNIKBIFBuilder_ == null) {
        return hKECPNIKBIF_.get(index);  } else {
        return hKECPNIKBIFBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.DJFNBCGCGCPOrBuilder> 
         getHKECPNIKBIFOrBuilderList() {
      if (hKECPNIKBIFBuilder_ != null) {
        return hKECPNIKBIFBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hKECPNIKBIF_);
      }
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder addHKECPNIKBIFBuilder() {
      return getHKECPNIKBIFFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.DJFNBCGCGCP.getDefaultInstance());
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder addHKECPNIKBIFBuilder(
        int index) {
      return getHKECPNIKBIFFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.DJFNBCGCGCP.getDefaultInstance());
    }
    /**
     * <code>repeated .DJFNBCGCGCP HKECPNIKBIF = 14;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder> 
         getHKECPNIKBIFBuilderList() {
      return getHKECPNIKBIFFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.DJFNBCGCGCP, io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder, io.grasscutter.net.proto.activity.DJFNBCGCGCPOrBuilder> 
        getHKECPNIKBIFFieldBuilder() {
      if (hKECPNIKBIFBuilder_ == null) {
        hKECPNIKBIFBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.DJFNBCGCGCP, io.grasscutter.net.proto.activity.DJFNBCGCGCP.Builder, io.grasscutter.net.proto.activity.DJFNBCGCGCPOrBuilder>(
                hKECPNIKBIF_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hKECPNIKBIF_ = null;
      }
      return hKECPNIKBIFBuilder_;
    }

    private boolean isFinish_ ;
    /**
     * <code>bool is_finish = 15;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }
    /**
     * <code>bool is_finish = 15;</code>
     * @param value The isFinish to set.
     * @return This builder for chaining.
     */
    public Builder setIsFinish(boolean value) {
      
      isFinish_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_finish = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFinish() {
      
      isFinish_ = false;
      onChanged();
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 7;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 7;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private int levelId_ ;
    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }
    /**
     * <code>uint32 level_id = 1;</code>
     * @param value The levelId to set.
     * @return This builder for chaining.
     */
    public Builder setLevelId(int value) {
      
      levelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 level_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevelId() {
      
      levelId_ = 0;
      onChanged();
      return this;
    }

    private int bestScore_ ;
    /**
     * <code>uint32 best_score = 11;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }
    /**
     * <code>uint32 best_score = 11;</code>
     * @param value The bestScore to set.
     * @return This builder for chaining.
     */
    public Builder setBestScore(int value) {
      
      bestScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 best_score = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearBestScore() {
      
      bestScore_ = 0;
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


    // @@protoc_insertion_point(builder_scope:PDMEMBBFLGB)
  }

  // @@protoc_insertion_point(class_scope:PDMEMBBFLGB)
  private static final io.grasscutter.net.proto.activity.PDMEMBBFLGB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.PDMEMBBFLGB();
  }

  public static io.grasscutter.net.proto.activity.PDMEMBBFLGB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PDMEMBBFLGB>
      PARSER = new com.google.protobuf.AbstractParser<PDMEMBBFLGB>() {
    @java.lang.Override
    public PDMEMBBFLGB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PDMEMBBFLGB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PDMEMBBFLGB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PDMEMBBFLGB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.PDMEMBBFLGB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

