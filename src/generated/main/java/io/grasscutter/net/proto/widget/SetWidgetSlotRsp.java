// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: widget.proto

package io.grasscutter.net.proto.widget;

/**
 * <pre>
 * CmdId: 2644
 * </pre>
 *
 * Protobuf type {@code SetWidgetSlotRsp}
 */
public final class SetWidgetSlotRsp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SetWidgetSlotRsp)
    SetWidgetSlotRspOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetWidgetSlotRsp.newBuilder() to construct.
  private SetWidgetSlotRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetWidgetSlotRsp() {
    tagList_ = java.util.Collections.emptyList();
    op_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetWidgetSlotRsp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetWidgetSlotRsp(
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
          case 24: {
            int rawValue = input.readEnum();

            op_ = rawValue;
            break;
          }
          case 32: {

            retcode_ = input.readInt32();
            break;
          }
          case 40: {

            materialId_ = input.readUInt32();
            break;
          }
          case 80: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tagList_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            tagList_.add(rawValue);
            break;
          }
          case 82: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                tagList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              tagList_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        tagList_ = java.util.Collections.unmodifiableList(tagList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.widget.Widget.internal_static_SetWidgetSlotRsp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.widget.Widget.internal_static_SetWidgetSlotRsp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.widget.SetWidgetSlotRsp.class, io.grasscutter.net.proto.widget.SetWidgetSlotRsp.Builder.class);
  }

  public static final int TAG_LIST_FIELD_NUMBER = 10;
  private java.util.List<java.lang.Integer> tagList_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, io.grasscutter.net.proto.widget.WidgetSlotTag> tagList_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, io.grasscutter.net.proto.widget.WidgetSlotTag>() {
            public io.grasscutter.net.proto.widget.WidgetSlotTag convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              io.grasscutter.net.proto.widget.WidgetSlotTag result = io.grasscutter.net.proto.widget.WidgetSlotTag.valueOf(from);
              return result == null ? io.grasscutter.net.proto.widget.WidgetSlotTag.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .WidgetSlotTag tag_list = 10;</code>
   * @return A list containing the tagList.
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.widget.WidgetSlotTag> getTagListList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, io.grasscutter.net.proto.widget.WidgetSlotTag>(tagList_, tagList_converter_);
  }
  /**
   * <code>repeated .WidgetSlotTag tag_list = 10;</code>
   * @return The count of tagList.
   */
  @java.lang.Override
  public int getTagListCount() {
    return tagList_.size();
  }
  /**
   * <code>repeated .WidgetSlotTag tag_list = 10;</code>
   * @param index The index of the element to return.
   * @return The tagList at the given index.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.widget.WidgetSlotTag getTagList(int index) {
    return tagList_converter_.convert(tagList_.get(index));
  }
  /**
   * <code>repeated .WidgetSlotTag tag_list = 10;</code>
   * @return A list containing the enum numeric values on the wire for tagList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getTagListValueList() {
    return tagList_;
  }
  /**
   * <code>repeated .WidgetSlotTag tag_list = 10;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of tagList at the given index.
   */
  @java.lang.Override
  public int getTagListValue(int index) {
    return tagList_.get(index);
  }
  private int tagListMemoizedSerializedSize;

  public static final int OP_FIELD_NUMBER = 3;
  private int op_;
  /**
   * <code>.WidgetSlotOp op = 3;</code>
   * @return The enum numeric value on the wire for op.
   */
  @java.lang.Override public int getOpValue() {
    return op_;
  }
  /**
   * <code>.WidgetSlotOp op = 3;</code>
   * @return The op.
   */
  @java.lang.Override public io.grasscutter.net.proto.widget.WidgetSlotOp getOp() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.widget.WidgetSlotOp result = io.grasscutter.net.proto.widget.WidgetSlotOp.valueOf(op_);
    return result == null ? io.grasscutter.net.proto.widget.WidgetSlotOp.UNRECOGNIZED : result;
  }

  public static final int MATERIAL_ID_FIELD_NUMBER = 5;
  private int materialId_;
  /**
   * <code>uint32 material_id = 5;</code>
   * @return The materialId.
   */
  @java.lang.Override
  public int getMaterialId() {
    return materialId_;
  }

  public static final int RETCODE_FIELD_NUMBER = 4;
  private int retcode_;
  /**
   * <code>int32 retcode = 4;</code>
   * @return The retcode.
   */
  @java.lang.Override
  public int getRetcode() {
    return retcode_;
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
    getSerializedSize();
    if (op_ != io.grasscutter.net.proto.widget.WidgetSlotOp.WidgetSlotOp_ATTACH.getNumber()) {
      output.writeEnum(3, op_);
    }
    if (retcode_ != 0) {
      output.writeInt32(4, retcode_);
    }
    if (materialId_ != 0) {
      output.writeUInt32(5, materialId_);
    }
    if (getTagListList().size() > 0) {
      output.writeUInt32NoTag(82);
      output.writeUInt32NoTag(tagListMemoizedSerializedSize);
    }
    for (int i = 0; i < tagList_.size(); i++) {
      output.writeEnumNoTag(tagList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (op_ != io.grasscutter.net.proto.widget.WidgetSlotOp.WidgetSlotOp_ATTACH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, op_);
    }
    if (retcode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, retcode_);
    }
    if (materialId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, materialId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tagList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(tagList_.get(i));
      }
      size += dataSize;
      if (!getTagListList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }tagListMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.grasscutter.net.proto.widget.SetWidgetSlotRsp)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.widget.SetWidgetSlotRsp other = (io.grasscutter.net.proto.widget.SetWidgetSlotRsp) obj;

    if (!tagList_.equals(other.tagList_)) return false;
    if (op_ != other.op_) return false;
    if (getMaterialId()
        != other.getMaterialId()) return false;
    if (getRetcode()
        != other.getRetcode()) return false;
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
    if (getTagListCount() > 0) {
      hash = (37 * hash) + TAG_LIST_FIELD_NUMBER;
      hash = (53 * hash) + tagList_.hashCode();
    }
    hash = (37 * hash) + OP_FIELD_NUMBER;
    hash = (53 * hash) + op_;
    hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMaterialId();
    hash = (37 * hash) + RETCODE_FIELD_NUMBER;
    hash = (53 * hash) + getRetcode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.widget.SetWidgetSlotRsp prototype) {
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
   * CmdId: 2644
   * </pre>
   *
   * Protobuf type {@code SetWidgetSlotRsp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SetWidgetSlotRsp)
      io.grasscutter.net.proto.widget.SetWidgetSlotRspOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.widget.Widget.internal_static_SetWidgetSlotRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.widget.Widget.internal_static_SetWidgetSlotRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.widget.SetWidgetSlotRsp.class, io.grasscutter.net.proto.widget.SetWidgetSlotRsp.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.widget.SetWidgetSlotRsp.newBuilder()
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
      tagList_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      op_ = 0;

      materialId_ = 0;

      retcode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.widget.Widget.internal_static_SetWidgetSlotRsp_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.widget.SetWidgetSlotRsp getDefaultInstanceForType() {
      return io.grasscutter.net.proto.widget.SetWidgetSlotRsp.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.widget.SetWidgetSlotRsp build() {
      io.grasscutter.net.proto.widget.SetWidgetSlotRsp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.widget.SetWidgetSlotRsp buildPartial() {
      io.grasscutter.net.proto.widget.SetWidgetSlotRsp result = new io.grasscutter.net.proto.widget.SetWidgetSlotRsp(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        tagList_ = java.util.Collections.unmodifiableList(tagList_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tagList_ = tagList_;
      result.op_ = op_;
      result.materialId_ = materialId_;
      result.retcode_ = retcode_;
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
      if (other instanceof io.grasscutter.net.proto.widget.SetWidgetSlotRsp) {
        return mergeFrom((io.grasscutter.net.proto.widget.SetWidgetSlotRsp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.widget.SetWidgetSlotRsp other) {
      if (other == io.grasscutter.net.proto.widget.SetWidgetSlotRsp.getDefaultInstance()) return this;
      if (!other.tagList_.isEmpty()) {
        if (tagList_.isEmpty()) {
          tagList_ = other.tagList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTagListIsMutable();
          tagList_.addAll(other.tagList_);
        }
        onChanged();
      }
      if (other.op_ != 0) {
        setOpValue(other.getOpValue());
      }
      if (other.getMaterialId() != 0) {
        setMaterialId(other.getMaterialId());
      }
      if (other.getRetcode() != 0) {
        setRetcode(other.getRetcode());
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
      io.grasscutter.net.proto.widget.SetWidgetSlotRsp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.widget.SetWidgetSlotRsp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> tagList_ =
      java.util.Collections.emptyList();
    private void ensureTagListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tagList_ = new java.util.ArrayList<java.lang.Integer>(tagList_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @return A list containing the tagList.
     */
    public java.util.List<io.grasscutter.net.proto.widget.WidgetSlotTag> getTagListList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, io.grasscutter.net.proto.widget.WidgetSlotTag>(tagList_, tagList_converter_);
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @return The count of tagList.
     */
    public int getTagListCount() {
      return tagList_.size();
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @param index The index of the element to return.
     * @return The tagList at the given index.
     */
    public io.grasscutter.net.proto.widget.WidgetSlotTag getTagList(int index) {
      return tagList_converter_.convert(tagList_.get(index));
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @param index The index to set the value at.
     * @param value The tagList to set.
     * @return This builder for chaining.
     */
    public Builder setTagList(
        int index, io.grasscutter.net.proto.widget.WidgetSlotTag value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTagListIsMutable();
      tagList_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @param value The tagList to add.
     * @return This builder for chaining.
     */
    public Builder addTagList(io.grasscutter.net.proto.widget.WidgetSlotTag value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTagListIsMutable();
      tagList_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @param values The tagList to add.
     * @return This builder for chaining.
     */
    public Builder addAllTagList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.widget.WidgetSlotTag> values) {
      ensureTagListIsMutable();
      for (io.grasscutter.net.proto.widget.WidgetSlotTag value : values) {
        tagList_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearTagList() {
      tagList_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @return A list containing the enum numeric values on the wire for tagList.
     */
    public java.util.List<java.lang.Integer>
    getTagListValueList() {
      return java.util.Collections.unmodifiableList(tagList_);
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of tagList at the given index.
     */
    public int getTagListValue(int index) {
      return tagList_.get(index);
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of tagList at the given index.
     * @return This builder for chaining.
     */
    public Builder setTagListValue(
        int index, int value) {
      ensureTagListIsMutable();
      tagList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @param value The enum numeric value on the wire for tagList to add.
     * @return This builder for chaining.
     */
    public Builder addTagListValue(int value) {
      ensureTagListIsMutable();
      tagList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 10;</code>
     * @param values The enum numeric values on the wire for tagList to add.
     * @return This builder for chaining.
     */
    public Builder addAllTagListValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureTagListIsMutable();
      for (int value : values) {
        tagList_.add(value);
      }
      onChanged();
      return this;
    }

    private int op_ = 0;
    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @param value The enum numeric value on the wire for op to set.
     * @return This builder for chaining.
     */
    public Builder setOpValue(int value) {
      
      op_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @return The op.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.widget.WidgetSlotOp getOp() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.widget.WidgetSlotOp result = io.grasscutter.net.proto.widget.WidgetSlotOp.valueOf(op_);
      return result == null ? io.grasscutter.net.proto.widget.WidgetSlotOp.UNRECOGNIZED : result;
    }
    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @param value The op to set.
     * @return This builder for chaining.
     */
    public Builder setOp(io.grasscutter.net.proto.widget.WidgetSlotOp value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      op_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOp() {
      
      op_ = 0;
      onChanged();
      return this;
    }

    private int materialId_ ;
    /**
     * <code>uint32 material_id = 5;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }
    /**
     * <code>uint32 material_id = 5;</code>
     * @param value The materialId to set.
     * @return This builder for chaining.
     */
    public Builder setMaterialId(int value) {
      
      materialId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 material_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaterialId() {
      
      materialId_ = 0;
      onChanged();
      return this;
    }

    private int retcode_ ;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }
    /**
     * <code>int32 retcode = 4;</code>
     * @param value The retcode to set.
     * @return This builder for chaining.
     */
    public Builder setRetcode(int value) {
      
      retcode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 retcode = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRetcode() {
      
      retcode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:SetWidgetSlotRsp)
  }

  // @@protoc_insertion_point(class_scope:SetWidgetSlotRsp)
  private static final io.grasscutter.net.proto.widget.SetWidgetSlotRsp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.widget.SetWidgetSlotRsp();
  }

  public static io.grasscutter.net.proto.widget.SetWidgetSlotRsp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetWidgetSlotRsp>
      PARSER = new com.google.protobuf.AbstractParser<SetWidgetSlotRsp>() {
    @java.lang.Override
    public SetWidgetSlotRsp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetWidgetSlotRsp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetWidgetSlotRsp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetWidgetSlotRsp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.widget.SetWidgetSlotRsp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

