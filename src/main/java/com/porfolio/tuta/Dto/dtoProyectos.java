package com.porfolio.tuta.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyectos {

    @NotBlank
    private String nombrePro;
    @NotBlank
    private String descripPro;
    @NotBlank
    private String fotoPro;

    public dtoProyectos() {
     }

    public dtoProyectos(String nombrePro, String descripPro, String fotoPro) {
        this.nombrePro = nombrePro;
        this.descripPro = descripPro;
        this.fotoPro = fotoPro;
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
