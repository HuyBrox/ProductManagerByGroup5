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
public class Advance7Test {
    
    public Advance7Test() {
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
public void testTinhThu_ValidDate() {
    Advance7 advance = new Advance7();
    int dayOfWeek = advance.tinhThu(5, 4, 2020);
    assertEquals(1, dayOfWeek);
}
    @Test
public void testTinhThu_NegativeYear() {
    Advance7 advance = new Advance7();
    int dayOfWeek = advance.tinhThu(5, 4, -2020);
    assertEquals(0, dayOfWeek);
}
}
