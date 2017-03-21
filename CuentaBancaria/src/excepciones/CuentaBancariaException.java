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
public class CuentaBancariaException extends Exception {
    
    int opcion;
    
    public CuentaBancariaException( int opcion ) {
        this.opcion = opcion;
    }
    
    @Override
    public String getMessage() {
        switch ( opcion ) {
            case 1: return "\nERROR: No puedes introducir un valor negativo en el tipo de interes.";
            case 2: return "\nERROR: No se puede ingresar una cantidad de dinero negativa.";
            case 3: return "\nERROR: No se puede retirar una cantidad de dinero negativa.";
            default: return "";
        }
    }
}
