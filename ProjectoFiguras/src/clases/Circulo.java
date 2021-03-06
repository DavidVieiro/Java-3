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
public class Circulo extends Figura {

    private float radio;

    public Circulo(float radio, Colores color) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double area() {
        
        return Math.PI * Math.pow( radio, 2 );
    }
    
    @Override
    public double perimetro() {
        
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio = " + radio + ", color = " + getColor() + '}';
    }

    public float getRadio() {
        return radio;
    }
    
    
    
    
}
