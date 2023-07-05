package com.example.radarservice.Service.Infraction.Rest;

import com.example.radarservice.Model.InfractionRequestDTO;
import com.example.radarservice.Model.InfractionResponseDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@Transactional
public class InfractionRestServiceImpl implements InfractionRestService {
    private static String url = "http://localhost:8083/rest";

    private RestTemplate restTemplate;

    public InfractionRestServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public InfractionResponseDTO save(InfractionRequestDTO infractionRequestDTO) {
        InfractionResponseDTO infractionResponseDTO = restTemplate.postForObject(url + "/save", infractionRequestDTO, InfractionResponseDTO.class);
        return infractionResponseDTO;
    }

    @Override
    public InfractionResponseDTO findById(Long id) {
        ResponseEntity<InfractionResponseDTO> responseEntity =restTemplate.exchange(
                url + "/"+id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<InfractionResponseDTO>(){}
        );
        return responseEntity.getBody();
    }

    @Override
    public List<InfractionResponseDTO> findAll() {
        ResponseEntity<List<InfractionResponseDTO>> infractionResponseDTOList =restTemplate.exchange(
                url + "/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<InfractionResponseDTO>>(){}
        );
        return infractionResponseDTOList.getBody();
    }

    @Override
    public List<InfractionResponseDTO> findByMatricule(String matricule_Vehicule) {
        ResponseEntity<List<InfractionResponseDTO>> infractionResponseDTOList =restTemplate.exchange(
                url + "/matricule/"+matricule_Vehicule,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<InfractionResponseDTO>>(){}
        );
        return infractionResponseDTOList.getBody();
    }
}
