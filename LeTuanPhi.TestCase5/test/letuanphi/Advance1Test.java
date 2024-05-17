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
public class Advance1Test {
    
    public Advance1Test() {
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
public void testUSCLN_PositiveIntegers() {
    Advance1 advance = new Advance1();
    assertEquals(3, advance.USCLN(15, 21));
}

   @Test
public void testUSCLN_NegativeIntegers() {
    Advance1 advance = new Advance1();
    assertEquals(3, advance.USCLN(-15, -21));
}
    @Test
public void testUSCLN_OnePositiveOneNegative() {
    Advance1 advance = new Advance1();
    assertEquals(3, advance.USCLN(-15, 21));
}
}
