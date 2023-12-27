package com.example.caso1.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="cliente")

public class ClienteModel {

    @Id
    private   int numerodoc ;
    private  String  nombre;
    private  String  apeliido;
    private String fechanacimiento;



    @OneToOne ( cascade = CascadeType.ALL,optional = false)
    @JoinColumn (name = "idCiudad")
    private  CiudadModel ciudadModel;

    private  String  email;
    private int telefono;
    private String ocupacion;


    public int getNumerodoc() {
        return numerodoc;
    }

    public void setNumerodoc(int numerodoc) {
        this.numerodoc = numerodoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}


