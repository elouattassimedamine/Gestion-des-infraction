package com.example.radarservice.Service.Infraction.GRPC;

import com.example.infractionservice.stub.InfractionServiceGrpc;
import com.example.infractionservice.stub.InfractionServiceOuterClass;
import com.example.radarservice.Mapper.InfractionMapper;
import com.example.radarservice.Model.InfractionRequestDTO;
import com.example.radarservice.Model.InfractionResponseDTO;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class InfractionGRPCServiceImpl implements InfractionGRPCService {

    private InfractionMapper infractionMapper;
    @GrpcClient(value = "InfractionService")
    private InfractionServiceGrpc.InfractionServiceBlockingStub infractionServiceBlockingStub;

    public InfractionGRPCServiceImpl(InfractionMapper infractionMapper) {
        this.infractionMapper = infractionMapper;
    }

    @Override
    public InfractionResponseDTO save(InfractionRequestDTO infractionRequestDTO) {
        InfractionServiceOuterClass.InfractionRequestDTO infractionRequestDTO_GRPC = infractionMapper.fromModelToGRPC(infractionRequestDTO);
        InfractionServiceOuterClass.SavedInfractionRequestDTO requestDTO = InfractionServiceOuterClass.SavedInfractionRequestDTO.newBuilder().setInfractionRequestDTO(infractionRequestDTO_GRPC).build();
        InfractionServiceOuterClass.SavedInfractionResponseDTO responseDTO = infractionServiceBlockingStub.saveInfraction(requestDTO);

        return infractionMapper.fromGRPCToModel(responseDTO.getInfractionResponseDTO());
    }

    @Override
    public InfractionResponseDTO findById(Long id) {
        InfractionServiceOuterClass.GetInfractionByIdRequest request = InfractionServiceOuterClass.GetInfractionByIdRequest.newBuilder().setInfractionId(id).build();
        InfractionServiceOuterClass.GetInfractionByIdResponse response = infractionServiceBlockingStub.getInfractionById(request);
        return infractionMapper.fromGRPCToModel(response.getInfractionResponseDTO());
    }

    @Override
    public List<InfractionResponseDTO> findAll() {
        InfractionServiceOuterClass.GetAllInfractionsRequest request = InfractionServiceOuterClass.GetAllInfractionsRequest.newBuilder().build();
        InfractionServiceOuterClass.GetAllInfractionsResponse response = infractionServiceBlockingStub.getAllInfractions(request);
        List<InfractionServiceOuterClass.InfractionResponseDTO> infractionResponseDTOList = response.getInfractionResponseDTOList();

        return infractionResponseDTOList.stream()
                .map(infractionMapper::fromGRPCToModel)
                .collect(Collectors.toList());
    }

    @Override
    public List<InfractionResponseDTO> findByMatricule(String matricule_Vehicule) {
        InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest request = InfractionServiceOuterClass.GetAllInfractionByMatriculeRequest.newBuilder().setVehiculeMatricule(matricule_Vehicule).build();
        InfractionServiceOuterClass.GetAllInfractionsByMatriculeResponse response = infractionServiceBlockingStub.getAllInfractionsByMatricule(request);
        List<InfractionServiceOuterClass.InfractionResponseDTO> infractionResponseDTOList = response.getInfractionResponseDTOList();

        return infractionResponseDTOList.stream()
                .map(infractionMapper::fromGRPCToModel)
                .collect(Collectors.toList());
    }
}
