/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica13;

/**
 *
 * @author tote
 */
public class Queue {

    private Customer[] customers;

    public Queue(int size) {
        customers = new Customer[size];
    }

    public boolean push(Customer c) {
        boolean ret = false;
        if (customers[customers.length - 1] == null) {
            int i = 0;
            while (!ret && !c.esMenorEdad()) {
                if (customers[i % customers.length] == null) {
                    if (!c.esMenorEdad()) {
                        customers[i % customers.length] = c;
                        ret = true;
                    }
                }
                i++;
            }

        }

        return ret;
    }

    private boolean exchange() {
        boolean ret = false;
        for (int i = 0; i < customers.length - 1; i++) {
            if (customers[i] == null) {
                customers[i] = customers[i + 1];
                customers[i + 1] = null;
                ret = true;
            }
        }
        return ret;
    }

    public Customer poll() {
        Customer ret = null;
        if (customers[0] != null) {
            ret = customers[0];
            customers[0] = null;
            exchange();
        }
        return ret;
    }

    public String peek() {
        String ret = "\n";
        if (customers[0] != null) {
            for (int i = 0; i < customers.length && customers[i] != null; i++) {
                Customer c = customers[i];
                ret += (i + 1) + ") " + c.nombre + " " + c.apellidos+"\n";
            }
        }else{
            ret = "\nLista vacia\n";
        }
        ret += "\n";
        return ret;
    }
}
