package com.example.vacationManager.services;

import com.example.vacationManager.dto.FeriasAprovadaDTO;
import com.example.vacationManager.entities.Ferias;
import com.example.vacationManager.projections.FeriasAprovadaProjection;
import com.example.vacationManager.repositories.FeriasRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeriasService {
    @Autowired
    private FeriasRespository feriasRepository;

    public FeriasAprovadaDTO findByIdFeriasAprovada(Long id){
        FeriasAprovadaProjection result = feriasRepository.findByIdFeriasAprovada(id);
        if(result == null) {
            return null;
        } else {
            return new FeriasAprovadaDTO(result);
        }
    }

    public Long createNewFerias(Ferias entity) {
        return feriasRepository.save(entity).getId();
    }
};
