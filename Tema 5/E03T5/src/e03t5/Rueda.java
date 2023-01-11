/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e03t5;

/**
 *
 * @author sara
 */
public class Rueda {
    private String material;
    private int pulgadas;
    
    public void establecerMaterial (String mat){
        material = mat;
    }
    public void establecerPulgadas (int pul){
        pulgadas = pul;
    }
    public String obtenerMaterial(){
        return material;
    }
    public int obtenerPulgadas(){
        return pulgadas;
    }
}
