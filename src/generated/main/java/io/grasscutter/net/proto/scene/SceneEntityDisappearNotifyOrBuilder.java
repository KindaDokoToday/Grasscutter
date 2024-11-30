// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

public interface SceneEntityDisappearNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SceneEntityDisappearNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 entity_list = 12;</code>
   * @return A list containing the entityList.
   */
  java.util.List<java.lang.Integer> getEntityListList();
  /**
   * <code>repeated uint32 entity_list = 12;</code>
   * @return The count of entityList.
   */
  int getEntityListCount();
  /**
   * <code>repeated uint32 entity_list = 12;</code>
   * @param index The index of the element to return.
   * @return The entityList at the given index.
   */
  int getEntityList(int index);

  /**
   * <code>uint32 param = 15;</code>
   * @return The param.
   */
  int getParam();

  /**
   * <code>.VisionType disappear_type = 8;</code>
   * @return The enum numeric value on the wire for disappearType.
   */
  int getDisappearTypeValue();
  /**
   * <code>.VisionType disappear_type = 8;</code>
   * @return The disappearType.
   */
  io.grasscutter.net.proto.scene.VisionType getDisappearType();
}
