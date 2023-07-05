package com.example.radarservice.Web;

import com.example.radarservice.Model.InfractionRequestDTO;
import com.example.radarservice.Model.InfractionResponseDTO;
import com.example.radarservice.Service.Infraction.GRPC.InfractionGRPCService;
import com.example.radarservice.Service.Infraction.GraphQL.InfractionGraphQLService;
import com.example.radarservice.Service.Infraction.Rest.InfractionRestService;
import com.example.radarservice.Service.Infraction.WSDL.InfractionWSDLService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InfractionController {

    private InfractionRestService infractionRestService;
    private InfractionGraphQLService infractionGraphQLService;
    private InfractionWSDLService infractionWSDLService;
    private InfractionGRPCService infractionGRPCService;

    public InfractionController(InfractionRestService infractionRestService, InfractionGraphQLService infractionGraphQLService, InfractionWSDLService infractionWSDLService, InfractionGRPCService infractionGRPCService) {
        this.infractionRestService = infractionRestService;
        this.infractionGraphQLService = infractionGraphQLService;
        this.infractionWSDLService = infractionWSDLService;
        this.infractionGRPCService = infractionGRPCService;
    }

    @PostMapping("/save")
    public InfractionResponseDTO save(@RequestBody InfractionRequestDTO infractionRequestDTO){
        return infractionGRPCService.save(infractionRequestDTO);
    }

    @GetMapping("/{id}")
    public InfractionResponseDTO getId(@PathVariable Long id){
        return infractionGRPCService.findById(id);
    }

    @GetMapping("/")
    public List<InfractionResponseDTO> findAll(){
        return infractionGRPCService.findAll();
    }

    @GetMapping("/matricule/{matricule}")
    public List<InfractionResponseDTO> findByMatricule(@PathVariable String matricule){
        return infractionGRPCService.findByMatricule(matricule);
    }
}
