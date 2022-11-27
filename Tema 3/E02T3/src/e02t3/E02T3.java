/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e02t3;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E02T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, producto, suma;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        if (num1 > 10) {
            producto = num1 * num2;
            System.out.println("La operacion que se realizo es un producto y el resultado es " + producto);
        }
        else {
            suma = num1 + num2;
            System.out.println("La operacion que se realizo es una suma y el resultado es " + suma);
        }
        
        
    }
    
}
