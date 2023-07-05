package com.example.radarservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class CoordonneeRequestDTO {
    private int longitude_Coordonnee;
    private int laltitude_Coordonnee;
}
