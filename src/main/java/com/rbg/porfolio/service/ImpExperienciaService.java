package com.rbg.porfolio.service;

import com.rbg.porfolio.entity.Experiencia;
import com.rbg.porfolio.interfaces.IExperienciaService;
import com.rbg.porfolio.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService{
    @Autowired IExperienciaRepository iexperienciaRepository;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> exp = iexperienciaRepository.findAll();
        return exp;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id_exp) {
        iexperienciaRepository.deleteById(id_exp);
    }

    @Override
    public Experiencia findExperiencia(Long id_exp) {
        Experiencia exp = iexperienciaRepository.findById(id_exp).orElse(null);
        return exp;
    }
    
}
