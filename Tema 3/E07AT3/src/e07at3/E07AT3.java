/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e07at3;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class E07AT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota1, nota2, nota3, nota4, nota5, nota6, nota7, contadorA = 0, contadorS = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota: ");
        nota1 = entrada.nextInt();
        
        System.out.println("Introduce la segunda nota: ");
        nota2 = entrada.nextInt();
        
        System.out.println("Introduce la tercera nota: ");
        nota3 = entrada.nextInt();
        
        System.out.println("Introduce la cuarta nota: ");
        nota4 = entrada.nextInt();
        
        System.out.println("Introduce la quinta nota: ");
        nota5 = entrada.nextInt();
        
        System.out.println("Introduce la sexta nota: ");
        nota6 = entrada.nextInt();
        
        System.out.println("Introduce la ultima nota: ");
        nota7 = entrada.nextInt();
        
        if (nota1 <= 4){
            
            contadorS = contadorS + 1;
            
        }
        else {
            
            contadorA = contadorA + 1;
            
        }
        if (nota2 <= 4){
            
            contadorS = contadorS + 1;
            
        }
        else{
            
            contadorA = contadorA + 1;
            
        }
        if (nota3 <= 4){
            
            contadorS = contadorS + 1;
            
        }
        else {
            
            contadorA = contadorA + 1;
            
        }
        if (nota4 <= 4){
            
            contadorS = contadorS + 1;
            
        }
        else {
            
            contadorA = contadorA + 1;
            
        }
        if (nota5 <= 4){
            
            contadorS = contadorS + 1;
            
        }
        else {
            
            contadorA = contadorA + 1;
            
        }
        if (nota6 <= 4){
            
            contadorS = contadorS + 1;
            
        }
        else {
            
            contadorA = contadorA + 1;
            
        }
        if (nota7 <= 4){
            
            contadorS = contadorS + 1;
            
        }
        else {
            
            contadorA = contadorA + 1;
            
        }
        
        System.out.println("Total de modulos suspendidos: " + contadorS);
        System.out.println("Total de modulos aprobados: " + contadorA);

    }
    
}
