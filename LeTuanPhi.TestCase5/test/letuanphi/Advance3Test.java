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
public class Advance3Test {
    
    public Advance3Test() {
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
public void testFibonacci_NonNegativeInteger() {
    Advance3 advance = new Advance3();
    assertEquals(2, advance.fibonacci(3));
}
    @Test
public void testFibonacci_Zero() {
    Advance3 advance = new Advance3();
    assertEquals(0, advance.fibonacci(0));
}
@Test
public void testFibonacci_Ze() {
    Advance3 advance = new Advance3();
    assertEquals(1, advance.fibonacci(2));
}
}
