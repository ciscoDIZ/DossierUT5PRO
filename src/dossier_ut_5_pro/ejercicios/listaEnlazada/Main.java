/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.listaEnlazada;

import java.util.Scanner;

/**
 *
 * @author francisco a domínguez iceta
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazada le = new ListaEnlazada();
        le.sortedAdd(9);
        le.sortedAdd(1);
        le.sortedAdd(0);
        le.sortedAdd(2);
        le.sortedAdd(19);
        le.sortedAdd(-6);
        le.add(0);
        le.uniqueAdd(0);
        System.out.println(le);
        le.removeAll(0);
        System.out.println(le);
        le.remove(1);
        le.sortedAdd(55);
        System.out.println(le);
        le.removeAll();
        le.add(21);
        le.add(14);
        le.add(1);
        le.add(99);
        System.out.println(le);
        le.sortedAdd(0);
        System.out.println(le);
        System.out.println(le.size());
        //le.remove(0);
        System.out.println(le);
        Integer[] array = le.toArray();
        for (Integer integer : array) {
            System.out.println(integer);
        }
        
    }
}
