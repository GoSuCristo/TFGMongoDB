package com.gosucristo.TFG.services;

import com.gosucristo.TFG.entities.Socio;
import com.gosucristo.TFG.repository.ISocioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class SocioServiceImp implements SocioService{
    @Autowired
    private ISocioRepository socioRepository;

    @Override
    public List<Socio> obtenerSocios() { return socioRepository.findAll(); }
    @Override
    public Optional<Socio> findbyId(String id) {
        return socioRepository.findById(id);
    }
    @Override
    public Socio createSocio(Socio socio) {
        return socioRepository.save(socio);
    }
    @Override
    public void deleteSocio(String id) {
        socioRepository.deleteById(id);
    }

}
