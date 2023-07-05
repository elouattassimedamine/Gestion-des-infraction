package com.example.infractionservice.Service;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.DTO.InfractionResponseDTO;

import java.util.List;

public interface InfractionService {

    InfractionResponseDTO save(InfractionRequestDTO infractionRequestDTO);
    InfractionResponseDTO findById(Long id);
    List<InfractionResponseDTO> findAll();
    List<InfractionResponseDTO> findByMatricule(String matricule_Vehicule);
}
