/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package letuanphi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KHOA PC
 */
public class Sort1Test {
    
    public Sort1Test() {
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
public void testSortAsc_Number1IsGreaterThanNumber2() {
    Sort1 sort = new Sort1();
    sort.number1 = 10;
    sort.number2 = 5;
    sort.sortAsc();
    assertEquals(5, sort.number1);
    assertEquals(10, sort.number2);
}
    @Test
public void testSortAsc_Number1IsLessThanNumber2() {
    Sort1 sort = new Sort1();
    sort.number1 = 3;
    sort.number2 = 11;
    sort.sortAsc();
    assertEquals(3, sort.number1);
    assertEquals(11, sort.number2);
}
}
