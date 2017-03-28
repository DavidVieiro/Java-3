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
public class Rectangulo extends Figura {
    
    private float base;
    private float altura;

    public Rectangulo(float base, float altura, Color color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area() {
        
        return base * altura;
    }
    
    @Override
    public double perimetro() {
        
        return ( base * altura ) * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base = " + base + "\n altura = " + altura + "\n color = " + getColor() + '}';
    }
    
    
    
    
}
