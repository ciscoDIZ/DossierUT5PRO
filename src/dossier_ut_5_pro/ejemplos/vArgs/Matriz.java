/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos.vArgs;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Matriz {

    int columnas;
    int filas;
    int datos[][];

    public Matriz(int fil, int col, int... valores) {
        columnas = col;
        filas = fil;
        datos = new int[filas][columnas];
        int i = 0, j = 0;
        for (int val : valores) {
            datos[i][j] = val;
            j++;
            if (j >= columnas) {
                i++;
                j = 0;
            }
        }
    }
}
