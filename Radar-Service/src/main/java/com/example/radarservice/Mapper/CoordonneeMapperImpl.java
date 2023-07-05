package com.example.radarservice.Mapper;

import com.example.radarservice.DTO.RadarRequestDTO;
import com.example.radarservice.Entity.Coordonnee;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CoordonneeMapperImpl implements CoordonneeMapper {
    @Override
    public Coordonnee fromCordonneeRequestToCoordonnee(RadarRequestDTO radarRequestDTO) {
        Coordonnee coordonnee = new Coordonnee();
        BeanUtils.copyProperties(radarRequestDTO,coordonnee);
        return coordonnee;
    }
}
