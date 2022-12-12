/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e09t4;

/**
 *
 * @author sara
 */
public class Comparador {
    public static void compararNumeros(int numero1, int numero2, int numero3){
        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("El menor de los numeros es: " + numero1);
        }
        else{
            if(numero2 < numero1 && numero2 < numero3){
                System.out.println("El menor de los numeros es: " + numero2);
            }
            else{
                System.out.println("El menor de los numeros es: " + numero3);
            }
        }
    }
}
