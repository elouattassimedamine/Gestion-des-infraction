package com.example.radarservice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Radar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Radar;
    private int vitesse_Radar;

    @OneToOne(targetEntity = Coordonnee.class)
    @JoinColumn(name = "id_Coordonnee",referencedColumnName = "id_Coordonnee")
    private Coordonnee coordonnee;

}
