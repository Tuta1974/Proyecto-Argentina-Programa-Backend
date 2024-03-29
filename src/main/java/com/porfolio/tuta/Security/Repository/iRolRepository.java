package com.porfolio.tuta.Security.Repository;

import com.porfolio.tuta.Security.Entity.Rol;
import com.porfolio.tuta.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
