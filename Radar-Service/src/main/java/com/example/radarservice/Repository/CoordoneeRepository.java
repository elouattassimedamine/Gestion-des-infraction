package com.example.radarservice.Repository;

import com.example.radarservice.Entity.Coordonnee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordoneeRepository extends JpaRepository<Coordonnee,Long> {
}
