// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: skill.proto

package io.grasscutter.net.proto.skill;

public interface AvatarSkillUpgradeRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AvatarSkillUpgradeRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 avatar_guid = 10;</code>
   * @return The avatarGuid.
   */
  long getAvatarGuid();

  /**
   * <code>int32 retcode = 9;</code>
   * @return The retcode.
   */
  int getRetcode();

  /**
   * <code>uint32 cur_level = 7;</code>
   * @return The curLevel.
   */
  int getCurLevel();

  /**
   * <code>uint32 old_level = 1;</code>
   * @return The oldLevel.
   */
  int getOldLevel();

  /**
   * <code>uint32 avatar_skill_id = 15;</code>
   * @return The avatarSkillId.
   */
  int getAvatarSkillId();
}
