/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import Clases.utiles;
import Cola.DatosCola;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author GEUZ99
 */
public class ICola extends JFrame implements ActionListener {

    public ICola(String title) throws HeadlessException {

        super(title);
        this.setSize(400, 480);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CrearObjetosInternos();
    }

    public void CrearObjetosInternos() {

        mipanel = utiles.CrearPaneles(1, 1, Color.LIGHT_GRAY);

        btnPush = utiles.CrearBotones("Encolar", 300, 30, 40, 340, Color.BLACK);
        btnPop = utiles.CrearBotones("Desencolar", 300, 30, 40, 380, Color.BLACK);

        area = utiles.CrearTextArea(300, 300, 40, 10);

        mipanel.add(btnPush);
        mipanel.add(btnPop);

        mipanel.add(area);

        this.add(mipanel);

        btnPush.addActionListener(this);
        btnPop.addActionListener(this);

    }

    private JPanel mipanel;

    JButton btnPush;
    JButton btnPop;

    public static JTextArea area;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object BotonPulsado = e.getSource();
        if (BotonPulsado == btnPush) {  // BOTON PUSH             
            int valor = Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL VALOR"));
            String color = "VERDE";
            Principal.cola.push(new DatosCola(0, 0, valor, color));
            Principal.cola.ImprimirGraphiz(area);

        }
        if (BotonPulsado == btnPop) {  // BOTON POP  
            Principal.cola.pop();
            Principal.cola.ImprimirGraphiz(area);

        }

    }

}
