/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e23t02;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E23T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float precio;
        int unidad;
        float total;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el precio del modelo de "
                + "ordenador que desea comprar: ");
        
        precio = entrada.nextFloat();
        
        System.out.println("Cuantas unidades quiere llevarse? ");
        
        unidad = entrada.nextInt();
        
        total =  precio * unidad;
        
        System.out.println("El precio total de su compra es de: " + total);
        
    }
    
}
