
package com.rbg.porfolio.service;

import com.rbg.porfolio.entity.Usuario;
import com.rbg.porfolio.interfaces.IUsuarioService;
import com.rbg.porfolio.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUsuarioService implements IUsuarioService{
    @Autowired IUsuarioRepository iusuarioRepository;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> pers = iusuarioRepository.findAll();
        return pers;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        iusuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        iusuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario pers = iusuarioRepository.findById(id).orElse(null);
        return pers;
    }
    
    
    
}
