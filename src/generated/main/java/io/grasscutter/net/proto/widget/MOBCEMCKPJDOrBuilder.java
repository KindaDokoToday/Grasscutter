// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: widget.proto

package io.grasscutter.net.proto.widget;

public interface MOBCEMCKPJDOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MOBCEMCKPJD)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Vector rot = 8;</code>
   * @return Whether the rot field is set.
   */
  boolean hasRot();
  /**
   * <code>.Vector rot = 8;</code>
   * @return The rot.
   */
  io.grasscutter.net.proto.define.Vector getRot();
  /**
   * <code>.Vector rot = 8;</code>
   */
  io.grasscutter.net.proto.define.VectorOrBuilder getRotOrBuilder();

  /**
   * <code>.Vector pos = 1;</code>
   * @return Whether the pos field is set.
   */
  boolean hasPos();
  /**
   * <code>.Vector pos = 1;</code>
   * @return The pos.
   */
  io.grasscutter.net.proto.define.Vector getPos();
  /**
   * <code>.Vector pos = 1;</code>
   */
  io.grasscutter.net.proto.define.VectorOrBuilder getPosOrBuilder();

  /**
   * <code>.FGALHNGKMKC state = 7;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.FGALHNGKMKC state = 7;</code>
   * @return The state.
   */
  io.grasscutter.net.proto.widget.FGALHNGKMKC getState();

  /**
   * <code>uint32 gadget_entity_id = 10;</code>
   * @return The gadgetEntityId.
   */
  int getGadgetEntityId();

  /**
   * <code>uint32 MFCNIJAGFFK = 9;</code>
   * @return The mFCNIJAGFFK.
   */
  int getMFCNIJAGFFK();

  /**
   * <code>uint32 scene_id = 2;</code>
   * @return The sceneId.
   */
  int getSceneId();
}
