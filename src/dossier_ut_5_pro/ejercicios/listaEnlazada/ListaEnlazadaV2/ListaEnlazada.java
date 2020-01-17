/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.listaEnlazada.ListaEnlazadaV2;



/**
 *
 * @author tote
 */
public class ListaEnlazada<T> {
    class Nodo {
        private Integer data;
        private Nodo next;
    }
    
    private Nodo head;

    public ListaEnlazada() {
        head = new Nodo();
    } 
    
    @SuppressWarnings("empty-statement")
    public boolean add(int d){
        boolean retorno = false;
        if (head.data == null){
           head.data = d;
           head.next = new Nodo();
           retorno = true;
        }else{
            Nodo it = head;
            while (it.next != null && !retorno) {
                it = it.next;
                if(it.data == null){
                    it.data = d;
                    it.next = new Nodo();
                    retorno = true;   
                }
            }
            while (ordenar());
        }
        return retorno;
    }
    private boolean ordenar(){
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
