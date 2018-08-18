/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alejandro Avellaneda
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private TipoCliente numeroDeCliente;

    public Cliente(String nombre, String apellido, int dni, TipoCliente numeroDeCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public TipoCliente getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(TipoCliente numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }
    
    
    
}
