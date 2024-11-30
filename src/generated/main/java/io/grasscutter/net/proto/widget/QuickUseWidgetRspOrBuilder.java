// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: widget.proto

package io.grasscutter.net.proto.widget;

public interface QuickUseWidgetRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:QuickUseWidgetRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 material_id = 1;</code>
   * @return The materialId.
   */
  int getMaterialId();

  /**
   * <code>int32 retcode = 11;</code>
   * @return The retcode.
   */
  int getRetcode();

  /**
   * <code>.OEHGBGEALHN detector_data = 3;</code>
   * @return Whether the detectorData field is set.
   */
  boolean hasDetectorData();
  /**
   * <code>.OEHGBGEALHN detector_data = 3;</code>
   * @return The detectorData.
   */
  io.grasscutter.net.proto.widget.OEHGBGEALHN getDetectorData();
  /**
   * <code>.OEHGBGEALHN detector_data = 3;</code>
   */
  io.grasscutter.net.proto.widget.OEHGBGEALHNOrBuilder getDetectorDataOrBuilder();

  /**
   * <code>.ClientCollectorData client_collector_data = 9;</code>
   * @return Whether the clientCollectorData field is set.
   */
  boolean hasClientCollectorData();
  /**
   * <code>.ClientCollectorData client_collector_data = 9;</code>
   * @return The clientCollectorData.
   */
  io.grasscutter.net.proto.widget.ClientCollectorData getClientCollectorData();
  /**
   * <code>.ClientCollectorData client_collector_data = 9;</code>
   */
  io.grasscutter.net.proto.widget.ClientCollectorDataOrBuilder getClientCollectorDataOrBuilder();

  /**
   * <code>.SkyCrystalDetectorQuickUseResult sky_crystal_detector_quick_use_result = 149206;</code>
   * @return Whether the skyCrystalDetectorQuickUseResult field is set.
   */
  boolean hasSkyCrystalDetectorQuickUseResult();
  /**
   * <code>.SkyCrystalDetectorQuickUseResult sky_crystal_detector_quick_use_result = 149206;</code>
   * @return The skyCrystalDetectorQuickUseResult.
   */
  io.grasscutter.net.proto.widget.SkyCrystalDetectorQuickUseResult getSkyCrystalDetectorQuickUseResult();
  /**
   * <code>.SkyCrystalDetectorQuickUseResult sky_crystal_detector_quick_use_result = 149206;</code>
   */
  io.grasscutter.net.proto.widget.SkyCrystalDetectorQuickUseResultOrBuilder getSkyCrystalDetectorQuickUseResultOrBuilder();

  public io.grasscutter.net.proto.widget.QuickUseWidgetRsp.NBDOFGCPFEJCase getNBDOFGCPFEJCase();
}
