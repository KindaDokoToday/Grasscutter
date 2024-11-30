// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code HachiActivityDetailInfo}
 */
public final class HachiActivityDetailInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HachiActivityDetailInfo)
    HachiActivityDetailInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HachiActivityDetailInfo.newBuilder() to construct.
  private HachiActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HachiActivityDetailInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HachiActivityDetailInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HachiActivityDetailInfo(
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
          case 122: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              stageMap_ = com.google.protobuf.MapField.newMapField(
                  StageMapDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo>
            stageMap__ = input.readMessage(
                StageMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            stageMap_.getMutableMap().put(
                stageMap__.getKey(), stageMap__.getValue());
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_HachiActivityDetailInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 15:
        return internalGetStageMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_HachiActivityDetailInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.HachiActivityDetailInfo.class, io.grasscutter.net.proto.activity.HachiActivityDetailInfo.Builder.class);
  }

  public static final int STAGE_MAP_FIELD_NUMBER = 15;
  private static final class StageMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo>newDefaultInstance(
                io.grasscutter.net.proto.activity.Activity.internal_static_HachiActivityDetailInfo_StageMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.grasscutter.net.proto.activity.HachiStageInfo.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> stageMap_;
  private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo>
  internalGetStageMap() {
    if (stageMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          StageMapDefaultEntryHolder.defaultEntry);
    }
    return stageMap_;
  }

  public int getStageMapCount() {
    return internalGetStageMap().getMap().size();
  }
  /**
   * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
   */

  @java.lang.Override
  public boolean containsStageMap(
      int key) {
    
    return internalGetStageMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getStageMapMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> getStageMap() {
    return getStageMapMap();
  }
  /**
   * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> getStageMapMap() {
    return internalGetStageMap().getMap();
  }
  /**
   * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
   */
  @java.lang.Override

  public io.grasscutter.net.proto.activity.HachiStageInfo getStageMapOrDefault(
      int key,
      io.grasscutter.net.proto.activity.HachiStageInfo defaultValue) {
    
    java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> map =
        internalGetStageMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
   */
  @java.lang.Override

  public io.grasscutter.net.proto.activity.HachiStageInfo getStageMapOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> map =
        internalGetStageMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
      .serializeIntegerMapTo(
        output,
        internalGetStageMap(),
        StageMapDefaultEntryHolder.defaultEntry,
        15);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> entry
         : internalGetStageMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo>
      stageMap__ = StageMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, stageMap__);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.HachiActivityDetailInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.HachiActivityDetailInfo other = (io.grasscutter.net.proto.activity.HachiActivityDetailInfo) obj;

    if (!internalGetStageMap().equals(
        other.internalGetStageMap())) return false;
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
    if (!internalGetStageMap().getMap().isEmpty()) {
      hash = (37 * hash) + STAGE_MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetStageMap().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.HachiActivityDetailInfo prototype) {
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
   * Protobuf type {@code HachiActivityDetailInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HachiActivityDetailInfo)
      io.grasscutter.net.proto.activity.HachiActivityDetailInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_HachiActivityDetailInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 15:
          return internalGetStageMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 15:
          return internalGetMutableStageMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_HachiActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.HachiActivityDetailInfo.class, io.grasscutter.net.proto.activity.HachiActivityDetailInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.HachiActivityDetailInfo.newBuilder()
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
      internalGetMutableStageMap().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_HachiActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.HachiActivityDetailInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.HachiActivityDetailInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.HachiActivityDetailInfo build() {
      io.grasscutter.net.proto.activity.HachiActivityDetailInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.HachiActivityDetailInfo buildPartial() {
      io.grasscutter.net.proto.activity.HachiActivityDetailInfo result = new io.grasscutter.net.proto.activity.HachiActivityDetailInfo(this);
      int from_bitField0_ = bitField0_;
      result.stageMap_ = internalGetStageMap();
      result.stageMap_.makeImmutable();
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
      if (other instanceof io.grasscutter.net.proto.activity.HachiActivityDetailInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.HachiActivityDetailInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.HachiActivityDetailInfo other) {
      if (other == io.grasscutter.net.proto.activity.HachiActivityDetailInfo.getDefaultInstance()) return this;
      internalGetMutableStageMap().mergeFrom(
          other.internalGetStageMap());
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
      io.grasscutter.net.proto.activity.HachiActivityDetailInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.HachiActivityDetailInfo) e.getUnfinishedMessage();
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
        java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> stageMap_;
    private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo>
    internalGetStageMap() {
      if (stageMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StageMapDefaultEntryHolder.defaultEntry);
      }
      return stageMap_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo>
    internalGetMutableStageMap() {
      onChanged();;
      if (stageMap_ == null) {
        stageMap_ = com.google.protobuf.MapField.newMapField(
            StageMapDefaultEntryHolder.defaultEntry);
      }
      if (!stageMap_.isMutable()) {
        stageMap_ = stageMap_.copy();
      }
      return stageMap_;
    }

    public int getStageMapCount() {
      return internalGetStageMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
     */

    @java.lang.Override
    public boolean containsStageMap(
        int key) {
      
      return internalGetStageMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStageMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> getStageMap() {
      return getStageMapMap();
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> getStageMapMap() {
      return internalGetStageMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
     */
    @java.lang.Override

    public io.grasscutter.net.proto.activity.HachiStageInfo getStageMapOrDefault(
        int key,
        io.grasscutter.net.proto.activity.HachiStageInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> map =
          internalGetStageMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
     */
    @java.lang.Override

    public io.grasscutter.net.proto.activity.HachiStageInfo getStageMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> map =
          internalGetStageMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearStageMap() {
      internalGetMutableStageMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
     */

    public Builder removeStageMap(
        int key) {
      
      internalGetMutableStageMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo>
    getMutableStageMap() {
      return internalGetMutableStageMap().getMutableMap();
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
     */
    public Builder putStageMap(
        int key,
        io.grasscutter.net.proto.activity.HachiStageInfo value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableStageMap().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stage_map = 15;</code>
     */

    public Builder putAllStageMap(
        java.util.Map<java.lang.Integer, io.grasscutter.net.proto.activity.HachiStageInfo> values) {
      internalGetMutableStageMap().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:HachiActivityDetailInfo)
  }

  // @@protoc_insertion_point(class_scope:HachiActivityDetailInfo)
  private static final io.grasscutter.net.proto.activity.HachiActivityDetailInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.HachiActivityDetailInfo();
  }

  public static io.grasscutter.net.proto.activity.HachiActivityDetailInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HachiActivityDetailInfo>
      PARSER = new com.google.protobuf.AbstractParser<HachiActivityDetailInfo>() {
    @java.lang.Override
    public HachiActivityDetailInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HachiActivityDetailInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HachiActivityDetailInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HachiActivityDetailInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.HachiActivityDetailInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

