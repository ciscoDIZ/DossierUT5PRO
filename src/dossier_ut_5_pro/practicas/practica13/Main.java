/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica13;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Integer opt = null;
        LinkedList<Customer> lk = new LinkedList<>();
        System.out.println("1) atender cliente\n2)agregar cliente\n3) ver estado cola"
                + "\n4) fin");
        while(!salir){
        opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println(lk.poll());
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Intro nombre ");
                    String nombre = sc.nextLine();
                    System.out.println("Intro apellidos ");
                    String apellidos = sc.nextLine();
                    System.out.println("Intro edad ");
                    Integer edad = sc.nextInt();
                    Customer c = new Customer(nombre, apellidos, edad);
                    if (!c.esMenorEdad()) {
                        lk.push(c);
                    }
                    break;
                case 3:
                    for (int i = 0; i < lk.size(); i++) {
                        System.out.println(lk.peek());

                    }

                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}
