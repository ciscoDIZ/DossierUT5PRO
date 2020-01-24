/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.listaEnlazada;

import java.util.Random;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tote
 */
public class ListaEnlazadaTest {
    
    public ListaEnlazadaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    public Integer[] contArray(int l){
        Integer[] ret = new Integer[l];
        Random rnd = new Random();
        for (int i = 0; i < ret.length; i++) {
            ret[i] = rnd.nextInt(10);
            
        }
        return ret;
    }
    /**
     * Test of sortedAdd method, of class ListaEnlazada.
     */
    @Test
    public void testSortedAdd() {
        System.out.println("sortedAdd");
        int d = 0;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = true;
        instance.addAll(contArray(10));
        boolean result = instance.sortedAdd(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of uniqueAdd method, of class ListaEnlazada.
     */
    @Test
    public void testUniqueAdd() {
        System.out.println("uniqueAdd");
        Integer d = 2;
        Integer[] array = {1,8,9,4,5,6};
        ListaEnlazada instance = new ListaEnlazada();
        instance.addAll(array);
        boolean expResult = true;
        boolean result = instance.uniqueAdd(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of size method, of class ListaEnlazada.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaEnlazada instance = new ListaEnlazada();
        instance.addAll(contArray(10));
        int expResult = 10;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of uniqueSortedAdd method, of class ListaEnlazada.
     */
    @Test
    public void testUniqueSortedAdd() {
        System.out.println("uniqueSortedAdd");
        Integer d = 2;
        Integer[] array = {1,8,9,4,5,6};
        ListaEnlazada instance = new ListaEnlazada();
        instance.addAll(array);
        boolean expResult = true;
        boolean result = instance.uniqueSortedAdd(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of add method, of class ListaEnlazada.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Integer d = 2;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = true;
        boolean result = instance.add(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addAll method, of class ListaEnlazada.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Integer[] d = contArray(10);
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = true;
        boolean result = instance.addAll(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contains method, of class ListaEnlazada.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Integer d = 2;
        ListaEnlazada instance = new ListaEnlazada();
        instance.add(d);
        boolean expResult = true;
        boolean result = instance.contains(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class ListaEnlazada.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Integer d = 2;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = true;
        instance.add(2);
        boolean result = instance.remove(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeAll method, of class ListaEnlazada.
     */
    @Test
    public void testRemoveAll_Integer() {
        System.out.println("removeAll");
        Integer d = 2;
        ListaEnlazada instance = new ListaEnlazada();
        instance.addAll(contArray(10));
        instance.add(2);
        instance.add(2);
        boolean expResult = true;
        boolean result = instance.removeAll(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeAll method, of class ListaEnlazada.
     */
    @Test
    public void testRemoveAll_0args() {
        System.out.println("removeAll");
        ListaEnlazada instance = new ListaEnlazada();
        instance.addAll(contArray(10));
        instance.removeAll();
        boolean expResult = false;
        boolean result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sort method, of class ListaEnlazada.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        ListaEnlazada instance = new ListaEnlazada();
        instance.sort();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toArray method, of class ListaEnlazada.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        ListaEnlazada instance = new ListaEnlazada();
        Integer[] expResult = contArray(10);
        instance.addAll(expResult);
        Integer[] result = instance.toArray();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getStack method, of class ListaEnlazada.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        ListaEnlazada instance = new ListaEnlazada();
        instance.add(10);
        instance.add(8);
        instance.add(2);
        Integer expResult = 2;
        Integer result = instance.getStack();
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of class ListaEnlazada.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ListaEnlazada instance = new ListaEnlazada();
        instance.add(2);
        boolean expResult = true;
        boolean result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of mostrar method, of class ListaEnlazada.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        ListaEnlazada instance = new ListaEnlazada();
        instance.addAll(contArray(10));
        instance.mostrar();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of get method, of class ListaEnlazada.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int p = 0;
        ListaEnlazada instance = new ListaEnlazada();
        instance.add(0);
        Integer expResult = 0;
        Integer result = instance.get(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class ListaEnlazada.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaEnlazada instance = new ListaEnlazada();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        String expResult = "1 2 3 ";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
