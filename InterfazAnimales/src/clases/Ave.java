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
public class Ave extends Animal {
    
    public Ave( String especie, String raza, String nombre ) {
        super( especie, raza, nombre );
    }

    @Override
    public void quienSoy() {
        System.out.println( this.getClass().getSimpleName() );
    }

    @Override
    public void cantar() {
        super.cantar();
    }

    @Override
    public void andar() {
        super.andar();
    }

    @Override
    public void volar() {
        super.volar();
    }

    @Override
    public void correr() {
        super.correr();
    }

    @Override
    public void comer() {
        System.out.println("Pan, frutos secos, pienso.");
    }
    
}
