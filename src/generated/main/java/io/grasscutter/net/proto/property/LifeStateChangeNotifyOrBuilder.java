// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: property.proto

package io.grasscutter.net.proto.property;

public interface LifeStateChangeNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LifeStateChangeNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string OHMKBGAMEIM = 4;</code>
   * @return A list containing the oHMKBGAMEIM.
   */
  java.util.List<java.lang.String>
      getOHMKBGAMEIMList();
  /**
   * <code>repeated string OHMKBGAMEIM = 4;</code>
   * @return The count of oHMKBGAMEIM.
   */
  int getOHMKBGAMEIMCount();
  /**
   * <code>repeated string OHMKBGAMEIM = 4;</code>
   * @param index The index of the element to return.
   * @return The oHMKBGAMEIM at the given index.
   */
  java.lang.String getOHMKBGAMEIM(int index);
  /**
   * <code>repeated string OHMKBGAMEIM = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the oHMKBGAMEIM at the given index.
   */
  com.google.protobuf.ByteString
      getOHMKBGAMEIMBytes(int index);

  /**
   * <code>repeated .ServerBuff server_buff_list = 6;</code>
   */
  java.util.List<io.grasscutter.net.proto.define.ServerBuff> 
      getServerBuffListList();
  /**
   * <code>repeated .ServerBuff server_buff_list = 6;</code>
   */
  io.grasscutter.net.proto.define.ServerBuff getServerBuffList(int index);
  /**
   * <code>repeated .ServerBuff server_buff_list = 6;</code>
   */
  int getServerBuffListCount();
  /**
   * <code>repeated .ServerBuff server_buff_list = 6;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.define.ServerBuffOrBuilder> 
      getServerBuffListOrBuilderList();
  /**
   * <code>repeated .ServerBuff server_buff_list = 6;</code>
   */
  io.grasscutter.net.proto.define.ServerBuffOrBuilder getServerBuffListOrBuilder(
      int index);

  /**
   * <code>string attack_tag = 9;</code>
   * @return The attackTag.
   */
  java.lang.String getAttackTag();
  /**
   * <code>string attack_tag = 9;</code>
   * @return The bytes for attackTag.
   */
  com.google.protobuf.ByteString
      getAttackTagBytes();

  /**
   * <code>uint32 entity_id = 8;</code>
   * @return The entityId.
   */
  int getEntityId();

  /**
   * <code>uint32 move_reliable_seq = 13;</code>
   * @return The moveReliableSeq.
   */
  int getMoveReliableSeq();

  /**
   * <code>uint32 life_state = 12;</code>
   * @return The lifeState.
   */
  int getLifeState();

  /**
   * <code>.PlayerDieType die_type = 2;</code>
   * @return The enum numeric value on the wire for dieType.
   */
  int getDieTypeValue();
  /**
   * <code>.PlayerDieType die_type = 2;</code>
   * @return The dieType.
   */
  io.grasscutter.net.proto.define.PlayerDieType getDieType();

  /**
   * <code>uint32 source_entity_id = 5;</code>
   * @return The sourceEntityId.
   */
  int getSourceEntityId();
}
