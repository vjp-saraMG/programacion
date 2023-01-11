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
public class E02T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        
        curso1.establecerNombreyHoras("Programacion", 15);
        curso2.establecerNombreyHoras("Bases de Datos", 10);
        
        System.out.println("CURSO 1: ");
        System.out.println("Nombre: " + curso1.obtenerNombre());
        System.out.println("Numero de horas: " + curso1.obtenerHoras());
        
        System.out.println("CURSO 2: ");
        System.out.println("Nombre: " + curso2.obtenerNombre());
        System.out.println("Numero de horas: " + curso2.obtenerHoras());
        
        System.out.println("El numero de cursos almacenados es de " + Curso.verNumeroCursos());

    }
    
}
