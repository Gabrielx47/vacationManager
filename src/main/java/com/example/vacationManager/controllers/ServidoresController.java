package com.example.vacationManager.controllers;

import com.example.vacationManager.dto.ServidorFeriasDTO;
import com.example.vacationManager.services.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/servidores")
public class ServidoresController {
    @Autowired
    ServidorService servidorService;

    @GetMapping("/{id}/ferias")
    public ResponseEntity<List<ServidorFeriasDTO>> findAllServidorFerias(@PathVariable Long id) {
        List<ServidorFeriasDTO> result = servidorService.findAllServidorFerias(id);
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
}
