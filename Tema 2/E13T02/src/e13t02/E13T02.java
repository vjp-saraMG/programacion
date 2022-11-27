/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e13t02;

/**
 *
 * @author sara
 */
public class E13T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        
            System.out.println("La variable num1 contiene el valor " +num1+ " y la variable num2 "
                + "contiene el valor " + num2);
        
        int aux = num1; 
        num1 = num2; // como ya se han declarado previamente no hay que volver a poner el tipo de dato
        num2=aux; 
        
        /* la variable auxiliar adquiere el valor de num1. Si se pone primero el num2=aux, la variable
        num2 pasa a tener el valor de la variable auxiliar (el valor de num1), y entonces el num1, al
        poner num1 = num2, pasaria a tener el valor de num1 otra vez, porque la variable num2 ha 
        cambiado su valor previamente al tener el valor de la auxiliar.
        */
        
            System.out.println("Ahora, la variable num1 contiene el valor " +num1+ 
                    " y la variable num2 "
                + "contiene el valor " + num2);

        
    }
    
}
