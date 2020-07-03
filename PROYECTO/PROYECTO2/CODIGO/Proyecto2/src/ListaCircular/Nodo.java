/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircular;

/**
 *
 * @author GEUZ99
 */
public class Nodo {
    
    private DatosDC datos;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(DatosDC datos) {
        this.datos = datos;
        this.siguiente = this;
        this.anterior = this;
    }

    public DatosDC getDatos() {
        return datos;
    }

    public void setDatos(DatosDC datos) {
        this.datos = datos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
}
