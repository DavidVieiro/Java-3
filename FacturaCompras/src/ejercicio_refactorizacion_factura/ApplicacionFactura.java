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
public class ApplicacionFactura {
        public static void main(String[] args) {
            
            // Productos
            Producto prod1 = new Producto("Disco duro", 100, Producto.HARDWARE);
            Producto prod2 = new Producto("Pendrive", 9, Producto.HARDWARE);
            Producto prod3 = new Producto("Tarjeta memoria", 12, Producto.HARDWARE);
            
            // Compras
            Compra compra1 = new Compra(prod1, 1);
            Compra compra2 = new Compra(prod2, 3);
                    
            // Factura
            Factura factura1 = new Factura("1");
            
            factura1.agregarItem(compra1);
            factura1.agregarItem(compra2);
            
            factura1.facturarCompras();
        }
}
