/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e20t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E20T4 {
    final static String RESPUESTA1 = "Madrid";
    final static String RESPUESTA2 = "Colon";
    
    public static String primeraPregunta(){
        String respuesta;
        Scanner entrada = new Scanner (System.in);
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        respuesta = entrada.next();
        return respuesta;
    }
    
    public static boolean comprobacionPrimeraPregunta(String respuesta){
        boolean correcto;
        correcto = respuesta.equals(RESPUESTA1);
        if (correcto == true){
            System.out.println("Muy bien, la respuesta es correcta.");
        }
        else{
            System.out.println("No es correcto. La respuesta correcta seria " + RESPUESTA1);
        }
        return correcto;
    }
    
    public static String segundaPregunta(){
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?: ");
        respuesta = entrada.next();
        return respuesta;
    }
    
    public static boolean comprobacionSegundaPregunta (String respuesta){
        boolean correcto;
        correcto = respuesta.equals(RESPUESTA2);
        if (correcto == true){
            System.out.println("Muy bien, la respuesta es correcta.");
        }
        else{
            System.out.println("No es correcto. La respuesta correcta seria " + RESPUESTA2);
        }
        return correcto;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta1, respuesta2;
        int nota = 0;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        respuesta1 = primeraPregunta();
        if(comprobacionPrimeraPregunta(respuesta1)){
            nota = nota + 5;
        }
        respuesta2 = segundaPregunta();
        if(comprobacionSegundaPregunta(respuesta2)){
            nota = nota + 5;
        }
        System.out.println("Nota del examen: " + nota);
    }
    
}
