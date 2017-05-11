/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

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
        }
        
        return dato;
    }
    
    public void borrarClave( String clave ) {
        
        Persona dato = obtener( clave );
        
        if ( dato != null ) {
            lista.remove( clave );
            System.out.println("Se ha borrado el campo con la clave " + clave);
        }
        else {
            System.out.println("El campo que buscas no existe...");
        }
    }
    
    public void borrarLista() {
        
        lista.clear();
        System.out.println("La lista se ha borrado correctamente.");
        
    }
    
    public Object[] listaClaves() {
        
        Set conjunto = lista.keySet();
        
        return conjunto.toArray();
    }
    
    public void mostrarClaveValor() {
        System.out.println( lista.entrySet().toString() );
    }
    
    public void pruebaModificar( String dni, String nombre, String calle, String telefono ) {
        lista.remove( dni );
        Persona p = new Persona( nombre, dni, calle, telefono);
        lista.put( dni, p );
    }
    
    public void listarOtraForma() {
        
        TreeMap orden = new TreeMap(lista);
        
        Collection valores = orden.values();
        
        Iterator it = valores.iterator();
        
        while ( it.hasNext() ) {
            Persona objeto = (Persona)it.next();
            System.out.println( objeto.toString() );
        }
        
    }
    
    
}
