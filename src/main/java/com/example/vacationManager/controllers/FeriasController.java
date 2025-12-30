package com.example.vacationManager.controllers;

import com.example.vacationManager.dto.FeriasAprovadaDTO;
import com.example.vacationManager.dto.RequestVacationDTO;
import com.example.vacationManager.entities.Ferias;
import com.example.vacationManager.entities.Pagamento;
import com.example.vacationManager.entities.Servidor;
import com.example.vacationManager.services.FeriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

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

    @PostMapping
    public ResponseEntity<Void> requestVacation(@RequestBody RequestVacationDTO solicitation, UriComponentsBuilder uriComponentsBuilder) {
        Ferias ferias = new Ferias(null, solicitation.getInicio(), solicitation.getFim(), solicitation.getStatus(), new Servidor(solicitation.getServidorId()));
        Long feriasId = feriasService.createNewFerias(ferias);
        URI newFeriasPath = uriComponentsBuilder.path("/ferias/{id}").buildAndExpand(feriasId).toUri();
        return ResponseEntity.created(newFeriasPath).build();
    }
}
