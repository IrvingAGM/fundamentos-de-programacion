/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion;

import fundamentos.de.programacion.modificadoresacceso.Fraccion;

/**
 *
 * @author irvin
 */
public class EjercicioFracciones {
    
    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion();
        
        f1.imprimir();
        f1.setNumerador(3);
        f1.setDenominador(4);
       
        f1.imprimir();
        
        System.out.println(f1.getEquivalenteDecimal());
        
        Fraccion f2 = new Fraccion();
        f2.setNumerador(6);
        f2.setDenominador(8);
        
        f2.imprimir();
        
        f2.simplificar();
    }
}
