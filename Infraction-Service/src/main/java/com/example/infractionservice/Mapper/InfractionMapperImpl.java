package com.example.infractionservice.Mapper;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.DTO.InfractionResponseDTO;
import com.example.infractionservice.Entity.Infraction;
import com.example.infractionservice.stub.InfractionServiceOuterClass;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class InfractionMapperImpl implements InfractionMapper {
    @Override
    public Infraction fromRequestToInfraction(InfractionRequestDTO infractionRequestDTO) {
        Infraction infraction = new Infraction();
        BeanUtils.copyProperties(infractionRequestDTO,infraction);
        return infraction;
    }

    @Override
    public InfractionResponseDTO fromInfractionToResponse(Infraction infraction) {

        InfractionResponseDTO infractionResponseDTO = new InfractionResponseDTO();
        BeanUtils.copyProperties(infraction,infractionResponseDTO);
        return infractionResponseDTO;
    }

    @Override
    public InfractionServiceOuterClass.InfractionResponseDTO fromDTOResponseToGRPC(InfractionResponseDTO infractionResponseDTO) {
        InfractionServiceOuterClass.InfractionResponseDTO infractionResponseDTO_GRPC = InfractionServiceOuterClass.InfractionResponseDTO.newBuilder()
                .setIdInfraction(infractionResponseDTO.getId_Infraction())
                    .setDateInfraction(String.valueOf(infractionResponseDTO.getDate_Infraction()))
                        .setMontantInfraction(infractionResponseDTO.getMontant_Infraction())
                            .setMatriculeVehicule(infractionResponseDTO.getMatricule_Vehicule())
                                .setVitesseVehicule(infractionResponseDTO.getVitesse_Vehicule())
                                    .setIdRadar(infractionResponseDTO.getId_Radar())
                                        .setVitesseRadar(infractionResponseDTO.getVitesse_Radar())
                .build();
        return infractionResponseDTO_GRPC;

    }

    @Override
    public InfractionRequestDTO fromGRPCToRequest(InfractionServiceOuterClass.InfractionRequestDTO infractionRequestDTO) {
        InfractionRequestDTO infractionRequestDTO_mapped = new InfractionRequestDTO();
        infractionRequestDTO_mapped.setMatricule_Vehicule(infractionRequestDTO.getMatriculeVehicule());
        infractionRequestDTO_mapped.setVitesse_Vehicule(Integer.valueOf(String.valueOf(infractionRequestDTO.getVitesseVehicule())));
        infractionRequestDTO_mapped.setId_Radar(infractionRequestDTO.getIdRadar());
        infractionRequestDTO_mapped.setVitesse_Radar(Integer.valueOf(String.valueOf(infractionRequestDTO.getVitesseRadar())));

        return infractionRequestDTO_mapped;
    }
}
