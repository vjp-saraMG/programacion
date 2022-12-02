/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e03t4.mayor;

/**
 *
 * @author smahiag01
 */
public class Mayor {
    
    public static void mayor (int n1, int n2, int n3){
        
        if (n1 > n2 && n1 > n3){
            
            System.out.println("El numero mayor de los introducidos es " + n1);
            
        }
        else {
            
            if (n2 > n1 && n2 > n3){
                
                System.out.println("El numero mayor de los introducidos es " + n2);
                
            }
            else {
                
                System.out.println("El numero mayor de los introducidos es " + n3);
                
            }
            
        }
        
    }
    
}
