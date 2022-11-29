/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e28t3;

/**
 *
 * @author sara
 */
public class E28T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double aleatorio = Math.floor((Math.random()*100+1));
        
        int aleatorioEntero = (int) aleatorio;
        
        System.out.println(aleatorio);
        
        if (aleatorio % 2 == 0) {
            
            System.out.println("El numero introducido es par");
            
        }
        else {
            
            System.out.println("El numero introducido es impar");
            
        }
        
        
        
    }
    
}
