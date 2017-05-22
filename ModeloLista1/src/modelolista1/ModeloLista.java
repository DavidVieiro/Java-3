package modelolista1;

import java.util.Collection;
import java.util.HashMap;
import javax.swing.DefaultListModel;

/**
 * Crear cadena con los datos de los objetos q queremos ver El JList solopara un
 * tipo List
 */
public class ModeloLista extends DefaultListModel {

    Lista datos;

    /**
     * Cargar lista en modelo y actulizar
     *
     * @param l
     */
    public void cargar(Lista l) {
        datos = l;
        this.fireContentsChanged(this, 0, size());
    }

    @Override
    public int getSize() {
        return datos.tam();
    }
// que datos?

    @Override
    public Object getElementAt(int index) {
        String cadena = datos.getPersona(index).getNombre() + "";
        return cadena;

    }

    /**
     * Si la lista es de otro tipo
     *
     * @param l
     */
    public void cargar(HashMap l) {
     //1- convertir a ArrayList
//          Collection valores= orden.values(); 
        // ArrayList valor=(ArrayList)valores;
        // 2- repetir paso
    }

}
