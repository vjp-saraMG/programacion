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
public class E03T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        rueda1.establecerMaterial("caucho");
        rueda1.establecerPulgadas(7);
        
        rueda2.establecerMaterial("caucho");
        rueda2.establecerPulgadas(8);
        
        System.out.println("Rueda 1: ");
        System.out.println("Material: " + rueda1.obtenerMaterial());
        System.out.println("Pulgadas: " + rueda1.obtenerPulgadas());
        
        System.out.println("Rueda 2: ");
        System.out.println("Material: " + rueda2.obtenerMaterial());
        System.out.println("Pulgadas: " + rueda2.obtenerPulgadas());
        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        coche1.establecerMarca("Audi");
        coche1.establecerModelo("A3");
        
        coche2.establecerMarca("Citroen");
        coche2.establecerModelo("C4");
        
        coche3.establecerMarca("Ford");
        coche3.establecerModelo("Fiesta");
        
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda1);
        coche3.establecerRueda(rueda2);
        
        System.out.println("Coche 1: ");
        System.out.println("Marca: " + coche1.obtenerMarca());
        System.out.println("Modelo: " + coche1.obtenerModelo());
        System.out.println("Material de la rueda: " + coche1.obtenerRueda().obtenerMaterial());
        System.out.println("Tamaño de la rueda: " + coche1.obtenerRueda().obtenerPulgadas());
        
        System.out.println("Coche 2: ");
        System.out.println("Marca: " + coche2.obtenerMarca());
        System.out.println("Modelo: " + coche2.obtenerMarca());
        System.out.println("Material de la rueda: " + coche2.obtenerRueda().obtenerMaterial());
        System.out.println("Tamaño de la rueda: " + coche2.obtenerRueda().obtenerPulgadas());
        
        System.out.println("Coche 3: ");
        System.out.println("Marca: " + coche3.obtenerMarca());
        System.out.println("Modelo: " + coche3.obtenerModelo());
        System.out.println("Material de la rueda: " + coche3.obtenerRueda().obtenerMaterial());
        System.out.println("Tamaño de la rueda: " + coche3.obtenerRueda().obtenerPulgadas());
    }
    
}
