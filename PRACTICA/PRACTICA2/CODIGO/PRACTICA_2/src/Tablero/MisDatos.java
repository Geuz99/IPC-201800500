/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author GEUZ99
 */
public class MisDatos extends JFrame {

    public MisDatos(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CrearObjetosInternos();
    }

    public void CrearObjetosInternos() {
        JPanel misdatos = utiles.CrearPaneles(800, 500, Color.GREEN);
        add(misdatos);
        JLabel nombre = utiles.CrearLabels("ANDERSON GERARDO", 500, 50, 125, 100, Color.BLACK);
        JLabel apellido = utiles.CrearLabels("ZULETA GALDAMEZ", 500, 50, 130, 130, Color.BLACK);
        JLabel carnet = utiles.CrearLabels("201800500", 500, 50, 150, 160, Color.BLACK);        
        misdatos.add(nombre);
        misdatos.add(apellido);
        misdatos.add(carnet);
    }

}
