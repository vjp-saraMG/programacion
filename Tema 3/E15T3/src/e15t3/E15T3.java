/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e15t3;
import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E15T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int numero, multiplicacion;
       
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
        numero = entrada.nextInt();
        
        for (multiplicacion=0; multiplicacion <11;multiplicacion ++){
            
            System.out.println(numero + " x " + multiplicacion + " = " + numero * multiplicacion);
        }
        
        
        
    }
    
}
