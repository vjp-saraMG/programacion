/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e27t3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E27T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion, num1, num2;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduce un numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduce un segundo numero: ");
        num2 = entrada.nextInt();
        
        do {
        
            System.out.println("1.- Sumar los numeros");
            System.out.println("2.- Restar los numeros");
            System.out.println("3.- Multiplicar los numeros");
            System.out.println("4.- Dividir los numeros");
            System.out.println("5.- Salir del programa");

            System.out.println("Por favor, elige una opcion: ");
            opcion = entrada.nextInt();


            switch(opcion){

                case 1: {

                    System.out.println("El resultado es " + (num1 + num2));
                }

                break;

                case 2: {

                    System.out.println("El resultado es " + (num1 - num2));
                }

                break;

                case 3: {

                    System.out.println("El resultado es " + (num1 * num2));
                }

                break;

                case 4: {

                    System.out.println("El resultado es " + (num1 / num2));
                }

                break;

                default: {

                    System.out.println("Adios");
                }

                break;

            }
        
        }while(opcion != 5);
    }
    
}
