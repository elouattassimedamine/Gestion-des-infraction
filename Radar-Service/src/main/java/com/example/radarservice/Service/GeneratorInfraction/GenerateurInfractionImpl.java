package com.example.radarservice.Service.GeneratorInfraction;

import com.example.radarservice.DTO.RadarResponseDTO;
import com.example.radarservice.Model.InfractionRequestDTO;
import com.example.radarservice.Model.InfractionResponseDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;
import com.example.radarservice.Service.Infraction.GRPC.InfractionGRPCService;
import com.example.radarservice.Service.Infraction.GraphQL.InfractionGraphQLService;
import com.example.radarservice.Service.Infraction.Rest.InfractionRestService;
import com.example.radarservice.Service.Infraction.WSDL.InfractionWSDLService;
import com.example.radarservice.Service.RadarService;
import com.example.radarservice.Service.Vehicule.GRPC.VehiculeGRPCService;
import com.example.radarservice.Service.Vehicule.GraphQL.VehiculeGraphService;
import com.example.radarservice.Service.Vehicule.Rest.VehiculeRestService;
import com.example.radarservice.Service.Vehicule.WSDL.VehiculeWSDLService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GenerateurInfractionImpl implements GenerateurInfraction {
    private VehiculeGRPCService vehiculeGRPCService;
    private VehiculeWSDLService vehiculeWSDLService;
    private VehiculeRestService vehiculeRestService;
    private VehiculeGraphService vehiculeGraphService;

    private InfractionGRPCService infractionGRPCService;
    private InfractionWSDLService infractionWSDLService;
    private InfractionRestService infractionRestService;
    private InfractionGraphQLService infractionGraphService;
    private RadarService radarService;

    public GenerateurInfractionImpl(VehiculeGRPCService vehiculeGRPCService, VehiculeWSDLService vehiculeWSDLService, VehiculeRestService vehiculeRestService, VehiculeGraphService vehiculeGraphService, InfractionGRPCService infractionGRPCService, InfractionWSDLService infractionWSDLService, InfractionRestService infractionRestService, InfractionGraphQLService infractionGraphService, RadarService radarService) {
        this.vehiculeGRPCService = vehiculeGRPCService;
        this.vehiculeWSDLService = vehiculeWSDLService;
        this.vehiculeRestService = vehiculeRestService;
        this.vehiculeGraphService = vehiculeGraphService;
        this.infractionGRPCService = infractionGRPCService;
        this.infractionWSDLService = infractionWSDLService;
        this.infractionRestService = infractionRestService;
        this.infractionGraphService = infractionGraphService;
        this.radarService = radarService;
    }

    @Override
    public String generateInfraction(Long id_Radar, Long id_Vehicule, int methode, int vitesse) {
        String response = "";
        switch (methode){
            case 1:
                VehiculeResponseDTO vehiculeResponseDTO_Rest = vehiculeRestService.findById(id_Vehicule);
                RadarResponseDTO radarResponseDTO_Rest = radarService.findById(id_Radar);
                InfractionResponseDTO infractionResponseDTO_Rest = infractionRestService.save(new InfractionRequestDTO(vehiculeResponseDTO_Rest.getMatricule_Vehicule(), vitesse, radarResponseDTO_Rest.getId_Radar(), radarResponseDTO_Rest.getVitesse_Radar()));
                if (infractionResponseDTO_Rest != null) response = "Infraction ajoutée";
                else response = "Erreur d'ajout";
            break;
            case 2:
                VehiculeResponseDTO vehiculeResponseDTO_Graph = vehiculeGraphService.findById(id_Vehicule);
                RadarResponseDTO radarResponseDTO_Graph = radarService.findById(id_Radar);
                InfractionResponseDTO infractionResponseDTO_Graph = infractionGraphService.save(new InfractionRequestDTO(vehiculeResponseDTO_Graph.getMatricule_Vehicule(), vitesse, radarResponseDTO_Graph.getId_Radar(), radarResponseDTO_Graph.getVitesse_Radar()));
                if (infractionResponseDTO_Graph != null) response = "Infraction ajoutée";
                else response = "Erreur d'ajout";
            break;
            case 3:
                VehiculeResponseDTO vehiculeResponseDTO_Soap = vehiculeWSDLService.findById(id_Vehicule);
                RadarResponseDTO radarResponseDTO_Soap = radarService.findById(id_Radar);
                InfractionResponseDTO infractionResponseDTO_Soap = infractionWSDLService.save(new InfractionRequestDTO(vehiculeResponseDTO_Soap.getMatricule_Vehicule(), vitesse, radarResponseDTO_Soap.getId_Radar(), radarResponseDTO_Soap.getVitesse_Radar()));
                if (infractionResponseDTO_Soap != null) response = "Infraction ajoutée";
                else response = "Erreur d'ajout";
            break;
            case 4:
                VehiculeResponseDTO vehiculeResponseDTO_GRPC = vehiculeGRPCService.findById(id_Vehicule);
                RadarResponseDTO radarResponseDTO_GRPC = radarService.findById(id_Radar);
                InfractionResponseDTO infractionResponseDTO_GRPC = infractionGRPCService.save(new InfractionRequestDTO(vehiculeResponseDTO_GRPC.getMatricule_Vehicule(), vitesse, radarResponseDTO_GRPC.getId_Radar(), radarResponseDTO_GRPC.getVitesse_Radar()));
                if (infractionResponseDTO_GRPC != null) response = "Infraction ajoutée";
                else response = "Erreur d'ajout";
            break;
        }
        return response;
    }
}
