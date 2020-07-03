/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

import Carga.Datos;

/**
 *
 * @author GEUZ99
 */
public class Nodo {

    private Datos datos;    
    private Nodo siguiente;  

    public Nodo(Datos datos) {
       
        this.siguiente = null;
        this.datos = datos;
    }  
   

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }


}
