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
public class Solicitudes {

    private String nombre;
    private String apellido;
    private String dpi;
    private String talefono;
    private String tipovehiculo;
    private String usovehiculo;
    private String marca;
    private String linea;
    private String modelo;
    private String valorvehiculo;
    private String CostoPrima;
    private String Deducible;
    private String PCostoPrima;
    private String PDeducible;

    public Solicitudes(String nombre, String apellido, String dpi, String telefono, String tipovehiculo, String usovehiculo, String marca, String linea, 
            String modelo, String valorvehiculo, String CostoPrima, String Deducible, String PCostoPrima, String PDeducible) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.talefono = telefono;
        this.tipovehiculo = tipovehiculo;
        this.usovehiculo = usovehiculo;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.valorvehiculo = valorvehiculo;
        this.CostoPrima = CostoPrima;
        this.Deducible = Deducible;
        this.PCostoPrima = PCostoPrima;
        this.PDeducible = PDeducible;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
     * @return the tipovehiculo
     */
    public String getTipovehiculo() {
        return tipovehiculo;
    }

    /**
     * @param tipovehiculo the tipovehiculo to set
     */
    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    /**
     * @return the usovehiculo
     */
    public String getUsovehiculo() {
        return usovehiculo;
    }

    /**
     * @param usovehiculo the usovehiculo to set
     */
    public void setUsovehiculo(String usovehiculo) {
        this.usovehiculo = usovehiculo;
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
     * @return the linea
     */
    public String getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(String linea) {
        this.linea = linea;
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
     * @return the valorvehiculo
     */
    public String getValorvehiculo() {
        return valorvehiculo;
    }

    /**
     * @param valorvehiculo the valorvehiculo to set
     */
    public void setValorvehiculo(String valorvehiculo) {
        this.valorvehiculo = valorvehiculo;
    }

    /**
     * @return the CostoPrima
     */
    public String getCostoPrima() {
        return CostoPrima;
    }

    /**
     * @param CostoPrima the CostoPrima to set
     */
    public void setCostoPrima(String CostoPrima) {
        this.CostoPrima = CostoPrima;
    }

    /**
     * @return the Deducible
     */
    public String getDeducible() {
        return Deducible;
    }

    /**
     * @param Deducible the Deducible to set
     */
    public void setDeducible(String Deducible) {
        this.Deducible = Deducible;
    }

    /**
     * @return the PCostoPrima
     */
    public String getPCostoPrima() {
        return PCostoPrima;
    }

    /**
     * @param PCostoPrima the PCostoPrima to set
     */
    public void setPCostoPrima(String PCostoPrima) {
        this.PCostoPrima = PCostoPrima;
    }

    /**
     * @return the PDeducible
     */
    public String getPDeducible() {
        return PDeducible;
    }

    /**
     * @param PDeducible the PDeducible to set
     */
    public void setPDeducible(String PDeducible) {
        this.PDeducible = PDeducible;
    }

}
