/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Objects;

/**
 *
 * @author dam132
 */
public class Persona {
    
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private int altura;

    public Persona( String nombre ) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String dni, String direccion, String telefono, int altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.altura = altura;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setDni( String dni ) {
        this.dni = dni;
    }
    
    public void setDireccion( String direccion ) {
        this.direccion = direccion;
    }
    
    public void setTelefono( String telefono ) {
        this.telefono = telefono;
    }
    
    public int getAltura() {
        return altura;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Direccion: " + direccion +
               ", Telefono: " + telefono + ", Altura: " + altura;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        final Persona other = ( Persona ) obj;
        if ( !Objects.equals( this.dni, other.dni ) ) {
            return false;
        }
        return true;
    }
    
    
}
