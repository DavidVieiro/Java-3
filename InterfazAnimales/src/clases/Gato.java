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
public class Gato extends Animal {
    
    public Gato( String especie, String raza, String nombre ) {
        super( especie, raza, nombre );
    }
    
    @Override
    public void quienSoy() {
        System.out.println( this.getClass().getSimpleName() );
    }

    @Override
    public void hablar() {
        super.hablar();
    }

    @Override
    public void andar() {
        super.andar();
    }

    @Override
    public void correr() {
        super.correr();
    }

    @Override
    public void comer() {
        System.out.println("Carne, pienso.");
    }
    
}
