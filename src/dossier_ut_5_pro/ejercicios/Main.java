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
public class Main {
    public static void main(String[] args) {
        Nodo<Integer> inicio = new Nodo<>();
        inicio.dato = 3;
        Nodo<Integer> dato1 = new Nodo<>();
        dato1.dato = 9;
        inicio.next = dato1;
        Nodo<Integer> dato2 = new Nodo<>();
        dato2.dato = 23;
        dato1.next = dato2;
        Nodo<Integer> dato3 = new Nodo<>();
        dato3.dato = 12;
        dato1.next = dato3;
        dato3.next = dato2;
        Nodo<Integer> recorrer = inicio;
        while (recorrer != null) {            
            System.out.println(recorrer.dato);
            recorrer = recorrer.next;
        }
    }
}
