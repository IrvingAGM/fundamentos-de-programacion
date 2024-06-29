/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion;

import java.util.Scanner;

public class EjercicioTipoDeCambio {
    
    public static void main(String[] args) {
        
        float suma = 0, promedio;
        float tipoDeCambio=0;
        
        float mayor=0;
        int CANTIDAD_DE_DIAS = 5;
        
         Scanner scanner = new Scanner(System.in);
        
         for(int  i = 0; i<CANTIDAD_DE_DIAS; i++){
             
             System.out.println("Ingrese tipo de cambio del día "+i+": ");
             tipoDeCambio = scanner.nextFloat();
             System.out.println("El tipo de cambio ingresado es: "+tipoDeCambio);
             
             if(tipoDeCambio>mayor){
                 mayor = tipoDeCambio;
             }
             
             suma = suma + tipoDeCambio;
            
         }
         
         promedio = suma / CANTIDAD_DE_DIAS;
         
         System.out.println("El promedio es: "+promedio);
         System.out.println("El mayor es: "+mayor);
         
          
    }
    
}
