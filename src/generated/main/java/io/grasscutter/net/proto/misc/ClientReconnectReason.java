// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: misc.proto

package io.grasscutter.net.proto.misc;

/**
 * Protobuf enum {@code ClientReconnectReason}
 */
public enum ClientReconnectReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ClientReconnectReason_CLIENT_RECONNNECT_NONE = 0;</code>
   */
  ClientReconnectReason_CLIENT_RECONNNECT_NONE(0),
  /**
   * <code>ClientReconnectReason_CLIENT_RECONNNECT_QUIT_MP = 1;</code>
   */
  ClientReconnectReason_CLIENT_RECONNNECT_QUIT_MP(1),
  /**
   * <code>ClientReconnectReason_CLIENT_RECONNNECT_SCENE_TIME_CHECK_FAIL = 2;</code>
   */
  ClientReconnectReason_CLIENT_RECONNNECT_SCENE_TIME_CHECK_FAIL(2),
  /**
   * <code>ClientReconnectReason_CLIENT_RECONNNECT_ENTER_QUEST_FOCUS = 3;</code>
   */
  ClientReconnectReason_CLIENT_RECONNNECT_ENTER_QUEST_FOCUS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ClientReconnectReason_CLIENT_RECONNNECT_NONE = 0;</code>
   */
  public static final int ClientReconnectReason_CLIENT_RECONNNECT_NONE_VALUE = 0;
  /**
   * <code>ClientReconnectReason_CLIENT_RECONNNECT_QUIT_MP = 1;</code>
   */
  public static final int ClientReconnectReason_CLIENT_RECONNNECT_QUIT_MP_VALUE = 1;
  /**
   * <code>ClientReconnectReason_CLIENT_RECONNNECT_SCENE_TIME_CHECK_FAIL = 2;</code>
   */
  public static final int ClientReconnectReason_CLIENT_RECONNNECT_SCENE_TIME_CHECK_FAIL_VALUE = 2;
  /**
   * <code>ClientReconnectReason_CLIENT_RECONNNECT_ENTER_QUEST_FOCUS = 3;</code>
   */
  public static final int ClientReconnectReason_CLIENT_RECONNNECT_ENTER_QUEST_FOCUS_VALUE = 3;


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
  public static ClientReconnectReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClientReconnectReason forNumber(int value) {
    switch (value) {
      case 0: return ClientReconnectReason_CLIENT_RECONNNECT_NONE;
      case 1: return ClientReconnectReason_CLIENT_RECONNNECT_QUIT_MP;
      case 2: return ClientReconnectReason_CLIENT_RECONNNECT_SCENE_TIME_CHECK_FAIL;
      case 3: return ClientReconnectReason_CLIENT_RECONNNECT_ENTER_QUEST_FOCUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClientReconnectReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClientReconnectReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClientReconnectReason>() {
          public ClientReconnectReason findValueByNumber(int number) {
            return ClientReconnectReason.forNumber(number);
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
    return io.grasscutter.net.proto.misc.Misc.getDescriptor().getEnumTypes().get(0);
  }

  private static final ClientReconnectReason[] VALUES = values();

  public static ClientReconnectReason valueOf(
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

  private ClientReconnectReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ClientReconnectReason)
}

