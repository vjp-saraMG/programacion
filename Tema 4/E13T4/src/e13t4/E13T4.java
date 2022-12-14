/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e13t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E13T4 {
    
    public static int pedirNumero(){
        int numero;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero: ");
            numero = entrada.nextInt();
            if(esMenor(numero)){
                System.out.println("Error. El numero introducido debe ser mayor que 1");
            }
        }while(numero < 1);
        return numero;
    }
    
    public static boolean esMenor (int numero){
        return numero < 1;     
        /** 
         * boolean menor;
         if (numero < 1){
            menor = true;
        }
        else{
            menor = false;
        }
        return menor;
        */
    }
    
    public static void mostrarResultado(int resultado, boolean esPrimero){
        if (esPrimero == true){
            System.out.println("Los numeros existentes son: ");
            System.out.println(resultado);
        }
        else{
            System.out.println(resultado);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        boolean primero = true;
        
        for (int i = 1; i <= numero; i++){
            if (i % 2 == 0){
                mostrarResultado(i, primero);
                primero = false;
            }
        }
    }
    
}
