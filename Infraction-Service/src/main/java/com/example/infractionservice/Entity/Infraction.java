package com.example.infractionservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Infraction {

    @Id
    @GeneratedValue
    private Long id_Infraction;
    private Date date_Infraction;
    private int montant_Infraction;
    private String matricule_Vehicule;
    private int vitesse_Vehicule;
    private Long id_Radar;
    private int vitesse_Radar;

}
