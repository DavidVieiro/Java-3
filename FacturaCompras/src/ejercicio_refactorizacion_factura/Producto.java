/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_refactorizacion_factura;

/**
 *
 * @author dam117
 */
public class Producto {
    public static final int SOFTWARE = 1;
    public static final int HARDWARE = 2;
    public static final int NOAPLICA = 0;
    private String nombre;
    private float precio;
    private int tipo;

    public Producto(String nombre, float precio, int tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }    
}
