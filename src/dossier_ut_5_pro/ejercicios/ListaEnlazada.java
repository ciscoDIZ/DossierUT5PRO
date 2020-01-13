/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios;

/**
 *
 * @author francisco a domínguez iceta
 */
public class ListaEnlazada<T> {
    private class Nodo<T> {
        T dato;
        Nodo next;
    }

    Nodo<T> head;
    Nodo<T> dato;
    
    public boolean add(T t){
        boolean retorno = false;
        if(head == null){
            head.dato = t;
            head.next = null;
            retorno = true;
        }else if(dato == null){
            dato.dato = t;
            head.next = dato;
            retorno = true;
        }else{
            dato.dato = t;
            retorno = true;
        }
        return retorno;
    }
    
}
