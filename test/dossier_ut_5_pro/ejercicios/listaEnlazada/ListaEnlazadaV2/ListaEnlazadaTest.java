/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier_ut_5_pro.ejercicios.listaEnlazada.ListaEnlazadaV2;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *CLASE DE PRUEBAS PARAMETIZADAS
 * primero añadimos la etiqueta @RunWith(Parameterized.class)
 * un atributo para cada parametro y un costructor para inicializar cada parametro
 * @author Francisco A Domínguez Iceta <toteskuu@gmail.com>
 */
@RunWith(Parameterized.class)
public class ListaEnlazadaTest {
    
    public ListaEnlazadaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sortedAdd method, of class ListaEnlazada.
     */
    @Test
    public void testSortedAdd() {
        System.out.println("sortedAdd");
        Object d = null;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.sortedAdd(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uniqueAdd method, of class ListaEnlazada.
     */
    @Test
    public void testUniqueAdd() {
        System.out.println("uniqueAdd");
        Object d = null;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.uniqueAdd(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Definir metodo con etiqueta @Parameters 
     * @param array los datos recividos a probar
     * @return devuelve una lista de valores 
     * a probar
     */
    
    @Parameters
    public static Collection<Object[]> data(){
        Object[][] objetosArray = new Object[][]{};
        return Arrays.asList(objetosArray);
    }
    
    
    /**
     
     * Test of size method, of class ListaEnlazada.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaEnlazada instance = new ListaEnlazada();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uniqueSortedAdd method, of class ListaEnlazada.
     */
    @Test
    public void testUniqueSortedAdd() {
        System.out.println("uniqueSortedAdd");
        Object d = null;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.uniqueSortedAdd(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaEnlazada.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object d = null;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.add(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class ListaEnlazada.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Object[] d = null;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.addAll(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class ListaEnlazada.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object d = null;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.contains(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ListaEnlazada.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object d = null;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.remove(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class ListaEnlazada.
     */
    @Test
    public void testRemoveAll_GenericType() {
        System.out.println("removeAll");
        Object d = null;
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.removeAll(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class ListaEnlazada.
     */
    @Test
    public void testRemoveAll_0args() {
        System.out.println("removeAll");
        ListaEnlazada instance = new ListaEnlazada();
        instance.removeAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class ListaEnlazada.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        ListaEnlazada instance = new ListaEnlazada();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pull method, of class ListaEnlazada.
     */
    @Test
    public void testPull() {
        System.out.println("pull");
        ListaEnlazada instance = new ListaEnlazada();
        Object expResult = null;
        Object result = instance.pull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class ListaEnlazada.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = false;
        boolean result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class ListaEnlazada.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        ListaEnlazada instance = new ListaEnlazada();
        instance.mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ListaEnlazada.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int p = 0;
        ListaEnlazada instance = new ListaEnlazada();
        Object expResult = null;
        Object result = instance.get(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaEnlazada.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaEnlazada instance = new ListaEnlazada();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
