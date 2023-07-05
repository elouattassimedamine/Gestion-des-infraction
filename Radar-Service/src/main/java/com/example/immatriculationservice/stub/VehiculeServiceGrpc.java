package com.example.immatriculationservice.stub;

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
    comments = "Source: VehiculeService.proto")
public final class VehiculeServiceGrpc {

  private VehiculeServiceGrpc() {}

  public static final String SERVICE_NAME = "VehiculeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse> getGetAllVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllVehicules",
      requestType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest.class,
      responseType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse> getGetAllVehiculesMethod() {
    io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse> getGetAllVehiculesMethod;
    if ((getGetAllVehiculesMethod = VehiculeServiceGrpc.getGetAllVehiculesMethod) == null) {
      synchronized (VehiculeServiceGrpc.class) {
        if ((getGetAllVehiculesMethod = VehiculeServiceGrpc.getGetAllVehiculesMethod) == null) {
          VehiculeServiceGrpc.getGetAllVehiculesMethod = getGetAllVehiculesMethod = 
              io.grpc.MethodDescriptor.<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeService", "getAllVehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeServiceMethodDescriptorSupplier("getAllVehicules"))
                  .build();
          }
        }
     }
     return getGetAllVehiculesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse> getGetVehiculeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeById",
      requestType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest.class,
      responseType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse> getGetVehiculeByIdMethod() {
    io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse> getGetVehiculeByIdMethod;
    if ((getGetVehiculeByIdMethod = VehiculeServiceGrpc.getGetVehiculeByIdMethod) == null) {
      synchronized (VehiculeServiceGrpc.class) {
        if ((getGetVehiculeByIdMethod = VehiculeServiceGrpc.getGetVehiculeByIdMethod) == null) {
          VehiculeServiceGrpc.getGetVehiculeByIdMethod = getGetVehiculeByIdMethod = 
              io.grpc.MethodDescriptor.<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeService", "getVehiculeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeServiceMethodDescriptorSupplier("getVehiculeById"))
                  .build();
          }
        }
     }
     return getGetVehiculeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse> getGetVehiculeByMatriculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeByMatricule",
      requestType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest.class,
      responseType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse> getGetVehiculeByMatriculeMethod() {
    io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse> getGetVehiculeByMatriculeMethod;
    if ((getGetVehiculeByMatriculeMethod = VehiculeServiceGrpc.getGetVehiculeByMatriculeMethod) == null) {
      synchronized (VehiculeServiceGrpc.class) {
        if ((getGetVehiculeByMatriculeMethod = VehiculeServiceGrpc.getGetVehiculeByMatriculeMethod) == null) {
          VehiculeServiceGrpc.getGetVehiculeByMatriculeMethod = getGetVehiculeByMatriculeMethod = 
              io.grpc.MethodDescriptor.<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeService", "getVehiculeByMatricule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeServiceMethodDescriptorSupplier("getVehiculeByMatricule"))
                  .build();
          }
        }
     }
     return getGetVehiculeByMatriculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO> getSaveVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveVehicule",
      requestType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO.class,
      responseType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO> getSaveVehiculeMethod() {
    io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO> getSaveVehiculeMethod;
    if ((getSaveVehiculeMethod = VehiculeServiceGrpc.getSaveVehiculeMethod) == null) {
      synchronized (VehiculeServiceGrpc.class) {
        if ((getSaveVehiculeMethod = VehiculeServiceGrpc.getSaveVehiculeMethod) == null) {
          VehiculeServiceGrpc.getSaveVehiculeMethod = getSaveVehiculeMethod = 
              io.grpc.MethodDescriptor.<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeService", "saveVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeServiceMethodDescriptorSupplier("saveVehicule"))
                  .build();
          }
        }
     }
     return getSaveVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO> getUpdateVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateVehicule",
      requestType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO.class,
      responseType = com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO,
      com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO> getUpdateVehiculeMethod() {
    io.grpc.MethodDescriptor<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO> getUpdateVehiculeMethod;
    if ((getUpdateVehiculeMethod = VehiculeServiceGrpc.getUpdateVehiculeMethod) == null) {
      synchronized (VehiculeServiceGrpc.class) {
        if ((getUpdateVehiculeMethod = VehiculeServiceGrpc.getUpdateVehiculeMethod) == null) {
          VehiculeServiceGrpc.getUpdateVehiculeMethod = getUpdateVehiculeMethod = 
              io.grpc.MethodDescriptor.<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO, com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeService", "updateVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeServiceMethodDescriptorSupplier("updateVehicule"))
                  .build();
          }
        }
     }
     return getUpdateVehiculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VehiculeServiceStub newStub(io.grpc.Channel channel) {
    return new VehiculeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VehiculeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VehiculeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VehiculeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VehiculeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VehiculeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllVehicules(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllVehiculesMethod(), responseObserver);
    }

    /**
     */
    public void getVehiculeById(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getVehiculeByMatricule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeByMatriculeMethod(), responseObserver);
    }

    /**
     */
    public void saveVehicule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void updateVehicule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVehiculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllVehiculesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest,
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse>(
                  this, METHODID_GET_ALL_VEHICULES)))
          .addMethod(
            getGetVehiculeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest,
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse>(
                  this, METHODID_GET_VEHICULE_BY_ID)))
          .addMethod(
            getGetVehiculeByMatriculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest,
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse>(
                  this, METHODID_GET_VEHICULE_BY_MATRICULE)))
          .addMethod(
            getSaveVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO,
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO>(
                  this, METHODID_SAVE_VEHICULE)))
          .addMethod(
            getUpdateVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO,
                com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO>(
                  this, METHODID_UPDATE_VEHICULE)))
          .build();
    }
  }

  /**
   */
  public static final class VehiculeServiceStub extends io.grpc.stub.AbstractStub<VehiculeServiceStub> {
    private VehiculeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllVehicules(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllVehiculesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehiculeById(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehiculeByMatricule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeByMatriculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveVehicule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVehicule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO request,
        io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVehiculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VehiculeServiceBlockingStub extends io.grpc.stub.AbstractStub<VehiculeServiceBlockingStub> {
    private VehiculeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse getAllVehicules(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllVehiculesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse getVehiculeById(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse getVehiculeByMatricule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeByMatriculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO saveVehicule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO request) {
      return blockingUnaryCall(
          getChannel(), getSaveVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO updateVehicule(com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVehiculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VehiculeServiceFutureStub extends io.grpc.stub.AbstractStub<VehiculeServiceFutureStub> {
    private VehiculeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse> getAllVehicules(
        com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllVehiculesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse> getVehiculeById(
        com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse> getVehiculeByMatricule(
        com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeByMatriculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO> saveVehicule(
        com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO> updateVehicule(
        com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVehiculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_VEHICULES = 0;
  private static final int METHODID_GET_VEHICULE_BY_ID = 1;
  private static final int METHODID_GET_VEHICULE_BY_MATRICULE = 2;
  private static final int METHODID_SAVE_VEHICULE = 3;
  private static final int METHODID_UPDATE_VEHICULE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VehiculeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VehiculeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_VEHICULES:
          serviceImpl.getAllVehicules((com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesRequest) request,
              (io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetAllVehiculesResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICULE_BY_ID:
          serviceImpl.getVehiculeById((com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByIdResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICULE_BY_MATRICULE:
          serviceImpl.getVehiculeByMatricule((com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse>) responseObserver);
          break;
        case METHODID_SAVE_VEHICULE:
          serviceImpl.saveVehicule((com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeRequestDTO) request,
              (io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.SavedVehiculeResponseDTO>) responseObserver);
          break;
        case METHODID_UPDATE_VEHICULE:
          serviceImpl.updateVehicule((com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO) request,
              (io.grpc.stub.StreamObserver<com.example.immatriculationservice.stub.VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO>) responseObserver);
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

  private static abstract class VehiculeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VehiculeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.immatriculationservice.stub.VehiculeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VehiculeService");
    }
  }

  private static final class VehiculeServiceFileDescriptorSupplier
      extends VehiculeServiceBaseDescriptorSupplier {
    VehiculeServiceFileDescriptorSupplier() {}
  }

  private static final class VehiculeServiceMethodDescriptorSupplier
      extends VehiculeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VehiculeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VehiculeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VehiculeServiceFileDescriptorSupplier())
              .addMethod(getGetAllVehiculesMethod())
              .addMethod(getGetVehiculeByIdMethod())
              .addMethod(getGetVehiculeByMatriculeMethod())
              .addMethod(getSaveVehiculeMethod())
              .addMethod(getUpdateVehiculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
