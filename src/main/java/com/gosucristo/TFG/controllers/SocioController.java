package com.gosucristo.TFG.controllers;

import com.gosucristo.TFG.entities.Socio;
import com.gosucristo.TFG.services.SocioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/socio")
@AllArgsConstructor
public class SocioController {
    @Autowired
    private SocioService SocioService;

    @GetMapping
    public List<Socio> obtenerMiembros() {
        return SocioService.obtenerSocios();
    }

    @PostMapping
    public Socio createSocio(@RequestBody Socio socio) {
        return SocioService.createSocio(socio);
    }


}
