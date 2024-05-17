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
public class Advance5Test {
    
    public Advance5Test() {
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
public void testKiemTraDoiXung_PalindromeNumber() {
    Advance5 advance = new Advance5();
    assertTrue(advance.kiemTraDoiXung(12121));
}
    @Test
public void testKiemTraDoiXung_NonPalindromeNumber() {
    Advance5 advance = new Advance5();
    assertFalse(advance.kiemTraDoiXung(1234));
}
@Test
public void testKiemTraDoiXung_Zero() {
    Advance5 advance = new Advance5();
    assertTrue(advance.kiemTraDoiXung(0));
}
}
