/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author GEUZ99
 */
public class Cronometro extends Thread {

    int segundos;
    JLabel time;

    public Cronometro(JLabel time) {
        this.time = time;
    }

    @Override
    public void run() {

        for (segundos = 20; segundos >= 0; segundos--) {
            this.time.setText(Integer.toString(segundos) + " " + "seg");
            utiles.segundos--;
            try {
                Cronometro.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
