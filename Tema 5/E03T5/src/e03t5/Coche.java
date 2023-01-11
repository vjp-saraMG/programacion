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
public class Coche {
    private String marca;
    private String modelo;
    private Rueda ruedas;
    
    public void establecerMarca(String mar){
        marca = mar;
    }
    public void establecerModelo(String mod){
        modelo = mod;
    }
    public String obtenerMarca(){
        return marca;
    }
    public String obtenerModelo(){
        return modelo;
    }
    public void establecerRueda (Rueda rued){
        ruedas = rued;
    }
    public Rueda obtenerRueda(){
        return ruedas;
    }
}
