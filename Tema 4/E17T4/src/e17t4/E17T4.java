/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e17t4;
import java.util.Scanner;
/**
 *
 * @author smahiag01
 */
public class E17T4 {
    
    public static char pedirLetra(){
        Scanner entrada = new Scanner(System.in);
        char letra;
        System.out.println("Introduce una letra: ");
        letra = entrada.nextLine().charAt(0);
        return letra;
    }
    
    public static int generarLetraAleatoria(){
        double aleatorio = Math.random()*(122-97) + 97;
        int letraAleatoriaEntera = (int) aleatorio;
        char letraUsuario = (char) letraAleatoriaEntera;
        return letraAleatoriaEntera;
    }
    
    public static int comprobarResultado(char letraUsuario, char letraAleatoriaEntera){
        //letraUsuario = (char) letraAleatoriaEntera;
        //System.out.println(letraAleatoriaEntera);
        if (letraUsuario == letraAleatoriaEntera){
            System.out.println("¡Enhorabuena! Has acertado.");
        }
        else{
            if (letraUsuario > letraAleatoriaEntera){
                System.out.println("La letra que tienes que adivinar está antes que la que has introducido.");
            }
            else{
                System.out.println("La letra que tienes que adivinar está después que la que has introducido.");
            }
        }
        return letraAleatoriaEntera;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letraUsuario;
        char letraAleatoria = (char) generarLetraAleatoria();
        int contador = 0;
        
        do{
            letraUsuario = pedirLetra();
            comprobarResultado(letraUsuario, letraAleatoria);
            contador = contador + 1;
        }while(letraUsuario != letraAleatoria);
        
        System.out.println("El numero de intentos que has necesitado es de: " + contador);

    }
    
}
