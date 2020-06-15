/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author GEUZ99
 */
public class Mecanica {
    private String nombre;
    private double precio;

    public Mecanica(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = Double.parseDouble(precio);
    }

    public void imprimir() {
        System.out.println("NOMBRE ACTIVIDAD " + this.getNombre() + " PRECIO " + this.getPrecio());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }
    
}
