/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.pila;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Pila<T> {
    final int SIZE;
    int next;
    Object[] array;

    public Pila(int SIZE) {
        this.SIZE = SIZE;
        array = new Object[SIZE];
        next = 0;
    }
    
    public boolean push(T d){
        boolean ret = false;
        int i = 0;
        if(next < array.length){
            array[next] = d;
            next++;
            ret = true;
        }
        return ret;
    }
    public T poll(){
        T t =(T)array[next-1];
        next--;
        return t;

    }
}
