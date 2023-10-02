package com.example.Actividad2Sergio.Applicacion;

import com.example.Actividad2Sergio.Dominio.Coche;
import com.example.Actividad2Sergio.Dominio.CocheRepository;

import java.util.List;

public class ActividadUseCases {

    private CocheRepository cocheRepository;

    public ActividadUseCases(CocheRepository cocheRepository){
        this.cocheRepository = cocheRepository;
    }

    public List<Coche> getAll(){
        return this.cocheRepository.getAll();
    }

    public List<Coche> getMatricula(Coche coche){
        return this.getMatricula(coche);
    }
}
