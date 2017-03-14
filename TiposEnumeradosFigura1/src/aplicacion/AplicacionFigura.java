/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author dam132
 */
public class AplicacionFigura {
    
    public static void main(String[] args) {
        
        Figura figura1 = new Figura( Colores.Rojo );
        
        System.out.println("Color es: " + figura1.getColor());
        
        System.out.println("Un color: " + figura1.getNomColor());
    }
    
}
