package Procesos;

import Pila.Pila;
import java.awt.Color;
import javax.swing.JButton;

public class utiles {
    
    public static int segundos = 20;
    public static Pila mipila = new Pila();
    
    public static JButton CrearBotones(String texto, int ancho, int alto, int x, int y, Color color){
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
        return boton;
    }
    
}
