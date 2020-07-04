/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Tablero.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JButton;

/**
 *
 * @author GEUZ99
 */
public class MoverBotones extends Thread implements ActionListener {

    JButton boton;

    public MoverBotones(JButton boton) {
        this.boton = boton;
    }

    @Override
    public void run() {
        boton.addActionListener(this);
        while (utiles.segundos != 0) {

            boton.setBounds(boton.getX(), boton.getY() + 75, boton.getWidth(), boton.getHeight());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(MoverBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object BotonPulsado = e.getSource();
        
        if (BotonPulsado == boton) {
            boton.setVisible(false);
            utiles.mipila.push(Integer.parseInt(boton.getText()));
            utiles.mipila.ImprimirGraphiz(Principal.area);
        }

    }

}
