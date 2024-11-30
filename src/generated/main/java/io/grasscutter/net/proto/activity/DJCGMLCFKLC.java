// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code DJCGMLCFKLC}
 */
public final class DJCGMLCFKLC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DJCGMLCFKLC)
    DJCGMLCFKLCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DJCGMLCFKLC.newBuilder() to construct.
  private DJCGMLCFKLC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DJCGMLCFKLC() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DJCGMLCFKLC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DJCGMLCFKLC(
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
          case 56: {

            configId_ = input.readUInt32();
            break;
          }
          case 90: {
            io.grasscutter.net.proto.define.Vector.Builder subBuilder = null;
            if (pos_ != null) {
              subBuilder = pos_.toBuilder();
            }
            pos_ = input.readMessage(io.grasscutter.net.proto.define.Vector.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pos_);
              pos_ = subBuilder.buildPartial();
            }

            break;
          }
          case 104: {

            groupId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_DJCGMLCFKLC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_DJCGMLCFKLC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.DJCGMLCFKLC.class, io.grasscutter.net.proto.activity.DJCGMLCFKLC.Builder.class);
  }

  public static final int POS_FIELD_NUMBER = 11;
  private io.grasscutter.net.proto.define.Vector pos_;
  /**
   * <code>.Vector pos = 11;</code>
   * @return Whether the pos field is set.
   */
  @java.lang.Override
  public boolean hasPos() {
    return pos_ != null;
  }
  /**
   * <code>.Vector pos = 11;</code>
   * @return The pos.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.Vector getPos() {
    return pos_ == null ? io.grasscutter.net.proto.define.Vector.getDefaultInstance() : pos_;
  }
  /**
   * <code>.Vector pos = 11;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.VectorOrBuilder getPosOrBuilder() {
    return getPos();
  }

  public static final int GROUP_ID_FIELD_NUMBER = 13;
  private int groupId_;
  /**
   * <code>uint32 group_id = 13;</code>
   * @return The groupId.
   */
  @java.lang.Override
  public int getGroupId() {
    return groupId_;
  }

  public static final int CONFIG_ID_FIELD_NUMBER = 7;
  private int configId_;
  /**
   * <code>uint32 config_id = 7;</code>
   * @return The configId.
   */
  @java.lang.Override
  public int getConfigId() {
    return configId_;
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
    if (configId_ != 0) {
      output.writeUInt32(7, configId_);
    }
    if (pos_ != null) {
      output.writeMessage(11, getPos());
    }
    if (groupId_ != 0) {
      output.writeUInt32(13, groupId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, configId_);
    }
    if (pos_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, getPos());
    }
    if (groupId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, groupId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.DJCGMLCFKLC)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.DJCGMLCFKLC other = (io.grasscutter.net.proto.activity.DJCGMLCFKLC) obj;

    if (hasPos() != other.hasPos()) return false;
    if (hasPos()) {
      if (!getPos()
          .equals(other.getPos())) return false;
    }
    if (getGroupId()
        != other.getGroupId()) return false;
    if (getConfigId()
        != other.getConfigId()) return false;
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
    if (hasPos()) {
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPos().hashCode();
    }
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId();
    hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConfigId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.DJCGMLCFKLC prototype) {
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
   * Protobuf type {@code DJCGMLCFKLC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DJCGMLCFKLC)
      io.grasscutter.net.proto.activity.DJCGMLCFKLCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DJCGMLCFKLC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DJCGMLCFKLC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.DJCGMLCFKLC.class, io.grasscutter.net.proto.activity.DJCGMLCFKLC.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.DJCGMLCFKLC.newBuilder()
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
      if (posBuilder_ == null) {
        pos_ = null;
      } else {
        pos_ = null;
        posBuilder_ = null;
      }
      groupId_ = 0;

      configId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DJCGMLCFKLC_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DJCGMLCFKLC getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.DJCGMLCFKLC.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DJCGMLCFKLC build() {
      io.grasscutter.net.proto.activity.DJCGMLCFKLC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DJCGMLCFKLC buildPartial() {
      io.grasscutter.net.proto.activity.DJCGMLCFKLC result = new io.grasscutter.net.proto.activity.DJCGMLCFKLC(this);
      if (posBuilder_ == null) {
        result.pos_ = pos_;
      } else {
        result.pos_ = posBuilder_.build();
      }
      result.groupId_ = groupId_;
      result.configId_ = configId_;
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
      if (other instanceof io.grasscutter.net.proto.activity.DJCGMLCFKLC) {
        return mergeFrom((io.grasscutter.net.proto.activity.DJCGMLCFKLC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.DJCGMLCFKLC other) {
      if (other == io.grasscutter.net.proto.activity.DJCGMLCFKLC.getDefaultInstance()) return this;
      if (other.hasPos()) {
        mergePos(other.getPos());
      }
      if (other.getGroupId() != 0) {
        setGroupId(other.getGroupId());
      }
      if (other.getConfigId() != 0) {
        setConfigId(other.getConfigId());
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
      io.grasscutter.net.proto.activity.DJCGMLCFKLC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.DJCGMLCFKLC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grasscutter.net.proto.define.Vector pos_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder> posBuilder_;
    /**
     * <code>.Vector pos = 11;</code>
     * @return Whether the pos field is set.
     */
    public boolean hasPos() {
      return posBuilder_ != null || pos_ != null;
    }
    /**
     * <code>.Vector pos = 11;</code>
     * @return The pos.
     */
    public io.grasscutter.net.proto.define.Vector getPos() {
      if (posBuilder_ == null) {
        return pos_ == null ? io.grasscutter.net.proto.define.Vector.getDefaultInstance() : pos_;
      } else {
        return posBuilder_.getMessage();
      }
    }
    /**
     * <code>.Vector pos = 11;</code>
     */
    public Builder setPos(io.grasscutter.net.proto.define.Vector value) {
      if (posBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pos_ = value;
        onChanged();
      } else {
        posBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Vector pos = 11;</code>
     */
    public Builder setPos(
        io.grasscutter.net.proto.define.Vector.Builder builderForValue) {
      if (posBuilder_ == null) {
        pos_ = builderForValue.build();
        onChanged();
      } else {
        posBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Vector pos = 11;</code>
     */
    public Builder mergePos(io.grasscutter.net.proto.define.Vector value) {
      if (posBuilder_ == null) {
        if (pos_ != null) {
          pos_ =
            io.grasscutter.net.proto.define.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
        } else {
          pos_ = value;
        }
        onChanged();
      } else {
        posBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Vector pos = 11;</code>
     */
    public Builder clearPos() {
      if (posBuilder_ == null) {
        pos_ = null;
        onChanged();
      } else {
        pos_ = null;
        posBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Vector pos = 11;</code>
     */
    public io.grasscutter.net.proto.define.Vector.Builder getPosBuilder() {
      
      onChanged();
      return getPosFieldBuilder().getBuilder();
    }
    /**
     * <code>.Vector pos = 11;</code>
     */
    public io.grasscutter.net.proto.define.VectorOrBuilder getPosOrBuilder() {
      if (posBuilder_ != null) {
        return posBuilder_.getMessageOrBuilder();
      } else {
        return pos_ == null ?
            io.grasscutter.net.proto.define.Vector.getDefaultInstance() : pos_;
      }
    }
    /**
     * <code>.Vector pos = 11;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder> 
        getPosFieldBuilder() {
      if (posBuilder_ == null) {
        posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder>(
                getPos(),
                getParentForChildren(),
                isClean());
        pos_ = null;
      }
      return posBuilder_;
    }

    private int groupId_ ;
    /**
     * <code>uint32 group_id = 13;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }
    /**
     * <code>uint32 group_id = 13;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(int value) {
      
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 group_id = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      
      groupId_ = 0;
      onChanged();
      return this;
    }

    private int configId_ ;
    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }
    /**
     * <code>uint32 config_id = 7;</code>
     * @param value The configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigId(int value) {
      
      configId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 config_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfigId() {
      
      configId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:DJCGMLCFKLC)
  }

  // @@protoc_insertion_point(class_scope:DJCGMLCFKLC)
  private static final io.grasscutter.net.proto.activity.DJCGMLCFKLC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.DJCGMLCFKLC();
  }

  public static io.grasscutter.net.proto.activity.DJCGMLCFKLC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DJCGMLCFKLC>
      PARSER = new com.google.protobuf.AbstractParser<DJCGMLCFKLC>() {
    @java.lang.Override
    public DJCGMLCFKLC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DJCGMLCFKLC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DJCGMLCFKLC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DJCGMLCFKLC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.DJCGMLCFKLC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

