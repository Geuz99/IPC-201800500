/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import javax.swing.JTextArea;

/**
 *
 * @author GEUZ99
 */
public class Cola {
    
    private Nodo inicioCola, finalCola;
    int size;
    String Cola = "";

    public Cola() {
        inicioCola = finalCola = null;
        size = 0;
    }   
    
    public boolean colaVacia(){
        if (inicioCola == null) {
            return true;
        }else{
            return false;
        }
        
    }
    public void push(DatosCola datos){
        Nodo nuevo = new Nodo(datos);
        nuevo.siguiente = null;
        
        if (colaVacia()) {
            inicioCola = nuevo;
            finalCola = nuevo;
        }else{
            finalCola.siguiente = nuevo;
            finalCola = nuevo;
                        
        }
        
    }
    public void vaciar() {
        while (!(colaVacia())) {
            pop();
        }
    }
    
    public DatosCola pop(){
        if (!colaVacia()) {
            DatosCola aux = inicioCola.getDatos();
            
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
                
            }
            return aux;
            
        } else {
            return null;
        }
    }
    public void ImprimirGraphiz(JTextArea area){
        Nodo aux = inicioCola;
        String colaInvertida = "";
        int id = 1;
        String inicio = "0[label=\"INICIO\"]";
        while(aux != null){
            Cola +=  "\n" + id + " [label = \"" + aux.getDatos().getValor() + "," + aux.getDatos().getColor() + "\"];" + "\n" + id + "->" + (id+1);
            aux = aux.siguiente;
            id++;
        }
        
        String cadena [] = Cola.split("  ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            colaInvertida += cadena[i];
        }
        area.setText("digraph Cola{"
                +"\n"
                + inicio
                +"\n"
                + colaInvertida
                + 0 + "->" + 1
                + "\n}");   
        Cola = "";
        
    }
//    public void ImprimirGraphiz(JTextArea area) {
//        Nodo aux = inicioCola;
//        int i = 0;
//        while (aux != null) {
//            Cola =  Cola + "\n" + i + " [label = \"" + aux.getDatos().getValor() + "," + aux.getDatos().getColor() + "\"];" + "\n" + i + "->" + (i+1);
//            aux = aux.siguiente;
//            i++;
//        }
//        area.setText("digraph Pila{"
//                + Cola
//                + "\n}");   
//        Cola = "";
//    }
    
}
