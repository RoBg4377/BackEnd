
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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_edu;
    @NotNull
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String academia;
    @NotNull
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String curso;
    
    @NotNull
    private String temas;
    
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @NotNull
    @Size(min = 1, max = 150, message = "no cumple con la longitud")
    private String enlace;

    
    
    
    
}
