/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e04t4;

/**
 *
 * @author sara
 */
public class Operaciones {
    
    public static void menor(int n1, int n2, int n3){
        
        if (n1 < n2 && n1 < n3){
            
            System.out.println("El numero menor de los introducidos es el: " + n1);
            
        }
        else{
            
            if (n2 < n1 && n2 < n3){
                
                System.out.println("El numero menor de los introducidos es el: " + n2);
                
            }
            else{
                
                System.out.println("El numero menor de los introducidos es el: " + n3);
                
            }
            
        }
        
    }
    
}
