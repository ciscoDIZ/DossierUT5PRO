/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica13;

import java.util.Scanner;

/**
 *
 * @author tote
 */
public class MainV2 {

    public static void main(String[] args) {
        Queue q = new Queue(50);
        Integer opt;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        System.out.println("1) atender cliente\n2)agregar cliente\n3) ver estado cola"
                + "\n4) fin");
        while (!salir) {
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    Customer cust = q.poll();
                    if(cust != null){
                        System.out.println(cust.nombre + " " + cust.apellidos);
                    }else{
                        System.out.println("\nLista vacia\n");
                    }
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
                    if (q.push(c)) {
                        System.out.println("Cliente añadido");
                    } else {
                        System.out.println("Atención, cliente menor de edad."
                                + "\nNo añadido a la cola");
                    }
                    break;
                case 3:
                    System.out.println(q.peek());
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("1) atender cliente\n2)agregar cliente\n3) ver estado cola"
                    + "\n4) fin");
        }
    }
}
