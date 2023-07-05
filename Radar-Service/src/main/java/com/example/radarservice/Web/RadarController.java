package com.example.radarservice.Web;

import com.example.radarservice.DTO.RadarResponseDTO;
import com.example.radarservice.Service.GeneratorInfraction.GenerateurInfraction;
import com.example.radarservice.Service.RadarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/radar")
public class RadarController {
    private RadarService radarService;
    private GenerateurInfraction generateurInfraction;

    public RadarController(RadarService radarService, GenerateurInfraction generateurInfraction) {
        this.radarService = radarService;
        this.generateurInfraction = generateurInfraction;
    }

    @GetMapping("/{id}")
    public RadarResponseDTO findById(@PathVariable Long id){
        return radarService.findById(id);
    }

    @GetMapping("/generateinfraction/{id_Radar}/{id_Vehicule}/{methode}/{vitesse}")
    public String generateInfraction(@PathVariable Long id_Radar,@PathVariable Long id_Vehicule,@PathVariable int methode,@PathVariable int vitesse){
        return generateurInfraction.generateInfraction(id_Radar,id_Vehicule,methode,vitesse);
    }
}
