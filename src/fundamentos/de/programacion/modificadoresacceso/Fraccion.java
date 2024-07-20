/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.de.programacion.modificadoresacceso;


 public class Fraccion {
    
     private int numerador;
     private int denominador;
     
     //Getters y Setters para acceder a los elementos private

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador==0)
        {
            System.out.println("No se permite valor CERO en el denominador");
            denominador=1;
        }
        this.denominador = denominador;
    }
   
    public void imprimir(){
        System.out.println(this.numerador+"/"+this.denominador);
    } 
    

    public double getEquivalenteDecimal(){
    
        double equivalenteDecimal = (double)this.numerador / this.denominador;
    
        return equivalenteDecimal;
    }
    
        public void simplificar(){
      
            int limite, mcd=1;
            
            if(denominador<numerador){
                limite = denominador;
            }
            else{
                limite = numerador;
            }
            
            for(int i = 1; i<=limite; i++){
                
                if(numerador%i==0 && denominador%i==0){
                    mcd = i;
                }
            }
         
            this.numerador = this.numerador/mcd;
            
            this.denominador/=mcd;
           
    }
        
        
        public void simplificarEuclides(){
            int mcd = calcularMCD(numerador, denominador);
            
            this.numerador/=mcd;
            this.denominador/=mcd;
            
        }
        
        private int calcularMCD(int a, int b){
         
            while(b != 0){
                int temp = b;
                b = a%b;
                a=temp;
            }
            return a;
        }
        
    
}
