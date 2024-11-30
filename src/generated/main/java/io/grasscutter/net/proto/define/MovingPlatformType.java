// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf enum {@code MovingPlatformType}
 */
public enum MovingPlatformType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MovingPlatformType_MOVING_PLATFORM_NONE = 0;</code>
   */
  MovingPlatformType_MOVING_PLATFORM_NONE(0),
  /**
   * <code>MovingPlatformType_MOVING_PLATFORM_USE_CONFIG = 1;</code>
   */
  MovingPlatformType_MOVING_PLATFORM_USE_CONFIG(1),
  /**
   * <code>MovingPlatformType_MOVING_PLATFORM_ABILITY = 2;</code>
   */
  MovingPlatformType_MOVING_PLATFORM_ABILITY(2),
  /**
   * <code>MovingPlatformType_MOVING_PLATFORM_ROUTE = 3;</code>
   */
  MovingPlatformType_MOVING_PLATFORM_ROUTE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MovingPlatformType_MOVING_PLATFORM_NONE = 0;</code>
   */
  public static final int MovingPlatformType_MOVING_PLATFORM_NONE_VALUE = 0;
  /**
   * <code>MovingPlatformType_MOVING_PLATFORM_USE_CONFIG = 1;</code>
   */
  public static final int MovingPlatformType_MOVING_PLATFORM_USE_CONFIG_VALUE = 1;
  /**
   * <code>MovingPlatformType_MOVING_PLATFORM_ABILITY = 2;</code>
   */
  public static final int MovingPlatformType_MOVING_PLATFORM_ABILITY_VALUE = 2;
  /**
   * <code>MovingPlatformType_MOVING_PLATFORM_ROUTE = 3;</code>
   */
  public static final int MovingPlatformType_MOVING_PLATFORM_ROUTE_VALUE = 3;


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
  public static MovingPlatformType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MovingPlatformType forNumber(int value) {
    switch (value) {
      case 0: return MovingPlatformType_MOVING_PLATFORM_NONE;
      case 1: return MovingPlatformType_MOVING_PLATFORM_USE_CONFIG;
      case 2: return MovingPlatformType_MOVING_PLATFORM_ABILITY;
      case 3: return MovingPlatformType_MOVING_PLATFORM_ROUTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MovingPlatformType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MovingPlatformType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MovingPlatformType>() {
          public MovingPlatformType findValueByNumber(int number) {
            return MovingPlatformType.forNumber(number);
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
    return io.grasscutter.net.proto.define.Define.getDescriptor().getEnumTypes().get(1);
  }

  private static final MovingPlatformType[] VALUES = values();

  public static MovingPlatformType valueOf(
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

  private MovingPlatformType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MovingPlatformType)
}

