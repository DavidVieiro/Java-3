/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces1;

/**
 *
 * @author dam132
 */
public class Interfaces1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guitarra guitarra1 = new Guitarra();
        
        System.out.println( guitarra1.tipoInstrumento() );
        guitarra1.afinar();
        guitarra1.tocar();
        
    }
    
}
