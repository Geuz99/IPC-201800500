/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import javax.swing.JTextArea;

/**
 *
 * @author GEUZ99
 */
public class Pila {

    private Nodo UltimoValorIngresado;
    int size;
    String cadena = "";

    public Pila() {
        UltimoValorIngresado = null;
        size = 0;
    }

    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }

    public void push(DatosPila datos) {
        Nodo nuevo = new Nodo(datos);
        nuevo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo;
        size++;
    }

    public DatosPila pop() {
        DatosPila aux = UltimoValorIngresado.getDatos();
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        size--;
        return aux;
    }

    public DatosPila MostrarUltimoValor() {
        return UltimoValorIngresado.getDatos();
    }

    public int damesize() {
        return size;
    }

    public void vaciarPila() {
        while (!(PilaVacia())) {
            pop();
        }
    }
    
    public DatosPila obtener(int posicion) {
        Nodo indice = UltimoValorIngresado;
        int contador = 0;
        while (contador < posicion) {
            indice = indice.siguiente;
            contador++;
        }
        return indice.getDatos();
    }

    public void ImprimirGraphiz(JTextArea area) {
        Nodo aux = UltimoValorIngresado;
        int i = 1;
        String tope = "0[label=\"TOPE\"]";
        while (aux != null) {
            cadena =  cadena + "\n" + i + " [label = \"" + aux.getDatos().getValor() + "," + aux.getDatos().getColor() + "\"];" + "\n" + i + "->" + (i+1);
            aux = aux.siguiente;
            i++;
        }
        area.setText("digraph Pila{"
                + "\n"
                + tope
                +"\n"
                + 0 + "->" + 1
                + cadena
                + "\n}");   
        cadena = "";
    }

}
