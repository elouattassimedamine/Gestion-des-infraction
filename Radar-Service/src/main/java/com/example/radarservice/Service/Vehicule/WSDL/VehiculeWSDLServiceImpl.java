package com.example.radarservice.Service.Vehicule.WSDL;

import com.example.immatriculationservice.web.soap.VehiculeSoapController;
import com.example.radarservice.Mapper.VehiculeMapper;
import com.example.radarservice.Model.VehiculeRequestDTO;
import com.example.radarservice.Model.VehiculeResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
@Service
@Transactional
public class VehiculeWSDLServiceImpl implements VehiculeWSDLService {

    private VehiculeSoapController vehiculeSoapController;
    private VehiculeMapper vehiculeMapper;

    public VehiculeWSDLServiceImpl(VehiculeSoapController vehiculeSoapController, VehiculeMapper vehiculeMapper) {
        this.vehiculeSoapController = vehiculeSoapController;
        this.vehiculeMapper = vehiculeMapper;
    }

    @Override
    public VehiculeResponseDTO save(VehiculeRequestDTO vehiculeRequestDTO) {
        com.example.immatriculationservice.web.soap.VehiculeRequestDTO vehiculeRequestDTO_Web = vehiculeMapper.fromModelToWeb(vehiculeRequestDTO);
        com.example.immatriculationservice.web.soap.VehiculeResponseDTO vehiculeResponseDTO = vehiculeSoapController.save(vehiculeRequestDTO_Web);
        VehiculeResponseDTO responseDTO = vehiculeMapper.fromWebToModel(vehiculeResponseDTO);
        return responseDTO;
    }

    @Override
    public VehiculeResponseDTO update(VehiculeRequestDTO vehiculeRequestDTO) {
        com.example.immatriculationservice.web.soap.VehiculeRequestDTO vehiculeRequestDTO_Web = vehiculeMapper.fromModelToWeb(vehiculeRequestDTO);
        com.example.immatriculationservice.web.soap.VehiculeResponseDTO vehiculeResponseDTO = vehiculeSoapController.update(vehiculeRequestDTO_Web);
        VehiculeResponseDTO responseDTO = vehiculeMapper.fromWebToModel(vehiculeResponseDTO);
        return responseDTO;
    }

    @Override
    public VehiculeResponseDTO findById(Long id) {
        com.example.immatriculationservice.web.soap.VehiculeResponseDTO vehiculeResponseDTO = vehiculeSoapController.findById(id);
        VehiculeResponseDTO responseDTO = vehiculeMapper.fromWebToModel(vehiculeResponseDTO);
        return responseDTO;
    }

    @Override
    public List<VehiculeResponseDTO> findAll() {
        List<com.example.immatriculationservice.web.soap.VehiculeResponseDTO> vehiculeSoapControllerAll = vehiculeSoapController.findAll();
        return vehiculeSoapControllerAll.stream()
                .map(vehiculeMapper::fromWebToModel)
                .collect(Collectors.toList());
    }

    @Override
    public VehiculeResponseDTO findByMatricule(String matricule) {
        com.example.immatriculationservice.web.soap.VehiculeResponseDTO vehiculeResponseDTO = vehiculeSoapController.findByMatricule(matricule);
        VehiculeResponseDTO responseDTO = vehiculeMapper.fromWebToModel(vehiculeResponseDTO);
        return responseDTO;
    }
}
