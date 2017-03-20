/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author dam131
 */
public class CuentaBancariaApp {
    /**
     * @param args the command line arguments
     */
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // variables
        int opcion = 0;
        
        // creamos objetos
        CuentaBancaria cuenta1 = new CuentaBancaria(100.0, "Pablo Pita", 459);
        CuentaBancaria cuenta2 = new CuentaBancaria(100.0, "Pablo Pita", 459);
        
        do {
            System.out.println("¿Que operación desea realizar ?"
                    + "\n1.- Ingresar Dinero"
                    + "\n2.- Retirar Dinero"
                    + "\n3.- Conocer Saldo de la cuenta"
                    + "\n4.- Salir");
            opcion = Integer.parseInt(teclado.readLine());
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Introduce una opcion valida...");
            }
            
        } while (opcion != 4) ;
    }
}
