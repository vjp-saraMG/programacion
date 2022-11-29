/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e22t3;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author sara
 */
public class E22T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, suma;
        boolean error = false;
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Por favor, introduce un numero: ");
        
        try {
            
            num1 = entrada.nextInt();
            
        }catch(InputMismatchException e){
            
            error = true;
            
            System.out.println("Error: " + e.getMessage());
            
            num1 = 0;
        }
        
        System.out.println("Ahora introduce otro numero: ");
        
        try {
            
            num2 = entrada.nextInt();
            
        }catch(InputMismatchException e){
            
            error = true;
            
            System.out.println("Error: " + e.getMessage());
            
            num2 = 0;
            
        }
        
        if (error != true){
            
           suma = num1 + num2;
       
           System.out.println("La suma de los numeros introducidos es " + suma);
            
        }
        
    }
    
}
