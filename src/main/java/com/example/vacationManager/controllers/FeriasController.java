package com.example.vacationManager.controllers;

import com.example.vacationManager.dto.FeriasDTO;
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
    public ResponseEntity<FeriasDTO> findById(@PathVariable Long id) {
        FeriasDTO feriasDTO = feriasService.findById(id);
        if(feriasDTO != null) {
            return ResponseEntity.ok(feriasDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
