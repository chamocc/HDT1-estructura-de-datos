/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarFrecuencia method, of class Radio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        boolean _frecuencia = false;
        Radio instance = new Radio();
        instance.cambiarFrecuencia(_frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Radio.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 0;
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.sacar(boton);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Radio instance = new Radio();
        instance.apagar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encender method, of class Radio.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        Radio instance = new Radio();
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Radio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        int boton = 0;
        double estacion = 0.0;
        Radio instance = new Radio();
        instance.guardar(boton, estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class Radio.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        boolean frecuencia = false;
        Radio instance = new Radio();
        instance.subirEstacion(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class Radio.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        boolean frecuencia = false;
        Radio instance = new Radio();
        instance.bajarEstacion(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncendido method, of class Radio.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class Radio.
     */
    @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class Radio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
