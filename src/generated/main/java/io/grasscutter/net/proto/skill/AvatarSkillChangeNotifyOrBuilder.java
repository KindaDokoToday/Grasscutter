// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: skill.proto

package io.grasscutter.net.proto.skill;

public interface AvatarSkillChangeNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AvatarSkillChangeNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 cur_level = 10;</code>
   * @return The curLevel.
   */
  int getCurLevel();

  /**
   * <code>uint32 old_level = 13;</code>
   * @return The oldLevel.
   */
  int getOldLevel();

  /**
   * <code>uint64 avatar_guid = 8;</code>
   * @return The avatarGuid.
   */
  long getAvatarGuid();

  /**
   * <code>uint32 skill_depot_id = 15;</code>
   * @return The skillDepotId.
   */
  int getSkillDepotId();

  /**
   * <code>uint32 avatar_skill_id = 4;</code>
   * @return The avatarSkillId.
   */
  int getAvatarSkillId();

  /**
   * <code>uint32 entity_id = 5;</code>
   * @return The entityId.
   */
  int getEntityId();
}
