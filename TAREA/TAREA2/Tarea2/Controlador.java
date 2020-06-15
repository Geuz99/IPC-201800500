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
public class Controlador {

    private Avion jet; 
    private Avion avionprivado; 

    private Caballo trabajador; 
    private Caballo consentido;

    private Coche luxury;
    private Coche poor;

    public Controlador() {
        this.jet = new Avion(500,"Airbus","A320");
        this.avionprivado = new Avion(8,"Air special edition", "F15");
        
        this.trabajador = new Caballo("Chimueloo","Frizon",5);
        this.consentido = new Caballo("Andaluz","Pura sangre", 6);
        
        this.luxury = new Coche("Lamborghini",2020,"sedan");
        this.poor  = new Coche("mazda", 1994, "sedan");      
        
        
        
    }

    /**
     * @return the jet
     */
    public Avion getJet() {
        return jet;
    }

    /**
     * @param jet the jet to set
     */
    public void setJet(Avion jet) {
        this.jet = jet;
    }

    /**
     * @return the avionprivado
     */
    public Avion getAvionprivado() {
        return avionprivado;
    }

    /**
     * @param avionprivado the avionprivado to set
     */
    public void setAvionprivado(Avion avionprivado) {
        this.avionprivado = avionprivado;
    }

    /**
     * @return the trabajador
     */
    public Caballo getTrabajador() {
        return trabajador;
    }

    /**
     * @param trabajador the trabajador to set
     */
    public void setTrabajador(Caballo trabajador) {
        this.trabajador = trabajador;
    }

    /**
     * @return the consentido
     */
    public Caballo getConsentido() {
        return consentido;
    }

    /**
     * @param consentido the consentido to set
     */
    public void setConsentido(Caballo consentido) {
        this.consentido = consentido;
    }

    /**
     * @return the luxury
     */
    public Coche getLuxury() {
        return luxury;
    }

    /**
     * @param luxury the luxury to set
     */
    public void setLuxury(Coche luxury) {
        this.luxury = luxury;
    }

    /**
     * @return the poor
     */
    public Coche getPoor() {
        return poor;
    }

    /**
     * @param poor the poor to set
     */
    public void setPoor(Coche poor) {
        this.poor = poor;
    }
    
    

}
