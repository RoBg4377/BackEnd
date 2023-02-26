
package com.rbg.porfolio.interfaces;

import com.rbg.porfolio.entity.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    //trae lsita de personas
    public List<Usuario> getUsuario();
    
    //guarda datos de persona
    public void saveUsuario(Usuario persona);
    
    //eliminar persona
    public void deleteUsuario(Long id_pers);
    
    //traer persona
    public Usuario findUsuario(Long id_pers);
}
