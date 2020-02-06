/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Main {

    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        System.out.println("Datos aleatorios del hs");
        HashSet<Integer> hs = new HashSet<>();
        while(hs.size() < 10){
            hs.add(rnd.nextInt(100)+1);
        }
        for (Integer h : hs) {
            System.out.println(h);
        }
        System.out.println("Que numero desea comparar");
        Scanner sc = new Scanner(System.in);
        if(hs.contains(sc.nextInt())){
            System.out.println("Número premiado");
        }else{
            System.out.println("Otro dia sera");
        }
    }
}
