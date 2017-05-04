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
    
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Persona> agenda;

    @SuppressWarnings("Convert2Diamond")
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
    
    public String buscarIndice ( int index ) {
        
        String cadena;
        
        if ( agenda.isEmpty() ) {
            cadena = "La agenda esta vacia.";
        }
        else if ( index >= 0 && index < agenda.size() ) {
            cadena =  agenda.get( index ).toString();
        } else {
            cadena = "EL indice no es valido.";
        }
        
        return cadena;
    }
    
    public boolean comprobarExiste( Persona persona ) {
        
        ListIterator<Persona> iterador = agenda.listIterator();
        Persona temp;
        
        if ( agenda.isEmpty() ) {
            return false;
        }
        else {
            while ( iterador.hasNext() ) {
                temp = iterador.next();
                if ( temp.getNombre().equalsIgnoreCase( persona.getNombre() )) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    public void addPersona( Persona persona ) {
        
        if ( !comprobarExiste( persona ) ) {
            agenda.add( persona );
        }
        else {
            System.out.println("No se puede añadir, ya existe.");
        }
        
    }
    
    public boolean deletePersona( Persona persona ) {
        
        boolean correcto = false;
        
        ListIterator<Persona> iterList = agenda.listIterator();
        Persona temp;
        
        while ( iterList.hasNext() && !correcto ) {
            temp =  iterList.next();
            if ( temp.getNombre().equalsIgnoreCase( persona.getNombre() ) ) {
                agenda.remove( agenda.indexOf( temp ) );
                correcto = true;
            }
        }
        
        return correcto;
    }
    
    public void modTelefono( Persona persona, String telefono ) {
        
        //int i;
        
        if ( comprobarExiste( persona ) ) {
            persona.setTelefono( telefono );
        }
        else {
            System.out.println("La persona que estas buscando no existe.");
        }
        
    }
    
}
