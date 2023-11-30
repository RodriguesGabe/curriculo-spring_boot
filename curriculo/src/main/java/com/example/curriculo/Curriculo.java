package org.example.curriculo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import lombok.getters;
import lombok.setters;

@getters
@setters
@Entity
public class Curriculo {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String formacao;
    private String experiencia;
 
    // getters e setters
 
    // construtores
}