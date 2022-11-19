/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e20t02;
import java.util.Scanner; // el programa usa la clase Scanner

// Programa que muestra la suma de dos enteros

/**
 *
 * @author smahiag01
 */
public class E20T02 {

    // el método main empieza la ejecución de la aplicación en Java
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner (System.in);
        
        double numero1; // primer número a sumar
        double numero2; //segundo número a sumar
        int suma; //suma de numero1 y numero2 haciendo cast (conversión explícita)
        
        System.out.println("\t Escriba el primer entero "); //indicador
        numero1 = entrada.nextInt();
        System.out.println("\t Escriba el segundo entero "); //indicador
        numero2 = entrada.nextFloat(); //lee el segundo número del usuario
        
        suma = (int) numero1 + (int) numero2; //suma los dos números
        /**
         * Hay que poner el paréntesis entre la suma 
         * porque si no los pones solamente se aplicaría al primer número, o
         * bien ponérselo a cada número.
         */
        System.out.println("La suma es: " + suma); //muestra la suma
        
    }
    
}
