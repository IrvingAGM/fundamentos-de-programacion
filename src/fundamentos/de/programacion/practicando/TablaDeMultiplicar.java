/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion.practicando;

import java.util.Scanner;

/**
 *
 * @author irvin
 */
public class TablaDeMultiplicar {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Tabla de multiplicar");
        
        System.out.println("Ingrese el valor del cual quiera conocer su tabla de multiplicar");
        numero = scanner.nextInt();
        
        /*
             System.out.println("1 x "+numero+ " = "+(numero*1));
             System.out.println("2 x "+numero+ " = "+(numero*2));
             System.out.println("3 x "+numero+ " = "+(numero*3));
             System.out.println("10 x "+numero+ " = "+(numero*10));
        */
        for(int i=1; i<=10; i++){
            System.out.println(numero+" x "+i+ " = "+(numero*i));
        }
    }
}
