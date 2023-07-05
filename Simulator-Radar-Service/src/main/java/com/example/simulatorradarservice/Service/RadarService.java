package com.example.simulatorradarservice.Service;

import com.example.simulatorradarservice.DTO.RadarResponseDTO;

public interface RadarService {

    RadarResponseDTO findById(Long id);
    RadarResponseDTO findByIdRest(Long id);

    String generateInfraction(Long id_Radar,Long id_Vehicule,int methode,int vitesse);
}
