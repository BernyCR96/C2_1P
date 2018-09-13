/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc2.JAVACC;

import java.util.ArrayList;

/**
 *
 * @author Cardona
 */
public class Nodo {
    private String nombre;
    private String valor;

    public boolean isGrupo() {
        return grupo;
    }

    public void setGrupo(boolean grupo) {
        this.grupo = grupo;
    }

    public boolean isCiclo() {
        return ciclo;
    }

    public void setCiclo(boolean ciclo) {
        this.ciclo = ciclo;
    }
    private boolean grupo;
    private boolean ciclo;
    
    private ArrayList<Nodo> ListaHojas;

    public Nodo() {
        this.nombre = "";
        this.valor = "";
        
        this.ListaHojas = null;
    }

    private static Nodo unicaInstancia;
    public static Nodo obtenerInstancia(){
        if(unicaInstancia==null){
            unicaInstancia=new Nodo();
        }
        return unicaInstancia;
    }
    
    public Nodo(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.grupo = false;
        this.ciclo = false;
        this.ListaHojas = new ArrayList<>();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ArrayList<Nodo> getListaHojas() {
        return ListaHojas;
    }

    public void setListaHojas(Nodo valor) {
        this.ListaHojas.add(valor);
    }
    
    
}

