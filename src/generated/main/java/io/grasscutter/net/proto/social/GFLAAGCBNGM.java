// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: social.proto

package io.grasscutter.net.proto.social;

/**
 * Protobuf enum {@code GFLAAGCBNGM}
 */
public enum GFLAAGCBNGM
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GFLAAGCBNGM_VERSION_NONE = 0;</code>
   */
  GFLAAGCBNGM_VERSION_NONE(0),
  /**
   * <code>GFLAAGCBNGM_V50 = 1;</code>
   */
  GFLAAGCBNGM_V50(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GFLAAGCBNGM_VERSION_NONE = 0;</code>
   */
  public static final int GFLAAGCBNGM_VERSION_NONE_VALUE = 0;
  /**
   * <code>GFLAAGCBNGM_V50 = 1;</code>
   */
  public static final int GFLAAGCBNGM_V50_VALUE = 1;


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
  public static GFLAAGCBNGM valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GFLAAGCBNGM forNumber(int value) {
    switch (value) {
      case 0: return GFLAAGCBNGM_VERSION_NONE;
      case 1: return GFLAAGCBNGM_V50;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GFLAAGCBNGM>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GFLAAGCBNGM> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GFLAAGCBNGM>() {
          public GFLAAGCBNGM findValueByNumber(int number) {
            return GFLAAGCBNGM.forNumber(number);
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
    return io.grasscutter.net.proto.social.Social.getDescriptor().getEnumTypes().get(1);
  }

  private static final GFLAAGCBNGM[] VALUES = values();

  public static GFLAAGCBNGM valueOf(
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

  private GFLAAGCBNGM(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:GFLAAGCBNGM)
}

