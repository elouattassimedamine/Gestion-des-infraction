package com.example.infractionservice.Web.SOAP;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.DTO.InfractionResponseDTO;
import com.example.infractionservice.Service.InfractionService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "InfractionWS")
public class InfractionSoapController {

    private InfractionService infractionService;

    public InfractionSoapController(InfractionService infractionService) {
        this.infractionService = infractionService;
    }

    @WebMethod
    public List<InfractionResponseDTO> findAll(){
        return infractionService.findAll();
    }

    @WebMethod
    public List<InfractionResponseDTO> findByMatricule(@WebParam(name = "matricule") String matricule){
        return infractionService.findByMatricule(matricule);
    }

    @WebMethod
    public InfractionResponseDTO findById(@WebParam(name = "id") Long id){
        return infractionService.findById(id);
    }

    @WebMethod
    public InfractionResponseDTO save(@WebParam InfractionRequestDTO infractionRequestDTO){
        return infractionService.save(infractionRequestDTO);
    }
}
