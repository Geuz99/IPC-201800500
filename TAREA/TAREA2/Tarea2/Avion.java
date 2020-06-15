/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

/**
 *
 * @author GEUZ99
 */
public class Avion extends Transporte {
    
    private int cantidad;
    private String modelo;
    private String marca;

    public Avion(int cantidad, String modelo, String marca) {
        this.cantidad = cantidad;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    

    @Override
    public void Avanzar() {
//        “AVANCE-AVION-PASAJEROS-MARCA-MODELO”
        System.out.println("AVANCE-AVION-" + this.getCantidad() + "-" + this.marca + 
                "-" + this.modelo);
    }

    @Override
    public void Frenar() {
//        “FRENE-AVION-PASAJEROS-MARCA-MODELO”
        System.out.println("FRENE-AVION-" + this.getCantidad() + "-" + this.marca + 
                "-" + this.modelo);
        
    } 

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
