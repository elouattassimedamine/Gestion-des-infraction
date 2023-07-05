package com.example.radarservice.Mapper;

import com.example.radarservice.DTO.RadarRequestDTO;
import com.example.radarservice.DTO.RadarResponseDTO;
import com.example.radarservice.Entity.Radar;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RadarMapperImpl implements RadarMapper {

    @Override
    public Radar fromRadarRequestToRadar(RadarRequestDTO radarRequestDTO) {
        Radar radar = new Radar();
        BeanUtils.copyProperties(radarRequestDTO,radar);
        return radar;
    }

    @Override
    public RadarResponseDTO fromRadarToRadarResponse(Radar radar) {
        RadarResponseDTO radarResponseDTO = new RadarResponseDTO();

        radarResponseDTO.setId_Radar(radar.getId_Radar());
            radarResponseDTO.setVitesse_Radar(radar.getVitesse_Radar());
                radarResponseDTO.setLaltitude_Coordonnee(radar.getCoordonnee().getLaltitude_Coordonnee());
                    radarResponseDTO.setLongitude_Coordonnee(radar.getCoordonnee().getLongitude_Coordonnee());
        return radarResponseDTO;
    }
}
