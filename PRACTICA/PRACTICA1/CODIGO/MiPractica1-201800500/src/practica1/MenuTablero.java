/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author GEUZ99
 */
public class MenuTablero {
    
    Scanner entrada=new Scanner(System.in);
    int Intentos=10;

    public MenuTablero() {
        
        int nTablero=0;        
        
        do{ 
            System.out.println("*************************************");
            System.out.println("            MENU TABLERO             ");
            System.out.println("*************************************");
            System.out.println("1. INGRESAR BARCOS. \n2. CAMBIAR NUMERO DE INTENTOS. \n3. INICIAR JUEGO." +
                    "\n4. VISUALIZAR TABLERO. " + "\n5. REINICIAR TABLERO. " + "\n6. MENU PRINCIPAL");
            
            try {
                System.out.print("En espera de su opcion...");
                nTablero=entrada.nextInt();
                System.out.println("-------------------------------------");                
            }catch (Exception e) {
                entrada.next();
                System.out.println(" Ups... no has seleccionado una opcion valida");
            }
            
            switch (nTablero) { //SWITCH PARA SELECCIONAR SEGUNDA ORDEN
                
                case 1:     //INGRESAR BARCOS  
                    MenuBarcos miBarco;
                        miBarco=new MenuBarcos();                    
                    break;
                    
                case 2:     // CAMBIAR CANTIDAD DE INTENTOS                    
                    Attempts();                
                    break;
                
                case 3:     // INICIAR JUEGO                      
                    
                                  
                    break;    
                    
                default:
                    
            }
            
        }while(nTablero!=6);
            System.out.println("-------------------------------------");
    }
    
    public void Attempts(){   
        try {
                System.out.print("CUANTOS INTENTOS DESEAS TENER");
                Intentos=entrada.nextInt();
                System.out.println("-------------------------------------");                
            }catch (Exception e) {
                entrada.next();
                System.out.println("UPS.. NO HAS INGRESADO UN DATO CORRECTO");
            }       
    }
    
    
}
