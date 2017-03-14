/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

enum Colores { Rojo, Verde, Azul };

/**
 *
 * @author dam132
 */
public class Figura {
    
    
    
    private Colores color;
    
    public Figura( Colores color ) {
        this.color = color;
    }
    
    public Colores getColor() {
        return color;
    }
    
    public void setColor( Colores color ) {
        this.color = color;
    }
    
    public String getNomColor() {
        
        String val = "";
        switch ( color ) {
            case Rojo:
                val = "Rojo";
                break;
            case Verde:
                val = "Verde";
                break;
            case Azul:
                val ="Azul";
                break;
        }
        
        return val;
    }
    
    
}
