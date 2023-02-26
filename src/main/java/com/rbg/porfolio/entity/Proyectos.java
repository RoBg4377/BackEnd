
package com.rbg.porfolio.entity;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyectos {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pro;
    
    @NotNull
    @Size(min = 1, max = 25, message = "no cumple con la longitud")
    private String nombre_pro;
    
    @NotNull
    @Size(min = 1, max = 300, message = "no cumple con la longitud")
    private String descripcion_pro;

    @Temporal(TemporalType.DATE)
    private Date fecha_pro;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String enlace_pro;

       
    
    
}
