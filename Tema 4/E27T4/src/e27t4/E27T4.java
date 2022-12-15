/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e27t4;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E27T4 {
    
    public static String pedirMoneda(){
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        System.out.println("Cara o Cruz: ");
        respuesta = entrada.next();
        return respuesta;
    }
    
    public static String generarMoneda(){
        int aleatorioEntero;
        double aleatorio = (Math.random()*2+1);
        String resultado;
        aleatorioEntero = (int) aleatorio;
        if(aleatorioEntero == 1){
            resultado = "Cara";
            System.out.println("Ha salido Cara");
        }
        else{
            resultado = "Cruz";
            System.out.println("Ha salido Cruz");
        }
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta, resultado;
        
        do{
            respuesta = pedirMoneda();
            resultado = generarMoneda();
            if(respuesta.equals(resultado)){
                System.out.println("Enhorabuena! Has acertado");
            }
            else{
                System.out.println("Lo siento. Has perdido");
            }
        }while(!respuesta.equals(resultado));
        
    }
    
}
