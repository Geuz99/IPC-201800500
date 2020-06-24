/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Tablero.utiles;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author GEUZ99
 */
public class CrearBotones implements Runnable{
    
    int columna;
    int ancho;
    int alto;
    Color color;
    JPanel panelPrincipal;
    String direccion;
    int velocidad;

    public CrearBotones(int columna, int ancho, int alto, Color color, JPanel panelPrincipal, String direccion, int velocidad) {
        this.columna = columna;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.panelPrincipal = panelPrincipal;
        this.direccion = direccion;
        this.velocidad = velocidad;
    }
    
    

    @Override
    public void run() {
        while (true) {
            int aux = (int) (Math.random() * 4) + 1;
            JButton boton = utiles.CrearBotones("Columna"+this.columna, this.ancho, this.alto, 75*aux, 0, this.color);
            MoverBoton proceso = new MoverBoton(boton, this.velocidad, this.direccion);                  
            
            this.panelPrincipal.add(boton);         
            Thread hilo1 = new Thread(proceso);
            hilo1.start();  
            
           
          
            try {
                Thread.sleep(1000*this.velocidad);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(CrearBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
           
        }
    }
    
}
