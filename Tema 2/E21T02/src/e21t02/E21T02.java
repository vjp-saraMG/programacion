/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e21t02;
import java.util.Scanner;
/**
 *
 * @author smahiag01
 */
public class E21T02 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dias, horas, min, seg, tiempo, tiempoUsuario;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un numero de segundos: ");
        
        tiempoUsuario = entrada.nextInt();
       
        tiempo = tiempoUsuario;
        
        //Calculamos los segundos de pico que no llegan a 60 segundos
        seg = tiempo % 60;
        
        //Convertimos los segundos que son convertibles a minutos y nos quedamos con los minutos que hay en total
        tiempo = tiempo / 60;
        
        //Calculamos los minutos pico que no llegan a hacer 1 hora exacta
        min = tiempo % 60;
        
        //Calculamos las horas en total y que son convertibles a dias
        tiempo = tiempo / 60;
        
        //Calculamos las horas que no llegan a formar un dia completo, que son 24 h
        horas = tiempo % 24;
        
        //Calculamos los dias en total
        dias = tiempo / 24;
        
       
        System.out.println(tiempoUsuario + " segundos hacen un total de: " +dias+ " dias, "
        +horas+ " horas, " +min+ " minutos y " +seg+ " segundos.");
        
        
        
        
        
    }
    
}
