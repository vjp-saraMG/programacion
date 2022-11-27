/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e16t3;

/**
 *
 * @author sara
 */
public class E16T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, resto, totalImp;
        
        System.out.println("Los numeros impares existentes entre el 20 y el 160 son: ");
        
        for (num1 = 20; num1 <=120;num1 ++){
            
            resto = num1 % 2;
            
            if (resto == 1){
                System.out.print(num1 + " - ");
            }
            
        }
        
        System.out.print("\n La cantidad de numeros impares impresos ha sido: ");
       
        num1 = 20; num2 = 121;
        
        totalImp = (num2 - num1) / 2;
        
        System.out.println(totalImp);
        
        
        
        
        
    }
    
}
