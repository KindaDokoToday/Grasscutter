// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item.proto

package io.grasscutter.net.proto.item;

/**
 * Protobuf enum {@code StoreItemChangeReason}
 */
public enum StoreItemChangeReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>StoreItemChangeReason_OTHERS = 0;</code>
   */
  StoreItemChangeReason_OTHERS(0),
  /**
   * <code>StoreItemChangeReason_LOCK_OR_STAR = 1;</code>
   */
  StoreItemChangeReason_LOCK_OR_STAR(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>StoreItemChangeReason_OTHERS = 0;</code>
   */
  public static final int StoreItemChangeReason_OTHERS_VALUE = 0;
  /**
   * <code>StoreItemChangeReason_LOCK_OR_STAR = 1;</code>
   */
  public static final int StoreItemChangeReason_LOCK_OR_STAR_VALUE = 1;


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
  public static StoreItemChangeReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StoreItemChangeReason forNumber(int value) {
    switch (value) {
      case 0: return StoreItemChangeReason_OTHERS;
      case 1: return StoreItemChangeReason_LOCK_OR_STAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StoreItemChangeReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StoreItemChangeReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StoreItemChangeReason>() {
          public StoreItemChangeReason findValueByNumber(int number) {
            return StoreItemChangeReason.forNumber(number);
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
    return io.grasscutter.net.proto.item.Item.getDescriptor().getEnumTypes().get(0);
  }

  private static final StoreItemChangeReason[] VALUES = values();

  public static StoreItemChangeReason valueOf(
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

  private StoreItemChangeReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:StoreItemChangeReason)
}

