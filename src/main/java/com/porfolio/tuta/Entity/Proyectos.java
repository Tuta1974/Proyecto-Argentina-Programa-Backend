package com.porfolio.tuta.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePro;
    private String descripPro;
    private String fotoPro;

    public Proyectos() {
    }

    public Proyectos(String nombrePro, String descripPro, String fotoPro) {
        this.nombrePro = nombrePro;
        this.descripPro = descripPro;
        this.fotoPro = fotoPro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripPro() {
        return descripPro;
    }

    public void setDescripPro(String descripPro) {
        this.descripPro = descripPro;
    }

    public String getFotoPro() {
        return fotoPro;
    }

    public void setFotoPro(String fotoPro) {
        this.fotoPro = fotoPro;
    }
}
