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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Controlador prueba = new Controlador();
        prueba.getAvionprivado().Avanzar();
        prueba.getAvionprivado().Frenar();
        
        prueba.getJet().Avanzar();
        prueba.getJet().Frenar();
        
        prueba.getTrabajador().Avanzar();
        prueba.getTrabajador().Frenar();
        
        prueba.getLuxury().Avanzar();
        prueba.getLuxury().Frenar();       
        
        prueba.getPoor().Avanzar();
        prueba.getPoor().Frenar();
        
    }
    
}
