package com.example.radarservice.Service;

import com.example.radarservice.Entity.Coordonnee;

public interface CoordonneeService {
    Coordonnee save(Coordonnee coordonnee);
    Coordonnee update(Coordonnee coordonnee);
    Coordonnee findById(Long id);
}
