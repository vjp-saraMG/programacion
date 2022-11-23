/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e18t3;

import java.util.Scanner;

/**
 *
 * @author smahiag01
 */
public class E18T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int password = 1234, intento, veces = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        do {
            
            System.out.println("Por favor, introduce tu contraseña: ");
            intento = entrada.nextInt();
            
            veces ++;
            
            if (password != intento){
                
                System.out.println("La contraseña no es correcta");
                
            }
            
            else{
                
                System.out.println("¡Enhorabuena!");
                
            }
            

        }while(veces < 3);
        
        

        
        
        
        
        
        
        
        
        //if (intento == password){
            
           // System.out.println("¡Enhorabuena!");
            
       // }
       //  else{
            
            //if (intento != password){
                
                
               // do{
                    
                   // veces = veces + 1;
                    
                 //   System.out.println("Por favor, introduce tu contraseña");
                    
                 //   intento = entrada.nextInt();
                    
                  //  System.out.println("Error. La contraseña no es correcta.");
                    
             //   }while(veces < 3);
                
           // }
      //  }
        
    }
    
}
