package com.example.immatriculationservice.Service;

import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.DTO.VehiculeResponseDTO;
import com.example.immatriculationservice.Entity.Personne;
import com.example.immatriculationservice.Entity.Vehicule;
import com.example.immatriculationservice.Mapper.PersonneMapper;
import com.example.immatriculationservice.Mapper.VehiculeMapper;
import com.example.immatriculationservice.Repository.PersonneRepository;
import com.example.immatriculationservice.Repository.VehiculeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
@Service
@Transactional
public class VehiculeServiceImpl implements VehiculeService {

    private PersonneRepository personneRepository;
    private PersonneMapper personneMapper;
    private VehiculeMapper vehiculeMapper;
    private VehiculeRepository vehiculeRepository;

    public VehiculeServiceImpl(PersonneRepository personneRepository, PersonneMapper personneMapper, VehiculeMapper vehiculeMapper, VehiculeRepository vehiculeRepository) {
        this.personneRepository = personneRepository;
        this.personneMapper = personneMapper;
        this.vehiculeMapper = vehiculeMapper;
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO) {
        Personne personne = vehiculeMapper.fromRequestToPersonne(vehiculeRequestDTO);
        Personne personne_saved = personneRepository.save(personne);
        Vehicule vehicule = vehiculeMapper.fromRequestToVehicule(vehiculeRequestDTO);
        vehicule.setPersonne(personne_saved);
        Vehicule vehicule_saved = vehiculeRepository.save(vehicule);
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeMapper.fromVehiculeToResponse(vehicule_saved);
        return vehiculeResponseDTO;
    }

    @Override
    public VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO) {
        Vehicule vehicule = vehiculeRepository.findById(vehiculeRequestDTO.getId_Personne()).orElse(null);
        if (vehicule != null){
            Personne personne = personneRepository.findById(vehicule.getPersonne().getId_Personne()).orElse(null);
            if (personne != null){
                Personne personne1 = vehiculeMapper.fromRequestToPersonne(vehiculeRequestDTO);
                Personne personne_updated = personneRepository.save(personne1);
                Vehicule vehicule1 = vehiculeMapper.fromRequestToVehicule(vehiculeRequestDTO);
                vehicule1.setPersonne(personne_updated);
                System.out.println(vehicule1);
                Vehicule vehicule_updated = vehiculeRepository.save(vehicule1);
                VehiculeResponseDTO vehiculeResponseDTO = vehiculeMapper.fromVehiculeToResponse(vehicule_updated);
                return vehiculeResponseDTO;
            }
            else return null;
        }
        else return null;
    }

    @Override
    public VehiculeResponseDTO findById(Long id) {
        Vehicule vehicule = vehiculeRepository.findById(id).orElse(null);
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeMapper.fromVehiculeToResponse(vehicule);
        return vehiculeResponseDTO;
    }

    @Override
    public List<VehiculeResponseDTO> findAll() {
        return vehiculeRepository.findAll().stream()
                .map(vehiculeMapper::fromVehiculeToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public VehiculeResponseDTO findByMatricule(String matricule) {
        return vehiculeMapper.fromVehiculeToResponse(vehiculeRepository.findByMatricule_Vehicule(matricule));
    }
}
