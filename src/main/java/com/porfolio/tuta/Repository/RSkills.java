package com.porfolio.tuta.Repository;

import com.porfolio.tuta.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer> {
    public Optional<Skills> findBySkillNombre (String skillNombre);
    public boolean existsBySkillNombre(String skillNombre);
}
