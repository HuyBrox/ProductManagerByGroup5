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
public class TriangleTest {
    
    public TriangleTest() {
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
public void testMaxLength_FirstNumberIsMax() {
    Triangle triangle = new Triangle(10, 5, 3);
    assertEquals(10, triangle.maxLength());
}
 @Test
public void testMaxLength_SecondNumberIsMax() {
    Triangle triangle = new Triangle(7, 11, 3);
    assertEquals(11, triangle.maxLength());
}
    @Test
public void testMaxLength_ThirdNumberIsMax() {
    Triangle triangle = new Triangle(10, 3, 0);
    assertEquals(10, triangle.maxLength());
}
}
