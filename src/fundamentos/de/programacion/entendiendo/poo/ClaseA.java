/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion.entendiendo.poo;

import java.util.Scanner;

public class ClaseA {
    
    Scanner scanner;
    
    int metodoA(int valor1, int valor2){
        return valor1+valor2;
    }
    
    void metodoB(String nombre){
        
        String saludo = "¡Hola! "+nombre;
        
        System.out.println(saludo);
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

       do
        {
            System.out.println("Ingrese un numero ");
            numero = sc.nextInt();
        } while(numero <= 500);
    }
}
