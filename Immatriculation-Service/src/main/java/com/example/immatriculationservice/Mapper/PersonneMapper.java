package com.example.immatriculationservice.Mapper;

import com.example.immatriculationservice.DTO.PersonneRequestDTO;
import com.example.immatriculationservice.DTO.PersonneResponseDTO;
import com.example.immatriculationservice.Entity.Personne;

public interface PersonneMapper {

    Personne fromRequestToPersonne(PersonneRequestDTO personneRequestDTO);
    PersonneResponseDTO fromPersonneToResponse(Personne personne);
}
