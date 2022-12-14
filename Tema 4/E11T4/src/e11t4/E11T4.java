/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e11t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E11T4 {
    public static int pedirNumero(){
        int numero;
        Scanner entrada = new Scanner (System.in);
        do{
            System.out.println("Introduce un numero: ");
            numero = entrada.nextInt();
            if(numero < 0){
                System.out.println("Error. El numero que has introducido no es valido.");
            }
        }while(numero < 0);
        return numero;
    }
    
    public static double raizCuadrada (double numero){
        return Math.sqrt(numero);
    }
    
    public static void mostrarResultado(double resultado){
        System.out.println("El resultado de la raiz cuadrada es " + resultado);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero;
        numero = pedirNumero();
        numero = raizCuadrada(numero);
        mostrarResultado(numero);
    }
    
}
