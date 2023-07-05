package com.example.radarservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class RadarResponseDTO {
    private Long id_Radar;
    private int vitesse_Radar;
    private int longitude_Coordonnee;
    private int laltitude_Coordonnee;
}
