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
public class Coche {
    String matricula;
    int potencia;

    public Coche(String matricula, int potencia) {
        this.matricula = matricula;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return matricula;
    }
    
}
