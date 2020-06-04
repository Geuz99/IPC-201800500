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
public class MenuPrincipal { 

    public MenuPrincipal() {
    Scanner entrada=new Scanner(System.in);   
    int nMenu=0;
    
    //ETIQUETA DE INCIO CONSOLA
        System.out.println("-------------------------------------");  
        System.out.println("*********** BIENVENIDOS *************");
        System.out.println("**************   A   ****************");
        System.out.println("******** B A T T L E S H I P ********");
        System.out.println("-------------------------------------");
        
        //PRIMER MENU A DESPLEGAR
        do{
            System.out.println("*************************************");
            System.out.println("                MENU                 ");
            System.out.println("*************************************");
            System.out.println("1. CREAR TABLERO. \n2. REPORTE COMPLETO. \n3. REPORTE DE VICTORIAS." +
                    "\n4. SALIR.");
            
            try {
                System.out.print("En espera de su opcion...");
                nMenu=entrada.nextInt();
                System.out.println("-------------------------------------");                
            }catch (Exception e) {
                entrada.next();
                System.out.println(" Ups... no has seleccionado una opcion valida");
            }
            
            switch (nMenu) { //SWITCH PARA SELECCIONAR PRIMERA ORDEN
                
                case 1:     //CREAR EL TABLERO
                    MenuTablero miTablero;
                        miTablero=new MenuTablero();                       
                    break;
                    
                case 2: //REPORTE COMPLETO
                        
                    break;
                    
                case 3: //REPORTE VICTORIAS
                        
                    break;                 
            }
            
        }while(nMenu!=4); //SALIR
        
            System.out.println("*************************************");
            System.out.println("********  GRACIAS POR JUGAR *********");
            System.out.println("*************************************");
            
    
        }
    
        
    }   
        
        
    
    

