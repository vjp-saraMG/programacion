/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e02at3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E02AT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, i, contador = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        do {
            
            System.out.println("Introduce un numero: ");
            num = entrada.nextInt();
            
            if (num < 0){
                
                System.out.println("Error. El numero introducido no es valido.");
                
            }
            
        }while (num < 0);
        
        for (i = 0; i < num; i++){
            
            System.out.println("Hola");
            
        }
  
    }
    
}
