package com.example.immatriculationservice.Service;

import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.DTO.VehiculeResponseDTO;

import java.util.List;

public interface VehiculeService {

    VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO);
    VehiculeResponseDTO findById(Long id);
    List<VehiculeResponseDTO> findAll();
    VehiculeResponseDTO findByMatricule(String matricule);
}
