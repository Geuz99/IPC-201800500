/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author GEUZ99
 */
public class Disparo extends Thread {

    JButton boton;
    String direccion;

    public Disparo(JButton boton, String direccion) {
        this.boton = boton;
        this.direccion = direccion;
    }    
    

    @Override
    public void run() {
        while(true){
            switch(this.direccion){
                case "ARRIBA":
                    boton.setBounds(boton.getX(), boton.getY()-75, boton.getWidth(), boton.getHeight());
                    break;
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverBoton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
