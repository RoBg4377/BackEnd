package com.rbg.porfolio.interfaces;

import com.rbg.porfolio.entity.Proyectos;
import java.util.List;

public interface IProyectosSevice {
    
    //trae lsita de proyectos
    public List<Proyectos> getProyectos();
    
    //guarda datos de proyectos
    public void saveProyectos(Proyectos proyecto);
    
    //eliminar proyectos
    public void deleteProyectos(Long id_pro);
    
    //traer proyectos
    public Proyectos findProyectos(Long id_pro);
}
