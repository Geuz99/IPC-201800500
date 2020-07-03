/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import Clases.utiles;
import ListaDoble.DatosListaDoble;
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
public class IListaDoble extends JFrame implements ActionListener {

    public IListaDoble(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 480);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CrearObjetosInternos();
    }

    public void CrearObjetosInternos() {

        mipanel = utiles.CrearPaneles(1, 1, Color.LIGHT_GRAY);

        btnAgregar = utiles.CrearBotones("Agregar", 300, 30, 40, 340, Color.BLACK);
        btnEliminar = utiles.CrearBotones("Eliminar", 300, 30, 40, 380, Color.BLACK);

        area = utiles.CrearTextArea(300, 300, 40, 10);

        mipanel.add(btnAgregar);
        mipanel.add(btnEliminar);

        mipanel.add(area);

        this.add(mipanel);

        btnAgregar.addActionListener(this);
        btnEliminar.addActionListener(this);

    }

    private JPanel mipanel;

    JButton btnAgregar;
    JButton btnEliminar;

    public static JTextArea area;

    @Override
    public void actionPerformed(ActionEvent e) {

        Object BotonPulsado = e.getSource();
        if (BotonPulsado == btnAgregar) {  // BOTON AGREGAR            
            int valor = Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL VALOR"));
            String color = "AZUL";
            Principal.listadoble.insertar(new DatosListaDoble(0, 0, valor, color));
            Principal.listadoble.ImprimirGraphiz(area);
        }
        if (BotonPulsado == btnEliminar) {  // BOTON ELIMINAR
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA POSICION DEL NODO A ELIMINAR"));
            Principal.listadoble.eliminar(posicion);
            Principal.listadoble.ImprimirGraphiz(area);

        }
    }

}
