/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e24t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E24T4 {
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner (System.in);
        String nombre;
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.next();
        return nombre;
    }
    
    public static int pedirEdad(){
        Scanner entrada = new Scanner (System.in);
        int edad;
        System.out.println("Ahora introduce tu edad: ");
        edad = entrada.nextInt();
        return edad;
    }
    
    public static boolean mayorDeEdad(int edad){
        boolean esMayor;
        if (edad >= 18){
            esMayor = true;
        }
        else{
            esMayor = false;
        }
        return esMayor;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        boolean esMayor;
        nombre = pedirNombre();
        edad = pedirEdad();
        if (mayorDeEdad(edad) == true){
            System.out.println("El usuario llamado " + nombre + " es mayor de edad");
        }
        else{
            System.out.println("El usuario llamado " + nombre + " es menor de edad");
        }
    }
    
}
