
package com.rbg.porfolio.service;

import com.rbg.porfolio.entity.Persona;
import com.rbg.porfolio.interfaces.IPersonaService;
import com.rbg.porfolio.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> pers = ipersonaRepository.findAll();
        return pers;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id_pers) {
        ipersonaRepository.deleteById(id_pers);
    }

    @Override
    public Persona findPersona(Long id_pers) {
        Persona pers = ipersonaRepository.findById(id_pers).orElse(null);
        return pers;
    }
    
    
    
}
