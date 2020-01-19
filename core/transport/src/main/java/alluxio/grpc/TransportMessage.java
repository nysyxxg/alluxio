// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/messaging_transport.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.messaging.TransportMessage}
 */
public  final class TransportMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.messaging.TransportMessage)
    TransportMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransportMessage.newBuilder() to construct.
  private TransportMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransportMessage() {
    message_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransportMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            alluxio.grpc.MessagingRequestHeader.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = requestHeader_.toBuilder();
            }
            requestHeader_ = input.readMessage(alluxio.grpc.MessagingRequestHeader.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(requestHeader_);
              requestHeader_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            alluxio.grpc.MessagingResponseHeader.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = responseHeader_.toBuilder();
            }
            responseHeader_ = input.readMessage(alluxio.grpc.MessagingResponseHeader.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(responseHeader_);
              responseHeader_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            message_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.MessagingTransportProto.internal_static_alluxio_grpc_messaging_TransportMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.MessagingTransportProto.internal_static_alluxio_grpc_messaging_TransportMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.TransportMessage.class, alluxio.grpc.TransportMessage.Builder.class);
  }

  private int bitField0_;
  public static final int REQUESTHEADER_FIELD_NUMBER = 1;
  private alluxio.grpc.MessagingRequestHeader requestHeader_;
  /**
   * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
   */
  public boolean hasRequestHeader() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
   */
  public alluxio.grpc.MessagingRequestHeader getRequestHeader() {
    return requestHeader_ == null ? alluxio.grpc.MessagingRequestHeader.getDefaultInstance() : requestHeader_;
  }
  /**
   * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
   */
  public alluxio.grpc.MessagingRequestHeaderOrBuilder getRequestHeaderOrBuilder() {
    return requestHeader_ == null ? alluxio.grpc.MessagingRequestHeader.getDefaultInstance() : requestHeader_;
  }

  public static final int RESPONSEHEADER_FIELD_NUMBER = 2;
  private alluxio.grpc.MessagingResponseHeader responseHeader_;
  /**
   * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
   */
  public boolean hasResponseHeader() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
   */
  public alluxio.grpc.MessagingResponseHeader getResponseHeader() {
    return responseHeader_ == null ? alluxio.grpc.MessagingResponseHeader.getDefaultInstance() : responseHeader_;
  }
  /**
   * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
   */
  public alluxio.grpc.MessagingResponseHeaderOrBuilder getResponseHeaderOrBuilder() {
    return responseHeader_ == null ? alluxio.grpc.MessagingResponseHeader.getDefaultInstance() : responseHeader_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString message_;
  /**
   * <code>optional bytes message = 3;</code>
   */
  public boolean hasMessage() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bytes message = 3;</code>
   */
  public com.google.protobuf.ByteString getMessage() {
    return message_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getRequestHeader());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getResponseHeader());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, message_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequestHeader());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResponseHeader());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, message_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.TransportMessage)) {
      return super.equals(obj);
    }
    alluxio.grpc.TransportMessage other = (alluxio.grpc.TransportMessage) obj;

    boolean result = true;
    result = result && (hasRequestHeader() == other.hasRequestHeader());
    if (hasRequestHeader()) {
      result = result && getRequestHeader()
          .equals(other.getRequestHeader());
    }
    result = result && (hasResponseHeader() == other.hasResponseHeader());
    if (hasResponseHeader()) {
      result = result && getResponseHeader()
          .equals(other.getResponseHeader());
    }
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRequestHeader()) {
      hash = (37 * hash) + REQUESTHEADER_FIELD_NUMBER;
      hash = (53 * hash) + getRequestHeader().hashCode();
    }
    if (hasResponseHeader()) {
      hash = (37 * hash) + RESPONSEHEADER_FIELD_NUMBER;
      hash = (53 * hash) + getResponseHeader().hashCode();
    }
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.TransportMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.TransportMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.TransportMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.TransportMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.TransportMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.TransportMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.TransportMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.TransportMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.TransportMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.TransportMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.TransportMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.TransportMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.TransportMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.messaging.TransportMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.messaging.TransportMessage)
      alluxio.grpc.TransportMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.MessagingTransportProto.internal_static_alluxio_grpc_messaging_TransportMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.MessagingTransportProto.internal_static_alluxio_grpc_messaging_TransportMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.TransportMessage.class, alluxio.grpc.TransportMessage.Builder.class);
    }

    // Construct using alluxio.grpc.TransportMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRequestHeaderFieldBuilder();
        getResponseHeaderFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (requestHeaderBuilder_ == null) {
        requestHeader_ = null;
      } else {
        requestHeaderBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (responseHeaderBuilder_ == null) {
        responseHeader_ = null;
      } else {
        responseHeaderBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      message_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.MessagingTransportProto.internal_static_alluxio_grpc_messaging_TransportMessage_descriptor;
    }

    public alluxio.grpc.TransportMessage getDefaultInstanceForType() {
      return alluxio.grpc.TransportMessage.getDefaultInstance();
    }

    public alluxio.grpc.TransportMessage build() {
      alluxio.grpc.TransportMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.TransportMessage buildPartial() {
      alluxio.grpc.TransportMessage result = new alluxio.grpc.TransportMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (requestHeaderBuilder_ == null) {
        result.requestHeader_ = requestHeader_;
      } else {
        result.requestHeader_ = requestHeaderBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (responseHeaderBuilder_ == null) {
        result.responseHeader_ = responseHeader_;
      } else {
        result.responseHeader_ = responseHeaderBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.message_ = message_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.TransportMessage) {
        return mergeFrom((alluxio.grpc.TransportMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.TransportMessage other) {
      if (other == alluxio.grpc.TransportMessage.getDefaultInstance()) return this;
      if (other.hasRequestHeader()) {
        mergeRequestHeader(other.getRequestHeader());
      }
      if (other.hasResponseHeader()) {
        mergeResponseHeader(other.getResponseHeader());
      }
      if (other.hasMessage()) {
        setMessage(other.getMessage());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.TransportMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.TransportMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private alluxio.grpc.MessagingRequestHeader requestHeader_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.MessagingRequestHeader, alluxio.grpc.MessagingRequestHeader.Builder, alluxio.grpc.MessagingRequestHeaderOrBuilder> requestHeaderBuilder_;
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    public boolean hasRequestHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    public alluxio.grpc.MessagingRequestHeader getRequestHeader() {
      if (requestHeaderBuilder_ == null) {
        return requestHeader_ == null ? alluxio.grpc.MessagingRequestHeader.getDefaultInstance() : requestHeader_;
      } else {
        return requestHeaderBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    public Builder setRequestHeader(alluxio.grpc.MessagingRequestHeader value) {
      if (requestHeaderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestHeader_ = value;
        onChanged();
      } else {
        requestHeaderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    public Builder setRequestHeader(
        alluxio.grpc.MessagingRequestHeader.Builder builderForValue) {
      if (requestHeaderBuilder_ == null) {
        requestHeader_ = builderForValue.build();
        onChanged();
      } else {
        requestHeaderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    public Builder mergeRequestHeader(alluxio.grpc.MessagingRequestHeader value) {
      if (requestHeaderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            requestHeader_ != null &&
            requestHeader_ != alluxio.grpc.MessagingRequestHeader.getDefaultInstance()) {
          requestHeader_ =
            alluxio.grpc.MessagingRequestHeader.newBuilder(requestHeader_).mergeFrom(value).buildPartial();
        } else {
          requestHeader_ = value;
        }
        onChanged();
      } else {
        requestHeaderBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    public Builder clearRequestHeader() {
      if (requestHeaderBuilder_ == null) {
        requestHeader_ = null;
        onChanged();
      } else {
        requestHeaderBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    public alluxio.grpc.MessagingRequestHeader.Builder getRequestHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRequestHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    public alluxio.grpc.MessagingRequestHeaderOrBuilder getRequestHeaderOrBuilder() {
      if (requestHeaderBuilder_ != null) {
        return requestHeaderBuilder_.getMessageOrBuilder();
      } else {
        return requestHeader_ == null ?
            alluxio.grpc.MessagingRequestHeader.getDefaultInstance() : requestHeader_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingRequestHeader requestHeader = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.MessagingRequestHeader, alluxio.grpc.MessagingRequestHeader.Builder, alluxio.grpc.MessagingRequestHeaderOrBuilder> 
        getRequestHeaderFieldBuilder() {
      if (requestHeaderBuilder_ == null) {
        requestHeaderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.MessagingRequestHeader, alluxio.grpc.MessagingRequestHeader.Builder, alluxio.grpc.MessagingRequestHeaderOrBuilder>(
                getRequestHeader(),
                getParentForChildren(),
                isClean());
        requestHeader_ = null;
      }
      return requestHeaderBuilder_;
    }

    private alluxio.grpc.MessagingResponseHeader responseHeader_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.MessagingResponseHeader, alluxio.grpc.MessagingResponseHeader.Builder, alluxio.grpc.MessagingResponseHeaderOrBuilder> responseHeaderBuilder_;
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    public boolean hasResponseHeader() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    public alluxio.grpc.MessagingResponseHeader getResponseHeader() {
      if (responseHeaderBuilder_ == null) {
        return responseHeader_ == null ? alluxio.grpc.MessagingResponseHeader.getDefaultInstance() : responseHeader_;
      } else {
        return responseHeaderBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    public Builder setResponseHeader(alluxio.grpc.MessagingResponseHeader value) {
      if (responseHeaderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseHeader_ = value;
        onChanged();
      } else {
        responseHeaderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    public Builder setResponseHeader(
        alluxio.grpc.MessagingResponseHeader.Builder builderForValue) {
      if (responseHeaderBuilder_ == null) {
        responseHeader_ = builderForValue.build();
        onChanged();
      } else {
        responseHeaderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    public Builder mergeResponseHeader(alluxio.grpc.MessagingResponseHeader value) {
      if (responseHeaderBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            responseHeader_ != null &&
            responseHeader_ != alluxio.grpc.MessagingResponseHeader.getDefaultInstance()) {
          responseHeader_ =
            alluxio.grpc.MessagingResponseHeader.newBuilder(responseHeader_).mergeFrom(value).buildPartial();
        } else {
          responseHeader_ = value;
        }
        onChanged();
      } else {
        responseHeaderBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    public Builder clearResponseHeader() {
      if (responseHeaderBuilder_ == null) {
        responseHeader_ = null;
        onChanged();
      } else {
        responseHeaderBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    public alluxio.grpc.MessagingResponseHeader.Builder getResponseHeaderBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResponseHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    public alluxio.grpc.MessagingResponseHeaderOrBuilder getResponseHeaderOrBuilder() {
      if (responseHeaderBuilder_ != null) {
        return responseHeaderBuilder_.getMessageOrBuilder();
      } else {
        return responseHeader_ == null ?
            alluxio.grpc.MessagingResponseHeader.getDefaultInstance() : responseHeader_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.messaging.MessagingResponseHeader responseHeader = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.MessagingResponseHeader, alluxio.grpc.MessagingResponseHeader.Builder, alluxio.grpc.MessagingResponseHeaderOrBuilder> 
        getResponseHeaderFieldBuilder() {
      if (responseHeaderBuilder_ == null) {
        responseHeaderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.MessagingResponseHeader, alluxio.grpc.MessagingResponseHeader.Builder, alluxio.grpc.MessagingResponseHeaderOrBuilder>(
                getResponseHeader(),
                getParentForChildren(),
                isClean());
        responseHeader_ = null;
      }
      return responseHeaderBuilder_;
    }

    private com.google.protobuf.ByteString message_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes message = 3;</code>
     */
    public com.google.protobuf.ByteString getMessage() {
      return message_;
    }
    /**
     * <code>optional bytes message = 3;</code>
     */
    public Builder setMessage(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes message = 3;</code>
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.messaging.TransportMessage)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.messaging.TransportMessage)
  private static final alluxio.grpc.TransportMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.TransportMessage();
  }

  public static alluxio.grpc.TransportMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TransportMessage>
      PARSER = new com.google.protobuf.AbstractParser<TransportMessage>() {
    public TransportMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransportMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransportMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransportMessage> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.TransportMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

