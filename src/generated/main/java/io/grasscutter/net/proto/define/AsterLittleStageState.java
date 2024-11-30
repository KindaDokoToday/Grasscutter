// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf enum {@code AsterLittleStageState}
 */
public enum AsterLittleStageState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AsterLittleStageState_ASTER_LITTLE_STAGE_NONE = 0;</code>
   */
  AsterLittleStageState_ASTER_LITTLE_STAGE_NONE(0),
  /**
   * <code>AsterLittleStageState_ASTER_LITTLE_STAGE_UNSTARTED = 1;</code>
   */
  AsterLittleStageState_ASTER_LITTLE_STAGE_UNSTARTED(1),
  /**
   * <code>AsterLittleStageState_ASTER_LITTLE_STAGE_STARTED = 2;</code>
   */
  AsterLittleStageState_ASTER_LITTLE_STAGE_STARTED(2),
  /**
   * <code>AsterLittleStageState_ASTER_LITTLE_STAGE_FINISHED = 3;</code>
   */
  AsterLittleStageState_ASTER_LITTLE_STAGE_FINISHED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AsterLittleStageState_ASTER_LITTLE_STAGE_NONE = 0;</code>
   */
  public static final int AsterLittleStageState_ASTER_LITTLE_STAGE_NONE_VALUE = 0;
  /**
   * <code>AsterLittleStageState_ASTER_LITTLE_STAGE_UNSTARTED = 1;</code>
   */
  public static final int AsterLittleStageState_ASTER_LITTLE_STAGE_UNSTARTED_VALUE = 1;
  /**
   * <code>AsterLittleStageState_ASTER_LITTLE_STAGE_STARTED = 2;</code>
   */
  public static final int AsterLittleStageState_ASTER_LITTLE_STAGE_STARTED_VALUE = 2;
  /**
   * <code>AsterLittleStageState_ASTER_LITTLE_STAGE_FINISHED = 3;</code>
   */
  public static final int AsterLittleStageState_ASTER_LITTLE_STAGE_FINISHED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AsterLittleStageState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AsterLittleStageState forNumber(int value) {
    switch (value) {
      case 0: return AsterLittleStageState_ASTER_LITTLE_STAGE_NONE;
      case 1: return AsterLittleStageState_ASTER_LITTLE_STAGE_UNSTARTED;
      case 2: return AsterLittleStageState_ASTER_LITTLE_STAGE_STARTED;
      case 3: return AsterLittleStageState_ASTER_LITTLE_STAGE_FINISHED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AsterLittleStageState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AsterLittleStageState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AsterLittleStageState>() {
          public AsterLittleStageState findValueByNumber(int number) {
            return AsterLittleStageState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.grasscutter.net.proto.define.Define.getDescriptor().getEnumTypes().get(13);
  }

  private static final AsterLittleStageState[] VALUES = values();

  public static AsterLittleStageState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AsterLittleStageState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:AsterLittleStageState)
}

