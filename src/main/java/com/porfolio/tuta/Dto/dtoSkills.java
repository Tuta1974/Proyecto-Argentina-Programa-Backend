package com.porfolio.tuta.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {
    @NotBlank
    private String skillNombre;
    @NotBlank
    private String fotoSkill;
    @NotBlank
    private int porcentajeSkill;

    public dtoSkills() {
    }

    public dtoSkills(String skillNombre, String fotoSkill, int porcentajeSkill) {
        this.skillNombre = skillNombre;
        this.fotoSkill = fotoSkill;
        this.porcentajeSkill = porcentajeSkill;
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
