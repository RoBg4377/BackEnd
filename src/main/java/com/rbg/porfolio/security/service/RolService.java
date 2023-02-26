package com.rbg.porfolio.security.service;

import com.rbg.porfolio.security.entity.Rol;
import com.rbg.porfolio.security.enums.RolNombre;
import com.rbg.porfolio.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {

    @Autowired RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }
}
