/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author dam132
 */
public class ListaPersonas {
    
    private HashMap lista = new <Persona> HashMap();
    
    public void añadir( Persona p ) {
        
        String clave = p.getDni();
        lista.put( clave, p );
        
    }
    
    public void listaPeronas1() {
        
        Persona[]datos = this.obtenerTabla();
        
        for ( Persona i : datos ) {
            System.out.println( i.toString() );
        }
        
    }
    
    private Persona[] obtenerTabla() {
        
        Collection valores =  this.lista.values();
        Persona[] tabla = new Persona[0];
        tabla = ( Persona[] ) valores.toArray( tabla );
        
        return tabla;
    }
    
    public Persona obtener( String clave ) {
        
        Persona dato = null;
        
        if ( lista.containsKey( clave ) ) {
            dato = (Persona) lista.get( clave );
            System.out.println( dato.toString() );
        }
        else {
            System.out.println("No se encuentra lo que buscas...");
        }
        
        return dato;
    }
}
