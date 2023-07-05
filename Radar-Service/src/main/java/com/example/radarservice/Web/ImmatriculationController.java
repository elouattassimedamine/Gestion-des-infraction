package com.example.radarservice.Web;

import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;
import com.example.radarservice.Service.Vehicule.GRPC.VehiculeGRPCService;
import com.example.radarservice.Service.Vehicule.GraphQL.VehiculeGraphService;
import com.example.radarservice.Service.Vehicule.Rest.VehiculeRestService;
import com.example.radarservice.Service.Vehicule.WSDL.VehiculeWSDLService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/immatriculation")
public class ImmatriculationController {
    
    private VehiculeRestService vehiculeRestService;
    private VehiculeGraphService vehiculeGraphService;
    private VehiculeWSDLService vehiculeWSDLService;
    private VehiculeGRPCService vehiculeGRPCService;

    public ImmatriculationController(VehiculeRestService vehiculeRestService, VehiculeGraphService vehiculeGraphService, VehiculeWSDLService vehiculeWSDLService, VehiculeGRPCService vehiculeGRPCService) {
        this.vehiculeRestService = vehiculeRestService;
        this.vehiculeGraphService = vehiculeGraphService;
        this.vehiculeWSDLService = vehiculeWSDLService;
        this.vehiculeGRPCService = vehiculeGRPCService;
    }

    @PostMapping("/save")
    public VehiculeResponseDTO save(@RequestBody VehiculeRequestDTO VehiculeRequestDTO){
        return vehiculeGRPCService.save(VehiculeRequestDTO);
    }

    @PostMapping("/update")
    public VehiculeResponseDTO update(@RequestBody VehiculeRequestDTO VehiculeRequestDTO){
        return vehiculeGRPCService.update(VehiculeRequestDTO);
    }

    @GetMapping("/{id}")
    public VehiculeResponseDTO getId(@PathVariable Long id){
        return vehiculeGRPCService.findById(id);
    }

    @GetMapping("/")
    public List<VehiculeResponseDTO> findAll(){
        return vehiculeGRPCService.findAll();
    }

    @GetMapping("/matricule/{matricule}")
    public VehiculeResponseDTO findByMatricule(@PathVariable String matricule){
        return vehiculeGRPCService.findByMatricule(matricule);
    }
}
