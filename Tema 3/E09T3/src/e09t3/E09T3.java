/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e09t3;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E09T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, num3, num4, aux, contador;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        System.out.println("Por ultimo, introduzca un cuarto numero: ");
        num4 = entrada.nextInt();
        
        
        for (contador=1;contador<4;contador++){
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num2 > num3){
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
            if (num3 > num4){
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
        System.out.println("El orden de los numeros introducidos es: " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
}
