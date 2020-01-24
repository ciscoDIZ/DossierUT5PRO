/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        String frase = "";
        int i = 0;
        while (!frase.toLowerCase().equals("fin")) {
            System.out.println("Introduce la frase "+ ++i);
            frase= sc.nextLine();
            al.add(frase);
            if(al.contains("fin")){
                al.remove("fin");
            }
        }
        Random rnd = new Random();
        System.out.println(al.get(rnd.nextInt(al.size())));
        
    }
}
