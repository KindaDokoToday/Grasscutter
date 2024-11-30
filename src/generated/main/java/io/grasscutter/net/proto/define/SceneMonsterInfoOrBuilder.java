// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

public interface SceneMonsterInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SceneMonsterInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .SceneWeaponInfo weapon_list = 4;</code>
   */
  java.util.List<io.grasscutter.net.proto.define.SceneWeaponInfo> 
      getWeaponListList();
  /**
   * <code>repeated .SceneWeaponInfo weapon_list = 4;</code>
   */
  io.grasscutter.net.proto.define.SceneWeaponInfo getWeaponList(int index);
  /**
   * <code>repeated .SceneWeaponInfo weapon_list = 4;</code>
   */
  int getWeaponListCount();
  /**
   * <code>repeated .SceneWeaponInfo weapon_list = 4;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.define.SceneWeaponInfoOrBuilder> 
      getWeaponListOrBuilderList();
  /**
   * <code>repeated .SceneWeaponInfo weapon_list = 4;</code>
   */
  io.grasscutter.net.proto.define.SceneWeaponInfoOrBuilder getWeaponListOrBuilder(
      int index);

  /**
   * <code>map&lt;uint32, uint32&gt; summon_tag_map = 10;</code>
   */
  int getSummonTagMapCount();
  /**
   * <code>map&lt;uint32, uint32&gt; summon_tag_map = 10;</code>
   */
  boolean containsSummonTagMap(
      int key);
  /**
   * Use {@link #getSummonTagMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getSummonTagMap();
  /**
   * <code>map&lt;uint32, uint32&gt; summon_tag_map = 10;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getSummonTagMapMap();
  /**
   * <code>map&lt;uint32, uint32&gt; summon_tag_map = 10;</code>
   */

  int getSummonTagMapOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; summon_tag_map = 10;</code>
   */

  int getSummonTagMapOrThrow(
      int key);

  /**
   * <code>repeated uint32 affix_list = 6;</code>
   * @return A list containing the affixList.
   */
  java.util.List<java.lang.Integer> getAffixListList();
  /**
   * <code>repeated uint32 affix_list = 6;</code>
   * @return The count of affixList.
   */
  int getAffixListCount();
  /**
   * <code>repeated uint32 affix_list = 6;</code>
   * @param index The index of the element to return.
   * @return The affixList at the given index.
   */
  int getAffixList(int index);

  /**
   * <code>.MonsterRoute monster_route = 18;</code>
   * @return Whether the monsterRoute field is set.
   */
  boolean hasMonsterRoute();
  /**
   * <code>.MonsterRoute monster_route = 18;</code>
   * @return The monsterRoute.
   */
  io.grasscutter.net.proto.define.MonsterRoute getMonsterRoute();
  /**
   * <code>.MonsterRoute monster_route = 18;</code>
   */
  io.grasscutter.net.proto.define.MonsterRouteOrBuilder getMonsterRouteOrBuilder();

  /**
   * <code>uint32 monster_id = 1;</code>
   * @return The monsterId.
   */
  int getMonsterId();

  /**
   * <code>uint32 group_id = 2;</code>
   * @return The groupId.
   */
  int getGroupId();

  /**
   * <code>uint32 config_id = 3;</code>
   * @return The configId.
   */
  int getConfigId();

  /**
   * <code>uint32 camp_type = 21;</code>
   * @return The campType.
   */
  int getCampType();

  /**
   * <code>uint32 owner_entity_id = 8;</code>
   * @return The ownerEntityId.
   */
  int getOwnerEntityId();

  /**
   * <code>uint32 block_id = 13;</code>
   * @return The blockId.
   */
  int getBlockId();

  /**
   * <code>uint32 ai_config_id = 19;</code>
   * @return The aiConfigId.
   */
  int getAiConfigId();

  /**
   * <code>bool is_elite = 7;</code>
   * @return The isElite.
   */
  boolean getIsElite();

  /**
   * <code>bool is_light = 22;</code>
   * @return The isLight.
   */
  boolean getIsLight();

  /**
   * <code>uint32 attack_target_id = 17;</code>
   * @return The attackTargetId.
   */
  int getAttackTargetId();

  /**
   * <code>.SceneFishInfo fish_info = 50;</code>
   * @return Whether the fishInfo field is set.
   */
  boolean hasFishInfo();
  /**
   * <code>.SceneFishInfo fish_info = 50;</code>
   * @return The fishInfo.
   */
  io.grasscutter.net.proto.define.SceneFishInfo getFishInfo();
  /**
   * <code>.SceneFishInfo fish_info = 50;</code>
   */
  io.grasscutter.net.proto.define.SceneFishInfoOrBuilder getFishInfoOrBuilder();

  /**
   * <code>.FishtankFishInfo fishtank_fish_info = 51;</code>
   * @return Whether the fishtankFishInfo field is set.
   */
  boolean hasFishtankFishInfo();
  /**
   * <code>.FishtankFishInfo fishtank_fish_info = 51;</code>
   * @return The fishtankFishInfo.
   */
  io.grasscutter.net.proto.define.FishtankFishInfo getFishtankFishInfo();
  /**
   * <code>.FishtankFishInfo fishtank_fish_info = 51;</code>
   */
  io.grasscutter.net.proto.define.FishtankFishInfoOrBuilder getFishtankFishInfoOrBuilder();

  /**
   * <code>uint32 level_route_id = 20;</code>
   * @return The levelRouteId.
   */
  int getLevelRouteId();

  /**
   * <code>uint32 summoned_tag = 9;</code>
   * @return The summonedTag.
   */
  int getSummonedTag();

  /**
   * <code>.MonsterBornType born_type = 12;</code>
   * @return The enum numeric value on the wire for bornType.
   */
  int getBornTypeValue();
  /**
   * <code>.MonsterBornType born_type = 12;</code>
   * @return The bornType.
   */
  io.grasscutter.net.proto.define.MonsterBornType getBornType();

  /**
   * <code>uint32 mark_flag = 14;</code>
   * @return The markFlag.
   */
  int getMarkFlag();

  /**
   * <code>uint32 title_id = 15;</code>
   * @return The titleId.
   */
  int getTitleId();

  /**
   * <code>uint32 authority_peer_id = 5;</code>
   * @return The authorityPeerId.
   */
  int getAuthorityPeerId();

  /**
   * <code>uint32 special_name_id = 16;</code>
   * @return The specialNameId.
   */
  int getSpecialNameId();

  /**
   * <code>uint32 pose_id = 11;</code>
   * @return The poseId.
   */
  int getPoseId();

  public io.grasscutter.net.proto.define.SceneMonsterInfo.ContentCase getContentCase();
}
