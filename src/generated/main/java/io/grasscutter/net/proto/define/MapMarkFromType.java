// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf enum {@code MapMarkFromType}
 */
public enum MapMarkFromType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MapMarkFromType_NOE = 0;</code>
   */
  MapMarkFromType_NOE(0),
  /**
   * <code>MapMarkFromType_MONSTER = 1;</code>
   */
  MapMarkFromType_MONSTER(1),
  /**
   * <code>MapMarkFromType_QUEST = 2;</code>
   */
  MapMarkFromType_QUEST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MapMarkFromType_NOE = 0;</code>
   */
  public static final int MapMarkFromType_NOE_VALUE = 0;
  /**
   * <code>MapMarkFromType_MONSTER = 1;</code>
   */
  public static final int MapMarkFromType_MONSTER_VALUE = 1;
  /**
   * <code>MapMarkFromType_QUEST = 2;</code>
   */
  public static final int MapMarkFromType_QUEST_VALUE = 2;


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
  public static MapMarkFromType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MapMarkFromType forNumber(int value) {
    switch (value) {
      case 0: return MapMarkFromType_NOE;
      case 1: return MapMarkFromType_MONSTER;
      case 2: return MapMarkFromType_QUEST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MapMarkFromType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MapMarkFromType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MapMarkFromType>() {
          public MapMarkFromType findValueByNumber(int number) {
            return MapMarkFromType.forNumber(number);
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
    return io.grasscutter.net.proto.define.Define.getDescriptor().getEnumTypes().get(4);
  }

  private static final MapMarkFromType[] VALUES = values();

  public static MapMarkFromType valueOf(
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

  private MapMarkFromType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MapMarkFromType)
}

