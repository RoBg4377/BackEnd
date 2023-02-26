
package com.rbg.porfolio.interfaces;

import com.rbg.porfolio.entity.Skills;
import java.util.List;


public interface ISkillsService {
    
    //trae lsita de Skills
    public List<Skills> getSkills();
    
    //guarda datos de Skills
    public void saveSkills(Skills persona);
    
    //eliminar skills
    public void deleteSkills(Long id_pers);
    
    //traer un Skill
    public Skills findSkills(Long id_pers); 
}
