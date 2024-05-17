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
public class Calculator4Test {
    
    public Calculator4Test() {
    }
    @Test
public void testDiv_ValidInputs() {
    Calculator4 calculator = new Calculator4();
    calculator.setNumber1(10);
    calculator.setNumber2(2);
    int result = calculator.div();
    assertEquals(5, result);
}
@Test(expected = ArithmeticException.class)
public void testDiv_DivisionByZero() {
    Calculator4 calculator = new Calculator4();
    calculator.setNumber1(10);
    calculator.setNumber2(0);
    calculator.div();
}
    @Test
public void testDiv_ReturnFloatType() {
    Calculator4 calculator = new Calculator4();
    calculator.setNumber1(5);
    calculator.setNumber2(2);
    float result = calculator.divFloat();
    assertEquals(2.5f, result, 0.01f);
}
}
