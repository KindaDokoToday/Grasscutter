// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code BreakoutPhysicalObjectModifier}
 */
public final class BreakoutPhysicalObjectModifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BreakoutPhysicalObjectModifier)
    BreakoutPhysicalObjectModifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BreakoutPhysicalObjectModifier.newBuilder() to construct.
  private BreakoutPhysicalObjectModifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BreakoutPhysicalObjectModifier() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BreakoutPhysicalObjectModifier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BreakoutPhysicalObjectModifier(
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
          case 8: {

            type_ = input.readUInt32();
            break;
          }
          case 16: {

            id_ = input.readUInt32();
            break;
          }
          case 24: {

            param1_ = input.readInt32();
            break;
          }
          case 32: {

            param2_ = input.readInt32();
            break;
          }
          case 40: {

            param3_ = input.readInt32();
            break;
          }
          case 48: {

            param4_ = input.readInt32();
            break;
          }
          case 56: {

            param5_ = input.readInt32();
            break;
          }
          case 64: {

            param6_ = input.readInt32();
            break;
          }
          case 72: {

            bool1_ = input.readBool();
            break;
          }
          case 80: {

            duration_ = input.readInt32();
            break;
          }
          case 88: {

            endTime_ = input.readInt32();
            break;
          }
          case 96: {

            combo_ = input.readUInt32();
            break;
          }
          case 104: {

            peerId_ = input.readUInt32();
            break;
          }
          case 112: {

            skillType_ = input.readUInt32();
            break;
          }
          case 120: {

            level_ = input.readUInt32();
            break;
          }
          case 128: {

            choosePlayerCount_ = input.readUInt32();
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
    return io.grasscutter.net.proto.define.Define.internal_static_BreakoutPhysicalObjectModifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_BreakoutPhysicalObjectModifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier.class, io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier.Builder.class);
  }

  public static final int PARAM4_FIELD_NUMBER = 6;
  private int param4_;
  /**
   * <code>int32 param4 = 6;</code>
   * @return The param4.
   */
  @java.lang.Override
  public int getParam4() {
    return param4_;
  }

  public static final int END_TIME_FIELD_NUMBER = 11;
  private int endTime_;
  /**
   * <code>int32 end_time = 11;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public int getEndTime() {
    return endTime_;
  }

  public static final int CHOOSE_PLAYER_COUNT_FIELD_NUMBER = 16;
  private int choosePlayerCount_;
  /**
   * <code>uint32 choose_player_count = 16;</code>
   * @return The choosePlayerCount.
   */
  @java.lang.Override
  public int getChoosePlayerCount() {
    return choosePlayerCount_;
  }

  public static final int DURATION_FIELD_NUMBER = 10;
  private int duration_;
  /**
   * <code>int32 duration = 10;</code>
   * @return The duration.
   */
  @java.lang.Override
  public int getDuration() {
    return duration_;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private int id_;
  /**
   * <code>uint32 id = 2;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int LEVEL_FIELD_NUMBER = 15;
  private int level_;
  /**
   * <code>uint32 level = 15;</code>
   * @return The level.
   */
  @java.lang.Override
  public int getLevel() {
    return level_;
  }

  public static final int SKILL_TYPE_FIELD_NUMBER = 14;
  private int skillType_;
  /**
   * <code>uint32 skill_type = 14;</code>
   * @return The skillType.
   */
  @java.lang.Override
  public int getSkillType() {
    return skillType_;
  }

  public static final int PARAM1_FIELD_NUMBER = 3;
  private int param1_;
  /**
   * <code>int32 param1 = 3;</code>
   * @return The param1.
   */
  @java.lang.Override
  public int getParam1() {
    return param1_;
  }

  public static final int PARAM2_FIELD_NUMBER = 4;
  private int param2_;
  /**
   * <code>int32 param2 = 4;</code>
   * @return The param2.
   */
  @java.lang.Override
  public int getParam2() {
    return param2_;
  }

  public static final int BOOL1_FIELD_NUMBER = 9;
  private boolean bool1_;
  /**
   * <code>bool bool1 = 9;</code>
   * @return The bool1.
   */
  @java.lang.Override
  public boolean getBool1() {
    return bool1_;
  }

  public static final int PEER_ID_FIELD_NUMBER = 13;
  private int peerId_;
  /**
   * <code>uint32 peer_id = 13;</code>
   * @return The peerId.
   */
  @java.lang.Override
  public int getPeerId() {
    return peerId_;
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>uint32 type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int COMBO_FIELD_NUMBER = 12;
  private int combo_;
  /**
   * <code>uint32 combo = 12;</code>
   * @return The combo.
   */
  @java.lang.Override
  public int getCombo() {
    return combo_;
  }

  public static final int PARAM6_FIELD_NUMBER = 8;
  private int param6_;
  /**
   * <code>int32 param6 = 8;</code>
   * @return The param6.
   */
  @java.lang.Override
  public int getParam6() {
    return param6_;
  }

  public static final int PARAM5_FIELD_NUMBER = 7;
  private int param5_;
  /**
   * <code>int32 param5 = 7;</code>
   * @return The param5.
   */
  @java.lang.Override
  public int getParam5() {
    return param5_;
  }

  public static final int PARAM3_FIELD_NUMBER = 5;
  private int param3_;
  /**
   * <code>int32 param3 = 5;</code>
   * @return The param3.
   */
  @java.lang.Override
  public int getParam3() {
    return param3_;
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
    if (type_ != 0) {
      output.writeUInt32(1, type_);
    }
    if (id_ != 0) {
      output.writeUInt32(2, id_);
    }
    if (param1_ != 0) {
      output.writeInt32(3, param1_);
    }
    if (param2_ != 0) {
      output.writeInt32(4, param2_);
    }
    if (param3_ != 0) {
      output.writeInt32(5, param3_);
    }
    if (param4_ != 0) {
      output.writeInt32(6, param4_);
    }
    if (param5_ != 0) {
      output.writeInt32(7, param5_);
    }
    if (param6_ != 0) {
      output.writeInt32(8, param6_);
    }
    if (bool1_ != false) {
      output.writeBool(9, bool1_);
    }
    if (duration_ != 0) {
      output.writeInt32(10, duration_);
    }
    if (endTime_ != 0) {
      output.writeInt32(11, endTime_);
    }
    if (combo_ != 0) {
      output.writeUInt32(12, combo_);
    }
    if (peerId_ != 0) {
      output.writeUInt32(13, peerId_);
    }
    if (skillType_ != 0) {
      output.writeUInt32(14, skillType_);
    }
    if (level_ != 0) {
      output.writeUInt32(15, level_);
    }
    if (choosePlayerCount_ != 0) {
      output.writeUInt32(16, choosePlayerCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, type_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, id_);
    }
    if (param1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, param1_);
    }
    if (param2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, param2_);
    }
    if (param3_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, param3_);
    }
    if (param4_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, param4_);
    }
    if (param5_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, param5_);
    }
    if (param6_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, param6_);
    }
    if (bool1_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, bool1_);
    }
    if (duration_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, duration_);
    }
    if (endTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, endTime_);
    }
    if (combo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, combo_);
    }
    if (peerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, peerId_);
    }
    if (skillType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, skillType_);
    }
    if (level_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, level_);
    }
    if (choosePlayerCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(16, choosePlayerCount_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier other = (io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier) obj;

    if (getParam4()
        != other.getParam4()) return false;
    if (getEndTime()
        != other.getEndTime()) return false;
    if (getChoosePlayerCount()
        != other.getChoosePlayerCount()) return false;
    if (getDuration()
        != other.getDuration()) return false;
    if (getId()
        != other.getId()) return false;
    if (getLevel()
        != other.getLevel()) return false;
    if (getSkillType()
        != other.getSkillType()) return false;
    if (getParam1()
        != other.getParam1()) return false;
    if (getParam2()
        != other.getParam2()) return false;
    if (getBool1()
        != other.getBool1()) return false;
    if (getPeerId()
        != other.getPeerId()) return false;
    if (getType()
        != other.getType()) return false;
    if (getCombo()
        != other.getCombo()) return false;
    if (getParam6()
        != other.getParam6()) return false;
    if (getParam5()
        != other.getParam5()) return false;
    if (getParam3()
        != other.getParam3()) return false;
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
    hash = (37 * hash) + PARAM4_FIELD_NUMBER;
    hash = (53 * hash) + getParam4();
    hash = (37 * hash) + END_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getEndTime();
    hash = (37 * hash) + CHOOSE_PLAYER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getChoosePlayerCount();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + getDuration();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLevel();
    hash = (37 * hash) + SKILL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSkillType();
    hash = (37 * hash) + PARAM1_FIELD_NUMBER;
    hash = (53 * hash) + getParam1();
    hash = (37 * hash) + PARAM2_FIELD_NUMBER;
    hash = (53 * hash) + getParam2();
    hash = (37 * hash) + BOOL1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBool1());
    hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPeerId();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + COMBO_FIELD_NUMBER;
    hash = (53 * hash) + getCombo();
    hash = (37 * hash) + PARAM6_FIELD_NUMBER;
    hash = (53 * hash) + getParam6();
    hash = (37 * hash) + PARAM5_FIELD_NUMBER;
    hash = (53 * hash) + getParam5();
    hash = (37 * hash) + PARAM3_FIELD_NUMBER;
    hash = (53 * hash) + getParam3();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier prototype) {
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
   * Protobuf type {@code BreakoutPhysicalObjectModifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BreakoutPhysicalObjectModifier)
      io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_BreakoutPhysicalObjectModifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_BreakoutPhysicalObjectModifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier.class, io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier.newBuilder()
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
      param4_ = 0;

      endTime_ = 0;

      choosePlayerCount_ = 0;

      duration_ = 0;

      id_ = 0;

      level_ = 0;

      skillType_ = 0;

      param1_ = 0;

      param2_ = 0;

      bool1_ = false;

      peerId_ = 0;

      type_ = 0;

      combo_ = 0;

      param6_ = 0;

      param5_ = 0;

      param3_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_BreakoutPhysicalObjectModifier_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier build() {
      io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier buildPartial() {
      io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier result = new io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier(this);
      result.param4_ = param4_;
      result.endTime_ = endTime_;
      result.choosePlayerCount_ = choosePlayerCount_;
      result.duration_ = duration_;
      result.id_ = id_;
      result.level_ = level_;
      result.skillType_ = skillType_;
      result.param1_ = param1_;
      result.param2_ = param2_;
      result.bool1_ = bool1_;
      result.peerId_ = peerId_;
      result.type_ = type_;
      result.combo_ = combo_;
      result.param6_ = param6_;
      result.param5_ = param5_;
      result.param3_ = param3_;
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
      if (other instanceof io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier) {
        return mergeFrom((io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier other) {
      if (other == io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier.getDefaultInstance()) return this;
      if (other.getParam4() != 0) {
        setParam4(other.getParam4());
      }
      if (other.getEndTime() != 0) {
        setEndTime(other.getEndTime());
      }
      if (other.getChoosePlayerCount() != 0) {
        setChoosePlayerCount(other.getChoosePlayerCount());
      }
      if (other.getDuration() != 0) {
        setDuration(other.getDuration());
      }
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getLevel() != 0) {
        setLevel(other.getLevel());
      }
      if (other.getSkillType() != 0) {
        setSkillType(other.getSkillType());
      }
      if (other.getParam1() != 0) {
        setParam1(other.getParam1());
      }
      if (other.getParam2() != 0) {
        setParam2(other.getParam2());
      }
      if (other.getBool1() != false) {
        setBool1(other.getBool1());
      }
      if (other.getPeerId() != 0) {
        setPeerId(other.getPeerId());
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getCombo() != 0) {
        setCombo(other.getCombo());
      }
      if (other.getParam6() != 0) {
        setParam6(other.getParam6());
      }
      if (other.getParam5() != 0) {
        setParam5(other.getParam5());
      }
      if (other.getParam3() != 0) {
        setParam3(other.getParam3());
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
      io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int param4_ ;
    /**
     * <code>int32 param4 = 6;</code>
     * @return The param4.
     */
    @java.lang.Override
    public int getParam4() {
      return param4_;
    }
    /**
     * <code>int32 param4 = 6;</code>
     * @param value The param4 to set.
     * @return This builder for chaining.
     */
    public Builder setParam4(int value) {
      
      param4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 param4 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam4() {
      
      param4_ = 0;
      onChanged();
      return this;
    }

    private int endTime_ ;
    /**
     * <code>int32 end_time = 11;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }
    /**
     * <code>int32 end_time = 11;</code>
     * @param value The endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTime(int value) {
      
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 end_time = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTime() {
      
      endTime_ = 0;
      onChanged();
      return this;
    }

    private int choosePlayerCount_ ;
    /**
     * <code>uint32 choose_player_count = 16;</code>
     * @return The choosePlayerCount.
     */
    @java.lang.Override
    public int getChoosePlayerCount() {
      return choosePlayerCount_;
    }
    /**
     * <code>uint32 choose_player_count = 16;</code>
     * @param value The choosePlayerCount to set.
     * @return This builder for chaining.
     */
    public Builder setChoosePlayerCount(int value) {
      
      choosePlayerCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 choose_player_count = 16;</code>
     * @return This builder for chaining.
     */
    public Builder clearChoosePlayerCount() {
      
      choosePlayerCount_ = 0;
      onChanged();
      return this;
    }

    private int duration_ ;
    /**
     * <code>int32 duration = 10;</code>
     * @return The duration.
     */
    @java.lang.Override
    public int getDuration() {
      return duration_;
    }
    /**
     * <code>int32 duration = 10;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(int value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 duration = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0;
      onChanged();
      return this;
    }

    private int id_ ;
    /**
     * <code>uint32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>uint32 id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int level_ ;
    /**
     * <code>uint32 level = 15;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }
    /**
     * <code>uint32 level = 15;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(int value) {
      
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 level = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      
      level_ = 0;
      onChanged();
      return this;
    }

    private int skillType_ ;
    /**
     * <code>uint32 skill_type = 14;</code>
     * @return The skillType.
     */
    @java.lang.Override
    public int getSkillType() {
      return skillType_;
    }
    /**
     * <code>uint32 skill_type = 14;</code>
     * @param value The skillType to set.
     * @return This builder for chaining.
     */
    public Builder setSkillType(int value) {
      
      skillType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 skill_type = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillType() {
      
      skillType_ = 0;
      onChanged();
      return this;
    }

    private int param1_ ;
    /**
     * <code>int32 param1 = 3;</code>
     * @return The param1.
     */
    @java.lang.Override
    public int getParam1() {
      return param1_;
    }
    /**
     * <code>int32 param1 = 3;</code>
     * @param value The param1 to set.
     * @return This builder for chaining.
     */
    public Builder setParam1(int value) {
      
      param1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 param1 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam1() {
      
      param1_ = 0;
      onChanged();
      return this;
    }

    private int param2_ ;
    /**
     * <code>int32 param2 = 4;</code>
     * @return The param2.
     */
    @java.lang.Override
    public int getParam2() {
      return param2_;
    }
    /**
     * <code>int32 param2 = 4;</code>
     * @param value The param2 to set.
     * @return This builder for chaining.
     */
    public Builder setParam2(int value) {
      
      param2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 param2 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam2() {
      
      param2_ = 0;
      onChanged();
      return this;
    }

    private boolean bool1_ ;
    /**
     * <code>bool bool1 = 9;</code>
     * @return The bool1.
     */
    @java.lang.Override
    public boolean getBool1() {
      return bool1_;
    }
    /**
     * <code>bool bool1 = 9;</code>
     * @param value The bool1 to set.
     * @return This builder for chaining.
     */
    public Builder setBool1(boolean value) {
      
      bool1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool bool1 = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearBool1() {
      
      bool1_ = false;
      onChanged();
      return this;
    }

    private int peerId_ ;
    /**
     * <code>uint32 peer_id = 13;</code>
     * @return The peerId.
     */
    @java.lang.Override
    public int getPeerId() {
      return peerId_;
    }
    /**
     * <code>uint32 peer_id = 13;</code>
     * @param value The peerId to set.
     * @return This builder for chaining.
     */
    public Builder setPeerId(int value) {
      
      peerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 peer_id = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearPeerId() {
      
      peerId_ = 0;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <code>uint32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <code>uint32 type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int combo_ ;
    /**
     * <code>uint32 combo = 12;</code>
     * @return The combo.
     */
    @java.lang.Override
    public int getCombo() {
      return combo_;
    }
    /**
     * <code>uint32 combo = 12;</code>
     * @param value The combo to set.
     * @return This builder for chaining.
     */
    public Builder setCombo(int value) {
      
      combo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 combo = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombo() {
      
      combo_ = 0;
      onChanged();
      return this;
    }

    private int param6_ ;
    /**
     * <code>int32 param6 = 8;</code>
     * @return The param6.
     */
    @java.lang.Override
    public int getParam6() {
      return param6_;
    }
    /**
     * <code>int32 param6 = 8;</code>
     * @param value The param6 to set.
     * @return This builder for chaining.
     */
    public Builder setParam6(int value) {
      
      param6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 param6 = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam6() {
      
      param6_ = 0;
      onChanged();
      return this;
    }

    private int param5_ ;
    /**
     * <code>int32 param5 = 7;</code>
     * @return The param5.
     */
    @java.lang.Override
    public int getParam5() {
      return param5_;
    }
    /**
     * <code>int32 param5 = 7;</code>
     * @param value The param5 to set.
     * @return This builder for chaining.
     */
    public Builder setParam5(int value) {
      
      param5_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 param5 = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam5() {
      
      param5_ = 0;
      onChanged();
      return this;
    }

    private int param3_ ;
    /**
     * <code>int32 param3 = 5;</code>
     * @return The param3.
     */
    @java.lang.Override
    public int getParam3() {
      return param3_;
    }
    /**
     * <code>int32 param3 = 5;</code>
     * @param value The param3 to set.
     * @return This builder for chaining.
     */
    public Builder setParam3(int value) {
      
      param3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 param3 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearParam3() {
      
      param3_ = 0;
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


    // @@protoc_insertion_point(builder_scope:BreakoutPhysicalObjectModifier)
  }

  // @@protoc_insertion_point(class_scope:BreakoutPhysicalObjectModifier)
  private static final io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier();
  }

  public static io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BreakoutPhysicalObjectModifier>
      PARSER = new com.google.protobuf.AbstractParser<BreakoutPhysicalObjectModifier>() {
    @java.lang.Override
    public BreakoutPhysicalObjectModifier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BreakoutPhysicalObjectModifier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BreakoutPhysicalObjectModifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BreakoutPhysicalObjectModifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.BreakoutPhysicalObjectModifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

