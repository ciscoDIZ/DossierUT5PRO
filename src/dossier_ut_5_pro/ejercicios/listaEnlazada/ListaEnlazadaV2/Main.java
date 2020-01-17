/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.listaEnlazada.ListaEnlazadaV2;

import dossier_ut_5_pro.ejercicios.listaEnlazada.*;
import java.util.Scanner;

/**
 *
 * @author francisco a domínguez iceta
 */
public class Main {
    public static void main(String[] args) {
       /* 
        Nodo<Integer> inicio = new Nodo<>();
        inicio.add(1, new Nodo().); 
        Nodo<Integer> dato1 = new Nodo<>();
        dato1.add(9,dato2);
        inicio.next = dato1;
        Nodo<Integer> dato2 = new Nodo<>();
        dato2.dato = 23;
        dato1.next = dato2;
        Nodo<Integer> dato3 = new Nodo<>();
        dato3.dato = 12;
        dato1.next = dato3;
        dato3.next = dato2;
        Nodo<Integer> recorrer = inicio;
        while (recorrer != null) {            
            System.out.println(recorrer.dato);
            recorrer = recorrer.next;
        }
       */
       ListaEnlazada le = new ListaEnlazada();
       le.add(9);
       le.add(1);
       le.add(0);
       le.add(2);
       le.add(19);
       le.add(-6);
       System.out.println(le);
    }
}
