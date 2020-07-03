/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDoble;

/**
 *
 * @author GEUZ99
 */
public class Nodo {

    private DatosListaDoble datos;
    private Nodo adelante;
    private Nodo atras;

    public Nodo(DatosListaDoble datos) {
        this.datos = datos;
        this.adelante = null;
        this.atras = null;
    }

    public DatosListaDoble getDatos() {
        return datos;
    }

    public void setDatos(DatosListaDoble datos) {
        this.datos = datos;
    }

    public Nodo getAdelante() {
        return adelante;
    }

    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

}
