// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: social.proto

package io.grasscutter.net.proto.social;

public interface FriendBriefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FriendBrief)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nickname = 2;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 2;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>string remark_name = 17;</code>
   * @return The remarkName.
   */
  java.lang.String getRemarkName();
  /**
   * <code>string remark_name = 17;</code>
   * @return The bytes for remarkName.
   */
  com.google.protobuf.ByteString
      getRemarkNameBytes();

  /**
   * <code>string signature = 6;</code>
   * @return The signature.
   */
  java.lang.String getSignature();
  /**
   * <code>string signature = 6;</code>
   * @return The bytes for signature.
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

  /**
   * <code>string LBKDGOEFEBC = 32;</code>
   * @return The lBKDGOEFEBC.
   */
  java.lang.String getLBKDGOEFEBC();
  /**
   * <code>string LBKDGOEFEBC = 32;</code>
   * @return The bytes for lBKDGOEFEBC.
   */
  com.google.protobuf.ByteString
      getLBKDGOEFEBCBytes();

  /**
   * <code>string IJLHLCLLENE = 31;</code>
   * @return The iJLHLCLLENE.
   */
  java.lang.String getIJLHLCLLENE();
  /**
   * <code>string IJLHLCLLENE = 31;</code>
   * @return The bytes for iJLHLCLLENE.
   */
  com.google.protobuf.ByteString
      getIJLHLCLLENEBytes();

  /**
   * <code>string online_id = 11;</code>
   * @return The onlineId.
   */
  java.lang.String getOnlineId();
  /**
   * <code>string online_id = 11;</code>
   * @return The bytes for onlineId.
   */
  com.google.protobuf.ByteString
      getOnlineIdBytes();

  /**
   * <code>repeated .SocialShowAvatarInfo show_avatar_info_list = 22;</code>
   */
  java.util.List<io.grasscutter.net.proto.social.SocialShowAvatarInfo> 
      getShowAvatarInfoListList();
  /**
   * <code>repeated .SocialShowAvatarInfo show_avatar_info_list = 22;</code>
   */
  io.grasscutter.net.proto.social.SocialShowAvatarInfo getShowAvatarInfoList(int index);
  /**
   * <code>repeated .SocialShowAvatarInfo show_avatar_info_list = 22;</code>
   */
  int getShowAvatarInfoListCount();
  /**
   * <code>repeated .SocialShowAvatarInfo show_avatar_info_list = 22;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.social.SocialShowAvatarInfoOrBuilder> 
      getShowAvatarInfoListOrBuilderList();
  /**
   * <code>repeated .SocialShowAvatarInfo show_avatar_info_list = 22;</code>
   */
  io.grasscutter.net.proto.social.SocialShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(
      int index);

  /**
   * <code>.ProfilePicture profile_picture = 24;</code>
   * @return Whether the profilePicture field is set.
   */
  boolean hasProfilePicture();
  /**
   * <code>.ProfilePicture profile_picture = 24;</code>
   * @return The profilePicture.
   */
  io.grasscutter.net.proto.define.ProfilePicture getProfilePicture();
  /**
   * <code>.ProfilePicture profile_picture = 24;</code>
   */
  io.grasscutter.net.proto.define.ProfilePictureOrBuilder getProfilePictureOrBuilder();

  /**
   * <code>uint32 chat_sequence = 16;</code>
   * @return The chatSequence.
   */
  int getChatSequence();

  /**
   * <code>uint32 last_active_time = 12;</code>
   * @return The lastActiveTime.
   */
  int getLastActiveTime();

  /**
   * <code>uint32 param = 8;</code>
   * @return The param.
   */
  int getParam();

  /**
   * <code>.FriendOnlineState online_state = 7;</code>
   * @return The enum numeric value on the wire for onlineState.
   */
  int getOnlineStateValue();
  /**
   * <code>.FriendOnlineState online_state = 7;</code>
   * @return The onlineState.
   */
  io.grasscutter.net.proto.social.FriendOnlineState getOnlineState();

  /**
   * <code>uint32 level = 3;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <code>.NFONHFAMDNE device_info = 27;</code>
   * @return The enum numeric value on the wire for deviceInfo.
   */
  int getDeviceInfoValue();
  /**
   * <code>.NFONHFAMDNE device_info = 27;</code>
   * @return The deviceInfo.
   */
  io.grasscutter.net.proto.social.NFONHFAMDNE getDeviceInfo();

  /**
   * <code>uint32 name_card_id = 13;</code>
   * @return The nameCardId.
   */
  int getNameCardId();

  /**
   * <code>uint32 avatar_id = 4;</code>
   * @return The avatarId.
   */
  int getAvatarId();

  /**
   * <code>uint32 world_level = 5;</code>
   * @return The worldLevel.
   */
  int getWorldLevel();

  /**
   * <code>uint32 mp_player_num = 14;</code>
   * @return The mpPlayerNum.
   */
  int getMpPlayerNum();

  /**
   * <code>bool is_psn_source = 26;</code>
   * @return The isPsnSource.
   */
  boolean getIsPsnSource();

  /**
   * <code>bool is_chat_no_disturb = 15;</code>
   * @return The isChatNoDisturb.
   */
  boolean getIsChatNoDisturb();

  /**
   * <code>bool DPLLLEKLOEI = 28;</code>
   * @return The dPLLLEKLOEI.
   */
  boolean getDPLLLEKLOEI();

  /**
   * <code>bool NEANBGINFPF = 29;</code>
   * @return The nEANBGINFPF.
   */
  boolean getNEANBGINFPF();

  /**
   * <code>uint32 uid = 1;</code>
   * @return The uid.
   */
  int getUid();

  /**
   * <code>.FriendEnterHomeOption friend_enter_home_option = 23;</code>
   * @return The enum numeric value on the wire for friendEnterHomeOption.
   */
  int getFriendEnterHomeOptionValue();
  /**
   * <code>.FriendEnterHomeOption friend_enter_home_option = 23;</code>
   * @return The friendEnterHomeOption.
   */
  io.grasscutter.net.proto.define.FriendEnterHomeOption getFriendEnterHomeOption();

  /**
   * <code>bool is_game_source = 25;</code>
   * @return The isGameSource.
   */
  boolean getIsGameSource();

  /**
   * <code>bool JADDAKOJMBB = 30;</code>
   * @return The jADDAKOJMBB.
   */
  boolean getJADDAKOJMBB();

  /**
   * <code>bool is_mp_mode_available = 10;</code>
   * @return The isMpModeAvailable.
   */
  boolean getIsMpModeAvailable();
}
