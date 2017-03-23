/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicacionBicis;

/**
 *
 * @author dam132
 */
/*------------- PolimorfismoBicis.java ----------------------*/
//CLASE PADRE
class Bici {

    String marca, color;
    int n_plazas;

    public void indicarModelo() {
        System.out.println("Es una bicicleta");
    }
}

class BiciMontana extends Bici {

    boolean suspension;
    //Metodo de la clase hija que redefine al de la clase padre

    @Override
    public void indicarModelo() {
        System.out.println("Es una bicicleta de montana");
    }
}

class BiciCarreras extends Bici {

    int cambios;
    
    //Metodo de la clase hija que redefine al de clasepadre
    @Override
    public void indicarModelo() {
        System.out.println("Es una bicicleta de carreras");
    }
}

public class PolimorfismoBicis {

    public static void main(String[] args) {
    //Aqui se declara la referencia de la clase padre
        Bici miBici;
    //Aqui adoptara la forma de referencia a la clase BiciCarreras
        miBici = new BiciCarreras();
        miBici.indicarModelo();
    //Aqui adoptara la forma de referencia a la clase BiciMontana
        miBici = new BiciMontana();
        miBici.indicarModelo();
    }
}
