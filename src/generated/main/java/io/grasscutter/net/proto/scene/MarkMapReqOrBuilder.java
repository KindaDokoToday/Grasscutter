// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

public interface MarkMapReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MarkMapReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MapMarkPoint mark = 8;</code>
   * @return Whether the mark field is set.
   */
  boolean hasMark();
  /**
   * <code>.MapMarkPoint mark = 8;</code>
   * @return The mark.
   */
  io.grasscutter.net.proto.define.MapMarkPoint getMark();
  /**
   * <code>.MapMarkPoint mark = 8;</code>
   */
  io.grasscutter.net.proto.define.MapMarkPointOrBuilder getMarkOrBuilder();

  /**
   * <code>.MapMarkPoint old = 13;</code>
   * @return Whether the old field is set.
   */
  boolean hasOld();
  /**
   * <code>.MapMarkPoint old = 13;</code>
   * @return The old.
   */
  io.grasscutter.net.proto.define.MapMarkPoint getOld();
  /**
   * <code>.MapMarkPoint old = 13;</code>
   */
  io.grasscutter.net.proto.define.MapMarkPointOrBuilder getOldOrBuilder();

  /**
   * <code>.Operation op = 15;</code>
   * @return The enum numeric value on the wire for op.
   */
  int getOpValue();
  /**
   * <code>.Operation op = 15;</code>
   * @return The op.
   */
  io.grasscutter.net.proto.scene.Operation getOp();
}
