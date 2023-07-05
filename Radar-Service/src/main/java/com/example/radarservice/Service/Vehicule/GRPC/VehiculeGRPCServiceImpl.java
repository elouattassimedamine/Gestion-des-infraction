package com.example.radarservice.Service.Vehicule.GRPC;

import com.example.immatriculationservice.stub.VehiculeServiceGrpc;
import com.example.immatriculationservice.stub.VehiculeServiceOuterClass;
import com.example.radarservice.Mapper.VehiculeMapper;
import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class VehiculeGRPCServiceImpl implements VehiculeGRPCService {

    private VehiculeMapper vehiculeMapper;

    @GrpcClient(value = "VehiculeService")
    private VehiculeServiceGrpc.VehiculeServiceBlockingStub vehiculeServiceBlockingStub;

    public VehiculeGRPCServiceImpl(VehiculeMapper vehiculeMapper) {
        this.vehiculeMapper = vehiculeMapper;
    }

    @Override
    public VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO) {
        VehiculeServiceOuterClass.VehiculeRequestDTO vehiculeRequestDTO_GRPC = vehiculeMapper.fromModelToGRPC(vehiculeRequestDTO);
        VehiculeServiceOuterClass.SavedVehiculeRequestDTO requestDTO = VehiculeServiceOuterClass.SavedVehiculeRequestDTO.newBuilder().setVehiculeRequestDTO(vehiculeRequestDTO_GRPC).build();
        VehiculeServiceOuterClass.SavedVehiculeResponseDTO responseDTO = vehiculeServiceBlockingStub.saveVehicule(requestDTO);
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeMapper.fromGRPCToModel(responseDTO.getVehiculeResponseDTO());
        return vehiculeResponseDTO;
    }

    @Override
    public VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO) {
        VehiculeServiceOuterClass.VehiculeRequestDTO vehiculeRequestDTO_GRPC = vehiculeMapper.fromModelToGRPC(vehiculeRequestDTO);
        VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO requestDTO = VehiculeServiceOuterClass.UpdatedVehiculeRequestDTO.newBuilder().setVehiculeRequestDTO(vehiculeRequestDTO_GRPC).build();
        VehiculeServiceOuterClass.UpdatedVehiculeResponseDTO responseDTO = vehiculeServiceBlockingStub.updateVehicule(requestDTO);
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeMapper.fromGRPCToModel(responseDTO.getVehiculeResponseDTO());
        return vehiculeResponseDTO;
    }

    @Override
    public VehiculeResponseDTO findById(Long id) {
        VehiculeServiceOuterClass.GetVehiculeByIdRequest request = VehiculeServiceOuterClass.GetVehiculeByIdRequest.newBuilder().setVehiculeId(id).build();
        VehiculeServiceOuterClass.GetVehiculeByIdResponse response = vehiculeServiceBlockingStub.getVehiculeById(request);
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeMapper.fromGRPCToModel(response.getVehiculeResponseDTO());
        return vehiculeResponseDTO;
    }

    @Override
    public List<VehiculeResponseDTO> findAll() {
        VehiculeServiceOuterClass.GetAllVehiculesRequest request = VehiculeServiceOuterClass.GetAllVehiculesRequest.newBuilder().build();
        VehiculeServiceOuterClass.GetAllVehiculesResponse response = vehiculeServiceBlockingStub.getAllVehicules(request);
        List<VehiculeServiceOuterClass.VehiculeResponseDTO> vehiculeResponseDTOList = response.getVehiculeResponseDTOList();

        return vehiculeResponseDTOList.stream()
                .map(vehiculeMapper::fromGRPCToModel)
                .collect(Collectors.toList());
    }

    @Override
    public VehiculeResponseDTO findByMatricule(String matricule) {
        VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest request = VehiculeServiceOuterClass.GetVehiculeByMatriculeRequest.newBuilder().setMatricule(matricule).build();
        VehiculeServiceOuterClass.GetVehiculeByMatriculeResponse response = vehiculeServiceBlockingStub.getVehiculeByMatricule(request);
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeMapper.fromGRPCToModel(response.getVehiculeResponseDTO());
        return vehiculeResponseDTO;
    }
}
