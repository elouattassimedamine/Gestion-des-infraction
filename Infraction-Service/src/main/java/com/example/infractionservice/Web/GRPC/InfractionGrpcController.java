package com.example.infractionservice.Web.GRPC;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.DTO.InfractionResponseDTO;
import com.example.infractionservice.Entity.Infraction;
import com.example.infractionservice.Mapper.InfractionMapper;
import com.example.infractionservice.Service.InfractionService;
import com.example.infractionservice.stub.InfractionServiceGrpc;
import com.example.infractionservice.stub.InfractionServiceOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class InfractionGrpcController extends InfractionServiceGrpc.InfractionServiceImplBase {

    private InfractionService infractionService;
    private InfractionMapper infractionMapper;

    public InfractionGrpcController(InfractionService infractionService, InfractionMapper infractionMapper) {
        this.infractionService = infractionService;
        this.infractionMapper = infractionMapper;
    }

    @Override
    public void getAllInfractions(InfractionServiceOuterClass.GetAllInfractionsRequest request, StreamObserver<InfractionServiceOuterClass.GetAllInfractionsResponse> responseObserver) {
        List<InfractionResponseDTO> infractionResponseDTOList = infractionService.findAll();
        List<InfractionServiceOuterClass.InfractionResponseDTO> infractionResponseDTOS =
                infractionResponseDTOList.stream()
                        .map(infractionMapper::fromDTOResponseToGRPC)
                                .collect(Collectors.toList());
        InfractionServiceOuterClass.GetAllInfractionsResponse getAllInfractionsResponse =
                InfractionServiceOuterClass.GetAllInfractionsResponse.newBuilder()
                        .addAllInfractionResponseDTO(infractionResponseDTOS)
                        .build();
        responseObserver.onNext(getAllInfractionsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllInfractionsByMatricule(InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest request, StreamObserver<InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse> responseObserver) {
        List<InfractionResponseDTO> infractionResponseDTOList = infractionService.findByMatricule(request.getVehiculeMatricule());

        List<InfractionServiceOuterClass.InfractionResponseDTO> infractionResponseDTOS =
                infractionResponseDTOList.stream()
                        .map(infractionMapper::fromDTOResponseToGRPC)
                        .collect(Collectors.toList());

        InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse getAllInfractionsResponse =
                InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse.newBuilder()
                        .addAllInfractionResponseDTO(infractionResponseDTOS)
                        .build();

        responseObserver.onNext(getAllInfractionsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getInfractionById(InfractionServiceOuterClass.GetInfractionByIdRequest request, StreamObserver<InfractionServiceOuterClass.GetInfractionByIdResponse> responseObserver) {
        InfractionResponseDTO infractionResponseDTO = infractionService.findById(request.getInfractionId());
        InfractionServiceOuterClass.GetInfractionByIdResponse infractionResponseDTO_GRPC = InfractionServiceOuterClass.GetInfractionByIdResponse.newBuilder()
                .setInfractionResponseDTO(infractionMapper.fromDTOResponseToGRPC(infractionResponseDTO))
                        .build();
        responseObserver.onNext(infractionResponseDTO_GRPC);
        responseObserver.onCompleted();
    }

    @Override
    public void saveInfraction(InfractionServiceOuterClass.SavedInfractionRequestDTO request, StreamObserver<InfractionServiceOuterClass.SavedInfractionResponseDTO> responseObserver) {
        InfractionServiceOuterClass.InfractionRequestDTO vehiculeRequestDTO = request.getInfractionRequestDTO();
        InfractionRequestDTO infractionRequestDTO_Mapped = infractionMapper.fromGRPCToRequest(vehiculeRequestDTO);
        InfractionResponseDTO infractionResponseDTO = infractionService.save(infractionRequestDTO_Mapped);
        InfractionServiceOuterClass.SavedInfractionResponseDTO savedInfractionResponseDTO =
                InfractionServiceOuterClass.SavedInfractionResponseDTO.newBuilder()
                        .setInfractionResponseDTO(infractionMapper.fromDTOResponseToGRPC(infractionResponseDTO))
                        .build();
        responseObserver.onNext(savedInfractionResponseDTO);
        responseObserver.onCompleted();
    }
}
