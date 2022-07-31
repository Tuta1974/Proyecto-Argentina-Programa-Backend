package com.porfolio.tuta.Service;

import com.porfolio.tuta.Entity.Experiencia;
import com.porfolio.tuta.Entity.Skills;
import com.porfolio.tuta.Repository.RSkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SkillService {
    @Autowired
    RSkills rSkills;

    public List<Skills> list(){
        return rSkills.findAll();
    }

    public Optional<Skills> getOne(int id){
        return rSkills.findById(id);
    }

    public Optional<Skills> getByNombreSkillNombre(String skillNombre){
        return rSkills.findBySkillNombre(skillNombre);
    }

    public void save(Skills skill){
        rSkills.save(skill);
    }

    public void delete(int id){
        rSkills.deleteById(id);
    }

    public boolean existsById(int id){
        return rSkills.existsById(id);
    }

    public boolean existsBySkillNombre(String nombreSkill){
        return rSkills.existsBySkillNombre(nombreSkill);
    }

}
