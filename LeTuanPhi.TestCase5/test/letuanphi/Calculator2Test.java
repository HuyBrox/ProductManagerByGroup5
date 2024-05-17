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
public class Calculator2Test {
    
    public Calculator2Test() {
    }
    @Test
public void testSub_ValidInputs() {
    Calculator2 calculator = new Calculator2();
    calculator.number1 = 5;
    calculator.number2 = 3;
    calculator.sub();
    int result = calculator.result;
    assertEquals(2, result);
}
    @Test
public void testSub_MaxInputs() {
    Calculator2 calculator = new Calculator2();
    calculator.number1 = Integer.MAX_VALUE;
    calculator.number2 = 1;
    calculator.sub();
}
@Test
public void testSub_MinInputs() {
    Calculator2 calculator = new Calculator2();
    calculator.number1 = Integer.MIN_VALUE;
    calculator.number2 = -1;
    calculator.sub();
}
}
