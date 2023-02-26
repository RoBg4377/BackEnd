
package com.rbg.porfolio.interfaces;

import com.rbg.porfolio.entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> getEducacion();
    
    public void saveEducacion(Educacion educacion);
    
    public void deleteEducacion(Long id_edu);
    
    public Educacion findEducacion(Long id_edu);
    
}
