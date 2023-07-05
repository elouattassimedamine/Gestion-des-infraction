package com.example.radarservice.Service;

import com.example.radarservice.Entity.Coordonnee;
import com.example.radarservice.Mapper.CoordonneeMapper;
import com.example.radarservice.Repository.CoordoneeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoordonneeServiceImpl implements CoordonneeService {

    private CoordonneeMapper coordonneeMapper;
    private CoordoneeRepository coordoneeRepository;

    public CoordonneeServiceImpl(CoordonneeMapper coordonneeMapper, CoordoneeRepository coordoneeRepository) {
        this.coordonneeMapper = coordonneeMapper;
        this.coordoneeRepository = coordoneeRepository;
    }

    @Override
    public Coordonnee save(Coordonnee coordonnee) {
        return coordoneeRepository.save(coordonnee);
    }

    @Override
    public Coordonnee update(Coordonnee coordonnee) {
        return coordoneeRepository.save(coordonnee);
    }

    @Override
    public Coordonnee findById(Long id) {
        return coordoneeRepository.findById(id).orElse(null);
    }

}
