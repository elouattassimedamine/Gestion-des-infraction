package com.example.radarservice.Repository;

import com.example.radarservice.Entity.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarRepository extends JpaRepository<Radar,Long> {
}
