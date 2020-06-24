/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import Procesos.CrearBotones;
import Procesos.Cronometro;
import Procesos.Disparo;
import Procesos.FUAAAAA;
import static Tablero.Menu.misusuarios;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author GEUZ99
 */
public class Juego extends JFrame {

    
    public Juego(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 560);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CrearObjetosInternos();
        DameUsuario();        

    }
    public static JLabel usuario = utiles.CrearLabels("NOMBRE", 75, 50, 450, 20, Color.BLACK);
    public static JButton nave = utiles.CrearBotones("0", 75, 75, 75, 450, Color.BLACK);
    public static JTextField vidasTXT;
    public static JTextField poderTXT;
    public static JTextField punteoTXT;
    public static JTextField velocidadTXT;
    public static JButton disparo = utiles.CrearBotones(".", 20, 20, nave.getX() + 30, nave.getY() + 30, Color.ORANGE);

    public void CrearObjetosInternos() {
        JPanel juego = utiles.CrearPaneles(800, 500, Color.GREEN);

        // -------------------------------------------------------------------------------------------------
        // -----------------------------------BOTONES-------------------------------------------------------
        CrearBotones hilacolumna0 = new CrearBotones(1, 75, 75, Color.RED, juego, "ABAJO", 14); //CORAZON
        Thread hilo0 = new Thread(hilacolumna0);
        hilo0.start();
        CrearBotones hilacolumna1 = new CrearBotones(2, 75, 75, Color.YELLOW, juego, "ABAJO", 10);//RAYOS
        Thread hilo1 = new Thread(hilacolumna1);
        hilo1.start();
        CrearBotones hilacolumna2 = new CrearBotones(3, 75, 75, Color.BLUE, juego, "ABAJO", 15);//CARACOL
        Thread hilo2 = new Thread(hilacolumna2);
        hilo2.start();
        CrearBotones hilacolumna3 = new CrearBotones(4, 75, 75, Color.WHITE, juego, "ABAJO", 10);//OJO
        Thread hilo3 = new Thread(hilacolumna3);
        hilo3.start();
        CrearBotones hilacolumna4 = new CrearBotones(5, 75, 75, Color.GRAY, juego, "ABAJO", 2);//ASTEROIDES
        Thread hilo4 = new Thread(hilacolumna4);
        hilo4.start();
        // -------------------------------------------------------------------------------------------------
        // -----------------------------------ETIQUETAS-----------------------------------------------------

        usuario = utiles.CrearLabels("NOMBRE", 75, 50, 450, 20, Color.BLACK);
        juego.add(usuario);
        JLabel vidas = utiles.CrearLabels("VIDAS", 75, 50, 450, 110, Color.BLACK);
        juego.add(vidas);
        vidasTXT = utiles.CrearTextFields("3", 40, 20, 480, 150);
        juego.add(vidasTXT);
        JLabel poder = utiles.CrearLabels("PODER", 75, 50, 450, 200, Color.BLACK);
        juego.add(poder);
        poderTXT = utiles.CrearTextFields("0", 40, 20, 480, 240);
        juego.add(poderTXT);
        JLabel velocidad = utiles.CrearLabels("VELOCIDAD", 75, 75, 450, 290, Color.BLACK);
        juego.add(velocidad);
        velocidadTXT = utiles.CrearTextFields("0", 40, 20, 480, 330);
        juego.add(velocidadTXT);
        JLabel punteo = utiles.CrearLabels("PUNTEO", 75, 50, 450, 380, Color.BLACK);
        juego.add(punteo);
        punteoTXT = utiles.CrearTextFields("0", 40, 20, 480, 420);
        juego.add(punteoTXT);
        JLabel tiempo = utiles.CrearLabels("TIEMPO", 100, 100, 450, 420, Color.BLACK);
        JLabel cronometro = utiles.CrearLabels("00", 100, 100, 475, 435, Color.BLACK);
        juego.add(cronometro);
        Cronometro hiloCronometro = new Cronometro(cronometro);
        hiloCronometro.start();         
        juego.add(tiempo);        
        nave = utiles.CrearBotones("GEUZ99", 75, 75, 75, 450, Color.BLACK);
        this.add(juego);        
        juego.add(nave);

        nave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        nave.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //System.out.println("Pressed");
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                switch (e.getKeyCode()) {

                    case 37:
                        if (nave.getX()>75) {
                        nave.setBounds(nave.getX() - 75, nave.getY(), nave.getWidth(), nave.getHeight());
                        }
                        break;

                    case 40:
                        // FUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                        if (utiles.FUAAAA > 0) {
                            utiles.FUAAAA = utiles.FUAAAA - 1;
                            nave.setBounds(nave.getX() - 1, nave.getY(), nave.getWidth(), nave.getHeight());
                            FUAAAAA mifua = new FUAAAAA();
                            mifua.start();
                            poderTXT.setText(String.valueOf(utiles.FUAAAA));
                        } else {
                            System.out.println("NO CUENTAS CON EL FUAAAA");
                        }
                        break;
                    case 39:
                        if (nave.getX()<300) {
                            nave.setBounds(nave.getX() + 75, nave.getY(), nave.getWidth(), nave.getHeight());
                        }
                        
                        break;
                    case 32: //DISPARO   
                        disparo = utiles.CrearBotones(".", 20, 20, nave.getX() + 30, nave.getY() + 30, Color.ORANGE);
                        juego.add(disparo);
                        Disparo proceso = new Disparo(disparo, "ARRIBA");
                        proceso.start();
                        break;

                }
            }
        });

    }

    public void DameUsuario() {
        for (int i = 0; i < misusuarios.length; i++) {
            if (misusuarios[i] != null) {
                String name = misusuarios[i].getNombre();
                usuario.setText(name);
            }
        }
    }   

}
