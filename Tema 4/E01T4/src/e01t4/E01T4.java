/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e01t4;

import java.util.Scanner;

/**
 *
 * @author smahiag01
 */
public class E01T4 {
    
    public static void esPositivo(int n){
    
        /**
        * Necesita un número este método para saber si es positivo o no, por ello entre paréntesis se le añade un parámetro,
        * En este caso un número. Para saber si es positivo o no, hay que saber si es mayor o menor que cero.
        */
        
        if (n > 0){
            
            System.out.println("Es positivo");
        }
        
        else {
            
            if (n < 0){
                
                System.out.println("Es negativo");
                
            }
            else {
                
                System.out.println("Es cero");
                
            }
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int num;
        
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        
        // Una vez hecho el método arriba, simplemente tenemos que llamar al método.
        
        esPositivo(num); // En vez de poner todas las líneas del método aquí, se llama al método directamente y es más corto.
        
    // El nombre dado a la variable es indiferente, lo importante es el tipo de dato. Si pide un int, no se le puede dar un float.
        
    }
    
}
