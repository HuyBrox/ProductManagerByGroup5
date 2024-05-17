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
public class MaxNumber1Test {
    
    public MaxNumber1Test() {
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
     * Test of max3 method, of class MaxNumber1.
     */
    @Test
public void testMax3_FirstNumberIsMax() {
    MaxNumber1 maxNumber = new MaxNumber1();
    maxNumber.number1 = 5;
    maxNumber.number2 = 3;
    maxNumber.number3 = 4;
    int result = maxNumber.max3();
    assertEquals(5, result);
}
        @Test
public void testMax3_SecondNumberIsMax() {
    MaxNumber1 maxNumber = new MaxNumber1();
    maxNumber.number1 = 3;
    maxNumber.number2 = 5;
    maxNumber.number3 = 4;
    int result = maxNumber.max3();
    assertEquals(5, result);
}
@Test
public void testMax3_ThirdNumberIsMax() {
    MaxNumber1 maxNumber = new MaxNumber1();
    maxNumber.number1 = 3;
    maxNumber.number2 = 4;
    maxNumber.number3 = 5;
    int result = maxNumber.max3();
    assertEquals(5, result);
}
}
