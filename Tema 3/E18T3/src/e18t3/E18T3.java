/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e18t3;
import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E18T3 {
    
    final static int PASSWORD = 1234;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int intento, veces = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        do {
            System.out.println("Escribe tu contraseña: ");
            
            intento = entrada.nextInt();
            
            veces = veces + 1;
            
            if (intento == PASSWORD){
                
                System.out.println("¡Enhorabuena!");
            }
            
            else{
                
                if(veces == 3) {
                
                System.out.println("Error. La contraseña no es correcta");
                
                }
            }
            
        }while(veces < 3 && intento != PASSWORD);
        
       }
    }
