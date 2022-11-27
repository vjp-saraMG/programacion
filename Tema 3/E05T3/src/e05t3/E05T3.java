/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e05t3;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E05T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, resto;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduce un numero: ");
        numero = entrada.nextInt();
        
        resto = numero % 2;
        
        if (resto == 1 || resto == -1){
            System.out.println("El numero introducido es impar."); 
        }
        
        else {
            System.out.println("El numero introducido es par.");
        }
        
    }
    
}
