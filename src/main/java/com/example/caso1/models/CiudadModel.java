package com.example.caso1.models;

import jakarta.persistence.*;

@Entity
@Table(name="ciudad")
public class CiudadModel {
@Id
    private  int idCiudad ;

@OneToOne(mappedBy = "ciudadModel", cascade = CascadeType.ALL)
private  ClienteModel cliente;

   private String nombreCiudad ;

}
