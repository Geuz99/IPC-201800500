/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author GEUZ99
 */
public class Nodo {
    
    private DatosPila datos;
    Nodo siguiente;

    public Nodo(DatosPila datos) {
        this.datos = datos;
        this.siguiente = null;
    }

    public DatosPila getDatos() {
        return datos;
    }

    public void setDatos(DatosPila datos) {
        this.datos = datos;
    }
    
    
}
