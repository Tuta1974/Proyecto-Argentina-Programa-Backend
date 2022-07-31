package com.porfolio.tuta.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String iniExp;
    @NotBlank
    private String finExp;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String iniExp, String finExp) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.iniExp = iniExp;
        this.finExp = finExp;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getIniExp() {
        return iniExp;
    }

    public void setIniExp(String iniExp) {
        this.iniExp = iniExp;
    }

    public String getFinExp() {
        return finExp;
    }

    public void setFinExp(String finExp) {
        this.finExp = finExp;
    }
}