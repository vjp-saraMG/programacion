/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e07t4;

/**
 *
 * @author sara
 */
public class Ordenar {
    
    public static void ordenar (int n1, int n2, int n3, int n4, int aux, int i){
        
        for (i = 1; i <= 3; i++){
            
            if (n1 > n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            if (n2 > n3){
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if (n3 > n4){
                aux = n3;
                n3 = n4;
                n4 = aux;
            }
            
        }

        System.out.println("El orden de los numeros introducidos es el: " + n1 + n2 + n3 + n4);
        
    }
    
}
