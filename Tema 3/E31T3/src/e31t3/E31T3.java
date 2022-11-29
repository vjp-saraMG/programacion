/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31t3;

/**
 *
 * @author sara
 */
public class E31T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double aleatorio1, aleatorio2, aleatorio3, contador = 0;
        
        
        do {
            
           aleatorio1 = Math.floor((Math.random()*100+1));
           
           aleatorio2 = Math.floor((Math.random()*100+1));
           
           aleatorio3 = Math.floor((Math.random()*100+1));


           int aleatorioEntero1 = (int) aleatorio1;
           
           int aleatorioEntero2 = (int) aleatorio2;
           
           int aleatorioEntero3 = (int) aleatorio3;
           
           if (aleatorio1 % 2 == 1 && aleatorio2 % 2 == 1 && aleatorio3 % 2 == 1){
               
               System.out.println("Los tres numeros impares generados son: " + aleatorio1 + aleatorio2 + aleatorio3);
               
               System.out.println("La cantidad de valores aleatorios que se han generado hasta obtener los tres numeros impares es de " + contador + " valores");
               
           }
            
           contador = contador + 1;
            
        }while(aleatorio1 % 2 != 1 && aleatorio2 != 1 && aleatorio3 != 1);
        
        
    }
    
}
