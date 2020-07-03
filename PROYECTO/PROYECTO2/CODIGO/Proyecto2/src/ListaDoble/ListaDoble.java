/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDoble;

import javax.swing.JTextArea;

/**
 *
 * @author GEUZ99
 */
public class ListaDoble {

    Nodo cabeza;
    int size;

    public ListaDoble() {
        cabeza = null;
        size = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertar(DatosListaDoble datos) {
        Nodo nuevo = new Nodo(datos);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nuevo.setAdelante(cabeza);
            cabeza.setAtras(nuevo);
            cabeza = nuevo;
            size++;
        }
    }

    public int damesize() {
        return size;
    }

    public DatosListaDoble obtener(int posicion) {
        Nodo indice = cabeza;
        int contador = 0;
        while (contador < posicion) {
            indice = indice.getAdelante();
            contador++;
        }
        return indice.getDatos();
    }

    public void imprimir() {
        if (cabeza == null) {
            System.out.println("<-->NULL<-->");
        } else {
            Nodo aux = cabeza;
            System.out.print("<--> Inicio");
            while (aux != null) {
                System.out.print(" <--> " + aux.getDatos().getColor());
                aux = aux.getAdelante();
            }
            System.out.println(" <-->NULL<-->");
        }
    }

    public void ImprimirGraphiz(JTextArea area) {
        Nodo aux = cabeza;
        String cadena = "";
        int i = 0;
        while (aux != null) {
            cadena = cadena + "\n" + i + " [label = \"" + aux.getDatos().getValor() + "," + aux.getDatos().getColor() + "\"];" + "\n" + i + "->" + (i + 1) + "\n" + (i + 1) + "->" + i;
            aux = aux.getAdelante();
            i++;
        }
        area.setText("digraph ListaDoble{"
                + cadena
                + "\n}");
    }

    public void vaciar() {
        cabeza = null;

    }

    public void eliminar(int posicion) {
        if (posicion <= damesize()) {
            if (posicion == 1) {
                cabeza = cabeza.getAdelante();
                if (cabeza != null) {
                    cabeza.setAtras(null);
                }
            } else {
                Nodo aux;
                aux = cabeza;
                for (int f = 1; f <= posicion - 2; f++) {
                    aux = aux.getAdelante();
                }
                Nodo prox = aux.getAdelante();
                prox = prox.getAdelante();
                aux.setAdelante(prox);
                if (prox != null) {
                    prox.setAtras(aux);
                }

            }

        }
    }

}
