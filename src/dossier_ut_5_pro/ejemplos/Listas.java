/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Listas {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> al = new ArrayList<>(10);
        for (int i = 0; i < 8; i++) {
            al.add(rnd.nextInt(100));
            al.sort((o1, o2) -> o1 - o2);
        }
        al.forEach((num) -> {
            System.out.println(num);
        });
    }
}
