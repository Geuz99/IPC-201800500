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
public class DatosListaDoble {

    private int id;
    private int fila, columna, valor;
    private String Color;

    public DatosListaDoble(int fila, int columna, int valor, String Color) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
