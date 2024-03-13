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
public class facadeEjemplo {
    public void usarCalculadoraParaSumarORestar(int a, int b, String operacion){
    System.out.println("Se usa calculadora para: " + operacion);
    Calculadora calc = new Calculadora(a,b,operacion);
    System.out.println("Resultado de la operacion: " + calc.operacion());
    }     
}
