package com.example.radarservice.Service.Infraction.GraphQL;

import com.example.radarservice.Model.InfractionRequestDTO;
import com.example.radarservice.Model.InfractionResponseDTO;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import java.util.List;
@Service
@Transactional
public class InfractionGraphQLServiceImpl implements InfractionGraphQLService {
    private static String url = "http://localhost:8083/graphql";

    @Override
    public InfractionResponseDTO save(InfractionRequestDTO infractionRequestDTO) {
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url(url)
                .build();
        var httpRequestDocument = """
                mutation($vitesseR: Int, $matricule: String, $vitesseV: Int, $id: Int){
                     save(infractionRequestDTO : {
                       vitesse_Radar : $vitesseR
                       matricule_Vehicule : $matricule
                       vitesse_Vehicule : $vitesseV
                       id_Radar : $id
                     }) {
                       id_Infraction,date_Infraction,montant_Infraction,matricule_Vehicule,vitesse_Vehicule,id_Radar,vitesse_Radar
                     }
                   }
                """;
        Mono<InfractionResponseDTO> infractionResponseDTO = graphQlClient.document(httpRequestDocument)
                .variable("vitesseR", infractionRequestDTO.getVitesse_Radar())
                .variable("matricule", infractionRequestDTO.getMatricule_Vehicule())
                .variable("vitesseV", infractionRequestDTO.getVitesse_Vehicule())
                .variable("id", infractionRequestDTO.getId_Radar())
                .retrieve("save").toEntity(InfractionResponseDTO.class);
        return infractionResponseDTO.block();
    }

    @Override
    public InfractionResponseDTO findById(Long id) {
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url(url)
                .build();
        var httpRequestDocument = """
                query($id:Int){
                   findById(id:$id){
                      id_Infraction,date_Infraction,montant_Infraction,matricule_Vehicule,vitesse_Vehicule,id_Radar,vitesse_Radar
                   }
                 }
                """;
        Mono<InfractionResponseDTO> infractionResponseDTO= graphQlClient.document(httpRequestDocument).variable("id",id).retrieve("findById").toEntity(InfractionResponseDTO.class);
        return infractionResponseDTO.block();
    }

    @Override
    public List<InfractionResponseDTO> findAll() {
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder().url(url).build();
        var httpRequestDocument = """
                query{
                   findAll{
                      id_Infraction,date_Infraction,montant_Infraction,matricule_Vehicule,vitesse_Vehicule,id_Radar,vitesse_Radar
                   }
                 }
                """;
        Mono<List<InfractionResponseDTO>> infractionRequestDTO = graphQlClient.document(httpRequestDocument)
                .retrieve("findAll")
                .toEntityList(InfractionResponseDTO.class);

        List<InfractionResponseDTO> infractionList = infractionRequestDTO.block();
        return infractionList;
    }

    @Override
    public List<InfractionResponseDTO> findByMatricule(String matricule_Vehicule) {
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url(url)
                .build();
        var httpRequestDocument = """
                query($matricule:String){
                   findByMatricule(matricule:$matricule){
                      id_Infraction,date_Infraction,montant_Infraction,matricule_Vehicule,vitesse_Vehicule,id_Radar,vitesse_Radar
                   }
                 }
                """;
        Mono<List<InfractionResponseDTO>> infractionResponseDTO= graphQlClient.document(httpRequestDocument).variable("matricule",matricule_Vehicule).retrieve("findByMatricule").toEntityList(InfractionResponseDTO.class);
        List<InfractionResponseDTO> infractionList = infractionResponseDTO.block();
        return infractionList;
    }
}
