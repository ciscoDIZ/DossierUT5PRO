/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.listaEnlazada.ListaEnlazadaV2;

import java.util.List;

/**
 *
 * @author tote
 * @param <T> representa la clase y la intancia a comparar (respectivamente en 
 * el caso de la interfaz y el metodo por defecto).
 */

public interface Ordenable<T> {
    public int compareTo(T n); 
    
}
