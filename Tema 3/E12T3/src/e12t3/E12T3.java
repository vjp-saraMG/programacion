/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12t3;

/**
 *
 * @author sara
 */
public class E12T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 11, resto;

        do{
            resto = numero % 2;
            
            if(resto == 0){
                System.out.println(numero);
            }
            
            numero = numero + 1;
            
        }while (numero <= 133);
        
    }
    
}
