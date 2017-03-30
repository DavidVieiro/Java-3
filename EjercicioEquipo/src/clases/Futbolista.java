/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author dam132
 */
public class Futbolista {
    
    private int dorsal;
    private String Nombre;
    private Demarcacion demarcacion;
    private Equipo equipo;

    public Futbolista() {
    }
    
    public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo) {
        this.dorsal = dorsal;
        Nombre = nombre;
        this.demarcacion = demarcacion;
        this.equipo = equipo;
    }
    
    // Metodos getter y setter
    @Override
    public String toString() {
        return this.dorsal + " - " + this.Nombre + " - "
             + this.demarcacion.name() + " - " + this.equipo.getNombreClub();
    }
}
