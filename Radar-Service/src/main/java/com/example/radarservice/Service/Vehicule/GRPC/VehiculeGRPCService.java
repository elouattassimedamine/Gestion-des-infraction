package com.example.radarservice.Service.Vehicule.GRPC;

import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;

import java.util.List;

public interface VehiculeGRPCService {
    VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO findById(Long id);
    List<VehiculeResponseDTO> findAll();
    VehiculeResponseDTO findByMatricule(String matricule);
}
