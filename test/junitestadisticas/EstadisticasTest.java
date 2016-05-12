/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package junitestadisticas;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2DAM
 */
public class EstadisticasTest {
    
    public EstadisticasTest() {
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
     * Test of calcularMedia method, of class Estadisticas.
     */
    @Test
    public void testCalcularMedia() {
        System.out.println("calcularMedia");
        ArrayList<String> datos = new ArrayList<String>();
        datos.add("a");
        datos.add("0");
        datos.add("0");
        datos.add("0");
        datos.add("0");
        datos.add("0");
        
        Estadisticas instance = new Estadisticas();
        String expResult = null;
        String result = instance.calcularMedia(datos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
