// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package io.grasscutter.net.proto.chat;

public final class Chat {
  private Chat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PrivateChatNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PrivateChatNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PrivateChatReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PrivateChatReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nchat.proto\032\013scene.proto\"1\n\021PrivateChat" +
      "Notify\022\034\n\tchat_info\030\013 \001(\0132\t.ChatInfo\"O\n\016" +
      "PrivateChatReq\022\016\n\004text\030\016 \001(\tH\000\022\016\n\004icon\030\003" +
      " \001(\rH\000\022\022\n\ntarget_uid\030\002 \001(\rB\t\n\007contentB!\n" +
      "\035io.grasscutter.net.proto.chatP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.net.proto.scene.Scene.getDescriptor(),
        });
    internal_static_PrivateChatNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PrivateChatNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PrivateChatNotify_descriptor,
        new java.lang.String[] { "ChatInfo", });
    internal_static_PrivateChatReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PrivateChatReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PrivateChatReq_descriptor,
        new java.lang.String[] { "Text", "Icon", "TargetUid", "Content", });
    io.grasscutter.net.proto.scene.Scene.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
