/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        TreeMap<String, String> diccionarioEI = new TreeMap<>();
        TreeMap<String, String> diccionarioIE = new TreeMap<>();
        diccionarioEI.put("barco", "ship");
        diccionarioEI.put("arbol", "tree");
        diccionarioEI.put("mapa", "map");
        diccionarioEI.put("funcion", "function");
        for (String castellano : diccionarioEI.keySet()) {
            diccionarioIE.put(diccionarioEI.get(castellano), castellano);
        }
        
        System.out.println("español/ingles->1\ningles/español->2");
        opt = sc.nextInt();
        sc.nextLine();
        System.out.println("palabra a buscar?");
        String palabra = sc.nextLine().toLowerCase();
        switch (opt) {
            case 1:
                if (diccionarioEI.containsKey(palabra)) {
                    System.out.println(diccionarioEI.get(palabra));
                } else {
                    System.out.println("No disponemos de esta palabra");
                }
                break;
            case 2:
                if (diccionarioIE.containsKey(palabra)) {
                    System.out.println(diccionarioIE.get(palabra));
                } else {
                    System.out.println("No disponemos de esta palabra");
                }
                break;

            default:
                throw new AssertionError();
                
        }
        for (String string : diccionarioEI.keySet()) {
            System.out.println(string+" -> "+diccionarioEI.get(string));
        }
        
    }
}
