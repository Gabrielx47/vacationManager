package com.example.vacationManager.controllers;

import com.example.vacationManager.dto.FeriasAprovadaDTO;
import com.example.vacationManager.services.FeriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ferias")
public class FeriasController {
    @Autowired
    private FeriasService feriasService;

    @GetMapping(value="/{id}")
    public ResponseEntity<FeriasAprovadaDTO> findById(@PathVariable Long id) {
        FeriasAprovadaDTO feriasAprovadaDTO = feriasService.findByIdFeriasAprovada(id);
        if(feriasAprovadaDTO != null) {
            return ResponseEntity.ok(feriasAprovadaDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
