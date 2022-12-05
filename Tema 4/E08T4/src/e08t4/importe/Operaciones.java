/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e08t4.importe;

/**
 *
 * @author sara
 */
public class Operaciones {
    
    public static void calcular(int monedero, int monederoAux, int billetes50, int billetes20, int billetes10, int monedas2, int monedas1){
        
        monederoAux = monedero;
        
        billetes50 = monedero / 50;
        monedero = monedero % 50;
        
        billetes20 = monedero / 20;
        monedero = monedero % 20;
        
        billetes10 = monedero / 10;
        monedero = monedero % 10;
        
        monedas2 = monedero / 2;
        monedero = monedero % 2;
        
        monedas1 = monedero / 1;
        
        System.out.println(monederoAux + " euros se descomponen en: ");
        
        if(billetes50 != 0){
            
            System.out.println("Billetes de 50: " + billetes50);
            
        }
        
        if (billetes20 != 0){
            
            System.out.println("Billetes de 20: " + billetes20);
            
        }
        
        if (billetes10 != 0){
            
            System.out.println("Billetes de 10: " + billetes10);
            
        }
        
        if(monedas2 != 0){
            
            System.out.println("Monedas de 2 euros: " + monedas2);
            
        }
        
        if(monedas1 != 0){
            
            System.out.println("Monedas de 1 euro: " + monedas1);
            
        }
        
    }  
}
