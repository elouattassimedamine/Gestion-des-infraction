package com.example.radarservice.Mapper;

import com.example.immatriculationservice.stub.VehiculeServiceOuterClass;
import com.example.immatriculationservice.web.soap.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class VehiculeMapperImpl implements VehiculeMapper {
    @Override
    public VehiculeRequestDTO fromModelToWeb(com.example.radarservice.Model.VehiculeRequestDTO vehiculeRequestDTO) {
        VehiculeRequestDTO vehiculeRequestDTO_WSDL = new VehiculeRequestDTO();

        vehiculeRequestDTO_WSDL.setIdPersonne(vehiculeRequestDTO.getId_Personne());
        vehiculeRequestDTO_WSDL.setNomPersonne(vehiculeRequestDTO.getNom_Personne());
        vehiculeRequestDTO_WSDL.setNaissancePersonne(vehiculeRequestDTO.getNaissance_Personne());
        vehiculeRequestDTO_WSDL.setMailPersonne(vehiculeRequestDTO.getMail_Personne());
        vehiculeRequestDTO_WSDL.setAdressePersonne(vehiculeRequestDTO.getAdresse_Personne());
        vehiculeRequestDTO_WSDL.setIdVehicule(vehiculeRequestDTO.getId_Vehicule());
        vehiculeRequestDTO_WSDL.setMarqueVehicule(vehiculeRequestDTO.getMarque_Vehicule());
        vehiculeRequestDTO_WSDL.setModeleVehicule(vehiculeRequestDTO.getModele_Vehicule());
        vehiculeRequestDTO_WSDL.setMatriculeVehicule(vehiculeRequestDTO.getMatricule_Vehicule());
        vehiculeRequestDTO_WSDL.setCvVehicule(vehiculeRequestDTO.getCv_Vehicule());

        return vehiculeRequestDTO_WSDL;
    }

    @Override
    public VehiculeResponseDTO fromWebToModel(com.example.immatriculationservice.web.soap.VehiculeResponseDTO vehiculeResponseDTO) {
        VehiculeResponseDTO vehiculeResponseDTO_Model = new VehiculeResponseDTO();

        vehiculeResponseDTO_Model.setId_Personne(vehiculeResponseDTO.getIdPersonne());
        vehiculeResponseDTO_Model.setNom_Personne(vehiculeResponseDTO.getNomPersonne());
        vehiculeResponseDTO_Model.setNaissance_Personne(vehiculeResponseDTO.getNaissancePersonne());
        vehiculeResponseDTO_Model.setMail_Personne(vehiculeResponseDTO.getMailPersonne());
        vehiculeResponseDTO_Model.setAdresse_Personne(vehiculeResponseDTO.getAdressePersonne());
        vehiculeResponseDTO_Model.setId_Vehicule(vehiculeResponseDTO.getIdVehicule());
        vehiculeResponseDTO_Model.setMarque_Vehicule(vehiculeResponseDTO.getMarqueVehicule());
        vehiculeResponseDTO_Model.setModele_Vehicule(vehiculeResponseDTO.getModeleVehicule());
        vehiculeResponseDTO_Model.setMatricule_Vehicule(vehiculeResponseDTO.getMatriculeVehicule());
        vehiculeResponseDTO_Model.setCv_Vehicule(vehiculeResponseDTO.getCvVehicule());

        return vehiculeResponseDTO_Model;
    }

    @Override
    public VehiculeServiceOuterClass.VehiculeRequestDTO fromModelToGRPC(com.example.radarservice.Model.VehiculeRequestDTO vehiculeRequestDTO) {
        VehiculeServiceOuterClass.VehiculeRequestDTO vehiculeRequestDTO_GRPC = VehiculeServiceOuterClass.VehiculeRequestDTO.newBuilder()
        .setIdPersonne(vehiculeRequestDTO.getId_Personne())
        .setNomPersonne(vehiculeRequestDTO.getNom_Personne())
        .setNaissancePersonne(vehiculeRequestDTO.getNaissance_Personne())
        .setMailPersonne(vehiculeRequestDTO.getMail_Personne())
        .setAdressePersonne(vehiculeRequestDTO.getAdresse_Personne())
        .setIdVehicule(vehiculeRequestDTO.getId_Vehicule())
        .setMarqueVehicule(vehiculeRequestDTO.getMarque_Vehicule())
        .setModeleVehicule(vehiculeRequestDTO.getModele_Vehicule())
        .setMatriculeVehicule(vehiculeRequestDTO.getMatricule_Vehicule())
        .setCvVehicule(vehiculeRequestDTO.getCv_Vehicule())
        .build();
        return vehiculeRequestDTO_GRPC;
    }

    @Override
    public VehiculeResponseDTO fromGRPCToModel(VehiculeServiceOuterClass.VehiculeResponseDTO vehiculeResponseDTO) {
        VehiculeResponseDTO vehiculeResponseDTO_Model = new VehiculeResponseDTO();

        vehiculeResponseDTO_Model.setId_Personne(vehiculeResponseDTO.getIdPersonne());
        vehiculeResponseDTO_Model.setNom_Personne(vehiculeResponseDTO.getNomPersonne());
        vehiculeResponseDTO_Model.setNaissance_Personne(vehiculeResponseDTO.getNaissancePersonne());
        vehiculeResponseDTO_Model.setMail_Personne(vehiculeResponseDTO.getMailPersonne());
        vehiculeResponseDTO_Model.setAdresse_Personne(vehiculeResponseDTO.getAdressePersonne());
        vehiculeResponseDTO_Model.setId_Vehicule(vehiculeResponseDTO.getIdVehicule());
        vehiculeResponseDTO_Model.setMarque_Vehicule(vehiculeResponseDTO.getMarqueVehicule());
        vehiculeResponseDTO_Model.setModele_Vehicule(vehiculeResponseDTO.getModeleVehicule());
        vehiculeResponseDTO_Model.setMatricule_Vehicule(vehiculeResponseDTO.getMatriculeVehicule());
        vehiculeResponseDTO_Model.setCv_Vehicule(vehiculeResponseDTO.getCvVehicule());


        return vehiculeResponseDTO_Model;
    }
}
