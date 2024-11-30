// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quest.proto

package io.grasscutter.net.proto.quest;

/**
 * <pre>
 * CmdId: 5859
 * </pre>
 *
 * Protobuf type {@code FinishedParentQuestUpdateNotify}
 */
public final class FinishedParentQuestUpdateNotify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FinishedParentQuestUpdateNotify)
    FinishedParentQuestUpdateNotifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FinishedParentQuestUpdateNotify.newBuilder() to construct.
  private FinishedParentQuestUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FinishedParentQuestUpdateNotify() {
    parentQuestList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FinishedParentQuestUpdateNotify();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FinishedParentQuestUpdateNotify(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 98: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              parentQuestList_ = new java.util.ArrayList<io.grasscutter.net.proto.quest.ParentQuest>();
              mutable_bitField0_ |= 0x00000001;
            }
            parentQuestList_.add(
                input.readMessage(io.grasscutter.net.proto.quest.ParentQuest.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        parentQuestList_ = java.util.Collections.unmodifiableList(parentQuestList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.quest.Quest.internal_static_FinishedParentQuestUpdateNotify_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.quest.Quest.internal_static_FinishedParentQuestUpdateNotify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify.class, io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify.Builder.class);
  }

  public static final int PARENT_QUEST_LIST_FIELD_NUMBER = 12;
  private java.util.List<io.grasscutter.net.proto.quest.ParentQuest> parentQuestList_;
  /**
   * <code>repeated .ParentQuest parent_quest_list = 12;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.quest.ParentQuest> getParentQuestListList() {
    return parentQuestList_;
  }
  /**
   * <code>repeated .ParentQuest parent_quest_list = 12;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.quest.ParentQuestOrBuilder> 
      getParentQuestListOrBuilderList() {
    return parentQuestList_;
  }
  /**
   * <code>repeated .ParentQuest parent_quest_list = 12;</code>
   */
  @java.lang.Override
  public int getParentQuestListCount() {
    return parentQuestList_.size();
  }
  /**
   * <code>repeated .ParentQuest parent_quest_list = 12;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.quest.ParentQuest getParentQuestList(int index) {
    return parentQuestList_.get(index);
  }
  /**
   * <code>repeated .ParentQuest parent_quest_list = 12;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.quest.ParentQuestOrBuilder getParentQuestListOrBuilder(
      int index) {
    return parentQuestList_.get(index);
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
    for (int i = 0; i < parentQuestList_.size(); i++) {
      output.writeMessage(12, parentQuestList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < parentQuestList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(12, parentQuestList_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify other = (io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify) obj;

    if (!getParentQuestListList()
        .equals(other.getParentQuestListList())) return false;
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
    if (getParentQuestListCount() > 0) {
      hash = (37 * hash) + PARENT_QUEST_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify prototype) {
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
   * CmdId: 5859
   * </pre>
   *
   * Protobuf type {@code FinishedParentQuestUpdateNotify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FinishedParentQuestUpdateNotify)
      io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_FinishedParentQuestUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_FinishedParentQuestUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify.class, io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify.newBuilder()
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
        getParentQuestListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (parentQuestListBuilder_ == null) {
        parentQuestList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        parentQuestListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.quest.Quest.internal_static_FinishedParentQuestUpdateNotify_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify getDefaultInstanceForType() {
      return io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify build() {
      io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify buildPartial() {
      io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify result = new io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify(this);
      int from_bitField0_ = bitField0_;
      if (parentQuestListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          parentQuestList_ = java.util.Collections.unmodifiableList(parentQuestList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.parentQuestList_ = parentQuestList_;
      } else {
        result.parentQuestList_ = parentQuestListBuilder_.build();
      }
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
      if (other instanceof io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify) {
        return mergeFrom((io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify other) {
      if (other == io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify.getDefaultInstance()) return this;
      if (parentQuestListBuilder_ == null) {
        if (!other.parentQuestList_.isEmpty()) {
          if (parentQuestList_.isEmpty()) {
            parentQuestList_ = other.parentQuestList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParentQuestListIsMutable();
            parentQuestList_.addAll(other.parentQuestList_);
          }
          onChanged();
        }
      } else {
        if (!other.parentQuestList_.isEmpty()) {
          if (parentQuestListBuilder_.isEmpty()) {
            parentQuestListBuilder_.dispose();
            parentQuestListBuilder_ = null;
            parentQuestList_ = other.parentQuestList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            parentQuestListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParentQuestListFieldBuilder() : null;
          } else {
            parentQuestListBuilder_.addAllMessages(other.parentQuestList_);
          }
        }
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
      io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.quest.ParentQuest> parentQuestList_ =
      java.util.Collections.emptyList();
    private void ensureParentQuestListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        parentQuestList_ = new java.util.ArrayList<io.grasscutter.net.proto.quest.ParentQuest>(parentQuestList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.quest.ParentQuest, io.grasscutter.net.proto.quest.ParentQuest.Builder, io.grasscutter.net.proto.quest.ParentQuestOrBuilder> parentQuestListBuilder_;

    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public java.util.List<io.grasscutter.net.proto.quest.ParentQuest> getParentQuestListList() {
      if (parentQuestListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parentQuestList_);
      } else {
        return parentQuestListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public int getParentQuestListCount() {
      if (parentQuestListBuilder_ == null) {
        return parentQuestList_.size();
      } else {
        return parentQuestListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public io.grasscutter.net.proto.quest.ParentQuest getParentQuestList(int index) {
      if (parentQuestListBuilder_ == null) {
        return parentQuestList_.get(index);
      } else {
        return parentQuestListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder setParentQuestList(
        int index, io.grasscutter.net.proto.quest.ParentQuest value) {
      if (parentQuestListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParentQuestListIsMutable();
        parentQuestList_.set(index, value);
        onChanged();
      } else {
        parentQuestListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder setParentQuestList(
        int index, io.grasscutter.net.proto.quest.ParentQuest.Builder builderForValue) {
      if (parentQuestListBuilder_ == null) {
        ensureParentQuestListIsMutable();
        parentQuestList_.set(index, builderForValue.build());
        onChanged();
      } else {
        parentQuestListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder addParentQuestList(io.grasscutter.net.proto.quest.ParentQuest value) {
      if (parentQuestListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParentQuestListIsMutable();
        parentQuestList_.add(value);
        onChanged();
      } else {
        parentQuestListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder addParentQuestList(
        int index, io.grasscutter.net.proto.quest.ParentQuest value) {
      if (parentQuestListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParentQuestListIsMutable();
        parentQuestList_.add(index, value);
        onChanged();
      } else {
        parentQuestListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder addParentQuestList(
        io.grasscutter.net.proto.quest.ParentQuest.Builder builderForValue) {
      if (parentQuestListBuilder_ == null) {
        ensureParentQuestListIsMutable();
        parentQuestList_.add(builderForValue.build());
        onChanged();
      } else {
        parentQuestListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder addParentQuestList(
        int index, io.grasscutter.net.proto.quest.ParentQuest.Builder builderForValue) {
      if (parentQuestListBuilder_ == null) {
        ensureParentQuestListIsMutable();
        parentQuestList_.add(index, builderForValue.build());
        onChanged();
      } else {
        parentQuestListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder addAllParentQuestList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.quest.ParentQuest> values) {
      if (parentQuestListBuilder_ == null) {
        ensureParentQuestListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parentQuestList_);
        onChanged();
      } else {
        parentQuestListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder clearParentQuestList() {
      if (parentQuestListBuilder_ == null) {
        parentQuestList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        parentQuestListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public Builder removeParentQuestList(int index) {
      if (parentQuestListBuilder_ == null) {
        ensureParentQuestListIsMutable();
        parentQuestList_.remove(index);
        onChanged();
      } else {
        parentQuestListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public io.grasscutter.net.proto.quest.ParentQuest.Builder getParentQuestListBuilder(
        int index) {
      return getParentQuestListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public io.grasscutter.net.proto.quest.ParentQuestOrBuilder getParentQuestListOrBuilder(
        int index) {
      if (parentQuestListBuilder_ == null) {
        return parentQuestList_.get(index);  } else {
        return parentQuestListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.quest.ParentQuestOrBuilder> 
         getParentQuestListOrBuilderList() {
      if (parentQuestListBuilder_ != null) {
        return parentQuestListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parentQuestList_);
      }
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public io.grasscutter.net.proto.quest.ParentQuest.Builder addParentQuestListBuilder() {
      return getParentQuestListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.quest.ParentQuest.getDefaultInstance());
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public io.grasscutter.net.proto.quest.ParentQuest.Builder addParentQuestListBuilder(
        int index) {
      return getParentQuestListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.quest.ParentQuest.getDefaultInstance());
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 12;</code>
     */
    public java.util.List<io.grasscutter.net.proto.quest.ParentQuest.Builder> 
         getParentQuestListBuilderList() {
      return getParentQuestListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.quest.ParentQuest, io.grasscutter.net.proto.quest.ParentQuest.Builder, io.grasscutter.net.proto.quest.ParentQuestOrBuilder> 
        getParentQuestListFieldBuilder() {
      if (parentQuestListBuilder_ == null) {
        parentQuestListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.quest.ParentQuest, io.grasscutter.net.proto.quest.ParentQuest.Builder, io.grasscutter.net.proto.quest.ParentQuestOrBuilder>(
                parentQuestList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        parentQuestList_ = null;
      }
      return parentQuestListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:FinishedParentQuestUpdateNotify)
  }

  // @@protoc_insertion_point(class_scope:FinishedParentQuestUpdateNotify)
  private static final io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify();
  }

  public static io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FinishedParentQuestUpdateNotify>
      PARSER = new com.google.protobuf.AbstractParser<FinishedParentQuestUpdateNotify>() {
    @java.lang.Override
    public FinishedParentQuestUpdateNotify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FinishedParentQuestUpdateNotify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FinishedParentQuestUpdateNotify> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FinishedParentQuestUpdateNotify> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.quest.FinishedParentQuestUpdateNotify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

