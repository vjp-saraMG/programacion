/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e17t3;
import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E17T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            int num;
            double resultado;

            Scanner entrada = new Scanner (System.in);

            System.out.println("Introduce un numero: ");
            num = entrada.nextInt();

            
            do {
                System.out.println("El numero introducido no es valido");
                System.out.println("Introduce un numero: ");
                num = entrada.nextInt();
            }while (num < 0);
            
            if (num > 0){

                do {

                resultado = Math.sqrt(num);
                System.out.println("La raiz cuadrada de " + num + " es " + resultado);

                }while(num == 1);

                }

            }

        }
