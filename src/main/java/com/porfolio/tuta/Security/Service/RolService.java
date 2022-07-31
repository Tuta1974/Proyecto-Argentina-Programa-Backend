package com.porfolio.tuta.Security.Service;

import com.porfolio.tuta.Security.Entity.Rol;
import com.porfolio.tuta.Security.Enums.RolNombre;
import com.porfolio.tuta.Security.Repository.iRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService  {
    @Autowired
    iRolRepository iRolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        iRolRepository.save(rol);
    }
}
