/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Iteradores {

    public static void main(String[] args) {
        //Random rnd = new Random();
        ArrayList<String> al = new ArrayList<>();
        /*for (int i = 0; i < 10; i++) {
            al.add("yeah" + (i + 1));

        }
        al.remove("yeah1");
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }*/

        ArrayList<Integer> miArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            miArray.add(rnd.nextInt(20));
        }

        for (Iterator it = miArray.iterator(); it.hasNext();) {
            int numero = (int) it.next();
            
            for (Integer integer : miArray) {
                System.out.print(integer + " ");
            }
            it.remove();
            System.out.println(numero);
            //System.out.println("tamaño array: " + miArray.size());
        }

    }
}
