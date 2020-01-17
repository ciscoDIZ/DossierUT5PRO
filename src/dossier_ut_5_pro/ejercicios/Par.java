/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios;

import java.util.Scanner;

/**
 *
 * @author tote
 */
public class Par {
    Double d;
    String s;

    public Par(Double d, String s) {
        this.d = d;
        this.s = s;
    }
    static Par metodo(double d, String s){
        //----             -------//
        return new Par(d, s);
    }
    public static Object operacion(Object o) throws Exception{
        Object ret = null;
        if (o instanceof Integer){
            Integer integer = (Integer)o;
            integer = integer + 4;
            ret = (Object)integer;
        }else if( o instanceof Double){
            Double d = (Double)o;
            d = d + 4;
            ret = (Object)d;
        }else if(o instanceof String){
            ret = (String)o;
        }else{
            throw new Exception("Operacion no permitida");
        }
        return ret;
        
                
    }
    public static void main(String[] args) {
        /*Par[] array = new Par[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Par(i*4d,"OOOOOOOOOOO ninio");
           
            System.out.println("valor de d: "+array[i].d+", valor de s: "+array[i].s);
            
        }*/
        Object o = null, o1 = null;
        
        Integer i = 4;
        Scanner sc = new Scanner(System.in);
        
        Double d = null;
        try {
            o = operacion((Object)i);
            o1 = operacion((Object)3.2);
            o = operacion("aaaaaaa");
        } catch (Exception e) {
            System.out.println(e);
        }
        if (o instanceof Integer){
            System.out.println((Integer)o);
        }
        if(o1 instanceof Double){
            System.out.println((Double)o1);
        }
        if(o instanceof String){
            System.out.println((String)o);
        }
                
    }
    
}
