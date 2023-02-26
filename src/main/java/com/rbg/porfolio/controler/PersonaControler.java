
package com.rbg.porfolio.controler;

import com.rbg.porfolio.entity.Persona;
import com.rbg.porfolio.interfaces.IPersonaService;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaControler {
    @Autowired IPersonaService ipersonaService;
    
    @PostMapping("/crear")
    public String savePersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "persona creada correctamente";
    }
         
    @GetMapping("/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @GetMapping("/find/{id_pers}")
    public Persona findPersona(@PathVariable Long id_pers){
        Persona pers = ipersonaService.findPersona(id_pers);
        return pers;
    }
    
    @PutMapping("/editar")
    public String editPersona(@RequestBody Persona pers){
        ipersonaService.savePersona(pers);
        return "Persona actualizada con éxito";        
    }
    
    @DeleteMapping("/borrar/{id_pers}")
    public String deletePersona(@PathVariable Long id_pers){
        ipersonaService.deletePersona(id_pers);
        return "persona eliminada correctamente";
    }
    
}
