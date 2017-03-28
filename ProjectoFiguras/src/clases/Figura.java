/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author dam132
 */
public abstract class Figura {
    //color   color  => tipo enumerado  (Negro, Verde, Azul);
    //metodos abstractos. Redefinir en subclases
    
    enum Color { Negro, Verde, Azul };
    
    private Color color;

    public Figura( Color color ) {
        this.color = color;
    }
    
    public abstract double area();

    public abstract double perimetro();

    public Color getColor() {
        return color;
    }
    
    
}
