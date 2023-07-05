package com.example.immatriculationservice.Web.SOAP;

import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.DTO.VehiculeResponseDTO;
import com.example.immatriculationservice.Service.VehiculeService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "VehiculeWS")
public class VehiculeSoapController {

    private VehiculeService vehiculeService;

    public VehiculeSoapController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    @WebMethod
    public List<VehiculeResponseDTO> findAll(){
        return vehiculeService.findAll();
    }

    @WebMethod
    public VehiculeResponseDTO findById(@WebParam(name = "id") Long id){
        return vehiculeService.findById(id);
    }

    @WebMethod
    public VehiculeResponseDTO findByMatricule(@WebParam(name = "matricule") String matricule){
        return vehiculeService.findByMatricule(matricule);
    }

    @WebMethod
    public VehiculeResponseDTO save(@WebParam VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.save(vehiculeRequestDTO);
    }

    @WebMethod
    public VehiculeResponseDTO update(@WebParam VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeService.update(vehiculeRequestDTO);
    }
}
