/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA1;

import java.util.Scanner;

/**
 *
 * @author GEUZ99
 */
public class Estudiante {
    
    String Nombre;
    int Carnet;
    Scanner entrada;

    public Estudiante() {
        entrada=new Scanner(System.in);
        System.out.println("Ingrese su Nombre"); 
        Nombre=entrada.next();
        System.out.println("Ingrese su carnet");
        Carnet=entrada.nextInt();   
        System.out.println("Bienvenido " + Nombre + "-" + Carnet);
        
    }
   
    
         
}
