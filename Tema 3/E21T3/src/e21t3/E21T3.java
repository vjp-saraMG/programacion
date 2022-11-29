/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e21t3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E21T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, division;
        boolean error = false;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora introduce otro numero: ");
        num2 = entrada.nextInt();
        
        try {
            
            division = num1 / num2;
            
        }catch(ArithmeticException e){
            
            error = true;
            
            division = 0;
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        if (error != true) {
            
            System.out.println("El resultado de la division: " + division);
            
        }
        
    }
    
}
