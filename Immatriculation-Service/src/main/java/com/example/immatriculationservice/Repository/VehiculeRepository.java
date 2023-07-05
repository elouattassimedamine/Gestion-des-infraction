package com.example.immatriculationservice.Repository;

import com.example.immatriculationservice.Entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {

    @Query("SELECT v FROM Vehicule v WHERE v.matricule_Vehicule=?1")
    Vehicule findByMatricule_Vehicule(String matricule);
}
