package com.example.immatriculationservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor @AllArgsConstructor
public class PersonneResponseDTO {
    private Long id_Personne;
    private String nom_Personne;
    private Date naissance_Personne;
    private String mail_Personne;
    private String adresse_Personne;

}
