// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gacha.proto

package io.grasscutter.net.proto.gacha;

public interface GetGachaInfoRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetGachaInfoRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .GachaInfo gacha_info_list = 11;</code>
   */
  java.util.List<io.grasscutter.net.proto.gacha.GachaInfo> 
      getGachaInfoListList();
  /**
   * <code>repeated .GachaInfo gacha_info_list = 11;</code>
   */
  io.grasscutter.net.proto.gacha.GachaInfo getGachaInfoList(int index);
  /**
   * <code>repeated .GachaInfo gacha_info_list = 11;</code>
   */
  int getGachaInfoListCount();
  /**
   * <code>repeated .GachaInfo gacha_info_list = 11;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.gacha.GachaInfoOrBuilder> 
      getGachaInfoListOrBuilderList();
  /**
   * <code>repeated .GachaInfo gacha_info_list = 11;</code>
   */
  io.grasscutter.net.proto.gacha.GachaInfoOrBuilder getGachaInfoListOrBuilder(
      int index);

  /**
   * <code>bool is_under_general_restrict = 2;</code>
   * @return The isUnderGeneralRestrict.
   */
  boolean getIsUnderGeneralRestrict();

  /**
   * <code>bool is_under_minors_restrict = 1;</code>
   * @return The isUnderMinorsRestrict.
   */
  boolean getIsUnderMinorsRestrict();

  /**
   * <code>int32 retcode = 10;</code>
   * @return The retcode.
   */
  int getRetcode();

  /**
   * <code>uint32 gacha_random = 14;</code>
   * @return The gachaRandom.
   */
  int getGachaRandom();

  /**
   * <code>uint32 daily_gacha_times = 3;</code>
   * @return The dailyGachaTimes.
   */
  int getDailyGachaTimes();
}
