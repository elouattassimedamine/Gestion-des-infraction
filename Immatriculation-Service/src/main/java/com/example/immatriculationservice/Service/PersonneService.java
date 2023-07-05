package com.example.immatriculationservice.Service;

import com.example.immatriculationservice.DTO.PersonneRequestDTO;
import com.example.immatriculationservice.DTO.PersonneResponseDTO;

import java.util.List;

public interface PersonneService {

    PersonneResponseDTO save(PersonneRequestDTO personneRequestDTO);
    PersonneResponseDTO update(PersonneRequestDTO personneRequestDTO);
    PersonneResponseDTO findById(Long id);
    List<PersonneResponseDTO> findAll();
}
