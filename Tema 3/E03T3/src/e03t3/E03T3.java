/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e03t3;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E03T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, num3, mayor;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Por ultimo, introduzca un tercer numero: ");
        num3 = entrada.nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("El mayor numero de los introducidos es el: " + num1);
        }
        
        else {
            if (num2 > num1 && num2 > num3) {
                System.out.println("El mayor numero de los introducidos es el: " + num2);
            }
            else {
                System.out.println("El mayor numero de los introducidos es el: " + num3);
            }
                
        }
        
    }
    
}
