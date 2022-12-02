/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e02t4;

import java.util.Scanner;

/**
 *
 * @author smahiag01
 */
public class E02T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int num1, num2;
        
        System.out.println("Número 1: ");
        num1 = teclado.nextInt();
        
        System.out.println("Número 2: ");
        num2 = teclado.nextInt();
        
        if (num1 > 10){
            
            Operaciones.multiplicar(num1, num2);
            
        }
        
        else {
            
            Operaciones.sumar(num1, num2);
            
        }
    }
    
}

// No tiene sentido declararse una variable resultado en el main porque no se va a utilizar.