
package com.rbg.porfolio.controler;



import com.rbg.porfolio.entity.Usuario;
import com.rbg.porfolio.interfaces.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
@CrossOrigin(origins = "http://localhost4200")
public class UsuarioControler {
    @Autowired IUsuarioService iusuarioService;
    
    @PostMapping("/crear")
    public String saveUsuario(@RequestBody Usuario usuario){
        iusuarioService.saveUsuario(usuario);
        return "usuario creada correctamente";
    }
         
    @GetMapping("/traer")
    public List<Usuario> getUsuario(){
        return iusuarioService.getUsuario();
    }
    
    @GetMapping("/find/{id}")
    public Usuario findUsuario(@PathVariable Long id){
        Usuario pers = iusuarioService.findUsuario(id);
        return pers;
    }
    
    @PutMapping("/editar")
    public String editUsuario(@RequestBody Usuario usu){
        iusuarioService.saveUsuario(usu);
        return "Usuario actualizado con éxito";        
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteUsuario(@PathVariable Long id){
        iusuarioService.deleteUsuario(id);
        return "usuario eliminado correctamente";
    }
    
    
}
