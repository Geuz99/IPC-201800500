/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import clases.Usuarios;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author GEUZ99
 */
public class Menu extends JFrame implements ActionListener {         

    public Menu(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        CrearObjetosInternos();        
    }
    public static Usuarios[] misusuarios = new Usuarios[10];
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;

    public void CrearObjetosInternos() {
        JPanel panelprincipal = utiles.CrearPaneles(800, 500, Color.BLACK);
        btn1 = utiles.CrearBotones("TOP 5 QUICKSORT", 150, 50, 175, 70, Color.WHITE);
        panelprincipal.add(btn1);
        btn2 = utiles.CrearBotones("TOP 5 BUBBLESORT", 150, 50, 175, 130, Color.WHITE);
        panelprincipal.add(btn2);
        btn3 = utiles.CrearBotones("INICIAR JUEGO", 150, 50, 175, 190, Color.WHITE);
        panelprincipal.add(btn3);
        btn4 = utiles.CrearBotones("ACERCA DE", 150, 50, 175, 250, Color.WHITE);
        panelprincipal.add(btn4);
        btn5 = utiles.CrearBotones("SALIR", 150, 50, 175, 310, Color.WHITE);
        panelprincipal.add(btn5);

        this.add(panelprincipal);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object BotonPulsado = e.getSource();
        if (BotonPulsado == btn1) { // BOTON TOP5Q            

        } else if (BotonPulsado == btn2) {  // BOTON TOPB        
           

        } else if (BotonPulsado == btn3) { // BOTON INICO            
            String usurio = JOptionPane.showInputDialog("INGRESA TU USUARIO");
            addUsuarios(new Usuarios(usurio));
            PrintUsuarios();            
            Juego game = new Juego("GA GA GALAAGA");
            game.setVisible(true);            

        } else if (BotonPulsado == btn4) { // BOTON ACERCA DE
            MisDatos misdatos = new MisDatos("CREDITOS");
            misdatos.setVisible(true);

        } else if (BotonPulsado == btn5) { // SALIR
           System.exit(0);

        }
    }
    
    public void addUsuarios(Usuarios obj){
        for (int i = 0; i < misusuarios.length; i++) {
            if (misusuarios[i]==null) {
                misusuarios[i] = obj;
                return;
            }
        }
    }    
    public void PrintUsuarios() {
        for (int i = 0; i < misusuarios.length; i++) {
            if (misusuarios[i] != null) {
                //System.out.println(misusuarios[i].getNombre());
            }
        }
    }    

}
