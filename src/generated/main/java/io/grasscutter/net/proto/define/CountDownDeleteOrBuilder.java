// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

public interface CountDownDeleteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CountDownDelete)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, uint32&gt; delete_time_num_map = 1;</code>
   */
  int getDeleteTimeNumMapCount();
  /**
   * <code>map&lt;uint32, uint32&gt; delete_time_num_map = 1;</code>
   */
  boolean containsDeleteTimeNumMap(
      int key);
  /**
   * Use {@link #getDeleteTimeNumMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getDeleteTimeNumMap();
  /**
   * <code>map&lt;uint32, uint32&gt; delete_time_num_map = 1;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getDeleteTimeNumMapMap();
  /**
   * <code>map&lt;uint32, uint32&gt; delete_time_num_map = 1;</code>
   */

  int getDeleteTimeNumMapOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; delete_time_num_map = 1;</code>
   */

  int getDeleteTimeNumMapOrThrow(
      int key);

  /**
   * <code>uint32 config_count_down_time = 2;</code>
   * @return The configCountDownTime.
   */
  int getConfigCountDownTime();
}
