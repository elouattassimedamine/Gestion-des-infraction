package com.example.radarservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehiculeRequestDTO {
    private Long id_Personne;
    private String nom_Personne;
    private String naissance_Personne;
    private String mail_Personne;
    private String adresse_Personne;
    private Long id_Vehicule;
    private String marque_Vehicule;
    private String modele_Vehicule;
    private String matricule_Vehicule;
    private int cv_Vehicule;
}
