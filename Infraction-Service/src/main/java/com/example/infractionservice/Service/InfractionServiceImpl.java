package com.example.infractionservice.Service;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.DTO.InfractionResponseDTO;
import com.example.infractionservice.Entity.Infraction;
import com.example.infractionservice.Mapper.InfractionMapper;
import com.example.infractionservice.Repository.InfractionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class InfractionServiceImpl implements InfractionService {
    private InfractionRepository infractionRepository;
    private InfractionMapper infractionMapper;

    public InfractionServiceImpl(InfractionRepository infractionRepository, InfractionMapper infractionMapper) {
        this.infractionRepository = infractionRepository;
        this.infractionMapper = infractionMapper;
    }

    @Override
    public InfractionResponseDTO save(InfractionRequestDTO infractionRequestDTO) {
        Infraction infraction = infractionMapper.fromRequestToInfraction(infractionRequestDTO);

        infraction.setDate_Infraction(Date.valueOf(LocalDate.now()));
        if (infraction.getVitesse_Vehicule() - infraction.getVitesse_Radar() < 20) infraction.setMontant_Infraction(300);
        else if (infraction.getVitesse_Vehicule() - infraction.getVitesse_Radar() < 40) infraction.setMontant_Infraction(800);
        else if (infraction.getVitesse_Vehicule() - infraction.getVitesse_Radar() < 60) infraction.setMontant_Infraction(2000);
        else  infraction.setMontant_Infraction(50000);

        Infraction infraction_Saved = infractionRepository.save(infraction);
        InfractionResponseDTO infractionResponseDTO = infractionMapper.fromInfractionToResponse(infraction_Saved);
        return infractionResponseDTO;
    }

    @Override
    public InfractionResponseDTO findById(Long id) {
        Infraction infraction = infractionRepository.findById(id).orElse(null);
        if (infraction != null)
        {
            InfractionResponseDTO radarResponseDTO = infractionMapper.fromInfractionToResponse(infraction);
            return radarResponseDTO;
        }
        else throw new RuntimeException(String.format("Customer %s doesnt exist",id));
    }

    @Override
    public List<InfractionResponseDTO> findAll() {
        return infractionRepository.findAll().stream()
                .map(infractionMapper::fromInfractionToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<InfractionResponseDTO> findByMatricule(String matricule_Vehicule) {
        return infractionRepository.findByMatricule_Vehicule(matricule_Vehicule).stream()
                .map(infractionMapper::fromInfractionToResponse)
                .collect(Collectors.toList());
    }
}
