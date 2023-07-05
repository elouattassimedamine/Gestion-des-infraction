package com.example.immatriculationservice.Service;

import com.example.immatriculationservice.DTO.PersonneRequestDTO;
import com.example.immatriculationservice.DTO.PersonneResponseDTO;
import com.example.immatriculationservice.Entity.Personne;
import com.example.immatriculationservice.Mapper.PersonneMapper;
import com.example.immatriculationservice.Repository.PersonneRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PersonneServiceImpl implements PersonneService {

    private PersonneRepository personneRepository;
    private PersonneMapper personneMapper;

    public PersonneServiceImpl(PersonneRepository personneRepository, PersonneMapper personneMapper) {
        this.personneRepository = personneRepository;
        this.personneMapper = personneMapper;
    }

    @Override
    public PersonneResponseDTO save(PersonneRequestDTO personneRequestDTO) {
        Personne personne = personneMapper.fromRequestToPersonne(personneRequestDTO);
        Personne personne_saved = personneRepository.save(personne);
        PersonneResponseDTO personneResponseDTO = personneMapper.fromPersonneToResponse(personne_saved);
        return personneResponseDTO;
    }

    @Override
    public PersonneResponseDTO update(PersonneRequestDTO personneRequestDTO) {

        Personne personne = personneRepository.findById(personneRequestDTO.getId_Personne()).orElse(null);

        if (personne != null){
            Personne personne_updated = personneRepository.save(personne);
            PersonneResponseDTO personneResponseDTO = personneMapper.fromPersonneToResponse(personne_updated);
            return personneResponseDTO;
        }
        else return null;
    }

    @Override
    public PersonneResponseDTO findById(Long id) {
        Personne personne = personneRepository.findById(id).orElse(null);
        PersonneResponseDTO personneResponseDTO = personneMapper.fromPersonneToResponse(personne);
        return personneResponseDTO;
    }

    @Override
    public List<PersonneResponseDTO> findAll() {
        return personneRepository.findAll().stream()
                .map(personneMapper::fromPersonneToResponse)
                .collect(Collectors.toList());
    }
}
