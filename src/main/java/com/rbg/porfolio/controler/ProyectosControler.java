package com.rbg.porfolio.controler;

import com.rbg.porfolio.entity.Proyectos;
import com.rbg.porfolio.interfaces.IProyectosSevice;
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
@RequestMapping("proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosControler {
    @Autowired IProyectosSevice iproyectosService;
    
    @PostMapping("/crear")
    public String saveProyectos(@RequestBody Proyectos pro){
        iproyectosService.saveProyectos(pro);
        return "proyecto creado correctamente";
    }
         
    @GetMapping("/traer")
    public List<Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    
    @GetMapping("/find/{id_pro}")
    public Proyectos findProyectos(@PathVariable Long id_pro){
        Proyectos pro = iproyectosService.findProyectos(id_pro);
        return pro;
    }
    
    @PutMapping("/editar")
    public String editProyectos(@RequestBody Proyectos pro){
        iproyectosService.saveProyectos(pro);
        return "Proyecto actualizado con éxito";        
    }
    
    @DeleteMapping("/borrar/{id_pro}")
    public String deleteProyectos(@PathVariable Long id_pro){
        iproyectosService.deleteProyectos(id_pro);
        return "proyecto eliminado correctamente";
    }
    
}
