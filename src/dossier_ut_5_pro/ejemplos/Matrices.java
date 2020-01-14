/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos;

/**
 *
 * @author francisco a domínguez iceta
 */
public class Matrices {
    public static void mostarArray(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int almacen[][] = {{5,1,3,2}, {9,0,7,8}, {4, 6, 10, 2} };
        for (int i = 0; i < almacen.length; i++) {
            mostarArray(almacen[i]);
        }
        for (int[] is : almacen) {
            for (int i = 0; i < is.length; i++) {
                is[i] = 1;
                
            }
            for (int i : is) {
                System.out.println(i);
            }
        }
        for (int[] is : almacen) {
            for (int i : is) {
                System.out.println(i);
            }
        }
    }
}
