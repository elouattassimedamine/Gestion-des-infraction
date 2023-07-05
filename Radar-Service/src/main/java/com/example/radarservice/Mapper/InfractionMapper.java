package com.example.radarservice.Mapper;

import com.example.infractionservice.stub.InfractionServiceOuterClass;
import com.example.infractionservice.web.soap.InfractionResponseDTO;
import com.example.radarservice.Model.InfractionRequestDTO;

public interface InfractionMapper {
    com.example.infractionservice.web.soap.InfractionRequestDTO fromDTOToWeb(InfractionRequestDTO infractionRequestDTO);
    com.example.radarservice.Model.InfractionResponseDTO fromWebToDto(InfractionResponseDTO infractionResponseDTO);
    com.example.radarservice.Model.InfractionResponseDTO fromGRPCToModel(InfractionServiceOuterClass.InfractionResponseDTO infractionResponseDTO);
    InfractionServiceOuterClass.InfractionRequestDTO fromModelToGRPC(InfractionRequestDTO infractionRequestDTO);
}
