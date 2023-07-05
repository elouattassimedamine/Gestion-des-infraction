package com.example.immatriculationservice.Web.GRPC;


import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.DTO.VehiculeResponseDTO;
import com.example.immatriculationservice.Mapper.VehiculeMapper;
import com.example.immatriculationservice.Service.VehiculeService;
import com.example.immatriculationservice.stub.VehiculeServiceGrpc;
import com.example.immatriculationservice.stub.VehiculeServiceOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class VehiculeGrpcController extends VehiculeServiceGrpc.VehiculeServiceImplBase{

    private VehiculeService vehiculeService;
    private VehiculeMapper vehiculeMapper;

    public VehiculeGrpcController(VehiculeService vehiculeService, VehiculeMapper vehiculeMapper) {
        this.vehiculeService = vehiculeService;
        this.vehiculeMapper = vehiculeMapper;
    }

    @Override
    public void getAllVehicules(VehiculeServiceOuterClass.GetAllVehiculesRequest request, StreamObserver<VehiculeServiceOuterClass.GetAllVehiculesResponse> responseObserver) {
        List<VehiculeResponseDTO> vehiculeResponseDTOList = vehiculeService.findAll();

        List<VehiculeServiceOuterClass.VehiculeResponseDTO> vehiculesResponseList =
                vehiculeResponseDTOList.stream()
                        .map(vehiculeMapper::fromVehiculeToGrpc)
                                .collect(Collectors.toList());

        VehiculeServiceOuterClass.GetAllVehiculesResponse getAllVehiculesResponse =
                VehiculeServiceOuterClass.GetAllVehiculesResponse.newBuilder()
                                .addAllVehiculeResponseDTO(vehiculesResponseList)
                                        .build();


        responseObserver.onNext(getAllVehiculesResponse);
        responseObserver.onCompleted();;
    }

    @Override
    public void getVehiculeById(VehiculeServiceOuterClass.GetVehiculeByIdRequest request, StreamObserver<VehiculeServiceOuterClass.GetVehiculeByIdResponse> responseObserver) {
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeService.findById(request.getVehiculeId());
        VehiculeServiceOuterClass.GetVehiculeByIdResponse  vehiculeByIdResponse =
            VehiculeServiceOuterClass.GetVehiculeByIdResponse.newBuilder()
                    .setVehiculeResponseDTO(vehiculeMapper.fromVehiculeToGrpc(vehiculeResponseDTO))
                    .build();
        responseObserver.onNext(vehiculeByIdResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void saveVehicule(VehiculeServiceOuterClass.SavedVehiculeRequestDTO request, StreamObserver<VehiculeServiceOuterClass.SavedVehiculeResponseDTO> responseObserver) {
        VehiculeServiceOuterClass.VehiculeRequestDTO vehiculeRequestDTO = request.getVehiculeRequestDTO();
        VehiculeRequestDTO vehiculeRequestDTO_Mapped = vehiculeMapper.fromGrpcToRequest(vehiculeRequestDTO);
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeService.save(vehiculeRequestDTO_Mapped);
        VehiculeServiceOuterClass.SavedVehiculeResponseDTO savedVehiculeResponseDTO =
                VehiculeServiceOuterClass.SavedVehiculeResponseDTO.newBuilder()
                        .setVehiculeResponseDTO(vehiculeMapper.fromVehiculeToGrpc(vehiculeResponseDTO))
                                .build();
        responseObserver.onNext(savedVehiculeResponseDTO);
        responseObserver.onCompleted();
    }

    @Override
    public void updateVehicule(VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO request, StreamObserver<VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO> responseObserver) {
        VehiculeServiceOuterClass.VehiculeRequestDTO VehiculeRequestDTO = request.getVehiculeRequestDTO();
        VehiculeRequestDTO VehiculeRequestDTO_Mapped = vehiculeMapper.fromGrpcToRequest(VehiculeRequestDTO);
        VehiculeResponseDTO Vehicule_saved = vehiculeService.update(VehiculeRequestDTO_Mapped);
        VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO updatedVehiculeResponseDTO =
                VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO.newBuilder()
                        .setVehiculeResponseDTO(vehiculeMapper.fromVehiculeToGrpc(Vehicule_saved))
                        .build();
        responseObserver.onNext(updatedVehiculeResponseDTO);
        responseObserver.onCompleted();
    }

    @Override
    public void getVehiculeByMatricule(VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest request, StreamObserver<VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse> responseObserver) {
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeService.findByMatricule(request.getMatricule());
        VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse  vehiculeByMatriculeResponse =
                VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse.newBuilder()
                        .setVehiculeResponseDTO(vehiculeMapper.fromVehiculeToGrpc(vehiculeResponseDTO))
                        .build();
        responseObserver.onNext(vehiculeByMatriculeResponse);
        responseObserver.onCompleted();
    }
}
