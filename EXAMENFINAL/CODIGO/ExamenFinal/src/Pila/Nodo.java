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

    private int id;
    Nodo siguiente;

    public Nodo(int id) {
        this.id = id;
        this.siguiente = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
