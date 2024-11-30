// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ability.proto

package io.grasscutter.net.proto.ability;

/**
 * <pre>
 * CmdId: 5798
 * </pre>
 *
 * Protobuf type {@code AbilityChangeNotify}
 */
public final class AbilityChangeNotify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AbilityChangeNotify)
    AbilityChangeNotifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AbilityChangeNotify.newBuilder() to construct.
  private AbilityChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbilityChangeNotify() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AbilityChangeNotify();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AbilityChangeNotify(
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
          case 74: {
            io.grasscutter.net.proto.define.AbilityControlBlock.Builder subBuilder = null;
            if (abilityControlBlock_ != null) {
              subBuilder = abilityControlBlock_.toBuilder();
            }
            abilityControlBlock_ = input.readMessage(io.grasscutter.net.proto.define.AbilityControlBlock.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abilityControlBlock_);
              abilityControlBlock_ = subBuilder.buildPartial();
            }

            break;
          }
          case 96: {

            entityId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityChangeNotify_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityChangeNotify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.ability.AbilityChangeNotify.class, io.grasscutter.net.proto.ability.AbilityChangeNotify.Builder.class);
  }

  public static final int ABILITY_CONTROL_BLOCK_FIELD_NUMBER = 9;
  private io.grasscutter.net.proto.define.AbilityControlBlock abilityControlBlock_;
  /**
   * <code>.AbilityControlBlock ability_control_block = 9;</code>
   * @return Whether the abilityControlBlock field is set.
   */
  @java.lang.Override
  public boolean hasAbilityControlBlock() {
    return abilityControlBlock_ != null;
  }
  /**
   * <code>.AbilityControlBlock ability_control_block = 9;</code>
   * @return The abilityControlBlock.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.AbilityControlBlock getAbilityControlBlock() {
    return abilityControlBlock_ == null ? io.grasscutter.net.proto.define.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
  }
  /**
   * <code>.AbilityControlBlock ability_control_block = 9;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
    return getAbilityControlBlock();
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 12;
  private int entityId_;
  /**
   * <code>uint32 entity_id = 12;</code>
   * @return The entityId.
   */
  @java.lang.Override
  public int getEntityId() {
    return entityId_;
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
    if (abilityControlBlock_ != null) {
      output.writeMessage(9, getAbilityControlBlock());
    }
    if (entityId_ != 0) {
      output.writeUInt32(12, entityId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abilityControlBlock_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, getAbilityControlBlock());
    }
    if (entityId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, entityId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.ability.AbilityChangeNotify)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.ability.AbilityChangeNotify other = (io.grasscutter.net.proto.ability.AbilityChangeNotify) obj;

    if (hasAbilityControlBlock() != other.hasAbilityControlBlock()) return false;
    if (hasAbilityControlBlock()) {
      if (!getAbilityControlBlock()
          .equals(other.getAbilityControlBlock())) return false;
    }
    if (getEntityId()
        != other.getEntityId()) return false;
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
    if (hasAbilityControlBlock()) {
      hash = (37 * hash) + ABILITY_CONTROL_BLOCK_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityControlBlock().hashCode();
    }
    hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.ability.AbilityChangeNotify parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.ability.AbilityChangeNotify prototype) {
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
   * <pre>
   * CmdId: 5798
   * </pre>
   *
   * Protobuf type {@code AbilityChangeNotify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AbilityChangeNotify)
      io.grasscutter.net.proto.ability.AbilityChangeNotifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.ability.AbilityChangeNotify.class, io.grasscutter.net.proto.ability.AbilityChangeNotify.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.ability.AbilityChangeNotify.newBuilder()
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
      if (abilityControlBlockBuilder_ == null) {
        abilityControlBlock_ = null;
      } else {
        abilityControlBlock_ = null;
        abilityControlBlockBuilder_ = null;
      }
      entityId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.ability.Ability.internal_static_AbilityChangeNotify_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.ability.AbilityChangeNotify getDefaultInstanceForType() {
      return io.grasscutter.net.proto.ability.AbilityChangeNotify.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.ability.AbilityChangeNotify build() {
      io.grasscutter.net.proto.ability.AbilityChangeNotify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.ability.AbilityChangeNotify buildPartial() {
      io.grasscutter.net.proto.ability.AbilityChangeNotify result = new io.grasscutter.net.proto.ability.AbilityChangeNotify(this);
      if (abilityControlBlockBuilder_ == null) {
        result.abilityControlBlock_ = abilityControlBlock_;
      } else {
        result.abilityControlBlock_ = abilityControlBlockBuilder_.build();
      }
      result.entityId_ = entityId_;
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
      if (other instanceof io.grasscutter.net.proto.ability.AbilityChangeNotify) {
        return mergeFrom((io.grasscutter.net.proto.ability.AbilityChangeNotify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.ability.AbilityChangeNotify other) {
      if (other == io.grasscutter.net.proto.ability.AbilityChangeNotify.getDefaultInstance()) return this;
      if (other.hasAbilityControlBlock()) {
        mergeAbilityControlBlock(other.getAbilityControlBlock());
      }
      if (other.getEntityId() != 0) {
        setEntityId(other.getEntityId());
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
      io.grasscutter.net.proto.ability.AbilityChangeNotify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.ability.AbilityChangeNotify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grasscutter.net.proto.define.AbilityControlBlock abilityControlBlock_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.AbilityControlBlock, io.grasscutter.net.proto.define.AbilityControlBlock.Builder, io.grasscutter.net.proto.define.AbilityControlBlockOrBuilder> abilityControlBlockBuilder_;
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    public boolean hasAbilityControlBlock() {
      return abilityControlBlockBuilder_ != null || abilityControlBlock_ != null;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     * @return The abilityControlBlock.
     */
    public io.grasscutter.net.proto.define.AbilityControlBlock getAbilityControlBlock() {
      if (abilityControlBlockBuilder_ == null) {
        return abilityControlBlock_ == null ? io.grasscutter.net.proto.define.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
      } else {
        return abilityControlBlockBuilder_.getMessage();
      }
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     */
    public Builder setAbilityControlBlock(io.grasscutter.net.proto.define.AbilityControlBlock value) {
      if (abilityControlBlockBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abilityControlBlock_ = value;
        onChanged();
      } else {
        abilityControlBlockBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     */
    public Builder setAbilityControlBlock(
        io.grasscutter.net.proto.define.AbilityControlBlock.Builder builderForValue) {
      if (abilityControlBlockBuilder_ == null) {
        abilityControlBlock_ = builderForValue.build();
        onChanged();
      } else {
        abilityControlBlockBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     */
    public Builder mergeAbilityControlBlock(io.grasscutter.net.proto.define.AbilityControlBlock value) {
      if (abilityControlBlockBuilder_ == null) {
        if (abilityControlBlock_ != null) {
          abilityControlBlock_ =
            io.grasscutter.net.proto.define.AbilityControlBlock.newBuilder(abilityControlBlock_).mergeFrom(value).buildPartial();
        } else {
          abilityControlBlock_ = value;
        }
        onChanged();
      } else {
        abilityControlBlockBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     */
    public Builder clearAbilityControlBlock() {
      if (abilityControlBlockBuilder_ == null) {
        abilityControlBlock_ = null;
        onChanged();
      } else {
        abilityControlBlock_ = null;
        abilityControlBlockBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     */
    public io.grasscutter.net.proto.define.AbilityControlBlock.Builder getAbilityControlBlockBuilder() {
      
      onChanged();
      return getAbilityControlBlockFieldBuilder().getBuilder();
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     */
    public io.grasscutter.net.proto.define.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
      if (abilityControlBlockBuilder_ != null) {
        return abilityControlBlockBuilder_.getMessageOrBuilder();
      } else {
        return abilityControlBlock_ == null ?
            io.grasscutter.net.proto.define.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
      }
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 9;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.AbilityControlBlock, io.grasscutter.net.proto.define.AbilityControlBlock.Builder, io.grasscutter.net.proto.define.AbilityControlBlockOrBuilder> 
        getAbilityControlBlockFieldBuilder() {
      if (abilityControlBlockBuilder_ == null) {
        abilityControlBlockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.define.AbilityControlBlock, io.grasscutter.net.proto.define.AbilityControlBlock.Builder, io.grasscutter.net.proto.define.AbilityControlBlockOrBuilder>(
                getAbilityControlBlock(),
                getParentForChildren(),
                isClean());
        abilityControlBlock_ = null;
      }
      return abilityControlBlockBuilder_;
    }

    private int entityId_ ;
    /**
     * <code>uint32 entity_id = 12;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }
    /**
     * <code>uint32 entity_id = 12;</code>
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(int value) {
      
      entityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 entity_id = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityId() {
      
      entityId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:AbilityChangeNotify)
  }

  // @@protoc_insertion_point(class_scope:AbilityChangeNotify)
  private static final io.grasscutter.net.proto.ability.AbilityChangeNotify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.ability.AbilityChangeNotify();
  }

  public static io.grasscutter.net.proto.ability.AbilityChangeNotify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbilityChangeNotify>
      PARSER = new com.google.protobuf.AbstractParser<AbilityChangeNotify>() {
    @java.lang.Override
    public AbilityChangeNotify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AbilityChangeNotify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbilityChangeNotify> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbilityChangeNotify> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.ability.AbilityChangeNotify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

