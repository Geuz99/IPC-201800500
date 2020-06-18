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
public class Incidentes {
   private String codigo;
   private String rolAsegurado;
   private String rolTercero;
   private String costoreal;
   private String dpiAsegurado;
   private String dpiTercero;
   private String Servicio;
   private String Repuesto;

    public Incidentes(String codigo, String rol,String rolTercero, String costoreal, String dpiAsegurado, String dpiTercero, String Servicio, String Repuesto) {
        this.codigo = codigo;
        this.rolAsegurado = rol;
        this.rolTercero = rolTercero;
        this.costoreal = costoreal;
        this.dpiAsegurado = dpiAsegurado;
        this.dpiTercero = dpiTercero;
        this.Servicio = Servicio;
        this.Repuesto = Repuesto;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the rolAsegurado
     */
    public String getRol() {
        return getRolAsegurado();
    }

    /**
     * @param rol the rolAsegurado to set
     */
    public void setRol(String rol) {
        this.setRolAsegurado(rol);
    }

    /**
     * @return the costoreal
     */
    public String getCostoreal() {
        return costoreal;
    }

    /**
     * @param costoreal the costoreal to set
     */
    public void setCostoreal(String costoreal) {
        this.costoreal = costoreal;
    }

    /**
     * @return the dpiAsegurado
     */
    public String getDpiAsegurado() {
        return dpiAsegurado;
    }

    /**
     * @param dpiAsegurado the dpiAsegurado to set
     */
    public void setDpiAsegurado(String dpiAsegurado) {
        this.dpiAsegurado = dpiAsegurado;
    }

    /**
     * @return the dpiTercero
     */
    public String getDpiTercero() {
        return dpiTercero;
    }

    /**
     * @param dpiTercero the dpiTercero to set
     */
    public void setDpiTercero(String dpiTercero) {
        this.dpiTercero = dpiTercero;
    }

    /**
     * @return the Servicio
     */
    public String getServicio() {
        return Servicio;
    }

    /**
     * @param Servicio the Servicio to set
     */
    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    /**
     * @return the Repuesto
     */
    public String getRepuesto() {
        return Repuesto;
    }

    /**
     * @param Repuesto the Repuesto to set
     */
    public void setRepuesto(String Repuesto) {
        this.Repuesto = Repuesto;
    }

    /**
     * @return the rolAsegurado
     */
    public String getRolAsegurado() {
        return rolAsegurado;
    }

    /**
     * @param rolAsegurado the rolAsegurado to set
     */
    public void setRolAsegurado(String rolAsegurado) {
        this.rolAsegurado = rolAsegurado;
    }

    /**
     * @return the rolTercero
     */
    public String getRolTercero() {
        return rolTercero;
    }

    /**
     * @param rolTercero the rolTercero to set
     */
    public void setRolTercero(String rolTercero) {
        this.rolTercero = rolTercero;
    }
   
   
    
    
}
