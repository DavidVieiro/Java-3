/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.OrdenarPersonaAltura;
import clases.Persona;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dam132
 */
public class aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        
        listaPersonas.add( new Persona("Jorge", "12345678A","Calle alguna","981000000", 212 ) );
        listaPersonas.add( new Persona("Pepe", "12345678B","Calle alguna","981000001", 165 ) );
        listaPersonas.add( new Persona("Juan", "12345678C","Calle alguna","981000002", 178 ) );
        listaPersonas.add( new Persona("Ana", "12345678D","Calle alguna","981000003", 167 ) );
        
        Collections.sort(listaPersonas, new OrdenarPersonaAltura());
        System.out.println("Lista ordenada por orden altura (De menor a mayor):");
        
        for (Persona i : listaPersonas) {
            System.out.println( i.toString() );
        }
        
    }
    
}
