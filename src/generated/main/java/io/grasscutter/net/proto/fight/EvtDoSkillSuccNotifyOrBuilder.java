// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

public interface EvtDoSkillSuccNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EvtDoSkillSuccNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Vector forward = 2;</code>
   * @return Whether the forward field is set.
   */
  boolean hasForward();
  /**
   * <code>.Vector forward = 2;</code>
   * @return The forward.
   */
  io.grasscutter.net.proto.define.Vector getForward();
  /**
   * <code>.Vector forward = 2;</code>
   */
  io.grasscutter.net.proto.define.VectorOrBuilder getForwardOrBuilder();

  /**
   * <code>uint32 skill_id = 15;</code>
   * @return The skillId.
   */
  int getSkillId();

  /**
   * <code>uint32 caster_id = 10;</code>
   * @return The casterId.
   */
  int getCasterId();

  /**
   * <code>.ForwardType forward_type = 11;</code>
   * @return The enum numeric value on the wire for forwardType.
   */
  int getForwardTypeValue();
  /**
   * <code>.ForwardType forward_type = 11;</code>
   * @return The forwardType.
   */
  io.grasscutter.net.proto.fight.ForwardType getForwardType();
}
