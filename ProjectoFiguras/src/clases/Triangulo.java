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

//    /**
//     *
//     * @param altura
//     * @param lado
//     * @param color
//     */
//    public Triangulo(float altura, float lado, Color color) {
//        this.altura = altura;
//        this.lado = lado;
//        this.color = color;
//    }
    
    public Triangulo(float altura, float lado, Color color) {
        
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
        return "Triangulo{" + "altura = " + altura + "\n lado = " + lado + "\n color = " + getColor() + '}';
    }


    
    
}
