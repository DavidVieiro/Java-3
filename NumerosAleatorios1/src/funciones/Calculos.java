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
    
    private static final int LIMITE_RANDOM = 50;
    private static final int MAXIMO_NUM = 15;
    
    public static int[] generarNumero( int longVector) throws CalculosException {
        
        int vector[] = new int[longVector];
        
        Random aleatorio = new Random();
        
        if ( vector != null ) {
            
            int n = 0;
            
            if ( vector.length <= MAXIMO_NUM && vector.length > 0 ) {
                
                for ( int i = 0; i < vector.length; i++ ) {
                    
                    boolean existe = true;
                    
                    do {
                        
                        n = aleatorio.nextInt( LIMITE_RANDOM ); /* Siguiente valor aleatorio */
                        existe = comprobarExiste( vector, n );
                        vector[i] = n;
                        
                    } while ( existe );
                    
                }
                
            }
            else {
                throw new CalculosException( 1 );
            }
            
        }
        return vector;
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
    
}
