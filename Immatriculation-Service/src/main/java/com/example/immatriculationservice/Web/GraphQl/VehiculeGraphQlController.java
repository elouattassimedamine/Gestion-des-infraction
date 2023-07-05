package com.example.immatriculationservice.Web.GraphQl;

import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.DTO.VehiculeResponseDTO;
import com.example.immatriculationservice.Service.VehiculeService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VehiculeGraphQlController {

    private VehiculeService vehiculeService;

    public VehiculeGraphQlController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    @QueryMapping
    public List<VehiculeResponseDTO> findAll(){
        return vehiculeService.findAll();
    }

    @QueryMapping
    public VehiculeResponseDTO findById(@Argument Long id){
        return vehiculeService.findById(id);
    }

    @QueryMapping
    public VehiculeResponseDTO findByMatricule(@Argument String matricule){return vehiculeService.findByMatricule(matricule);}

    @MutationMapping
    public VehiculeResponseDTO save(@Argument VehiculeRequestDTO vehiculeRequestDTO){

        return vehiculeService.save(vehiculeRequestDTO);
    }

    @MutationMapping
    public VehiculeResponseDTO update(@Argument VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.update(vehiculeRequestDTO);
    }
}
