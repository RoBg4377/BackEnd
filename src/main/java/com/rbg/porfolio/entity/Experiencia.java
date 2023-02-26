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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exp;
    
    @NotNull
    @Size(min = 1, max = 25, message = "no cumple con la longitud")
    private String compania;
    
    @NotNull
    @Size(min = 1, max = 25, message = "no cumple con la longitud")
    private String puesto;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String tarea;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String img;
    
    @Temporal(TemporalType.DATE)
    private Date fechaIni;
    
    @Temporal(TemporalType.DATE)
    private Date fechaFin; 
    
}
