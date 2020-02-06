/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos.vArgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2,2,2,2,2,2,2,2};
        
        ArrayList<Integer> al = new ArrayList<>((Collection)Arrays.asList(array));
        Matriz m = new Matriz(2, 4, array);
        for (int[] dato : m.datos) {
            for (int i : dato) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
