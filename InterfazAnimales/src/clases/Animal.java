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
abstract class Animal implements Comportamiento {
    
    private String especie;
    private String raza;
    private String nombre;

    public Animal( String especie, String raza, String nombre ) {
        this.especie = especie;
        this.raza = raza;
        this.nombre = nombre;
    }
    
    abstract public void quienSoy();
    
    public String getEspecie() {
        return especie;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void correr() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void andar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cantar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hablar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
