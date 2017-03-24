/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author estudiantes
 */
public class Calculadora {
    
    double numero1;

    public double getNumero1() {
        return numero1;
    }

    public double setNumero1(double numero1) {
        this.numero1 = numero1;
        return 0;
    }

    public double getNumero2() {
        return numero2;
    }

    public double setNumero2(double numero2) {
        this.numero2 = numero2;
        return 0;
    }

    public double getResultado() {
        return resultado;
    }

    public double setResultado(double resultado) {
        this.resultado = resultado;
        return 0;
    }
    double numero2;
    double resultado;
    
    
    public double suma(){
        
        this.resultado=this.numero1+this.numero2;
        return this.resultado;
        
    }
    
     public double resta(){
        
        this.resultado=this.numero1-this.numero2;
        return this.resultado;
        
    }
     
      public double multiplicacion(){
        
        this.resultado=this.numero1*this.numero2;
        return this.resultado;
        
    }
      
      
       public double dicvision(){
        
        this.resultado=this.numero1/this.numero2;
        return this.resultado;
        
    }
       public double seno(){
           
           double a;
           a=Math.toRadians(numero1);
           this.resultado=Math.sin(a);
           return this.resultado;
       }
       
       public double coseno(){
           
           double a;
           a=Math.toRadians(numero1);
           this.resultado=Math.cos(a);
           return this.resultado;
       }
       
       public double tangente(){
           
           double a;
           a=Math.toRadians(numero1);
           this.resultado=Math.tan(a);
           return this.resultado;
       }
       
     
    
    
  

    void setnumero1(Float valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setnumero2(Float valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object resultado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
