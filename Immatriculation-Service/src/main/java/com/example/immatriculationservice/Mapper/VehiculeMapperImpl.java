package com.example.immatriculationservice.Mapper;

import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.DTO.VehiculeResponseDTO;
import com.example.immatriculationservice.Entity.Personne;
import com.example.immatriculationservice.Entity.Vehicule;
import com.example.immatriculationservice.stub.VehiculeServiceOuterClass;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VehiculeMapperImpl implements VehiculeMapper {
    @Override
    public Personne fromRequestToPersonne(VehiculeRequestDTO vehiculeRequestDTO) {
        Personne personne = new Personne();

        personne.setId_Personne(vehiculeRequestDTO.getId_Personne());
            personne.setAdresse_Personne(vehiculeRequestDTO.getAdresse_Personne());
                personne.setMail_Personne(vehiculeRequestDTO.getMail_Personne());
                    personne.setNaissance_Personne(vehiculeRequestDTO.getNaissance_Personne());
                        personne.setNom_Personne(vehiculeRequestDTO.getNom_Personne());
        return personne;
    }

    @Override
    public Vehicule fromRequestToVehicule(VehiculeRequestDTO vehiculeRequestDTO) {
        Vehicule vehicule = new Vehicule();
        BeanUtils.copyProperties(vehiculeRequestDTO,vehicule);
        return vehicule;
    }

    @Override
    public VehiculeResponseDTO fromVehiculeToResponse(Vehicule vehicule) {
        VehiculeResponseDTO vehiculeResponseDTO = new VehiculeResponseDTO();

        vehiculeResponseDTO.setId_Vehicule(vehicule.getId_Vehicule());
            vehiculeResponseDTO.setMarque_Vehicule(vehicule.getMarque_Vehicule());
                vehiculeResponseDTO.setModele_Vehicule(vehicule.getModele_Vehicule());
                    vehiculeResponseDTO.setCv_Vehicule(vehicule.getCv_Vehicule());
                        vehiculeResponseDTO.setMatricule_Vehicule(vehicule.getMatricule_Vehicule());


        vehiculeResponseDTO.setId_Personne(vehicule.getPersonne().getId_Personne());
            vehiculeResponseDTO.setNom_Personne(vehicule.getPersonne().getNom_Personne());
                vehiculeResponseDTO.setAdresse_Personne(vehicule.getPersonne().getAdresse_Personne());
                    vehiculeResponseDTO.setMail_Personne(vehicule.getPersonne().getMail_Personne());
                        vehiculeResponseDTO.setNaissance_Personne(vehicule.getPersonne().getNaissance_Personne());
        return vehiculeResponseDTO;
    }

    @Override
    public VehiculeServiceOuterClass.VehiculeResponseDTO fromVehiculeToGrpc(VehiculeResponseDTO vehiculeResponseDTO) {
        VehiculeServiceOuterClass.VehiculeResponseDTO responseDTO = VehiculeServiceOuterClass.VehiculeResponseDTO.newBuilder()
                .setIdPersonne(vehiculeResponseDTO.getId_Personne())
                    .setNomPersonne(vehiculeResponseDTO.getNom_Personne())
                        .setMailPersonne(vehiculeResponseDTO.getMail_Personne())
                            .setAdressePersonne(vehiculeResponseDTO.getMail_Personne())
                                .setNaissancePersonne(vehiculeResponseDTO.getNaissance_Personne())


                .setIdVehicule(vehiculeResponseDTO.getId_Vehicule())
                    .setCvVehicule(vehiculeResponseDTO.getCv_Vehicule())
                        .setMarqueVehicule(vehiculeResponseDTO.getMarque_Vehicule())
                            .setModeleVehicule(vehiculeResponseDTO.getModele_Vehicule())
                                .setMatriculeVehicule(vehiculeResponseDTO.getMatricule_Vehicule())
                .build();

        return responseDTO;
    }

    @Override
    public VehiculeRequestDTO fromGrpcToRequest(VehiculeServiceOuterClass.VehiculeRequestDTO vehiculeRequestDTO) {
        VehiculeRequestDTO requestDTO = new VehiculeRequestDTO();
                requestDTO.setId_Personne(vehiculeRequestDTO.getIdPersonne());
                requestDTO.setNom_Personne(vehiculeRequestDTO.getNomPersonne());
                requestDTO.setMail_Personne(vehiculeRequestDTO.getMailPersonne());
                requestDTO.setAdresse_Personne(vehiculeRequestDTO.getMailPersonne());
                requestDTO.setNaissance_Personne(vehiculeRequestDTO.getNaissancePersonne());


                requestDTO.setId_Vehicule(vehiculeRequestDTO.getIdVehicule());
                requestDTO.setCv_Vehicule(vehiculeRequestDTO.getCvVehicule());
                requestDTO.setMarque_Vehicule(vehiculeRequestDTO.getMarqueVehicule());
                requestDTO.setModele_Vehicule(vehiculeRequestDTO.getModeleVehicule());
                requestDTO.setMatricule_Vehicule(vehiculeRequestDTO.getMatriculeVehicule());



        return requestDTO;
    }
}
