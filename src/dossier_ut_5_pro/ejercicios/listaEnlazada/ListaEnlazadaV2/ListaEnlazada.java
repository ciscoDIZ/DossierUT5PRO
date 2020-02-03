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
    /**
     * 
     * @param <T> 
     * @version 1.0
     */
    private class Node<T> implements Ordenable<Node> {

        private T data;
        private Node next;
        Comparable<T> comparable;

        public Node(Comparable<T> comparable) {
            this.comparable = comparable;
        }

        @Override
        public Integer compareTo(Node n) throws NullPointerException {
            Integer ret;
            if (n.data instanceof Integer) {
                ret = (Integer) this.data - (Integer) n.data;
            } else if (n.data instanceof String) {
                ret = sortString((String) n.data);
            } else if (n.data instanceof Double) {
                double thisData = ((Double) (this.data));
                double nData = ((Double) (n.data));
                if (thisData == nData) {
                    ret = 0;
                } else if (thisData > nData) {
                    ret = 1;
                } else {
                    ret = -1;
                }
            } else if (n.data instanceof Persona && comparable == null) {
                String nombre = ((Persona) (n.data)).nombre;
                ret = sortString(nombre);
            } else {
                if (comparable != null) {
                    ret = comparable.compare(this.data, (T) n.data);
                } else {
                    throw new NullPointerException("ordenacion no disponible para este objeto");
                }

            }
            return ret;
        }

        private int sortString(String string) {
            int ret = 0;
            String thisString;
            if (this.data instanceof Persona) {
                thisString = ((Persona) (this.data)).nombre;
            } else {
                thisString = ((String) (this.data));
            }

            int i = 0;
            boolean exit = false;
            while (((i < string.length() && i < thisString.length() && !exit))) {
                if (thisString.charAt(i) - string.charAt(i) != 0) {
                    ret = thisString.charAt(i) - string.charAt(i);
                    exit = true;
                } else if (i + 1 < string.length() && i + 1 < thisString.length()) {
                    ret = ((String) (this.data)).length() - string.length();
                }
                i++;
            }
            return ret;
        }

    }
    Comparable<T> comparable;
    private Node head;
    private Integer size;
    private Integer actualPos;

    /**
     * constructor que soporta las ordenaciones por defecto
     */
    public ListaEnlazada() {
        this(null);
    }

    /**
     *constructor que soprta la ordenación de terceras clases
     * @param c representa el criterio de ordenacion
     */
    public ListaEnlazada(Comparable<T> c) {
        comparable = c;
        head = new Node<>(comparable);
        actualPos = 0;
        size = 0;
    }

    public boolean sortedAdd(T d) {
        boolean ret = add(d);
        sort();
        return ret;
    }

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

    public boolean uniqueSortedAdd(T d) {
        boolean ret = false;
        if (!contains(d)) {
            ret = sortedAdd(d);
            size++;
        }
        return ret;
    }

    public boolean add(T d) {
        boolean ret = false;
        if (head.data == null) {
            head.data = d;
            head.next = new Node(comparable);
            ret = true;
            size++;
        } else {
            Node it = head;
            while (it.next != null && !ret) {
                it = it.next;
                if (it.data == null) {
                    it.data = d;
                    it.next = new Node(comparable);
                    ret = true;
                    size++;
                }
            }
        }
        return ret;
    }

    public boolean addAll(Object[] d) {
        boolean ret = false;
        for (Object object : d) {
            ret = add((T) object);
        }
        return ret;
    }

    public boolean contains(T d) {
        Node it = head;
        boolean ret = false;
        while (it.next != null && !ret) {
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
        try {
            while (it.next != null) {
                it = it.next;
                if (it.next != null) {
                    if (helper.equals(head)) {
                        if (head.compareTo(it) > 0) {
                            Node n = new Node(comparable);
                            n.data = helper.data;
                            n.next = it.next;
                            head = it;
                            head.next = n;
                            retorno = true;
                        }
                    } else {
                        if (helper.compareTo(it) > 0) {
                            Node n = new Node(comparable);
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
        } catch (NullPointerException e) {
            
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
            ret[i] = (T) it.data;
            i++;
            it = it.next;
        }
        return (T[]) ret;
    }

    public T pull() {
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
                ret = (T) it.data;
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
