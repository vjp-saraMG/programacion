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

            
            do {
                System.out.println("Introduce un numero: ");
                
                num = entrada.nextInt();
                
                if (num < 0){
                    
                   System.out.println("El numero introducido no es valido");
                    
                }
                
            }while (num < 0);
            
            resultado = Math.sqrt(num);
            
            System.out.println("La raiz cuadrada de " + num + " es " + resultado);

            }

        }
