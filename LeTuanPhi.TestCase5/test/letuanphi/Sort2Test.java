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
public class Sort2Test {
    
    public Sort2Test() {
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
public void testSortDesc_Number1IsGreaterThanNumber2() {
    Sort2 sort = new Sort2();
    sort.setNumber1(10);
    sort.setNumber2(5);
    sort.sortDesc();
    assertEquals(10, sort.getNumber1());
    assertEquals(5, sort.getNumber2());
}

   @Test
public void testSortDesc_Number1IsLessThanNumber2() {
    Sort2 sort = new Sort2();
    sort.setNumber1(5);
    sort.setNumber2(10);
    sort.sortDesc();
    assertEquals(10, sort.getNumber1());
    assertEquals(5, sort.getNumber2());
}
}
