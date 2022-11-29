/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e23t3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E23T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 1, num2, i;
        
        Scanner entrada = new Scanner (System.in);
        
        do{
            
           System.out.println("Introduce un numero: ");
           
           num2 = entrada.nextInt();
           
           if (num2 < 1){
               
               System.out.println("Error. El numero introducido es menor que 1");
               
           }
            
        }while(num2 < 1);
        
        for (i = num1; i <= num2; i++){
            
            System.out.println(i);
            
        }
        
        
        
        
    }
    
}
