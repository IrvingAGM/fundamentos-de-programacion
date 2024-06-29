/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion.entendiendo.poo;

import java.util.Scanner;


public class EjercicioTipoDeCambioV2 {
    
    public static void main(String[] args) {
        
        TipoDeCambio dia1 = new TipoDeCambio();
        TipoDeCambio dia2 = new TipoDeCambio();
        
         Scanner scanner = new Scanner(System.in);
        
        /*
         dia1.fecha = "28 de junio 2024";
         dia2.fecha = "29 de junio 2024";
         dia1.precioVenta = 18.50;
         dia2.precioVenta = 17.90;
         */
        
        System.out.println("Ingrese fecha del día 1: ");
        dia1.fecha = scanner.nextLine();
        
        System.out.println("Ingrese precio de venta del día 1: ");
        dia1.precioVenta = scanner.nextDouble();
        
        //Esta línea es para limpiar el buffer
        scanner.nextLine();
        
        System.out.println("Ingrese fecha del día 2: ");
        dia2.fecha = scanner.nextLine();
        
        System.out.println("Ingrese precio de venta del día 2: ");
        dia2.precioVenta = scanner.nextDouble();
        

        if(dia1.precioVenta > dia2.precioVenta){
             System.out.println("El tipo de cambio mayor es: "+dia1.precioVenta);
             System.out.println("y sucedio el dia: "+dia1.fecha);
             
             dia1.imprimir(); 
         }
         else{
             System.out.println("El tipo de cambio mayor es: "+dia2.precioVenta);
             System.out.println("y sucedio el día: "+dia2.fecha);
             
             dia2.imprimir();
         }
         
        
        //-------------------------------------------------------------------------------------
        //Vendiendo  10 dolares en cada día
        double resultadoDia1 = dia1.venderDolares(10.0);
        
        
        double resultadoDia2 = dia2.venderDolares(10.0);
        
    }
}
