// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: social.proto

package io.grasscutter.net.proto.social;

public interface GetPlayerSocialDetailRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetPlayerSocialDetailRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.SocialDetail detail_data = 4;</code>
   * @return Whether the detailData field is set.
   */
  boolean hasDetailData();
  /**
   * <code>.SocialDetail detail_data = 4;</code>
   * @return The detailData.
   */
  io.grasscutter.net.proto.social.SocialDetail getDetailData();
  /**
   * <code>.SocialDetail detail_data = 4;</code>
   */
  io.grasscutter.net.proto.social.SocialDetailOrBuilder getDetailDataOrBuilder();

  /**
   * <code>uint32 param = 11;</code>
   * @return The param.
   */
  int getParam();

  /**
   * <code>int32 retcode = 7;</code>
   * @return The retcode.
   */
  int getRetcode();
}
