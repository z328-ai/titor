// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductService.proto

package zzq.interfaces.grpc;

/**
 * Protobuf type {@code zzq.interfaces.grpc.GetProductResponse}
 */
public  final class GetProductResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zzq.interfaces.grpc.GetProductResponse)
    GetProductResponseOrBuilder {
  // Use GetProductResponse.newBuilder() to construct.
  private GetProductResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetProductResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetProductResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            zzq.interfaces.grpc.Product.Builder subBuilder = null;
            if (product_ != null) {
              subBuilder = product_.toBuilder();
            }
            product_ = input.readMessage(zzq.interfaces.grpc.Product.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(product_);
              product_ = subBuilder.buildPartial();
            }

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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return zzq.interfaces.grpc.ProductServiceOuterClass.internal_static_zzq_interfaces_grpc_GetProductResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zzq.interfaces.grpc.ProductServiceOuterClass.internal_static_zzq_interfaces_grpc_GetProductResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zzq.interfaces.grpc.GetProductResponse.class, zzq.interfaces.grpc.GetProductResponse.Builder.class);
  }

  public static final int PRODUCT_FIELD_NUMBER = 1;
  private zzq.interfaces.grpc.Product product_;
  /**
   * <code>.zzq.interfaces.grpc.Product product = 1;</code>
   */
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   * <code>.zzq.interfaces.grpc.Product product = 1;</code>
   */
  public zzq.interfaces.grpc.Product getProduct() {
    return product_ == null ? zzq.interfaces.grpc.Product.getDefaultInstance() : product_;
  }
  /**
   * <code>.zzq.interfaces.grpc.Product product = 1;</code>
   */
  public zzq.interfaces.grpc.ProductOrBuilder getProductOrBuilder() {
    return getProduct();
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
    if (product_ != null) {
      output.writeMessage(1, getProduct());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProduct());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof zzq.interfaces.grpc.GetProductResponse)) {
      return super.equals(obj);
    }
    zzq.interfaces.grpc.GetProductResponse other = (zzq.interfaces.grpc.GetProductResponse) obj;

    boolean result = true;
    result = result && (hasProduct() == other.hasProduct());
    if (hasProduct()) {
      result = result && getProduct()
          .equals(other.getProduct());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zzq.interfaces.grpc.GetProductResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zzq.interfaces.grpc.GetProductResponse parseFrom(
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
  public static Builder newBuilder(zzq.interfaces.grpc.GetProductResponse prototype) {
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
   * Protobuf type {@code zzq.interfaces.grpc.GetProductResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zzq.interfaces.grpc.GetProductResponse)
      zzq.interfaces.grpc.GetProductResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zzq.interfaces.grpc.ProductServiceOuterClass.internal_static_zzq_interfaces_grpc_GetProductResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zzq.interfaces.grpc.ProductServiceOuterClass.internal_static_zzq_interfaces_grpc_GetProductResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zzq.interfaces.grpc.GetProductResponse.class, zzq.interfaces.grpc.GetProductResponse.Builder.class);
    }

    // Construct using zzq.interfaces.grpc.GetProductResponse.newBuilder()
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
      if (productBuilder_ == null) {
        product_ = null;
      } else {
        product_ = null;
        productBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zzq.interfaces.grpc.ProductServiceOuterClass.internal_static_zzq_interfaces_grpc_GetProductResponse_descriptor;
    }

    public zzq.interfaces.grpc.GetProductResponse getDefaultInstanceForType() {
      return zzq.interfaces.grpc.GetProductResponse.getDefaultInstance();
    }

    public zzq.interfaces.grpc.GetProductResponse build() {
      zzq.interfaces.grpc.GetProductResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public zzq.interfaces.grpc.GetProductResponse buildPartial() {
      zzq.interfaces.grpc.GetProductResponse result = new zzq.interfaces.grpc.GetProductResponse(this);
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof zzq.interfaces.grpc.GetProductResponse) {
        return mergeFrom((zzq.interfaces.grpc.GetProductResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zzq.interfaces.grpc.GetProductResponse other) {
      if (other == zzq.interfaces.grpc.GetProductResponse.getDefaultInstance()) return this;
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
      }
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
      zzq.interfaces.grpc.GetProductResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zzq.interfaces.grpc.GetProductResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private zzq.interfaces.grpc.Product product_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        zzq.interfaces.grpc.Product, zzq.interfaces.grpc.Product.Builder, zzq.interfaces.grpc.ProductOrBuilder> productBuilder_;
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    public boolean hasProduct() {
      return productBuilder_ != null || product_ != null;
    }
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    public zzq.interfaces.grpc.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? zzq.interfaces.grpc.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    public Builder setProduct(zzq.interfaces.grpc.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    public Builder setProduct(
        zzq.interfaces.grpc.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    public Builder mergeProduct(zzq.interfaces.grpc.Product value) {
      if (productBuilder_ == null) {
        if (product_ != null) {
          product_ =
            zzq.interfaces.grpc.Product.newBuilder(product_).mergeFrom(value).buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = null;
        onChanged();
      } else {
        product_ = null;
        productBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    public zzq.interfaces.grpc.Product.Builder getProductBuilder() {
      
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    public zzq.interfaces.grpc.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            zzq.interfaces.grpc.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <code>.zzq.interfaces.grpc.Product product = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        zzq.interfaces.grpc.Product, zzq.interfaces.grpc.Product.Builder, zzq.interfaces.grpc.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            zzq.interfaces.grpc.Product, zzq.interfaces.grpc.Product.Builder, zzq.interfaces.grpc.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:zzq.interfaces.grpc.GetProductResponse)
  }

  // @@protoc_insertion_point(class_scope:zzq.interfaces.grpc.GetProductResponse)
  private static final zzq.interfaces.grpc.GetProductResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zzq.interfaces.grpc.GetProductResponse();
  }

  public static zzq.interfaces.grpc.GetProductResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetProductResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetProductResponse>() {
    public GetProductResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetProductResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetProductResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetProductResponse> getParserForType() {
    return PARSER;
  }

  public zzq.interfaces.grpc.GetProductResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
