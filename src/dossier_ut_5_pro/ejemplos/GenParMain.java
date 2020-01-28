/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class GenParMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair<String, Integer>> refrescos = new ArrayList<>();
        boolean salir = false;
        int i = 0;
        while(!salir){
            System.out.println("Intro refresco "+i+1);
            System.out.println("Refeesco");
            String refresco = sc.nextLine();
            System.out.println("Calorias");
            int calorias = sc.nextInt();
            if(!refresco.equals("fin")){
                refrescos.add(new Pair<>(refresco, calorias));
            }else{
                salir = true;
            }
        }
        
    }
}
