// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

public interface EvtBeingHitsCombineNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EvtBeingHitsCombineNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 11;</code>
   */
  java.util.List<io.grasscutter.net.proto.fight.EvtBeingHitInfo> 
      getEvtBeingHitInfoListList();
  /**
   * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 11;</code>
   */
  io.grasscutter.net.proto.fight.EvtBeingHitInfo getEvtBeingHitInfoList(int index);
  /**
   * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 11;</code>
   */
  int getEvtBeingHitInfoListCount();
  /**
   * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 11;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.fight.EvtBeingHitInfoOrBuilder> 
      getEvtBeingHitInfoListOrBuilderList();
  /**
   * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 11;</code>
   */
  io.grasscutter.net.proto.fight.EvtBeingHitInfoOrBuilder getEvtBeingHitInfoListOrBuilder(
      int index);

  /**
   * <code>.ForwardType forward_type = 10;</code>
   * @return The enum numeric value on the wire for forwardType.
   */
  int getForwardTypeValue();
  /**
   * <code>.ForwardType forward_type = 10;</code>
   * @return The forwardType.
   */
  io.grasscutter.net.proto.fight.ForwardType getForwardType();
}
