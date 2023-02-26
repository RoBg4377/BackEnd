
package com.rbg.porfolio.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sk;
    
    @NotNull
    @Size(min = 1, max = 25, message = "no cumple con la longitud")
    private String nom_skill;
    
    @NotNull
    private int porcentaje;
    
    @NotNull
    @Size(min = 1, max = 150, message = "no cumple con la longitud")
    private String logo_skills;
}
