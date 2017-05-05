/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_refactorizacion_factura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dam117
 */
public class Factura {
    
    private List<Compra> _compras;
    private String _numero;
    
    public Factura(String numero) {
        _numero = numero;
        _compras = new ArrayList();
    }
    
    public void agregarItem(Compra item) {
        _compras.add(item);
    }

    public String getNumero() {
        return _numero;
    }

    public void setNumero(String _numero) {
        this._numero = _numero;
    }
    
    public void facturarCompras() {
        double totalFactura;
        Iterator it = _compras.iterator();
        
        int puntaje = 0;
        String ticket = "";
        totalFactura = 0;
        while (it.hasNext()) {
            double valorCompra = 0;
            Compra compra = (Compra) it.next();
            
            valorCompra = compra.calcularCompra(valorCompra);
            
            // Calcular bonificación
            puntaje++;
            if (compra.getProducto().getTipo() == Producto.HARDWARE &&
                    compra.getCantidad() > 1)
                puntaje++;
            
            // Calcular el valor total de la factura
            totalFactura += valorCompra;
            
            // Imprimir
            ticket = "\t" + compra.getProducto().getNombre() + "\tunidad " +
                    compra.getCantidad() + "\t" + valorCompra + "\n";
            System.out.println("PRODUCTO");
            System.out.println(ticket);       
        } // Fin recorrido lista
        
        // Totalizar
        ticket = "El total de su compra es: " + Double.toString(totalFactura) + "\n";
        System.out.println(ticket);
        ticket = "Su puntaje acumulado en esta compra es: " + puntaje + "\n";
        System.out.println(ticket);
        
    }

}
