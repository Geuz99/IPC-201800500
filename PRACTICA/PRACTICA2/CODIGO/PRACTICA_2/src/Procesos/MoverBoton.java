/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Tablero.Juego;
import Tablero.utiles;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GEUZ99
 */
public class MoverBoton implements Runnable {

    JButton boton;
    int velocidad;
    String direccion;

    public MoverBoton(JButton boton, int velocidad, String direccion) {
        this.boton = boton;
        this.velocidad = velocidad;
        this.direccion = direccion;

    }

    @Override
    public void run() {

        while (true) {
            switch (this.direccion) {
                case "ABAJO":
                    boton.setBounds(boton.getX(), boton.getY() + 75, boton.getWidth(), boton.getHeight());
                    break;
                case "ARRIBA":
                    boton.setBounds(boton.getX(), boton.getY() - 75, boton.getWidth(), boton.getHeight());
                    break;
            }

            try {
                Thread.sleep(1000 - utiles.cucahauu + utiles.Nocucahauu);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverBoton.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (Tablero.Juego.disparo.getX() - 30 == this.boton.getX() && Tablero.Juego.disparo.getY() - 30 == this.boton.getY()) {
                int puntos = utiles.punteo;
                if (boton.getBackground() == Color.GRAY) {
                    Juego.punteoTXT.setText(String.valueOf(puntos + 100));
                    boton.setBounds(0, 0, 0, 0);
                    Tablero.Juego.disparo.setBounds(0, 0, 0, 0);
                }
                utiles.punteo = Integer.parseInt(Juego.punteoTXT.getText());

            }

            if (Tablero.Juego.nave.getX() == this.boton.getX() && Tablero.Juego.nave.getY() == this.boton.getY()) {
                int vidas = Integer.parseInt(Juego.vidasTXT.getText());
                int rayo = Integer.parseInt(Juego.velocidadTXT.getText());
                int ojo = Integer.parseInt(Juego.poderTXT.getText());
                if (boton.getBackground() == Color.GRAY) {
                    //System.out.println("Colision con ASTEROIDE");
                    Juego.vidasTXT.setText(String.valueOf(vidas - 1));

                }
                if (boton.getBackground() == Color.RED) {
                    if (vidas == 3) {
                        System.out.println("NO SUMAR VIDAS");
                    } else {
                        Juego.vidasTXT.setText(String.valueOf(vidas + 1));
                    }
                }
                if (boton.getBackground() == Color.YELLOW) {
                    //System.out.println("Colision con RAYO");
                    if (rayo == 5) {
                        System.out.println("NO SUMAR VELOCIDAD");
                    } else {
                        Juego.velocidadTXT.setText(String.valueOf(rayo + 1));
                    }
                }
                if (boton.getBackground() == Color.BLUE) {
                    //System.out.println("Colision con CARACOL");                  
                    utiles.Nocucahauu++;

                }
                if (boton.getBackground() == Color.WHITE) {
                    //System.out.println("Colision con OJO");                  
                    Juego.poderTXT.setText(String.valueOf(ojo + 1));

                }

                utiles.vidas = Integer.parseInt(Juego.vidasTXT.getText());
                utiles.cucahauu = Integer.parseInt(Juego.velocidadTXT.getText());
                utiles.FUAAAA = Integer.parseInt(Juego.poderTXT.getText());
                

            }
            if (Integer.parseInt(Juego.vidasTXT.getText()) == 0) {                
                return;
            }
        }
        
    }

}
