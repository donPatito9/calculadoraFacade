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
public class CalculadoraFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RestaNumeros rn = new RestaNumeros();
        System.out.println("Resultado de la resta: " + rn.resta(30, 10));
        
        SumaNumeros sn = new SumaNumeros();
        System.out.println("Resultado de la suma: " + sn.suma(30, 10));
        
        facadeEjemplo ej = new facadeEjemplo();
        ej.usarCalculadoraParaSumarORestar(10, 30,"+");
    }
    
}
