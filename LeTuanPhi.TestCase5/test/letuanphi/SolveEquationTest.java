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
public class SolveEquationTest {
    
    public SolveEquationTest() {
    }
   
    @Test
public void testMultiRoots() {
    SolveEquation equation = new SolveEquation(0, 0);
    String result = equation.linearEquation();
    assertEquals("Multi roots", result);
}
@Test
public void testNoRoot() {
    SolveEquation equation = new SolveEquation(0, 1);
    String result = equation.linearEquation();
    assertEquals("No root", result);
}

    /**
     *
     */
    @Test
public void testOneRoot() {
    SolveEquation equation = new SolveEquation(1, 2);
    String result = equation.linearEquation();
    assertEquals("One root", result);
}
}