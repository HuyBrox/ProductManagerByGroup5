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
public class MaxNumber2Test {
    
    public MaxNumber2Test() {
    }
    
    @Test
public void testMax2_FirstNumberIsMax() {
    int number1 = 10;
    int number2 = 5;
    int result = MaxNumber2.max2(number1, number2);
    assertEquals(number1, result);
}
    @Test
public void testMax2_SecondNumberIsMax() {
    int number1 = 5;
    int number2 = 10;
    int result = MaxNumber2.max2(number1, number2);
    assertEquals(number2, result);
}
}
