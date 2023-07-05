package com.example.immatriculationservice.Mapper;

import com.example.immatriculationservice.DTO.PersonneRequestDTO;
import com.example.immatriculationservice.DTO.PersonneResponseDTO;
import com.example.immatriculationservice.Entity.Personne;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PersonneMapperImpl implements PersonneMapper {
    @Override
    public Personne fromRequestToPersonne(PersonneRequestDTO personneRequestDTO) {
        Personne personne = new Personne();
        BeanUtils.copyProperties(personneRequestDTO,personne);
        return personne;
    }

    @Override
    public PersonneResponseDTO fromPersonneToResponse(Personne personne) {
        PersonneResponseDTO personneResponseDTO = new PersonneResponseDTO();
        BeanUtils.copyProperties(personne,personneResponseDTO);
        return personneResponseDTO;
    }
}
