/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import Clases.utiles;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author GEUZ99
 */
public class IListaSimple_Agregar extends JFrame {

    public IListaSimple_Agregar(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CrearObjetosInternos();
    }

    public void CrearObjetosInternos() {

        mipanel = utiles.CrearPaneles(1, 1, Color.LIGHT_GRAY);
        
        valor = utiles.CrearLabels("Valor", 30, 30, 60, 50, Color.WHITE);
        valortxt = utiles.CrearTextFields("", 75, 30, 50, 50);

        btnAgregar = utiles.CrearBotones("Agregar", 300, 30, 40, 340, Color.BLACK);
        
        mipanel.add(valor);
        //mipanel.add(valortxt);

        //mipanel.add(btnAgregar);

        this.add(mipanel);

        //btnAgregar.addActionListener(this);        
    }
    private JPanel mipanel;

    JLabel valor;
    JLabel color;

    JTextField valortxt;
    JTextField colortxt;

    JButton btnAgregar;

}
