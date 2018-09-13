/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc2.proyecto1_2s_201408603;

/**
 *
 * @author Cardona
 */
public class SheetOpciones implements Comparable<SheetOpciones>{
    
    String nombre="";
    String valor="";
    int posicion=0;
    int orden =0;
    public SheetOpciones() {
    }

  
    public SheetOpciones(String nombre,String valor, int posicion) {
        this.nombre = nombre;
        this.valor = valor;
        this.posicion = posicion;
    }
   @Override
        public int compareTo(SheetOpciones o) {
            if (orden < o.orden) {
                return -1;
            }
            if (orden > o.orden) {
                return 1;
            }
            return 0;
        }
    
    
}

