/*
 * Vamos a crear la clase CuentaBancaria con los siguientes atributos (o propiedades) y métodos.
 * Controlar Valores no <= 0.
 * Metodos: toString(), equals() por umero_de_cuenta.
 * Crear aplicación y probar la implementación de la clase.
 * CuentaBancaria
 * 
 * String titular;
 * int numero_de_cuenta;
 * tipoDeInteres: double
 * saldo: double
 * 
 * CuentaBancaria(saldo,titular, int numero_de_cuenta)
 * CuentaBancaria(titular, int numero_de_cuenta)
 * establecerTipoDeInteres(tipoi:double)
 * ingresarDinero(ingreso:double)
 * retirarDinero(cantidad:double)
 * -----------------------------------------------
 * - Excepciones en datos no validos
 * - Estado de la cuenta bancaria:
 *      estado: bloqueada, activada, noactivada
 */
package cuentabancaria;

import excepciones.CuentaBancariaException;
import java.util.Objects;

/**
 *
 * @author dam131
 */

enum Estado {
    bloqueada("Bloqueada"), activada("Activada"), noActivada("No activada");
    
    private String estado;

    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
}

public class CuentaBancaria {
    /* atributos de la clase */
    @SuppressWarnings("FieldMayBeFinal")
    private String titular;
    @SuppressWarnings("FieldMayBeFinal")
    private long numero_de_cuenta;
    private double tipoDeInteres; 
    private double saldo;
    @SuppressWarnings("FieldMayBeFinal")
    private Estado miEstado;
    
    /**
     * constructor con 3 parametros
     * @param saldo
     * @param titular
     * @param numero_de_cuenta 
     */
    public CuentaBancaria(double saldo, String titular, long numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoDeInteres = 0.3;
        this.miEstado = Estado.activada;
    }
    
    /**
     * Constructor con 2 parametros
     * @param titular
     * @param numero_de_cuenta 
     */
    public CuentaBancaria(String titular, long numero_de_cuenta) {
        this.titular = titular;
        this.numero_de_cuenta = numero_de_cuenta;
        this.saldo = 0;
        this.tipoDeInteres = 0.3;
        this.miEstado = Estado.activada;
    }
    
    /**
     * Setter tipo de Interes
     * @param tipoDeInteres 
     * @return  
     * @throws excepciones.CuentaBancariaException  
     */
    public boolean setTipoDeInteres( double tipoDeInteres ) throws CuentaBancariaException {
        if ( tipoDeInteres >= 0 ) {
            this.tipoDeInteres = tipoDeInteres;
            return true;
        } else {
            throw new CuentaBancariaException( 1 );
        }
    }
    
    /**
     * Ingresar dinero equivale a aumentar el saldo de la cuenta con un ingreso
     * @param ingreso 
     * @return  
     * @throws excepciones.CuentaBancariaException  
     */
    public boolean ingresarDinero( double ingreso ) throws CuentaBancariaException {
        if ( ingreso >= 0 ) {
            this.saldo += ingreso;
            return true;
        } else {
            throw new CuentaBancariaException( 2 );
        }
    }
    
    /**
     * verifica que el saldo sea mayor de 0. Le resta la cantidad al saldo.
     * @param cantidad 
     * @return  
     * @throws excepciones.CuentaBancariaException  
     */
    public boolean retirarDinero( double cantidad ) throws CuentaBancariaException{
        if ( this.saldo >= 0 && cantidad >= 0 ) {
            this.saldo -= cantidad;
            return true;
        } else {
            throw new CuentaBancariaException( 3 );
        }
    }
    
    /**
     * 
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Se hereda de java.lang.Object, por lo que deberemos sobrescribir este método.
     * @return 
     */
    @Override
    public String toString() {
        return "\n------------------------------------" +
               "\nNumero de Cuenta : " + this.numero_de_cuenta +
               "\nTitular : " + this.titular + 
               "\nTipo de Interés : " + this.tipoDeInteres +
               "\nSaldo : " + this.saldo + " Euros" +
               "\nEstado Cuenta: " + this.miEstado.getEstado() +
               "\n------------------------------------\n";
    }

    /**
     * Se hereda de java.lang.Object, por lo que deberemos sobrescribir este método.
     * Para generarlo automaticamente Alt + Insert (equals)
     * @param obj
     * @return 
     */
    @Override
    public boolean equals( Object obj ) {
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        final CuentaBancaria other = ( CuentaBancaria ) obj;
        if ( !Objects.equals( this.titular, other.titular ) ) {
            return false;
        }
        if ( this.numero_de_cuenta != other.numero_de_cuenta ) {
            return false;
        }
        if ( Double.doubleToLongBits( this.tipoDeInteres ) != Double.doubleToLongBits( other.tipoDeInteres ) ) {
            return false;
        }
        if ( Double.doubleToLongBits( this.saldo ) != Double.doubleToLongBits( other.saldo ) ) {
            return false;
        }
        return true;
    }
}
