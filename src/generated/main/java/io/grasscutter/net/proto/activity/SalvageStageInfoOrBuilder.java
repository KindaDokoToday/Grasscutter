// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface SalvageStageInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SalvageStageInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .SalvageChallengeInfo challenge_info_list = 13;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.SalvageChallengeInfo> 
      getChallengeInfoListList();
  /**
   * <code>repeated .SalvageChallengeInfo challenge_info_list = 13;</code>
   */
  io.grasscutter.net.proto.activity.SalvageChallengeInfo getChallengeInfoList(int index);
  /**
   * <code>repeated .SalvageChallengeInfo challenge_info_list = 13;</code>
   */
  int getChallengeInfoListCount();
  /**
   * <code>repeated .SalvageChallengeInfo challenge_info_list = 13;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.SalvageChallengeInfoOrBuilder> 
      getChallengeInfoListOrBuilderList();
  /**
   * <code>repeated .SalvageChallengeInfo challenge_info_list = 13;</code>
   */
  io.grasscutter.net.proto.activity.SalvageChallengeInfoOrBuilder getChallengeInfoListOrBuilder(
      int index);

  /**
   * <code>bool is_open = 7;</code>
   * @return The isOpen.
   */
  boolean getIsOpen();

  /**
   * <code>uint32 stage_id = 11;</code>
   * @return The stageId.
   */
  int getStageId();
}
