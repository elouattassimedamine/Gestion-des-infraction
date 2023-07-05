package com.example.infractionservice.Web.GraphQL;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.DTO.InfractionResponseDTO;
import com.example.infractionservice.Service.InfractionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class InfractionGraphQLController {
    private InfractionService infractionService;

    public InfractionGraphQLController(InfractionService infractionService) {
        this.infractionService = infractionService;
    }

    @QueryMapping
    public List<InfractionResponseDTO> findAll(){
        return infractionService.findAll();
    }

    @QueryMapping
    public List<InfractionResponseDTO> findByMatricule(@Argument String matricule){
        return infractionService.findByMatricule(matricule);
    }

    @QueryMapping
    public InfractionResponseDTO findById(@Argument Long id){
        return infractionService.findById(id);
    }

    @MutationMapping
    public InfractionResponseDTO save(@Argument InfractionRequestDTO infractionRequestDTO){
        return infractionService.save(infractionRequestDTO);
    }
}
