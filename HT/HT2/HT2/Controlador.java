/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT2;

/**
 *
 * @author GEUZ99
 */
public class Controlador {

    private Avion privado;
    private Avion comercial;

    private Caballo trabajador;
    private Caballo consentido;

    private Carro luxury;
    private Carro poor;

    public Controlador() {
        this.privado = new Avion(10, "Airbus", "A320");
        this.comercial = new Avion(100, "Air special edition", "F15");

        this.trabajador = new Caballo("roberto", "Morgan", 5);
        this.consentido = new Caballo("dakota", "Paint horse", 6);

        this.luxury = new Carro("Lamborghini", 2020, "sedan");
        this.poor = new Carro("mazda", 1994, "sedan");

    }

    /**
     * @return the privado
     */
    public Avion getPrivado() {
        return privado;
    }

    /**
     * @param privado the privado to set
     */
    public void setPrivado(Avion privado) {
        this.privado = privado;
    }

    /**
     * @return the comercial
     */
    public Avion getComercial() {
        return comercial;
    }

    /**
     * @param comercial the comercial to set
     */
    public void setComercial(Avion comercial) {
        this.comercial = comercial;
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
    public Carro getLuxury() {
        return luxury;
    }

    /**
     * @param luxury the luxury to set
     */
    public void setLuxury(Carro luxury) {
        this.luxury = luxury;
    }

    /**
     * @return the poor
     */
    public Carro getPoor() {
        return poor;
    }

    /**
     * @param poor the poor to set
     */
    public void setPoor(Carro poor) {
        this.poor = poor;
    }
}
