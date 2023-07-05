package com.example.radarservice.Service.GeneratorInfraction;

public interface GenerateurInfraction {
    String generateInfraction(Long id_Radar,Long id_Vehicule,int methode,int vitesse);
}
