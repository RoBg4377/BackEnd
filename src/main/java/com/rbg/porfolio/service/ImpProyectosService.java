package com.rbg.porfolio.service;


import com.rbg.porfolio.entity.Proyectos;
import com.rbg.porfolio.interfaces.IProyectosSevice;
import com.rbg.porfolio.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectosService implements IProyectosSevice{
    @Autowired IProyectosRepository iproyectosRepository;

    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> pro = iproyectosRepository.findAll();
        return pro;
    }

    @Override
    public void saveProyectos(Proyectos pro) {
        iproyectosRepository.save(pro);
    }

    @Override
    public void deleteProyectos(Long id_pro) {
        iproyectosRepository.deleteById(id_pro);
    }

    @Override
    public Proyectos findProyectos(Long id_pro) {
        Proyectos pro = iproyectosRepository.findById(id_pro).orElse(null);
        return pro;
    }
    
}
