package com.example.radarservice.Service;

import com.example.radarservice.DTO.RadarRequestDTO;
import com.example.radarservice.DTO.RadarResponseDTO;
import com.example.radarservice.Entity.Coordonnee;
import com.example.radarservice.Entity.Radar;
import com.example.radarservice.Mapper.CoordonneeMapper;
import com.example.radarservice.Mapper.RadarMapper;
import com.example.radarservice.Repository.RadarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
@Service
@Transactional
public class RadarServiceImpl implements RadarService {

    private RadarRepository radarRepository;
    private RadarMapper radarMapper;
    private CoordonneeMapper coordonneeMapper;
    private CoordonneeService coordonneeService;

    public RadarServiceImpl(RadarRepository radarRepository, RadarMapper radarMapper, CoordonneeMapper coordonneeMapper, CoordonneeService coordonneeService) {
        this.radarRepository = radarRepository;
        this.radarMapper = radarMapper;
        this.coordonneeMapper = coordonneeMapper;
        this.coordonneeService = coordonneeService;
    }

    @Override
    public RadarResponseDTO save(RadarRequestDTO radarRequestDTO) {
        Coordonnee coordonnee = coordonneeMapper.fromCordonneeRequestToCoordonnee(radarRequestDTO);
        Coordonnee coordonnee_saved = coordonneeService.save(coordonnee);
        Radar radar = radarMapper.fromRadarRequestToRadar(radarRequestDTO);
        radar.setCoordonnee(coordonnee_saved);
        Radar radar_saved = radarRepository.save(radar);
        RadarResponseDTO radarResponseDTO = radarMapper.fromRadarToRadarResponse(radar_saved);
        return radarResponseDTO;
    }

    @Override
    public RadarResponseDTO update(RadarRequestDTO radarRequestDTO) {
        Radar radar_found = radarRepository.findById(radarRequestDTO.getId_Radar()).orElse(null);
        if (radar_found != null){
            Coordonnee coordonnee = coordonneeMapper.fromCordonneeRequestToCoordonnee(radarRequestDTO);
            Coordonnee coordonnee_saved = coordonneeService.save(coordonnee);
            Radar radar = radarMapper.fromRadarRequestToRadar(radarRequestDTO);
            radar.setCoordonnee(coordonnee_saved);
            Radar radar_saved = radarRepository.save(radar);
            RadarResponseDTO radarResponseDTO = radarMapper.fromRadarToRadarResponse(radar_saved);
            return radarResponseDTO;
        }
        else return null;
    }

    @Override
    public RadarResponseDTO findById(Long id) {
        Radar radar_found = radarRepository.findById(id).orElse(null);
        if (radar_found != null)
        {
            RadarResponseDTO radarResponseDTO = radarMapper.fromRadarToRadarResponse(radar_found);
            return radarResponseDTO;
        }
        else throw new RuntimeException(String.format("Customer %s doesnt exist",id));
    }

    @Override
    public List<RadarResponseDTO> findAll() {
        return radarRepository.findAll().stream()
                .map(radarMapper::fromRadarToRadarResponse)
                .collect(Collectors.toList());
    }

}
