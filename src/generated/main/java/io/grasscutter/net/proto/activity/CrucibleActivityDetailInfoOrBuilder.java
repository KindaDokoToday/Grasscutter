// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface CrucibleActivityDetailInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CrucibleActivityDetailInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Vector pos = 14;</code>
   * @return Whether the pos field is set.
   */
  boolean hasPos();
  /**
   * <code>.Vector pos = 14;</code>
   * @return The pos.
   */
  io.grasscutter.net.proto.define.Vector getPos();
  /**
   * <code>.Vector pos = 14;</code>
   */
  io.grasscutter.net.proto.define.VectorOrBuilder getPosOrBuilder();

  /**
   * <code>repeated .CrucibleBattleUidInfo uid_info_list = 2;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.CrucibleBattleUidInfo> 
      getUidInfoListList();
  /**
   * <code>repeated .CrucibleBattleUidInfo uid_info_list = 2;</code>
   */
  io.grasscutter.net.proto.activity.CrucibleBattleUidInfo getUidInfoList(int index);
  /**
   * <code>repeated .CrucibleBattleUidInfo uid_info_list = 2;</code>
   */
  int getUidInfoListCount();
  /**
   * <code>repeated .CrucibleBattleUidInfo uid_info_list = 2;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.CrucibleBattleUidInfoOrBuilder> 
      getUidInfoListOrBuilderList();
  /**
   * <code>repeated .CrucibleBattleUidInfo uid_info_list = 2;</code>
   */
  io.grasscutter.net.proto.activity.CrucibleBattleUidInfoOrBuilder getUidInfoListOrBuilder(
      int index);

  /**
   * <code>uint32 AOBBJBFJFDL = 4;</code>
   * @return The aOBBJBFJFDL.
   */
  int getAOBBJBFJFDL();

  /**
   * <code>uint32 KNGJHMLLCNP = 5;</code>
   * @return The kNGJHMLLCNP.
   */
  int getKNGJHMLLCNP();
}
