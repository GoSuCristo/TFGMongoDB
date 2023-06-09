package com.gosucristo.TFG.services;

import com.gosucristo.TFG.entities.Socio;

import java.util.List;
import java.util.Optional;

public interface SocioService {
    List<Socio> obtenerSocios ();
    Optional<Socio> findbyId (String id);
    Socio createSocio (Socio socio);
    void deleteSocio (String id);
}
