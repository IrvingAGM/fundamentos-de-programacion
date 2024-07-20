/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion;

import fundamentos.de.programacion.modificadoresacceso.Fraccion;
import fundamentos.de.programacion.modificadoresacceso.OperacionesFracciones;
import java.util.Scanner;

/**
 *
 * @author irvin
 */
public class EjercicioOperacionesFracciones {
    
    public static void main(String[] args) {
        
        OperacionesFracciones operacionesFracciones = new OperacionesFracciones();
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        Fraccion f1 = new Fraccion();
        f1.setNumerador(2);
        f1.setDenominador(3);
        
        Fraccion f2 = new Fraccion();
        f2.setNumerador(1);
        f2.setDenominador(8);
        
        //Menu
        do{
            System.out.println("*** BIENVENIDO ***");
            System.out.println(" Elija una opción");
            
            System.out.println("1. Sumar ");
            System.out.println("2. Resta ");
            System.out.println("...");
            System.out.println("5. Salir");
            
            opcion = scanner.nextInt();
            
            
             switch(opcion){
                 case 1: Fraccion resultado = operacionesFracciones.suma(f1, f2);
                             System.out.println("El resultado es: " );
                             resultado.imprimir();
                             break;
                             
                 case 2: 
                              break;            
                              
             }
            
        }while(opcion!=5);
                
        
        
    }
}
