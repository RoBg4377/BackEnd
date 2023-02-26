
package com.rbg.porfolio.service;

import com.rbg.porfolio.entity.Educacion;
import com.rbg.porfolio.interfaces.IEducacionService;
import com.rbg.porfolio.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements IEducacionService{
    @Autowired IEducacionRepository ieducacionRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionRepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id_edu) {
        ieducacionRepository.deleteById(id_edu);
    }

    @Override
    public Educacion findEducacion(Long id_edu) {
        Educacion edu = ieducacionRepository.findById(id_edu).orElse(null);
        return edu;
    }
    
}
