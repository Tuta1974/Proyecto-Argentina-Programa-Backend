package com.porfolio.tuta.Controller;


import com.porfolio.tuta.Dto.dtoSkills;
import com.porfolio.tuta.Entity.Skills;
import com.porfolio.tuta.Security.Controller.Mensaje;
import com.porfolio.tuta.Service.SkillService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
@CrossOrigin(origins = "https://porfolio-gustavo-a-romero.firebaseapp.com/")
public class CSkills {
    @Autowired
    SkillService skillService;

    @GetMapping("/lista")
    public ResponseEntity<List<Skills>> list(){
        List<Skills> list = skillService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Skills> getById(@PathVariable("id") int id){
        if(!skillService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Skills skills = skillService.getOne(id).get();
        return new ResponseEntity(skills, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id ) {
        if (!skillService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        skillService.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkills dtoskills){
        if(StringUtils.isBlank(dtoskills.getSkillNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(skillService.existsBySkillNombre (dtoskills.getSkillNombre()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);

        Skills skills = new Skills(dtoskills.getSkillNombre(), dtoskills.getFotoSkill(),dtoskills.getPorcentajeSkill());
        skillService.save(skills);

        return new ResponseEntity(new Mensaje("Skill agregado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkills dtoskills){

        if(!skillService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);

        if(skillService.existsBySkillNombre(dtoskills.getSkillNombre()) && skillService.getByNombreSkillNombre(dtoskills.getSkillNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ese skill ya existe"), HttpStatus.BAD_REQUEST);

        if(StringUtils.isBlank(dtoskills.getSkillNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        Skills skills = skillService.getOne(id).get();
        skills.setSkillNombre(dtoskills.getSkillNombre());
        skills.setFotoSkill((dtoskills.getFotoSkill()));
        skills.setPorcentajeSkill((dtoskills.getPorcentajeSkill()));

        skillService.save(skills);
        return new ResponseEntity(new Mensaje("Skill actualizado"), HttpStatus.OK);

    }

}
