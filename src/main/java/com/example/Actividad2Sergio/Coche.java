package com.example.Actividad2Sergio;

public class Coche {

    private String Matricula,Marca,Modelo;
    private Integer Km;

    public Coche(String matricula, String marca, String modelo, Integer km) {
        this.Matricula = matricula;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Km = km;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public Integer getKm() {
        return Km;
    }

    public void setKm(Integer km) {
        Km = km;
    }
}

