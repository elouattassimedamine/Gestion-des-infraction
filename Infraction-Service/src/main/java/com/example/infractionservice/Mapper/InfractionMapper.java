package com.example.infractionservice.Mapper;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.DTO.InfractionResponseDTO;
import com.example.infractionservice.Entity.Infraction;
import com.example.infractionservice.stub.InfractionServiceOuterClass;

public interface InfractionMapper {

    Infraction fromRequestToInfraction(InfractionRequestDTO infractionRequestDTO);
    InfractionResponseDTO fromInfractionToResponse(Infraction infraction);
    InfractionServiceOuterClass.InfractionResponseDTO fromDTOResponseToGRPC(InfractionResponseDTO infractionResponseDTO);
    InfractionRequestDTO fromGRPCToRequest(InfractionServiceOuterClass.InfractionRequestDTO infractionRequestDTO);
}
