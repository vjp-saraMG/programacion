/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e18t4;
import java.util.Scanner;
/**
 *
 * @author smahiag01
 */
public class E18T4 {
    public static String pedirNombre(){
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.next();
        return nombre;
    }
    
    public static String mostrarNombre(String nombre){
        for (int i = 1; i <= 5; i++){
            System.out.println(nombre);
        }
        return nombre;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        nombre = pedirNombre();
        mostrarNombre(nombre);

    }
    
}
