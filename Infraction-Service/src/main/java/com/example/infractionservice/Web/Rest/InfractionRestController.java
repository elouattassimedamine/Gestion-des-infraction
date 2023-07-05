package com.example.infractionservice.Web.Rest;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.DTO.InfractionResponseDTO;
import com.example.infractionservice.Service.InfractionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class InfractionRestController {

    private InfractionService infractionService;

    public InfractionRestController(InfractionService infractionService) {
        this.infractionService = infractionService;
    }

    @PostMapping("/save")
    public InfractionResponseDTO save(@RequestBody InfractionRequestDTO infractionRequestDTO){
        return infractionService.save(infractionRequestDTO);
    }

    @GetMapping("/{id}")
    public InfractionResponseDTO getId(@PathVariable Long id){
        return infractionService.findById(id);
    }

    @GetMapping("/")
    public List<InfractionResponseDTO> findAll(){
        return infractionService.findAll();
    }

    @GetMapping("/matricule/{matricule}")
    public List<InfractionResponseDTO> findByMatricule(@PathVariable String matricule){
        return infractionService.findByMatricule(matricule);
    }
}
