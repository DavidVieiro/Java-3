/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.*;
import clases.Figura.Colores;

/**
 *
 * @author dam132
 */
public class AplicacionFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figura lista[] = new Figura[5];
        
        lista[0] = new Triangulo( 4F, 5F, Colores.Verde );
        lista[1] = new Circulo( 5, Colores.Verde );
        lista[2] = new Rectangulo( 5, 4, Colores.Azul );
        lista[3] = new Rectangulo( 7, 4, Colores.Negro );
        lista[4] = new Circulo( 3, Colores.Azul );
        
        for (Figura lista1 : lista) {
            System.out.println( lista1.getClass().getName() );
            System.out.println( "Area: " +  lista1.area() );
            System.out.println( "Perimetro: " + lista1.perimetro() );
            System.out.println("---------------------------------------");
        }
        
    }
    
}
