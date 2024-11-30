// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: social.proto

package io.grasscutter.net.proto.social;

public final class Social {
  private Social() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetNameCardReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetNameCardReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerFriendListReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerFriendListReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SocialShowAvatarInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SocialShowAvatarInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerSocialDetailReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerSocialDetailReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SocialDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SocialDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetNameCardRsp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetNameCardRsp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerFriendListRsp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerFriendListRsp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllUnlockNameCardRsp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllUnlockNameCardRsp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerSocialDetailRsp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerSocialDetailRsp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllUnlockNameCardReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllUnlockNameCardReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FriendBrief_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FriendBrief_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014social.proto\032\014define.proto\"&\n\016SetNameC" +
      "ardReq\022\024\n\014name_card_id\030\013 \001(\r\"\030\n\026GetPlaye" +
      "rFriendListReq\"v\n\024SocialShowAvatarInfo\022\022" +
      "\n\ncostume_id\030\003 \001(\r\022\023\n\013JEGIIJCNAFN\030\004 \001(\r\022" +
      "\023\n\013BBPGIJFJHEN\030\005 \001(\r\022\021\n\tavatar_id\030\001 \001(\r\022" +
      "\r\n\005level\030\002 \001(\r\"6\n\030GetPlayerSocialDetailR" +
      "eq\022\r\n\005param\030\013 \001(\r\022\013\n\003uid\030\006 \001(\r\"\260\007\n\014Socia" +
      "lDetail\022\023\n\013LBKDGOEFEBC\030\036 \001(\t\022\017\n\007ip_code\030" +
      "\032 \001(\t\022\020\n\010nickname\030\002 \001(\t\022\025\n\rreserved_list" +
      "\030\010 \003(\r\022\036\n\026show_name_card_id_list\030\027 \003(\r\022(" +
      "\n\017profile_picture\030\031 \001(\0132\017.ProfilePicture" +
      "\022\021\n\tsignature\030\005 \001(\t\022\033\n\010birthday\030\006 \001(\0132\t." +
      "Birthday\0224\n\025show_avatar_info_list\030\026 \003(\0132" +
      "\025.SocialShowAvatarInfo\022\021\n\tonline_id\030\r \001(" +
      "\t\022\023\n\013remark_name\030\021 \001(\t\022\023\n\013IJLHLCLLENE\030\035 " +
      "\001(\t\022\031\n\021tower_floor_index\030\023 \001(\r\022\024\n\014name_c" +
      "ard_id\030\016 \001(\r\022\023\n\013MBBJBOEPGHD\030\034 \001(\r\022\023\n\013wor" +
      "ld_level\030\007 \001(\r\022\"\n\014data_version\030$ \001(\0162\014.G" +
      "FLAAGCBNGM\022\023\n\013EFFAAOKCJBC\030# \001(\r\022\r\n\005level" +
      "\030\003 \001(\r\022(\n\014online_state\030\t \001(\0162\022.FriendOnl" +
      "ineState\022\034\n\024is_mp_mode_available\030\014 \001(\010\022\027" +
      "\n\017is_in_blacklist\030\017 \001(\010\022\026\n\016is_show_avata" +
      "r\030\025 \001(\010\022\032\n\022is_chat_no_disturb\030\020 \001(\010\022\031\n\021t" +
      "ower_level_index\030\024 \001(\r\022\023\n\013PKCNAFAFFGD\030! " +
      "\001(\010\022\021\n\tis_friend\030\013 \001(\010\022\021\n\tavatar_id\030\004 \001(" +
      "\r\022\013\n\003uid\030\001 \001(\r\022\023\n\013CEMDJIIPNKB\030\" \001(\r\022\036\n\026f" +
      "inish_achievement_num\030\022 \001(\r\022\r\n\005param\030\n \001" +
      "(\r\022\023\n\013HAINNIIMJAN\030\033 \001(\r\022\023\n\013HNLBJEPHJHL\030 " +
      " \001(\r\0228\n\030friend_enter_home_option\030\030 \001(\0162\026" +
      ".FriendEnterHomeOption\022!\n\013device_info\030\037 " +
      "\001(\0162\014.NFONHFAMDNE\"7\n\016SetNameCardRsp\022\024\n\014n" +
      "ame_card_id\030\017 \001(\r\022\017\n\007retcode\030\t \001(\005\"s\n\026Ge" +
      "tPlayerFriendListRsp\022!\n\013friend_list\030\017 \003(" +
      "\0132\014.FriendBrief\022%\n\017ask_friend_list\030\t \003(\013" +
      "2\014.FriendBrief\022\017\n\007retcode\030\004 \001(\005\"B\n\027GetAl" +
      "lUnlockNameCardRsp\022\026\n\016name_card_list\030\005 \003" +
      "(\r\022\017\n\007retcode\030\010 \001(\005\"^\n\030GetPlayerSocialDe" +
      "tailRsp\022\"\n\013detail_data\030\004 \001(\0132\r.SocialDet" +
      "ail\022\r\n\005param\030\013 \001(\r\022\017\n\007retcode\030\007 \001(\005\"\031\n\027G" +
      "etAllUnlockNameCardReq\"\304\005\n\013FriendBrief\022\020" +
      "\n\010nickname\030\002 \001(\t\022\023\n\013remark_name\030\021 \001(\t\022\021\n" +
      "\tsignature\030\006 \001(\t\022\023\n\013LBKDGOEFEBC\030  \001(\t\022\023\n" +
      "\013IJLHLCLLENE\030\037 \001(\t\022\021\n\tonline_id\030\013 \001(\t\0224\n" +
      "\025show_avatar_info_list\030\026 \003(\0132\025.SocialSho" +
      "wAvatarInfo\022(\n\017profile_picture\030\030 \001(\0132\017.P" +
      "rofilePicture\022\025\n\rchat_sequence\030\020 \001(\r\022\030\n\020" +
      "last_active_time\030\014 \001(\r\022\r\n\005param\030\010 \001(\r\022(\n" +
      "\014online_state\030\007 \001(\0162\022.FriendOnlineState\022" +
      "\r\n\005level\030\003 \001(\r\022!\n\013device_info\030\033 \001(\0162\014.NF" +
      "ONHFAMDNE\022\024\n\014name_card_id\030\r \001(\r\022\021\n\tavata" +
      "r_id\030\004 \001(\r\022\023\n\013world_level\030\005 \001(\r\022\025\n\rmp_pl" +
      "ayer_num\030\016 \001(\r\022\025\n\ris_psn_source\030\032 \001(\010\022\032\n" +
      "\022is_chat_no_disturb\030\017 \001(\010\022\023\n\013DPLLLEKLOEI" +
      "\030\034 \001(\010\022\023\n\013NEANBGINFPF\030\035 \001(\010\022\013\n\003uid\030\001 \001(\r" +
      "\0228\n\030friend_enter_home_option\030\027 \001(\0162\026.Fri" +
      "endEnterHomeOption\022\026\n\016is_game_source\030\031 \001" +
      "(\010\022\023\n\013JADDAKOJMBB\030\036 \001(\010\022\034\n\024is_mp_mode_av" +
      "ailable\030\n \001(\010*b\n\021FriendOnlineState\022(\n$Fr" +
      "iendOnlineState_FREIEND_DISCONNECT\020\000\022#\n\037" +
      "FriendOnlineState_FRIEND_ONLINE\020\001*@\n\013GFL" +
      "AAGCBNGM\022\034\n\030GFLAAGCBNGM_VERSION_NONE\020\000\022\023" +
      "\n\017GFLAAGCBNGM_V50\020\001*\200\005\n\013NFONHFAMDNE\022\026\n\022N" +
      "FONHFAMDNE_EDITOR\020\000\022\023\n\017NFONHFAMDNE_IOS\020\001" +
      "\022\027\n\023NFONHFAMDNE_ANDROID\020\002\022\022\n\016NFONHFAMDNE" +
      "_PC\020\003\022\023\n\017NFONHFAMDNE_PS4\020\004\022\026\n\022NFONHFAMDN" +
      "E_SERVER\020\005\022\035\n\031NFONHFAMDNE_CLOUD_ANDROID\020" +
      "\006\022\031\n\025NFONHFAMDNE_CLOUD_IOS\020\007\022\023\n\017NFONHFAM" +
      "DNE_PS5\020\010\022\031\n\025NFONHFAMDNE_CLOUD_WEB\020\t\022\030\n\024" +
      "NFONHFAMDNE_CLOUD_TV\020\n\022\031\n\025NFONHFAMDNE_CL" +
      "OUD_MAC\020\013\022\030\n\024NFONHFAMDNE_CLOUD_PC\020\014\022(\n$N" +
      "FONHFAMDNE_CLOUD_THIRD_PARTY_MOBILE\020\r\022$\n" +
      " NFONHFAMDNE_CLOUD_THIRD_PARTY_PC\020\016\022!\n\035N" +
      "FONHFAMDNE_CLOUD_WEB_ANDROID\020\017\022\035\n\031NFONHF" +
      "AMDNE_CLOUD_WEB_IOS\020\020\022\034\n\030NFONHFAMDNE_CLO" +
      "UD_WEB_PC\020\021\022\035\n\031NFONHFAMDNE_CLOUD_WEB_MAC" +
      "\020\022\022\037\n\033NFONHFAMDNE_CLOUD_WEB_TOUCH\020\023\022\"\n\036N" +
      "FONHFAMDNE_CLOUD_WEB_KEYBOARD\020\024\022\035\n\031NFONH" +
      "FAMDNE_XBOX_SCARLETT\020\025B#\n\037io.grasscutter" +
      ".net.proto.socialP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.net.proto.define.Define.getDescriptor(),
        });
    internal_static_SetNameCardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetNameCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetNameCardReq_descriptor,
        new java.lang.String[] { "NameCardId", });
    internal_static_GetPlayerFriendListReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetPlayerFriendListReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerFriendListReq_descriptor,
        new java.lang.String[] { });
    internal_static_SocialShowAvatarInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SocialShowAvatarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SocialShowAvatarInfo_descriptor,
        new java.lang.String[] { "CostumeId", "JEGIIJCNAFN", "BBPGIJFJHEN", "AvatarId", "Level", });
    internal_static_GetPlayerSocialDetailReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetPlayerSocialDetailReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerSocialDetailReq_descriptor,
        new java.lang.String[] { "Param", "Uid", });
    internal_static_SocialDetail_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SocialDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SocialDetail_descriptor,
        new java.lang.String[] { "LBKDGOEFEBC", "IpCode", "Nickname", "ReservedList", "ShowNameCardIdList", "ProfilePicture", "Signature", "Birthday", "ShowAvatarInfoList", "OnlineId", "RemarkName", "IJLHLCLLENE", "TowerFloorIndex", "NameCardId", "MBBJBOEPGHD", "WorldLevel", "DataVersion", "EFFAAOKCJBC", "Level", "OnlineState", "IsMpModeAvailable", "IsInBlacklist", "IsShowAvatar", "IsChatNoDisturb", "TowerLevelIndex", "PKCNAFAFFGD", "IsFriend", "AvatarId", "Uid", "CEMDJIIPNKB", "FinishAchievementNum", "Param", "HAINNIIMJAN", "HNLBJEPHJHL", "FriendEnterHomeOption", "DeviceInfo", });
    internal_static_SetNameCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SetNameCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetNameCardRsp_descriptor,
        new java.lang.String[] { "NameCardId", "Retcode", });
    internal_static_GetPlayerFriendListRsp_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GetPlayerFriendListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerFriendListRsp_descriptor,
        new java.lang.String[] { "FriendList", "AskFriendList", "Retcode", });
    internal_static_GetAllUnlockNameCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GetAllUnlockNameCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllUnlockNameCardRsp_descriptor,
        new java.lang.String[] { "NameCardList", "Retcode", });
    internal_static_GetPlayerSocialDetailRsp_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_GetPlayerSocialDetailRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerSocialDetailRsp_descriptor,
        new java.lang.String[] { "DetailData", "Param", "Retcode", });
    internal_static_GetAllUnlockNameCardReq_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_GetAllUnlockNameCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllUnlockNameCardReq_descriptor,
        new java.lang.String[] { });
    internal_static_FriendBrief_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_FriendBrief_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FriendBrief_descriptor,
        new java.lang.String[] { "Nickname", "RemarkName", "Signature", "LBKDGOEFEBC", "IJLHLCLLENE", "OnlineId", "ShowAvatarInfoList", "ProfilePicture", "ChatSequence", "LastActiveTime", "Param", "OnlineState", "Level", "DeviceInfo", "NameCardId", "AvatarId", "WorldLevel", "MpPlayerNum", "IsPsnSource", "IsChatNoDisturb", "DPLLLEKLOEI", "NEANBGINFPF", "Uid", "FriendEnterHomeOption", "IsGameSource", "JADDAKOJMBB", "IsMpModeAvailable", });
    io.grasscutter.net.proto.define.Define.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
