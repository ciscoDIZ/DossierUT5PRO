/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos.diccionario;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Diccionario<T, E> {

    private class GenPar<T, E> implements Comparable<GenPar> {

        private T key;
        private E value;
        private GenPar<T, E> next;

        public GenPar(T key, E value) {
            this.key = key;
            this.value = value;
        }

        public GenPar() {
            next = new GenPar<>();
        }

        public T getKey() {
            return key;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        @Override
        public int compareTo(GenPar o) {
            int ret = 0;
            if (o.value instanceof Integer
                    && this.value instanceof Integer) {
                ret = ((Integer) this.value - (Integer) o.value);
            }
            return ret;
        }
    }

    private GenPar<T, E> head;
    private int size;

    public Diccionario() {
        head = new GenPar<>();
    }

    public boolean add(T key, E value) {
        GenPar<T, E> it = head;
        GenPar<T, E> helper = it;
        boolean ret = false;
        while (it.next != null) {
            helper = helper.next;
            if(it.equals(head)){
                if(it.key == null){
                    it.key = key;
                    it.value = value;
                    ret = true;
                }
            }else{
                if(helper.key == null){
                    
                }
                it.next = new GenPar<>(key, value);
            }
            it = it.next;
        }
        return true;
    }
}
