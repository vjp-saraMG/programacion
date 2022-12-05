/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e07t4;

import java.util.Scanner;


/**
 *
 * @author sara
 */
public class E07T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, num3, num4;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduce un numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora introduce otro numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce otro tercer numero: ");
        num3 = entrada.nextInt();
        
        System.out.println("Introduce un cuarto numero: ");
        num4 = entrada.nextInt();
        
        Ordenar.ordenar(num1, num2, num3, num4, num4, num4);
        
    }
    
}
