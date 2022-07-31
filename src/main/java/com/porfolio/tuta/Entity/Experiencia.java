package com.porfolio.tuta.Entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String iniExp;
    private String finExp;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String iniExp, String finExp) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.iniExp = iniExp;
        this.finExp = finExp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


