/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author GEUZ99
 */
public class Tablero {
    
    private String matriz[][];

    public Tablero() {
        
        matriz=new String[11][11];
        
        System.out.println(getMatriz());
        
    }

    /**
     * @return the matriz
     */
    public String[][] getMatriz() {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.println("| |" + matriz[i][j]);
                
            }
            System.out.println(" ");
            
            
        }
        return matriz;
    }

    /**
     * @param matriz the matriz to set
     */
    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }
    
    

}
