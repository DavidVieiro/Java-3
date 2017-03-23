/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author dam132
 */
public class PolimorfismoAnimales {
    
    private static void muevete( Mamifero m ) {
        m.mover();
    }
    
    public static void main(String[] args) {
        // Mamifero unMamifero = new Mamifero();
        Perro unPerro = new Perro();
        // muevete( unMamifero );
        muevete( unPerro );
        
        if ( unPerro instanceof Perro ) {
            System.out.println("El objeto es un Perro");
        }
        if ( unPerro instanceof Mamifero) {
            System.out.println("El objeto tambien es un Mamifero");
        }
        
//        Gato cat = new Gato("mu");
//        
//        System.out.println("El objeto es un gato");
//        if ( cat instanceof Mamifero ) {
//            System.out.println("El objeto es un Mamifero");
//        }
        
    }
    
}
