/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Tablero.utiles;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GEUZ99
 */
public class Punteos extends Thread{

    public Punteos() {
    }   
    

    @Override
    public void run() {
        while(true){
            if ( utiles.vidas == 0 ) {
                JOptionPane.showConfirmDialog(null, "YA PERDISTE");
                try {
                    Punteos.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Punteos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
}
