
package com.rbg.porfolio.controler;


import com.rbg.porfolio.entity.Educacion;
import com.rbg.porfolio.interfaces.IEducacionService;
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
@RequestMapping("educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionControler {
    @Autowired IEducacionService ieducacioneService;
    
    @PostMapping("/crear")
    public String saveEducacion(@RequestBody Educacion educacion){
        ieducacioneService.saveEducacion(educacion);
        return "educacion creada correctamente";
    }
         
    @GetMapping("/traer")
    public List<Educacion> getEducacion(){
        return ieducacioneService.getEducacion();
    }
    
    @GetMapping("/find/{id_edu}")
    public Educacion findEducacion(@PathVariable Long id_edu){
        Educacion edu = ieducacioneService.findEducacion(id_edu);
        return edu;
    }
    
    @PutMapping("/editar/{id_edu}")
    public String editEducacion(
            @PathVariable Long id_edu,
            @RequestBody Educacion edu){
        ieducacioneService.saveEducacion(edu);
        return "Educacion actualizada con éxito";        
    }
    
    @DeleteMapping("/borrar/{id_edu}")
    public String deleteEducacion(@PathVariable Long id_edu){
        ieducacioneService.deleteEducacion(id_edu);
        return "educacion eliminada correctamente";
    }
  
}
