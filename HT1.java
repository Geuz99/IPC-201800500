/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1IPC1;

import java.util.Scanner;

/**
 *
 * @author GEUZ99
 */
public class HT1 {
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingrese los estudiantes registrados en la primera seccion");
        int PrimeraSeccion=lector.nextInt();
        System.out.println("Ingrese los estudiantes registrados en la segunda seccion");
        int SegundaSeccion=lector.nextInt(); 
        
        if(PrimeraSeccion<=14){
            System.out.println("Puedes asignarte en la primera seccion");  
        }if(PrimeraSeccion>=15){
           System.out.println("No puedes asignarte en la segunda seccion");     
        }if(SegundaSeccion<=14){
           System.out.println("Puedes asignarte en la segunda seccion"); 
        }else{
            System.out.println("Deben abrir nueva seccion"); 
        }
                   
                   
    }
    
}
