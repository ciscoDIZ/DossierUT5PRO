/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejemplos;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 * @param <T> get data type from key field
 * @param <E> get data type from value field
 */
public class GenPar<T,E> implements Comparable<GenPar>{
    private final T KEY;
    private E value;

    public GenPar(T key, E value) {
        this.KEY = key;
        this.value = value;
    }

    public T getKey() {
        return KEY;
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
        if(o.value instanceof Integer 
                && this.value instanceof Integer){
            ret =((Integer)this.value - (Integer)o.value);
        }
        return ret;
    }

    
    
    @Override
    public boolean equals(Object obj) {
        GenPar gp = (GenPar)obj; 
        return this.KEY.equals(gp.KEY);//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
