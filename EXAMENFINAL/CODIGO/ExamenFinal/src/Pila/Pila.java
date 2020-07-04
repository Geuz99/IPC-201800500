package Pila;

import javax.swing.JTextArea;

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

    public void push(int id) {
        Nodo nuevo = new Nodo(id);
        nuevo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo;
        size++;
    }

    public int pop() {
        int aux = UltimoValorIngresado.getId();
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        size--;
        return aux;
    }
    
    public int damesize() {
        return size;
    }
    
     public void ImprimirGraphiz(JTextArea area) {
        Nodo aux = UltimoValorIngresado;
        int i = 1;
        String tope = "0[label=\"TOPE\"]";
        while (aux != null) {
            cadena =  cadena + "\n" + i + " [label = \"" + aux.getId() + "\"];" + "\n" + i + "->" + (i+1);
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
