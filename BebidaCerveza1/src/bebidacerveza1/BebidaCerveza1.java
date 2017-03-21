/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidacerveza1;


/*
 * Un tipo enumerado "complejo", tiene sus propios métodos y constructor
 */
enum Vaso {

    // Tipos de vaso disponibles. Pasan al constructor su capacidad en cc.

    JARRA( 500 ), TUBO( 250 ), TERCIO( 333 ), CAÑA( 200 );

    @SuppressWarnings("FieldMayBeFinal")
    private int centCub; // Variable interna donde almacenaremos la capacidad

    // Nuestro constructor nos fuerza a pasar parámetros al definir un nuevo tipo
    Vaso( int centCub ) {
        this.centCub = centCub;
    }

    // Devuelve la capacidad del vaso
    public int getCentimetrosCubicos() {
        return centCub;
    }
}

/*
 * Definimos un tipo de bebida
 */
class BebidaCerveza {
    
    // Tipos enumerados sencillos. Solo tenemos estas marcas
    enum MarcaCerveza { AMBAR, GUINNESS, HEINEKEN }

    @SuppressWarnings("FieldMayBeFinal")
    private Vaso vaso;
    @SuppressWarnings("FieldMayBeFinal")
    private MarcaCerveza marca;

    BebidaCerveza( MarcaCerveza marca, Vaso vaso ) {
        this.marca = marca;
        this.vaso = vaso;
    }

    public void servir() {
        System.out.println("\n\nSirviendo " + vaso.getCentimetrosCubicos() + "cc. de cerveza " + marca + "\n\n");
    }
}

/*
 * Clase pública que prueba todo esto
 */
class BebidaCerveza1 {

    public static void main(String[] args) {
        BebidaCerveza birra = new BebidaCerveza(BebidaCerveza.MarcaCerveza.AMBAR, Vaso.JARRA);
        
        birra.servir();
    }
}
