package com.example.immatriculationservice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Vehicule;

    private String marque_Vehicule;
    private String modele_Vehicule;
    private String matricule_Vehicule;
    private int cv_Vehicule;

    @OneToOne(targetEntity = Personne.class)
    @JoinColumn(name = "id_Personne",referencedColumnName = "id_Personne")
    private Personne personne;

}
