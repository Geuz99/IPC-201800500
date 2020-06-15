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
public class Uso {
    private String nombre;
    private double aumentoPoliza;

    public Uso(String nombre, String aumentopoliza) {
        this.nombre = nombre;
        this.aumentoPoliza = Double.parseDouble(aumentopoliza);
    }

    public void imprimir() {
        System.out.println("NOMBRE " + this.getNombre() + " PORCENTAJE DE AUMENTO DE POLIZA " + this.getAumentoPoliza());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the aumentoPoliza
     */
    public double getAumentoPoliza() {
        return aumentoPoliza;
    }
    
}
