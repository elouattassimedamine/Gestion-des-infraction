package com.example.radarservice.Service.Vehicule.Rest;

import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;

import java.util.List;

public interface VehiculeRestService {
    VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO findById(Long id);
    List<VehiculeResponseDTO> findAll();
    VehiculeResponseDTO findByMatricule(String matricule);
}
