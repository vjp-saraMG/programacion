/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e13t3;

/**
 *
 * @author sara
 */
public class E13T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 11, resto;
        
        
        
        while (numero <= 133){
            
            resto = numero % 2;
            
            if (resto == 0){
                System.out.println(numero);
            }
            numero ++;
        }
        
    }
    
}
