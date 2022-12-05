/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e08at3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E08AT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int notas, contadorA = 0, contadorS = 0, i;
        
        Scanner entrada = new Scanner(System.in);
        
        for (i = 0; i < 7; i++){
            
            System.out.println("Introduce una nota: ");
            notas = entrada.nextInt();
            
            if (notas < 0 && notas > 10){
                
                System.out.println("Error. La nota introducida no es valida.");
                
            }
            
            if (notas <= 4){
                
                contadorS = contadorS + 1;
                
            }
            else {
                
                contadorA = contadorA + 1;
                
            }

        }
        
        System.out.println("Total de modulos aprobados: " + contadorA);
        System.out.println("Total de modulos suspendidos: " + contadorS);

    }
    
}
