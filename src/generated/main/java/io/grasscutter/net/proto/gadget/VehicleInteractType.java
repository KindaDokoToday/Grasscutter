// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gadget.proto

package io.grasscutter.net.proto.gadget;

/**
 * Protobuf enum {@code VehicleInteractType}
 */
public enum VehicleInteractType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VehicleInteractType_VEHICLE_INTERACT_NONE = 0;</code>
   */
  VehicleInteractType_VEHICLE_INTERACT_NONE(0),
  /**
   * <code>VehicleInteractType_VEHICLE_INTERACT_IN = 1;</code>
   */
  VehicleInteractType_VEHICLE_INTERACT_IN(1),
  /**
   * <code>VehicleInteractType_VEHICLE_INTERACT_OUT = 2;</code>
   */
  VehicleInteractType_VEHICLE_INTERACT_OUT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VehicleInteractType_VEHICLE_INTERACT_NONE = 0;</code>
   */
  public static final int VehicleInteractType_VEHICLE_INTERACT_NONE_VALUE = 0;
  /**
   * <code>VehicleInteractType_VEHICLE_INTERACT_IN = 1;</code>
   */
  public static final int VehicleInteractType_VEHICLE_INTERACT_IN_VALUE = 1;
  /**
   * <code>VehicleInteractType_VEHICLE_INTERACT_OUT = 2;</code>
   */
  public static final int VehicleInteractType_VEHICLE_INTERACT_OUT_VALUE = 2;


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
  public static VehicleInteractType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VehicleInteractType forNumber(int value) {
    switch (value) {
      case 0: return VehicleInteractType_VEHICLE_INTERACT_NONE;
      case 1: return VehicleInteractType_VEHICLE_INTERACT_IN;
      case 2: return VehicleInteractType_VEHICLE_INTERACT_OUT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VehicleInteractType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VehicleInteractType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VehicleInteractType>() {
          public VehicleInteractType findValueByNumber(int number) {
            return VehicleInteractType.forNumber(number);
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
    return io.grasscutter.net.proto.gadget.Gadget.getDescriptor().getEnumTypes().get(0);
  }

  private static final VehicleInteractType[] VALUES = values();

  public static VehicleInteractType valueOf(
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

  private VehicleInteractType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:VehicleInteractType)
}

