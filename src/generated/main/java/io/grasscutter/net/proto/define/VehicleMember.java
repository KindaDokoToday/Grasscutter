// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code VehicleMember}
 */
public final class VehicleMember extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VehicleMember)
    VehicleMemberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VehicleMember.newBuilder() to construct.
  private VehicleMember(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VehicleMember() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VehicleMember();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VehicleMember(
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

            uid_ = input.readUInt32();
            break;
          }
          case 16: {

            avatarGuid_ = input.readUInt64();
            break;
          }
          case 24: {

            pos_ = input.readUInt32();
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
    return io.grasscutter.net.proto.define.Define.internal_static_VehicleMember_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_VehicleMember_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.VehicleMember.class, io.grasscutter.net.proto.define.VehicleMember.Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;
  private int uid_;
  /**
   * <code>uint32 uid = 1;</code>
   * @return The uid.
   */
  @java.lang.Override
  public int getUid() {
    return uid_;
  }

  public static final int POS_FIELD_NUMBER = 3;
  private int pos_;
  /**
   * <code>uint32 pos = 3;</code>
   * @return The pos.
   */
  @java.lang.Override
  public int getPos() {
    return pos_;
  }

  public static final int AVATAR_GUID_FIELD_NUMBER = 2;
  private long avatarGuid_;
  /**
   * <code>uint64 avatar_guid = 2;</code>
   * @return The avatarGuid.
   */
  @java.lang.Override
  public long getAvatarGuid() {
    return avatarGuid_;
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
    if (uid_ != 0) {
      output.writeUInt32(1, uid_);
    }
    if (avatarGuid_ != 0L) {
      output.writeUInt64(2, avatarGuid_);
    }
    if (pos_ != 0) {
      output.writeUInt32(3, pos_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, uid_);
    }
    if (avatarGuid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, avatarGuid_);
    }
    if (pos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, pos_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.VehicleMember)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.VehicleMember other = (io.grasscutter.net.proto.define.VehicleMember) obj;

    if (getUid()
        != other.getUid()) return false;
    if (getPos()
        != other.getPos()) return false;
    if (getAvatarGuid()
        != other.getAvatarGuid()) return false;
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
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + getUid();
    hash = (37 * hash) + POS_FIELD_NUMBER;
    hash = (53 * hash) + getPos();
    hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAvatarGuid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.VehicleMember parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.VehicleMember prototype) {
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
   * Protobuf type {@code VehicleMember}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VehicleMember)
      io.grasscutter.net.proto.define.VehicleMemberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_VehicleMember_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_VehicleMember_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.VehicleMember.class, io.grasscutter.net.proto.define.VehicleMember.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.VehicleMember.newBuilder()
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
      uid_ = 0;

      pos_ = 0;

      avatarGuid_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_VehicleMember_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.VehicleMember getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.VehicleMember.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.VehicleMember build() {
      io.grasscutter.net.proto.define.VehicleMember result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.VehicleMember buildPartial() {
      io.grasscutter.net.proto.define.VehicleMember result = new io.grasscutter.net.proto.define.VehicleMember(this);
      result.uid_ = uid_;
      result.pos_ = pos_;
      result.avatarGuid_ = avatarGuid_;
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
      if (other instanceof io.grasscutter.net.proto.define.VehicleMember) {
        return mergeFrom((io.grasscutter.net.proto.define.VehicleMember)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.VehicleMember other) {
      if (other == io.grasscutter.net.proto.define.VehicleMember.getDefaultInstance()) return this;
      if (other.getUid() != 0) {
        setUid(other.getUid());
      }
      if (other.getPos() != 0) {
        setPos(other.getPos());
      }
      if (other.getAvatarGuid() != 0L) {
        setAvatarGuid(other.getAvatarGuid());
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
      io.grasscutter.net.proto.define.VehicleMember parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.VehicleMember) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int uid_ ;
    /**
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }
    /**
     * <code>uint32 uid = 1;</code>
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(int value) {
      
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 uid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      
      uid_ = 0;
      onChanged();
      return this;
    }

    private int pos_ ;
    /**
     * <code>uint32 pos = 3;</code>
     * @return The pos.
     */
    @java.lang.Override
    public int getPos() {
      return pos_;
    }
    /**
     * <code>uint32 pos = 3;</code>
     * @param value The pos to set.
     * @return This builder for chaining.
     */
    public Builder setPos(int value) {
      
      pos_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 pos = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPos() {
      
      pos_ = 0;
      onChanged();
      return this;
    }

    private long avatarGuid_ ;
    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }
    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @param value The avatarGuid to set.
     * @return This builder for chaining.
     */
    public Builder setAvatarGuid(long value) {
      
      avatarGuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvatarGuid() {
      
      avatarGuid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:VehicleMember)
  }

  // @@protoc_insertion_point(class_scope:VehicleMember)
  private static final io.grasscutter.net.proto.define.VehicleMember DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.VehicleMember();
  }

  public static io.grasscutter.net.proto.define.VehicleMember getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VehicleMember>
      PARSER = new com.google.protobuf.AbstractParser<VehicleMember>() {
    @java.lang.Override
    public VehicleMember parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VehicleMember(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VehicleMember> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VehicleMember> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.VehicleMember getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

