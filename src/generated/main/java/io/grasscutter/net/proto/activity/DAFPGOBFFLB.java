// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf enum {@code DAFPGOBFFLB}
 */
public enum DAFPGOBFFLB
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_NONE = 0;</code>
   */
  DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_NONE(0),
  /**
   * <code>DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_RUNE = 1;</code>
   */
  DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_RUNE(1),
  /**
   * <code>DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_CHEST = 2;</code>
   */
  DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_CHEST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_NONE = 0;</code>
   */
  public static final int DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_NONE_VALUE = 0;
  /**
   * <code>DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_RUNE = 1;</code>
   */
  public static final int DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_RUNE_VALUE = 1;
  /**
   * <code>DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_CHEST = 2;</code>
   */
  public static final int DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_CHEST_VALUE = 2;


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
  public static DAFPGOBFFLB valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DAFPGOBFFLB forNumber(int value) {
    switch (value) {
      case 0: return DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_NONE;
      case 1: return DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_RUNE;
      case 2: return DAFPGOBFFLB_LUNA_RITE_HINT_TYPE_CHEST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DAFPGOBFFLB>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DAFPGOBFFLB> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DAFPGOBFFLB>() {
          public DAFPGOBFFLB findValueByNumber(int number) {
            return DAFPGOBFFLB.forNumber(number);
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
    return io.grasscutter.net.proto.activity.Activity.getDescriptor().getEnumTypes().get(3);
  }

  private static final DAFPGOBFFLB[] VALUES = values();

  public static DAFPGOBFFLB valueOf(
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

  private DAFPGOBFFLB(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:DAFPGOBFFLB)
}

