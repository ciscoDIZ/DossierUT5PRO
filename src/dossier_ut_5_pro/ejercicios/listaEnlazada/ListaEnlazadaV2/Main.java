/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.listaEnlazada.ListaEnlazadaV2;

import javafx.util.Pair;

/**
 *
 * @author francisco a domínguez iceta
 */
public class Main {

    public static void main(String[] args) {

        ListaEnlazada<Integer> le = new ListaEnlazada<>();
        ListaEnlazada<Persona> le1 = new ListaEnlazada<>((a, b) -> a.edad - b.edad);
        ListaEnlazada<String> le2 = new ListaEnlazada<>();
        ListaEnlazada<Double> le3 = new ListaEnlazada<>();
        ListaEnlazada<Pair<String,Integer>> le4 = new ListaEnlazada<>((a, b)->a.getValue()-b.getValue());
        le.sortedAdd(9);
        le.sortedAdd(1);
        le.sortedAdd(1);
        le.sortedAdd(0);
        le.sortedAdd(2);
        le.sortedAdd(19);
        //le.add("k");
        le.sortedAdd(-6);
        le.add(0);
        le.uniqueAdd(0);
        System.out.println(le);
        le.removeAll(0);
        System.out.println(le);
        le.remove(1);
        le.sortedAdd(55);
        for (int i = 0; i < le.size(); i++) {
            System.out.println(le.get(i));

        }
        System.out.println(le.get(0));
        System.out.println(le);
        le.removeAll();

        le.add(21);
        le.add(14);
        le.add(1);
        le.add(99);

        Integer[] array = (Integer[]) le.toArray();
        for (Integer integer : array) {
            System.out.println(integer);
        }
        while (le.next()) {
            System.out.println(le.pull() * 5);
        }

        le.addAll(array);

        System.out.println("Pos 3");
        System.out.println(le.get(3));
        le.removeAll();
        le.add(1);

        le.mostrar();
        le2.sortedAdd("bandalo");
        le2.sortedAdd("banda");
        le2.sortedAdd("asno");
        le2.sortedAdd("_relampago");
        le2.sortedAdd("lazaro");

        System.out.println(le2);
        
        le3.sortedAdd(1.002);
        le3.sortedAdd(1.2222);
        le3.sortedAdd(1.022);
        le3.sortedAdd(0.2);
        le3.sortedAdd(0.1);
        le3.sortedAdd(0.04);
        System.out.println(le3);

        le1.sortedAdd(new Persona("Juanita", 26));
        le1.sortedAdd(new Persona("Marquito", 25));
        System.out.println(le1.get(0).nombre);

    }

}
