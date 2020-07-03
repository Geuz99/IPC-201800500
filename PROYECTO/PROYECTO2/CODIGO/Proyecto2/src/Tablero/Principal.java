/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

import Carga.Datos;
import Clases.utiles;
import Cola.Cola;
import Cola.DatosCola;
import ListaCircular.*;
import ListaDoble.DatosListaDoble;
import ListaDoble.ListaDoble;
import ListaSimple.ListaSimple;
import Pila.DatosPila;
import Pila.Pila;
import Procesos.Colision;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author GEUZ99
 */
public class Principal extends JFrame implements ActionListener {

    public Principal(String title) throws HeadlessException {

        super(title);
        this.setSize(640, 560);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        addBoton();
        CrearObjetosInternos();

    }
    private int Fil = 7;
    private int Col = 5;
    public static JButton[][] misbotones;
    JPanel mitablero = new JPanel(null);

    public void CrearObjetosInternos() {

        mitablero.setBounds(40, 130, 525, 375);
        mitablero.setBackground(Color.white);
        game = utiles.CrearPaneles(1, 1, Color.LIGHT_GRAY);

        //--------------------------------BOTONES---------------------------------------------------
        //------------------------------------------------------------------------------------------
        btnCargar = utiles.CrearBotones("Cargar Datos", 125, 25, 40, 10, Color.BLACK);
        btnReiniciar = utiles.CrearBotones("Reiniciar", 125, 25, 40, 60, Color.BLACK);
        btnListaCircular = utiles.CrearBotones("Lista Circular", 125, 25, 180, 30, Color.BLACK);
        btnListaSimple = utiles.CrearBotones("Lista Simple", 125, 25, 320, 10, Color.BLACK);
        btnPila = utiles.CrearBotones("Pila", 125, 25, 320, 60, Color.BLACK);
        btnListaDoble = utiles.CrearBotones("Lista Doble", 125, 25, 460, 10, Color.BLACK);
        btnCola = utiles.CrearBotones("Cola", 125, 25, 460, 60, Color.BLACK);

        //--------------------------------FILA UNO---------------------------------------------------
        //-------------------------------------------------------------------------------------------
        Fila0Col0 = utiles.CrearLabels("", 75, 75, 0, 0, Color.WHITE);
        Fila0Col1 = utiles.CrearLabels("", 75, 75, 75, 0, Color.WHITE);
        Fila0Col2 = utiles.CrearLabels("", 75, 75, 150, 0, Color.WHITE);
        Fila0Col3 = utiles.CrearLabels("", 75, 75, 225, 0, Color.WHITE);
        Fila0Col4 = utiles.CrearLabels("", 75, 75, 300, 0, Color.WHITE);
        Fila0Col5 = utiles.CrearLabels("", 75, 75, 375, 0, Color.WHITE);
        Fila0Col6 = utiles.CrearLabels("", 75, 75, 450, 0, Color.WHITE);

        //--------------------------------FILA DOS---------------------------------------------------
        //-------------------------------------------------------------------------------------------
        Fila1Col0 = utiles.CrearLabels("", 75, 75, 0, 75, Color.WHITE);
        Fila1Col1 = utiles.CrearLabels("", 75, 75, 75, 75, Color.WHITE);
        Fila1Col2 = utiles.CrearLabels("", 75, 75, 150, 75, Color.WHITE);
        Fila1Col3 = utiles.CrearLabels("", 75, 75, 225, 75, Color.WHITE);
        Fila1Col4 = utiles.CrearLabels("", 75, 75, 300, 75, Color.WHITE);
        Fila1Col5 = utiles.CrearLabels("", 75, 75, 375, 75, Color.WHITE);
        Fila1Col6 = utiles.CrearLabels("", 75, 75, 450, 75, Color.WHITE);

        //--------------------------------FILA TRES--------------------------------------------------
        //-------------------------------------------------------------------------------------------
        Fila2Col0 = utiles.CrearLabels("", 75, 75, 0, 150, Color.WHITE);
        Fila2Col1 = utiles.CrearLabels("", 75, 75, 75, 150, Color.WHITE);
        Fila2Col2 = utiles.CrearLabels("", 75, 75, 150, 150, Color.WHITE);
        Fila2Col3 = utiles.CrearLabels("", 75, 75, 225, 150, Color.WHITE);
        Fila2Col4 = utiles.CrearLabels("", 75, 75, 300, 150, Color.WHITE);
        Fila2Col5 = utiles.CrearLabels("", 75, 75, 375, 150, Color.WHITE);
        Fila2Col6 = utiles.CrearLabels("", 75, 75, 450, 150, Color.WHITE);

        //--------------------------------FILA CUATRO------------------------------------------------
        //-------------------------------------------------------------------------------------------
        Fila3Col0 = utiles.CrearLabels("", 75, 75, 0, 225, Color.WHITE);
        Fila3Col1 = utiles.CrearLabels("", 75, 75, 75, 225, Color.WHITE);
        Fila3Col2 = utiles.CrearLabels("", 75, 75, 150, 225, Color.WHITE);
        Fila3Col4 = utiles.CrearLabels("", 75, 75, 225, 225, Color.WHITE);
        Fila3Col5 = utiles.CrearLabels("", 75, 75, 300, 225, Color.WHITE);
        Fila3Col6 = utiles.CrearLabels("", 75, 75, 375, 225, Color.WHITE);
        Fila3Col7 = utiles.CrearLabels("", 75, 75, 450, 225, Color.WHITE);

        //--------------------------------FILA CINCO-------------------------------------------------
        //-------------------------------------------------------------------------------------------
        Fila4Col0 = utiles.CrearLabels("", 75, 75, 0, 300, Color.WHITE);
        Fila4Col1 = utiles.CrearLabels("", 75, 75, 75, 300, Color.WHITE);
        Fila4Col2 = utiles.CrearLabels("", 75, 75, 150, 300, Color.WHITE);
        Fila4Col3 = utiles.CrearLabels("", 75, 75, 225, 300, Color.WHITE);
        Fila4Col4 = utiles.CrearLabels("", 75, 75, 300, 300, Color.WHITE);
        Fila4Col5 = utiles.CrearLabels("", 75, 75, 375, 300, Color.WHITE);
        Fila4Col6 = utiles.CrearLabels("", 75, 75, 450, 300, Color.WHITE);

        this.add(game);
        game.add(mitablero);

        Colision proceso = new Colision();
        proceso.start();

        misbotones[0][0].addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                switch (e.getKeyCode()) {
                    case 37:// IZQUIERDA
                        if (misbotones[0][0].getX() > 0) {
                            misbotones[0][0].setBounds(misbotones[0][0].getX() - 75, misbotones[0][0].getY(), misbotones[0][0].getWidth(), misbotones[0][0].getHeight());

                        }
                        break;
                    case 38:// ARRIBA
                        if (misbotones[0][0].getY() > 0) {
                            misbotones[0][0].setBounds(misbotones[0][0].getX(), misbotones[0][0].getY() - 75, misbotones[0][0].getWidth(), misbotones[0][0].getHeight());
                        }
                        break;
                    case 39:// DERECHA
                        if (misbotones[0][0].getX() < 400) {
                            misbotones[0][0].setBounds(misbotones[0][0].getX() + 75, misbotones[0][0].getY(), misbotones[0][0].getWidth(), misbotones[0][0].getHeight());
                        }
                        break;
                    case 40:// ABAJO
                        if (misbotones[0][0].getY() < 275) {
                            misbotones[0][0].setBounds(misbotones[0][0].getX(), misbotones[0][0].getY() + 75, misbotones[0][0].getWidth(), misbotones[0][0].getHeight());
                        }
                        break;

                }

            }
        });

        game.add(btnCargar);
        game.add(btnReiniciar);
        game.add(btnListaCircular);
        game.add(btnListaSimple);
        game.add(btnPila);
        game.add(btnListaDoble);
        game.add(btnCola);

        mitablero.add(Fila0Col0);
        mitablero.add(Fila0Col1);
        mitablero.add(Fila0Col2);
        mitablero.add(Fila0Col3);
        mitablero.add(Fila0Col4);
        mitablero.add(Fila0Col5);
        mitablero.add(Fila0Col6);

        mitablero.add(Fila1Col0);
        mitablero.add(Fila1Col1);
        mitablero.add(Fila1Col2);
        mitablero.add(Fila1Col3);
        mitablero.add(Fila1Col4);
        mitablero.add(Fila1Col5);
        mitablero.add(Fila1Col6);

        mitablero.add(Fila2Col0);
        mitablero.add(Fila2Col1);
        mitablero.add(Fila2Col2);
        mitablero.add(Fila2Col3);
        mitablero.add(Fila2Col4);
        mitablero.add(Fila2Col5);
        mitablero.add(Fila2Col6);

        mitablero.add(Fila3Col0);
        mitablero.add(Fila3Col1);
        mitablero.add(Fila3Col2);
        mitablero.add(Fila3Col4);
        mitablero.add(Fila3Col5);
        mitablero.add(Fila3Col6);
        mitablero.add(Fila3Col7);

        mitablero.add(Fila4Col0);
        mitablero.add(Fila4Col1);
        mitablero.add(Fila4Col2);
        mitablero.add(Fila4Col3);
        mitablero.add(Fila4Col4);
        mitablero.add(Fila4Col5);
        mitablero.add(Fila4Col6);

        btnCargar.addActionListener(this);
        btnReiniciar.addActionListener(this);
        btnListaCircular.addActionListener(this);
        btnListaSimple.addActionListener(this);
        btnPila.addActionListener(this);
        btnListaDoble.addActionListener(this);
        btnCola.addActionListener(this);
        ;
    }

    private JPanel game;

    public static JButton yo;

    JButton btnCargar;
    JButton btnReiniciar;
    JButton btnListaCircular;
    JButton btnListaSimple;
    JButton btnPila;
    JButton btnListaDoble;
    JButton btnCola;

    private JLabel Fila0Col0;
    private JLabel Fila0Col1;
    private JLabel Fila0Col2;
    private JLabel Fila0Col3;
    private JLabel Fila0Col4;
    private JLabel Fila0Col5;
    private JLabel Fila0Col6;

    private JLabel Fila1Col0;
    private JLabel Fila1Col1;
    private JLabel Fila1Col2;
    private JLabel Fila1Col3;
    private JLabel Fila1Col4;
    private JLabel Fila1Col5;
    private JLabel Fila1Col6;

    private JLabel Fila2Col0;
    private JLabel Fila2Col1;
    private JLabel Fila2Col2;
    private JLabel Fila2Col3;
    private JLabel Fila2Col4;
    private JLabel Fila2Col5;
    private JLabel Fila2Col6;

    private JLabel Fila3Col0;
    private JLabel Fila3Col1;
    private JLabel Fila3Col2;
    private JLabel Fila3Col4;
    private JLabel Fila3Col5;
    private JLabel Fila3Col6;
    private JLabel Fila3Col7;

    private JLabel Fila4Col0;
    private JLabel Fila4Col1;
    private JLabel Fila4Col2;
    private JLabel Fila4Col3;
    private JLabel Fila4Col4;
    private JLabel Fila4Col5;
    private JLabel Fila4Col6;

    public static ListaSimple lista = new ListaSimple();
    public static ListaDobleCircular listacircular = new ListaDobleCircular();
    public static ListaDoble listadoble = new ListaDoble();
    public static Pila pila = new Pila();
    public static Cola cola = new Cola();

    @Override
    public void actionPerformed(ActionEvent e) {

        Object BotonPulsado = e.getSource();
        if (BotonPulsado == btnCargar) {  // BOTON CARGAR DATOS
            AbrirArchivo();
            iniciarTablero();
            //addListaSimpleID();

        }
        if (BotonPulsado == btnReiniciar) {  // BOTON REINICIAR  
            if (lista.estaVacia() && listacircular.estaVacia()
                    && listadoble.estaVacia() && pila.PilaVacia() && cola.colaVacia()) {
                
                JOptionPane.showMessageDialog(null, "LAS LISTAS ESTAN VACIAS");
            } else {

                lista.vaciar();
                listadoble.vaciar();
                listacircular.vaciar();
                pila.vaciarPila();
                cola.vaciar();
                ReiniciarAddBoton();
            }

        }
        if (BotonPulsado == btnListaCircular) {  // BOTON LISTA CIRCULAR   
            addListaCircularID();

            if (listacircular.estaVacia()) {
                JOptionPane.showMessageDialog(null, "LA LISTA ESTA VACIA");

            } else {
                IListaDobleCircular obj = new IListaDobleCircular("LISTA DOBLE CIRCULAR");
                obj.setVisible(true);
                listacircular.ImprimirGraphiz(IListaDobleCircular.area);
            }

        }
        if (BotonPulsado == btnListaSimple) {  // BOTON LISTA SIMPLE    
            if (lista.estaVacia()) {
                JOptionPane.showMessageDialog(null, "LA LISTA ESTA VACIA");

            } else {
                IListaSimple obj = new IListaSimple("LISTA SIMPLE");
                obj.setVisible(true);
                lista.ImprimirGraphiz(IListaSimple.area);

            }
        }
        if (BotonPulsado == btnPila) { // BOTON PILA            
            //addPilaID();

            if (pila.PilaVacia()) {
                JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA");

            } else {
                IPila obj = new IPila("PILA");
                obj.setVisible(true);
                pila.ImprimirGraphiz(IPila.area);

            }

        }
        if (BotonPulsado == btnListaDoble) { // BOTON LISTA DOBLE
            //addListaDobleID();
            if (listadoble.estaVacia()) {
                JOptionPane.showMessageDialog(null, "LA LISTA ESTA VACIA");

            } else {
                IListaDoble obj = new IListaDoble("LISTA DOBLE");
                obj.setVisible(true);
                //listadoble.imprimir();
                listadoble.ImprimirGraphiz(IListaDoble.area);

            }

        }
        if (BotonPulsado == btnCola) { // BOTON COLA
            if (cola.colaVacia()) {
                JOptionPane.showMessageDialog(null, "LA COLA ESTA VACIA");

            } else {
                ICola obj = new ICola("COLA");
                obj.setVisible(true);
                cola.ImprimirGraphiz(ICola.area);

            }

        }

    }

    public void AbrirArchivo() {

        JFileChooser fc = new JFileChooser();
        //Restricción que muestra solo archivos en la ventana de selección
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .ipc1", "ipc1");
        //Restricción de archivos de entrada por extensión
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            try {

                FileReader fr = new FileReader(fc.getSelectedFile());
                BufferedReader br = new BufferedReader(fr);
                String temp = "";
                while (temp != null) {
                    temp = br.readLine();
                    if (temp != null) {
                        String[] vector = temp.split("\n");
                        for (String elemento : vector) {
                            System.out.println(elemento);
                            HacerloVector(elemento);
                        }
                    }
                }

            } catch (FileNotFoundException ex) {
                System.out.println("falla en " + ex);
            } catch (IOException e) {
                System.out.println("falle en " + e);
            }

        }

    }

    public void HacerloVector(String elemento) {

        String[] vector = null;
        if (elemento != null) {
            vector = elemento.split(",");
        }
        lista.insertarCabezaLista(new Datos(Integer.parseInt(vector[0]),
                Integer.parseInt(vector[1]),
                Integer.parseInt(vector[2]),
                vector[3]));

    }

    public void addBoton() {

        misbotones = new JButton[Fil][Col];
        int x = 75;
        int y = 75;

        for (int i = 0; i < misbotones.length; i++) {
            for (int j = 0; j < misbotones[i].length; j++) {
                if (i == 0 && j == 0) {
                    misbotones[i][j] = utiles.CrearBotones("", 75, 75, x * i, y * j, Color.BLACK);
                    mitablero.add(misbotones[i][j]);
                } else {
                    misbotones[i][j] = utiles.CrearBotones("", 75, 75, x * i, y * j, Color.WHITE);
                    mitablero.add(misbotones[i][j]);
                }

            }
        }

    }

    public void ReiniciarAddBoton() {

        for (int i = 0; i < misbotones.length; i++) {
            for (int j = 0; j < misbotones[i].length; j++) {
                if (i == 0 && j == 0) {
                    misbotones[i][j].setBackground(Color.BLACK);
                    mitablero.add(misbotones[i][j]);
                } else {
                    misbotones[i][j].setBackground(Color.WHITE);
                    misbotones[i][j].setText("");
                    mitablero.add(misbotones[i][j]);
                }

            }
        }
    }

    public void iniciarTablero() {
        int x = 0;
        int y = 0;
        int valor = 0;
        String color = "";
        int contador = 0;
        while (contador < lista.dameSize()) {
            x = lista.obtener(contador).getFila();
            y = lista.obtener(contador).getColumna();
            valor = lista.obtener(contador).getValor();
            color = lista.obtener(contador).getColor();
            if (color.equalsIgnoreCase("ROJO")) {
                misbotones[y][x].setBackground(Color.RED);
                listacircular.insertar(new DatosDC(Fil, Col, valor, color));

            }
            if (color.equalsIgnoreCase("VERDE")) {
                misbotones[y][x].setBackground(Color.GREEN);
                cola.push(new DatosCola(x, y, valor, color));
            }
            if (color.equalsIgnoreCase("AZUL")) {
                misbotones[y][x].setBackground(Color.BLUE);
                listadoble.insertar(new DatosListaDoble(x, y, valor, color));
            }
            if (color.equalsIgnoreCase("AMARILLO")) {
                misbotones[y][x].setBackground(Color.YELLOW);
                pila.push(new DatosPila(Fil, Col, valor, color));
            }
            misbotones[y][x].setText(String.valueOf(valor));
            misbotones[y][x].setForeground(Color.BLACK);
            mitablero.add(misbotones[y][x]);

            contador++;
        }
    }

    public void addListaSimpleID() {
        int contador = 0;
        int id = 1;
        while (contador < lista.dameSize()) {
            lista.obtener(contador).setId(id);

            contador++;
            id++;
        }
    }

    public void addListaCircularID() {
        int contador = 0;
        int id = 1;
        while (contador < listacircular.damesize()) {
            listacircular.obtener(contador).setId(id);
            contador++;
            id++;
        }
    }

    public void addListaDobleID() {
        int contador = 0;
        int id = 1;
        while (contador < listadoble.damesize()) {
            listadoble.obtener(contador).setId(id);
            contador++;
            id++;
        }
    }

    public void addPilaID() {
        int contador = 0;
        int id = 1;
        while (contador < pila.damesize()) {
            pila.obtener(contador).setId(id);
            contador++;
            id++;
        }
    }

}
