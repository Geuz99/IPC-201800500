/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

import Carga.Datos;
import Tablero.IListaSimple;
import javax.swing.JTextArea;

/**
 *
 * @author GEUZ99
 */
public class ListaSimple {

    private Nodo cabeza;
    int size;

    public ListaSimple() {
        this.cabeza = null;
        size = 0;
    }

    public void insertarCabezaLista(Datos datos) {

        if (cabeza == null) {
            cabeza = new Nodo(datos);
        } else {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(datos);            
            nuevo.setSiguiente(temp);
            cabeza = nuevo;
        }
        size++;

    }

    public int dameSize() {
        return size;
    }

    public boolean estaVacia() {
        return (cabeza == null) ? true : false;
    }

    public Datos obtener(int posicion) {
        Nodo indice = cabeza;
        int contador = 0;
        while (contador < posicion) {
            indice = indice.getSiguiente();
            contador++;
        }
        return indice.getDatos();
    }

    public Datos obtenerValor(int valor) {
        if(!estaVacia()){
            Nodo auxiliar = cabeza;
            for(int i=0; i<size;i++){
                if(auxiliar.getDatos().getValor() == valor){
                    return auxiliar.getDatos();
                }else{
                    auxiliar = auxiliar.getSiguiente();
                }
            }
        }
        return null;
    }
    
    public boolean eliminarValor(int valor){
        if(!estaVacia()){
            Nodo aux = cabeza;
            if(cabeza.getDatos().getValor() == valor){
                if (cabeza.getSiguiente() == null){
                    cabeza=null;
                }else {
                    cabeza = cabeza.getSiguiente();
                }
                return true;
            }else{
                while(!(aux.getSiguiente().getDatos().getValor() == valor)){
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
        }
        return false;
    }

    public void eliminar(int posicion) {

        if (posicion == 0) {
            cabeza = cabeza.getSiguiente();
        } else {
            int contador = 0;
            Nodo temporal = cabeza;
            while (contador < posicion - 1) {
                temporal = temporal.getSiguiente();
                contador++;
            }
            temporal.setSiguiente(temporal.getSiguiente().getSiguiente());

        }
        size--;

    }

    public void vaciar() {
        int contador = 0;
        while (contador < size) {
            eliminar(contador);            
        }
    }

    public void ImprimirGraphiz(JTextArea area) {
        Nodo aux = cabeza;
        String cadena = "";
        int i = 0;
        while (aux != null) {
            cadena = cadena + "\n" + i + " [label = \"" + aux.getDatos().getValor() + "," + aux.getDatos().getColor() + "\"];" + "\n" + i + "->" + (i + 1);
            aux = aux.getSiguiente();
            i++;
        }
        area.setText("digraph ListaSimple{"
                + cadena
                + "\n}");
    }

}
