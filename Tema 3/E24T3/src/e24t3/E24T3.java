/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e24t3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E24T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 1, num2, i, contador = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        do {
            
           System.out.println("Por favor, introduce un numero: ");
           num2 = entrada.nextInt();
           
           if (num2 < 0){
               
               System.out.println("Error. El numero introducido debe ser mayor que 0");
               
           }
            
        }while(num2 < 0);
        
        for (i = 1; i <= num2; i++){
            
            if (i % 3 == 0){
                
                System.out.println(i);
                
                contador = contador + 1;

            }
            
        }
        
        System.out.println("Numeros totales: " + contador);
              
    }
    
}
