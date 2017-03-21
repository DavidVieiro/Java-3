/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;
import excepciones.CuentaBancariaException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author dam131
 */
public class CuentaBancariaApp {
    
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException, CuentaBancariaException {
        // TODO code application logic here
        // Variables
        int opcion = 0;
        int dineroIngresar;
        int dineroRetirar;
        
        // Creamos objetos || CuentaBancaria(double saldo, String titular, long numero_de_cuenta)
        CuentaBancaria cuenta1 = new CuentaBancaria( 100.0, "Pablo Pita", 459 );
        
        do {
            try {
                System.out.println("\n\n¿Que operación desea realizar ?"
                                   + "\n 1.- Ingresar Dinero"
                                   + "\n 2.- Retirar Dinero"
                                   + "\n 3.- Conocer Saldo de la cuenta"
                                   + "\n 4.- Salir");
                opcion = Integer.parseInt( teclado.readLine() );
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce la cantidad de dinero que quieres ingresar:");
                        dineroIngresar = Integer.parseInt( teclado.readLine() );
                        cuenta1.ingresarDinero( dineroIngresar );
                        break;
                    case 2:
                        System.out.println("Introduce la cantidad de dinero que quieres retirar:");
                        dineroRetirar = Integer.parseInt( teclado.readLine() );
                        cuenta1.retirarDinero( dineroRetirar );
                        break;
                    case 3:
                        System.out.println( cuenta1.toString() );
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Introduce una opcion valida...");
                }
            } catch( CuentaBancariaException ex1 ) {
                System.out.println( ex1.getMessage() );
            }
        } while (opcion != 4) ;
    }
}
