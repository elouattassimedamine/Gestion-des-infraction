package com.example.infractionservice.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: InfractionService.proto")
public final class InfractionServiceGrpc {

  private InfractionServiceGrpc() {}

  public static final String SERVICE_NAME = "InfractionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest,
      com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse> getGetAllInfractionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllInfractions",
      requestType = com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest.class,
      responseType = com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest,
      com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse> getGetAllInfractionsMethod() {
    io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest, com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse> getGetAllInfractionsMethod;
    if ((getGetAllInfractionsMethod = InfractionServiceGrpc.getGetAllInfractionsMethod) == null) {
      synchronized (InfractionServiceGrpc.class) {
        if ((getGetAllInfractionsMethod = InfractionServiceGrpc.getGetAllInfractionsMethod) == null) {
          InfractionServiceGrpc.getGetAllInfractionsMethod = getGetAllInfractionsMethod = 
              io.grpc.MethodDescriptor.<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest, com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionService", "getAllInfractions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionServiceMethodDescriptorSupplier("getAllInfractions"))
                  .build();
          }
        }
     }
     return getGetAllInfractionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest,
      com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse> getGetAllInfractionsByMatriculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllInfractionsByMatricule",
      requestType = com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest.class,
      responseType = com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest,
      com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse> getGetAllInfractionsByMatriculeMethod() {
    io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest, com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse> getGetAllInfractionsByMatriculeMethod;
    if ((getGetAllInfractionsByMatriculeMethod = InfractionServiceGrpc.getGetAllInfractionsByMatriculeMethod) == null) {
      synchronized (InfractionServiceGrpc.class) {
        if ((getGetAllInfractionsByMatriculeMethod = InfractionServiceGrpc.getGetAllInfractionsByMatriculeMethod) == null) {
          InfractionServiceGrpc.getGetAllInfractionsByMatriculeMethod = getGetAllInfractionsByMatriculeMethod = 
              io.grpc.MethodDescriptor.<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest, com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionService", "getAllInfractionsByMatricule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionServiceMethodDescriptorSupplier("getAllInfractionsByMatricule"))
                  .build();
          }
        }
     }
     return getGetAllInfractionsByMatriculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest,
      com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> getGetInfractionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInfractionById",
      requestType = com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest.class,
      responseType = com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest,
      com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> getGetInfractionByIdMethod() {
    io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest, com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> getGetInfractionByIdMethod;
    if ((getGetInfractionByIdMethod = InfractionServiceGrpc.getGetInfractionByIdMethod) == null) {
      synchronized (InfractionServiceGrpc.class) {
        if ((getGetInfractionByIdMethod = InfractionServiceGrpc.getGetInfractionByIdMethod) == null) {
          InfractionServiceGrpc.getGetInfractionByIdMethod = getGetInfractionByIdMethod = 
              io.grpc.MethodDescriptor.<com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest, com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionService", "getInfractionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionServiceMethodDescriptorSupplier("getInfractionById"))
                  .build();
          }
        }
     }
     return getGetInfractionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO,
      com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO> getSaveInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveInfraction",
      requestType = com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO.class,
      responseType = com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO,
      com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO> getSaveInfractionMethod() {
    io.grpc.MethodDescriptor<com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO, com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO> getSaveInfractionMethod;
    if ((getSaveInfractionMethod = InfractionServiceGrpc.getSaveInfractionMethod) == null) {
      synchronized (InfractionServiceGrpc.class) {
        if ((getSaveInfractionMethod = InfractionServiceGrpc.getSaveInfractionMethod) == null) {
          InfractionServiceGrpc.getSaveInfractionMethod = getSaveInfractionMethod = 
              io.grpc.MethodDescriptor.<com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO, com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionService", "saveInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionServiceMethodDescriptorSupplier("saveInfraction"))
                  .build();
          }
        }
     }
     return getSaveInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InfractionServiceStub newStub(io.grpc.Channel channel) {
    return new InfractionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InfractionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InfractionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InfractionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InfractionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InfractionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllInfractions(com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest request,
        io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllInfractionsMethod(), responseObserver);
    }

    /**
     */
    public void getAllInfractionsByMatricule(com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest request,
        io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllInfractionsByMatriculeMethod(), responseObserver);
    }

    /**
     */
    public void getInfractionById(com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfractionByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveInfraction(com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO request,
        io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllInfractionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest,
                com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse>(
                  this, METHODID_GET_ALL_INFRACTIONS)))
          .addMethod(
            getGetAllInfractionsByMatriculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest,
                com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse>(
                  this, METHODID_GET_ALL_INFRACTIONS_BY_MATRICULE)))
          .addMethod(
            getGetInfractionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest,
                com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse>(
                  this, METHODID_GET_INFRACTION_BY_ID)))
          .addMethod(
            getSaveInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO,
                com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO>(
                  this, METHODID_SAVE_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class InfractionServiceStub extends io.grpc.stub.AbstractStub<InfractionServiceStub> {
    private InfractionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllInfractions(com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest request,
        io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllInfractionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllInfractionsByMatricule(com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest request,
        io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllInfractionsByMatriculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfractionById(com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfractionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveInfraction(com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO request,
        io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InfractionServiceBlockingStub extends io.grpc.stub.AbstractStub<InfractionServiceBlockingStub> {
    private InfractionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse getAllInfractions(com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllInfractionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse getAllInfractionsByMatricule(com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllInfractionsByMatriculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse getInfractionById(com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfractionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO saveInfraction(com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO request) {
      return blockingUnaryCall(
          getChannel(), getSaveInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InfractionServiceFutureStub extends io.grpc.stub.AbstractStub<InfractionServiceFutureStub> {
    private InfractionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse> getAllInfractions(
        com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllInfractionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse> getAllInfractionsByMatricule(
        com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllInfractionsByMatriculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> getInfractionById(
        com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfractionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO> saveInfraction(
        com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_INFRACTIONS = 0;
  private static final int METHODID_GET_ALL_INFRACTIONS_BY_MATRICULE = 1;
  private static final int METHODID_GET_INFRACTION_BY_ID = 2;
  private static final int METHODID_SAVE_INFRACTION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InfractionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InfractionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_INFRACTIONS:
          serviceImpl.getAllInfractions((com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_INFRACTIONS_BY_MATRICULE:
          serviceImpl.getAllInfractionsByMatricule((com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse>) responseObserver);
          break;
        case METHODID_GET_INFRACTION_BY_ID:
          serviceImpl.getInfractionById((com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.GetInfractionByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_INFRACTION:
          serviceImpl.saveInfraction((com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionRequestDTO) request,
              (io.grpc.stub.StreamObserver<com.example.infractionservice.stub.InfractionServiceOuterClass.SavedInfractionResponseDTO>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InfractionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InfractionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.infractionservice.stub.InfractionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InfractionService");
    }
  }

  private static final class InfractionServiceFileDescriptorSupplier
      extends InfractionServiceBaseDescriptorSupplier {
    InfractionServiceFileDescriptorSupplier() {}
  }

  private static final class InfractionServiceMethodDescriptorSupplier
      extends InfractionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InfractionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InfractionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InfractionServiceFileDescriptorSupplier())
              .addMethod(getGetAllInfractionsMethod())
              .addMethod(getGetAllInfractionsByMatriculeMethod())
              .addMethod(getGetInfractionByIdMethod())
              .addMethod(getSaveInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
