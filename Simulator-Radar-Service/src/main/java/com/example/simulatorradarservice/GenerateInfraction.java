package com.example.simulatorradarservice;

import com.example.simulatorradarservice.DTO.RadarResponseDTO;
import com.example.simulatorradarservice.Service.RadarService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@EnableScheduling
public class GenerateInfraction {

    private RadarService radarService;

    public GenerateInfraction(RadarService radarService) {
        this.radarService = radarService;
    }

    @Scheduled(fixedRate = 30000)
    public void generateRandomNumber() {
        Random random = new Random();

        Long id_Radar = random.longs(1, 6).findFirst().getAsLong();
        RadarResponseDTO radarResponseDTO = radarService.findByIdRest(id_Radar);


        Long id_Vehicule = random.longs(1, 5).findFirst().getAsLong();

        int methode = random.ints(1, 4).findFirst().getAsInt();


        int vitesse = random.ints(radarResponseDTO.getVitesse_Radar(), radarResponseDTO.getVitesse_Radar()+30).findFirst().getAsInt();
        String response = radarService.generateInfraction(id_Radar,id_Vehicule,methode,vitesse);
        System.out.println(response);
    }
}
