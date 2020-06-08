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
public class MenuTablero {
    
    MenuBarcos miTablero = new MenuBarcos();
    Scanner entrada=new Scanner(System.in);
    int Intentos=10;
    Date miFecha = new Date();

    public MenuTablero() {        
        
        int nTablero=0;        
        
        do{ 
            System.out.println("*************************************");
            System.out.println("            MENU TABLERO             ");
            System.out.println("*************************************");
            System.out.println("1. INGRESAR BARCOS. \n2. CAMBIAR NUMERO DE INTENTOS. \n3. INICIAR JUEGO." +
                    "\n4. VISUALIZAR TABLERO. " + "\n5. REINICIAR TABLERO. " + "\n6. MENU PRINCIPAL");
            
            try {
                System.out.print(">>En espera de su opcion...");
                nTablero=entrada.nextInt();
                System.out.println("-------------------------------------");                
            }catch (Exception e) {
                entrada.next();
                System.out.println(">>UPS.. NO HAS INGRESADO UN DATO CORRECTO");
            }
            
            switch (nTablero) { //SWITCH PARA SELECCIONAR SEGUNDA ORDEN
                
                case 1:     //INGRESAR BARCOS                      
                         
                        miTablero.Iniciar();
                    break;
                    
                case 2:     // CAMBIAR CANTIDAD DE INTENTOS                    
                    Attempts();  
                    System.out.println("HAS CAMBIADO DE 10 INTENTOS A " + Intentos + " INTENTOS");
                    break;
                
                case 3:     // INICIAR JUEGO 
                        System.out.println(">>INGRESE SU USUARIO ANTES DE CONTINUAR");
                        System.out.println("-------------------------------------");
                        System.out.println(">>BIENVENIDO ");
                        
                        System.out.println(miFecha);                     
                        miTablero.VisualizarTablero();
                             
                    break; 
                    
                case 4:     // VISUALIZAR EL TABLERO 
                    miTablero.VisualizarTablero();
                             
                    break;
                    
                case 5:     // REINICIAR TABLERO
                    miTablero.IniciarTablero();
                             
                    break;                     
                    
            } // SWITCH DEL MENU TABLERO
            
        }while(nTablero!=6);
            System.out.println("-------------------------------------");
    }
    
    public void Attempts(){   // METODO PARA CAMBIAR NUMERO DE INTENTOS 
        try {
                System.out.print(">>CUANTOS INTENTOS DESEAS TENER");
                Intentos=entrada.nextInt();
                System.out.println("-------------------------------------");                
            }catch (Exception e) {
                entrada.next();
                System.out.println(">>UPS.. NO HAS INGRESADO UN DATO CORRECTO");
            }       
    }
    
    public void DameDatos(){
        
        String usuario = entrada.next();
        System.out.println(usuario);
    }
        
    
    
}
