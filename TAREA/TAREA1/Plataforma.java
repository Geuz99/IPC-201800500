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
public class Plataforma {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);        
        Curso miCurso=new Curso();
        System.out.println("Seccion A o Seccion B");
        String seccion=entrada.next();
        miCurso.estableceSeccion(seccion);
        System.out.println(miCurso.dimeSeccion());
        
    }
    
    
}
