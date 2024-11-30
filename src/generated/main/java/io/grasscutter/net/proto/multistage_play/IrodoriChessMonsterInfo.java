// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: multistage_play.proto

package io.grasscutter.net.proto.multistage_play;

/**
 * Protobuf type {@code IrodoriChessMonsterInfo}
 */
public final class IrodoriChessMonsterInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IrodoriChessMonsterInfo)
    IrodoriChessMonsterInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IrodoriChessMonsterInfo.newBuilder() to construct.
  private IrodoriChessMonsterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IrodoriChessMonsterInfo() {
    affixList_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IrodoriChessMonsterInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IrodoriChessMonsterInfo(
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
          case 24: {

            monsterId_ = input.readUInt32();
            break;
          }
          case 40: {

            grantPoints_ = input.readUInt32();
            break;
          }
          case 96: {

            level_ = input.readUInt32();
            break;
          }
          case 112: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              affixList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            affixList_.addInt(input.readUInt32());
            break;
          }
          case 114: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              affixList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              affixList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
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
        affixList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.multistage_play.MultistagePlay.internal_static_IrodoriChessMonsterInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.multistage_play.MultistagePlay.internal_static_IrodoriChessMonsterInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo.class, io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo.Builder.class);
  }

  public static final int AFFIX_LIST_FIELD_NUMBER = 14;
  private com.google.protobuf.Internal.IntList affixList_;
  /**
   * <code>repeated uint32 affix_list = 14;</code>
   * @return A list containing the affixList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getAffixListList() {
    return affixList_;
  }
  /**
   * <code>repeated uint32 affix_list = 14;</code>
   * @return The count of affixList.
   */
  public int getAffixListCount() {
    return affixList_.size();
  }
  /**
   * <code>repeated uint32 affix_list = 14;</code>
   * @param index The index of the element to return.
   * @return The affixList at the given index.
   */
  public int getAffixList(int index) {
    return affixList_.getInt(index);
  }
  private int affixListMemoizedSerializedSize = -1;

  public static final int LEVEL_FIELD_NUMBER = 12;
  private int level_;
  /**
   * <code>uint32 level = 12;</code>
   * @return The level.
   */
  @java.lang.Override
  public int getLevel() {
    return level_;
  }

  public static final int MONSTER_ID_FIELD_NUMBER = 3;
  private int monsterId_;
  /**
   * <code>uint32 monster_id = 3;</code>
   * @return The monsterId.
   */
  @java.lang.Override
  public int getMonsterId() {
    return monsterId_;
  }

  public static final int GRANT_POINTS_FIELD_NUMBER = 5;
  private int grantPoints_;
  /**
   * <code>uint32 grant_points = 5;</code>
   * @return The grantPoints.
   */
  @java.lang.Override
  public int getGrantPoints() {
    return grantPoints_;
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
    getSerializedSize();
    if (monsterId_ != 0) {
      output.writeUInt32(3, monsterId_);
    }
    if (grantPoints_ != 0) {
      output.writeUInt32(5, grantPoints_);
    }
    if (level_ != 0) {
      output.writeUInt32(12, level_);
    }
    if (getAffixListList().size() > 0) {
      output.writeUInt32NoTag(114);
      output.writeUInt32NoTag(affixListMemoizedSerializedSize);
    }
    for (int i = 0; i < affixList_.size(); i++) {
      output.writeUInt32NoTag(affixList_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (monsterId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, monsterId_);
    }
    if (grantPoints_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, grantPoints_);
    }
    if (level_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, level_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < affixList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(affixList_.getInt(i));
      }
      size += dataSize;
      if (!getAffixListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      affixListMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo other = (io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo) obj;

    if (!getAffixListList()
        .equals(other.getAffixListList())) return false;
    if (getLevel()
        != other.getLevel()) return false;
    if (getMonsterId()
        != other.getMonsterId()) return false;
    if (getGrantPoints()
        != other.getGrantPoints()) return false;
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
    if (getAffixListCount() > 0) {
      hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getAffixListList().hashCode();
    }
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLevel();
    hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMonsterId();
    hash = (37 * hash) + GRANT_POINTS_FIELD_NUMBER;
    hash = (53 * hash) + getGrantPoints();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo prototype) {
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
   * Protobuf type {@code IrodoriChessMonsterInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IrodoriChessMonsterInfo)
      io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.multistage_play.MultistagePlay.internal_static_IrodoriChessMonsterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.multistage_play.MultistagePlay.internal_static_IrodoriChessMonsterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo.class, io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo.newBuilder()
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
      affixList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      level_ = 0;

      monsterId_ = 0;

      grantPoints_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.multistage_play.MultistagePlay.internal_static_IrodoriChessMonsterInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo build() {
      io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo buildPartial() {
      io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo result = new io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        affixList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.affixList_ = affixList_;
      result.level_ = level_;
      result.monsterId_ = monsterId_;
      result.grantPoints_ = grantPoints_;
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
      if (other instanceof io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo) {
        return mergeFrom((io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo other) {
      if (other == io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo.getDefaultInstance()) return this;
      if (!other.affixList_.isEmpty()) {
        if (affixList_.isEmpty()) {
          affixList_ = other.affixList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAffixListIsMutable();
          affixList_.addAll(other.affixList_);
        }
        onChanged();
      }
      if (other.getLevel() != 0) {
        setLevel(other.getLevel());
      }
      if (other.getMonsterId() != 0) {
        setMonsterId(other.getMonsterId());
      }
      if (other.getGrantPoints() != 0) {
        setGrantPoints(other.getGrantPoints());
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
      io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
    private void ensureAffixListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        affixList_ = mutableCopy(affixList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 affix_list = 14;</code>
     * @return A list containing the affixList.
     */
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(affixList_) : affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 14;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 14;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    /**
     * <code>repeated uint32 affix_list = 14;</code>
     * @param index The index to set the value at.
     * @param value The affixList to set.
     * @return This builder for chaining.
     */
    public Builder setAffixList(
        int index, int value) {
      ensureAffixListIsMutable();
      affixList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 affix_list = 14;</code>
     * @param value The affixList to add.
     * @return This builder for chaining.
     */
    public Builder addAffixList(int value) {
      ensureAffixListIsMutable();
      affixList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 affix_list = 14;</code>
     * @param values The affixList to add.
     * @return This builder for chaining.
     */
    public Builder addAllAffixList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureAffixListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, affixList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 affix_list = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearAffixList() {
      affixList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int level_ ;
    /**
     * <code>uint32 level = 12;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }
    /**
     * <code>uint32 level = 12;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(int value) {
      
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 level = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      
      level_ = 0;
      onChanged();
      return this;
    }

    private int monsterId_ ;
    /**
     * <code>uint32 monster_id = 3;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
    }
    /**
     * <code>uint32 monster_id = 3;</code>
     * @param value The monsterId to set.
     * @return This builder for chaining.
     */
    public Builder setMonsterId(int value) {
      
      monsterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 monster_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMonsterId() {
      
      monsterId_ = 0;
      onChanged();
      return this;
    }

    private int grantPoints_ ;
    /**
     * <code>uint32 grant_points = 5;</code>
     * @return The grantPoints.
     */
    @java.lang.Override
    public int getGrantPoints() {
      return grantPoints_;
    }
    /**
     * <code>uint32 grant_points = 5;</code>
     * @param value The grantPoints to set.
     * @return This builder for chaining.
     */
    public Builder setGrantPoints(int value) {
      
      grantPoints_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 grant_points = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrantPoints() {
      
      grantPoints_ = 0;
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


    // @@protoc_insertion_point(builder_scope:IrodoriChessMonsterInfo)
  }

  // @@protoc_insertion_point(class_scope:IrodoriChessMonsterInfo)
  private static final io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo();
  }

  public static io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IrodoriChessMonsterInfo>
      PARSER = new com.google.protobuf.AbstractParser<IrodoriChessMonsterInfo>() {
    @java.lang.Override
    public IrodoriChessMonsterInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IrodoriChessMonsterInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IrodoriChessMonsterInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IrodoriChessMonsterInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.multistage_play.IrodoriChessMonsterInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

