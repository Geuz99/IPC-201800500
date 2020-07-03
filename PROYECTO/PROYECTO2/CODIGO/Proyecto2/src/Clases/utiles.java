/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 *
 * @author GEUZ99
 */
public class utiles {

    public static JPanel CrearPaneles(int ancho, int alto, Color color) {
        JPanel mipanel = new JPanel(null);
        mipanel.setPreferredSize(new Dimension(alto, ancho));
        mipanel.setBackground(color);
        return mipanel;
    }

    public static JButton CrearBotones(String texto, int ancho, int alto, int x, int y, Color color) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
        boton.setForeground(Color.WHITE);
        return boton;
    }

    public static JLabel CrearLabels(String texto, int ancho, int alto, int x, int y, Color color) {
        JLabel label = new JLabel(texto);
        label.setBounds(x, y, ancho, alto);
        label.setBackground(color);
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label.setOpaque(true);
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        return label;
    }

    public static JTextField CrearTextFields(String texto, int ancho, int alto, int x, int y) {
        JTextField textfield = new JTextField(texto);
        textfield.setBounds(x, y, ancho, alto);
        return textfield;
    }
    
    public static JTextArea CrearTextArea(int ancho, int alto, int x, int y){
        JTextArea textarea =  new JTextArea();
        textarea.setBounds(x, y, ancho, alto);
        return textarea;
    }
}
