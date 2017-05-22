
package modelolista1;

import java.util.ArrayList;

/**
 *
 * @author Gabino
 */
public class Lista {

    private ArrayList <Persona>lista;

    public Lista() {
        this.lista = new ArrayList<Persona>();
    }

   
    /**
     * Get the value of lista
     *
     * @return the value of lista
     */
    public ArrayList<Persona> getLista() {
        return lista;
    }

    /**
     * Set the value of lista
     *
     * @param lista new value of lista
     */
    public void addPersona(Persona p) {
        this.lista.add(p);
    }
    
    public Persona getPersona(int p) {
        return (Persona)lista.get(p);        
    }
    
    public int tam() {
        return lista.size();
    }

}
