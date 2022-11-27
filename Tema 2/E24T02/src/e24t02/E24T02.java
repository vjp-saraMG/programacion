/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e24t02;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E24T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    float programacion, LMSGI, BBDD, ENTDL, SSINF, FOL, nota, notamedia;
        
    Scanner entrada = new Scanner(System.in);
        
       System.out.println("Por favor, introduzca la nota de Programacion: ");
         programacion = entrada.nextFloat();
        
       System.out.println("Introduzca la nota de Lenguajes de"
                + " Marcas: ");
         LMSGI = entrada.nextFloat();
        
       System.out.println("Introduzca la nota de Bases de Datos: ");
         BBDD = entrada.nextFloat();
        
       System.out.println("Introduzca la nota de Entornos de "
               + "Desarrollo: ");
        ENTDL = entrada.nextFloat();
        
       System.out.println("Introduzca la nota de Sistemas "
                + "Informaticos: ");
        SSINF = entrada.nextFloat();
        
       System.out.println("Por ultimo, introduzca la nota de Formacion y "
               + "Orientacion Laboral: ");
        FOL = entrada.nextFloat();
        
     nota = programacion + LMSGI + BBDD + ENTDL + SSINF + FOL;
     notamedia = nota / 6;
     
        System.out.println("Su nota media del curso es de: " + notamedia);
       
       
        
    }
    
}
