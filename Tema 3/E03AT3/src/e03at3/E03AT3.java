/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e03at3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E03AT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 0, num;
        
        Scanner entrada = new Scanner (System.in);
        
        do{
            
            System.out.println("Introduce o 0 ó 1: ");
            num = entrada.nextInt();
            
            if (num == 1){ //Hay que poner el if porque si no, al pulsar el 0, el contador vuelve a sumar 10
                
                contador = contador + 10;
                
            }
 
        }while(num != 0);
        
        System.out.println("Total: " + contador);
        
    }
    
}
