/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package letuanphi;
import letuanphi.Calculator1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class Calculator1Test {
    
    public Calculator1Test() {
    }
    @Test
public void testAdd_ValidInputs() {
    Calculator1 calculator = new Calculator1();
    int result = calculator.add(2, 3);
    assertEquals(5, result);
}
@Test
public void testAdd_MaxInputs() {
    Calculator1 calculator = new Calculator1();
    int result = calculator.add(-1, 3);
    int minValue = Integer.MAX_VALUE;
    calculator.add(minValue, 3);
}
   @Test
public void testAdd_MinInputs() {
    Calculator1 calculator = new Calculator1();
    int result = calculator.add(-1, 3);
    int minValue = Integer.MIN_VALUE;
    calculator.add(minValue, -1);
} 
}
