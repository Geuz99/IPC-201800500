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
public class Tipo {    
    
    private String nombre;
    private double valorMaximo;

    public Tipo(String nombre, String valorMaximo) {
        this.nombre = nombre;
        this.valorMaximo = Double.parseDouble(valorMaximo);
        
    }

    
    
    public void imprimir(){
        System.out.println("NOMBRE "+this.nombre+ " Valor Maximo A ASEGURAR "+this.valorMaximo);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }
 
    public double getValorMaximo() {
        return this.valorMaximo;
    }    
   

    
}
