// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetGadgetDataNotify.proto

package emu.grasscutter.net.proto;

public final class WidgetGadgetDataNotifyOuterClass {
  private WidgetGadgetDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetGadgetDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetGadgetDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
     * @return Whether the widgetGadgetData field is set.
     */
    boolean hasWidgetGadgetData();
    /**
     * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
     * @return The widgetGadgetData.
     */
    emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData();
    /**
     * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
     */
    emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4276;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WidgetGadgetDataNotify}
   */
  public static final class WidgetGadgetDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetGadgetDataNotify)
      WidgetGadgetDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetGadgetDataNotify.newBuilder() to construct.
    private WidgetGadgetDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetGadgetDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetGadgetDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetGadgetDataNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 26: {
              emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder subBuilder = null;
              if (widgetGadgetData_ != null) {
                subBuilder = widgetGadgetData_.toBuilder();
              }
              widgetGadgetData_ = input.readMessage(emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(widgetGadgetData_);
                widgetGadgetData_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify.class, emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify.Builder.class);
    }

    public static final int WIDGET_GADGET_DATA_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData widgetGadgetData_;
    /**
     * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
     * @return Whether the widgetGadgetData field is set.
     */
    @java.lang.Override
    public boolean hasWidgetGadgetData() {
      return widgetGadgetData_ != null;
    }
    /**
     * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
     * @return The widgetGadgetData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData() {
      return widgetGadgetData_ == null ? emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance() : widgetGadgetData_;
    }
    /**
     * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder() {
      return getWidgetGadgetData();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (widgetGadgetData_ != null) {
        output.writeMessage(3, getWidgetGadgetData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (widgetGadgetData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getWidgetGadgetData());
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
      if (!(obj instanceof emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify other = (emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify) obj;

      if (hasWidgetGadgetData() != other.hasWidgetGadgetData()) return false;
      if (hasWidgetGadgetData()) {
        if (!getWidgetGadgetData()
            .equals(other.getWidgetGadgetData())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasWidgetGadgetData()) {
        hash = (37 * hash) + WIDGET_GADGET_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getWidgetGadgetData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 4276;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WidgetGadgetDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetGadgetDataNotify)
        emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify.class, emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (widgetGadgetDataBuilder_ == null) {
          widgetGadgetData_ = null;
        } else {
          widgetGadgetData_ = null;
          widgetGadgetDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.internal_static_WidgetGadgetDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify build() {
        emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify buildPartial() {
        emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify result = new emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify(this);
        if (widgetGadgetDataBuilder_ == null) {
          result.widgetGadgetData_ = widgetGadgetData_;
        } else {
          result.widgetGadgetData_ = widgetGadgetDataBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify other) {
        if (other == emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify.getDefaultInstance()) return this;
        if (other.hasWidgetGadgetData()) {
          mergeWidgetGadgetData(other.getWidgetGadgetData());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData widgetGadgetData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData, emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> widgetGadgetDataBuilder_;
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       * @return Whether the widgetGadgetData field is set.
       */
      public boolean hasWidgetGadgetData() {
        return widgetGadgetDataBuilder_ != null || widgetGadgetData_ != null;
      }
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       * @return The widgetGadgetData.
       */
      public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getWidgetGadgetData() {
        if (widgetGadgetDataBuilder_ == null) {
          return widgetGadgetData_ == null ? emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance() : widgetGadgetData_;
        } else {
          return widgetGadgetDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       */
      public Builder setWidgetGadgetData(emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData value) {
        if (widgetGadgetDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          widgetGadgetData_ = value;
          onChanged();
        } else {
          widgetGadgetDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       */
      public Builder setWidgetGadgetData(
          emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder builderForValue) {
        if (widgetGadgetDataBuilder_ == null) {
          widgetGadgetData_ = builderForValue.build();
          onChanged();
        } else {
          widgetGadgetDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       */
      public Builder mergeWidgetGadgetData(emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData value) {
        if (widgetGadgetDataBuilder_ == null) {
          if (widgetGadgetData_ != null) {
            widgetGadgetData_ =
              emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.newBuilder(widgetGadgetData_).mergeFrom(value).buildPartial();
          } else {
            widgetGadgetData_ = value;
          }
          onChanged();
        } else {
          widgetGadgetDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       */
      public Builder clearWidgetGadgetData() {
        if (widgetGadgetDataBuilder_ == null) {
          widgetGadgetData_ = null;
          onChanged();
        } else {
          widgetGadgetData_ = null;
          widgetGadgetDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       */
      public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder getWidgetGadgetDataBuilder() {
        
        onChanged();
        return getWidgetGadgetDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       */
      public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder getWidgetGadgetDataOrBuilder() {
        if (widgetGadgetDataBuilder_ != null) {
          return widgetGadgetDataBuilder_.getMessageOrBuilder();
        } else {
          return widgetGadgetData_ == null ?
              emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance() : widgetGadgetData_;
        }
      }
      /**
       * <code>.WidgetGadgetData widget_gadget_data = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData, emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder> 
          getWidgetGadgetDataFieldBuilder() {
        if (widgetGadgetDataBuilder_ == null) {
          widgetGadgetDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData, emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder, emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder>(
                  getWidgetGadgetData(),
                  getParentForChildren(),
                  isClean());
          widgetGadgetData_ = null;
        }
        return widgetGadgetDataBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:WidgetGadgetDataNotify)
    }

    // @@protoc_insertion_point(class_scope:WidgetGadgetDataNotify)
    private static final emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify();
    }

    public static emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetGadgetDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<WidgetGadgetDataNotify>() {
      @java.lang.Override
      public WidgetGadgetDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetGadgetDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetGadgetDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetGadgetDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetGadgetDataNotifyOuterClass.WidgetGadgetDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetGadgetDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetGadgetDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034WidgetGadgetDataNotify.proto\032\026WidgetGa" +
      "dgetData.proto\"G\n\026WidgetGadgetDataNotify" +
      "\022-\n\022widget_gadget_data\030\003 \001(\0132\021.WidgetGad" +
      "getDataB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.getDescriptor(),
        });
    internal_static_WidgetGadgetDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetGadgetDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetGadgetDataNotify_descriptor,
        new java.lang.String[] { "WidgetGadgetData", });
    emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
