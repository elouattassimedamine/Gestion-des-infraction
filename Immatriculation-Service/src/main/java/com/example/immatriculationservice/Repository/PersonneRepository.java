package com.example.immatriculationservice.Repository;

import com.example.immatriculationservice.Entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
