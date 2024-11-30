// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code SumoStageData}
 */
public final class SumoStageData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SumoStageData)
    SumoStageDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SumoStageData.newBuilder() to construct.
  private SumoStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SumoStageData() {
    teamList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SumoStageData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SumoStageData(
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
          case 40: {

            isOpen_ = input.readBool();
            break;
          }
          case 88: {

            stageId_ = input.readUInt32();
            break;
          }
          case 104: {

            openTime_ = input.readUInt32();
            break;
          }
          case 112: {

            maxScore_ = input.readUInt32();
            break;
          }
          case 122: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              teamList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.SumoTeamData>();
              mutable_bitField0_ |= 0x00000001;
            }
            teamList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.SumoTeamData.parser(), extensionRegistry));
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
        teamList_ = java.util.Collections.unmodifiableList(teamList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_SumoStageData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_SumoStageData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.SumoStageData.class, io.grasscutter.net.proto.activity.SumoStageData.Builder.class);
  }

  public static final int TEAM_LIST_FIELD_NUMBER = 15;
  private java.util.List<io.grasscutter.net.proto.activity.SumoTeamData> teamList_;
  /**
   * <code>repeated .SumoTeamData team_list = 15;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.SumoTeamData> getTeamListList() {
    return teamList_;
  }
  /**
   * <code>repeated .SumoTeamData team_list = 15;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.SumoTeamDataOrBuilder> 
      getTeamListOrBuilderList() {
    return teamList_;
  }
  /**
   * <code>repeated .SumoTeamData team_list = 15;</code>
   */
  @java.lang.Override
  public int getTeamListCount() {
    return teamList_.size();
  }
  /**
   * <code>repeated .SumoTeamData team_list = 15;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.SumoTeamData getTeamList(int index) {
    return teamList_.get(index);
  }
  /**
   * <code>repeated .SumoTeamData team_list = 15;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.SumoTeamDataOrBuilder getTeamListOrBuilder(
      int index) {
    return teamList_.get(index);
  }

  public static final int MAX_SCORE_FIELD_NUMBER = 14;
  private int maxScore_;
  /**
   * <code>uint32 max_score = 14;</code>
   * @return The maxScore.
   */
  @java.lang.Override
  public int getMaxScore() {
    return maxScore_;
  }

  public static final int IS_OPEN_FIELD_NUMBER = 5;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 5;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int STAGE_ID_FIELD_NUMBER = 11;
  private int stageId_;
  /**
   * <code>uint32 stage_id = 11;</code>
   * @return The stageId.
   */
  @java.lang.Override
  public int getStageId() {
    return stageId_;
  }

  public static final int OPEN_TIME_FIELD_NUMBER = 13;
  private int openTime_;
  /**
   * <code>uint32 open_time = 13;</code>
   * @return The openTime.
   */
  @java.lang.Override
  public int getOpenTime() {
    return openTime_;
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
    if (isOpen_ != false) {
      output.writeBool(5, isOpen_);
    }
    if (stageId_ != 0) {
      output.writeUInt32(11, stageId_);
    }
    if (openTime_ != 0) {
      output.writeUInt32(13, openTime_);
    }
    if (maxScore_ != 0) {
      output.writeUInt32(14, maxScore_);
    }
    for (int i = 0; i < teamList_.size(); i++) {
      output.writeMessage(15, teamList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isOpen_);
    }
    if (stageId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, stageId_);
    }
    if (openTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, openTime_);
    }
    if (maxScore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, maxScore_);
    }
    for (int i = 0; i < teamList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(15, teamList_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.SumoStageData)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.SumoStageData other = (io.grasscutter.net.proto.activity.SumoStageData) obj;

    if (!getTeamListList()
        .equals(other.getTeamListList())) return false;
    if (getMaxScore()
        != other.getMaxScore()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getStageId()
        != other.getStageId()) return false;
    if (getOpenTime()
        != other.getOpenTime()) return false;
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
    if (getTeamListCount() > 0) {
      hash = (37 * hash) + TEAM_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getTeamListList().hashCode();
    }
    hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxScore();
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStageId();
    hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getOpenTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.SumoStageData parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.SumoStageData prototype) {
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
   * Protobuf type {@code SumoStageData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SumoStageData)
      io.grasscutter.net.proto.activity.SumoStageDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_SumoStageData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_SumoStageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.SumoStageData.class, io.grasscutter.net.proto.activity.SumoStageData.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.SumoStageData.newBuilder()
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
        getTeamListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (teamListBuilder_ == null) {
        teamList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        teamListBuilder_.clear();
      }
      maxScore_ = 0;

      isOpen_ = false;

      stageId_ = 0;

      openTime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_SumoStageData_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.SumoStageData getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.SumoStageData.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.SumoStageData build() {
      io.grasscutter.net.proto.activity.SumoStageData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.SumoStageData buildPartial() {
      io.grasscutter.net.proto.activity.SumoStageData result = new io.grasscutter.net.proto.activity.SumoStageData(this);
      int from_bitField0_ = bitField0_;
      if (teamListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          teamList_ = java.util.Collections.unmodifiableList(teamList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.teamList_ = teamList_;
      } else {
        result.teamList_ = teamListBuilder_.build();
      }
      result.maxScore_ = maxScore_;
      result.isOpen_ = isOpen_;
      result.stageId_ = stageId_;
      result.openTime_ = openTime_;
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
      if (other instanceof io.grasscutter.net.proto.activity.SumoStageData) {
        return mergeFrom((io.grasscutter.net.proto.activity.SumoStageData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.SumoStageData other) {
      if (other == io.grasscutter.net.proto.activity.SumoStageData.getDefaultInstance()) return this;
      if (teamListBuilder_ == null) {
        if (!other.teamList_.isEmpty()) {
          if (teamList_.isEmpty()) {
            teamList_ = other.teamList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTeamListIsMutable();
            teamList_.addAll(other.teamList_);
          }
          onChanged();
        }
      } else {
        if (!other.teamList_.isEmpty()) {
          if (teamListBuilder_.isEmpty()) {
            teamListBuilder_.dispose();
            teamListBuilder_ = null;
            teamList_ = other.teamList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            teamListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTeamListFieldBuilder() : null;
          } else {
            teamListBuilder_.addAllMessages(other.teamList_);
          }
        }
      }
      if (other.getMaxScore() != 0) {
        setMaxScore(other.getMaxScore());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getStageId() != 0) {
        setStageId(other.getStageId());
      }
      if (other.getOpenTime() != 0) {
        setOpenTime(other.getOpenTime());
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
      io.grasscutter.net.proto.activity.SumoStageData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.SumoStageData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.SumoTeamData> teamList_ =
      java.util.Collections.emptyList();
    private void ensureTeamListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        teamList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.SumoTeamData>(teamList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.SumoTeamData, io.grasscutter.net.proto.activity.SumoTeamData.Builder, io.grasscutter.net.proto.activity.SumoTeamDataOrBuilder> teamListBuilder_;

    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.SumoTeamData> getTeamListList() {
      if (teamListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(teamList_);
      } else {
        return teamListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public int getTeamListCount() {
      if (teamListBuilder_ == null) {
        return teamList_.size();
      } else {
        return teamListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public io.grasscutter.net.proto.activity.SumoTeamData getTeamList(int index) {
      if (teamListBuilder_ == null) {
        return teamList_.get(index);
      } else {
        return teamListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder setTeamList(
        int index, io.grasscutter.net.proto.activity.SumoTeamData value) {
      if (teamListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeamListIsMutable();
        teamList_.set(index, value);
        onChanged();
      } else {
        teamListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder setTeamList(
        int index, io.grasscutter.net.proto.activity.SumoTeamData.Builder builderForValue) {
      if (teamListBuilder_ == null) {
        ensureTeamListIsMutable();
        teamList_.set(index, builderForValue.build());
        onChanged();
      } else {
        teamListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder addTeamList(io.grasscutter.net.proto.activity.SumoTeamData value) {
      if (teamListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeamListIsMutable();
        teamList_.add(value);
        onChanged();
      } else {
        teamListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder addTeamList(
        int index, io.grasscutter.net.proto.activity.SumoTeamData value) {
      if (teamListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeamListIsMutable();
        teamList_.add(index, value);
        onChanged();
      } else {
        teamListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder addTeamList(
        io.grasscutter.net.proto.activity.SumoTeamData.Builder builderForValue) {
      if (teamListBuilder_ == null) {
        ensureTeamListIsMutable();
        teamList_.add(builderForValue.build());
        onChanged();
      } else {
        teamListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder addTeamList(
        int index, io.grasscutter.net.proto.activity.SumoTeamData.Builder builderForValue) {
      if (teamListBuilder_ == null) {
        ensureTeamListIsMutable();
        teamList_.add(index, builderForValue.build());
        onChanged();
      } else {
        teamListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder addAllTeamList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.SumoTeamData> values) {
      if (teamListBuilder_ == null) {
        ensureTeamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, teamList_);
        onChanged();
      } else {
        teamListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder clearTeamList() {
      if (teamListBuilder_ == null) {
        teamList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        teamListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public Builder removeTeamList(int index) {
      if (teamListBuilder_ == null) {
        ensureTeamListIsMutable();
        teamList_.remove(index);
        onChanged();
      } else {
        teamListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public io.grasscutter.net.proto.activity.SumoTeamData.Builder getTeamListBuilder(
        int index) {
      return getTeamListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public io.grasscutter.net.proto.activity.SumoTeamDataOrBuilder getTeamListOrBuilder(
        int index) {
      if (teamListBuilder_ == null) {
        return teamList_.get(index);  } else {
        return teamListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.SumoTeamDataOrBuilder> 
         getTeamListOrBuilderList() {
      if (teamListBuilder_ != null) {
        return teamListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(teamList_);
      }
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public io.grasscutter.net.proto.activity.SumoTeamData.Builder addTeamListBuilder() {
      return getTeamListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.SumoTeamData.getDefaultInstance());
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public io.grasscutter.net.proto.activity.SumoTeamData.Builder addTeamListBuilder(
        int index) {
      return getTeamListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.SumoTeamData.getDefaultInstance());
    }
    /**
     * <code>repeated .SumoTeamData team_list = 15;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.SumoTeamData.Builder> 
         getTeamListBuilderList() {
      return getTeamListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.SumoTeamData, io.grasscutter.net.proto.activity.SumoTeamData.Builder, io.grasscutter.net.proto.activity.SumoTeamDataOrBuilder> 
        getTeamListFieldBuilder() {
      if (teamListBuilder_ == null) {
        teamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.SumoTeamData, io.grasscutter.net.proto.activity.SumoTeamData.Builder, io.grasscutter.net.proto.activity.SumoTeamDataOrBuilder>(
                teamList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        teamList_ = null;
      }
      return teamListBuilder_;
    }

    private int maxScore_ ;
    /**
     * <code>uint32 max_score = 14;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }
    /**
     * <code>uint32 max_score = 14;</code>
     * @param value The maxScore to set.
     * @return This builder for chaining.
     */
    public Builder setMaxScore(int value) {
      
      maxScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 max_score = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxScore() {
      
      maxScore_ = 0;
      onChanged();
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 5;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private int stageId_ ;
    /**
     * <code>uint32 stage_id = 11;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }
    /**
     * <code>uint32 stage_id = 11;</code>
     * @param value The stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageId(int value) {
      
      stageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 stage_id = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearStageId() {
      
      stageId_ = 0;
      onChanged();
      return this;
    }

    private int openTime_ ;
    /**
     * <code>uint32 open_time = 13;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }
    /**
     * <code>uint32 open_time = 13;</code>
     * @param value The openTime to set.
     * @return This builder for chaining.
     */
    public Builder setOpenTime(int value) {
      
      openTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 open_time = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenTime() {
      
      openTime_ = 0;
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


    // @@protoc_insertion_point(builder_scope:SumoStageData)
  }

  // @@protoc_insertion_point(class_scope:SumoStageData)
  private static final io.grasscutter.net.proto.activity.SumoStageData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.SumoStageData();
  }

  public static io.grasscutter.net.proto.activity.SumoStageData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SumoStageData>
      PARSER = new com.google.protobuf.AbstractParser<SumoStageData>() {
    @java.lang.Override
    public SumoStageData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SumoStageData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SumoStageData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SumoStageData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.SumoStageData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

