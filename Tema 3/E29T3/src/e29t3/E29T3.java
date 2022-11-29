/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e29t3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E29T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double aleatorio = Math.floor((Math.random()*100+1));
        
        int aleatorioEntero = (int) aleatorio, intento, contador = 0;
        
        //System.out.println(aleatorio);
        
        Scanner entrada = new Scanner (System.in);
        
        do{
            
            System.out.println("Intenta adivinar el numero: ");
            
            intento = entrada.nextInt();
            
            if (intento != aleatorio){
                
                if (aleatorio < intento){
                    
                    System.out.println("El numero que tienes que adivinar es menor que el numero que has introducido");
                    
                }
                
                else{
                    
                    System.out.println("El numero que tienes que adivinar es mayor que el numero que has introducido");
                    
                }
 
            }
            
            contador = contador + 1;
            
            if (intento == aleatorio){
                
                System.out.println("¡Enhorabuena! Has acertado el numero.");
                
                System.out.println("Para ello has necesitado " + contador + " intentos.");
                
            }
            
        }while(intento != aleatorio);
        
    }
    
}
