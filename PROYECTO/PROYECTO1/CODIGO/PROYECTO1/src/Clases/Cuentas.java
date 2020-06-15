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
public class Cuentas {
    private String nombre;    
    private String dpi;
    private String talefono;
    private String tipo;
    private String descipcion;
    private String monto;
    private String poliza;
    private String deducible;

    public Cuentas(String nombre, String dpi, String talefono, String tipo, String descipcion, String monto, String poliza, String deducible) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.talefono = talefono;
        this.tipo = tipo;
        this.descipcion = descipcion;
        this.monto = monto;
        this.poliza = poliza;
        this.deducible = deducible;
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
     * @return the dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the talefono
     */
    public String getTalefono() {
        return talefono;
    }

    /**
     * @param talefono the talefono to set
     */
    public void setTalefono(String talefono) {
        this.talefono = talefono;
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

    /**
     * @return the descipcion
     */
    public String getDescipcion() {
        return descipcion;
    }

    /**
     * @param descipcion the descipcion to set
     */
    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    /**
     * @return the monto
     */
    public String getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(String monto) {
        this.monto = monto;
    }

    /**
     * @return the poliza
     */
    public String getPoliza() {
        return poliza;
    }

    /**
     * @param poliza the poliza to set
     */
    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    /**
     * @return the deducible
     */
    public String getDeducible() {
        return deducible;
    }

    /**
     * @param deducible the deducible to set
     */
    public void setDeducible(String deducible) {
        this.deducible = deducible;
    }
    
    
    
}
