/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.listaEnlazada;

/**
 *
 * @author tote
 */
public class ListaEnlazada {
    class Nodo {
        private Integer data;
        private Nodo next;
    }
    
    private Nodo head;
    private Integer size;
    public ListaEnlazada() {
        head = new Nodo();
        size = 0;
    } 
    
    
    public boolean sortedAdd(int d){
        boolean ret = false;
        if (head.data == null){
           head.data = d;
           head.next = new Nodo();
           ret = true;
           size++;
        }else{
            Nodo it = head;
            while (it.next != null && !ret) {
                it = it.next;
                if(it.data == null){
                    it.data = d;
                    it.next = new Nodo();
                    ret = true;
                    size++;
                }
            }
            sort();
        }
        return ret;
    }
    
    public boolean uniqueAdd(Integer d){
        boolean ret = false;
        if(!contains(d)){
            ret = add(d);
            size++;
        }
        return ret;
    }
    public int size(){
        return size;
    }
    public boolean uniqueSortedAdd(Integer d){
        boolean ret = false;
        if(!contains(d)){
            ret = sortedAdd(d);
            size++;
        }
        return ret;
    }
    
    public boolean add(Integer d){
        boolean ret = false;
        if (head.data == null){
           head.data = d;
           head.next = new Nodo();
           ret = true;
           size++;
        }else{
            Nodo it = head;
            while (it.next != null && !ret) {
                it = it.next;
                if(it.data == null){
                    it.data = d;
                    it.next = new Nodo();
                    ret = true;
                    size++;
                }
            }
        }
        return ret;
    }
    
    public boolean contains(Integer d){
        Nodo it = head;
        boolean ret = false;
        while(it.next != null){
            if(it.data.equals(d)){
                ret = true;
            }
            it=it.next;
        }
        return ret;
    }
    
    public boolean remove(Integer d){
        boolean ret = false;
        Nodo it = head;
        Nodo helper = it;
        while(it.next != null && !ret){
            it = it.next;
            if(helper.data.equals(d)){
                if(helper.equals(head)){
                    head = head.next;
                    ret = true;
                    size--;
                }else{
                    helper.next = it.next;
                    ret = true;
                    size--;
                }
                
            }
            
            helper = helper.next;
        }
        return ret;
    }
    
    public boolean removeAll(Integer d){
        boolean ret = false;
        while(contains(d)){
            ret = remove(d);
        }
        return ret;
    }
    public void removeAll(){
       head.data = null;
       head.next = null;
    }
    private boolean exchange(){
        Nodo it = head;
        Nodo helper = it;
        boolean retorno = false;
        while (it.next != null && !retorno){
            it = it.next;
            if(it.next != null ){
                if(helper.equals(head)){
                    if(helper.data > it.data){
                        Nodo n = new Nodo();
                        n.data = helper.data;
                        n.next = it.next;
                        head = it;
                        head.next = n;
                        retorno = true;
                    }
                }else{
                    if(helper.data > it.data){
                        Integer i = helper.data;
                        helper.data = it.data;
                        it.data = i;
                        retorno = true;
                    }                    
                }
                helper = helper.next;
            } 
        }
        return retorno;
    }
    @SuppressWarnings("empty-statement")
    public void sort(){
        while (exchange());
    }
    
    public Integer[] toArray(){
        Integer[] ret = new Integer[size];
        Nodo it = head;
        int i = 0;
        while (it.next != null){
            ret[i] = it.data;
            i++;
            it = it.next;
        }
        return ret;
    }
    
    @Override
    public String toString() {
        String retorno = "";
        Nodo it = head;
        while (it.next != null) {            
            retorno += it.data+" ";
            it = it.next;
        }
        return retorno;
    }
}