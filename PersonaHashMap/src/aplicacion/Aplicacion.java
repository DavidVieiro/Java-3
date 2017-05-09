/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.ListaPersonas;
import clases.Persona;

/**
 * Lista personas, clave nif :HashMap
 * 1- altas
 * 2- listar  =>hacer coleccion de objetos y pasar a tabla
 *     Probar con tres objetos.
 * 3- probar:   dni repetido ==> machaca
 * 4- existe dni??, si/no
 *    - ampliar ,mejorar altas
 * 5- buscar por clave y obtener un objeto
 * 
 * 6- bajas, borrar por clave 
 * 7- borrar lista
 * 8- extraer claves
 * 9- Mostrar clave y valor
 * 
 * 10- listarOtraForma
 *  ==> pasarla a treemap y las ordena
 * 11- modificar el tlf, buscar por nombre
 * 12- Listar claves
 *
 * @author dam132
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaPersonas lista = new ListaPersonas();
        
        lista.añadir( new Persona("Jorge", "12345678A","Calle alguna","981000000") );
        lista.añadir( new Persona("Pepe", "12345678B","Calle alguna","981000001") );
        lista.añadir( new Persona("Juan", "12345678C","Calle alguna","981000002") );
        lista.añadir( new Persona("Ana", "12345678D","Calle alguna","981000003") );
        
        lista.listaPeronas1();
        
        System.out.println("\n\nBuscar a Jorge por DNI:");
        System.out.println( lista.obtener( "12345678A" ) );
        
        System.out.println("\n\nBorrar dato:");
        lista.borrarClave( "12345678A" );
        lista.listaPeronas1();
        
        
        
    }

}
