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
public class Instrumento implements InstrumentoMusical {
    
    @Override
    public void tocar() {
        System.out.println("Intrumento tocado.");
    }
    
    @Override
    public void afinar() {
        System.out.println("Instrumento afinado.");
    }
    
    @Override
    public String tipoInstrumento() {
        return "";
    }
    
}