package com.example.radarservice.Service.Vehicule.GraphQL;

import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import java.util.List;
@Service
@Transactional
public class VehiculeGraphServiceImpl implements VehiculeGraphService {

    private static String url = "http://localhost:8082/graphql";

    @Override
    public VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO) {
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url(url)
                .build();
        var httpRequestDocument = """
                mutation($id_Personne:Int,
                         $nom_Personne:String,
                         $naissance_Personne:String,
                         $mail_Personne:String,
                         $adresse_Personne:String,
                         $id_Vehicule:Int,
                         $marque_Vehicule:String,
                         $modele_Vehicule:String,
                         $matricule_Vehicule:String,
                         $cv_Vehicule:Int){
                     save(vehiculeRequestDTO : {
                         id_Personne : $id_Personne,
                         nom_Personne : $nom_Personne,
                         naissance_Personne : $naissance_Personne,
                         mail_Personne : $mail_Personne,
                         adresse_Personne : $adresse_Personne,
                         id_Vehicule : $id_Vehicule,
                         marque_Vehicule : $marque_Vehicule,
                         modele_Vehicule : $modele_Vehicule,
                         matricule_Vehicule : $matricule_Vehicule,
                         cv_Vehicule : $cv_Vehicule
                     }) {
                           id_Personne,
                           nom_Personne,
                           naissance_Personne,
                           mail_Personne,
                           adresse_Personne,
                           id_Vehicule,
                           marque_Vehicule,
                           modele_Vehicule,
                           matricule_Vehicule,
                           cv_Vehicule
                     }
                   }
                """;
        Mono<VehiculeResponseDTO> vehiculeResponseDTOMono = graphQlClient.document(httpRequestDocument)
                .variable("id_Personne", vehiculeRequestDTO.getId_Personne())
                .variable("nom_Personne", vehiculeRequestDTO.getNom_Personne())
                .variable("naissance_Personne", vehiculeRequestDTO.getNaissance_Personne())
                .variable("mail_Personne", vehiculeRequestDTO.getMail_Personne())
                .variable("adresse_Personne", vehiculeRequestDTO.getAdresse_Personne())
                .variable("id_Vehicule", vehiculeRequestDTO.getId_Vehicule())
                .variable("marque_Vehicule", vehiculeRequestDTO.getMarque_Vehicule())
                .variable("modele_Vehicule", vehiculeRequestDTO.getModele_Vehicule())
                .variable("matricule_Vehicule", vehiculeRequestDTO.getMatricule_Vehicule())
                .variable("cv_Vehicule", vehiculeRequestDTO.getCv_Vehicule())

                .retrieve("save").toEntity(VehiculeResponseDTO.class);
        return vehiculeResponseDTOMono.block();
    }

    @Override
    public VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO) {

        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url(url)
                .build();
        var httpRequestDocument = """
                mutation($id_Personne:Int,
                         $nom_Personne:String,
                         $naissance_Personne:String,
                         $mail_Personne:String,
                         $adresse_Personne:String,
                         $id_Vehicule:Int,
                         $marque_Vehicule:String,
                         $modele_Vehicule:String,
                         $matricule_Vehicule:String,
                         $cv_Vehicule:Int){
                     update(vehiculeRequestDTO : {
                         id_Personne : $id_Personne,
                         nom_Personne : $nom_Personne,
                         naissance_Personne : $naissance_Personne,
                         mail_Personne : $mail_Personne,
                         adresse_Personne : $adresse_Personne,
                         id_Vehicule : $id_Vehicule,
                         marque_Vehicule : $marque_Vehicule,
                         modele_Vehicule : $modele_Vehicule,
                         matricule_Vehicule : $matricule_Vehicule,
                         cv_Vehicule : $cv_Vehicule
                     }) {
                           id_Personne,
                           nom_Personne,
                           naissance_Personne,
                           mail_Personne,
                           adresse_Personne,
                           id_Vehicule,
                           marque_Vehicule,
                           modele_Vehicule,
                           matricule_Vehicule,
                           cv_Vehicule
                     }
                   }
                """;
        Mono<VehiculeResponseDTO> vehiculeResponseDTOMono = graphQlClient.document(httpRequestDocument)
                .variable("id_Personne", vehiculeRequestDTO.getId_Personne())
                .variable("nom_Personne", vehiculeRequestDTO.getNom_Personne())
                .variable("naissance_Personne", vehiculeRequestDTO.getNaissance_Personne())
                .variable("mail_Personne", vehiculeRequestDTO.getMail_Personne())
                .variable("adresse_Personne", vehiculeRequestDTO.getAdresse_Personne())
                .variable("id_Vehicule", vehiculeRequestDTO.getId_Vehicule())
                .variable("marque_Vehicule", vehiculeRequestDTO.getMarque_Vehicule())
                .variable("modele_Vehicule", vehiculeRequestDTO.getModele_Vehicule())
                .variable("matricule_Vehicule", vehiculeRequestDTO.getMatricule_Vehicule())
                .variable("cv_Vehicule", vehiculeRequestDTO.getCv_Vehicule())

                .retrieve("update").toEntity(VehiculeResponseDTO.class);
        return vehiculeResponseDTOMono.block();
    }

    @Override
    public VehiculeResponseDTO findById(Long id) {

        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url(url)
                .build();
        var httpRequestDocument = """
                query($id:Int){
                   findById(id:$id){
                      id_Personne,
                      nom_Personne,
                      naissance_Personne,
                      mail_Personne,
                      adresse_Personne,
                      id_Vehicule,
                      marque_Vehicule,
                      modele_Vehicule,
                      matricule_Vehicule,
                      cv_Vehicule                   
                    }
                 }
                """;
        Mono<VehiculeResponseDTO> vehiculeResponseDTO= graphQlClient.document(httpRequestDocument).variable("id",id).retrieve("findById").toEntity(VehiculeResponseDTO.class);
        return vehiculeResponseDTO.block();
    }

    @Override
    public List<VehiculeResponseDTO> findAll() {

        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder().url(url).build();
        var httpRequestDocument = """
                query{
                    findAll{
                      id_Personne,
                      nom_Personne,
                      naissance_Personne,
                      mail_Personne,
                      adresse_Personne,
                      id_Vehicule,
                      marque_Vehicule,
                      modele_Vehicule,
                      matricule_Vehicule,
                      cv_Vehicule
                    }
                  }
                """;
        Mono<List<VehiculeResponseDTO>> vehiculeRequestDTO = graphQlClient.document(httpRequestDocument)
                .retrieve("findAll")
                .toEntityList(VehiculeResponseDTO.class);

        List<VehiculeResponseDTO> vehiculeResponseDTOList = vehiculeRequestDTO.block();
        return vehiculeResponseDTOList;
    }

    @Override
    public VehiculeResponseDTO findByMatricule(String matricule) {

        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url(url)
                .build();
        var httpRequestDocument = """
                query($matricule:String){
                   findByMatricule(matricule:$matricule){
                      id_Personne,
                      nom_Personne,
                      naissance_Personne,
                      mail_Personne,
                      adresse_Personne,
                      id_Vehicule,
                      marque_Vehicule,
                      modele_Vehicule,
                      matricule_Vehicule,
                      cv_Vehicule
                   }
                 }
                """;
        Mono<VehiculeResponseDTO> vehiculeResponseDTOMono= graphQlClient.document(httpRequestDocument).variable("matricule",matricule).retrieve("findByMatricule").toEntity(VehiculeResponseDTO.class);
        VehiculeResponseDTO vehiculeResponseDTO = vehiculeResponseDTOMono.block();
        return vehiculeResponseDTO;
    }
}
