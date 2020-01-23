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
        LinkedList<Cliente> lk = new LinkedList<>();
        System.out.println("1) atender cliente\n2)agregar cliente\n3) ver estado cola"
                + "\n4) fin");
        while (!salir) {
            switch (opt) {
                case 1:
                    System.out.println(lk.poll());
                    break;
                case 2:
                    System.out.println("Intro nombre ");
                    String nombre = sc.nextLine();
                    String apellidos = sc.nextLine();
                    Integer edad = sc.nextInt();
                    Cliente c = new Cliente(nombre, apellidos, edad);
                    if (!c.esMenorEdad()) {
                        lk.push(c);
                    }
                    break;
                case 3:
                    for (int i = 0; i < lk.size(); i++) {
                        System.out.println(lk.peek());
                        
                    }
 
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}
