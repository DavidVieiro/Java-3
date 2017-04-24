/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import excepciones.CalculosException;
import java.util.Random;

/**
 *
 * @author dam132
 */
public class Calculos {
    
    private static final int LIMITE_RANDOM = 49;
    private static final int LIMITE_REINTEGRO = 9;
    private static final int MAXIMO_NUM = 7;
    
    public static String generarNumero( int longVector) throws CalculosException {
        
        int vector[] = new int[longVector];
        
        Random aleatorio = new Random();
        
        if ( vector != null ) {
            
            int n = 0;
            
            if ( vector.length <= MAXIMO_NUM && vector.length > 0 ) {
                
                for ( int i = 0; i < vector.length; i++ ) {
                    
                    boolean existe = true;
                    
                    do {
                        /* Siguiente valor aleatorio */
                        n = aleatorio.nextInt( LIMITE_RANDOM );
                        existe = comprobarExiste( vector, n );
                        vector[i] = n;
                        
                    } while ( existe );
                    
                }
                // Generamos el reintegro y lo añadimos al vector.
                n = aleatorio.nextInt( LIMITE_REINTEGRO );
                vector[6] = n;
            }
            else {
                throw new CalculosException( 1 );
            }
            
        }
        return mostrarVector( vector );
    }
    
    private static boolean comprobarExiste( int vector[], int numero ) {
        
        int i = 0;
        boolean existe = false;
        
        for (i = 0; i < vector.length && existe == false; i++) {
            if (vector[i] == numero) {
                existe = true;
            }
        }
        
        return existe;
    }
    
    private static String mostrarVector( int vector[] ) {
        
        String cadena = "";
        
        for ( int i = 0; i < vector.length; i++ ) {
            cadena += vector[i] + " ";
        }
        cadena += "\n";
        
        return cadena;
    }
    
}
