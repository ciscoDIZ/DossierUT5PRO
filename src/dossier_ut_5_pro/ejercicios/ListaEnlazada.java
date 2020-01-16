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
            ordenar();
            
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
                        //System.out.println("Entra en ordenar() (como head) | helper.data= "+helper.data+" it.data = "+it.data);
                        /*Nodo n = helper;
                        n.next = helper;
                        n.data = it.data;*/
                        Nodo n = head;
                       
                        
                        helper = helper.next;
                        retorno = true;
                    }
                        
                    
                }else{
                    if(helper.data > it.data){
                        //System.out.println("Entra en ordenar() (como cuerpo) | helper.data= "+helper.data+" it.data = "+it.data);
                        retorno = true;
                        helper = helper.next;
                    }
                    
                }
            
                
            }
            
            
            
        }
        return true;
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
