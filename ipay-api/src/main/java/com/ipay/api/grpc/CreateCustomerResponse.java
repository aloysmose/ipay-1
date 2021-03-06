// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ipay.proto

package com.ipay.api.grpc;

/**
 * Protobuf type {@code com.ipay.api.CreateCustomerResponse}
 */
public  final class CreateCustomerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ipay.api.CreateCustomerResponse)
    CreateCustomerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCustomerResponse.newBuilder() to construct.
  private CreateCustomerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCustomerResponse() {
    customerId_ = "";
    name_ = "";
    email_ = "";
    phonenumber_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateCustomerResponse(
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.ipay.api.grpc.ServiceGenericReply.Builder subBuilder = null;
            if (reply_ != null) {
              subBuilder = reply_.toBuilder();
            }
            reply_ = input.readMessage(com.ipay.api.grpc.ServiceGenericReply.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(reply_);
              reply_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            customerId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            phonenumber_ = s;
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
    return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_CreateCustomerResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_CreateCustomerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ipay.api.grpc.CreateCustomerResponse.class, com.ipay.api.grpc.CreateCustomerResponse.Builder.class);
  }

  public static final int REPLY_FIELD_NUMBER = 1;
  private com.ipay.api.grpc.ServiceGenericReply reply_;
  /**
   * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
   */
  public boolean hasReply() {
    return reply_ != null;
  }
  /**
   * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
   */
  public com.ipay.api.grpc.ServiceGenericReply getReply() {
    return reply_ == null ? com.ipay.api.grpc.ServiceGenericReply.getDefaultInstance() : reply_;
  }
  /**
   * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
   */
  public com.ipay.api.grpc.ServiceGenericReplyOrBuilder getReplyOrBuilder() {
    return getReply();
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object customerId_;
  /**
   * <code>string customer_id = 2;</code>
   */
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <code>string customer_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 4;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 4;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 4;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONENUMBER_FIELD_NUMBER = 5;
  private volatile java.lang.Object phonenumber_;
  /**
   * <code>string phonenumber = 5;</code>
   */
  public java.lang.String getPhonenumber() {
    java.lang.Object ref = phonenumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phonenumber_ = s;
      return s;
    }
  }
  /**
   * <code>string phonenumber = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPhonenumberBytes() {
    java.lang.Object ref = phonenumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phonenumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (reply_ != null) {
      output.writeMessage(1, getReply());
    }
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, customerId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
    }
    if (!getPhonenumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, phonenumber_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reply_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReply());
    }
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, customerId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
    }
    if (!getPhonenumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, phonenumber_);
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
    if (!(obj instanceof com.ipay.api.grpc.CreateCustomerResponse)) {
      return super.equals(obj);
    }
    com.ipay.api.grpc.CreateCustomerResponse other = (com.ipay.api.grpc.CreateCustomerResponse) obj;

    boolean result = true;
    result = result && (hasReply() == other.hasReply());
    if (hasReply()) {
      result = result && getReply()
          .equals(other.getReply());
    }
    result = result && getCustomerId()
        .equals(other.getCustomerId());
    result = result && getName()
        .equals(other.getName());
    result = result && getEmail()
        .equals(other.getEmail());
    result = result && getPhonenumber()
        .equals(other.getPhonenumber());
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
    if (hasReply()) {
      hash = (37 * hash) + REPLY_FIELD_NUMBER;
      hash = (53 * hash) + getReply().hashCode();
    }
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + PHONENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPhonenumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ipay.api.grpc.CreateCustomerResponse parseFrom(
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
  public static Builder newBuilder(com.ipay.api.grpc.CreateCustomerResponse prototype) {
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
   * Protobuf type {@code com.ipay.api.CreateCustomerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ipay.api.CreateCustomerResponse)
      com.ipay.api.grpc.CreateCustomerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_CreateCustomerResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_CreateCustomerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ipay.api.grpc.CreateCustomerResponse.class, com.ipay.api.grpc.CreateCustomerResponse.Builder.class);
    }

    // Construct using com.ipay.api.grpc.CreateCustomerResponse.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (replyBuilder_ == null) {
        reply_ = null;
      } else {
        reply_ = null;
        replyBuilder_ = null;
      }
      customerId_ = "";

      name_ = "";

      email_ = "";

      phonenumber_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_CreateCustomerResponse_descriptor;
    }

    public com.ipay.api.grpc.CreateCustomerResponse getDefaultInstanceForType() {
      return com.ipay.api.grpc.CreateCustomerResponse.getDefaultInstance();
    }

    public com.ipay.api.grpc.CreateCustomerResponse build() {
      com.ipay.api.grpc.CreateCustomerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ipay.api.grpc.CreateCustomerResponse buildPartial() {
      com.ipay.api.grpc.CreateCustomerResponse result = new com.ipay.api.grpc.CreateCustomerResponse(this);
      if (replyBuilder_ == null) {
        result.reply_ = reply_;
      } else {
        result.reply_ = replyBuilder_.build();
      }
      result.customerId_ = customerId_;
      result.name_ = name_;
      result.email_ = email_;
      result.phonenumber_ = phonenumber_;
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
      if (other instanceof com.ipay.api.grpc.CreateCustomerResponse) {
        return mergeFrom((com.ipay.api.grpc.CreateCustomerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ipay.api.grpc.CreateCustomerResponse other) {
      if (other == com.ipay.api.grpc.CreateCustomerResponse.getDefaultInstance()) return this;
      if (other.hasReply()) {
        mergeReply(other.getReply());
      }
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (!other.getPhonenumber().isEmpty()) {
        phonenumber_ = other.phonenumber_;
        onChanged();
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
      com.ipay.api.grpc.CreateCustomerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ipay.api.grpc.CreateCustomerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.ipay.api.grpc.ServiceGenericReply reply_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ipay.api.grpc.ServiceGenericReply, com.ipay.api.grpc.ServiceGenericReply.Builder, com.ipay.api.grpc.ServiceGenericReplyOrBuilder> replyBuilder_;
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    public boolean hasReply() {
      return replyBuilder_ != null || reply_ != null;
    }
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    public com.ipay.api.grpc.ServiceGenericReply getReply() {
      if (replyBuilder_ == null) {
        return reply_ == null ? com.ipay.api.grpc.ServiceGenericReply.getDefaultInstance() : reply_;
      } else {
        return replyBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    public Builder setReply(com.ipay.api.grpc.ServiceGenericReply value) {
      if (replyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reply_ = value;
        onChanged();
      } else {
        replyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    public Builder setReply(
        com.ipay.api.grpc.ServiceGenericReply.Builder builderForValue) {
      if (replyBuilder_ == null) {
        reply_ = builderForValue.build();
        onChanged();
      } else {
        replyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    public Builder mergeReply(com.ipay.api.grpc.ServiceGenericReply value) {
      if (replyBuilder_ == null) {
        if (reply_ != null) {
          reply_ =
            com.ipay.api.grpc.ServiceGenericReply.newBuilder(reply_).mergeFrom(value).buildPartial();
        } else {
          reply_ = value;
        }
        onChanged();
      } else {
        replyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    public Builder clearReply() {
      if (replyBuilder_ == null) {
        reply_ = null;
        onChanged();
      } else {
        reply_ = null;
        replyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    public com.ipay.api.grpc.ServiceGenericReply.Builder getReplyBuilder() {
      
      onChanged();
      return getReplyFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    public com.ipay.api.grpc.ServiceGenericReplyOrBuilder getReplyOrBuilder() {
      if (replyBuilder_ != null) {
        return replyBuilder_.getMessageOrBuilder();
      } else {
        return reply_ == null ?
            com.ipay.api.grpc.ServiceGenericReply.getDefaultInstance() : reply_;
      }
    }
    /**
     * <code>.com.ipay.api.ServiceGenericReply reply = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ipay.api.grpc.ServiceGenericReply, com.ipay.api.grpc.ServiceGenericReply.Builder, com.ipay.api.grpc.ServiceGenericReplyOrBuilder> 
        getReplyFieldBuilder() {
      if (replyBuilder_ == null) {
        replyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ipay.api.grpc.ServiceGenericReply, com.ipay.api.grpc.ServiceGenericReply.Builder, com.ipay.api.grpc.ServiceGenericReplyOrBuilder>(
                getReply(),
                getParentForChildren(),
                isClean());
        reply_ = null;
      }
      return replyBuilder_;
    }

    private java.lang.Object customerId_ = "";
    /**
     * <code>string customer_id = 2;</code>
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customer_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customer_id = 2;</code>
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customer_id = 2;</code>
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <code>string customer_id = 2;</code>
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 4;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object phonenumber_ = "";
    /**
     * <code>string phonenumber = 5;</code>
     */
    public java.lang.String getPhonenumber() {
      java.lang.Object ref = phonenumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phonenumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string phonenumber = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPhonenumberBytes() {
      java.lang.Object ref = phonenumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phonenumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string phonenumber = 5;</code>
     */
    public Builder setPhonenumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phonenumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string phonenumber = 5;</code>
     */
    public Builder clearPhonenumber() {
      
      phonenumber_ = getDefaultInstance().getPhonenumber();
      onChanged();
      return this;
    }
    /**
     * <code>string phonenumber = 5;</code>
     */
    public Builder setPhonenumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phonenumber_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ipay.api.CreateCustomerResponse)
  }

  // @@protoc_insertion_point(class_scope:com.ipay.api.CreateCustomerResponse)
  private static final com.ipay.api.grpc.CreateCustomerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ipay.api.grpc.CreateCustomerResponse();
  }

  public static com.ipay.api.grpc.CreateCustomerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomerResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateCustomerResponse>() {
    public CreateCustomerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateCustomerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateCustomerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomerResponse> getParserForType() {
    return PARSER;
  }

  public com.ipay.api.grpc.CreateCustomerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

