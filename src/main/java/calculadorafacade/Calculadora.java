/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafacade;

/**
 *
 * @author Robinson Concha
 */
public class Calculadora {
     int a = 0,b= 0;
    String operacion = null;
    
    public Calculadora(int pA,int pB, String pOperacion){
        this.a = pA;
        this.b = pB;
        this.operacion = pOperacion;
    }
    
    public int operacion(){
      int resultado = 0;
      if(operacion.equals("+")) {
      SumaNumeros s = new SumaNumeros();
      resultado = s.suma(a,b);
      }
      if(operacion.equals("-")){
        RestaNumeros s = new RestaNumeros();
        resultado = s.resta(a,b);
      }
    return resultado;
    
    }
}
