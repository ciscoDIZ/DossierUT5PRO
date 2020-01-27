/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.practicas.practica13;

/**
 *
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
public class Customer {
    String nombre;
    String apellidos;
    int edad;

    public Customer(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public boolean esMenorEdad(){
        return edad < 18;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
