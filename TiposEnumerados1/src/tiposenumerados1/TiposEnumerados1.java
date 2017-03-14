/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposenumerados1;

/**
 *
 * @author dam132
 */
public class TiposEnumerados1 {
    
    public enum Semana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Definimos una variable que pertenece al tipo enumerado Semana
        // y le damos el valor que representa el dia martes.
        Semana hoy = Semana.MARTES;
        // Si el dia se cayese en el fin de semana no hay que trabajar
        if ( hoy == Semana.DOMINGO || hoy == Semana.SABADO ) {
            System.out.println("Hoy toca descansar.");
        }
        else {
            System.out.println("Hoy toca trabajar.");
        }
        
        hoy = Semana.DOMINGO;
        System.out.println("Hoy " + hoy);
        
    }
    
}
