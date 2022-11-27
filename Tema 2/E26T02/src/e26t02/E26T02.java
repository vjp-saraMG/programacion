/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e26t02;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E26T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cifra1, cifra2, cifra3, cifra4, numero;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un numero de 4 cifras: ");
        numero = entrada.next();
        
        cifra1 = numero.substring(0, 1);
        System.out.println("La primera cifra es: " +cifra1);

        cifra2 = numero.substring(1, 2);
        System.out.println("La segunda cifra es: " +cifra2);
        
        cifra3 = numero.substring(2, 3);
        System.out.println("La tercera cifra es: " +cifra3);
        
        cifra4 = numero.substring(3, 4);
        System.out.println("La cuarta cifra es: " +cifra4);
       
    }
    
}
