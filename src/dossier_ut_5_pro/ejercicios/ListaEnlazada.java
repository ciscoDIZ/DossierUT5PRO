/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios;

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
    private Nodo tail;

    public ListaEnlazada() {
        head = new Nodo();
        tail = new Nodo();
    }
    
    
    
    public boolean add(int d){
        Nodo it = head;
        boolean retorno = false;
        if (head.data == null){
           head.data = d;
           head.next = new Nodo();
           retorno = true;
        }else{
            while (it.next != null && !retorno) {
                it = it.next;
                if(it.data == null){
                    it.data = d;
                    it.next = new Nodo();
                    retorno = true;
                }
               
            }
          
            
           /* while(it.next != null && !retorno){
                
                if(it.data > d){
                    if(it.equals(head)){
                        Nodo n = new Nodo();
                        n.data = d;
                        n.next = head;
                        head = n;
                        retorno = true;
                    }else{
                        Nodo n = new Nodo();
                        n.data = d;
                        n.next = it;
                        it = n;
                        retorno = true;
                    }
                     it = it.next;
                }else{
                    it = it.next;
                    if(it.data == null){
                        it.data = d;
                        it.next = new Nodo();
                        retorno = true;
                    }
                } 
            }*/
        }
        ordenar();
        return retorno;
    }
    private void ordenar(){
        Nodo retorno = head;
        while (retorno.next != null && retorno.next.data != null){
            if(retorno.data > retorno.next.data){
                if(retorno.equals(head)){
                    
                }
            }
            retorno = retorno.next;
        }
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
