/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Comparator;

/**
 *
 * @author dam132
 */
public class OrdenarPersonaAltura implements Comparator<Persona> {

    @Override
    public int compare( Persona o1, Persona o2 ) {
        return o1.getAltura() - o2.getAltura();
    }
    
    
    
}
