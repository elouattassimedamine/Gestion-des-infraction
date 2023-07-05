package com.example.infractionservice.Repository;

import com.example.infractionservice.Entity.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InfractionRepository extends JpaRepository<Infraction,Long> {

    @Query("SELECT i FROM Infraction i WHERE i.matricule_Vehicule=?1")
    List<Infraction> findByMatricule_Vehicule(String matricule_Vehicule);
}
