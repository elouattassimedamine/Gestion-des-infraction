package com.example.radarservice.Service.Vehicule.GraphQL;

import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;

import java.util.List;

public interface VehiculeGraphService {
    VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO findById(Long id);
    List<VehiculeResponseDTO> findAll();
    VehiculeResponseDTO findByMatricule(String matricule);
}
