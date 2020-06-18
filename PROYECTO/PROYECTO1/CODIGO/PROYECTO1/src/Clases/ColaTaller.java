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
public class ColaTaller {
    private String codigo;
    private String asociado;
    private String tercero;

    public ColaTaller(String codigo, String asociado, String tercero) {
        this.codigo = codigo;
        this.asociado = asociado;
        this.tercero = tercero;
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
     * @return the asociado
     */
    public String getAsociado() {
        return asociado;
    }

    /**
     * @param asociado the asociado to set
     */
    public void setAsociado(String asociado) {
        this.asociado = asociado;
    }

    /**
     * @return the tercero
     */
    public String getTercero() {
        return tercero;
    }

    /**
     * @param tercero the tercero to set
     */
    public void setTercero(String tercero) {
        this.tercero = tercero;
    }
    
    
    
}
