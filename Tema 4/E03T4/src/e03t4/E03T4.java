/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e03t4;

import e03t4.mayor.Mayor;
import java.util.Scanner;

/**
 *
 * @author smahiag01
 */
public class E03T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, num3;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduce el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Por ultimo, introduzca un tercer numero: ");
        num3 = entrada.nextInt();
        
        Mayor.mayor(num1, num2, num3);
        
        
        
    }
    
}
