/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion.practicando;

import java.util.Scanner;


public class ConversionGrados {
 
    public static void main(String[] args) {
        
        double gradosAConvertir, respuesta;
        int opcion;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elije una opción");
        System.out.println("1. Convertir Celcius a Fahrenheit");
        System.out.println("2. Convertir Fahrenheit a Celcius");
        opcion = scanner.nextInt();
        
        //aplicando la formula
        if(opcion==1){
             System.out.println("Ingrese cantidad de grados a convertir");
            gradosAConvertir = scanner.nextDouble();
        
            respuesta = (gradosAConvertir * 9/5) + 32;
            
            System.out.println(gradosAConvertir+" es igual a "+respuesta+ " grados Fahrenheit");
            
        }
        else if(opcion==2){
             System.out.println("Ingrese cantidad de grados a convertir");
             gradosAConvertir = scanner.nextDouble();
        
            respuesta = (gradosAConvertir - 32) * 5/9;
            System.out.println(gradosAConvertir+" es igual a "+respuesta+ " grados Celcius");
            
        }else{
            System.out.println("Opción no válida");
        }
    }
   
}
