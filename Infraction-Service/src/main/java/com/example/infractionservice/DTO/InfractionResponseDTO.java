package com.example.infractionservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor @AllArgsConstructor
public class InfractionResponseDTO {

    private Long id_Infraction;
    private Date date_Infraction;
    private int montant_Infraction;
    private String matricule_Vehicule;
    private int vitesse_Vehicule;
    private Long id_Radar;
    private int vitesse_Radar;
}
