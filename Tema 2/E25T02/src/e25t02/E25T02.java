/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e25t02;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E25T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, suma, producto;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        suma = num1 + num2 + num3;
        System.out.println("La suma de los numeros introducidos es: " + suma);
        
        producto = num1 * num2 * num3;
        System.out.println("El producto de los numeros introducidos es: "
            + producto);
        
    }
    
}
