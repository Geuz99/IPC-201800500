/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT4;

import javax.swing.JTextArea;

/**
 *
 * @author GEUZ99
 */
public class ListaCircular {

    private Nodo cabeza;
    int size;

    public ListaCircular() {
        this.cabeza = null;
        size = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public ListaCircular insertar(String id, String valor) {
        Nodo nuevo;
        nuevo = new Nodo(id, valor);
        if (cabeza != null) // lista circular no vacía
        {
            nuevo.setEnlace(cabeza.getEnlace());
            cabeza.setEnlace(nuevo);
            size++;
        }
        cabeza = nuevo;
        return this;
    }
    
    public boolean encontrar(String id){
        Nodo aux = cabeza;
        boolean encontrado = false;
        
        do {   
            if (id.equals(aux.getId())) {
                encontrado = true;
            }else{
                aux = aux.getEnlace();
            }
            
        } while (aux != cabeza && encontrado != true);
        
        return encontrado;
    }
    
    public void editar(String id, String nuevovalor){
        if (encontrar(id)) {
            Nodo aux = cabeza;
            
            while(!(aux.getId().equals(id))){
                aux = aux.getEnlace();
            }
            aux.setValor(nuevovalor);
        }
    }

    public void mostrarLista(JTextArea area) {
        Nodo aux = cabeza.getEnlace();
        String cadena = "";
        do {
            cadena = cadena + "\n" + aux.getId() + " [label = " + aux.getValor() + "];" + "\n" + aux.getId() + "->" + aux.getEnlace().getId();
            aux = aux.getEnlace();
        } while (aux != cabeza.getEnlace());
        area.setText("digraph Lista_Circular{"
                + cadena
                + "\n}");
    }
  
    public int dameSize() {
        return size;
    }

}
