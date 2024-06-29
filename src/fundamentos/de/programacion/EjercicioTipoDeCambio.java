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
        
         Scanner scanner = new Scanner(System.in);
         
         
         for(int  i = 0; i<5; i++){
             
             System.out.println("Ingrese tipo de cambio del día "+i+": ");
             tipoDeCambio = scanner.nextFloat();
             System.out.println("El tipo de cambio ingresado es: "+tipoDeCambio);
             
             suma = suma + tipoDeCambio;
            
         }
         
         System.out.println("La suma es: "+suma);
         promedio = suma / 5;
         
         System.out.println("El promedio es: "+promedio);
         
          
    }
    
}
