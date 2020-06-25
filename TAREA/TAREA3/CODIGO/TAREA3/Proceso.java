/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT3;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author GEUZ99
 */
public class Proceso extends Thread {

    JButton boton1;
    JButton boton2;
    JPanel panel;

    public Proceso(JButton boton1, JButton boton2, JPanel panel) {
        this.boton1 = boton1;
        this.boton2 = boton2;
        this.panel = panel;
    }

    public Color randomColor() {
        Random random = new Random();
        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        return new Color(r, g, b);
    }
    
    public Color dameColor(){
        Color color = Color.BLACK;
        int x = (int)(Math.random()*2)+1;
        if (x == 1) {
           color = Color.RED;
           return color;
        }else{
            color = Color.BLUE;
            return color;
        }
        
    }

    @Override
    public void run() {
        while (true) {

//            boton1.setBackground(randomColor());
//            this.panel.add(boton1);
//            boton2.setBackground(randomColor());
//            this.panel.add(boton2);
            
            boton1.setBackground(dameColor());
            this.panel.add(boton1);
            boton2.setBackground(dameColor());
            this.panel.add(boton2);

            try {
                Proceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ESTA FALLANDO EL HILO DEL COLOR" + e);
            }

        }
    }

}
