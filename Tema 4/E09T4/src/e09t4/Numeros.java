/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e09t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class Numeros {
    public static int pedirNumeros(){
        int numero;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        numero = entrada.nextInt();
        return numero;
    }
}
