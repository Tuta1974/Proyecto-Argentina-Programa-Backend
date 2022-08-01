package com.porfolio.tuta.Controller;

import com.porfolio.tuta.Entity.Persona;
import com.porfolio.tuta.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://porfolio-gustavo-a-romero.firebaseapp.com/")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;

    @GetMapping("personas/traer")
    public List<Persona> getpersona() {
        return ipersonaService.getPersona();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String  createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("img") String nuevoImg)   {
        Persona persona = ipersonaService.findPersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);

        ipersonaService.savePersona(persona);
        return persona;


    }
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long) 1);
    }

}
