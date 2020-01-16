/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica05;

/**
 *
 * @author francisco a domínguez iceta
 */
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[20][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
            array[i][0] = 1;
            for (int j = 0; j < array[i].length; j++) {
                int[] is = array[i];
                is[is.length-1] = 1;
                
            }
            
        }
        for (int i = 2; i < array.length; i++) {
            for (int j = 1; j < array[i].length-1; j++) {
                array[i][j] = array[i-1][j-1] + array[i-1][j];
                
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                
            }
            System.out.println("");
        }
    }
}
