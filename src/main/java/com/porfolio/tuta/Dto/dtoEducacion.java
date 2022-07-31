package com.porfolio.tuta.Dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class dtoEducacion {

    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    @NotNull
    private String iniEduc;
    @NotNull
    private String finEduc;


    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEdu, String descripcionEdu, String iniEduc, String finEduc) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.iniEduc = iniEduc;
        this.finEduc = finEduc;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getIniEduc() {
        return iniEduc;
    }

    public void setIniEduc(String iniEduc) {
        this.iniEduc = iniEduc;
    }

    public String getFinEduc() {
        return finEduc;
    }

    public void setFinEduc(String finEduc) {
        this.finEduc = finEduc;
    }
}
