// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/common.proto

package alluxio.grpc;

public interface BlockStoreLocationProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.BlockStoreLocationProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string tierAlias = 1;</code>
   */
  boolean hasTierAlias();
  /**
   * <code>optional string tierAlias = 1;</code>
   */
  java.lang.String getTierAlias();
  /**
   * <code>optional string tierAlias = 1;</code>
   */
  com.google.protobuf.ByteString
      getTierAliasBytes();

  /**
   * <code>optional string mediumType = 2;</code>
   */
  boolean hasMediumType();
  /**
   * <code>optional string mediumType = 2;</code>
   */
  java.lang.String getMediumType();
  /**
   * <code>optional string mediumType = 2;</code>
   */
  com.google.protobuf.ByteString
      getMediumTypeBytes();
}
