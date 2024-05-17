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
public class Calculator3Test {
    
    public Calculator3Test() {
    }
    @Test
public void testMul_ValidInputs() {
    Calculator3 calculator = new Calculator3(3, 5);
    int result = calculator.mul();
    assertEquals(15, result);
}
@Test
public void testMul_MaxInputs() {
    Calculator3 calculator = new Calculator3(Integer.MAX_VALUE, 2);
    calculator.mul();
}
@Test
public void testMul_MinInputs() {
    Calculator3 calculator = new Calculator3(Integer.MIN_VALUE, -2);
    calculator.mul();
}
}
