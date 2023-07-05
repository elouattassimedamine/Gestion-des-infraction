package com.example.radarservice.Service.Vehicule.Rest;

import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@Transactional
public class VehiculeRestServiceImpl implements VehiculeRestService {

    private RestTemplate restTemplate;
    private static String url = "http://localhost:8082/rest";

    public VehiculeRestServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO) {
        VehiculeResponseDTO vehiculeResponseDTO = restTemplate.postForObject(url + "/create", vehiculeRequestDTO, VehiculeResponseDTO.class);
        return vehiculeResponseDTO;
    }

    @Override
    public VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO) {
        VehiculeResponseDTO vehiculeResponseDTO = restTemplate.postForObject(url + "/update", vehiculeRequestDTO, VehiculeResponseDTO.class);
        return vehiculeResponseDTO;
    }

    @Override
    public VehiculeResponseDTO findById(Long id) {
        ResponseEntity<VehiculeResponseDTO> responseEntity =restTemplate.exchange(
                url + "/"+id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<VehiculeResponseDTO>(){}
        );
        return responseEntity.getBody();
    }

    @Override
    public List<VehiculeResponseDTO> findAll() {
        ResponseEntity<List<VehiculeResponseDTO>> infractionResponseDTOList =restTemplate.exchange(
                url + "/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<VehiculeResponseDTO>>(){}
        );
        return infractionResponseDTOList.getBody();
    }

    @Override
    public VehiculeResponseDTO findByMatricule(String matricule) {

        ResponseEntity<VehiculeResponseDTO> infractionResponseDTOList =restTemplate.exchange(
                url + "/matricule/"+matricule,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<VehiculeResponseDTO>(){}
        );
        return infractionResponseDTOList.getBody();
    }
}
