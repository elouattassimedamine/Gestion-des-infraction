package com.example.radarservice.Mapper;

import com.example.radarservice.DTO.RadarRequestDTO;
import com.example.radarservice.DTO.RadarResponseDTO;
import com.example.radarservice.Entity.Radar;

public interface RadarMapper {

    Radar fromRadarRequestToRadar(RadarRequestDTO radarRequestDTO);
    RadarResponseDTO fromRadarToRadarResponse(Radar radar);
}
