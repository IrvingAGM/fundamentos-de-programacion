/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion;

import java.util.Scanner;

public class EjercicioTipoDeCambio {
    
    public static void main(String[] args) {
        
        float dia1, dia2, dia3, dia4, dia5, suma = 0, promedio;
        
        float tipoDeCambio=0;
        
         Scanner scanner = new Scanner(System.in);
         
         
         for(int  i = 0; i<5; i++){
             
             System.out.println("Ingrese tipo de cambio del día "+i+": ");
             tipoDeCambio = scanner.nextFloat();
             System.out.println("El tipo de cambio ingresado es: "+tipoDeCambio);
             
             suma = suma + tipoDeCambio;
            
         }
         
          System.out.println("La suma es: "+suma);
         
         
         
         
         /*
         System.out.println("Ingrese tipo de cambio del día 1: ");
         dia1 = scanner.nextFloat();
         
          System.out.println("Ingrese tipo de cambio del día 2: ");
          dia2 = scanner.nextFloat();
         
          System.out.println("Ingrese tipo de cambio del día 3: ");
          dia3 = scanner.nextFloat();
         
          System.out.println("Ingrese tipo de cambio del día 4: ");
          dia4 = scanner.nextFloat();
         
          System.out.println("Ingrese tipo de cambio del día 5: ");
          dia5 = scanner.nextFloat();
         
        
          suma  =  dia1+dia2+dia3+dia4+dia5;
          
          promedio = suma / 5;
          System.out.println("Los valores sumados: "+suma);
          
           System.out.println("Promedio de tipo de cambio: "+promedio);
          */
          
    }
    
}
