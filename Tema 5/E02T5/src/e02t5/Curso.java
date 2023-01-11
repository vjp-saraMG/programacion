/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e02t5;

/**
 *
 * @author sara
 */
public class Curso {
    private static int numeroDeCursos = 0;
    private String nombre;
    private int numeroHoras;
    
    public void establecerNombreyHoras(String n, int h){
        nombre = n;
        numeroHoras = h;
        sumarCursos();
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerHoras(){
        return numeroHoras;
    }
    
    public static void sumarCursos(){ //Es static porque el atributo con el que trabaja es estático también, si no lo fuera, habría que crearse un objeto para poder usarlos.
        numeroDeCursos ++;
    }
    
    public static int verNumeroCursos(){
        return numeroDeCursos;
    }
    
    
}
