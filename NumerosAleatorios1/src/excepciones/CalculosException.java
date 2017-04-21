/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author dam132
 */
public class CalculosException extends Exception {
    
    int opcion;
    
    public CalculosException( int opcion ) {
        this.opcion = opcion;
    }
    
    @Override
    public String getMessage() {
        switch ( opcion ) {
            case 1: return "\nERROR: La longitud del vector no esta dentro\nde los parametros...";
            default: return "";
        }
    }
    
}
