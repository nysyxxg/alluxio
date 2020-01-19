// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface LayoutOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.Layout)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string layout_type = 1;</code>
   */
  boolean hasLayoutType();
  /**
   * <code>optional string layout_type = 1;</code>
   */
  java.lang.String getLayoutType();
  /**
   * <code>optional string layout_type = 1;</code>
   */
  com.google.protobuf.ByteString
      getLayoutTypeBytes();

  /**
   * <code>optional .alluxio.grpc.table.LayoutSpec layout_spec = 2;</code>
   */
  boolean hasLayoutSpec();
  /**
   * <code>optional .alluxio.grpc.table.LayoutSpec layout_spec = 2;</code>
   */
  alluxio.grpc.table.LayoutSpec getLayoutSpec();
  /**
   * <code>optional .alluxio.grpc.table.LayoutSpec layout_spec = 2;</code>
   */
  alluxio.grpc.table.LayoutSpecOrBuilder getLayoutSpecOrBuilder();

  /**
   * <code>optional bytes layout_data = 3;</code>
   */
  boolean hasLayoutData();
  /**
   * <code>optional bytes layout_data = 3;</code>
   */
  com.google.protobuf.ByteString getLayoutData();

  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; stats = 4;</code>
   */
  int getStatsCount();
  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; stats = 4;</code>
   */
  boolean containsStats(
      java.lang.String key);
  /**
   * Use {@link #getStatsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsInfo>
  getStats();
  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; stats = 4;</code>
   */
  java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsInfo>
  getStatsMap();
  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; stats = 4;</code>
   */

  alluxio.grpc.table.ColumnStatisticsInfo getStatsOrDefault(
      java.lang.String key,
      alluxio.grpc.table.ColumnStatisticsInfo defaultValue);
  /**
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; stats = 4;</code>
   */

  alluxio.grpc.table.ColumnStatisticsInfo getStatsOrThrow(
      java.lang.String key);
}
