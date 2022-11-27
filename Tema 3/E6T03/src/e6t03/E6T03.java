/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e6t03;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E6T03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduce una nota: ");
        
        nota = entrada.nextInt();
        
        if (nota < 0 || nota > 10){
            System.out.println("La nota introducida no es valida");
        }
        
        else {
        
        if(nota >= 0 && nota <= 4) {
            System.out.println("Suspenso");
        }
        else {
            if (nota >= 5 && nota <= 6){
                System.out.println("Bien");
            }
            else {
                if (nota >= 7 && nota <= 8){
                    System.out.println("Notable");
                }
                else {
                        System.out.println("Sobresaliente");
                    }
                }
            }
        }
      }
    }
