/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.ejercicioIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Main {
    /*crear array aleatorio 0-100
    borrar impares
    */
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rnd = new Random();
        
        for (int i = 0; i < 10; i++) {
            al.add(rnd.nextInt(100));
            System.out.println(al.get(i));
        }
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            if(it.next() % 2 != 0){
                it.remove();
            }else{
                System.out.println("Es par");
            }
        }
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
