/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e26t4;
import java.util.Scanner;
/**
 *
 * @author smahiag01
 */
public class E26T4 {
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("Introduce un numero: ");
        numero = entrada.nextInt();
        return numero;
    }
    
    public static boolean esPrimo (int numero){
        int contador = 2;
        boolean primo = true;
        while(primo && contador != numero){
            if (numero%contador == 0){
                primo = false;
            }
            else{
                contador = contador + 1;
            }
        }
        return primo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = pedirNumero();
        
        if (esPrimo(numero)){
            System.out.println("El " + numero + " es primo");
        }
        else{
            System.out.println("El " + numero + " NO es primo");
        }
        
        
    }
    
}
