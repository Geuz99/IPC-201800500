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
public class Repuesto {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    private String nombre;
    private double precio;

    public Repuesto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = Double.parseDouble(precio);
    }

    public void imprimir() {
        System.out.println("NOMBRE " + this.getNombre() + " PRECIO " + this.getPrecio());
    }
    
    
}
