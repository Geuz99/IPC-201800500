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
public class main {
    public static void main(String[] args) {
        
        Controlador obj = new Controlador();
        
        obj.getTrabajador().Avanzar();
        obj.getTrabajador().Frenar();
        obj.getConsentido().Avanzar();
        obj.getConsentido().Frenar();
        
        obj.getLuxury().Avanzar();
        obj.getLuxury().Frenar();
        obj.getPoor().Avanzar();
        obj.getPoor().Frenar();
        
        obj.getComercial().Avanzar();
        obj.getComercial().Frenar();
        obj.getPrivado().Avanzar();
        obj.getPrivado().Frenar();
        
        
    }
    
    
    
}
