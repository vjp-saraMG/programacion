/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e15t02;

/**
 *
 * @author sara
 */
public class E15T02 {

    final static int SESENTA = 60;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tiempo = 10000, seg, min, horas;
        
        //Calculamos los segundos de pico (40 segundos)
        seg = tiempo % SESENTA;
        
        //Convertimos los segundos que son convertibles a minutos (166 segundos)
        tiempo = tiempo / SESENTA;
        
        //Calculamos los minutos
        min = tiempo % SESENTA;
        
        //Calculamos las horas
        horas = tiempo / SESENTA;
        
        //Mostramos el resultado
        System.out.println("10000 segundos equivale a "+horas+" horas, "
                +min+" minutos y "+seg+" segundos.");
        
    }
    
}
