// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: avatar.proto

package io.grasscutter.net.proto.avatar;

public interface AddNoGachaAvatarCardNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AddNoGachaAvatarCardNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .AddNoGachaAvatarCardTransferItem transfer_item_list = 11;</code>
   */
  java.util.List<io.grasscutter.net.proto.avatar.AddNoGachaAvatarCardTransferItem> 
      getTransferItemListList();
  /**
   * <code>repeated .AddNoGachaAvatarCardTransferItem transfer_item_list = 11;</code>
   */
  io.grasscutter.net.proto.avatar.AddNoGachaAvatarCardTransferItem getTransferItemList(int index);
  /**
   * <code>repeated .AddNoGachaAvatarCardTransferItem transfer_item_list = 11;</code>
   */
  int getTransferItemListCount();
  /**
   * <code>repeated .AddNoGachaAvatarCardTransferItem transfer_item_list = 11;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.avatar.AddNoGachaAvatarCardTransferItemOrBuilder> 
      getTransferItemListOrBuilderList();
  /**
   * <code>repeated .AddNoGachaAvatarCardTransferItem transfer_item_list = 11;</code>
   */
  io.grasscutter.net.proto.avatar.AddNoGachaAvatarCardTransferItemOrBuilder getTransferItemListOrBuilder(
      int index);

  /**
   * <code>uint32 item_id = 15;</code>
   * @return The itemId.
   */
  int getItemId();

  /**
   * <code>uint32 initial_promote_level = 4;</code>
   * @return The initialPromoteLevel.
   */
  int getInitialPromoteLevel();

  /**
   * <code>uint32 initial_level = 10;</code>
   * @return The initialLevel.
   */
  int getInitialLevel();

  /**
   * <code>bool is_transfer_to_item = 9;</code>
   * @return The isTransferToItem.
   */
  boolean getIsTransferToItem();

  /**
   * <code>uint32 avatar_id = 8;</code>
   * @return The avatarId.
   */
  int getAvatarId();

  /**
   * <code>uint32 reason = 13;</code>
   * @return The reason.
   */
  int getReason();
}
