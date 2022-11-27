/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e16t02;

/**
 *
 * @author sara
 */
public class E16T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cartera = 130;
        int billetes50;
        int billetes10;
        int carteraAux = cartera; 
        /* 
         * Hay que declarar una cartera auxiliar para mantener 
         * el valor inicial de cartera (130)
        */
        
        billetes50 = cartera / 50; // se calculan los billetes de 50
        
        cartera = cartera % 50; 
        /* 
         * nos quedamos con el resto, porque el cociente 
         * serán los billetes de 50
         */
        
        billetes10 = cartera / 10; // se calculan los billetes de 10
        
        System.out.print(carteraAux+" euros hacen un total de: "+billetes50+
                         " billetes de 50 euros y "+billetes10+" billetes de 10 euros");
     
        
    }
    
}
