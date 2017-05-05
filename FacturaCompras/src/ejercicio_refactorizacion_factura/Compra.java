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
public class Compra {
    private Producto producto;
    private int cantidad;

    public Compra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    double calcularCompra(double valorCompra) {
        switch (this.getProducto().getTipo()) {
            case Producto.HARDWARE:
                valorCompra = this.getProducto().getPrecio() * 10.5 * (this.getCantidad());
                break;
            case Producto.SOFTWARE:
                valorCompra = this.getProducto().getPrecio() * 21 * (this.getCantidad());
                break;
            case Producto.NOAPLICA:
                valorCompra = this.getProducto().getPrecio() * (this.getCantidad());
                break;
        }
        return valorCompra;
    }
    
}
