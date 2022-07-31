package com.porfolio.tuta.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String descripcionEdu;

    private String iniEduc;
    private String finEduc;



    public Educacion() {
    }

    public Educacion(String nombreEdu, String descripcionEdu, String iniEduc, String finEduc) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.iniEduc = iniEduc;
        this.finEduc = finEduc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
