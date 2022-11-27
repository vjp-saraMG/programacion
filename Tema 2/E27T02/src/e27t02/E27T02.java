/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e27t02;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E27T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, doble, cubo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un numero: ");
        
        num = entrada.nextInt();
        
        doble = num * num;
        
        System.out.println("El doble de " + num + " es: " + doble);
        
        cubo = num * num * num;
        
        System.out.println("El cubo de " + num + " es: " + cubo);
        
    }
    
}
