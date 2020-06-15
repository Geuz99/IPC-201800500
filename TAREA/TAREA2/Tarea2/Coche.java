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
public class Coche extends Transporte {
    
    private String marca;
    private int modelo;
    private String tipo;

    public Coche(String marca, int modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }
    
    

    @Override
    public void Avanzar() {
//        “AVANCE-AUTO-MARCA-MODELO-TIPO”
        System.out.println("AVANCE-AUTO-" + this.marca + "-" + this.modelo + 
                "-" + this.tipo);
        
    }

    @Override
        public void Frenar() {
//            “FRENE-AUTO-MARCA-MODELO-TIPO”
       System.out.println("FRENE-AUTO-" + this.marca + "-" + this.modelo + 
                "-" + this.tipo);
        
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

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
