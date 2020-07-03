/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircular;

import javax.swing.JTextArea;

/**
 *
 * @author GEUZ99
 */
public class ListaDobleCircular {

    private Nodo cabeza;
    int size;

    public ListaDobleCircular() {
        this.cabeza = null;
        size = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public DatosDC obtener(int posicion) {
        if (!estaVacia()) {
            if (posicion == 0) {
                return cabeza.getDatos();
            } else {
                Nodo auxiliar = cabeza;
                for (int i = 0; i < posicion; i++) {
                    auxiliar = auxiliar.getSiguiente();
                }
                return auxiliar.getDatos();
            }
        }
        return null;
    }

    public void insertar(DatosDC datos) {
        Nodo nuevo = new Nodo(datos);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            while (aux.getSiguiente() != cabeza) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
            size++;
        }
    }

//    public DatosDC obtener(int posicion) {
//        Nodo indice = cabeza;
//        int contador = 0;
//        while (contador < posicion) {
//            indice = indice.getSiguiente();
//            contador++;
//        }
//        return indice.getDatos();
//    }
    public int damesize() {
        return size;
    }
    
    public void vaciar() {
        int contador = 0;
        while (contador < size+1) {
            eliminar(contador);
            
        }
    }
    
    public boolean eliminar(int posicion){
        if(!estaVacia()){
            if(posicion == 0){
                if (cabeza.getSiguiente().equals(cabeza)){
                    cabeza=null;
                }else{
                    cabeza.getAnterior().setSiguiente(cabeza.getSiguiente());
                    cabeza.getSiguiente().setAnterior(cabeza.getAnterior());
                    cabeza = cabeza.getSiguiente();
                    
                }
                size--;
                return true;
            }else{
                Nodo aux = cabeza;
                for(int i=0; i<posicion;i++){
                    aux = aux.getSiguiente();
                }
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux.getAnterior());                
                return true;
            }
        }
        return false;
    }

//    public void eliminar1(int posicion) {
//        if (cabeza != null) {
//            if (posicion > 0) {
//                int cont = 1;
//                Nodo aux = cabeza;
//                while ((aux.getSiguiente() != cabeza) && (cont < posicion)) {
//                    cont++;
//                    aux = aux.getSiguiente();
//                }
//                if (cont == 1) {
//                    if (aux.getSiguiente() == cabeza) {
//                        cabeza = null;
//                    } else {
//                        Nodo ant = aux.getAnterior();
//                        ant.setSiguiente(aux.getSiguiente());
//                        aux = aux.getSiguiente();
//                        aux.setAnterior(ant);
//                        cabeza = aux;
//                    }
//                } else {
//                    Nodo ant = aux.getAnterior();
//                    aux.setAnterior(null);
//                    ant.setSiguiente(aux.getSiguiente());
//                    aux = aux.getSiguiente();
//                    aux.setAnterior(ant);
//                }
//            }
//        }
//    }

    public boolean eliminarValor(int valor) {
        if (!estaVacia()) {
            Nodo aux = cabeza;
            Nodo aux2 = aux;
            for (int i = 0; i <= size; i++) {
                if (aux.getDatos().getValor() != (valor)) {
                    aux = aux.getSiguiente();
                } else {
                    break;
                }
            }
            if (aux == cabeza) {
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux.getAnterior());
                cabeza = aux.getSiguiente();
            } else {
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux2.getAnterior());
            }

        }
        return false;
    }

    public void imprimir() {
        if (cabeza == null) {
            System.out.println("<-->NULL<-->");
        } else {
            Nodo aux = cabeza;
            System.out.print("<--> Inicio");
            do {
                System.out.print(" <--> " + aux.getDatos().getColor());
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            System.out.println(" <-->NULL<-->");
        }
    }

    public void ImprimirGraphiz(JTextArea area) {
        Nodo aux = cabeza;
        String cadena = "";

        do {
            cadena = cadena + "\n" + aux.getDatos().getId() + " [label = \"" + aux.getDatos().getValor() + "," + aux.getDatos().getColor() + "\"];" + "\n" + aux.getDatos().getId() + "->" + aux.getAnterior().getDatos().getId() + "\n" + aux.getDatos().getId() + "->" + aux.getSiguiente().getDatos().getId();
            aux = aux.getSiguiente();
        } while (aux != cabeza);
        area.setText("digraph ListaDobleCircular{"
                + cadena
                + "\n}");
    }

}
