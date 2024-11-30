// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf enum {@code MPHAJNOFPHP}
 */
public enum MPHAJNOFPHP
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MPHAJNOFPHP_NONE = 0;</code>
   */
  MPHAJNOFPHP_NONE(0),
  /**
   * <code>MPHAJNOFPHP_LEAVE = 1;</code>
   */
  MPHAJNOFPHP_LEAVE(1),
  /**
   * <code>MPHAJNOFPHP_PENDING = 2;</code>
   */
  MPHAJNOFPHP_PENDING(2),
  /**
   * <code>MPHAJNOFPHP_IDLE = 3;</code>
   */
  MPHAJNOFPHP_IDLE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MPHAJNOFPHP_NONE = 0;</code>
   */
  public static final int MPHAJNOFPHP_NONE_VALUE = 0;
  /**
   * <code>MPHAJNOFPHP_LEAVE = 1;</code>
   */
  public static final int MPHAJNOFPHP_LEAVE_VALUE = 1;
  /**
   * <code>MPHAJNOFPHP_PENDING = 2;</code>
   */
  public static final int MPHAJNOFPHP_PENDING_VALUE = 2;
  /**
   * <code>MPHAJNOFPHP_IDLE = 3;</code>
   */
  public static final int MPHAJNOFPHP_IDLE_VALUE = 3;


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
  public static MPHAJNOFPHP valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MPHAJNOFPHP forNumber(int value) {
    switch (value) {
      case 0: return MPHAJNOFPHP_NONE;
      case 1: return MPHAJNOFPHP_LEAVE;
      case 2: return MPHAJNOFPHP_PENDING;
      case 3: return MPHAJNOFPHP_IDLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MPHAJNOFPHP>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MPHAJNOFPHP> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MPHAJNOFPHP>() {
          public MPHAJNOFPHP findValueByNumber(int number) {
            return MPHAJNOFPHP.forNumber(number);
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
    return io.grasscutter.net.proto.activity.Activity.getDescriptor().getEnumTypes().get(6);
  }

  private static final MPHAJNOFPHP[] VALUES = values();

  public static MPHAJNOFPHP valueOf(
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

  private MPHAJNOFPHP(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MPHAJNOFPHP)
}

