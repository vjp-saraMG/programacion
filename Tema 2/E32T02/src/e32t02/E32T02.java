/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e32t02;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class E32T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cartera, carteraAux, billetes50, billetes20, billetes10, billetes5,
                monedas2, monedas1;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        
        carteraAux = entrada.nextInt();
        cartera = carteraAux;
        
        billetes50 = cartera / 50;
        cartera = cartera % 50;
        
        billetes20 = cartera / 20;
        cartera = cartera % 20;
        
        billetes10 = cartera / 10;
        cartera = cartera % 10;
        
        billetes5 = cartera / 5;
        cartera = cartera % 5;
        
        monedas2 = cartera / 2;
        cartera = cartera % 2;
        
        monedas1 = cartera / 1;
        
        
        System.out.println(carteraAux + " se descomponen en " + billetes50 +
                " billetes de 50, " + billetes20 + " billetes de 20, " 
        + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " 
        + monedas2 + " monedas de 2 euros y " + monedas1 + " monedas de 1 euro.");
        
        
    }
    
}
