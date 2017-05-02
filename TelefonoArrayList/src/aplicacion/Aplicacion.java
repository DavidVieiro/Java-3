/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.ListaTelefonos;
import clases.Persona;

/**
 *
 * @author dam132
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaTelefonos agenda = new ListaTelefonos();
        
        Persona per1 = new Persona("Jorge", "12345678A","Calle alguna","981000000");
        Persona per2 = new Persona("Pepe", "12345678B","Calle alguna","981000001");
        Persona per3 = new Persona("Juan", "12345678C","Calle alguna","981000002");
        Persona per4 = new Persona("Ana", "12345678D","Calle alguna","981000003");
        
        agenda.setAgenda( per1 );
        agenda.setAgenda( per2 );
        agenda.setAgenda( per3 );
        agenda.setAgenda( per4 );
        
        agenda.listar();
        agenda.numPersonas();
        
        System.out.println("\nBuscando datos:");
        System.out.println( agenda.buscarNombre( "Juan" ) );
    }
    
}
