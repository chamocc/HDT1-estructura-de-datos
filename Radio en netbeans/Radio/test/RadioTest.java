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


    /**
     * Test of cambiarFrecuencia method, of class Radio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        Radio instance = new Radio();
        instance.cambiarFrecuencia(true);
        boolean frecuencia=instance.getFrecuencia();
        assertTrue(frecuencia);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sacar method, of class Radio.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 0;
        Radio instance = new Radio();
        double result = instance.sacar(boton);
        boolean val=false;
        if(instance.sacar(boton)==87.9 || instance.sacar(boton)==530){
            val=true;
        }
        assertTrue(val);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Radio instance = new Radio();
        instance.apagar();
        boolean apagado=instance.getEncendido();
        assertFalse(apagado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
}
