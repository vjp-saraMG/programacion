/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e05at3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E05AT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 7, contador = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        while (num == 7){
            
            System.out.println("Introduzca el numero siete: ");
            num = entrada.nextInt();
            
            if (num == 7){
                
                contador = contador + 1;
                
            }

        }
        
        System.out.println("Has introducido " + contador + " sietes.");
        
    }
    
}
