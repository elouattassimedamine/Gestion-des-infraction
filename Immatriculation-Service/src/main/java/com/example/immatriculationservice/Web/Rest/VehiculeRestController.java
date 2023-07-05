package com.example.immatriculationservice.Web.Rest;

import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.DTO.VehiculeResponseDTO;
import com.example.immatriculationservice.Service.VehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class VehiculeRestController {

    private VehiculeService vehiculeService;

    public VehiculeRestController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    @PostMapping("/create")
    public VehiculeResponseDTO create(@RequestBody VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.save(vehiculeRequestDTO);
    }

    @PostMapping("/update")
    public VehiculeResponseDTO update(@RequestBody VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.update(vehiculeRequestDTO);
    }

    @GetMapping("/{id}")
    public VehiculeResponseDTO findById(@PathVariable Long id){
        return vehiculeService.findById(id);
    }

    @GetMapping("/matricule/{matricule}")
    public VehiculeResponseDTO findByMatricule(@PathVariable String matricule){
        return vehiculeService.findByMatricule(matricule);
    }

    @GetMapping("/")
    public List<VehiculeResponseDTO> findAll(){
        return vehiculeService.findAll();
    }
}
