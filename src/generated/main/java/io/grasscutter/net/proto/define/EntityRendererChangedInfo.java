// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code EntityRendererChangedInfo}
 */
public final class EntityRendererChangedInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EntityRendererChangedInfo)
    EntityRendererChangedInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityRendererChangedInfo.newBuilder() to construct.
  private EntityRendererChangedInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityRendererChangedInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EntityRendererChangedInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntityRendererChangedInfo(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              changedRenderers_ = com.google.protobuf.MapField.newMapField(
                  ChangedRenderersDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
            changedRenderers__ = input.readMessage(
                ChangedRenderersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            changedRenderers_.getMutableMap().put(
                changedRenderers__.getKey(), changedRenderers__.getValue());
            break;
          }
          case 16: {

            visibilityCount_ = input.readUInt32();
            break;
          }
          case 24: {

            isCached_ = input.readBool();
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
    return io.grasscutter.net.proto.define.Define.internal_static_EntityRendererChangedInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetChangedRenderers();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_EntityRendererChangedInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.EntityRendererChangedInfo.class, io.grasscutter.net.proto.define.EntityRendererChangedInfo.Builder.class);
  }

  public static final int CHANGED_RENDERERS_FIELD_NUMBER = 1;
  private static final class ChangedRenderersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Integer>newDefaultInstance(
                io.grasscutter.net.proto.define.Define.internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Integer> changedRenderers_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
  internalGetChangedRenderers() {
    if (changedRenderers_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ChangedRenderersDefaultEntryHolder.defaultEntry);
    }
    return changedRenderers_;
  }

  public int getChangedRenderersCount() {
    return internalGetChangedRenderers().getMap().size();
  }
  /**
   * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
   */

  @java.lang.Override
  public boolean containsChangedRenderers(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetChangedRenderers().getMap().containsKey(key);
  }
  /**
   * Use {@link #getChangedRenderersMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Integer> getChangedRenderers() {
    return getChangedRenderersMap();
  }
  /**
   * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.Integer> getChangedRenderersMap() {
    return internalGetChangedRenderers().getMap();
  }
  /**
   * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
   */
  @java.lang.Override

  public int getChangedRenderersOrDefault(
      java.lang.String key,
      int defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetChangedRenderers().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
   */
  @java.lang.Override

  public int getChangedRenderersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetChangedRenderers().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int VISIBILITY_COUNT_FIELD_NUMBER = 2;
  private int visibilityCount_;
  /**
   * <code>uint32 visibility_count = 2;</code>
   * @return The visibilityCount.
   */
  @java.lang.Override
  public int getVisibilityCount() {
    return visibilityCount_;
  }

  public static final int IS_CACHED_FIELD_NUMBER = 3;
  private boolean isCached_;
  /**
   * <code>bool is_cached = 3;</code>
   * @return The isCached.
   */
  @java.lang.Override
  public boolean getIsCached() {
    return isCached_;
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetChangedRenderers(),
        ChangedRenderersDefaultEntryHolder.defaultEntry,
        1);
    if (visibilityCount_ != 0) {
      output.writeUInt32(2, visibilityCount_);
    }
    if (isCached_ != false) {
      output.writeBool(3, isCached_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry
         : internalGetChangedRenderers().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
      changedRenderers__ = ChangedRenderersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, changedRenderers__);
    }
    if (visibilityCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, visibilityCount_);
    }
    if (isCached_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isCached_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.EntityRendererChangedInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.EntityRendererChangedInfo other = (io.grasscutter.net.proto.define.EntityRendererChangedInfo) obj;

    if (!internalGetChangedRenderers().equals(
        other.internalGetChangedRenderers())) return false;
    if (getVisibilityCount()
        != other.getVisibilityCount()) return false;
    if (getIsCached()
        != other.getIsCached()) return false;
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
    if (!internalGetChangedRenderers().getMap().isEmpty()) {
      hash = (37 * hash) + CHANGED_RENDERERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetChangedRenderers().hashCode();
    }
    hash = (37 * hash) + VISIBILITY_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getVisibilityCount();
    hash = (37 * hash) + IS_CACHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCached());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.EntityRendererChangedInfo prototype) {
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
   * Protobuf type {@code EntityRendererChangedInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EntityRendererChangedInfo)
      io.grasscutter.net.proto.define.EntityRendererChangedInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_EntityRendererChangedInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetChangedRenderers();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableChangedRenderers();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_EntityRendererChangedInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.EntityRendererChangedInfo.class, io.grasscutter.net.proto.define.EntityRendererChangedInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.EntityRendererChangedInfo.newBuilder()
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
      internalGetMutableChangedRenderers().clear();
      visibilityCount_ = 0;

      isCached_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_EntityRendererChangedInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.EntityRendererChangedInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.EntityRendererChangedInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.EntityRendererChangedInfo build() {
      io.grasscutter.net.proto.define.EntityRendererChangedInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.EntityRendererChangedInfo buildPartial() {
      io.grasscutter.net.proto.define.EntityRendererChangedInfo result = new io.grasscutter.net.proto.define.EntityRendererChangedInfo(this);
      int from_bitField0_ = bitField0_;
      result.changedRenderers_ = internalGetChangedRenderers();
      result.changedRenderers_.makeImmutable();
      result.visibilityCount_ = visibilityCount_;
      result.isCached_ = isCached_;
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
      if (other instanceof io.grasscutter.net.proto.define.EntityRendererChangedInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.EntityRendererChangedInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.EntityRendererChangedInfo other) {
      if (other == io.grasscutter.net.proto.define.EntityRendererChangedInfo.getDefaultInstance()) return this;
      internalGetMutableChangedRenderers().mergeFrom(
          other.internalGetChangedRenderers());
      if (other.getVisibilityCount() != 0) {
        setVisibilityCount(other.getVisibilityCount());
      }
      if (other.getIsCached() != false) {
        setIsCached(other.getIsCached());
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
      io.grasscutter.net.proto.define.EntityRendererChangedInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.EntityRendererChangedInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Integer> changedRenderers_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetChangedRenderers() {
      if (changedRenderers_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ChangedRenderersDefaultEntryHolder.defaultEntry);
      }
      return changedRenderers_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetMutableChangedRenderers() {
      onChanged();;
      if (changedRenderers_ == null) {
        changedRenderers_ = com.google.protobuf.MapField.newMapField(
            ChangedRenderersDefaultEntryHolder.defaultEntry);
      }
      if (!changedRenderers_.isMutable()) {
        changedRenderers_ = changedRenderers_.copy();
      }
      return changedRenderers_;
    }

    public int getChangedRenderersCount() {
      return internalGetChangedRenderers().getMap().size();
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */

    @java.lang.Override
    public boolean containsChangedRenderers(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetChangedRenderers().getMap().containsKey(key);
    }
    /**
     * Use {@link #getChangedRenderersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer> getChangedRenderers() {
      return getChangedRenderersMap();
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.Integer> getChangedRenderersMap() {
      return internalGetChangedRenderers().getMap();
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    @java.lang.Override

    public int getChangedRenderersOrDefault(
        java.lang.String key,
        int defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetChangedRenderers().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    @java.lang.Override

    public int getChangedRenderersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetChangedRenderers().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearChangedRenderers() {
      internalGetMutableChangedRenderers().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */

    public Builder removeChangedRenderers(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableChangedRenderers().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getMutableChangedRenderers() {
      return internalGetMutableChangedRenderers().getMutableMap();
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    public Builder putChangedRenderers(
        java.lang.String key,
        int value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      
      internalGetMutableChangedRenderers().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */

    public Builder putAllChangedRenderers(
        java.util.Map<java.lang.String, java.lang.Integer> values) {
      internalGetMutableChangedRenderers().getMutableMap()
          .putAll(values);
      return this;
    }

    private int visibilityCount_ ;
    /**
     * <code>uint32 visibility_count = 2;</code>
     * @return The visibilityCount.
     */
    @java.lang.Override
    public int getVisibilityCount() {
      return visibilityCount_;
    }
    /**
     * <code>uint32 visibility_count = 2;</code>
     * @param value The visibilityCount to set.
     * @return This builder for chaining.
     */
    public Builder setVisibilityCount(int value) {
      
      visibilityCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 visibility_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVisibilityCount() {
      
      visibilityCount_ = 0;
      onChanged();
      return this;
    }

    private boolean isCached_ ;
    /**
     * <code>bool is_cached = 3;</code>
     * @return The isCached.
     */
    @java.lang.Override
    public boolean getIsCached() {
      return isCached_;
    }
    /**
     * <code>bool is_cached = 3;</code>
     * @param value The isCached to set.
     * @return This builder for chaining.
     */
    public Builder setIsCached(boolean value) {
      
      isCached_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_cached = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsCached() {
      
      isCached_ = false;
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


    // @@protoc_insertion_point(builder_scope:EntityRendererChangedInfo)
  }

  // @@protoc_insertion_point(class_scope:EntityRendererChangedInfo)
  private static final io.grasscutter.net.proto.define.EntityRendererChangedInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.EntityRendererChangedInfo();
  }

  public static io.grasscutter.net.proto.define.EntityRendererChangedInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityRendererChangedInfo>
      PARSER = new com.google.protobuf.AbstractParser<EntityRendererChangedInfo>() {
    @java.lang.Override
    public EntityRendererChangedInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EntityRendererChangedInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntityRendererChangedInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityRendererChangedInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.EntityRendererChangedInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

