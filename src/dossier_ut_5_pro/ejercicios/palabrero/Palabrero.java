/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.palabrero;

import dossier_ut_5_pro.ejercicios.listaEnlazada.ListaEnlazadaV2.ListaEnlazada;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Palabrero {
    /*Mediante un cosntructor enviar vArgs de String con palabras canarias con un metodo region()*/
    private String region;
    private ListaEnlazada<String> palabras;

    public Palabrero(String region, String ... data) {
        this.region = region;
        palabras = new ListaEnlazada<>();
        palabras.addAll(data);
    }
    public String region(){
        return region;
    }
    
    public String getLista(){
        return palabras.toString();
    }
}
