package com.example.Actividad2Sergio.Dominio;

import java.util.List;

public interface CocheRepository {

    public List<Coche> getAll();
    public List<Coche> getMatricula(Coche matricula);
}
