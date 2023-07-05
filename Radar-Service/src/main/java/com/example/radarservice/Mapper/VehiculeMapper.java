package com.example.radarservice.Mapper;


import com.example.immatriculationservice.stub.VehiculeServiceOuterClass;
import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;

public interface VehiculeMapper {

    com.example.immatriculationservice.web.soap.VehiculeRequestDTO fromModelToWeb(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO fromWebToModel(com.example.immatriculationservice.web.soap.VehiculeResponseDTO vehiculeResponseDTO);

    VehiculeServiceOuterClass.VehiculeRequestDTO fromModelToGRPC(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO fromGRPCToModel(VehiculeServiceOuterClass.VehiculeResponseDTO vehiculeResponseDTO);
}
