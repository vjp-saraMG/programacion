/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e08t4;

import e08t4.importe.Operaciones;
import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E08T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int importe;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduce una cantidad de dinero: ");
        importe = entrada.nextInt();
        
        Operaciones.calcular(importe, importe, importe, importe, importe, importe, importe);
        
    }
    
}
