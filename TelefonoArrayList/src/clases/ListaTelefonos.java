/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author dam132
 */
public class ListaTelefonos {
    
    private ArrayList<Persona> agenda;

    public ListaTelefonos() {
        agenda = new ArrayList<Persona>();
    }

    public void setAgenda(Persona persona) {
        agenda.add( persona );
    }
    
    public void listar() {
        
        if ( agenda.isEmpty() ) {
            System.out.println("La agenda esta vacia...");
        }
        else {
            System.out.println("Agenda: ");
            for (Persona agenda1 : agenda) {
                System.out.println( agenda1.toString() +  ", Posicion: " + agenda.indexOf( agenda1 ));
            }
        }
    }
    
    public void numPersonas() {
        
        System.out.println( "Existen "  + agenda.size() + " personas en la lista." );
        
    }
    
    
    public String buscarNombre( String nombre ) {
        
        String cadena = "No se ha encontrado el nombre ( " + nombre + " )";
        
        ListIterator<Persona> iterador = agenda.listIterator();
        Persona temp;
        
        if ( agenda.isEmpty() ) {
            cadena = "La agenda esta vacia...";
        }
        else {
            while ( iterador.hasNext() ) {
                
                temp = iterador.next();
                if ( nombre.equalsIgnoreCase( temp.getNombre() )) {
                    cadena = temp.toString();
                }
                
            }
        }
        
        return cadena;
    }
    
    
    
}
