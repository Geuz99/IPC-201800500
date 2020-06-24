/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author GEUZ99
 */
public class utiles {

public static int vidas = 3;
public static int punteo = 0;
public static int cucahauu = 0;
public static int Nocucahauu = 0;
public static int FUAAAA = 0;
    
    
    public static JPanel CrearPaneles(int ancho, int alto, Color color){
        JPanel mipanel = new JPanel(null);
        mipanel.setPreferredSize(new Dimension(alto, ancho));
        mipanel.setBackground(color);        
        return mipanel;                
    }
    
    public static JButton CrearBotones(String texto, int ancho, int alto, int x, int y, Color color){
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
        return boton;
    }
    public static JLabel CrearLabels(String texto, int ancho, int alto, int x, int y, Color color){
        JLabel label = new JLabel(texto);
        label.setBounds(x, y, ancho, alto);
        //label.setBackground(color);
        label.setForeground(color);
        return label;
    } 
    public static JTextField CrearTextFields(String texto, int ancho, int alto, int x, int y){
        JTextField textfield = new JTextField(texto);
        textfield.setBounds(x, y, ancho, alto);        
        return textfield;
    } 
    
    
}
