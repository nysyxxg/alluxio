// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface GetTableColumnStatisticsPResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.GetTableColumnStatisticsPResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  java.util.List<alluxio.grpc.table.ColumnStatisticsInfo> 
      getStatisticsList();
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  alluxio.grpc.table.ColumnStatisticsInfo getStatistics(int index);
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  int getStatisticsCount();
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  java.util.List<? extends alluxio.grpc.table.ColumnStatisticsInfoOrBuilder> 
      getStatisticsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  alluxio.grpc.table.ColumnStatisticsInfoOrBuilder getStatisticsOrBuilder(
      int index);
}
