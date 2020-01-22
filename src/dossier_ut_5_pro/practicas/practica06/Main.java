
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica06;

import java.util.Random;

/**
 *
 * @author tote
 */
/**/
public class Main {
    public static void main(String[] args) {
        MatrizCuadrada mc1 = new MatrizCuadrada(2);
        Random rnd = new Random();
        System.out.println("MC1");
        for (int i = 0; i < mc1.matriz.length; i++) {
            for (int j = 0; j < mc1.matriz[i].length; j++) {
                mc1.matriz[i][j] = rnd.nextInt(10);
                System.out.print(" "+mc1.matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("MC2");
        MatrizCuadrada mc2 = new MatrizCuadrada(2);
        for (int i = 0; i < mc2.matriz.length; i++) {
            for (int j = 0; j < mc2.matriz[i].length; j++) {
                mc2.matriz[i][j] = rnd.nextInt(10);
                System.out.print(" "+mc2.matriz[i][j]);
            }
            System.out.println();
        }
        MatrizCuadrada mc3 = mc1.suma(mc2);
        System.out.println("MC3");
        for (int i = 0; i < mc3.matriz.length; i++) {
            for (int j = 0; j < mc3.matriz[i].length; j++) {
                System.out.print(" "+mc3.matriz[i][j]);
            }
            System.out.println();
        }
    }
}
