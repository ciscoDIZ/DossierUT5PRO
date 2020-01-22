/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica06;

/**
 * Emular la suma de dos matrices. Se creará una clase: MatrizCuadrada con un
constructor que reciba el tamaño en filas de la matriz, digamos: n. Entonces el constructor
establece como atributo un array de n*n
Se deberá crear un método llamado:
MatrizCuadrada suma(MatrizCuadrada) que sirve para hacer la suma de dos matrices
devolviendo la matriz suma ( la suma de dos matrices es una nueva matriz donde cada
compotenente es la suma de las componentes
 * 
 * @author tote
 */
public class MatrizCuadrada {
    Integer[][] matriz;

    public MatrizCuadrada(int n) {
        matriz = new Integer[n][n];
    }
    public MatrizCuadrada suma(MatrizCuadrada mc){
        MatrizCuadrada ret = new MatrizCuadrada(this.matriz.length);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                ret.matriz[i][j] = this.matriz[i][j] + mc.matriz[i][j];   
            } 
        }
        return ret;
    }
}
