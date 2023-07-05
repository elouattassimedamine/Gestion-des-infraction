package com.example.radarservice.Service.Infraction.WSDL;



import com.example.radarservice.Model.InfractionRequestDTO;
import com.example.radarservice.Model.InfractionResponseDTO;

import java.util.List;

public interface InfractionWSDLService {
    InfractionResponseDTO save(InfractionRequestDTO infractionRequestDTO);
    InfractionResponseDTO findById(Long id);
    List<InfractionResponseDTO> findAll();
    List<InfractionResponseDTO> findByMatricule(String matricule_Vehicule);
}
