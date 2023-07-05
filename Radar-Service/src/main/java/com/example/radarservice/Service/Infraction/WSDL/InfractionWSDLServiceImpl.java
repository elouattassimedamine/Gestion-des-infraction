package com.example.radarservice.Service.Infraction.WSDL;

import com.example.radarservice.Model.InfractionRequestDTO;
import com.example.radarservice.Model.InfractionResponseDTO;
import com.example.infractionservice.web.soap.InfractionSoapController;
import com.example.radarservice.Mapper.InfractionMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class InfractionWSDLServiceImpl implements InfractionWSDLService {

    private InfractionMapper infractionMapper;
    private InfractionSoapController infractionSoapController;

    public InfractionWSDLServiceImpl(InfractionMapper infractionMapper, InfractionSoapController infractionSoapController) {
        this.infractionMapper = infractionMapper;
        this.infractionSoapController = infractionSoapController;
    }

    @Override
    public InfractionResponseDTO save(InfractionRequestDTO infractionRequestDTO) {
        com.example.infractionservice.web.soap.InfractionRequestDTO infractionRequestDTO1 = infractionMapper.fromDTOToWeb(infractionRequestDTO);
        com.example.infractionservice.web.soap.InfractionResponseDTO save = infractionSoapController.save(infractionRequestDTO1);
        return infractionMapper.fromWebToDto(save);
    }

    @Override
    public InfractionResponseDTO findById(Long id) {
        com.example.infractionservice.web.soap.InfractionResponseDTO soapControllerById = infractionSoapController.findById(id);
        return infractionMapper.fromWebToDto(soapControllerById);
    }

    @Override
    public List<InfractionResponseDTO> findAll() {
        List<com.example.infractionservice.web.soap.InfractionResponseDTO> soapControllerAll = infractionSoapController.findAll();
        return soapControllerAll.stream()
                .map(infractionMapper::fromWebToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<InfractionResponseDTO> findByMatricule(String matricule_Vehicule) {
        List<com.example.infractionservice.web.soap.InfractionResponseDTO> infractionSoapControllerByMatricule = infractionSoapController.findByMatricule(matricule_Vehicule);
        return infractionSoapControllerByMatricule.stream()
                .map(infractionMapper::fromWebToDto)
                .collect(Collectors.toList());
    }
}
