/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Tablero.Juego;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GEUZ99
 */
public class FUAAAAA extends Thread{
    int contador;

    @Override
    public void run() {
        for (contador = 0;  contador < 6; contador++) {
            Juego.nave.setBackground(Color.PINK);
            System.out.println(contador);
             if (contador == 5) {                 
                    Juego.nave.setBackground(Color.BLACK);
                    Juego.nave.setBounds(Juego.nave.getX() + 1, Juego.nave.getY(), Juego.nave.getWidth(), Juego.nave.getHeight());
                    return;
                }
            try {
                FUAAAAA.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FUAAAAA.class.getName()).log(Level.SEVERE, null, ex);
               
            }
        }
    }
    
    
    
}
