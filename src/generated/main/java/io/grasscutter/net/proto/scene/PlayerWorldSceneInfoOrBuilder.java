// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

public interface PlayerWorldSceneInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PlayerWorldSceneInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.DKIFDGNKPLD CIENOKDHFOD = 9;</code>
   * @return Whether the cIENOKDHFOD field is set.
   */
  boolean hasCIENOKDHFOD();
  /**
   * <code>.DKIFDGNKPLD CIENOKDHFOD = 9;</code>
   * @return The cIENOKDHFOD.
   */
  io.grasscutter.net.proto.scene.DKIFDGNKPLD getCIENOKDHFOD();
  /**
   * <code>.DKIFDGNKPLD CIENOKDHFOD = 9;</code>
   */
  io.grasscutter.net.proto.scene.DKIFDGNKPLDOrBuilder getCIENOKDHFODOrBuilder();

  /**
   * <code>repeated uint32 scene_tag_id_list = 6;</code>
   * @return A list containing the sceneTagIdList.
   */
  java.util.List<java.lang.Integer> getSceneTagIdListList();
  /**
   * <code>repeated uint32 scene_tag_id_list = 6;</code>
   * @return The count of sceneTagIdList.
   */
  int getSceneTagIdListCount();
  /**
   * <code>repeated uint32 scene_tag_id_list = 6;</code>
   * @param index The index of the element to return.
   * @return The sceneTagIdList at the given index.
   */
  int getSceneTagIdList(int index);

  /**
   * <code>.MapLayerInfo map_layer_info = 14;</code>
   * @return Whether the mapLayerInfo field is set.
   */
  boolean hasMapLayerInfo();
  /**
   * <code>.MapLayerInfo map_layer_info = 14;</code>
   * @return The mapLayerInfo.
   */
  io.grasscutter.net.proto.scene.MapLayerInfo getMapLayerInfo();
  /**
   * <code>.MapLayerInfo map_layer_info = 14;</code>
   */
  io.grasscutter.net.proto.scene.MapLayerInfoOrBuilder getMapLayerInfoOrBuilder();

  /**
   * <code>uint32 scene_id = 8;</code>
   * @return The sceneId.
   */
  int getSceneId();

  /**
   * <code>bool is_locked = 15;</code>
   * @return The isLocked.
   */
  boolean getIsLocked();
}
