/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e05t4;

import e05t4.par.ParImpar;
import java.util.Scanner;

/**
 *
 * @author smahiag01
 */
public class E05T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner (System.in);

        System.out.println("Por favor, introduce un número: ");
        num = entrada.nextInt();
        
        ParImpar.esPar(num);
        
    }
    
}
