/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e01at3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E01AT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, i;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
        
        for (i = 0; i < num; i++){
            
            System.out.println("Hola");
            
        }
        
    }
    
}
