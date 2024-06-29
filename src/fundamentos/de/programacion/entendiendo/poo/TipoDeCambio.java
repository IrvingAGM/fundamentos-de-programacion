/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion.entendiendo.poo;


public class TipoDeCambio {
    
    String fecha;
    double precioVenta;
    double precioCompra;
    
    
    public void imprimir(){
        System.out.println("Fecha: "+this.fecha);
        
        System.out.println("Precio de venta: "+this.precioVenta);
        
        System.out.println("Precio de compra: "+this.precioCompra);
    }
    
    
    public double venderDolares(double cantidad){
        
       double resultado = this.precioVenta*cantidad;
        
       return resultado;
    }
    
}
