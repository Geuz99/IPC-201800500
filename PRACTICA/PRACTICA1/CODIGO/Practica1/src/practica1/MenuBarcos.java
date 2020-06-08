/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author GEUZ99
 */
public class MenuBarcos {

    Scanner entrada = new Scanner(System.in);
    int menu;
    int Barcos;
    int tamanio;
    String[][] tablero;
    String[][] tableroInterno;   
    String cooLocal;
    String cooLocal2;
    int FilaInicio;
    int ColumnaInicio;
    int FilaFinal;
    int ColumnaFinal;
    int BarcoColocados;
    int Contador;     
    

    public void Iniciar() {
        
        BarcoColocados = 0;
        this.Barcos = 9;
        this.tamanio = 10;
        tablero = new String[tamanio][tamanio];
        tableroInterno = new String[tamanio][tamanio];
        menu = 0;
        IniciarTablero();
        mostrarMenu();

    }  
    

    public void mostrarMenu() { // METODO QUE MUESTRA EL MENU DE BARCOS EN CONSOLA

        do {
            System.out.println("*************************************");
            System.out.println("             MENU BARCOS             ");
            System.out.println("*************************************");
            System.out.println("1. INSERTAR PORTAVIONES. \n2. INSERTAR SUBMARINOS. \n3. INSERTAR DESTRUCTORES."
                    + "\n4. INSERTAR FRAGATAS. " + "\n5. INSERTAR EASTER EGG. ");

            try {
                System.out.print(">>En espera de su opcion...");
                menu = entrada.nextInt();
                System.out.println("-------------------------------------");
            } catch (Exception e) {
                entrada.next();
                System.out.println(">>UPS.. NO HAS INGRESADO UN DATO CORRECTO");
            }

            switch (menu) { //SWITCH PARA SELECCIONAR TIPO DE BARCOS 

                case 1:     //INSERTAR PORTAVIONES (4 espacios)                    
                    System.out.println(">>CUENTAS DE UN PORTAVION QUE OCUPA 4 ESPACIOS");
                    System.out.println(">>INGRESE EL PORTAVION DE LA SIGUIENTE MANERA (FILAINCIO, COLUMNAINCIO)-(FILAFIN, COLUMNAFIN)");
                    cooLocal = entrada.next();
                    cooLocal2 = cooLocal;
                    IngresarShip(cooLocal, cooLocal2, 4);

                    break;
                    
                case 2: // INSERTAR SUBMARINO (3 espacios)
                    
                    System.out.println(">>CUENTAS CON 3 PORTAVION QUE OCUPA 3 ESPACIOS");
                    System.out.println(">>INGRESE LOS SUBMARINOS DE LA SIGUIENTE MANERA (FILAINCIO, COLUMNAINCIO)-(FILAFIN, COLUMNAFIN)");
                    cooLocal = entrada.next();
                    cooLocal2 = cooLocal;
                    IngresarShip(cooLocal, cooLocal2, 3);

                    break;

                case 3:     // INSERTAR DESTRUCTORES (2 espacios)  
                    System.out.println(">>CUENTAS CON 3 PORTAVION QUE OCUPA 2 ESPACIOS");
                    System.out.println(">>INGRESE EL PORTAVION DE LA SIGUIENTE MANERA (FILAINCIO, COLUMNAINCIO)-(FILAFIN, COLUMNAFIN)");
                    cooLocal = entrada.next();
                    cooLocal2 = cooLocal;
                    IngresarShip(cooLocal, cooLocal2, 2);

                    break;

                case 4:     // INSERTAR FRAGATAS (1 espacios)

                    System.out.println(">>CUENTAS CON DOS FRAGATAS QUE OCUPA 1 ESPACIO");
                    System.out.println(">>INGRESE EL FRAGATA DE LA SIGUIENTE MANERA (FILAINCIO, COLUMNAINCIO)");
                    cooLocal = entrada.next();
                    FilaInicio = DameCoo(cooLocal, 0);
                    ColumnaInicio = DameCoo(cooLocal, 1);

                    if (FilaInicio >= this.tamanio && ColumnaInicio >= this.tamanio) {
                        System.out.println(">>NO SE PUEDE COLOCAR");
                        continue;
                    }
                    System.out.println(">>INGRESANDO COORDENADAS...");
                    System.out.println("-------------------------------------");
                    tablero[FilaInicio][ColumnaInicio] = "O";
                    ImprimirTablero(tablero, this.tamanio, this.tamanio);                  

                    break;

                case 5:     // INSERTAR EASTER EGG (1 espacio)                     

                    System.out.println(">>INGRESA TU EASTER EGG DE LA SIGUIENTE MANERA (FILA, COLUMNA)");
                    cooLocal = entrada.next();
                    FilaInicio = DameCoo(cooLocal, 0);
                    ColumnaInicio = DameCoo(cooLocal, 1);

                    if (FilaInicio >= this.tamanio && ColumnaInicio >= this.tamanio) {
                        System.out.println(">>NO SE PUEDE COLOCAR");
                        continue;
                    }
                    System.out.println(">>INGRESANDO COORDENADAS...");
                    System.out.println("-------------------------------------");
                    tablero[FilaInicio][ColumnaInicio] = "$";
                    ImprimirTablero(tablero, this.tamanio, this.tamanio);                   

                    break;

            } // SWITCH DEL MENU BARCOS 

        } while (menu!=6);

    }

    public static String QuitarIyF(String texto) { // METEDO PARA QUITAR LOS PARENTESIS (0,0)-(0,3)
        String aux = "";
        for (int i = 1; i < 4; i++) {
            aux = aux + texto.charAt(i);
        }
        return aux;
    }

    public static int separator(String texto, int pocision) { // METODO PARA QUITAR ,
        String[] aux = texto.split(",");
        return Integer.parseInt(aux[pocision]);

    }

    public static void ImprimirTablero(String[][] matriz, int fila, int columna) { // IMPRIME MI TABLERO EN CONSOLA
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(" | " + matriz[i][j]);

            }
            System.out.println("");

        }
    } 
    
    public void VisualizarTablero(){        
        ImprimirTablero(tablero, this.tamanio, this.tamanio);
    }
   

    public void IniciarTablero() { // ESTABLECE MI TABLERO VACIO

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = " ";
                tableroInterno[i][j] = " ";

            }

        }

    }

    public int DameCoo(String coo, int posicion) {
        String aux = QuitarIyF(coo);
        int parametro = separator(aux, posicion);
        return parametro;
    }

    public static String QuitarIyF2(String texto) { // METEDO PARA QUITAR LOS PARENTESIS
        String aux = "";
        for (int i = 7; i < 10; i++) {
            aux = aux + texto.charAt(i);
        }
        return aux;
    }

    public static int separato2(String texto, int pocision) { // METODO PARA QUITAR ,
        String[] aux = texto.split(",");
        return Integer.parseInt(aux[pocision]);

    }

    public int DameCoo2(String coo, int posicion) {
        String aux = QuitarIyF2(coo);
        int parametro = separator(aux, posicion);
        return parametro;
    }

    public void IngresarShip(String cooLocal, String cooLocal2, int Dimention) {

        System.out.println(">>LA NAVBE QUE OCUPA " + Dimention + " ESPACIOS");

        FilaInicio = DameCoo(cooLocal, 0);
        ColumnaInicio = DameCoo(cooLocal, 1);
        FilaFinal = DameCoo2(cooLocal2, 0);
        ColumnaFinal = DameCoo2(cooLocal2, 1);
        System.out.println(">>INGRESANDO COORDENADAS...");

        if (FilaInicio != FilaFinal && ColumnaInicio != ColumnaFinal) {
            System.out.println(">>SOLO SE PUEDEN INGRESAR VERTICALMENTE U HORIZONTALMENTE");
            return;
        }
        if (FilaInicio == FilaFinal) {
            int Dimension = (Math.abs(ColumnaFinal - ColumnaInicio)) + 1;
            if (Dimension != Dimention) {
                System.out.println(">>LA DIMENSION DEL BARCO NO COINCIDE");
                return;
            }

            if (Dimension == Dimention) {
                for (int i = ColumnaInicio; i <= ColumnaFinal; i++) {
                    if (tablero[FilaInicio][i].equals("O")) {
                        Contador++;
                    }

                }
                if (Contador == 0) {
                    for (int i = ColumnaInicio; i <= ColumnaFinal; i++) {
                        tablero[FilaInicio][i] = "O";
                    }
                    ImprimirTablero(tablero, this.tamanio, this.tamanio);
                    BarcoColocados = BarcoColocados + 1;
                } else {
                    System.out.println(">>NO PUEDE COLOCAR EL BARCO SOBRE OTRO.");
                    Contador = 0;
                }
            }
        }

        if (ColumnaInicio == ColumnaFinal) {
            int Dimension = (Math.abs(FilaFinal - FilaInicio)) + 1;
            if (Dimension != Dimention) {
                System.out.println(">>LA DIMENSION DEL BARCO NO COINCIDE");
                return;
            }

            if (Dimension == Dimention) {
                for (int i = FilaInicio; i <= FilaFinal; i++) {
                    if (tablero[i][ColumnaInicio].equals("O")) {
                        Contador++;
                    }

                }
                if (Contador == 0) {
                    for (int i = FilaInicio; i <= FilaFinal; i++) {
                        tablero[i][ColumnaInicio] = "O";
                    }
                    ImprimirTablero(tablero, this.tamanio, this.tamanio);
                    BarcoColocados = BarcoColocados + 1;
                } else {
                    System.out.println(">>NO PUEDE COLOCAR EL BARCO SOBRE OTRO.");
                    Contador = 0;
                }
            } 

        }

    }

}


 