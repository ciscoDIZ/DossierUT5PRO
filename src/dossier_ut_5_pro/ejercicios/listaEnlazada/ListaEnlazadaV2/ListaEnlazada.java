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

    private class Node<T> implements Ordenable<Node>{
        private T data;
        private Node next;

        @Override
        public Integer compareTo(Node n) {
            Integer ret;
            if(n.data instanceof Integer){
                ret = (Integer)this.data - (Integer)n.data;
            }else{
                ret = null;
            }
            return ret;
        }
        
        
    }

    private Node head;
    private Integer size;
    private Integer actualPos;

    public ListaEnlazada() {
        head = new Node<>();
        actualPos = 0;
        size = 0;
    }

    /*public boolean sortedAdd(int d) {
        boolean ret = add(d);
        sort();
        return ret;
    }*/

    public boolean uniqueAdd(T d) {
        boolean ret = false;
        if (!contains(d)) {
            ret = add(d);
            size++;
        }
        return ret;
    }

    public int size() {
        return size;
    }
/*
    public boolean uniqueSortedAdd(Integer d) {
        boolean ret = false;
        if (!contains(d)) {
            ret = sortedAdd(d);
            size++;
        }
        return ret;
    }
*/
    public boolean add(T d) {
        boolean ret = false;
        if (head.data == null) {
            head.data = d;
            head.next = new Node();
            ret = true;
            size++;
        } else {
            Node it = head;
            while (it.next != null && !ret) {
                it = it.next;
                if (it.data == null) {
                    it.data = d;
                    it.next = new Node();
                    ret = true;
                    size++;
                }
            }
        }
        return ret;
    }

    public boolean addAll(Object[] d) {
        boolean ret = false;
        for (Object integer : d) {
            ret = add((T)integer);
        }
        return ret;
    }

    public boolean contains(T d) {
        Node it = head;
        boolean ret = false;
        while (it.next != null) {
            if (it.data.equals(d)) {
                ret = true;
            }
            it = it.next;
        }
        return ret;
    }

    public boolean remove(T d) {
        boolean ret = false;
        Node it = head;
        Node helper = it;
        while (it.next != null && !ret) {
            if (head.data.equals(d)) {
                head = head.next;
                ret = true;
                size--;
            } else {
                it = it.next;
                if (it.data.equals(d)) {
                    helper.next = it.next;
                    ret = true;
                    size--;
                }
                helper = helper.next;
            }
        }
        return ret;
    }

    public boolean removeAll(T d) {
        boolean ret = false;
        while (contains(d)) {
            ret = remove(d);
        }
        return ret;
    }

    public void removeAll() {
        head.data = null;
        head.next = null;
        size = 0;
    }

    private boolean exchange() {
        Node it = head;
        Node helper = it;
        boolean retorno = false;
        while (it.next != null) {
            it = it.next;
            if (it.next != null) {
                if (helper.equals(head)) {
                    if (head.compareTo(it) > 0) {
                        Node n = new Node();
                        n.data = helper.data;
                        n.next = it.next;
                        head = it;
                        head.next = n;
                        retorno = true;
                    }
                } else {
                    if (helper.compareTo(it) > 0) {
                        Node n = new Node();
                        n.data = helper.data;
                        n.next = it.next;
                        getNodeByPos(getPos(helper) - 1).next = it;
                        it.next = n;
                        retorno = true;
                    }
                }
                helper = helper.next;
            }
        }
        return retorno;
    }
    
    @SuppressWarnings("empty-statement")
    public void sort() {
        while (exchange());
    }

    public T[] toArray() {
        Object[] ret = new Integer[size];
        Node it = head;
        int i = 0;
        while (it.next != null) {
            ret[i] = it.data;
            i++;
            it = it.next;
        }
        return (T[])ret;
    }

    public T getStack() {
        T ret = null;
        if (head.data != null) {
            ret = get(size() - 1);
            remove(ret);
        }
        return ret;
    }

    public boolean next() {
        boolean ret = false;
        if (head.next != null) {
            ret = true;
        }
        return ret;
    }

    public void mostrar() {
        Node it = head;
        while (it.next != null) {
            System.out.println(it.data);
            it = it.next;
        }
    }

    public T get(int p) {
        Node it = head;
        T ret = null;
        while (it.next != null) {
            if (p == actualPos) {
                ret = (T)it.data;
            }
            actualPos++;
            it = it.next;
        }
        actualPos = 0;
        return ret;
    }

    private Node getNodeByPos(int p) {
        Node ret = null;
        Node it = head;
        while (it.next != null) {
            if (getPos(it).equals(p)) {
                ret = it;
            }
            it = it.next;
        }
        return ret;
    }

    private Integer getPos(Node n) {
        Node it = head;
        Integer ret = null;
        while (it.next != null) {
            if (it.equals(n)) {
                ret = actualPos;
            }
            it = it.next;
            actualPos++;
        }
        actualPos = 0;
        return ret;
    }

    @Override
    public String toString() {
        String retorno = "";
        Node it = head;
        while (it.next != null) {
            retorno += it.data + " ";
            it = it.next;
        }
        return retorno;
    }
}
