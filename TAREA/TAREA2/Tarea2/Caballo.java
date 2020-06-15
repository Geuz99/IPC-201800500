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
public class Caballo extends Transporte {

    private String nombre;
    private String raza;
    private int edad;

    public Caballo(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public void Avanzar() {
//        “AVANCE-CABALLO-NOMBRE-RAZA-EDAD”
        System.out.println("AVANCE-CABALLO-" + this.nombre + "-" + this.raza + 
                "-" + this.edad);

    }

    @Override
    public void Frenar() {
//        “FRENE-CABALLO-NOMBRE-RAZA-EDAD”
       System.out.println("FRENE-CABALLO-" + this.nombre + "-" + this.raza + 
                "-" + this.edad);
    }

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
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
