/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e15t4;
import java.util.Scanner;
/**
 *
 * @author smahiag01
 */
public class E15T4 {
    public static int pedirNumero(){
        int numero;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduce un numero: ");
        numero = entrada.nextInt();
        return numero;
    }
    
    public static void mostrarMenu(){
        System.out.println("1.- Sumar los numeros");
        System.out.println("2.- Restar los numeros");
        System.out.println("3.- Multiplicar los numeros");
        System.out.println("4.- Dividir los numeros");
        System.out.println("5.- Salir del programa");
    }
    
    public static int seleccionarOpcion(){
        int opcion;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Opcion: ");
        opcion = entrada.nextInt();
        return opcion;
    }
    
    public static boolean comprobarOpcion(int opcion){
        boolean salir;
        if  (opcion == 5){
            salir = true;
        }
        else{
            salir = false;
        }
        return salir;
    }
    
    public static void sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        System.out.println("El resultado es: " + suma);
    }
    
    public static void restar (int numero1, int numero2){
        int resta = numero1 - numero2;
        System.out.println("El resultado es: " + resta);
    }
    
    public static void multiplicar (int numero1, int numero2){
        int multiplicacion = numero1 * numero2;
        System.out.println("El resultado es: " + multiplicacion);
    }
    
    public static void dividir (int numero1, int numero2){
        int division;
        try {
            division = numero1 / numero2;
            System.out.println("El resultado es: " + division);
        }
        catch(ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            division = 0;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, opcion;
        numero1 = pedirNumero();
        numero2 = pedirNumero();
        /*mostrarMenu();
        opcion = seleccionarOpcion();
        
        while (comprobarOpcion(opcion) == false){
            switch (opcion){
                case 1: 
                    sumar (numero1, numero2);
                    break;
                case 2: 
                    restar (numero1, numero2);
                    break;
                case 3: 
                    multiplicar (numero1, numero2);
                    break;
                case 4: 
                    dividir (numero1, numero2);
                    break;
                case 5: 
                    System.out.println("Adios");
                    break;
                default: 
                    System.out.println("Debes introducir una opcion valida");
                
            }
            mostrarMenu();
            opcion = seleccionarOpcion();
        }*/
        
        do{
            mostrarMenu();
            opcion = seleccionarOpcion();
        
            switch (opcion){
                case 1: 
                    sumar (numero1, numero2);
                    break;
                case 2: 
                    restar (numero1, numero2);
                    break;
                case 3: 
                    multiplicar (numero1, numero2);
                    break;
                case 4: 
                    dividir (numero1, numero2);
                    break;
                case 5: 
                    System.out.println("Adios");
                    break;
                default: 
                    System.out.println("Debes introducir una opcion valida");
                
            }
        }while(comprobarOpcion(opcion) == false);
    }
}
