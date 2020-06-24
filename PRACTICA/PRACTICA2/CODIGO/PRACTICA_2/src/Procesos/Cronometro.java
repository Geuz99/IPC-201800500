package Procesos;

import Tablero.Juego;
import Tablero.utiles;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cronometro extends Thread {

    int minutos;
    int segundos;
    JLabel time;

    public Cronometro(JLabel time) {
        this.time = time;
    }

    @Override
    public void run() {
        for (minutos = 0; minutos < 4; minutos++) {
            for (segundos = 0; segundos < 60; segundos++) {
                this.time.setText(minutos + ":" + segundos);               
                
                try {
                    Cronometro.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (utiles.vidas == 0) {                   
                    return;
                }
            }

        }

    }

}
