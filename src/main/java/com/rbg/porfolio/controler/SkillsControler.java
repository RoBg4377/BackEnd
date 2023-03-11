
package com.rbg.porfolio.controler;

import com.rbg.porfolio.entity.Skills;
import com.rbg.porfolio.interfaces.ISkillsService;
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
@RequestMapping("skills")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsControler {
    @Autowired ISkillsService iskillsService;
    
    @PostMapping("/crear")
    public String saveSkills(@RequestBody Skills skills){
        iskillsService.saveSkills(skills);
        return "skill creada correctamente";
    }
         
    @GetMapping("/traer")
    public List<Skills> getSkills(){
        return iskillsService.getSkills();
    }
    
    @GetMapping("/find/{id_sk}")
    public Skills findSkills(@PathVariable Long id_sk){
        Skills skill = iskillsService.findSkills(id_sk);
        return skill;
    }
    
    @PutMapping("/editar/{id_sk}")
    public String editSkills(
            @PathVariable Long id_sk,
            @RequestBody Skills skill){
        iskillsService.saveSkills(skill);
        return "Skill actualizado con éxito";        
    }
    
    @DeleteMapping("/borrar/{id_sk}")
    public String deleteSkills(@PathVariable Long id_sk){
        iskillsService.deleteSkills(id_sk);
        return "skill eliminado correctamente";
    }
    
}
