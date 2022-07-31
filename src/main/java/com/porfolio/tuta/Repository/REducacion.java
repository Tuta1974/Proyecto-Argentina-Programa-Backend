package com.porfolio.tuta.Repository;

import com.porfolio.tuta.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {
    public Optional<Educacion> findByNombreEdu(String nombreEdu );
    public boolean existsByNombreEdu(String nombreEdu);
}
