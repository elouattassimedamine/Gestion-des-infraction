package com.example.radarservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Coordonnee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Coordonnee;

    private int longitude_Coordonnee;
    private int laltitude_Coordonnee;
}
