package com.example.radarservice.Mapper;

import com.example.radarservice.DTO.RadarRequestDTO;
import com.example.radarservice.Entity.Coordonnee;

public interface CoordonneeMapper {

    Coordonnee fromCordonneeRequestToCoordonnee(RadarRequestDTO radarRequestDTO);

}
