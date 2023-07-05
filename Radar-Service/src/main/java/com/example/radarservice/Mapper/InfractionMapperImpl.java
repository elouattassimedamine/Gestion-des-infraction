package com.example.radarservice.Mapper;

import com.example.infractionservice.stub.InfractionServiceOuterClass;
import com.example.infractionservice.web.soap.InfractionResponseDTO;
import com.example.radarservice.Model.InfractionRequestDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class InfractionMapperImpl implements InfractionMapper {

    @Override
    public com.example.infractionservice.web.soap.InfractionRequestDTO fromDTOToWeb(InfractionRequestDTO infractionRequestDTO) {
        com.example.infractionservice.web.soap.InfractionRequestDTO infractionRequestDTO_SOAP = new com.example.infractionservice.web.soap.InfractionRequestDTO();

        infractionRequestDTO_SOAP.setIdRadar(infractionRequestDTO.getId_Radar());
            infractionRequestDTO_SOAP.setMatriculeVehicule(infractionRequestDTO.getMatricule_Vehicule());
                infractionRequestDTO_SOAP.setVitesseRadar(infractionRequestDTO.getVitesse_Radar());
                    infractionRequestDTO_SOAP.setVitesseVehicule(infractionRequestDTO.getVitesse_Vehicule());

        return infractionRequestDTO_SOAP;
    }

    @Override
    public com.example.radarservice.Model.InfractionResponseDTO fromWebToDto(InfractionResponseDTO infractionResponseDTO) {
        com.example.radarservice.Model.InfractionResponseDTO infractionResponseDTO_Model = new com.example.radarservice.Model.InfractionResponseDTO();

        infractionResponseDTO_Model.setId_Infraction(infractionResponseDTO.getIdInfraction());
/*
            infractionResponseDTO_Model.setDate_Infraction(infractionResponseDTO.getDateInfraction());
*/
                infractionResponseDTO_Model.setMontant_Infraction(infractionResponseDTO.getMontantInfraction());
                    infractionResponseDTO_Model.setId_Radar(infractionResponseDTO.getIdRadar());
                        infractionResponseDTO_Model.setMatricule_Vehicule(infractionResponseDTO.getMatriculeVehicule());
                            infractionResponseDTO_Model.setVitesse_Radar(infractionResponseDTO.getVitesseRadar());
                                infractionResponseDTO_Model.setVitesse_Vehicule(infractionResponseDTO.getVitesseVehicule());

        return infractionResponseDTO_Model;
    }

    @Override
    public com.example.radarservice.Model.InfractionResponseDTO fromGRPCToModel(InfractionServiceOuterClass.InfractionResponseDTO infractionResponseDTO) {
        com.example.radarservice.Model.InfractionResponseDTO infractionResponseDTO_Model = new com.example.radarservice.Model.InfractionResponseDTO();
        infractionResponseDTO_Model.setId_Infraction(infractionResponseDTO.getIdInfraction());

        infractionResponseDTO_Model.setDate_Infraction(infractionResponseDTO.getDateInfraction());

        infractionResponseDTO_Model.setMontant_Infraction(Integer.parseInt(String.valueOf(infractionResponseDTO.getMontantInfraction())));
        infractionResponseDTO_Model.setId_Radar(infractionResponseDTO.getIdRadar());
        infractionResponseDTO_Model.setMatricule_Vehicule(infractionResponseDTO.getMatriculeVehicule());
        infractionResponseDTO_Model.setVitesse_Radar(Integer.parseInt(String.valueOf(infractionResponseDTO.getVitesseRadar())));
        infractionResponseDTO_Model.setVitesse_Vehicule(Integer.parseInt(String.valueOf(infractionResponseDTO.getVitesseVehicule())));

        return infractionResponseDTO_Model;
    }

    @Override
    public InfractionServiceOuterClass.InfractionRequestDTO fromModelToGRPC(InfractionRequestDTO infractionRequestDTO) {
        InfractionServiceOuterClass.InfractionRequestDTO infractionRequestDTO_GRPC = InfractionServiceOuterClass.InfractionRequestDTO.newBuilder()
                .setIdRadar(infractionRequestDTO.getId_Radar())
                .setMatriculeVehicule(infractionRequestDTO.getMatricule_Vehicule())
                .setVitesseRadar(infractionRequestDTO.getVitesse_Radar())
                .setVitesseVehicule(infractionRequestDTO.getVitesse_Vehicule())
                .build();
        return infractionRequestDTO_GRPC;
    }
}
