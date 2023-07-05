package com.example.infractionservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class InfractionRequestDTO {
    private String matricule_Vehicule;
    private int vitesse_Vehicule;
    private Long id_Radar;
    private int vitesse_Radar;
}
