// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package io.grasscutter.net.proto.chat;

public interface PrivateChatReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PrivateChatReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string text = 14;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>string text = 14;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 14;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>uint32 icon = 3;</code>
   * @return Whether the icon field is set.
   */
  boolean hasIcon();
  /**
   * <code>uint32 icon = 3;</code>
   * @return The icon.
   */
  int getIcon();

  /**
   * <code>uint32 target_uid = 2;</code>
   * @return The targetUid.
   */
  int getTargetUid();

  public io.grasscutter.net.proto.chat.PrivateChatReq.ContentCase getContentCase();
}
