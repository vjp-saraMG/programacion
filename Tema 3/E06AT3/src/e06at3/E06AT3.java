/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e06at3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E06AT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 0, opcion;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            
            System.out.println("Pulsa 1 para sumar");
            
            System.out.println("Pulsa 2 para restar");
            
            System.out.println("Pulsa 3 para salir");
            
            System.out.println("Opcion: ");
            opcion = entrada.nextInt();

            if (opcion == 1){
                
                contador = contador + 1;
                
            }
            if (opcion == 2){
                
                contador = contador - 1;
                
            }
           if (opcion != 1 && opcion != 2 && opcion!= 3){
                
                contador = 0;

            }
           
        }while (opcion != 3);
        
        System.out.println("Total: " + contador);

    }
    
}
