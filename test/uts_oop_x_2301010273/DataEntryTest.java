/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package uts_oop_x_2301010273;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author INSTIKI
 */
public class DataEntryTest {
    
    public DataEntryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getIsiData method, of class DataEntry.
     */
    @Test
    public void testGetIsiData() {
        System.out.println("getIsiData");
        DataEntry instance = new DataEntry();
        String expResult = "";
        String result = instance.getIsiData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsiData method, of class DataEntry.
     */
    @Test
    public void testSetIsiData() {
        System.out.println("setIsiData");
        String isiData = "";
        DataEntry instance = new DataEntry();
        instance.setIsiData(isiData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DataEntry.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DataEntry instance = new DataEntry();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
