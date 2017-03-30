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
public class Triangulo extends Figura {
    
    private float altura;
    private float lado;
    
    public Triangulo(float altura, float lado, Colores color) {
        
        super(color);
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double area() {
        
        return ( altura * lado ) / 2;
    }
    
    @Override
    public double perimetro() {
        
        return lado * 3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "altura = " + altura + ", lado = " + lado + ", color = " + getColor() + '}';
    }


    
    
}
