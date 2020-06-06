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
public class Curso {    
    
    private String seccion;    
    Scanner entrada;
    int a;
    int b;

    public Curso() {       
        ImprimeDatos();        
        a=4;
        b=10;
        
    }
    
    public void ImprimeDatos(){
        Estudiante miEstudiante=new Estudiante();
        
    }
    
    public String dimeSeccion(){
        return ">>>Estas intentando a entrar a la seccion: " + seccion;
    }
    
    public void estableceSeccion(String seccion){
        
        this.seccion=seccion;
        
        if(this.seccion.equalsIgnoreCase("A")){
            if(a<=5){
                System.out.println("puedes asignarte");
            }else{
                System.out.println("No puedes asignarte");
            }
        }else if(this.seccion.equalsIgnoreCase("B")){
            if(b<=5){
                System.out.println("puedes asignarte");
            }else{
                System.out.println("No puedes asignarte");
            }            
        }else{
            System.out.println("Seccion incorrecta");
        }
        
    }    
    
    
    public String dimeDatos(){
        return "Asignacion completa  a la seccion " + seccion; 
    }
       
}
