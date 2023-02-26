
package com.rbg.porfolio.interfaces;

import com.rbg.porfolio.entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //trae lsita de personas
    public List<Persona> getPersona();
    
    //guarda datos de persona
    public void savePersona(Persona persona);
    
    //eliminar persona
    public void deletePersona(Long id_pers);
    
    //traer persona
    public Persona findPersona(Long id_pers);
    
    
    
}
