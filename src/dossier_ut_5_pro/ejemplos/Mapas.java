/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javafx.util.Pair;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Mapas {

    public static void main(String[] args) {
        HashMap<String, Double> mapa = new HashMap<>();
        mapa.put("Ana", 9.2);
        mapa.put("Luis", 8.5);
        mapa.put("Marta", 6.0);
        mapa.put("Marco", 5.5);
        mapa.put("Lidia", 8.0);
        for (Map.Entry object : mapa.entrySet()) {
            System.out.println("key => "+object.getKey()+ " "+"value => "+object.getValue());
        }
        Iterator it = mapa.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = (Map.Entry<String, Double>) it.next();
            System.out.println("Clave=" + entry.getKey() + ", Valor=" + entry.getValue());
// it.remove();
        }
    }
}
