/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion.modificadoresacceso;

/**
 *
 * @author irvin
 */
public class OperacionesFracciones {
    
    public Fraccion suma(Fraccion sumando1, Fraccion sumando2){
        
        Fraccion fraccionResultante = new Fraccion();
        
        //Falta hacer la operacion
        fraccionResultante.setDenominador( sumando1.getDenominador()*sumando2.getDenominador());
     
        fraccionResultante.setNumerador(sumando1.getNumerador()*sumando2.getDenominador()
                +sumando1.getDenominador()*sumando2.getNumerador());
        
        return fraccionResultante;
        
    }
   
    // realizar tambien las operaciones resta, multiplicacion y division
    
}
