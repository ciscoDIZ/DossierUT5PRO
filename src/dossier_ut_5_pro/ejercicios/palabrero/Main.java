/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.palabrero;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        Palabrero p = new Palabrero("canarias", "guachinche","cotufa","burra"
            ,"tonique","fechillo");
        System.out.println("Region: "+p.region());
        System.out.println("Palabras: "+p.getLista());
    }
    
    
}
