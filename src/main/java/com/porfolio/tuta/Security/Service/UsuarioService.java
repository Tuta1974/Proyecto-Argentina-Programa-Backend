package com.porfolio.tuta.Security.Service;

import com.porfolio.tuta.Security.Entity.Usuario;
import com.porfolio.tuta.Security.Repository.iUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
}
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
}

    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);

    }

    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }


}
