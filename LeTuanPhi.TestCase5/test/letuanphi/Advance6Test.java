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
public class Advance6Test {
    
    public Advance6Test() {
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
public void testTinhTuoi_ValidDate() {
    Advance6 advance = new Advance6();
    int age = advance.tinhTuoi(12, 1, 1999);
    assertEquals(21, age);
}
@Test
public void testTinhTuoi_NegativeYear() {
    Advance6 advance = new Advance6();
    int age = advance.tinhTuoi(12, 5, 1999);
    assertEquals(20, age);
}
}
