package com.example.simulatorradarservice.Service;

import com.example.simulatorradarservice.DTO.RadarResponseDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;
@Service
@Transactional
public class RadarServiceImpl implements RadarService {

    private RestTemplate restTemplate;
    private static String url = "http://localhost:8081/graphql";

    public RadarServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public RadarResponseDTO findById(Long id) {
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url(url)
                .build();
        var httpRequestDocument = """
                query($id:Int){
                   findById(id:$id){
                      id_Radar,vitesse_Radar,longitude_Coordonnee,laltitude_Coordonnee
                   }
                 }
                """;
        Mono<RadarResponseDTO> infractionResponseDTO= graphQlClient.document(httpRequestDocument).variable("id",id).retrieve("findById").toEntity(RadarResponseDTO.class);
        return infractionResponseDTO.block();
    }

    @Override
    public RadarResponseDTO findByIdRest(Long id) {
        ResponseEntity<RadarResponseDTO> responseEntity =restTemplate.exchange(
                 "http://localhost:8081/radar/"+id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<RadarResponseDTO>(){}
        );
        return responseEntity.getBody();

    }

    @Override
    public String generateInfraction(Long id_Radar, Long id_Vehicule, int methode, int vitesse) {
        ResponseEntity<String> response =restTemplate.exchange(
                "http://localhost:8081/radar/generateinfraction/"+id_Radar+"/"+id_Vehicule+"/"+methode+"/"+vitesse,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>(){}
        );
        return response.getBody();
    }
}
