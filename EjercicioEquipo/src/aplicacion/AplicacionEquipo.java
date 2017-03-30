/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.Demarcacion;
import clases.Equipo;
import clases.Futbolista;

/**
 *
 * @author dam132
 */
public class AplicacionEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Futbolista lista[] = new Futbolista[3];
        
        lista[0] = new Futbolista( "Pepe", 25, Demarcacion.DEFENSA, Equipo.BARÇA );
        lista[1] = new Futbolista( "Mateo", 4, Demarcacion.DELANTERO, Equipo.REAL_MADRID );
        lista[2] = new Futbolista( "Jose", 1, Demarcacion.PORTERO, Equipo.SEVILLA );
        
        for (Futbolista lista1 : lista) {
            System.out.println( lista1.toString() );
        }
        
    }
    
}
