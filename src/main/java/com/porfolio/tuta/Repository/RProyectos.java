package com.porfolio.tuta.Repository;

import com.porfolio.tuta.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer> {
    public Optional<Proyectos> findByNombrePro(String NombrePro);
    public boolean existsByNombrePro(String NombrePro);
}
