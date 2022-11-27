/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e25t3;

/**
 *
 * @author sara
 */
public class E25T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, sumaPares = 0;
        
        for (numero = 17; numero < 139; numero++) {
            
            if  (numero % 2 == 0){
                
                sumaPares = sumaPares + numero;
            }
        }
        System.out.println("La suma de los pares entre 17 y 139: "+ sumaPares);

    }
    
}
