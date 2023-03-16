package com.rbg.porfolio.controler;

import com.rbg.porfolio.entity.Experiencia;
import com.rbg.porfolio.interfaces.IExperienciaService;
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
@RequestMapping("experiencia")
@CrossOrigin(origins = "https://portfolio-rbg.web.app/")
public class ExperienciaControler {
    @Autowired IExperienciaService iexperienciaService;
    
    @PostMapping("/crear")
    public String saveExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "experiencia creada correctamente";
    }
         
    @GetMapping("/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @GetMapping("/find/{id_exp}")
    public Experiencia findExperiencia(@PathVariable Long id_exp){
        Experiencia exp = iexperienciaService.findExperiencia(id_exp);
        return exp;
    }
    
    @PutMapping("/editar/{id_exp}")
    public String editExperiencia(
            @PathVariable Long id_exp,
            @RequestBody Experiencia exp){
        iexperienciaService.saveExperiencia(exp);
        return "Experiencia actualizada con éxito";        
    }
    
    @DeleteMapping("/borrar/{id_exp}")
    public String deleteExperiencia(@PathVariable Long id_exp){
        iexperienciaService.deleteExperiencia(id_exp);
        return "experiencia eliminada correctamente";
    }
    
}
