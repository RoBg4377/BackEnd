package com.rbg.porfolio.interfaces;

import com.rbg.porfolio.entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    //trae lista experiencias
    public List<Experiencia> getExperiencia();
    
    //guarda datos de experiencias
    public void saveExperiencia(Experiencia experiencia);
    
    //eliminar experiencias
    public void deleteExperiencia(Long id_exp);
    
    //traer experiencias
    public Experiencia findExperiencia(Long id_exp);
}
