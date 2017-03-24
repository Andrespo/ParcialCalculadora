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
    
    float numero1;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    float numero2;
    float resultado;
    
    
    public float suma(){
        
        this.resultado=this.numero1+this.numero2;
        return this.resultado;
        
    }
    
     public float resta(){
        
        this.resultado=this.numero1-this.numero2;
        return this.resultado;
        
    }
     
      public float multiplicacion(){
        
        this.resultado=this.numero1*this.numero2;
        return this.resultado;
        
    }
      
      
       public float dicvision(){
        
        this.resultado=this.numero1/this.numero2;
        return this.resultado;
        
    }
       
     
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
