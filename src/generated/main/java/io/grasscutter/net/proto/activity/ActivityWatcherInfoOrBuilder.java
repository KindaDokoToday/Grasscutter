// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface ActivityWatcherInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ActivityWatcherInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 cur_progress = 1;</code>
   * @return The curProgress.
   */
  int getCurProgress();

  /**
   * <code>bool is_taken_reward = 2;</code>
   * @return The isTakenReward.
   */
  boolean getIsTakenReward();

  /**
   * <code>uint32 watcher_id = 4;</code>
   * @return The watcherId.
   */
  int getWatcherId();

  /**
   * <code>uint32 total_progress = 10;</code>
   * @return The totalProgress.
   */
  int getTotalProgress();
}
