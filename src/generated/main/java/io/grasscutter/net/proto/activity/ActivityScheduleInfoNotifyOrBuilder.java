// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface ActivityScheduleInfoNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ActivityScheduleInfoNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ActivityScheduleInfo activity_schedule_list = 3;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.ActivityScheduleInfo> 
      getActivityScheduleListList();
  /**
   * <code>repeated .ActivityScheduleInfo activity_schedule_list = 3;</code>
   */
  io.grasscutter.net.proto.activity.ActivityScheduleInfo getActivityScheduleList(int index);
  /**
   * <code>repeated .ActivityScheduleInfo activity_schedule_list = 3;</code>
   */
  int getActivityScheduleListCount();
  /**
   * <code>repeated .ActivityScheduleInfo activity_schedule_list = 3;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.ActivityScheduleInfoOrBuilder> 
      getActivityScheduleListOrBuilderList();
  /**
   * <code>repeated .ActivityScheduleInfo activity_schedule_list = 3;</code>
   */
  io.grasscutter.net.proto.activity.ActivityScheduleInfoOrBuilder getActivityScheduleListOrBuilder(
      int index);

  /**
   * <code>uint32 remain_fly_sea_lamp_num = 14;</code>
   * @return The remainFlySeaLampNum.
   */
  int getRemainFlySeaLampNum();
}
