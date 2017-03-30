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
        
        Triangulo triangulo1 = new Triangulo( 4F, 5F, Colores.Verde );
        Circulo circulo1 = new Circulo( 5, Colores.Verde );
        Rectangulo rect1 = new Rectangulo( 5, 4, Colores.Azul );
        
        System.out.println( circulo1.getClass().getName() );
        System.out.println( circulo1.toString() );
        System.out.println("Area: " + circulo1.area() );
        System.out.println("Perimetro: " + circulo1.perimetro() + "\n");
        
        System.out.println( triangulo1.getClass().getName() );
        System.out.println("Area: " + triangulo1.area());
        System.out.println("Perimetro: " + triangulo1.perimetro() + "\n");
        
        System.out.println( rect1.getClass().getName() );
        System.out.println("Area: " + rect1.area() );
        System.out.println("Perimetro: " + rect1.perimetro() + "\n");
        
    }
    
}
