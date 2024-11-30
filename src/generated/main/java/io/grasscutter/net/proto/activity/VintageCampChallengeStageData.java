// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code VintageCampChallengeStageData}
 */
public final class VintageCampChallengeStageData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VintageCampChallengeStageData)
    VintageCampChallengeStageDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VintageCampChallengeStageData.newBuilder() to construct.
  private VintageCampChallengeStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VintageCampChallengeStageData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VintageCampChallengeStageData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VintageCampChallengeStageData(
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

            isOpen_ = input.readBool();
            break;
          }
          case 16: {

            isFinish_ = input.readBool();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              campLevelMap_ = com.google.protobuf.MapField.newMapField(
                  CampLevelMapDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData>
            campLevelMap__ = input.readMessage(
                CampLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            campLevelMap_.getMutableMap().put(
                campLevelMap__.getKey(), campLevelMap__.getValue());
            break;
          }
          case 72: {

            stageId_ = input.readUInt32();
            break;
          }
          case 80: {

            maxFinishedLevel_ = input.readUInt32();
            break;
          }
          case 96: {

            openTime_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_VintageCampChallengeStageData_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetCampLevelMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_VintageCampChallengeStageData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.VintageCampChallengeStageData.class, io.grasscutter.net.proto.activity.VintageCampChallengeStageData.Builder.class);
  }

  public static final int CAMP_LEVEL_MAP_FIELD_NUMBER = 4;
  private static final class CampLevelMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData>newDefaultInstance(
                io.grasscutter.net.proto.activity.Activity.internal_static_VintageCampChallengeStageData_CampLevelMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.grasscutter.net.proto.activity.VintageCampChallengeLevelData.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> campLevelMap_;
  private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData>
  internalGetCampLevelMap() {
    if (campLevelMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CampLevelMapDefaultEntryHolder.defaultEntry);
    }
    return campLevelMap_;
  }

  public int getCampLevelMapCount() {
    return internalGetCampLevelMap().getMap().size();
  }
  /**
   * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
   */

  @java.lang.Override
  public boolean containsCampLevelMap(
      int key) {
    
    return internalGetCampLevelMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCampLevelMapMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> getCampLevelMap() {
    return getCampLevelMapMap();
  }
  /**
   * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> getCampLevelMapMap() {
    return internalGetCampLevelMap().getMap();
  }
  /**
   * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
   */
  @java.lang.Override

  public io.grasscutter.net.proto.activity.VintageCampChallengeLevelData getCampLevelMapOrDefault(
      int key,
      io.grasscutter.net.proto.activity.VintageCampChallengeLevelData defaultValue) {
    
    java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> map =
        internalGetCampLevelMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
   */
  @java.lang.Override

  public io.grasscutter.net.proto.activity.VintageCampChallengeLevelData getCampLevelMapOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> map =
        internalGetCampLevelMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int STAGE_ID_FIELD_NUMBER = 9;
  private int stageId_;
  /**
   * <code>uint32 stage_id = 9;</code>
   * @return The stageId.
   */
  @java.lang.Override
  public int getStageId() {
    return stageId_;
  }

  public static final int OPEN_TIME_FIELD_NUMBER = 12;
  private int openTime_;
  /**
   * <code>uint32 open_time = 12;</code>
   * @return The openTime.
   */
  @java.lang.Override
  public int getOpenTime() {
    return openTime_;
  }

  public static final int MAX_FINISHED_LEVEL_FIELD_NUMBER = 10;
  private int maxFinishedLevel_;
  /**
   * <code>uint32 max_finished_level = 10;</code>
   * @return The maxFinishedLevel.
   */
  @java.lang.Override
  public int getMaxFinishedLevel() {
    return maxFinishedLevel_;
  }

  public static final int IS_FINISH_FIELD_NUMBER = 2;
  private boolean isFinish_;
  /**
   * <code>bool is_finish = 2;</code>
   * @return The isFinish.
   */
  @java.lang.Override
  public boolean getIsFinish() {
    return isFinish_;
  }

  public static final int IS_OPEN_FIELD_NUMBER = 1;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 1;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
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
      output.writeBool(1, isOpen_);
    }
    if (isFinish_ != false) {
      output.writeBool(2, isFinish_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetCampLevelMap(),
        CampLevelMapDefaultEntryHolder.defaultEntry,
        4);
    if (stageId_ != 0) {
      output.writeUInt32(9, stageId_);
    }
    if (maxFinishedLevel_ != 0) {
      output.writeUInt32(10, maxFinishedLevel_);
    }
    if (openTime_ != 0) {
      output.writeUInt32(12, openTime_);
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
        .computeBoolSize(1, isOpen_);
    }
    if (isFinish_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isFinish_);
    }
    for (java.util.Map.Entry<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> entry
         : internalGetCampLevelMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData>
      campLevelMap__ = CampLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, campLevelMap__);
    }
    if (stageId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, stageId_);
    }
    if (maxFinishedLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(10, maxFinishedLevel_);
    }
    if (openTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, openTime_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.VintageCampChallengeStageData)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.VintageCampChallengeStageData other = (io.grasscutter.net.proto.activity.VintageCampChallengeStageData) obj;

    if (!internalGetCampLevelMap().equals(
        other.internalGetCampLevelMap())) return false;
    if (getStageId()
        != other.getStageId()) return false;
    if (getOpenTime()
        != other.getOpenTime()) return false;
    if (getMaxFinishedLevel()
        != other.getMaxFinishedLevel()) return false;
    if (getIsFinish()
        != other.getIsFinish()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
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
    if (!internalGetCampLevelMap().getMap().isEmpty()) {
      hash = (37 * hash) + CAMP_LEVEL_MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCampLevelMap().hashCode();
    }
    hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStageId();
    hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getOpenTime();
    hash = (37 * hash) + MAX_FINISHED_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getMaxFinishedLevel();
    hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFinish());
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.VintageCampChallengeStageData prototype) {
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
   * Protobuf type {@code VintageCampChallengeStageData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VintageCampChallengeStageData)
      io.grasscutter.net.proto.activity.VintageCampChallengeStageDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_VintageCampChallengeStageData_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetCampLevelMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableCampLevelMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_VintageCampChallengeStageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.VintageCampChallengeStageData.class, io.grasscutter.net.proto.activity.VintageCampChallengeStageData.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.VintageCampChallengeStageData.newBuilder()
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
      internalGetMutableCampLevelMap().clear();
      stageId_ = 0;

      openTime_ = 0;

      maxFinishedLevel_ = 0;

      isFinish_ = false;

      isOpen_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_VintageCampChallengeStageData_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.VintageCampChallengeStageData getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.VintageCampChallengeStageData.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.VintageCampChallengeStageData build() {
      io.grasscutter.net.proto.activity.VintageCampChallengeStageData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.VintageCampChallengeStageData buildPartial() {
      io.grasscutter.net.proto.activity.VintageCampChallengeStageData result = new io.grasscutter.net.proto.activity.VintageCampChallengeStageData(this);
      int from_bitField0_ = bitField0_;
      result.campLevelMap_ = internalGetCampLevelMap();
      result.campLevelMap_.makeImmutable();
      result.stageId_ = stageId_;
      result.openTime_ = openTime_;
      result.maxFinishedLevel_ = maxFinishedLevel_;
      result.isFinish_ = isFinish_;
      result.isOpen_ = isOpen_;
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
      if (other instanceof io.grasscutter.net.proto.activity.VintageCampChallengeStageData) {
        return mergeFrom((io.grasscutter.net.proto.activity.VintageCampChallengeStageData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.VintageCampChallengeStageData other) {
      if (other == io.grasscutter.net.proto.activity.VintageCampChallengeStageData.getDefaultInstance()) return this;
      internalGetMutableCampLevelMap().mergeFrom(
          other.internalGetCampLevelMap());
      if (other.getStageId() != 0) {
        setStageId(other.getStageId());
      }
      if (other.getOpenTime() != 0) {
        setOpenTime(other.getOpenTime());
      }
      if (other.getMaxFinishedLevel() != 0) {
        setMaxFinishedLevel(other.getMaxFinishedLevel());
      }
      if (other.getIsFinish() != false) {
        setIsFinish(other.getIsFinish());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
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
      io.grasscutter.net.proto.activity.VintageCampChallengeStageData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.VintageCampChallengeStageData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> campLevelMap_;
    private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData>
    internalGetCampLevelMap() {
      if (campLevelMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CampLevelMapDefaultEntryHolder.defaultEntry);
      }
      return campLevelMap_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData>
    internalGetMutableCampLevelMap() {
      onChanged();;
      if (campLevelMap_ == null) {
        campLevelMap_ = com.google.protobuf.MapField.newMapField(
            CampLevelMapDefaultEntryHolder.defaultEntry);
      }
      if (!campLevelMap_.isMutable()) {
        campLevelMap_ = campLevelMap_.copy();
      }
      return campLevelMap_;
    }

    public int getCampLevelMapCount() {
      return internalGetCampLevelMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
     */

    @java.lang.Override
    public boolean containsCampLevelMap(
        int key) {
      
      return internalGetCampLevelMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCampLevelMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> getCampLevelMap() {
      return getCampLevelMapMap();
    }
    /**
     * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> getCampLevelMapMap() {
      return internalGetCampLevelMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
     */
    @java.lang.Override

    public io.grasscutter.net.proto.activity.VintageCampChallengeLevelData getCampLevelMapOrDefault(
        int key,
        io.grasscutter.net.proto.activity.VintageCampChallengeLevelData defaultValue) {
      
      java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> map =
          internalGetCampLevelMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
     */
    @java.lang.Override

    public io.grasscutter.net.proto.activity.VintageCampChallengeLevelData getCampLevelMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> map =
          internalGetCampLevelMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCampLevelMap() {
      internalGetMutableCampLevelMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
     */

    public Builder removeCampLevelMap(
        int key) {
      
      internalGetMutableCampLevelMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData>
    getMutableCampLevelMap() {
      return internalGetMutableCampLevelMap().getMutableMap();
    }
    /**
     * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
     */
    public Builder putCampLevelMap(
        int key,
        io.grasscutter.net.proto.activity.VintageCampChallengeLevelData value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableCampLevelMap().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;uint32, .VintageCampChallengeLevelData&gt; camp_level_map = 4;</code>
     */

    public Builder putAllCampLevelMap(
        java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.VintageCampChallengeLevelData> values) {
      internalGetMutableCampLevelMap().getMutableMap()
          .putAll(values);
      return this;
    }

    private int stageId_ ;
    /**
     * <code>uint32 stage_id = 9;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }
    /**
     * <code>uint32 stage_id = 9;</code>
     * @param value The stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageId(int value) {
      
      stageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 stage_id = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearStageId() {
      
      stageId_ = 0;
      onChanged();
      return this;
    }

    private int openTime_ ;
    /**
     * <code>uint32 open_time = 12;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }
    /**
     * <code>uint32 open_time = 12;</code>
     * @param value The openTime to set.
     * @return This builder for chaining.
     */
    public Builder setOpenTime(int value) {
      
      openTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 open_time = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenTime() {
      
      openTime_ = 0;
      onChanged();
      return this;
    }

    private int maxFinishedLevel_ ;
    /**
     * <code>uint32 max_finished_level = 10;</code>
     * @return The maxFinishedLevel.
     */
    @java.lang.Override
    public int getMaxFinishedLevel() {
      return maxFinishedLevel_;
    }
    /**
     * <code>uint32 max_finished_level = 10;</code>
     * @param value The maxFinishedLevel to set.
     * @return This builder for chaining.
     */
    public Builder setMaxFinishedLevel(int value) {
      
      maxFinishedLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 max_finished_level = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxFinishedLevel() {
      
      maxFinishedLevel_ = 0;
      onChanged();
      return this;
    }

    private boolean isFinish_ ;
    /**
     * <code>bool is_finish = 2;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }
    /**
     * <code>bool is_finish = 2;</code>
     * @param value The isFinish to set.
     * @return This builder for chaining.
     */
    public Builder setIsFinish(boolean value) {
      
      isFinish_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_finish = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFinish() {
      
      isFinish_ = false;
      onChanged();
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 1;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 1;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
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


    // @@protoc_insertion_point(builder_scope:VintageCampChallengeStageData)
  }

  // @@protoc_insertion_point(class_scope:VintageCampChallengeStageData)
  private static final io.grasscutter.net.proto.activity.VintageCampChallengeStageData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.VintageCampChallengeStageData();
  }

  public static io.grasscutter.net.proto.activity.VintageCampChallengeStageData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VintageCampChallengeStageData>
      PARSER = new com.google.protobuf.AbstractParser<VintageCampChallengeStageData>() {
    @java.lang.Override
    public VintageCampChallengeStageData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VintageCampChallengeStageData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VintageCampChallengeStageData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VintageCampChallengeStageData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.VintageCampChallengeStageData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

