/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion.entendiendo.poo;

import java.util.Scanner;

/**
 *
 * @author irvin
 */
public class EjemploDeUsoWhile {
    
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        int numero, suma=0;
        
        numero = sc.nextInt();
        
        while(numero!=0){
            suma = suma + numero;
            numero = sc.nextInt();
        }
        
        System.out.println("total: "+suma);
        
    }
}
