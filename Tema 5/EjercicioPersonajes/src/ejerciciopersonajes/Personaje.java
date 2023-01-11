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
public class Personaje {
    private String nombre;
    private int fuerza;
    private int nivel;
    
    public String getNombre(){
        return nombre;
    }
    
    public int getFuerza(){
        return fuerza;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void setNombre (String nom){
        nombre = nom;
    }
    
    public void setFuerza (int f){
        fuerza = f;
    }
    
    public void setNivel (int n){
        nivel = n;
    }
}
