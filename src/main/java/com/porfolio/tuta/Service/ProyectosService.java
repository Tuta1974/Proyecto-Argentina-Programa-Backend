package com.porfolio.tuta.Service;

import com.porfolio.tuta.Entity.Proyectos;
import com.porfolio.tuta.Repository.RProyectos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProyectosService {
    @Autowired
    RProyectos rProyectos;

    public List<Proyectos> list() { return rProyectos.findAll();}


     public Optional<Proyectos> getOne (int id){return rProyectos.findById(id); }
    public Optional<Proyectos> getByNombrePro(String nombrePro){return rProyectos.findByNombrePro(nombrePro);}

    public void save(Proyectos pro){rProyectos.save(pro);}

    public void delete(int id) {rProyectos.deleteById(id);}

    public boolean existsById(int id) {return rProyectos.existsById(id);}

    public boolean existsByNombrePro(String nombrePro){ return rProyectos.existsByNombrePro(nombrePro);}


}
