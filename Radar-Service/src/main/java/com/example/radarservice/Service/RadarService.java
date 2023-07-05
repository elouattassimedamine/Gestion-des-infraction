package com.example.radarservice.Service;

import com.example.radarservice.DTO.RadarRequestDTO;
import com.example.radarservice.DTO.RadarResponseDTO;

import java.util.List;

public interface RadarService {

    RadarResponseDTO save(RadarRequestDTO radarRequestDTO);
    RadarResponseDTO update(RadarRequestDTO radarRequestDTO);
    RadarResponseDTO findById(Long id);
    List<RadarResponseDTO> findAll();

}
