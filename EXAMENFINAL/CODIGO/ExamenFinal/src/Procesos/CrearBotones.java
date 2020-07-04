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
public class CrearBotones extends Thread {

    int ancho;
    int alto;
    Color color;
    JPanel panelPrincipal;

    public CrearBotones(int ancho, int alto, Color color, JPanel panelPrincipal) {

        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.panelPrincipal = panelPrincipal;

    }

    @Override
    public void run() {
        int id = 0;
        while (utiles.segundos != 0) {
            id++;
            JButton boton = utiles.CrearBotones(String.valueOf(id), this.ancho, this.alto, 75, 0, this.color);
            MoverBotones proceso = new MoverBotones(boton);            

            this.panelPrincipal.add(boton);
            proceso.start();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CrearBotones.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
