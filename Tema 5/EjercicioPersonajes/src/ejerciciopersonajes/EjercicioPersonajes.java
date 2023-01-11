/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersonajes;

/**
 *
 * @author sara
 */
public class EjercicioPersonajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje personajeP1 = new Personaje();

        personajeP1.setNombre("B");
        personajeP1.setFuerza(10);
        personajeP1.setNivel(9);

        System.out.println("El nombre del personaje es " + personajeP1.getNombre());
        System.out.println("La fuerza del personaje es " + personajeP1.getFuerza());
        System.out.println("El nivel del personaje es " + personajeP1.getNivel());
        

    }
    
}
