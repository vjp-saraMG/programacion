/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e01t3;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E01T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        numero = entrada.nextInt();
        
        if (numero < 0) {
            System.out.println("El numero introducido es negativo");
        }
        else {
            System.out.println("El numero introducido es positivo");
        }
        
        
        
        
    }
    
}
