// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

public interface EvtAiSyncSkillCdNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EvtAiSyncSkillCdNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 4;</code>
   */
  int getAiCdMapCount();
  /**
   * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 4;</code>
   */
  boolean containsAiCdMap(
      int key);
  /**
   * Use {@link #getAiCdMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiSkillCdInfo>
  getAiCdMap();
  /**
   * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 4;</code>
   */
  java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiSkillCdInfo>
  getAiCdMapMap();
  /**
   * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 4;</code>
   */

  io.grasscutter.net.proto.fight.AiSkillCdInfo getAiCdMapOrDefault(
      int key,
      io.grasscutter.net.proto.fight.AiSkillCdInfo defaultValue);
  /**
   * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 4;</code>
   */

  io.grasscutter.net.proto.fight.AiSkillCdInfo getAiCdMapOrThrow(
      int key);
}
