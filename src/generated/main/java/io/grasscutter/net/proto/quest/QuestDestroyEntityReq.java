// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quest.proto

package io.grasscutter.net.proto.quest;

/**
 * <pre>
 * CmdId: 26354
 * </pre>
 *
 * Protobuf type {@code QuestDestroyEntityReq}
 */
public final class QuestDestroyEntityReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:QuestDestroyEntityReq)
    QuestDestroyEntityReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuestDestroyEntityReq.newBuilder() to construct.
  private QuestDestroyEntityReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuestDestroyEntityReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuestDestroyEntityReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuestDestroyEntityReq(
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
          case 32: {

            entityId_ = input.readUInt32();
            break;
          }
          case 72: {

            questId_ = input.readUInt32();
            break;
          }
          case 104: {

            sceneId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.quest.Quest.internal_static_QuestDestroyEntityReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.quest.Quest.internal_static_QuestDestroyEntityReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.quest.QuestDestroyEntityReq.class, io.grasscutter.net.proto.quest.QuestDestroyEntityReq.Builder.class);
  }

  public static final int QUEST_ID_FIELD_NUMBER = 9;
  private int questId_;
  /**
   * <code>uint32 quest_id = 9;</code>
   * @return The questId.
   */
  @java.lang.Override
  public int getQuestId() {
    return questId_;
  }

  public static final int SCENE_ID_FIELD_NUMBER = 13;
  private int sceneId_;
  /**
   * <code>uint32 scene_id = 13;</code>
   * @return The sceneId.
   */
  @java.lang.Override
  public int getSceneId() {
    return sceneId_;
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 4;
  private int entityId_;
  /**
   * <code>uint32 entity_id = 4;</code>
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
    if (entityId_ != 0) {
      output.writeUInt32(4, entityId_);
    }
    if (questId_ != 0) {
      output.writeUInt32(9, questId_);
    }
    if (sceneId_ != 0) {
      output.writeUInt32(13, sceneId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entityId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, entityId_);
    }
    if (questId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, questId_);
    }
    if (sceneId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, sceneId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.quest.QuestDestroyEntityReq)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.quest.QuestDestroyEntityReq other = (io.grasscutter.net.proto.quest.QuestDestroyEntityReq) obj;

    if (getQuestId()
        != other.getQuestId()) return false;
    if (getSceneId()
        != other.getSceneId()) return false;
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
    hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQuestId();
    hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSceneId();
    hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.quest.QuestDestroyEntityReq prototype) {
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
   * CmdId: 26354
   * </pre>
   *
   * Protobuf type {@code QuestDestroyEntityReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:QuestDestroyEntityReq)
      io.grasscutter.net.proto.quest.QuestDestroyEntityReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_QuestDestroyEntityReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_QuestDestroyEntityReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.quest.QuestDestroyEntityReq.class, io.grasscutter.net.proto.quest.QuestDestroyEntityReq.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.quest.QuestDestroyEntityReq.newBuilder()
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
      questId_ = 0;

      sceneId_ = 0;

      entityId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_QuestDestroyEntityReq_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.QuestDestroyEntityReq getDefaultInstanceForType() {
      return io.grasscutter.net.proto.quest.QuestDestroyEntityReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.QuestDestroyEntityReq build() {
      io.grasscutter.net.proto.quest.QuestDestroyEntityReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.QuestDestroyEntityReq buildPartial() {
      io.grasscutter.net.proto.quest.QuestDestroyEntityReq result = new io.grasscutter.net.proto.quest.QuestDestroyEntityReq(this);
      result.questId_ = questId_;
      result.sceneId_ = sceneId_;
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
      if (other instanceof io.grasscutter.net.proto.quest.QuestDestroyEntityReq) {
        return mergeFrom((io.grasscutter.net.proto.quest.QuestDestroyEntityReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.quest.QuestDestroyEntityReq other) {
      if (other == io.grasscutter.net.proto.quest.QuestDestroyEntityReq.getDefaultInstance()) return this;
      if (other.getQuestId() != 0) {
        setQuestId(other.getQuestId());
      }
      if (other.getSceneId() != 0) {
        setSceneId(other.getSceneId());
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
      io.grasscutter.net.proto.quest.QuestDestroyEntityReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.quest.QuestDestroyEntityReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int questId_ ;
    /**
     * <code>uint32 quest_id = 9;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }
    /**
     * <code>uint32 quest_id = 9;</code>
     * @param value The questId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestId(int value) {
      
      questId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 quest_id = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestId() {
      
      questId_ = 0;
      onChanged();
      return this;
    }

    private int sceneId_ ;
    /**
     * <code>uint32 scene_id = 13;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }
    /**
     * <code>uint32 scene_id = 13;</code>
     * @param value The sceneId to set.
     * @return This builder for chaining.
     */
    public Builder setSceneId(int value) {
      
      sceneId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 scene_id = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearSceneId() {
      
      sceneId_ = 0;
      onChanged();
      return this;
    }

    private int entityId_ ;
    /**
     * <code>uint32 entity_id = 4;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }
    /**
     * <code>uint32 entity_id = 4;</code>
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(int value) {
      
      entityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 entity_id = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:QuestDestroyEntityReq)
  }

  // @@protoc_insertion_point(class_scope:QuestDestroyEntityReq)
  private static final io.grasscutter.net.proto.quest.QuestDestroyEntityReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.quest.QuestDestroyEntityReq();
  }

  public static io.grasscutter.net.proto.quest.QuestDestroyEntityReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuestDestroyEntityReq>
      PARSER = new com.google.protobuf.AbstractParser<QuestDestroyEntityReq>() {
    @java.lang.Override
    public QuestDestroyEntityReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuestDestroyEntityReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuestDestroyEntityReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuestDestroyEntityReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.quest.QuestDestroyEntityReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

