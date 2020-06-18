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
public class Modelo {
    private int anio;  
    private double depreciacion;

    public Modelo(String anio, String depreciacion) {
        this.anio = Integer.parseInt(anio);
        this.depreciacion=  Double.parseDouble(depreciacion);
    }  
    
    public void imprimir(){
        System.out.println("ANIO "+this.getAnio() + " PORCENTAJE DE DEPRECIACION "+this.getDepreciacion());
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return this.anio;
    }

    /**
     * @return the depreciacion
     */
    public double getDepreciacion() {
        return this.depreciacion;
    }
    
}
