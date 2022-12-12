/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e10t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E10T4 {
    public static int pedirNumero(){
        int numero;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduza un numero para calcular su tabla de multiplicar: ");
        numero = entrada.nextInt();
        return numero;
    }
    public static void tablaMultiplicar(int numero){
        int i, multiplicacion;
        for (i = 0; i <= 10; i++){
            multiplicacion = i * numero;
            System.out.println(numero + " x " + i + " = " + multiplicacion);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = pedirNumero();
        tablaMultiplicar(numero);
    }
    
}
