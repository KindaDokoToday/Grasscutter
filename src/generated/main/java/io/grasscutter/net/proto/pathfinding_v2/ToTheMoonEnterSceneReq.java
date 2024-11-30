// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pathfinding_v2.proto

package io.grasscutter.net.proto.pathfinding_v2;

/**
 * <pre>
 * CmdId: 6184
 * </pre>
 *
 * Protobuf type {@code ToTheMoonEnterSceneReq}
 */
public final class ToTheMoonEnterSceneReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ToTheMoonEnterSceneReq)
    ToTheMoonEnterSceneReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ToTheMoonEnterSceneReq.newBuilder() to construct.
  private ToTheMoonEnterSceneReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ToTheMoonEnterSceneReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ToTheMoonEnterSceneReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ToTheMoonEnterSceneReq(
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

            version_ = input.readUInt32();
            break;
          }
          case 64: {

            hHAIIFODEOO_ = input.readUInt32();
            break;
          }
          case 96: {

            sceneId_ = input.readUInt32();
            break;
          }
          case 120: {

            eGJDKPKGDIB_ = input.readUInt32();
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
    return io.grasscutter.net.proto.pathfinding_v2.PathfindingV2.internal_static_ToTheMoonEnterSceneReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.pathfinding_v2.PathfindingV2.internal_static_ToTheMoonEnterSceneReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq.class, io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq.Builder.class);
  }

  public static final int SCENE_ID_FIELD_NUMBER = 12;
  private int sceneId_;
  /**
   * <code>uint32 scene_id = 12;</code>
   * @return The sceneId.
   */
  @java.lang.Override
  public int getSceneId() {
    return sceneId_;
  }

  public static final int EGJDKPKGDIB_FIELD_NUMBER = 15;
  private int eGJDKPKGDIB_;
  /**
   * <code>uint32 EGJDKPKGDIB = 15;</code>
   * @return The eGJDKPKGDIB.
   */
  @java.lang.Override
  public int getEGJDKPKGDIB() {
    return eGJDKPKGDIB_;
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>uint32 version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
  }

  public static final int HHAIIFODEOO_FIELD_NUMBER = 8;
  private int hHAIIFODEOO_;
  /**
   * <code>uint32 HHAIIFODEOO = 8;</code>
   * @return The hHAIIFODEOO.
   */
  @java.lang.Override
  public int getHHAIIFODEOO() {
    return hHAIIFODEOO_;
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
    if (version_ != 0) {
      output.writeUInt32(1, version_);
    }
    if (hHAIIFODEOO_ != 0) {
      output.writeUInt32(8, hHAIIFODEOO_);
    }
    if (sceneId_ != 0) {
      output.writeUInt32(12, sceneId_);
    }
    if (eGJDKPKGDIB_ != 0) {
      output.writeUInt32(15, eGJDKPKGDIB_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, version_);
    }
    if (hHAIIFODEOO_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, hHAIIFODEOO_);
    }
    if (sceneId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, sceneId_);
    }
    if (eGJDKPKGDIB_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, eGJDKPKGDIB_);
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
    if (!(obj instanceof io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq other = (io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq) obj;

    if (getSceneId()
        != other.getSceneId()) return false;
    if (getEGJDKPKGDIB()
        != other.getEGJDKPKGDIB()) return false;
    if (getVersion()
        != other.getVersion()) return false;
    if (getHHAIIFODEOO()
        != other.getHHAIIFODEOO()) return false;
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
    hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSceneId();
    hash = (37 * hash) + EGJDKPKGDIB_FIELD_NUMBER;
    hash = (53 * hash) + getEGJDKPKGDIB();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + HHAIIFODEOO_FIELD_NUMBER;
    hash = (53 * hash) + getHHAIIFODEOO();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq prototype) {
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
   * CmdId: 6184
   * </pre>
   *
   * Protobuf type {@code ToTheMoonEnterSceneReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ToTheMoonEnterSceneReq)
      io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.pathfinding_v2.PathfindingV2.internal_static_ToTheMoonEnterSceneReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.pathfinding_v2.PathfindingV2.internal_static_ToTheMoonEnterSceneReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq.class, io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq.newBuilder()
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
      sceneId_ = 0;

      eGJDKPKGDIB_ = 0;

      version_ = 0;

      hHAIIFODEOO_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.pathfinding_v2.PathfindingV2.internal_static_ToTheMoonEnterSceneReq_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq getDefaultInstanceForType() {
      return io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq build() {
      io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq buildPartial() {
      io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq result = new io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq(this);
      result.sceneId_ = sceneId_;
      result.eGJDKPKGDIB_ = eGJDKPKGDIB_;
      result.version_ = version_;
      result.hHAIIFODEOO_ = hHAIIFODEOO_;
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
      if (other instanceof io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq) {
        return mergeFrom((io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq other) {
      if (other == io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq.getDefaultInstance()) return this;
      if (other.getSceneId() != 0) {
        setSceneId(other.getSceneId());
      }
      if (other.getEGJDKPKGDIB() != 0) {
        setEGJDKPKGDIB(other.getEGJDKPKGDIB());
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.getHHAIIFODEOO() != 0) {
        setHHAIIFODEOO(other.getHHAIIFODEOO());
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
      io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sceneId_ ;
    /**
     * <code>uint32 scene_id = 12;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }
    /**
     * <code>uint32 scene_id = 12;</code>
     * @param value The sceneId to set.
     * @return This builder for chaining.
     */
    public Builder setSceneId(int value) {
      
      sceneId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 scene_id = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearSceneId() {
      
      sceneId_ = 0;
      onChanged();
      return this;
    }

    private int eGJDKPKGDIB_ ;
    /**
     * <code>uint32 EGJDKPKGDIB = 15;</code>
     * @return The eGJDKPKGDIB.
     */
    @java.lang.Override
    public int getEGJDKPKGDIB() {
      return eGJDKPKGDIB_;
    }
    /**
     * <code>uint32 EGJDKPKGDIB = 15;</code>
     * @param value The eGJDKPKGDIB to set.
     * @return This builder for chaining.
     */
    public Builder setEGJDKPKGDIB(int value) {
      
      eGJDKPKGDIB_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 EGJDKPKGDIB = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearEGJDKPKGDIB() {
      
      eGJDKPKGDIB_ = 0;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <code>uint32 version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <code>uint32 version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private int hHAIIFODEOO_ ;
    /**
     * <code>uint32 HHAIIFODEOO = 8;</code>
     * @return The hHAIIFODEOO.
     */
    @java.lang.Override
    public int getHHAIIFODEOO() {
      return hHAIIFODEOO_;
    }
    /**
     * <code>uint32 HHAIIFODEOO = 8;</code>
     * @param value The hHAIIFODEOO to set.
     * @return This builder for chaining.
     */
    public Builder setHHAIIFODEOO(int value) {
      
      hHAIIFODEOO_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 HHAIIFODEOO = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearHHAIIFODEOO() {
      
      hHAIIFODEOO_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ToTheMoonEnterSceneReq)
  }

  // @@protoc_insertion_point(class_scope:ToTheMoonEnterSceneReq)
  private static final io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq();
  }

  public static io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ToTheMoonEnterSceneReq>
      PARSER = new com.google.protobuf.AbstractParser<ToTheMoonEnterSceneReq>() {
    @java.lang.Override
    public ToTheMoonEnterSceneReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ToTheMoonEnterSceneReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ToTheMoonEnterSceneReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ToTheMoonEnterSceneReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.pathfinding_v2.ToTheMoonEnterSceneReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

