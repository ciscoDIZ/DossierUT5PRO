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
       le.add(9);
       le.add(1);
       le.add(0);
       le.add(2);
       le.add(19);
       le.add(-6);
       System.out.println(le);
    }
}
