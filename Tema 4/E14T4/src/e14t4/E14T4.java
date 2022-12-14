/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e14t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E14T4 {
    public static int pedirNumero(){
        int numero;
        Scanner entrada = new Scanner (System.in);
        do{
            System.out.println("Introduce un numero: ");
            numero = entrada.nextInt();
            if(esMenor(numero)){
                System.out.println("Error. El numero introducido debe ser mayor que 0");
            }
        }while(numero <= 0);
        return numero;
    }
    
    public static boolean esMenor(int numero){
        return numero <= 0;
    }
    
    public static int operacionesMostrarResultado(int numero){
        int contador = 0;
        
        System.out.println("Los numeros multiples de 3 son los siguientes: ");
        
        for(int i = 1; i <= numero; i++){
            if(i % 3 == 0){
                System.out.println(i);
                contador = contador + 1;
            }
        }
        System.out.println("El total de numeros mostrados es: " + contador);
        return numero;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = pedirNumero();
        operacionesMostrarResultado(numero);
    }
    
}
