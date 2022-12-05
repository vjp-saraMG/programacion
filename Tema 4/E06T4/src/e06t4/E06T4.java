/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e06t4;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E06T4 {
    
    public static void calificacion(int n1){
        
        if (n1 < 0 || n1 > 10){
            
            System.out.println("Error. La nota introducida no es valida.");
            
        }
        else{
            
            if (n1 >= 0 && n1 <=4){
                
                System.out.println("Suspenso");
                
            }
            else {
                
                if (n1 >= 5 && n1 <= 6){
                    
                    System.out.println("Bien");
                    
                }
                else{
                    
                    if (n1 >= 7 && n1 <= 8){
                        
                        System.out.println("Notable");
                        
                    }
                    else{
                        
                        System.out.println("Sobresaliente");
                        
                    }
                    
                }
                
            }
            
        }
        
        
        
        
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduce una nota: ");
        nota = entrada.nextInt();
        
        calificacion(nota);
        
        
    }
    
}
