/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author GEUZ99
 */
public class Nodo {
    
    private DatosCola datos;
    Nodo siguiente; 

    public Nodo(DatosCola datos) {
        this.datos = datos;
        this.siguiente = null;
    }

    public DatosCola getDatos() {
        return datos;
    }

    public void setDatos(DatosCola datos) {
        this.datos = datos;
    }
    
    
    
}
