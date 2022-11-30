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
        
        double aleatorio;
                
        int aleatorioEntero, contImp = 0, contador = 0;
           
        do {
            
           aleatorio = Math.floor((Math.random()*100+1));
      
           aleatorioEntero = (int) aleatorio;

           contador = contador + 1;
           
           if (aleatorioEntero % 2 == 1){
               
               System.out.println("Los numeros impares generados son: " + aleatorioEntero);
               
               contImp = contImp + 1;
               
           }

        }while(contImp < 3);
        
        System.out.println("Intentos que se han necesitado para obtener los tres numeros impares: " + contador + " intentos");
        
    }
    
}
