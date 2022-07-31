package com.porfolio.tuta.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String skillNombre;
    private String fotoSkill;
    private int porcentajeSkill;

    public Skills() {
    }

    public Skills(String skillNombre, String fotoSkill, int porcentajeSkill) {
        this.skillNombre = skillNombre;
        this.fotoSkill = fotoSkill;
        this.porcentajeSkill = porcentajeSkill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillNombre() {
        return skillNombre;
    }

    public void setSkillNombre(String skillNombre) {
        this.skillNombre = skillNombre;
    }

    public String getFotoSkill() {
        return fotoSkill;
    }

    public void setFotoSkill(String fotoSkill) {
        this.fotoSkill = fotoSkill;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }
}
