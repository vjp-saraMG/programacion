/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e21t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E21T4 {
    
    public static int pedirPrimerNumero(){
        Scanner entrada = new Scanner(System.in);
        int numero1;
        System.out.println("Introduce un numero: ");
        numero1 = entrada.nextInt();
        return numero1;
    }
    
    public static int pedirSegundoNumero(int numero){
        Scanner entrada = new Scanner(System.in);
        int numero2;
        do{
            System.out.println("Introduce otro numero: ");
            numero2 = entrada.nextInt();
        }while(numero > numero2);
        return numero2;
    }
    
    public static void mostrarResultado(int numero1, int numero2){
        int totalPares = 0;
        for (int i = numero1; i <= numero2; i++){
            if (i % 2 == 0){
                totalPares = totalPares + i;
            }
        }
        System.out.println("Total: " + totalPares);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = pedirPrimerNumero();
        numero2 = pedirSegundoNumero(numero1);
        mostrarResultado(numero1, numero2);
    }
    
}
