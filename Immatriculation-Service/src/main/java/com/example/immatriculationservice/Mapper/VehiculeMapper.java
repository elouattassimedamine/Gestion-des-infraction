package com.example.immatriculationservice.Mapper;

import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.DTO.VehiculeResponseDTO;
import com.example.immatriculationservice.Entity.Personne;
import com.example.immatriculationservice.Entity.Vehicule;
import com.example.immatriculationservice.stub.VehiculeServiceOuterClass;

public interface VehiculeMapper {

    Personne fromRequestToPersonne(VehiculeRequestDTO vehiculeRequestDTO);
    Vehicule fromRequestToVehicule(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO fromVehiculeToResponse(Vehicule vehicule);

    VehiculeServiceOuterClass.VehiculeResponseDTO fromVehiculeToGrpc(VehiculeResponseDTO vehiculeResponseDTO);
    VehiculeRequestDTO fromGrpcToRequest(VehiculeServiceOuterClass.VehiculeRequestDTO vehiculeRequestDTO);
}
