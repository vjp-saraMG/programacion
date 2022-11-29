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
        
        double aleatorio, contador = 0, contImp = 0;
           
        do {
            
           aleatorio = Math.floor((Math.random()*100+1));
      
           int aleatorioEntero = (int) aleatorio;
           
           
           if (aleatorio % 2 == 1){
               
               System.out.println("Los tres numeros impares generados son: " + aleatorio);
               
               System.out.println("La cantidad de valores aleatorios que se han generado hasta obtener los tres numeros impares es de " + contador + " valores");
               
           }
           
           contador = contador + 1;
           
           contImp = contImp + 1;

        }while(contImp > 3);
        
        
    }
    
}
